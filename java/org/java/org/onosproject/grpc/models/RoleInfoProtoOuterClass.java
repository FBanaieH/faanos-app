// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoleInfoProto.proto

package org.onosproject.grpc.models;

public final class RoleInfoProtoOuterClass {
  private RoleInfoProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoleInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.RoleInfoProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    boolean hasMaster();
    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getMaster();
    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getMasterOrBuilder();

    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> 
        getBackupsList();
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getBackups(int index);
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    int getBackupsCount();
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    java.util.List<? extends org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> 
        getBackupsOrBuilderList();
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getBackupsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code proto.RoleInfoProto}
   */
  public  static final class RoleInfoProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.RoleInfoProto)
      RoleInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoleInfoProto.newBuilder() to construct.
    private RoleInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoleInfoProto() {
      backups_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoleInfoProto(
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
              org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder subBuilder = null;
              if (master_ != null) {
                subBuilder = master_.toBuilder();
              }
              master_ = input.readMessage(org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(master_);
                master_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                backups_ = new java.util.ArrayList<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              backups_.add(
                  input.readMessage(org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          backups_ = java.util.Collections.unmodifiableList(backups_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.onosproject.grpc.models.RoleInfoProtoOuterClass.internal_static_proto_RoleInfoProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.RoleInfoProtoOuterClass.internal_static_proto_RoleInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.class, org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int MASTER_FIELD_NUMBER = 1;
    private org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto master_;
    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    public boolean hasMaster() {
      return master_ != null;
    }
    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getMaster() {
      return master_ == null ? org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.getDefaultInstance() : master_;
    }
    /**
     * <code>.proto.NodeIdProto master = 1;</code>
     */
    public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getMasterOrBuilder() {
      return getMaster();
    }

    public static final int BACKUPS_FIELD_NUMBER = 2;
    private java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> backups_;
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    public java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> getBackupsList() {
      return backups_;
    }
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    public java.util.List<? extends org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> 
        getBackupsOrBuilderList() {
      return backups_;
    }
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    public int getBackupsCount() {
      return backups_.size();
    }
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getBackups(int index) {
      return backups_.get(index);
    }
    /**
     * <code>repeated .proto.NodeIdProto backups = 2;</code>
     */
    public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getBackupsOrBuilder(
        int index) {
      return backups_.get(index);
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
      if (master_ != null) {
        output.writeMessage(1, getMaster());
      }
      for (int i = 0; i < backups_.size(); i++) {
        output.writeMessage(2, backups_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (master_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMaster());
      }
      for (int i = 0; i < backups_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, backups_.get(i));
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
      if (!(obj instanceof org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto other = (org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto) obj;

      boolean result = true;
      result = result && (hasMaster() == other.hasMaster());
      if (hasMaster()) {
        result = result && getMaster()
            .equals(other.getMaster());
      }
      result = result && getBackupsList()
          .equals(other.getBackupsList());
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
      if (hasMaster()) {
        hash = (37 * hash) + MASTER_FIELD_NUMBER;
        hash = (53 * hash) + getMaster().hashCode();
      }
      if (getBackupsCount() > 0) {
        hash = (37 * hash) + BACKUPS_FIELD_NUMBER;
        hash = (53 * hash) + getBackupsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto prototype) {
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
     * Protobuf type {@code proto.RoleInfoProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.RoleInfoProto)
        org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.RoleInfoProtoOuterClass.internal_static_proto_RoleInfoProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.RoleInfoProtoOuterClass.internal_static_proto_RoleInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.class, org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.newBuilder()
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
          getBackupsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (masterBuilder_ == null) {
          master_ = null;
        } else {
          master_ = null;
          masterBuilder_ = null;
        }
        if (backupsBuilder_ == null) {
          backups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          backupsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.RoleInfoProtoOuterClass.internal_static_proto_RoleInfoProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto build() {
        org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto buildPartial() {
        org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto result = new org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (masterBuilder_ == null) {
          result.master_ = master_;
        } else {
          result.master_ = masterBuilder_.build();
        }
        if (backupsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            backups_ = java.util.Collections.unmodifiableList(backups_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.backups_ = backups_;
        } else {
          result.backups_ = backupsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto) {
          return mergeFrom((org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto other) {
        if (other == org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto.getDefaultInstance()) return this;
        if (other.hasMaster()) {
          mergeMaster(other.getMaster());
        }
        if (backupsBuilder_ == null) {
          if (!other.backups_.isEmpty()) {
            if (backups_.isEmpty()) {
              backups_ = other.backups_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureBackupsIsMutable();
              backups_.addAll(other.backups_);
            }
            onChanged();
          }
        } else {
          if (!other.backups_.isEmpty()) {
            if (backupsBuilder_.isEmpty()) {
              backupsBuilder_.dispose();
              backupsBuilder_ = null;
              backups_ = other.backups_;
              bitField0_ = (bitField0_ & ~0x00000002);
              backupsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBackupsFieldBuilder() : null;
            } else {
              backupsBuilder_.addAllMessages(other.backups_);
            }
          }
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
        org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto master_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> masterBuilder_;
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public boolean hasMaster() {
        return masterBuilder_ != null || master_ != null;
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getMaster() {
        if (masterBuilder_ == null) {
          return master_ == null ? org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.getDefaultInstance() : master_;
        } else {
          return masterBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public Builder setMaster(org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto value) {
        if (masterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          master_ = value;
          onChanged();
        } else {
          masterBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public Builder setMaster(
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder builderForValue) {
        if (masterBuilder_ == null) {
          master_ = builderForValue.build();
          onChanged();
        } else {
          masterBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public Builder mergeMaster(org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto value) {
        if (masterBuilder_ == null) {
          if (master_ != null) {
            master_ =
              org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.newBuilder(master_).mergeFrom(value).buildPartial();
          } else {
            master_ = value;
          }
          onChanged();
        } else {
          masterBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public Builder clearMaster() {
        if (masterBuilder_ == null) {
          master_ = null;
          onChanged();
        } else {
          master_ = null;
          masterBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder getMasterBuilder() {
        
        onChanged();
        return getMasterFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getMasterOrBuilder() {
        if (masterBuilder_ != null) {
          return masterBuilder_.getMessageOrBuilder();
        } else {
          return master_ == null ?
              org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.getDefaultInstance() : master_;
        }
      }
      /**
       * <code>.proto.NodeIdProto master = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> 
          getMasterFieldBuilder() {
        if (masterBuilder_ == null) {
          masterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder>(
                  getMaster(),
                  getParentForChildren(),
                  isClean());
          master_ = null;
        }
        return masterBuilder_;
      }

      private java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> backups_ =
        java.util.Collections.emptyList();
      private void ensureBackupsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          backups_ = new java.util.ArrayList<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto>(backups_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> backupsBuilder_;

      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> getBackupsList() {
        if (backupsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(backups_);
        } else {
          return backupsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public int getBackupsCount() {
        if (backupsBuilder_ == null) {
          return backups_.size();
        } else {
          return backupsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto getBackups(int index) {
        if (backupsBuilder_ == null) {
          return backups_.get(index);
        } else {
          return backupsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder setBackups(
          int index, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto value) {
        if (backupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBackupsIsMutable();
          backups_.set(index, value);
          onChanged();
        } else {
          backupsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder setBackups(
          int index, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder builderForValue) {
        if (backupsBuilder_ == null) {
          ensureBackupsIsMutable();
          backups_.set(index, builderForValue.build());
          onChanged();
        } else {
          backupsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder addBackups(org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto value) {
        if (backupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBackupsIsMutable();
          backups_.add(value);
          onChanged();
        } else {
          backupsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder addBackups(
          int index, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto value) {
        if (backupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBackupsIsMutable();
          backups_.add(index, value);
          onChanged();
        } else {
          backupsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder addBackups(
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder builderForValue) {
        if (backupsBuilder_ == null) {
          ensureBackupsIsMutable();
          backups_.add(builderForValue.build());
          onChanged();
        } else {
          backupsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder addBackups(
          int index, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder builderForValue) {
        if (backupsBuilder_ == null) {
          ensureBackupsIsMutable();
          backups_.add(index, builderForValue.build());
          onChanged();
        } else {
          backupsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder addAllBackups(
          java.lang.Iterable<? extends org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto> values) {
        if (backupsBuilder_ == null) {
          ensureBackupsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, backups_);
          onChanged();
        } else {
          backupsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder clearBackups() {
        if (backupsBuilder_ == null) {
          backups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          backupsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public Builder removeBackups(int index) {
        if (backupsBuilder_ == null) {
          ensureBackupsIsMutable();
          backups_.remove(index);
          onChanged();
        } else {
          backupsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder getBackupsBuilder(
          int index) {
        return getBackupsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder getBackupsOrBuilder(
          int index) {
        if (backupsBuilder_ == null) {
          return backups_.get(index);  } else {
          return backupsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public java.util.List<? extends org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> 
           getBackupsOrBuilderList() {
        if (backupsBuilder_ != null) {
          return backupsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(backups_);
        }
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder addBackupsBuilder() {
        return getBackupsFieldBuilder().addBuilder(
            org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder addBackupsBuilder(
          int index) {
        return getBackupsFieldBuilder().addBuilder(
            index, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.NodeIdProto backups = 2;</code>
       */
      public java.util.List<org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder> 
           getBackupsBuilderList() {
        return getBackupsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder> 
          getBackupsFieldBuilder() {
        if (backupsBuilder_ == null) {
          backupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProto.Builder, org.onosproject.grpc.models.NodeIdProtoOuterClass.NodeIdProtoOrBuilder>(
                  backups_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          backups_ = null;
        }
        return backupsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.RoleInfoProto)
    }

    // @@protoc_insertion_point(class_scope:proto.RoleInfoProto)
    private static final org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto();
    }

    public static org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoleInfoProto>
        PARSER = new com.google.protobuf.AbstractParser<RoleInfoProto>() {
      @java.lang.Override
      public RoleInfoProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoleInfoProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoleInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoleInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.RoleInfoProtoOuterClass.RoleInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RoleInfoProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RoleInfoProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RoleInfoProto.proto\022\005proto\032\021NodeIdProt" +
      "o.proto\"X\n\rRoleInfoProto\022\"\n\006master\030\001 \001(\013" +
      "2\022.proto.NodeIdProto\022#\n\007backups\030\002 \003(\0132\022." +
      "proto.NodeIdProtoB\035\n\033org.onosproject.grp" +
      "c.modelsb\006proto3"
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
          org.onosproject.grpc.models.NodeIdProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_proto_RoleInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_RoleInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RoleInfoProto_descriptor,
        new java.lang.String[] { "Master", "Backups", });
    org.onosproject.grpc.models.NodeIdProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}