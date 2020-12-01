// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shema/weather.proto

package classes.dto;

public final class WeatherDTO {
  private WeatherDTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeatherProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.WeatherProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string data = 1;</code>
     * @return Whether the data field is set.
     */
    boolean hasData();
    /**
     * <code>required string data = 1;</code>
     * @return The data.
     */
    java.lang.String getData();
    /**
     * <code>required string data = 1;</code>
     * @return The bytes for data.
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <code>required float temperature = 2;</code>
     * @return Whether the temperature field is set.
     */
    boolean hasTemperature();
    /**
     * <code>required float temperature = 2;</code>
     * @return The temperature.
     */
    float getTemperature();
  }
  /**
   * Protobuf type {@code proto.WeatherProto}
   */
  public static final class WeatherProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.WeatherProto)
      WeatherProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeatherProto.newBuilder() to construct.
    private WeatherProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeatherProto() {
      data_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeatherProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WeatherProto(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              data_ = bs;
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              temperature_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return classes.dto.WeatherDTO.internal_static_proto_WeatherProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return classes.dto.WeatherDTO.internal_static_proto_WeatherProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              classes.dto.WeatherDTO.WeatherProto.class, classes.dto.WeatherDTO.WeatherProto.Builder.class);
    }

    private int bitField0_;
    public static final int DATA_FIELD_NUMBER = 1;
    private volatile java.lang.Object data_;
    /**
     * <code>required string data = 1;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string data = 1;</code>
     * @return The bytes for data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEMPERATURE_FIELD_NUMBER = 2;
    private float temperature_;
    /**
     * <code>required float temperature = 2;</code>
     * @return Whether the temperature field is set.
     */
    @java.lang.Override
    public boolean hasTemperature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required float temperature = 2;</code>
     * @return The temperature.
     */
    @java.lang.Override
    public float getTemperature() {
      return temperature_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTemperature()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, data_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeFloat(2, temperature_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, data_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, temperature_);
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
      if (!(obj instanceof classes.dto.WeatherDTO.WeatherProto)) {
        return super.equals(obj);
      }
      classes.dto.WeatherDTO.WeatherProto other = (classes.dto.WeatherDTO.WeatherProto) obj;

      if (hasData() != other.hasData()) return false;
      if (hasData()) {
        if (!getData()
            .equals(other.getData())) return false;
      }
      if (hasTemperature() != other.hasTemperature()) return false;
      if (hasTemperature()) {
        if (java.lang.Float.floatToIntBits(getTemperature())
            != java.lang.Float.floatToIntBits(
                other.getTemperature())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      if (hasTemperature()) {
        hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getTemperature());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static classes.dto.WeatherDTO.WeatherProto parseFrom(
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
    public static Builder newBuilder(classes.dto.WeatherDTO.WeatherProto prototype) {
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
     * Protobuf type {@code proto.WeatherProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.WeatherProto)
        classes.dto.WeatherDTO.WeatherProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return classes.dto.WeatherDTO.internal_static_proto_WeatherProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return classes.dto.WeatherDTO.internal_static_proto_WeatherProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                classes.dto.WeatherDTO.WeatherProto.class, classes.dto.WeatherDTO.WeatherProto.Builder.class);
      }

      // Construct using classes.dto.WeatherDTO.WeatherProto.newBuilder()
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
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        temperature_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return classes.dto.WeatherDTO.internal_static_proto_WeatherProto_descriptor;
      }

      @java.lang.Override
      public classes.dto.WeatherDTO.WeatherProto getDefaultInstanceForType() {
        return classes.dto.WeatherDTO.WeatherProto.getDefaultInstance();
      }

      @java.lang.Override
      public classes.dto.WeatherDTO.WeatherProto build() {
        classes.dto.WeatherDTO.WeatherProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public classes.dto.WeatherDTO.WeatherProto buildPartial() {
        classes.dto.WeatherDTO.WeatherProto result = new classes.dto.WeatherDTO.WeatherProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.temperature_ = temperature_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof classes.dto.WeatherDTO.WeatherProto) {
          return mergeFrom((classes.dto.WeatherDTO.WeatherProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(classes.dto.WeatherDTO.WeatherProto other) {
        if (other == classes.dto.WeatherDTO.WeatherProto.getDefaultInstance()) return this;
        if (other.hasData()) {
          bitField0_ |= 0x00000001;
          data_ = other.data_;
          onChanged();
        }
        if (other.hasTemperature()) {
          setTemperature(other.getTemperature());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasData()) {
          return false;
        }
        if (!hasTemperature()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        classes.dto.WeatherDTO.WeatherProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (classes.dto.WeatherDTO.WeatherProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object data_ = "";
      /**
       * <code>required string data = 1;</code>
       * @return Whether the data field is set.
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string data = 1;</code>
       * @return The data.
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string data = 1;</code>
       * @return The bytes for data.
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string data = 1;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 1;</code>
       * @param value The bytes for data to set.
       * @return This builder for chaining.
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }

      private float temperature_ ;
      /**
       * <code>required float temperature = 2;</code>
       * @return Whether the temperature field is set.
       */
      @java.lang.Override
      public boolean hasTemperature() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required float temperature = 2;</code>
       * @return The temperature.
       */
      @java.lang.Override
      public float getTemperature() {
        return temperature_;
      }
      /**
       * <code>required float temperature = 2;</code>
       * @param value The temperature to set.
       * @return This builder for chaining.
       */
      public Builder setTemperature(float value) {
        bitField0_ |= 0x00000002;
        temperature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float temperature = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemperature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        temperature_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:proto.WeatherProto)
    }

    // @@protoc_insertion_point(class_scope:proto.WeatherProto)
    private static final classes.dto.WeatherDTO.WeatherProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new classes.dto.WeatherDTO.WeatherProto();
    }

    public static classes.dto.WeatherDTO.WeatherProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<WeatherProto>
        PARSER = new com.google.protobuf.AbstractParser<WeatherProto>() {
      @java.lang.Override
      public WeatherProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WeatherProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WeatherProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeatherProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public classes.dto.WeatherDTO.WeatherProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_WeatherProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_WeatherProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023shema/weather.proto\022\005proto\"1\n\014WeatherP" +
      "roto\022\014\n\004data\030\001 \002(\t\022\023\n\013temperature\030\002 \002(\002B" +
      "\031\n\013classes.dtoB\nWeatherDTO"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_WeatherProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_WeatherProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_WeatherProto_descriptor,
        new java.lang.String[] { "Data", "Temperature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
