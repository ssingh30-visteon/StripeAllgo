package com.stripe.android.paymentsheet.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B,\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u001c\u0010\b\u001a\u00020\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/address/FieldType;", "", "serializedValue", "", "identifierSpec", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "defaultLabel", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;II)V", "getCapitalization-IUNYP9k", "()I", "I", "getDefaultLabel", "getIdentifierSpec", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getSerializedValue", "()Ljava/lang/String;", "AddressLine1", "AddressLine2", "Locality", "PostalCode", "AdministrativeArea", "Name", "Companion", "paymentsheet_debug"})
@kotlinx.serialization.Serializable(with = com.stripe.android.paymentsheet.address.FieldTypeAsStringSerializer.class)
public enum FieldType {
    /*public static final*/ AddressLine1 /* = new AddressLine1(null, null, 0, 0) */,
    /*public static final*/ AddressLine2 /* = new AddressLine2(null, null, 0, 0) */,
    /*public static final*/ Locality /* = new Locality(null, null, 0, 0) */,
    /*public static final*/ PostalCode /* = new PostalCode(null, null, 0, 0) */,
    /*public static final*/ AdministrativeArea /* = new AdministrativeArea(null, null, 0, 0) */,
    /*public static final*/ Name /* = new Name(null, null, 0, 0) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serializedValue = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifierSpec = null;
    private final int defaultLabel = 0;
    private final int capitalization = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.address.FieldType.Companion Companion = null;
    
    FieldType(java.lang.String serializedValue, com.stripe.android.paymentsheet.elements.IdentifierSpec identifierSpec, @androidx.annotation.StringRes()
    int defaultLabel, int capitalization) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSerializedValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifierSpec() {
        return null;
    }
    
    public final int getDefaultLabel() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u00c6\u0001\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/address/FieldType$Companion;", "", "()V", "from", "Lcom/stripe/android/paymentsheet/address/FieldType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.stripe.android.paymentsheet.address.FieldType> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.address.FieldType from(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
    }
}