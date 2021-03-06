// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_worker_service.proto

package com.zhd.grpc.job.service;

/**
 * Protobuf type {@code com.zhd.grpc.service.SendJobResultRequest}
 */
public final class SendJobResultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zhd.grpc.service.SendJobResultRequest)
    SendJobResultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendJobResultRequest.newBuilder() to construct.
  private SendJobResultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendJobResultRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendJobResultRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendJobResultRequest(
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
            com.zhd.grpc.job.service.JobResult.Builder subBuilder = null;
            if (jobResults_ != null) {
              subBuilder = jobResults_.toBuilder();
            }
            jobResults_ = input.readMessage(com.zhd.grpc.job.service.JobResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jobResults_);
              jobResults_ = subBuilder.buildPartial();
            }

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
    return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_SendJobResultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_SendJobResultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zhd.grpc.job.service.SendJobResultRequest.class, com.zhd.grpc.job.service.SendJobResultRequest.Builder.class);
  }

  public static final int JOB_RESULTS_FIELD_NUMBER = 1;
  private com.zhd.grpc.job.service.JobResult jobResults_;
  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   * @return Whether the jobResults field is set.
   */
  @java.lang.Override
  public boolean hasJobResults() {
    return jobResults_ != null;
  }
  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   * @return The jobResults.
   */
  @java.lang.Override
  public com.zhd.grpc.job.service.JobResult getJobResults() {
    return jobResults_ == null ? com.zhd.grpc.job.service.JobResult.getDefaultInstance() : jobResults_;
  }
  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public com.zhd.grpc.job.service.JobResultOrBuilder getJobResultsOrBuilder() {
    return getJobResults();
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
    if (jobResults_ != null) {
      output.writeMessage(1, getJobResults());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jobResults_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJobResults());
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
    if (!(obj instanceof com.zhd.grpc.job.service.SendJobResultRequest)) {
      return super.equals(obj);
    }
    com.zhd.grpc.job.service.SendJobResultRequest other = (com.zhd.grpc.job.service.SendJobResultRequest) obj;

    if (hasJobResults() != other.hasJobResults()) return false;
    if (hasJobResults()) {
      if (!getJobResults()
          .equals(other.getJobResults())) return false;
    }
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
    if (hasJobResults()) {
      hash = (37 * hash) + JOB_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getJobResults().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.SendJobResultRequest parseFrom(
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
  public static Builder newBuilder(com.zhd.grpc.job.service.SendJobResultRequest prototype) {
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
   * Protobuf type {@code com.zhd.grpc.service.SendJobResultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zhd.grpc.service.SendJobResultRequest)
      com.zhd.grpc.job.service.SendJobResultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_SendJobResultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_SendJobResultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhd.grpc.job.service.SendJobResultRequest.class, com.zhd.grpc.job.service.SendJobResultRequest.Builder.class);
    }

    // Construct using com.zhd.grpc.job.service.SendJobResultRequest.newBuilder()
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
      if (jobResultsBuilder_ == null) {
        jobResults_ = null;
      } else {
        jobResults_ = null;
        jobResultsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_SendJobResultRequest_descriptor;
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.SendJobResultRequest getDefaultInstanceForType() {
      return com.zhd.grpc.job.service.SendJobResultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.SendJobResultRequest build() {
      com.zhd.grpc.job.service.SendJobResultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.SendJobResultRequest buildPartial() {
      com.zhd.grpc.job.service.SendJobResultRequest result = new com.zhd.grpc.job.service.SendJobResultRequest(this);
      if (jobResultsBuilder_ == null) {
        result.jobResults_ = jobResults_;
      } else {
        result.jobResults_ = jobResultsBuilder_.build();
      }
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
      if (other instanceof com.zhd.grpc.job.service.SendJobResultRequest) {
        return mergeFrom((com.zhd.grpc.job.service.SendJobResultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zhd.grpc.job.service.SendJobResultRequest other) {
      if (other == com.zhd.grpc.job.service.SendJobResultRequest.getDefaultInstance()) return this;
      if (other.hasJobResults()) {
        mergeJobResults(other.getJobResults());
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
      com.zhd.grpc.job.service.SendJobResultRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zhd.grpc.job.service.SendJobResultRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.zhd.grpc.job.service.JobResult jobResults_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.service.JobResult, com.zhd.grpc.job.service.JobResult.Builder, com.zhd.grpc.job.service.JobResultOrBuilder> jobResultsBuilder_;
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     * @return Whether the jobResults field is set.
     */
    public boolean hasJobResults() {
      return jobResultsBuilder_ != null || jobResults_ != null;
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     * @return The jobResults.
     */
    public com.zhd.grpc.job.service.JobResult getJobResults() {
      if (jobResultsBuilder_ == null) {
        return jobResults_ == null ? com.zhd.grpc.job.service.JobResult.getDefaultInstance() : jobResults_;
      } else {
        return jobResultsBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public Builder setJobResults(com.zhd.grpc.job.service.JobResult value) {
      if (jobResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobResults_ = value;
        onChanged();
      } else {
        jobResultsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public Builder setJobResults(
        com.zhd.grpc.job.service.JobResult.Builder builderForValue) {
      if (jobResultsBuilder_ == null) {
        jobResults_ = builderForValue.build();
        onChanged();
      } else {
        jobResultsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public Builder mergeJobResults(com.zhd.grpc.job.service.JobResult value) {
      if (jobResultsBuilder_ == null) {
        if (jobResults_ != null) {
          jobResults_ =
            com.zhd.grpc.job.service.JobResult.newBuilder(jobResults_).mergeFrom(value).buildPartial();
        } else {
          jobResults_ = value;
        }
        onChanged();
      } else {
        jobResultsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public Builder clearJobResults() {
      if (jobResultsBuilder_ == null) {
        jobResults_ = null;
        onChanged();
      } else {
        jobResults_ = null;
        jobResultsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public com.zhd.grpc.job.service.JobResult.Builder getJobResultsBuilder() {
      
      onChanged();
      return getJobResultsFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    public com.zhd.grpc.job.service.JobResultOrBuilder getJobResultsOrBuilder() {
      if (jobResultsBuilder_ != null) {
        return jobResultsBuilder_.getMessageOrBuilder();
      } else {
        return jobResults_ == null ?
            com.zhd.grpc.job.service.JobResult.getDefaultInstance() : jobResults_;
      }
    }
    /**
     * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.service.JobResult, com.zhd.grpc.job.service.JobResult.Builder, com.zhd.grpc.job.service.JobResultOrBuilder> 
        getJobResultsFieldBuilder() {
      if (jobResultsBuilder_ == null) {
        jobResultsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zhd.grpc.job.service.JobResult, com.zhd.grpc.job.service.JobResult.Builder, com.zhd.grpc.job.service.JobResultOrBuilder>(
                getJobResults(),
                getParentForChildren(),
                isClean());
        jobResults_ = null;
      }
      return jobResultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.zhd.grpc.service.SendJobResultRequest)
  }

  // @@protoc_insertion_point(class_scope:com.zhd.grpc.service.SendJobResultRequest)
  private static final com.zhd.grpc.job.service.SendJobResultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zhd.grpc.job.service.SendJobResultRequest();
  }

  public static com.zhd.grpc.job.service.SendJobResultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendJobResultRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendJobResultRequest>() {
    @java.lang.Override
    public SendJobResultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendJobResultRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendJobResultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendJobResultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zhd.grpc.job.service.SendJobResultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

