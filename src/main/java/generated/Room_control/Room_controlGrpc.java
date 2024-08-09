package generated.Room_control;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: Room_control.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Room_controlGrpc {

  private Room_controlGrpc() {}

  public static final String SERVICE_NAME = "Room_control.Room_control";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Room_control.changeIntensity,
      generated.Room_control.lightsIntensity> getLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lights",
      requestType = generated.Room_control.changeIntensity.class,
      responseType = generated.Room_control.lightsIntensity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.Room_control.changeIntensity,
      generated.Room_control.lightsIntensity> getLightsMethod() {
    io.grpc.MethodDescriptor<generated.Room_control.changeIntensity, generated.Room_control.lightsIntensity> getLightsMethod;
    if ((getLightsMethod = Room_controlGrpc.getLightsMethod) == null) {
      synchronized (Room_controlGrpc.class) {
        if ((getLightsMethod = Room_controlGrpc.getLightsMethod) == null) {
          Room_controlGrpc.getLightsMethod = getLightsMethod =
              io.grpc.MethodDescriptor.<generated.Room_control.changeIntensity, generated.Room_control.lightsIntensity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "lights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Room_control.changeIntensity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Room_control.lightsIntensity.getDefaultInstance()))
              .setSchemaDescriptor(new Room_controlMethodDescriptorSupplier("lights"))
              .build();
        }
      }
    }
    return getLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Room_control.adjustTemperature,
      generated.Room_control.newTemperature> getTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "temperature",
      requestType = generated.Room_control.adjustTemperature.class,
      responseType = generated.Room_control.newTemperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Room_control.adjustTemperature,
      generated.Room_control.newTemperature> getTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.Room_control.adjustTemperature, generated.Room_control.newTemperature> getTemperatureMethod;
    if ((getTemperatureMethod = Room_controlGrpc.getTemperatureMethod) == null) {
      synchronized (Room_controlGrpc.class) {
        if ((getTemperatureMethod = Room_controlGrpc.getTemperatureMethod) == null) {
          Room_controlGrpc.getTemperatureMethod = getTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.Room_control.adjustTemperature, generated.Room_control.newTemperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "temperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Room_control.adjustTemperature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Room_control.newTemperature.getDefaultInstance()))
              .setSchemaDescriptor(new Room_controlMethodDescriptorSupplier("temperature"))
              .build();
        }
      }
    }
    return getTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Room_controlStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room_controlStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room_controlStub>() {
        @java.lang.Override
        public Room_controlStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room_controlStub(channel, callOptions);
        }
      };
    return Room_controlStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Room_controlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room_controlBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room_controlBlockingStub>() {
        @java.lang.Override
        public Room_controlBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room_controlBlockingStub(channel, callOptions);
        }
      };
    return Room_controlBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Room_controlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room_controlFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room_controlFutureStub>() {
        @java.lang.Override
        public Room_controlFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room_controlFutureStub(channel, callOptions);
        }
      };
    return Room_controlFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void lights(generated.Room_control.changeIntensity request,
        io.grpc.stub.StreamObserver<generated.Room_control.lightsIntensity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLightsMethod(), responseObserver);
    }

    /**
     */
    default void temperature(generated.Room_control.adjustTemperature request,
        io.grpc.stub.StreamObserver<generated.Room_control.newTemperature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Room_control.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Room_controlImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Room_controlGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Room_control.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Room_controlStub
      extends io.grpc.stub.AbstractAsyncStub<Room_controlStub> {
    private Room_controlStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_controlStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room_controlStub(channel, callOptions);
    }

    /**
     */
    public void lights(generated.Room_control.changeIntensity request,
        io.grpc.stub.StreamObserver<generated.Room_control.lightsIntensity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void temperature(generated.Room_control.adjustTemperature request,
        io.grpc.stub.StreamObserver<generated.Room_control.newTemperature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Room_control.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Room_controlBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Room_controlBlockingStub> {
    private Room_controlBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_controlBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room_controlBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<generated.Room_control.lightsIntensity> lights(
        generated.Room_control.changeIntensity request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Room_control.newTemperature temperature(generated.Room_control.adjustTemperature request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Room_control.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Room_controlFutureStub
      extends io.grpc.stub.AbstractFutureStub<Room_controlFutureStub> {
    private Room_controlFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_controlFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room_controlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Room_control.newTemperature> temperature(
        generated.Room_control.adjustTemperature request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHTS = 0;
  private static final int METHODID_TEMPERATURE = 1;

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
        case METHODID_LIGHTS:
          serviceImpl.lights((generated.Room_control.changeIntensity) request,
              (io.grpc.stub.StreamObserver<generated.Room_control.lightsIntensity>) responseObserver);
          break;
        case METHODID_TEMPERATURE:
          serviceImpl.temperature((generated.Room_control.adjustTemperature) request,
              (io.grpc.stub.StreamObserver<generated.Room_control.newTemperature>) responseObserver);
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
          getLightsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generated.Room_control.changeIntensity,
              generated.Room_control.lightsIntensity>(
                service, METHODID_LIGHTS)))
        .addMethod(
          getTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.Room_control.adjustTemperature,
              generated.Room_control.newTemperature>(
                service, METHODID_TEMPERATURE)))
        .build();
  }

  private static abstract class Room_controlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Room_controlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.Room_control.Room_controlImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Room_control");
    }
  }

  private static final class Room_controlFileDescriptorSupplier
      extends Room_controlBaseDescriptorSupplier {
    Room_controlFileDescriptorSupplier() {}
  }

  private static final class Room_controlMethodDescriptorSupplier
      extends Room_controlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Room_controlMethodDescriptorSupplier(String methodName) {
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
      synchronized (Room_controlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Room_controlFileDescriptorSupplier())
              .addMethod(getLightsMethod())
              .addMethod(getTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
