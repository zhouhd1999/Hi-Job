// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_worker_service.proto

package com.zhd.grpc.job.service;

public interface SendJobResultReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zhd.grpc.service.SendJobResultReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   * @return Whether the errCode field is set.
   */
  boolean hasErrCode();
  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   * @return The errCode.
   */
  com.zhd.grpc.job.service.ErrorCode getErrCode();
  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   */
  com.zhd.grpc.job.service.ErrorCodeOrBuilder getErrCodeOrBuilder();
}