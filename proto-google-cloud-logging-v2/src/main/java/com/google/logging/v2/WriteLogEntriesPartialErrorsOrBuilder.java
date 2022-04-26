/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface WriteLogEntriesPartialErrorsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.WriteLogEntriesPartialErrors)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  int getLogEntryErrorsCount();
  /**
   *
   *
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  boolean containsLogEntryErrors(int key);
  /** Use {@link #getLogEntryErrorsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrors();
  /**
   *
   *
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.google.rpc.Status> getLogEntryErrorsMap();
  /**
   *
   *
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */

  /* nullable */
  com.google.rpc.Status getLogEntryErrorsOrDefault(
      int key,
      /* nullable */
      com.google.rpc.Status defaultValue);
  /**
   *
   *
   * <pre>
   * When `WriteLogEntriesRequest.partial_success` is true, records the error
   * status for entries that were not written due to a permanent error, keyed
   * by the entry's zero-based index in `WriteLogEntriesRequest.entries`.
   * Failed requests for which no entries are written will not include
   * per-entry errors.
   * </pre>
   *
   * <code>map&lt;int32, .google.rpc.Status&gt; log_entry_errors = 1;</code>
   */
  com.google.rpc.Status getLogEntryErrorsOrThrow(int key);
}
