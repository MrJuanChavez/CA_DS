// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tools_and_interface.proto

package generated.tools_and_interface;

/**
 * Protobuf type {@code tools_and_interface.ResponseMessage}
 */
public  final class ResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tools_and_interface.ResponseMessage)
    ResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseMessage.newBuilder() to construct.
  private ResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseMessage() {
    greetingText_ = "";
    name_ = "";
    confirmInComp_ = false;
    roomTime_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            greetingText_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            confirmInComp_ = input.readBool();
            break;
          }
          case 32: {

            roomTime_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.tools_and_interface.tools_and_interfaceImpl.internal_static_tools_and_interface_ResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.tools_and_interface.tools_and_interfaceImpl.internal_static_tools_and_interface_ResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.tools_and_interface.ResponseMessage.class, generated.tools_and_interface.ResponseMessage.Builder.class);
  }

  public static final int GREETINGTEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object greetingText_;
  /**
   * <code>string greetingText = 1;</code>
   */
  public java.lang.String getGreetingText() {
    java.lang.Object ref = greetingText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      greetingText_ = s;
      return s;
    }
  }
  /**
   * <code>string greetingText = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGreetingTextBytes() {
    java.lang.Object ref = greetingText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      greetingText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIRMINCOMP_FIELD_NUMBER = 3;
  private boolean confirmInComp_;
  /**
   * <code>bool confirmInComp = 3;</code>
   */
  public boolean getConfirmInComp() {
    return confirmInComp_;
  }

  public static final int ROOMTIME_FIELD_NUMBER = 4;
  private int roomTime_;
  /**
   * <code>int32 roomTime = 4;</code>
   */
  public int getRoomTime() {
    return roomTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getGreetingTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, greetingText_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (confirmInComp_ != false) {
      output.writeBool(3, confirmInComp_);
    }
    if (roomTime_ != 0) {
      output.writeInt32(4, roomTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGreetingTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, greetingText_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (confirmInComp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, confirmInComp_);
    }
    if (roomTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, roomTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.tools_and_interface.ResponseMessage)) {
      return super.equals(obj);
    }
    generated.tools_and_interface.ResponseMessage other = (generated.tools_and_interface.ResponseMessage) obj;

    boolean result = true;
    result = result && getGreetingText()
        .equals(other.getGreetingText());
    result = result && getName()
        .equals(other.getName());
    result = result && (getConfirmInComp()
        == other.getConfirmInComp());
    result = result && (getRoomTime()
        == other.getRoomTime());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GREETINGTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getGreetingText().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CONFIRMINCOMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConfirmInComp());
    hash = (37 * hash) + ROOMTIME_FIELD_NUMBER;
    hash = (53 * hash) + getRoomTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.tools_and_interface.ResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.tools_and_interface.ResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.tools_and_interface.ResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.tools_and_interface.ResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.tools_and_interface.ResponseMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tools_and_interface.ResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tools_and_interface.ResponseMessage)
      generated.tools_and_interface.ResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.tools_and_interface.tools_and_interfaceImpl.internal_static_tools_and_interface_ResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.tools_and_interface.tools_and_interfaceImpl.internal_static_tools_and_interface_ResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.tools_and_interface.ResponseMessage.class, generated.tools_and_interface.ResponseMessage.Builder.class);
    }

    // Construct using generated.tools_and_interface.ResponseMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      greetingText_ = "";

      name_ = "";

      confirmInComp_ = false;

      roomTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.tools_and_interface.tools_and_interfaceImpl.internal_static_tools_and_interface_ResponseMessage_descriptor;
    }

    @java.lang.Override
    public generated.tools_and_interface.ResponseMessage getDefaultInstanceForType() {
      return generated.tools_and_interface.ResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public generated.tools_and_interface.ResponseMessage build() {
      generated.tools_and_interface.ResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.tools_and_interface.ResponseMessage buildPartial() {
      generated.tools_and_interface.ResponseMessage result = new generated.tools_and_interface.ResponseMessage(this);
      result.greetingText_ = greetingText_;
      result.name_ = name_;
      result.confirmInComp_ = confirmInComp_;
      result.roomTime_ = roomTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.tools_and_interface.ResponseMessage) {
        return mergeFrom((generated.tools_and_interface.ResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.tools_and_interface.ResponseMessage other) {
      if (other == generated.tools_and_interface.ResponseMessage.getDefaultInstance()) return this;
      if (!other.getGreetingText().isEmpty()) {
        greetingText_ = other.greetingText_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getConfirmInComp() != false) {
        setConfirmInComp(other.getConfirmInComp());
      }
      if (other.getRoomTime() != 0) {
        setRoomTime(other.getRoomTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.tools_and_interface.ResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.tools_and_interface.ResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object greetingText_ = "";
    /**
     * <code>string greetingText = 1;</code>
     */
    public java.lang.String getGreetingText() {
      java.lang.Object ref = greetingText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        greetingText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string greetingText = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGreetingTextBytes() {
      java.lang.Object ref = greetingText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        greetingText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string greetingText = 1;</code>
     */
    public Builder setGreetingText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      greetingText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string greetingText = 1;</code>
     */
    public Builder clearGreetingText() {
      
      greetingText_ = getDefaultInstance().getGreetingText();
      onChanged();
      return this;
    }
    /**
     * <code>string greetingText = 1;</code>
     */
    public Builder setGreetingTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      greetingText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private boolean confirmInComp_ ;
    /**
     * <code>bool confirmInComp = 3;</code>
     */
    public boolean getConfirmInComp() {
      return confirmInComp_;
    }
    /**
     * <code>bool confirmInComp = 3;</code>
     */
    public Builder setConfirmInComp(boolean value) {
      
      confirmInComp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool confirmInComp = 3;</code>
     */
    public Builder clearConfirmInComp() {
      
      confirmInComp_ = false;
      onChanged();
      return this;
    }

    private int roomTime_ ;
    /**
     * <code>int32 roomTime = 4;</code>
     */
    public int getRoomTime() {
      return roomTime_;
    }
    /**
     * <code>int32 roomTime = 4;</code>
     */
    public Builder setRoomTime(int value) {
      
      roomTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 roomTime = 4;</code>
     */
    public Builder clearRoomTime() {
      
      roomTime_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tools_and_interface.ResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:tools_and_interface.ResponseMessage)
  private static final generated.tools_and_interface.ResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.tools_and_interface.ResponseMessage();
  }

  public static generated.tools_and_interface.ResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<ResponseMessage>() {
    @java.lang.Override
    public ResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.tools_and_interface.ResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

