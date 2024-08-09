package generated.Smart_Intravenous;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: Smart_Intravenous.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Smart_IntravenousGrpc {

  private Smart_IntravenousGrpc() {}

  public static final String SERVICE_NAME = "Smart_Intravenous.Smart_Intravenous";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Smart_Intravenous.flowRate,
      generated.Smart_Intravenous.confirmFRate> getSetFlowRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setFlowR",
      requestType = generated.Smart_Intravenous.flowRate.class,
      responseType = generated.Smart_Intravenous.confirmFRate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Smart_Intravenous.flowRate,
      generated.Smart_Intravenous.confirmFRate> getSetFlowRMethod() {
    io.grpc.MethodDescriptor<generated.Smart_Intravenous.flowRate, generated.Smart_Intravenous.confirmFRate> getSetFlowRMethod;
    if ((getSetFlowRMethod = Smart_IntravenousGrpc.getSetFlowRMethod) == null) {
      synchronized (Smart_IntravenousGrpc.class) {
        if ((getSetFlowRMethod = Smart_IntravenousGrpc.getSetFlowRMethod) == null) {
          Smart_IntravenousGrpc.getSetFlowRMethod = getSetFlowRMethod =
              io.grpc.MethodDescriptor.<generated.Smart_Intravenous.flowRate, generated.Smart_Intravenous.confirmFRate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setFlowR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Smart_Intravenous.flowRate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Smart_Intravenous.confirmFRate.getDefaultInstance()))
              .setSchemaDescriptor(new Smart_IntravenousMethodDescriptorSupplier("setFlowR"))
              .build();
        }
      }
    }
    return getSetFlowRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Smart_Intravenous.sendStatus,
      generated.Smart_Intravenous.alertMessage> getAlertDoseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alertDose",
      requestType = generated.Smart_Intravenous.sendStatus.class,
      responseType = generated.Smart_Intravenous.alertMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Smart_Intravenous.sendStatus,
      generated.Smart_Intravenous.alertMessage> getAlertDoseMethod() {
    io.grpc.MethodDescriptor<generated.Smart_Intravenous.sendStatus, generated.Smart_Intravenous.alertMessage> getAlertDoseMethod;
    if ((getAlertDoseMethod = Smart_IntravenousGrpc.getAlertDoseMethod) == null) {
      synchronized (Smart_IntravenousGrpc.class) {
        if ((getAlertDoseMethod = Smart_IntravenousGrpc.getAlertDoseMethod) == null) {
          Smart_IntravenousGrpc.getAlertDoseMethod = getAlertDoseMethod =
              io.grpc.MethodDescriptor.<generated.Smart_Intravenous.sendStatus, generated.Smart_Intravenous.alertMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "alertDose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Smart_Intravenous.sendStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Smart_Intravenous.alertMessage.getDefaultInstance()))
              .setSchemaDescriptor(new Smart_IntravenousMethodDescriptorSupplier("alertDose"))
              .build();
        }
      }
    }
    return getAlertDoseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Smart_IntravenousStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousStub>() {
        @java.lang.Override
        public Smart_IntravenousStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Smart_IntravenousStub(channel, callOptions);
        }
      };
    return Smart_IntravenousStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Smart_IntravenousBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousBlockingStub>() {
        @java.lang.Override
        public Smart_IntravenousBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Smart_IntravenousBlockingStub(channel, callOptions);
        }
      };
    return Smart_IntravenousBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Smart_IntravenousFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Smart_IntravenousFutureStub>() {
        @java.lang.Override
        public Smart_IntravenousFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Smart_IntravenousFutureStub(channel, callOptions);
        }
      };
    return Smart_IntravenousFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void setFlowR(generated.Smart_Intravenous.flowRate request,
        io.grpc.stub.StreamObserver<generated.Smart_Intravenous.confirmFRate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFlowRMethod(), responseObserver);
    }

    /**
     */
    default void alertDose(generated.Smart_Intravenous.sendStatus request,
        io.grpc.stub.StreamObserver<generated.Smart_Intravenous.alertMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlertDoseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Smart_Intravenous.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Smart_IntravenousImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Smart_IntravenousGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Smart_Intravenous.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Smart_IntravenousStub
      extends io.grpc.stub.AbstractAsyncStub<Smart_IntravenousStub> {
    private Smart_IntravenousStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Smart_IntravenousStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Smart_IntravenousStub(channel, callOptions);
    }

    /**
     */
    public void setFlowR(generated.Smart_Intravenous.flowRate request,
        io.grpc.stub.StreamObserver<generated.Smart_Intravenous.confirmFRate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFlowRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alertDose(generated.Smart_Intravenous.sendStatus request,
        io.grpc.stub.StreamObserver<generated.Smart_Intravenous.alertMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlertDoseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Smart_Intravenous.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Smart_IntravenousBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Smart_IntravenousBlockingStub> {
    private Smart_IntravenousBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Smart_IntravenousBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Smart_IntravenousBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Smart_Intravenous.confirmFRate setFlowR(generated.Smart_Intravenous.flowRate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFlowRMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Smart_Intravenous.alertMessage alertDose(generated.Smart_Intravenous.sendStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlertDoseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Smart_Intravenous.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Smart_IntravenousFutureStub
      extends io.grpc.stub.AbstractFutureStub<Smart_IntravenousFutureStub> {
    private Smart_IntravenousFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Smart_IntravenousFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Smart_IntravenousFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Smart_Intravenous.confirmFRate> setFlowR(
        generated.Smart_Intravenous.flowRate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFlowRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Smart_Intravenous.alertMessage> alertDose(
        generated.Smart_Intravenous.sendStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlertDoseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_FLOW_R = 0;
  private static final int METHODID_ALERT_DOSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_FLOW_R:
          serviceImpl.setFlowR((generated.Smart_Intravenous.flowRate) request,
              (io.grpc.stub.StreamObserver<generated.Smart_Intravenous.confirmFRate>) responseObserver);
          break;
        case METHODID_ALERT_DOSE:
          serviceImpl.alertDose((generated.Smart_Intravenous.sendStatus) request,
              (io.grpc.stub.StreamObserver<generated.Smart_Intravenous.alertMessage>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSetFlowRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.Smart_Intravenous.flowRate,
              generated.Smart_Intravenous.confirmFRate>(
                service, METHODID_SET_FLOW_R)))
        .addMethod(
          getAlertDoseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.Smart_Intravenous.sendStatus,
              generated.Smart_Intravenous.alertMessage>(
                service, METHODID_ALERT_DOSE)))
        .build();
  }

  private static abstract class Smart_IntravenousBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Smart_IntravenousBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.Smart_Intravenous.Smart_IntravenousImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Smart_Intravenous");
    }
  }

  private static final class Smart_IntravenousFileDescriptorSupplier
      extends Smart_IntravenousBaseDescriptorSupplier {
    Smart_IntravenousFileDescriptorSupplier() {}
  }

  private static final class Smart_IntravenousMethodDescriptorSupplier
      extends Smart_IntravenousBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Smart_IntravenousMethodDescriptorSupplier(String methodName) {
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
      synchronized (Smart_IntravenousGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Smart_IntravenousFileDescriptorSupplier())
              .addMethod(getSetFlowRMethod())
              .addMethod(getAlertDoseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
