package in.dragonbra.javasteam.protobufs.steam;


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: steam/steammessages_unified_base.steamclient.proto

// Protobuf Java Version: 3.25.2
public final class SteammessagesUnifiedBaseSteamclient {
  private SteammessagesUnifiedBaseSteamclient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(SteammessagesUnifiedBaseSteamclient.description);
    registry.add(SteammessagesUnifiedBaseSteamclient.serviceDescription);
    registry.add(SteammessagesUnifiedBaseSteamclient.serviceExecutionSite);
    registry.add(SteammessagesUnifiedBaseSteamclient.methodDescription);
    registry.add(SteammessagesUnifiedBaseSteamclient.enumDescription);
    registry.add(SteammessagesUnifiedBaseSteamclient.enumValueDescription);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code EProtoExecutionSite}
   */
  public enum EProtoExecutionSite
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>k_EProtoExecutionSiteUnknown = 0;</code>
     */
    k_EProtoExecutionSiteUnknown(0),
    /**
     * <code>k_EProtoExecutionSiteSteamClient = 2;</code>
     */
    k_EProtoExecutionSiteSteamClient(2),
    ;

    /**
     * <code>k_EProtoExecutionSiteUnknown = 0;</code>
     */
    public static final int k_EProtoExecutionSiteUnknown_VALUE = 0;
    /**
     * <code>k_EProtoExecutionSiteSteamClient = 2;</code>
     */
    public static final int k_EProtoExecutionSiteSteamClient_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EProtoExecutionSite valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EProtoExecutionSite forNumber(int value) {
      switch (value) {
        case 0: return k_EProtoExecutionSiteUnknown;
        case 2: return k_EProtoExecutionSiteSteamClient;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EProtoExecutionSite>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EProtoExecutionSite> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EProtoExecutionSite>() {
            public EProtoExecutionSite findValueByNumber(int number) {
              return EProtoExecutionSite.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return SteammessagesUnifiedBaseSteamclient.getDescriptor().getEnumTypes().get(0);
    }

    private static final EProtoExecutionSite[] VALUES = values();

    public static EProtoExecutionSite valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EProtoExecutionSite(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EProtoExecutionSite)
  }

  public interface NoResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NoResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code NoResponse}
   */
  public static final class NoResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NoResponse)
      NoResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NoResponse.newBuilder() to construct.
    private NoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NoResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NoResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesUnifiedBaseSteamclient.internal_static_NoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesUnifiedBaseSteamclient.internal_static_NoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesUnifiedBaseSteamclient.NoResponse.class, SteammessagesUnifiedBaseSteamclient.NoResponse.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SteammessagesUnifiedBaseSteamclient.NoResponse)) {
        return super.equals(obj);
      }
      SteammessagesUnifiedBaseSteamclient.NoResponse other = (SteammessagesUnifiedBaseSteamclient.NoResponse) obj;

      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesUnifiedBaseSteamclient.NoResponse parseFrom(
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
    public static Builder newBuilder(SteammessagesUnifiedBaseSteamclient.NoResponse prototype) {
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
     * Protobuf type {@code NoResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NoResponse)
        SteammessagesUnifiedBaseSteamclient.NoResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesUnifiedBaseSteamclient.internal_static_NoResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesUnifiedBaseSteamclient.internal_static_NoResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesUnifiedBaseSteamclient.NoResponse.class, SteammessagesUnifiedBaseSteamclient.NoResponse.Builder.class);
      }

      // Construct using SteammessagesUnifiedBaseSteamclient.NoResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesUnifiedBaseSteamclient.internal_static_NoResponse_descriptor;
      }

      @java.lang.Override
      public SteammessagesUnifiedBaseSteamclient.NoResponse getDefaultInstanceForType() {
        return SteammessagesUnifiedBaseSteamclient.NoResponse.getDefaultInstance();
      }

      @java.lang.Override
      public SteammessagesUnifiedBaseSteamclient.NoResponse build() {
        SteammessagesUnifiedBaseSteamclient.NoResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SteammessagesUnifiedBaseSteamclient.NoResponse buildPartial() {
        SteammessagesUnifiedBaseSteamclient.NoResponse result = new SteammessagesUnifiedBaseSteamclient.NoResponse(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SteammessagesUnifiedBaseSteamclient.NoResponse) {
          return mergeFrom((SteammessagesUnifiedBaseSteamclient.NoResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesUnifiedBaseSteamclient.NoResponse other) {
        if (other == SteammessagesUnifiedBaseSteamclient.NoResponse.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NoResponse)
    }

    // @@protoc_insertion_point(class_scope:NoResponse)
    private static final SteammessagesUnifiedBaseSteamclient.NoResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesUnifiedBaseSteamclient.NoResponse();
    }

    public static SteammessagesUnifiedBaseSteamclient.NoResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<NoResponse>
        PARSER = new com.google.protobuf.AbstractParser<NoResponse>() {
      @java.lang.Override
      public NoResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<NoResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NoResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SteammessagesUnifiedBaseSteamclient.NoResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int DESCRIPTION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> description = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int SERVICE_DESCRIPTION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> serviceDescription = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int SERVICE_EXECUTION_SITE_FIELD_NUMBER = 50008;
  /**
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      SteammessagesUnifiedBaseSteamclient.EProtoExecutionSite> serviceExecutionSite = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        SteammessagesUnifiedBaseSteamclient.EProtoExecutionSite.class,
        null);
  public static final int METHOD_DESCRIPTION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      java.lang.String> methodDescription = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int ENUM_DESCRIPTION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.EnumOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumOptions,
      java.lang.String> enumDescription = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int ENUM_VALUE_DESCRIPTION_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      java.lang.String> enumValueDescription = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NoResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2steam/steammessages_unified_base.steam" +
      "client.proto\032 google/protobuf/descriptor" +
      ".proto\"\014\n\nNoResponse*]\n\023EProtoExecutionS" +
      "ite\022 \n\034k_EProtoExecutionSiteUnknown\020\000\022$\n" +
      " k_EProtoExecutionSiteSteamClient\020\002:4\n\013d" +
      "escription\022\035.google.protobuf.FieldOption" +
      "s\030\320\206\003 \001(\t:>\n\023service_description\022\037.googl" +
      "e.protobuf.ServiceOptions\030\320\206\003 \001(\t:u\n\026ser" +
      "vice_execution_site\022\037.google.protobuf.Se" +
      "rviceOptions\030\330\206\003 \001(\0162\024.EProtoExecutionSi" +
      "te:\034k_EProtoExecutionSiteUnknown:<\n\022meth" +
      "od_description\022\036.google.protobuf.MethodO" +
      "ptions\030\320\206\003 \001(\t:8\n\020enum_description\022\034.goo" +
      "gle.protobuf.EnumOptions\030\320\206\003 \001(\t:C\n\026enum" +
      "_value_description\022!.google.protobuf.Enu" +
      "mValueOptions\030\320\206\003 \001(\tB\005H\001\200\001\000"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_NoResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NoResponse_descriptor,
        new java.lang.String[] { });
    description.internalInit(descriptor.getExtensions().get(0));
    serviceDescription.internalInit(descriptor.getExtensions().get(1));
    serviceExecutionSite.internalInit(descriptor.getExtensions().get(2));
    methodDescription.internalInit(descriptor.getExtensions().get(3));
    enumDescription.internalInit(descriptor.getExtensions().get(4));
    enumValueDescription.internalInit(descriptor.getExtensions().get(5));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
