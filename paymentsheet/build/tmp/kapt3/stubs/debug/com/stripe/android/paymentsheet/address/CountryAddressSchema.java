package com.stripe.android.paymentsheet.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u00c7\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/address/CountryAddressSchema;", "", "seen1", "", "type", "Lcom/stripe/android/paymentsheet/address/FieldType;", "required", "", "schema", "Lcom/stripe/android/paymentsheet/address/FieldSchema;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/paymentsheet/address/FieldType;ZLcom/stripe/android/paymentsheet/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/stripe/android/paymentsheet/address/FieldType;ZLcom/stripe/android/paymentsheet/address/FieldSchema;)V", "getRequired", "()Z", "getSchema", "()Lcom/stripe/android/paymentsheet/address/FieldSchema;", "getType", "()Lcom/stripe/android/paymentsheet/address/FieldType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "paymentsheet_debug"})
@kotlinx.serialization.Serializable()
public final class CountryAddressSchema {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.address.CountryAddressSchema.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.address.FieldType type = null;
    private final boolean required = false;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.address.FieldSchema schema = null;
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.address.CountryAddressSchema self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public CountryAddressSchema(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.address.FieldType type, boolean required, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.address.FieldSchema schema) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.address.FieldType getType() {
        return null;
    }
    
    public final boolean getRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.address.FieldSchema getSchema() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/address/CountryAddressSchema$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/paymentsheet/address/CountryAddressSchema;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.stripe.android.paymentsheet.address.CountryAddressSchema> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/stripe/android/paymentsheet/address/CountryAddressSchema.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/paymentsheet/address/CountryAddressSchema;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "paymentsheet_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.stripe.android.paymentsheet.address.CountryAddressSchema> {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.address.CountryAddressSchema.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.paymentsheet.address.CountryAddressSchema deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.address.CountryAddressSchema value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}