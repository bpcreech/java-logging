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
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Additional information about the source code location that produced the log
 * entry.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LogEntrySourceLocation}
 */
public final class LogEntrySourceLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogEntrySourceLocation)
    LogEntrySourceLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogEntrySourceLocation.newBuilder() to construct.
  private LogEntrySourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogEntrySourceLocation() {
    file_ = "";
    function_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogEntrySourceLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LogEntrySourceLocation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              file_ = s;
              break;
            }
          case 16:
            {
              line_ = input.readInt64();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              function_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LogEntryProto
        .internal_static_google_logging_v2_LogEntrySourceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LogEntryProto
        .internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LogEntrySourceLocation.class,
            com.google.logging.v2.LogEntrySourceLocation.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object file_;
  /**
   *
   *
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      file_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Source file name. Depending on the runtime environment, this
   * might be a simple name or a fully-qualified name.
   * </pre>
   *
   * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFileBytes() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      file_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_FIELD_NUMBER = 2;
  private long line_;
  /**
   *
   *
   * <pre>
   * Optional. Line within the source file. 1-based; 0 indicates no line number
   * available.
   * </pre>
   *
   * <code>int64 line = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The line.
   */
  @java.lang.Override
  public long getLine() {
    return line_;
  }

  public static final int FUNCTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object function_;
  /**
   *
   *
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The function.
   */
  @java.lang.Override
  public java.lang.String getFunction() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      function_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Human-readable name of the function or method being invoked, with
   * optional context such as the class or package name. This information may be
   * used in contexts such as the logs viewer, where a file and line number are
   * less meaningful. The format can vary by language. For example:
   * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
   * (Python).
   * </pre>
   *
   * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for function.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFunctionBytes() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      function_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
    }
    if (line_ != 0L) {
      output.writeInt64(2, line_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(function_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, function_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
    }
    if (line_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, line_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(function_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, function_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.LogEntrySourceLocation)) {
      return super.equals(obj);
    }
    com.google.logging.v2.LogEntrySourceLocation other =
        (com.google.logging.v2.LogEntrySourceLocation) obj;

    if (!getFile().equals(other.getFile())) return false;
    if (getLine() != other.getLine()) return false;
    if (!getFunction().equals(other.getFunction())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (37 * hash) + LINE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLine());
    hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getFunction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogEntrySourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.LogEntrySourceLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Additional information about the source code location that produced the log
   * entry.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LogEntrySourceLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogEntrySourceLocation)
      com.google.logging.v2.LogEntrySourceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogEntrySourceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogEntrySourceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LogEntrySourceLocation.class,
              com.google.logging.v2.LogEntrySourceLocation.Builder.class);
    }

    // Construct using com.google.logging.v2.LogEntrySourceLocation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      file_ = "";

      line_ = 0L;

      function_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogEntrySourceLocation_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.LogEntrySourceLocation getDefaultInstanceForType() {
      return com.google.logging.v2.LogEntrySourceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.LogEntrySourceLocation build() {
      com.google.logging.v2.LogEntrySourceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.LogEntrySourceLocation buildPartial() {
      com.google.logging.v2.LogEntrySourceLocation result =
          new com.google.logging.v2.LogEntrySourceLocation(this);
      result.file_ = file_;
      result.line_ = line_;
      result.function_ = function_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.LogEntrySourceLocation) {
        return mergeFrom((com.google.logging.v2.LogEntrySourceLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LogEntrySourceLocation other) {
      if (other == com.google.logging.v2.LogEntrySourceLocation.getDefaultInstance()) return this;
      if (!other.getFile().isEmpty()) {
        file_ = other.file_;
        onChanged();
      }
      if (other.getLine() != 0L) {
        setLine(other.getLine());
      }
      if (!other.getFunction().isEmpty()) {
        function_ = other.function_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.LogEntrySourceLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.LogEntrySourceLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object file_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Source file name. Depending on the runtime environment, this
     * might be a simple name or a fully-qualified name.
     * </pre>
     *
     * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The file.
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        file_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Source file name. Depending on the runtime environment, this
     * might be a simple name or a fully-qualified name.
     * </pre>
     *
     * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for file.
     */
    public com.google.protobuf.ByteString getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Source file name. Depending on the runtime environment, this
     * might be a simple name or a fully-qualified name.
     * </pre>
     *
     * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      file_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Source file name. Depending on the runtime environment, this
     * might be a simple name or a fully-qualified name.
     * </pre>
     *
     * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFile() {

      file_ = getDefaultInstance().getFile();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Source file name. Depending on the runtime environment, this
     * might be a simple name or a fully-qualified name.
     * </pre>
     *
     * <code>string file = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      file_ = value;
      onChanged();
      return this;
    }

    private long line_;
    /**
     *
     *
     * <pre>
     * Optional. Line within the source file. 1-based; 0 indicates no line number
     * available.
     * </pre>
     *
     * <code>int64 line = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The line.
     */
    @java.lang.Override
    public long getLine() {
      return line_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Line within the source file. 1-based; 0 indicates no line number
     * available.
     * </pre>
     *
     * <code>int64 line = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(long value) {

      line_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Line within the source file. 1-based; 0 indicates no line number
     * available.
     * </pre>
     *
     * <code>int64 line = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLine() {

      line_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object function_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Human-readable name of the function or method being invoked, with
     * optional context such as the class or package name. This information may be
     * used in contexts such as the logs viewer, where a file and line number are
     * less meaningful. The format can vary by language. For example:
     * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
     * (Python).
     * </pre>
     *
     * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The function.
     */
    public java.lang.String getFunction() {
      java.lang.Object ref = function_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        function_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Human-readable name of the function or method being invoked, with
     * optional context such as the class or package name. This information may be
     * used in contexts such as the logs viewer, where a file and line number are
     * less meaningful. The format can vary by language. For example:
     * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
     * (Python).
     * </pre>
     *
     * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for function.
     */
    public com.google.protobuf.ByteString getFunctionBytes() {
      java.lang.Object ref = function_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        function_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Human-readable name of the function or method being invoked, with
     * optional context such as the class or package name. This information may be
     * used in contexts such as the logs viewer, where a file and line number are
     * less meaningful. The format can vary by language. For example:
     * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
     * (Python).
     * </pre>
     *
     * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The function to set.
     * @return This builder for chaining.
     */
    public Builder setFunction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      function_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Human-readable name of the function or method being invoked, with
     * optional context such as the class or package name. This information may be
     * used in contexts such as the logs viewer, where a file and line number are
     * less meaningful. The format can vary by language. For example:
     * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
     * (Python).
     * </pre>
     *
     * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFunction() {

      function_ = getDefaultInstance().getFunction();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Human-readable name of the function or method being invoked, with
     * optional context such as the class or package name. This information may be
     * used in contexts such as the logs viewer, where a file and line number are
     * less meaningful. The format can vary by language. For example:
     * `qual.if.ied.Class.method` (Java), `dir/package.func` (Go), `function`
     * (Python).
     * </pre>
     *
     * <code>string function = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for function to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      function_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogEntrySourceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LogEntrySourceLocation)
  private static final com.google.logging.v2.LogEntrySourceLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LogEntrySourceLocation();
  }

  public static com.google.logging.v2.LogEntrySourceLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogEntrySourceLocation> PARSER =
      new com.google.protobuf.AbstractParser<LogEntrySourceLocation>() {
        @java.lang.Override
        public LogEntrySourceLocation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LogEntrySourceLocation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LogEntrySourceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogEntrySourceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.LogEntrySourceLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
