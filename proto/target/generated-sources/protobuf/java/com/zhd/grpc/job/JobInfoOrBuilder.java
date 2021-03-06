// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job.proto

package com.zhd.grpc.job;

public interface JobInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zhd.grpc.job.JobInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string category = 3;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 3;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>int32 priority = 4;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <code>string param = 5;</code>
   * @return The param.
   */
  java.lang.String getParam();
  /**
   * <code>string param = 5;</code>
   * @return The bytes for param.
   */
  com.google.protobuf.ByteString
      getParamBytes();

  /**
   * <code>int32 schedule_type = 6;</code>
   * @return The scheduleType.
   */
  int getScheduleType();

  /**
   * <code>string schedule_param = 7;</code>
   * @return The scheduleParam.
   */
  java.lang.String getScheduleParam();
  /**
   * <code>string schedule_param = 7;</code>
   * @return The bytes for scheduleParam.
   */
  com.google.protobuf.ByteString
      getScheduleParamBytes();

  /**
   * <code>string parallel_strategy = 8;</code>
   * @return The parallelStrategy.
   */
  java.lang.String getParallelStrategy();
  /**
   * <code>string parallel_strategy = 8;</code>
   * @return The bytes for parallelStrategy.
   */
  com.google.protobuf.ByteString
      getParallelStrategyBytes();

  /**
   * <code>string retry_strategy = 9;</code>
   * @return The retryStrategy.
   */
  java.lang.String getRetryStrategy();
  /**
   * <code>string retry_strategy = 9;</code>
   * @return The bytes for retryStrategy.
   */
  com.google.protobuf.ByteString
      getRetryStrategyBytes();
}
