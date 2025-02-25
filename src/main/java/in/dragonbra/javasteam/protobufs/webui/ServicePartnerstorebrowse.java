package in.dragonbra.javasteam.protobufs.webui;


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webui/service_partnerstorebrowse.proto

// Protobuf Java Version: 3.25.2
public final class ServicePartnerstorebrowse {
  private ServicePartnerstorebrowse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CPartnerStoreBrowse_GetItems_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CPartnerStoreBrowse_GetItems_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     * @return Whether the request field is set.
     */
    boolean hasRequest();
    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     * @return The request.
     */
    Common.CStoreBrowse_GetItems_Request getRequest();
    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     */
    Common.CStoreBrowse_GetItems_RequestOrBuilder getRequestOrBuilder();

    /**
     * <code>optional bool include_unpublished = 2;</code>
     * @return Whether the includeUnpublished field is set.
     */
    boolean hasIncludeUnpublished();
    /**
     * <code>optional bool include_unpublished = 2;</code>
     * @return The includeUnpublished.
     */
    boolean getIncludeUnpublished();
  }
  /**
   * Protobuf type {@code CPartnerStoreBrowse_GetItems_Request}
   */
  public static final class CPartnerStoreBrowse_GetItems_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CPartnerStoreBrowse_GetItems_Request)
      CPartnerStoreBrowse_GetItems_RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CPartnerStoreBrowse_GetItems_Request.newBuilder() to construct.
    private CPartnerStoreBrowse_GetItems_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CPartnerStoreBrowse_GetItems_Request() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CPartnerStoreBrowse_GetItems_Request();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServicePartnerstorebrowse.internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServicePartnerstorebrowse.internal_static_CPartnerStoreBrowse_GetItems_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.class, ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.Builder.class);
    }

    private int bitField0_;
    public static final int REQUEST_FIELD_NUMBER = 1;
    private Common.CStoreBrowse_GetItems_Request request_;
    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     * @return Whether the request field is set.
     */
    @java.lang.Override
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     * @return The request.
     */
    @java.lang.Override
    public Common.CStoreBrowse_GetItems_Request getRequest() {
      return request_ == null ? Common.CStoreBrowse_GetItems_Request.getDefaultInstance() : request_;
    }
    /**
     * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
     */
    @java.lang.Override
    public Common.CStoreBrowse_GetItems_RequestOrBuilder getRequestOrBuilder() {
      return request_ == null ? Common.CStoreBrowse_GetItems_Request.getDefaultInstance() : request_;
    }

    public static final int INCLUDE_UNPUBLISHED_FIELD_NUMBER = 2;
    private boolean includeUnpublished_ = false;
    /**
     * <code>optional bool include_unpublished = 2;</code>
     * @return Whether the includeUnpublished field is set.
     */
    @java.lang.Override
    public boolean hasIncludeUnpublished() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool include_unpublished = 2;</code>
     * @return The includeUnpublished.
     */
    @java.lang.Override
    public boolean getIncludeUnpublished() {
      return includeUnpublished_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getRequest());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, includeUnpublished_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRequest());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, includeUnpublished_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request)) {
        return super.equals(obj);
      }
      ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request other = (ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request) obj;

      if (hasRequest() != other.hasRequest()) return false;
      if (hasRequest()) {
        if (!getRequest()
            .equals(other.getRequest())) return false;
      }
      if (hasIncludeUnpublished() != other.hasIncludeUnpublished()) return false;
      if (hasIncludeUnpublished()) {
        if (getIncludeUnpublished()
            != other.getIncludeUnpublished()) return false;
      }
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
      if (hasRequest()) {
        hash = (37 * hash) + REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getRequest().hashCode();
      }
      if (hasIncludeUnpublished()) {
        hash = (37 * hash) + INCLUDE_UNPUBLISHED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIncludeUnpublished());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request parseFrom(
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
    public static Builder newBuilder(ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request prototype) {
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
     * Protobuf type {@code CPartnerStoreBrowse_GetItems_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CPartnerStoreBrowse_GetItems_Request)
        ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServicePartnerstorebrowse.internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServicePartnerstorebrowse.internal_static_CPartnerStoreBrowse_GetItems_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.class, ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.Builder.class);
      }

      // Construct using ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.newBuilder()
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
          getRequestFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        request_ = null;
        if (requestBuilder_ != null) {
          requestBuilder_.dispose();
          requestBuilder_ = null;
        }
        includeUnpublished_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServicePartnerstorebrowse.internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor;
      }

      @java.lang.Override
      public ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request getDefaultInstanceForType() {
        return ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.getDefaultInstance();
      }

      @java.lang.Override
      public ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request build() {
        ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request buildPartial() {
        ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request result = new ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.request_ = requestBuilder_ == null
              ? request_
              : requestBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.includeUnpublished_ = includeUnpublished_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request) {
          return mergeFrom((ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request other) {
        if (other == ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request.getDefaultInstance()) return this;
        if (other.hasRequest()) {
          mergeRequest(other.getRequest());
        }
        if (other.hasIncludeUnpublished()) {
          setIncludeUnpublished(other.getIncludeUnpublished());
        }
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
              case 10: {
                input.readMessage(
                    getRequestFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                includeUnpublished_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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
      private int bitField0_;

      private Common.CStoreBrowse_GetItems_Request request_;
      private com.google.protobuf.SingleFieldBuilderV3<
          Common.CStoreBrowse_GetItems_Request, Common.CStoreBrowse_GetItems_Request.Builder, Common.CStoreBrowse_GetItems_RequestOrBuilder> requestBuilder_;
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       * @return Whether the request field is set.
       */
      public boolean hasRequest() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       * @return The request.
       */
      public Common.CStoreBrowse_GetItems_Request getRequest() {
        if (requestBuilder_ == null) {
          return request_ == null ? Common.CStoreBrowse_GetItems_Request.getDefaultInstance() : request_;
        } else {
          return requestBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Builder setRequest(Common.CStoreBrowse_GetItems_Request value) {
        if (requestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          request_ = value;
        } else {
          requestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Builder setRequest(
          Common.CStoreBrowse_GetItems_Request.Builder builderForValue) {
        if (requestBuilder_ == null) {
          request_ = builderForValue.build();
        } else {
          requestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Builder mergeRequest(Common.CStoreBrowse_GetItems_Request value) {
        if (requestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            request_ != null &&
            request_ != Common.CStoreBrowse_GetItems_Request.getDefaultInstance()) {
            getRequestBuilder().mergeFrom(value);
          } else {
            request_ = value;
          }
        } else {
          requestBuilder_.mergeFrom(value);
        }
        if (request_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Builder clearRequest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        request_ = null;
        if (requestBuilder_ != null) {
          requestBuilder_.dispose();
          requestBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Common.CStoreBrowse_GetItems_Request.Builder getRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      public Common.CStoreBrowse_GetItems_RequestOrBuilder getRequestOrBuilder() {
        if (requestBuilder_ != null) {
          return requestBuilder_.getMessageOrBuilder();
        } else {
          return request_ == null ?
              Common.CStoreBrowse_GetItems_Request.getDefaultInstance() : request_;
        }
      }
      /**
       * <code>optional .CStoreBrowse_GetItems_Request request = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Common.CStoreBrowse_GetItems_Request, Common.CStoreBrowse_GetItems_Request.Builder, Common.CStoreBrowse_GetItems_RequestOrBuilder> 
          getRequestFieldBuilder() {
        if (requestBuilder_ == null) {
          requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Common.CStoreBrowse_GetItems_Request, Common.CStoreBrowse_GetItems_Request.Builder, Common.CStoreBrowse_GetItems_RequestOrBuilder>(
                  getRequest(),
                  getParentForChildren(),
                  isClean());
          request_ = null;
        }
        return requestBuilder_;
      }

      private boolean includeUnpublished_ ;
      /**
       * <code>optional bool include_unpublished = 2;</code>
       * @return Whether the includeUnpublished field is set.
       */
      @java.lang.Override
      public boolean hasIncludeUnpublished() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool include_unpublished = 2;</code>
       * @return The includeUnpublished.
       */
      @java.lang.Override
      public boolean getIncludeUnpublished() {
        return includeUnpublished_;
      }
      /**
       * <code>optional bool include_unpublished = 2;</code>
       * @param value The includeUnpublished to set.
       * @return This builder for chaining.
       */
      public Builder setIncludeUnpublished(boolean value) {

        includeUnpublished_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool include_unpublished = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIncludeUnpublished() {
        bitField0_ = (bitField0_ & ~0x00000002);
        includeUnpublished_ = false;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:CPartnerStoreBrowse_GetItems_Request)
    }

    // @@protoc_insertion_point(class_scope:CPartnerStoreBrowse_GetItems_Request)
    private static final ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request();
    }

    public static ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CPartnerStoreBrowse_GetItems_Request>
        PARSER = new com.google.protobuf.AbstractParser<CPartnerStoreBrowse_GetItems_Request>() {
      @java.lang.Override
      public CPartnerStoreBrowse_GetItems_Request parsePartialFrom(
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

    public static com.google.protobuf.Parser<CPartnerStoreBrowse_GetItems_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CPartnerStoreBrowse_GetItems_Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServicePartnerstorebrowse.CPartnerStoreBrowse_GetItems_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CPartnerStoreBrowse_GetItems_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&webui/service_partnerstorebrowse.proto" +
      "\032\022webui/common.proto\"t\n$CPartnerStoreBro" +
      "wse_GetItems_Request\022/\n\007request\030\001 \001(\0132\036." +
      "CStoreBrowse_GetItems_Request\022\033\n\023include" +
      "_unpublished\030\002 \001(\0102h\n\022PartnerStoreBrowse" +
      "\022R\n\010GetItems\022%.CPartnerStoreBrowse_GetIt" +
      "ems_Request\032\037.CStoreBrowse_GetItems_Resp" +
      "onse"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Common.getDescriptor(),
        });
    internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CPartnerStoreBrowse_GetItems_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CPartnerStoreBrowse_GetItems_Request_descriptor,
        new java.lang.String[] { "Request", "IncludeUnpublished", });
    Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
