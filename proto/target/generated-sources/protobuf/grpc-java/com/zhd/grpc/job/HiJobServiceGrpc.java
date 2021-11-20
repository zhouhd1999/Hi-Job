package com.zhd.grpc.job;

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
    comments = "Source: job.proto")
public final class HiJobServiceGrpc {

  private HiJobServiceGrpc() {}

  public static final String SERVICE_NAME = "com.zhd.grpc.job.HiJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.PingRequest,
      com.zhd.grpc.job.PongResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.zhd.grpc.job.PingRequest.class,
      responseType = com.zhd.grpc.job.PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.PingRequest,
      com.zhd.grpc.job.PongResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.PingRequest, com.zhd.grpc.job.PongResponse> getPingMethod;
    if ((getPingMethod = HiJobServiceGrpc.getPingMethod) == null) {
      synchronized (HiJobServiceGrpc.class) {
        if ((getPingMethod = HiJobServiceGrpc.getPingMethod) == null) {
          HiJobServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.PingRequest, com.zhd.grpc.job.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.AddJobRequest,
      com.zhd.grpc.job.AddJobReply> getAddJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddJob",
      requestType = com.zhd.grpc.job.AddJobRequest.class,
      responseType = com.zhd.grpc.job.AddJobReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.AddJobRequest,
      com.zhd.grpc.job.AddJobReply> getAddJobMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.AddJobRequest, com.zhd.grpc.job.AddJobReply> getAddJobMethod;
    if ((getAddJobMethod = HiJobServiceGrpc.getAddJobMethod) == null) {
      synchronized (HiJobServiceGrpc.class) {
        if ((getAddJobMethod = HiJobServiceGrpc.getAddJobMethod) == null) {
          HiJobServiceGrpc.getAddJobMethod = getAddJobMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.AddJobRequest, com.zhd.grpc.job.AddJobReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.AddJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.AddJobReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobServiceMethodDescriptorSupplier("AddJob"))
              .build();
        }
      }
    }
    return getAddJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.DeleteJobRequest,
      com.zhd.grpc.job.DeleteJobReply> getDeleteJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteJob",
      requestType = com.zhd.grpc.job.DeleteJobRequest.class,
      responseType = com.zhd.grpc.job.DeleteJobReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.DeleteJobRequest,
      com.zhd.grpc.job.DeleteJobReply> getDeleteJobMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.DeleteJobRequest, com.zhd.grpc.job.DeleteJobReply> getDeleteJobMethod;
    if ((getDeleteJobMethod = HiJobServiceGrpc.getDeleteJobMethod) == null) {
      synchronized (HiJobServiceGrpc.class) {
        if ((getDeleteJobMethod = HiJobServiceGrpc.getDeleteJobMethod) == null) {
          HiJobServiceGrpc.getDeleteJobMethod = getDeleteJobMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.DeleteJobRequest, com.zhd.grpc.job.DeleteJobReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.DeleteJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.DeleteJobReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobServiceMethodDescriptorSupplier("DeleteJob"))
              .build();
        }
      }
    }
    return getDeleteJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zhd.grpc.job.GetJobResultRequest,
      com.zhd.grpc.job.GetJobResultReply> getGetJobResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobResult",
      requestType = com.zhd.grpc.job.GetJobResultRequest.class,
      responseType = com.zhd.grpc.job.GetJobResultReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zhd.grpc.job.GetJobResultRequest,
      com.zhd.grpc.job.GetJobResultReply> getGetJobResultMethod() {
    io.grpc.MethodDescriptor<com.zhd.grpc.job.GetJobResultRequest, com.zhd.grpc.job.GetJobResultReply> getGetJobResultMethod;
    if ((getGetJobResultMethod = HiJobServiceGrpc.getGetJobResultMethod) == null) {
      synchronized (HiJobServiceGrpc.class) {
        if ((getGetJobResultMethod = HiJobServiceGrpc.getGetJobResultMethod) == null) {
          HiJobServiceGrpc.getGetJobResultMethod = getGetJobResultMethod =
              io.grpc.MethodDescriptor.<com.zhd.grpc.job.GetJobResultRequest, com.zhd.grpc.job.GetJobResultReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.GetJobResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zhd.grpc.job.GetJobResultReply.getDefaultInstance()))
              .setSchemaDescriptor(new HiJobServiceMethodDescriptorSupplier("GetJobResult"))
              .build();
        }
      }
    }
    return getGetJobResultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HiJobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobServiceStub>() {
        @java.lang.Override
        public HiJobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobServiceStub(channel, callOptions);
        }
      };
    return HiJobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HiJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobServiceBlockingStub>() {
        @java.lang.Override
        public HiJobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobServiceBlockingStub(channel, callOptions);
        }
      };
    return HiJobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HiJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HiJobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HiJobServiceFutureStub>() {
        @java.lang.Override
        public HiJobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HiJobServiceFutureStub(channel, callOptions);
        }
      };
    return HiJobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HiJobServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.zhd.grpc.job.PingRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.PongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void addJob(com.zhd.grpc.job.AddJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.AddJobReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddJobMethod(), responseObserver);
    }

    /**
     */
    public void deleteJob(com.zhd.grpc.job.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.DeleteJobReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteJobMethod(), responseObserver);
    }

    /**
     */
    public void getJobResult(com.zhd.grpc.job.GetJobResultRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.GetJobResultReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobResultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.PingRequest,
                com.zhd.grpc.job.PongResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getAddJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.AddJobRequest,
                com.zhd.grpc.job.AddJobReply>(
                  this, METHODID_ADD_JOB)))
          .addMethod(
            getDeleteJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.DeleteJobRequest,
                com.zhd.grpc.job.DeleteJobReply>(
                  this, METHODID_DELETE_JOB)))
          .addMethod(
            getGetJobResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zhd.grpc.job.GetJobResultRequest,
                com.zhd.grpc.job.GetJobResultReply>(
                  this, METHODID_GET_JOB_RESULT)))
          .build();
    }
  }

  /**
   */
  public static final class HiJobServiceStub extends io.grpc.stub.AbstractAsyncStub<HiJobServiceStub> {
    private HiJobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.zhd.grpc.job.PingRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.PongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addJob(com.zhd.grpc.job.AddJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.AddJobReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteJob(com.zhd.grpc.job.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.DeleteJobReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobResult(com.zhd.grpc.job.GetJobResultRequest request,
        io.grpc.stub.StreamObserver<com.zhd.grpc.job.GetJobResultReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobResultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HiJobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HiJobServiceBlockingStub> {
    private HiJobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zhd.grpc.job.PongResponse ping(com.zhd.grpc.job.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.AddJobReply addJob(com.zhd.grpc.job.AddJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.DeleteJobReply deleteJob(com.zhd.grpc.job.DeleteJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zhd.grpc.job.GetJobResultReply getJobResult(com.zhd.grpc.job.GetJobResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobResultMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HiJobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HiJobServiceFutureStub> {
    private HiJobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HiJobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HiJobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.PongResponse> ping(
        com.zhd.grpc.job.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.AddJobReply> addJob(
        com.zhd.grpc.job.AddJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.DeleteJobReply> deleteJob(
        com.zhd.grpc.job.DeleteJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zhd.grpc.job.GetJobResultReply> getJobResult(
        com.zhd.grpc.job.GetJobResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_ADD_JOB = 1;
  private static final int METHODID_DELETE_JOB = 2;
  private static final int METHODID_GET_JOB_RESULT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HiJobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HiJobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.zhd.grpc.job.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.PongResponse>) responseObserver);
          break;
        case METHODID_ADD_JOB:
          serviceImpl.addJob((com.zhd.grpc.job.AddJobRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.AddJobReply>) responseObserver);
          break;
        case METHODID_DELETE_JOB:
          serviceImpl.deleteJob((com.zhd.grpc.job.DeleteJobRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.DeleteJobReply>) responseObserver);
          break;
        case METHODID_GET_JOB_RESULT:
          serviceImpl.getJobResult((com.zhd.grpc.job.GetJobResultRequest) request,
              (io.grpc.stub.StreamObserver<com.zhd.grpc.job.GetJobResultReply>) responseObserver);
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

  private static abstract class HiJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HiJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zhd.grpc.job.Job.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HiJobService");
    }
  }

  private static final class HiJobServiceFileDescriptorSupplier
      extends HiJobServiceBaseDescriptorSupplier {
    HiJobServiceFileDescriptorSupplier() {}
  }

  private static final class HiJobServiceMethodDescriptorSupplier
      extends HiJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HiJobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HiJobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HiJobServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getAddJobMethod())
              .addMethod(getDeleteJobMethod())
              .addMethod(getGetJobResultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
