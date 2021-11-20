package com.zhd.grpc.job.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: job_worker_service.proto")
public final class HiJobWorkerGrpc {

  private HiJobWorkerGrpc() {}

  public static final String SERVICE_NAME = "com.zhd.grpc.service.HiJobWorker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.RegisterWorkerRequest,
      com.zhd.grpc.job.service.RegisterWorkerReply> getRegisterWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterWorker",
      requestType = com.zhd.grpc.job.service.RegisterWorkerRequest.class,
      responseType = com.zhd.grpc.job.service.RegisterWorkerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.RegisterWorkerRequest,
      com.zhd.grpc.job.service.RegisterWorkerReply> getRegisterWorkerMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.RegisterWorkerRequest, com.zhd.grpc.job.service.RegisterWorkerReply> getRegisterWorkerMethod;
    if ((getRegisterWorkerMethod = HiJobWorkerGrpc.getRegisterWorkerMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getRegisterWorkerMethod = HiJobWorkerGrpc.getRegisterWorkerMethod) == null) {
          HiJobWorkerGrpc.getRegisterWorkerMethod = getRegisterWorkerMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.RegisterWorkerRequest, com.zhd.grpc.job.service.RegisterWorkerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.RegisterWorkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.RegisterWorkerReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("RegisterWorker"))
              .build();
        }
      }
    }
    return getRegisterWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.DeregisterWorkerRequest,
      com.zhd.grpc.job.service.DeregisterWorkerReply> getDeregisterWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeregisterWorker",
      requestType = com.zhd.grpc.job.service.DeregisterWorkerRequest.class,
      responseType = com.zhd.grpc.job.service.DeregisterWorkerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.DeregisterWorkerRequest,
      com.zhd.grpc.job.service.DeregisterWorkerReply> getDeregisterWorkerMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.DeregisterWorkerRequest, com.zhd.grpc.job.service.DeregisterWorkerReply> getDeregisterWorkerMethod;
    if ((getDeregisterWorkerMethod = HiJobWorkerGrpc.getDeregisterWorkerMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getDeregisterWorkerMethod = HiJobWorkerGrpc.getDeregisterWorkerMethod) == null) {
          HiJobWorkerGrpc.getDeregisterWorkerMethod = getDeregisterWorkerMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.DeregisterWorkerRequest, com.zhd.grpc.job.service.DeregisterWorkerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeregisterWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.DeregisterWorkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.DeregisterWorkerReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("DeregisterWorker"))
              .build();
        }
      }
    }
    return getDeregisterWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendStatsRequest,
      com.zhd.grpc.job.service.SendStatsReply> getSendStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStats",
      requestType = com.zhd.grpc.job.service.SendStatsRequest.class,
      responseType = com.zhd.grpc.job.service.SendStatsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendStatsRequest,
      com.zhd.grpc.job.service.SendStatsReply> getSendStatsMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendStatsRequest, com.zhd.grpc.job.service.SendStatsReply> getSendStatsMethod;
    if ((getSendStatsMethod = HiJobWorkerGrpc.getSendStatsMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getSendStatsMethod = HiJobWorkerGrpc.getSendStatsMethod) == null) {
          HiJobWorkerGrpc.getSendStatsMethod = getSendStatsMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.SendStatsRequest, com.zhd.grpc.job.service.SendStatsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendStatsReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("SendStats"))
              .build();
        }
      }
    }
    return getSendStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendRunningJobsRequest,
      com.zhd.grpc.job.service.SendRunningJobsReply> getSendRunningJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendRunningJobs",
      requestType = com.zhd.grpc.job.service.SendRunningJobsRequest.class,
      responseType = com.zhd.grpc.job.service.SendRunningJobsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendRunningJobsRequest,
      com.zhd.grpc.job.service.SendRunningJobsReply> getSendRunningJobsMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendRunningJobsRequest, com.zhd.grpc.job.service.SendRunningJobsReply> getSendRunningJobsMethod;
    if ((getSendRunningJobsMethod = HiJobWorkerGrpc.getSendRunningJobsMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getSendRunningJobsMethod = HiJobWorkerGrpc.getSendRunningJobsMethod) == null) {
          HiJobWorkerGrpc.getSendRunningJobsMethod = getSendRunningJobsMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.SendRunningJobsRequest, com.zhd.grpc.job.service.SendRunningJobsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendRunningJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendRunningJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendRunningJobsReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("SendRunningJobs"))
              .build();
        }
      }
    }
    return getSendRunningJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendJobResultRequest,
      com.zhd.grpc.job.service.SendJobResultReply> getSendJobResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendJobResult",
      requestType = com.zhd.grpc.job.service.SendJobResultRequest.class,
      responseType = com.zhd.grpc.job.service.SendJobResultReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendJobResultRequest,
      com.zhd.grpc.job.service.SendJobResultReply> getSendJobResultMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.SendJobResultRequest, com.zhd.grpc.job.service.SendJobResultReply> getSendJobResultMethod;
    if ((getSendJobResultMethod = HiJobWorkerGrpc.getSendJobResultMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getSendJobResultMethod = HiJobWorkerGrpc.getSendJobResultMethod) == null) {
          HiJobWorkerGrpc.getSendJobResultMethod = getSendJobResultMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.SendJobResultRequest, com.zhd.grpc.job.service.SendJobResultReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendJobResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendJobResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.SendJobResultReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("SendJobResult"))
              .build();
        }
      }
    }
    return getSendJobResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.service.ExchangeJobRequest,
      com.zhd.grpc.job.service.ExchangeJobReply> getExchangeJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeJob",
      requestType = com.zhd.grpc.job.service.ExchangeJobRequest.class,
      responseType = com.zhd.grpc.job.service.ExchangeJobReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.service.ExchangeJobRequest,
      com.zhd.grpc.job.service.ExchangeJobReply> getExchangeJobMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.service.ExchangeJobRequest, com.zhd.grpc.job.service.ExchangeJobReply> getExchangeJobMethod;
    if ((getExchangeJobMethod = HiJobWorkerGrpc.getExchangeJobMethod) == null) {
      synchronized (HiJobWorkerGrpc.class) {
        if ((getExchangeJobMethod = HiJobWorkerGrpc.getExchangeJobMethod) == null) {
          HiJobWorkerGrpc.getExchangeJobMethod = getExchangeJobMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.service.ExchangeJobRequest, com.zhd.grpc.job.service.ExchangeJobReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.ExchangeJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.service.ExchangeJobReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobWorkerMethodDescriptorSupplier("ExchangeJob"))
              .build();
        }
      }
    }
    return getExchangeJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HiJobWorkerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerStub>() {
        @java.lang.Override
        public HiJobWorkerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobWorkerStub(channel, callOptions);
        }
      };
    return HiJobWorkerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HiJobWorkerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerBlockingStub>() {
        @java.lang.Override
        public HiJobWorkerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobWorkerBlockingStub(channel, callOptions);
        }
      };
    return HiJobWorkerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HiJobWorkerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobWorkerFutureStub>() {
        @java.lang.Override
        public HiJobWorkerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobWorkerFutureStub(channel, callOptions);
        }
      };
    return HiJobWorkerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HiJobWorkerImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerWorker(com.zhd.grpc.job.service.RegisterWorkerRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.RegisterWorkerReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterWorkerMethod(), responseObserver);
    }

    /**
     */
    public void deregisterWorker(com.zhd.grpc.job.service.DeregisterWorkerRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.DeregisterWorkerReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeregisterWorkerMethod(), responseObserver);
    }

    /**
     */
    public void sendStats(com.zhd.grpc.job.service.SendStatsRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendStatsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendStatsMethod(), responseObserver);
    }

    /**
     */
    public void sendRunningJobs(com.zhd.grpc.job.service.SendRunningJobsRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendRunningJobsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendRunningJobsMethod(), responseObserver);
    }

    /**
     */
    public void sendJobResult(com.zhd.grpc.job.service.SendJobResultRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendJobResultReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendJobResultMethod(), responseObserver);
    }

    /**
     */
    public void exchangeJob(com.zhd.grpc.job.service.ExchangeJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.ExchangeJobReply> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.RegisterWorkerRequest,
                com.zhd.grpc.job.service.RegisterWorkerReply>(
                  this, METHODID_REGISTER_WORKER)))
          .addMethod(
            getDeregisterWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.DeregisterWorkerRequest,
                com.zhd.grpc.job.service.DeregisterWorkerReply>(
                  this, METHODID_DEREGISTER_WORKER)))
          .addMethod(
            getSendStatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.SendStatsRequest,
                com.zhd.grpc.job.service.SendStatsReply>(
                  this, METHODID_SEND_STATS)))
          .addMethod(
            getSendRunningJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.SendRunningJobsRequest,
                com.zhd.grpc.job.service.SendRunningJobsReply>(
                  this, METHODID_SEND_RUNNING_JOBS)))
          .addMethod(
            getSendJobResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.SendJobResultRequest,
                com.zhd.grpc.job.service.SendJobResultReply>(
                  this, METHODID_SEND_JOB_RESULT)))
          .addMethod(
            getExchangeJobMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.zhd.grpc.job.service.ExchangeJobRequest,
                com.zhd.grpc.job.service.ExchangeJobReply>(
                  this, METHODID_EXCHANGE_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class HiJobWorkerStub extends io.grpc.stub.AbstractAsyncStub<HiJobWorkerStub> {
    private HiJobWorkerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobWorkerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobWorkerStub(channel, callOptions);
    }

    /**
     */
    public void registerWorker(com.zhd.grpc.job.service.RegisterWorkerRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.RegisterWorkerReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deregisterWorker(com.zhd.grpc.job.service.DeregisterWorkerRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.DeregisterWorkerReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeregisterWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendStats(com.zhd.grpc.job.service.SendStatsRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendStatsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendRunningJobs(com.zhd.grpc.job.service.SendRunningJobsRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendRunningJobsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendRunningJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendJobResult(com.zhd.grpc.job.service.SendJobResultRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendJobResultReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendJobResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeJob(com.zhd.grpc.job.service.ExchangeJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.ExchangeJobReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getExchangeJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HiJobWorkerBlockingStub extends io.grpc.stub.AbstractBlockingStub<HiJobWorkerBlockingStub> {
    private HiJobWorkerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobWorkerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobWorkerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zhd.grpc.job.service.RegisterWorkerReply registerWorker(com.zhd.grpc.job.service.RegisterWorkerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.service.DeregisterWorkerReply deregisterWorker(com.zhd.grpc.job.service.DeregisterWorkerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeregisterWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.service.SendStatsReply sendStats(com.zhd.grpc.job.service.SendStatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.service.SendRunningJobsReply sendRunningJobs(com.zhd.grpc.job.service.SendRunningJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendRunningJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.service.SendJobResultReply sendJobResult(com.zhd.grpc.job.service.SendJobResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendJobResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.zhd.grpc.job.service.ExchangeJobReply> exchangeJob(
        com.zhd.grpc.job.service.ExchangeJobRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getExchangeJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HiJobWorkerFutureStub extends io.grpc.stub.AbstractFutureStub<HiJobWorkerFutureStub> {
    private HiJobWorkerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobWorkerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobWorkerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.service.RegisterWorkerReply> registerWorker(
        com.zhd.grpc.job.service.RegisterWorkerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.service.DeregisterWorkerReply> deregisterWorker(
        com.zhd.grpc.job.service.DeregisterWorkerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeregisterWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.service.SendStatsReply> sendStats(
        com.zhd.grpc.job.service.SendStatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.service.SendRunningJobsReply> sendRunningJobs(
        com.zhd.grpc.job.service.SendRunningJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendRunningJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.service.SendJobResultReply> sendJobResult(
        com.zhd.grpc.job.service.SendJobResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendJobResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_WORKER = 0;
  private static final int METHODID_DEREGISTER_WORKER = 1;
  private static final int METHODID_SEND_STATS = 2;
  private static final int METHODID_SEND_RUNNING_JOBS = 3;
  private static final int METHODID_SEND_JOB_RESULT = 4;
  private static final int METHODID_EXCHANGE_JOB = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HiJobWorkerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HiJobWorkerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_WORKER:
          serviceImpl.registerWorker((com.zhd.grpc.job.service.RegisterWorkerRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.RegisterWorkerReply>) responseObserver);
          break;
        case METHODID_DEREGISTER_WORKER:
          serviceImpl.deregisterWorker((com.zhd.grpc.job.service.DeregisterWorkerRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.DeregisterWorkerReply>) responseObserver);
          break;
        case METHODID_SEND_STATS:
          serviceImpl.sendStats((com.zhd.grpc.job.service.SendStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendStatsReply>) responseObserver);
          break;
        case METHODID_SEND_RUNNING_JOBS:
          serviceImpl.sendRunningJobs((com.zhd.grpc.job.service.SendRunningJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendRunningJobsReply>) responseObserver);
          break;
        case METHODID_SEND_JOB_RESULT:
          serviceImpl.sendJobResult((com.zhd.grpc.job.service.SendJobResultRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.SendJobResultReply>) responseObserver);
          break;
        case METHODID_EXCHANGE_JOB:
          serviceImpl.exchangeJob((com.zhd.grpc.job.service.ExchangeJobRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.service.ExchangeJobReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HiJobWorkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HiJobWorkerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zhd.grpc.job.service.JobServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HiJobWorker");
    }
  }

  private static final class HiJobWorkerFileDescriptorSupplier
      extends HiJobWorkerBaseDescriptorSupplier {
    HiJobWorkerFileDescriptorSupplier() {}
  }

  private static final class HiJobWorkerMethodDescriptorSupplier
      extends HiJobWorkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HiJobWorkerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HiJobWorkerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HiJobWorkerFileDescriptorSupplier())
              .addMethod(getRegisterWorkerMethod())
              .addMethod(getDeregisterWorkerMethod())
              .addMethod(getSendStatsMethod())
              .addMethod(getSendRunningJobsMethod())
              .addMethod(getSendJobResultMethod())
              .addMethod(getExchangeJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
