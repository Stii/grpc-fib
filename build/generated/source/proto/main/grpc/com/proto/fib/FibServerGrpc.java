package com.proto.fib;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: fib/fib.proto")
public final class FibServerGrpc {

  private FibServerGrpc() {}

  public static final String SERVICE_NAME = "fib.FibServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.fib.CalculateFibRequest,
      com.proto.fib.CalculateFibResponse> getCalculateFibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateFib",
      requestType = com.proto.fib.CalculateFibRequest.class,
      responseType = com.proto.fib.CalculateFibResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.fib.CalculateFibRequest,
      com.proto.fib.CalculateFibResponse> getCalculateFibMethod() {
    io.grpc.MethodDescriptor<com.proto.fib.CalculateFibRequest, com.proto.fib.CalculateFibResponse> getCalculateFibMethod;
    if ((getCalculateFibMethod = FibServerGrpc.getCalculateFibMethod) == null) {
      synchronized (FibServerGrpc.class) {
        if ((getCalculateFibMethod = FibServerGrpc.getCalculateFibMethod) == null) {
          FibServerGrpc.getCalculateFibMethod = getCalculateFibMethod = 
              io.grpc.MethodDescriptor.<com.proto.fib.CalculateFibRequest, com.proto.fib.CalculateFibResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fib.FibServer", "CalculateFib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.fib.CalculateFibRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.fib.CalculateFibResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FibServerMethodDescriptorSupplier("CalculateFib"))
                  .build();
          }
        }
     }
     return getCalculateFibMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FibServerStub newStub(io.grpc.Channel channel) {
    return new FibServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FibServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FibServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FibServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FibServerFutureStub(channel);
  }

  /**
   */
  public static abstract class FibServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateFib(com.proto.fib.CalculateFibRequest request,
        io.grpc.stub.StreamObserver<com.proto.fib.CalculateFibResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateFibMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateFibMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.fib.CalculateFibRequest,
                com.proto.fib.CalculateFibResponse>(
                  this, METHODID_CALCULATE_FIB)))
          .build();
    }
  }

  /**
   */
  public static final class FibServerStub extends io.grpc.stub.AbstractStub<FibServerStub> {
    private FibServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServerStub(channel, callOptions);
    }

    /**
     */
    public void calculateFib(com.proto.fib.CalculateFibRequest request,
        io.grpc.stub.StreamObserver<com.proto.fib.CalculateFibResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateFibMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FibServerBlockingStub extends io.grpc.stub.AbstractStub<FibServerBlockingStub> {
    private FibServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.fib.CalculateFibResponse calculateFib(com.proto.fib.CalculateFibRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateFibMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FibServerFutureStub extends io.grpc.stub.AbstractStub<FibServerFutureStub> {
    private FibServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FibServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FibServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FibServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.fib.CalculateFibResponse> calculateFib(
        com.proto.fib.CalculateFibRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateFibMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_FIB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FibServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FibServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_FIB:
          serviceImpl.calculateFib((com.proto.fib.CalculateFibRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.fib.CalculateFibResponse>) responseObserver);
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

  private static abstract class FibServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FibServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.fib.Fib.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FibServer");
    }
  }

  private static final class FibServerFileDescriptorSupplier
      extends FibServerBaseDescriptorSupplier {
    FibServerFileDescriptorSupplier() {}
  }

  private static final class FibServerMethodDescriptorSupplier
      extends FibServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FibServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (FibServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FibServerFileDescriptorSupplier())
              .addMethod(getCalculateFibMethod())
              .build();
        }
      }
    }
    return result;
  }
}
