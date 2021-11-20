// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job.proto

package com.zhd.grpc.job;

/**
 * Protobuf type {@code com.zhd.grpc.job.JobResult}
 */
public final class JobResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zhd.grpc.job.JobResult)
    JobResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobResult.newBuilder() to construct.
  private JobResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobResult() {
    id_ = "";
    jobId_ = "";
    result_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobResult(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jobId_ = s;
            break;
          }
          case 24: {

            status_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
            break;
          }
          case 42: {
            com.zhd.grpc.job.ErrorCode.Builder subBuilder = null;
            if (errorCode_ != null) {
              subBuilder = errorCode_.toBuilder();
            }
            errorCode_ = input.readMessage(com.zhd.grpc.job.ErrorCode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(errorCode_);
              errorCode_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {

            startTime_ = input.readInt64();
            break;
          }
          case 56: {

            finishedTime_ = input.readInt64();
            break;
          }
          case 64: {

            failedCount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zhd.grpc.job.Job.internal_static_com_zhd_grpc_job_JobResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zhd.grpc.job.Job.internal_static_com_zhd_grpc_job_JobResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zhd.grpc.job.JobResult.class, com.zhd.grpc.job.JobResult.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobId_;
  /**
   * <code>string job_id = 2;</code>
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   * <code>string job_id = 2;</code>
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>int32 status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int RESULT_FIELD_NUMBER = 4;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 4;</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 4;</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 5;
  private com.zhd.grpc.job.ErrorCode errorCode_;
  /**
   * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
   * @return Whether the errorCode field is set.
   */
  @java.lang.Override
  public boolean hasErrorCode() {
    return errorCode_ != null;
  }
  /**
   * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
   * @return The errorCode.
   */
  @java.lang.Override
  public com.zhd.grpc.job.ErrorCode getErrorCode() {
    return errorCode_ == null ? com.zhd.grpc.job.ErrorCode.getDefaultInstance() : errorCode_;
  }
  /**
   * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
   */
  @java.lang.Override
  public com.zhd.grpc.job.ErrorCodeOrBuilder getErrorCodeOrBuilder() {
    return getErrorCode();
  }

  public static final int START_TIME_FIELD_NUMBER = 6;
  private long startTime_;
  /**
   * <code>int64 start_time = 6;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public long getStartTime() {
    return startTime_;
  }

  public static final int FINISHED_TIME_FIELD_NUMBER = 7;
  private long finishedTime_;
  /**
   * <code>int64 finished_time = 7;</code>
   * @return The finishedTime.
   */
  @java.lang.Override
  public long getFinishedTime() {
    return finishedTime_;
  }

  public static final int FAILED_COUNT_FIELD_NUMBER = 8;
  private int failedCount_;
  /**
   * <code>int32 failed_count = 8;</code>
   * @return The failedCount.
   */
  @java.lang.Override
  public int getFailedCount() {
    return failedCount_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobId_);
    }
    if (status_ != 0) {
      output.writeInt32(3, status_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, result_);
    }
    if (errorCode_ != null) {
      output.writeMessage(5, getErrorCode());
    }
    if (startTime_ != 0L) {
      output.writeInt64(6, startTime_);
    }
    if (finishedTime_ != 0L) {
      output.writeInt64(7, finishedTime_);
    }
    if (failedCount_ != 0) {
      output.writeInt32(8, failedCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobId_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, status_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, result_);
    }
    if (errorCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getErrorCode());
    }
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, startTime_);
    }
    if (finishedTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, finishedTime_);
    }
    if (failedCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, failedCount_);
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
    if (!(obj instanceof com.zhd.grpc.job.JobResult)) {
      return super.equals(obj);
    }
    com.zhd.grpc.job.JobResult other = (com.zhd.grpc.job.JobResult) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getJobId()
        .equals(other.getJobId())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (!getResult()
        .equals(other.getResult())) return false;
    if (hasErrorCode() != other.hasErrorCode()) return false;
    if (hasErrorCode()) {
      if (!getErrorCode()
          .equals(other.getErrorCode())) return false;
    }
    if (getStartTime()
        != other.getStartTime()) return false;
    if (getFinishedTime()
        != other.getFinishedTime()) return false;
    if (getFailedCount()
        != other.getFailedCount()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    if (hasErrorCode()) {
      hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getErrorCode().hashCode();
    }
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + FINISHED_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFinishedTime());
    hash = (37 * hash) + FAILED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFailedCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zhd.grpc.job.JobResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.JobResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.JobResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.JobResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.zhd.grpc.job.JobResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.zhd.grpc.job.JobResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zhd.grpc.job.JobResult)
      com.zhd.grpc.job.JobResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zhd.grpc.job.Job.internal_static_com_zhd_grpc_job_JobResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhd.grpc.job.Job.internal_static_com_zhd_grpc_job_JobResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhd.grpc.job.JobResult.class, com.zhd.grpc.job.JobResult.Builder.class);
    }

    // Construct using com.zhd.grpc.job.JobResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      jobId_ = "";

      status_ = 0;

      result_ = "";

      if (errorCodeBuilder_ == null) {
        errorCode_ = null;
      } else {
        errorCode_ = null;
        errorCodeBuilder_ = null;
      }
      startTime_ = 0L;

      finishedTime_ = 0L;

      failedCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zhd.grpc.job.Job.internal_static_com_zhd_grpc_job_JobResult_descriptor;
    }

    @java.lang.Override
    public com.zhd.grpc.job.JobResult getDefaultInstanceForType() {
      return com.zhd.grpc.job.JobResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.zhd.grpc.job.JobResult build() {
      com.zhd.grpc.job.JobResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zhd.grpc.job.JobResult buildPartial() {
      com.zhd.grpc.job.JobResult result = new com.zhd.grpc.job.JobResult(this);
      result.id_ = id_;
      result.jobId_ = jobId_;
      result.status_ = status_;
      result.result_ = result_;
      if (errorCodeBuilder_ == null) {
        result.errorCode_ = errorCode_;
      } else {
        result.errorCode_ = errorCodeBuilder_.build();
      }
      result.startTime_ = startTime_;
      result.finishedTime_ = finishedTime_;
      result.failedCount_ = failedCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zhd.grpc.job.JobResult) {
        return mergeFrom((com.zhd.grpc.job.JobResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zhd.grpc.job.JobResult other) {
      if (other == com.zhd.grpc.job.JobResult.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        onChanged();
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (other.hasErrorCode()) {
        mergeErrorCode(other.getErrorCode());
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getFinishedTime() != 0L) {
        setFinishedTime(other.getFinishedTime());
      }
      if (other.getFailedCount() != 0) {
        setFailedCount(other.getFailedCount());
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
      com.zhd.grpc.job.JobResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zhd.grpc.job.JobResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     * <code>string job_id = 2;</code>
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string job_id = 2;</code>
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString
        getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string job_id = 2;</code>
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string job_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      
      jobId_ = getDefaultInstance().getJobId();
      onChanged();
      return this;
    }
    /**
     * <code>string job_id = 2;</code>
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobId_ = value;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 4;</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 4;</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 4;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 4;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }

    private com.zhd.grpc.job.ErrorCode errorCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.ErrorCode, com.zhd.grpc.job.ErrorCode.Builder, com.zhd.grpc.job.ErrorCodeOrBuilder> errorCodeBuilder_;
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     * @return Whether the errorCode field is set.
     */
    public boolean hasErrorCode() {
      return errorCodeBuilder_ != null || errorCode_ != null;
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     * @return The errorCode.
     */
    public com.zhd.grpc.job.ErrorCode getErrorCode() {
      if (errorCodeBuilder_ == null) {
        return errorCode_ == null ? com.zhd.grpc.job.ErrorCode.getDefaultInstance() : errorCode_;
      } else {
        return errorCodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public Builder setErrorCode(com.zhd.grpc.job.ErrorCode value) {
      if (errorCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorCode_ = value;
        onChanged();
      } else {
        errorCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public Builder setErrorCode(
        com.zhd.grpc.job.ErrorCode.Builder builderForValue) {
      if (errorCodeBuilder_ == null) {
        errorCode_ = builderForValue.build();
        onChanged();
      } else {
        errorCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public Builder mergeErrorCode(com.zhd.grpc.job.ErrorCode value) {
      if (errorCodeBuilder_ == null) {
        if (errorCode_ != null) {
          errorCode_ =
            com.zhd.grpc.job.ErrorCode.newBuilder(errorCode_).mergeFrom(value).buildPartial();
        } else {
          errorCode_ = value;
        }
        onChanged();
      } else {
        errorCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public Builder clearErrorCode() {
      if (errorCodeBuilder_ == null) {
        errorCode_ = null;
        onChanged();
      } else {
        errorCode_ = null;
        errorCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public com.zhd.grpc.job.ErrorCode.Builder getErrorCodeBuilder() {
      
      onChanged();
      return getErrorCodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    public com.zhd.grpc.job.ErrorCodeOrBuilder getErrorCodeOrBuilder() {
      if (errorCodeBuilder_ != null) {
        return errorCodeBuilder_.getMessageOrBuilder();
      } else {
        return errorCode_ == null ?
            com.zhd.grpc.job.ErrorCode.getDefaultInstance() : errorCode_;
      }
    }
    /**
     * <code>.com.zhd.grpc.job.ErrorCode error_code = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.ErrorCode, com.zhd.grpc.job.ErrorCode.Builder, com.zhd.grpc.job.ErrorCodeOrBuilder> 
        getErrorCodeFieldBuilder() {
      if (errorCodeBuilder_ == null) {
        errorCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zhd.grpc.job.ErrorCode, com.zhd.grpc.job.ErrorCode.Builder, com.zhd.grpc.job.ErrorCodeOrBuilder>(
                getErrorCode(),
                getParentForChildren(),
                isClean());
        errorCode_ = null;
      }
      return errorCodeBuilder_;
    }

    private long startTime_ ;
    /**
     * <code>int64 start_time = 6;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>int64 start_time = 6;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_time = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long finishedTime_ ;
    /**
     * <code>int64 finished_time = 7;</code>
     * @return The finishedTime.
     */
    @java.lang.Override
    public long getFinishedTime() {
      return finishedTime_;
    }
    /**
     * <code>int64 finished_time = 7;</code>
     * @param value The finishedTime to set.
     * @return This builder for chaining.
     */
    public Builder setFinishedTime(long value) {
      
      finishedTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 finished_time = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFinishedTime() {
      
      finishedTime_ = 0L;
      onChanged();
      return this;
    }

    private int failedCount_ ;
    /**
     * <code>int32 failed_count = 8;</code>
     * @return The failedCount.
     */
    @java.lang.Override
    public int getFailedCount() {
      return failedCount_;
    }
    /**
     * <code>int32 failed_count = 8;</code>
     * @param value The failedCount to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCount(int value) {
      
      failedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 failed_count = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCount() {
      
      failedCount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.zhd.grpc.job.JobResult)
  }

  // @@protoc_insertion_point(class_scope:com.zhd.grpc.job.JobResult)
  private static final com.zhd.grpc.job.JobResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zhd.grpc.job.JobResult();
  }

  public static com.zhd.grpc.job.JobResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobResult>
      PARSER = new com.google.protobuf.AbstractParser<JobResult>() {
    @java.lang.Override
    public JobResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zhd.grpc.job.JobResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
