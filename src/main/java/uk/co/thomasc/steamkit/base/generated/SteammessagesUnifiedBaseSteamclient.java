// Generated by the protocol buffer compiler.  DO NOT EDIT!

package uk.co.thomasc.steamkit.base.generated;

@SuppressWarnings("hiding")
public interface SteammessagesUnifiedBaseSteamclient {

  // extend .google.protobuf.FieldOptions {
  //   optional string description = 50000;
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.FieldOptions,
      String> description =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_STRING,
              String.class,
              400002L);

  // extend .google.protobuf.ServiceOptions {
  //   optional string service_description = 50000;
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.ServiceOptions,
      String> serviceDescription =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_STRING,
              String.class,
              400002L);

  // extend .google.protobuf.ServiceOptions {
  //   optional .EProtoExecutionSite service_execution_site = 50008 [default = k_EProtoExecutionSiteUnknown];
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.ServiceOptions,
      Integer> serviceExecutionSite =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_ENUM,
              Integer.class,
              400064L);

  // extend .google.protobuf.MethodOptions {
  //   optional string method_description = 50000;
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.MethodOptions,
      String> methodDescription =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_STRING,
              String.class,
              400002L);

  // extend .google.protobuf.EnumOptions {
  //   optional string enum_description = 50000;
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.EnumOptions,
      String> enumDescription =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_STRING,
              String.class,
              400002L);

  // extend .google.protobuf.EnumValueOptions {
  //   optional string enum_value_description = 50000;
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.EnumValueOptions,
      String> enumValueDescription =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_STRING,
              String.class,
              400002L);

  // enum EProtoExecutionSite
  public static final int k_EProtoExecutionSiteUnknown = 0;
  public static final int k_EProtoExecutionSiteSteamClient = 2;

  public static final class NoResponse extends
      com.google.protobuf.nano.ExtendableMessageNano<NoResponse> {

    private static volatile NoResponse[] _emptyArray;
    public static NoResponse[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new NoResponse[0];
          }
        }
      }
      return _emptyArray;
    }

    public NoResponse() {
      clear();
    }

    public NoResponse clear() {
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public NoResponse mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
        }
      }
    }

    public static NoResponse parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new NoResponse(), data);
    }

    public static NoResponse parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new NoResponse().mergeFrom(input);
    }
  }
}
