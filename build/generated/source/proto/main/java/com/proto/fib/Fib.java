// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fib/fib.proto

package com.proto.fib;

public final class Fib {
  private Fib() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fib_CalculateFibRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fib_CalculateFibRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fib_CalculateFibResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fib_CalculateFibResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfib/fib.proto\022\003fib\"%\n\023CalculateFibRequ" +
      "est\022\016\n\006number\030\001 \001(\005\"*\n\024CalculateFibRespo" +
      "nse\022\022\n\nfib_number\030\001 \001(\0032R\n\tFibServer\022E\n\014" +
      "CalculateFib\022\030.fib.CalculateFibRequest\032\031" +
      ".fib.CalculateFibResponse\"\000B\021\n\rcom.proto" +
      ".fibP\001b\006proto3"
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
    internal_static_fib_CalculateFibRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fib_CalculateFibRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fib_CalculateFibRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_fib_CalculateFibResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_fib_CalculateFibResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fib_CalculateFibResponse_descriptor,
        new java.lang.String[] { "FibNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}