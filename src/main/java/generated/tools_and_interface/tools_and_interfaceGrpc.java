package generated.tools_and_interface;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: tools_and_interface.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "tools_and_interface.tools_and_interface", "greetings"))
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
              .setFullMethodName(generateFullMethodName(
                  "tools_and_interface.tools_and_interface", "reminders"))
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
    return new tools_and_interfaceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static tools_and_interfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new tools_and_interfaceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static tools_and_interfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new tools_and_interfaceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class tools_and_interfaceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.RequestMessage> greetings(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.ResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.personalInfo> reminders(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.confirmationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRemindersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.tools_and_interface.RequestMessage,
                generated.tools_and_interface.ResponseMessage>(
                  this, METHODID_GREETINGS)))
          .addMethod(
            getRemindersMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.tools_and_interface.personalInfo,
                generated.tools_and_interface.confirmationResponse>(
                  this, METHODID_REMINDERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceStub extends io.grpc.stub.AbstractStub<tools_and_interfaceStub> {
    private tools_and_interfaceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tools_and_interfaceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tools_and_interfaceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.RequestMessage> greetings(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.ResponseMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.tools_and_interface.personalInfo> reminders(
        io.grpc.stub.StreamObserver<generated.tools_and_interface.confirmationResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRemindersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceBlockingStub extends io.grpc.stub.AbstractStub<tools_and_interfaceBlockingStub> {
    private tools_and_interfaceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tools_and_interfaceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tools_and_interfaceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class tools_and_interfaceFutureStub extends io.grpc.stub.AbstractStub<tools_and_interfaceFutureStub> {
    private tools_and_interfaceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tools_and_interfaceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tools_and_interfaceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
    private final tools_and_interfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(tools_and_interfaceImplBase serviceImpl, int methodId) {
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
