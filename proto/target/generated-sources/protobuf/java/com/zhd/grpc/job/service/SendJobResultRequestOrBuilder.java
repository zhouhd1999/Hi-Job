// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_worker_service.proto

package com.zhd.grpc.job.service;

public interface SendJobResultRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zhd.grpc.service.SendJobResultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   * @return Whether the jobResults field is set.
   */
  boolean hasJobResults();
  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   * @return The jobResults.
   */
  com.zhd.grpc.job.service.JobResult getJobResults();
  /**
   * <code>.com.zhd.grpc.service.JobResult job_results = 1;</code>
   */
  com.zhd.grpc.job.service.JobResultOrBuilder getJobResultsOrBuilder();
}
