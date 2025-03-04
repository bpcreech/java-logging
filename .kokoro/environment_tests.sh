#!/bin/bash
# Copyright 2021 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -eox pipefail

if [[ -z "${ENVIRONMENT:-}" ]]; then
  echo "ENVIRONMENT not set. Exiting"
  exit 1
fi

if [[ -z "${PROJECT_ROOT:-}"  ]]; then
    PROJECT_ROOT="${KOKORO_ARTIFACTS_DIR}/github/java-logging"
fi

# make sure submodule is up to date
cd "$PROJECT_ROOT"
git config --global --add safe.directory '*'
git submodule update --init --recursive
cd "${PROJECT_ROOT}/env-tests-logging"

# Disable buffering, so that the logs stream through.
export PYTHONUNBUFFERED=1

# Setup service account credentials.
export GOOGLE_APPLICATION_CREDENTIALS=$KOKORO_GFILE_DIR/secret_manager/java-it-service-account
gcloud auth activate-service-account --key-file=$GOOGLE_APPLICATION_CREDENTIALS

gcloud config get-value project

# Setup project id.
gcloud config set project $GOOGLE_CLOUD_PROJECT

# set a default zone.
gcloud config set compute/zone us-central1-b

# authenticate docker
gcloud auth configure-docker -q

# Remove old nox
python3 -m pip uninstall --yes --quiet nox-automation

# Install nox
python3 -m pip install --upgrade --quiet nox
python3 -m nox --version

# Install kubectl
if [[ "${ENVIRONMENT}" == "kubernetes" ]]; then
  curl -LO https://dl.k8s.io/release/v1.20.0/bin/linux/amd64/kubectl
  chmod +x kubectl
  mkdir -p ~/.local/bin
  mv ./kubectl ~/.local/bin
  export PATH=$PATH:~/.local/bin
fi

# create a unique id for this run
UUID=$(python  -c 'import uuid; print(uuid.uuid1())' | head -c 7)
export ENVCTL_ID=ci-$UUID
echo $ENVCTL_ID

# Run the specified environment test
set +e
python3 -m nox --session "tests(language='java', platform='$ENVIRONMENT')"
TEST_STATUS_CODE=$?

# destroy resources
echo "cleaning up..."
${PROJECT_ROOT}/env-tests-logging/envctl/envctl java $ENVIRONMENT destroy

# exit with proper status code
exit $TEST_STATUS_CODE
