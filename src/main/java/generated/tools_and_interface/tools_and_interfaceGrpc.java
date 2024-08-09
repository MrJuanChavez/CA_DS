package generated.tools_and_interface;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: tools_and_interface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class tools_and_interfaceGrpc {

  private tools_and_interfaceGrpc() {}

  public static final String SERVICE_NAME = "tools_and_interface.tools_and_interface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.tools_and_interface.RequestMessage,
      generated.tools_and_interface.ResponseMessage> getGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetings",
      requestType = generated.tools_and_interface.RequestMessage.class,
      responseType = generated.tools_and_interface.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.tools_and_interface.RequestMessage,
      generated.tools_and_interface.ResponseMessage> getGreetingsMethod() {
    io.grpc.MethodDescriptor<generated.tools_and_interface.RequestMessage, generated.tools_and_interface.ResponseMessage> getGreetingsMethod;
    if ((getGreetingsMethod = tools_and_interfaceGrpc.getGreetingsMethod) == null) {
      synchronized (tools_and_interfaceGrpc.class) {
        if ((getGreetingsMethod = tools_and_interfaceGrpc.getGreetingsMethod) == null) {
          tools_and_interfaceGrpc.getGreetingsMethod = getGreetingsMethod =
              io.grpc.MethodDescriptor.<generated.tools_and_interface.RequestMessage, generated.tools_and_interface.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.tools_and_interface.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.tools_and_interface.ResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new tools_and_interfaceMethodDescriptorSupplier("greetings"))
              .build();
        }
      }
    }
    return getGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.tools_and_interface.personalInfo,
      generated.tools_and_interface.confirmationResponse> getRemindersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reminders",
      requestType = generated.tools_and_interface.personalInfo.class,
      responseType = generated.tools_and_interface.confirmationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.tools_and_interface.personalInfo,
      generated.tools_and_interface.confirmationResponse> getRemindersMethod() {
    io.grpc.MethodDescriptor<generated.tools_and_interface.personalInfo, generated.tools_and_interface.confirmationResponse> getRemindersMethod;
    if ((getRemindersMethod = tools_and_interfaceGrpc.getRemindersMethod) == null) {
      synchronized (tools_and_interfaceGrpc.class) {
        if ((getRemindersMethod = tools_and_interfaceGrpc.getRemindersMethod) == null) {
          tools_and_interfaceGrpc.getRemindersMethod = getRemindersMethod =
              io.grpc.MethodDescriptor.<generated.tools_and_interface.personalInfo, generated.tools_and_interface.confirmationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reminders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.tools_and_interface.personalInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.tools_and_interface.confirmationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new tools_and_interfaceMethodDescriptorSupplier("reminders"))
              .build();
        }
      }
    }
    return getRemindersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static tools_and_interfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceStub>() {
        @java.lang.Override
        public tools_and_interfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new tools_and_interfaceStub(channel, callOptions);
        }
      };
    return tools_and_interfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static tools_and_interfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceBlockingStub>() {
        @java.lang.Override
        public tools_and_interfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new tools_and_interfaceBlockingStub(channel, callOptions);
        }
      };
    return tools_and_interfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static tools_and_interfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<tools_and_interfaceFutureStub>() {
        @java.lang.Override
        public tools_and_interfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new tools_and_interfaceFutureStub(channel, callOptions);
        }
      };
    return tools_and_interfaceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<generated.tools_and_interface.RequestMessage> greetings(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.ResponseMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetingsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<generated.tools_and_interface.personalInfo> reminders(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.confirmationResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRemindersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service tools_and_interface.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class tools_and_interfaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return tools_and_interfaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service tools_and_interface.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceStub
      extends io.grpc.stub.AbstractAsyncStub<tools_and_interfaceStub> {
    private tools_and_interfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new tools_and_interfaceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.RequestMessage> greetings(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.ResponseMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.personalInfo> reminders(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.confirmationResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRemindersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service tools_and_interface.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<tools_and_interfaceBlockingStub> {
    private tools_and_interfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new tools_and_interfaceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service tools_and_interface.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<tools_and_interfaceFutureStub> {
    private tools_and_interfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new tools_and_interfaceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GREETINGS = 0;
  private static final int METHODID_REMINDERS = 1;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetings(
              (io.grpc.stub.StreamObserver<generated.tools_and_interface.ResponseMessage>) responseObserver);
        case METHODID_REMINDERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reminders(
              (io.grpc.stub.StreamObserver<generated.tools_and_interface.confirmationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGreetingsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              generated.tools_and_interface.RequestMessage,
              generated.tools_and_interface.ResponseMessage>(
                service, METHODID_GREETINGS)))
        .addMethod(
          getRemindersMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              generated.tools_and_interface.personalInfo,
              generated.tools_and_interface.confirmationResponse>(
                service, METHODID_REMINDERS)))
        .build();
  }

  private static abstract class tools_and_interfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    tools_and_interfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.tools_and_interface.tools_and_interfaceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("tools_and_interface");
    }
  }

  private static final class tools_and_interfaceFileDescriptorSupplier
      extends tools_and_interfaceBaseDescriptorSupplier {
    tools_and_interfaceFileDescriptorSupplier() {}
  }

  private static final class tools_and_interfaceMethodDescriptorSupplier
      extends tools_and_interfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    tools_and_interfaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (tools_and_interfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new tools_and_interfaceFileDescriptorSupplier())
              .addMethod(getGreetingsMethod())
              .addMethod(getRemindersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
