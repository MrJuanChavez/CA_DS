// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tools_and_interface.proto

package generated.tools_and_interface;

public final class tools_and_interfaceImpl {
  private tools_and_interfaceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tools_and_interface_RequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tools_and_interface_RequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tools_and_interface_ResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tools_and_interface_ResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tools_and_interface_personalInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tools_and_interface_personalInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tools_and_interface_confirmationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tools_and_interface_confirmationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031tools_and_interface.proto\022\023tools_and_i" +
      "nterface\"I\n\016RequestMessage\022\014\n\004name\030\001 \001(\t" +
      "\022\025\n\rinsuranceComp\030\002 \001(\t\022\022\n\nurgencyLvl\030\003 " +
      "\001(\t\"^\n\017ResponseMessage\022\024\n\014greetingText\030\001" +
      " \001(\t\022\014\n\004name\030\002 \001(\t\022\025\n\rconfirmInComp\030\003 \001(" +
      "\010\022\020\n\010roomTime\030\004 \001(\005\"5\n\014personalInfo\022\021\n\te" +
      "ventRmnd\030\001 \001(\t\022\022\n\nremindDate\030\002 \001(\t\")\n\024co" +
      "nfirmationResponse\022\021\n\tconfirmed\030\001 \001(\t2\322\001" +
      "\n\023tools_and_interface\022\\\n\tgreetings\022#.too" +
      "ls_and_interface.RequestMessage\032$.tools_" +
      "and_interface.ResponseMessage\"\000(\0010\001\022]\n\tr" +
      "eminders\022!.tools_and_interface.personalI" +
      "nfo\032).tools_and_interface.confirmationRe" +
      "sponse\"\000(\001B:\n\035generated.tools_and_interf" +
      "aceB\027tools_and_interfaceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tools_and_interface_RequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tools_and_interface_RequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tools_and_interface_RequestMessage_descriptor,
        new java.lang.String[] { "Name", "InsuranceComp", "UrgencyLvl", });
    internal_static_tools_and_interface_ResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tools_and_interface_ResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tools_and_interface_ResponseMessage_descriptor,
        new java.lang.String[] { "GreetingText", "Name", "ConfirmInComp", "RoomTime", });
    internal_static_tools_and_interface_personalInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tools_and_interface_personalInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tools_and_interface_personalInfo_descriptor,
        new java.lang.String[] { "EventRmnd", "RemindDate", });
    internal_static_tools_and_interface_confirmationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tools_and_interface_confirmationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tools_and_interface_confirmationResponse_descriptor,
        new java.lang.String[] { "Confirmed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
