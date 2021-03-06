// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/test/resources/integration-test/IntegrationTestJavaSe.proto

package net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase;

public final class IntegrationTestObjectProto {
  private IntegrationTestObjectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class IntegrationTestObject extends
      com.google.protobuf.GeneratedMessage {
    // Use IntegrationTestObject.newBuilder() to construct.
    private IntegrationTestObject() {
      initFields();
    }
    private IntegrationTestObject(boolean noInit) {}
    
    private static final IntegrationTestObject defaultInstance;
    public static IntegrationTestObject getDefaultInstance() {
      return defaultInstance;
    }
    
    public IntegrationTestObject getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_fieldAccessorTable;
    }
    
    // required int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private boolean hasId;
    private int id_ = 0;
    public boolean hasId() { return hasId; }
    public int getId() { return id_; }
    
    // required int64 longNumber = 2;
    public static final int LONGNUMBER_FIELD_NUMBER = 2;
    private boolean hasLongNumber;
    private long longNumber_ = 0L;
    public boolean hasLongNumber() { return hasLongNumber; }
    public long getLongNumber() { return longNumber_; }
    
    // repeated string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.util.List<java.lang.String> name_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.String> getNameList() {
      return name_;
    }
    public int getNameCount() { return name_.size(); }
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    
    // required bytes bytesObject = 4;
    public static final int BYTESOBJECT_FIELD_NUMBER = 4;
    private boolean hasBytesObject;
    private com.google.protobuf.ByteString bytesObject_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasBytesObject() { return hasBytesObject; }
    public com.google.protobuf.ByteString getBytesObject() { return bytesObject_; }
    
    // required float floatObject = 5;
    public static final int FLOATOBJECT_FIELD_NUMBER = 5;
    private boolean hasFloatObject;
    private float floatObject_ = 0F;
    public boolean hasFloatObject() { return hasFloatObject; }
    public float getFloatObject() { return floatObject_; }
    
    // optional bool boolObj = 6;
    public static final int BOOLOBJ_FIELD_NUMBER = 6;
    private boolean hasBoolObj;
    private boolean boolObj_ = false;
    public boolean hasBoolObj() { return hasBoolObj; }
    public boolean getBoolObj() { return boolObj_; }
    
    // required double amount = 7;
    public static final int AMOUNT_FIELD_NUMBER = 7;
    private boolean hasAmount;
    private double amount_ = 0D;
    public boolean hasAmount() { return hasAmount; }
    public double getAmount() { return amount_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasId) return false;
      if (!hasLongNumber) return false;
      if (!hasBytesObject) return false;
      if (!hasFloatObject) return false;
      if (!hasAmount) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasId()) {
        output.writeInt32(1, getId());
      }
      if (hasLongNumber()) {
        output.writeInt64(2, getLongNumber());
      }
      for (java.lang.String element : getNameList()) {
        output.writeString(3, element);
      }
      if (hasBytesObject()) {
        output.writeBytes(4, getBytesObject());
      }
      if (hasFloatObject()) {
        output.writeFloat(5, getFloatObject());
      }
      if (hasBoolObj()) {
        output.writeBool(6, getBoolObj());
      }
      if (hasAmount()) {
        output.writeDouble(7, getAmount());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getId());
      }
      if (hasLongNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getLongNumber());
      }
      {
        int dataSize = 0;
        for (java.lang.String element : getNameList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getNameList().size();
      }
      if (hasBytesObject()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getBytesObject());
      }
      if (hasFloatObject()) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, getFloatObject());
      }
      if (hasBoolObj()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, getBoolObj());
      }
      if (hasAmount()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(7, getAmount());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject result;
      
      // Construct using net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject();
        return builder;
      }
      
      protected net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.getDescriptor();
      }
      
      public net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject getDefaultInstanceForType() {
        return net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.name_ != java.util.Collections.EMPTY_LIST) {
          result.name_ =
            java.util.Collections.unmodifiableList(result.name_);
        }
        net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject) {
          return mergeFrom((net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject other) {
        if (other == net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLongNumber()) {
          setLongNumber(other.getLongNumber());
        }
        if (!other.name_.isEmpty()) {
          if (result.name_.isEmpty()) {
            result.name_ = new java.util.ArrayList<java.lang.String>();
          }
          result.name_.addAll(other.name_);
        }
        if (other.hasBytesObject()) {
          setBytesObject(other.getBytesObject());
        }
        if (other.hasFloatObject()) {
          setFloatObject(other.getFloatObject());
        }
        if (other.hasBoolObj()) {
          setBoolObj(other.getBoolObj());
        }
        if (other.hasAmount()) {
          setAmount(other.getAmount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setId(input.readInt32());
              break;
            }
            case 16: {
              setLongNumber(input.readInt64());
              break;
            }
            case 26: {
              addName(input.readString());
              break;
            }
            case 34: {
              setBytesObject(input.readBytes());
              break;
            }
            case 45: {
              setFloatObject(input.readFloat());
              break;
            }
            case 48: {
              setBoolObj(input.readBool());
              break;
            }
            case 57: {
              setAmount(input.readDouble());
              break;
            }
          }
        }
      }
      
      
      // required int32 id = 1;
      public boolean hasId() {
        return result.hasId();
      }
      public int getId() {
        return result.getId();
      }
      public Builder setId(int value) {
        result.hasId = true;
        result.id_ = value;
        return this;
      }
      public Builder clearId() {
        result.hasId = false;
        result.id_ = 0;
        return this;
      }
      
      // required int64 longNumber = 2;
      public boolean hasLongNumber() {
        return result.hasLongNumber();
      }
      public long getLongNumber() {
        return result.getLongNumber();
      }
      public Builder setLongNumber(long value) {
        result.hasLongNumber = true;
        result.longNumber_ = value;
        return this;
      }
      public Builder clearLongNumber() {
        result.hasLongNumber = false;
        result.longNumber_ = 0L;
        return this;
      }
      
      // repeated string name = 3;
      public java.util.List<java.lang.String> getNameList() {
        return java.util.Collections.unmodifiableList(result.name_);
      }
      public int getNameCount() {
        return result.getNameCount();
      }
      public java.lang.String getName(int index) {
        return result.getName(index);
      }
      public Builder setName(int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.name_.set(index, value);
        return this;
      }
      public Builder addName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.name_.isEmpty()) {
          result.name_ = new java.util.ArrayList<java.lang.String>();
        }
        result.name_.add(value);
        return this;
      }
      public Builder addAllName(
          java.lang.Iterable<? extends java.lang.String> values) {
        if (result.name_.isEmpty()) {
          result.name_ = new java.util.ArrayList<java.lang.String>();
        }
        super.addAll(values, result.name_);
        return this;
      }
      public Builder clearName() {
        result.name_ = java.util.Collections.emptyList();
        return this;
      }
      
      // required bytes bytesObject = 4;
      public boolean hasBytesObject() {
        return result.hasBytesObject();
      }
      public com.google.protobuf.ByteString getBytesObject() {
        return result.getBytesObject();
      }
      public Builder setBytesObject(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasBytesObject = true;
        result.bytesObject_ = value;
        return this;
      }
      public Builder clearBytesObject() {
        result.hasBytesObject = false;
        result.bytesObject_ = getDefaultInstance().getBytesObject();
        return this;
      }
      
      // required float floatObject = 5;
      public boolean hasFloatObject() {
        return result.hasFloatObject();
      }
      public float getFloatObject() {
        return result.getFloatObject();
      }
      public Builder setFloatObject(float value) {
        result.hasFloatObject = true;
        result.floatObject_ = value;
        return this;
      }
      public Builder clearFloatObject() {
        result.hasFloatObject = false;
        result.floatObject_ = 0F;
        return this;
      }
      
      // optional bool boolObj = 6;
      public boolean hasBoolObj() {
        return result.hasBoolObj();
      }
      public boolean getBoolObj() {
        return result.getBoolObj();
      }
      public Builder setBoolObj(boolean value) {
        result.hasBoolObj = true;
        result.boolObj_ = value;
        return this;
      }
      public Builder clearBoolObj() {
        result.hasBoolObj = false;
        result.boolObj_ = false;
        return this;
      }
      
      // required double amount = 7;
      public boolean hasAmount() {
        return result.hasAmount();
      }
      public double getAmount() {
        return result.getAmount();
      }
      public Builder setAmount(double value) {
        result.hasAmount = true;
        result.amount_ = value;
        return this;
      }
      public Builder clearAmount() {
        result.hasAmount = false;
        result.amount_ = 0D;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.jarlehansen.proto2javame.IntegrationTestObject)
    }
    
    static {
      defaultInstance = new IntegrationTestObject(true);
      net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.jarlehansen.proto2javame.IntegrationTestObject)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?src/test/resources/integration-test/In" +
      "tegrationTestJavaSe.proto\022\034net.jarlehans" +
      "en.proto2javame\"\220\001\n\025IntegrationTestObjec" +
      "t\022\n\n\002id\030\001 \002(\005\022\022\n\nlongNumber\030\002 \002(\003\022\014\n\004nam" +
      "e\030\003 \003(\t\022\023\n\013bytesObject\030\004 \002(\014\022\023\n\013floatObj" +
      "ect\030\005 \002(\002\022\017\n\007boolObj\030\006 \001(\010\022\016\n\006amount\030\007 \002" +
      "(\001B`\nBnet.jarlehansen.proto2javame.proto" +
      "buf.integration.tempfiles.javaseB\032Integr" +
      "ationTestObjectProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_jarlehansen_proto2javame_IntegrationTestObject_descriptor,
              new java.lang.String[] { "Id", "LongNumber", "Name", "BytesObject", "FloatObject", "BoolObj", "Amount", },
              net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.class,
              net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javase.IntegrationTestObjectProto.IntegrationTestObject.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
