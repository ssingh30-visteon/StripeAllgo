package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/EphemeralOperation;", "Landroid/os/Parcelable;", "()V", "id", "", "getId$payments_core_debug", "()Ljava/lang/String;", "productUsage", "", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "Customer", "Issuing", "RetrieveKey", "Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "payments-core_debug"})
public abstract class EphemeralOperation implements android.os.Parcelable {
    
    private EphemeralOperation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId$payments_core_debug();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> getProductUsage$payments_core_debug();
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation;", "id", "", "productUsage", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class RetrieveKey extends com.stripe.android.EphemeralOperation {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.RetrieveKey> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.EphemeralOperation.RetrieveKey copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RetrieveKey(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getId$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.RetrieveKey> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.EphemeralOperation.RetrieveKey createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.EphemeralOperation.RetrieveKey[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation;", "()V", "AddSource", "AttachPaymentMethod", "DeleteSource", "DetachPaymentMethod", "GetPaymentMethods", "UpdateDefaultSource", "UpdateShipping", "Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "payments-core_debug"})
    public static abstract class Customer extends com.stripe.android.EphemeralOperation {
        
        private Customer() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0011\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "getSourceId", "getSourceType", "component1", "component2", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class AddSource extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sourceId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sourceType = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.AddSource> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.AddSource copy(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.model.Source.SourceType()
            java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public AddSource(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.model.Source.SourceType()
            java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSourceId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSourceType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component4$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.AddSource> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.AddSource createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.AddSource[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u000e\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "id", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "getSourceId", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class DeleteSource extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sourceId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.DeleteSource> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.DeleteSource copy(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public DeleteSource(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSourceId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.DeleteSource> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.DeleteSource createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.DeleteSource[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u000e\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getPaymentMethodId", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class AttachPaymentMethod extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String paymentMethodId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod copy(@org.jetbrains.annotations.NotNull()
            java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public AttachPaymentMethod(@org.jetbrains.annotations.NotNull()
            java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPaymentMethodId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u000e\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getPaymentMethodId", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class DetachPaymentMethod extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String paymentMethodId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod copy(@org.jetbrains.annotations.NotNull()
            java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public DetachPaymentMethod(@org.jetbrains.annotations.NotNull()
            java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPaymentMethodId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b!J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00c0\u0003\u00a2\u0006\u0002\b#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\t\u0010,\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0007X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "limit", "", "endingBefore", "", "startingAfter", "id", "productUsage", "", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getEndingBefore$payments_core_debug", "()Ljava/lang/String;", "getId$payments_core_debug", "getLimit$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "getStartingAfter$payments_core_debug", "getType$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "copy", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class GetPaymentMethods extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethod.Type type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer limit = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String endingBefore = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String startingAfter = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
            java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
            java.lang.String endingBefore, @org.jetbrains.annotations.Nullable()
            java.lang.String startingAfter, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public GetPaymentMethods(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
            java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
            java.lang.String endingBefore, @org.jetbrains.annotations.Nullable()
            java.lang.String startingAfter, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.Type component1$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.Type getType$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getLimit$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEndingBefore$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStartingAfter$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component5$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component6$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0010\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u0013J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "id", "", "productUsage", "", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class UpdateShipping extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.ShippingInformation shippingInformation = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.UpdateShipping> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.UpdateShipping copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public UpdateShipping(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ShippingInformation component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ShippingInformation getShippingInformation() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.UpdateShipping> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.UpdateShipping createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.UpdateShipping[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0011\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_debug", "()Ljava/lang/String;", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "getSourceId", "getSourceType", "component1", "component2", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class UpdateDefaultSource extends com.stripe.android.EphemeralOperation.Customer {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sourceId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String sourceType = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource copy(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.model.Source.SourceType()
            java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public UpdateDefaultSource(@org.jetbrains.annotations.NotNull()
            java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.model.Source.SourceType()
            java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
            java.lang.String id, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSourceId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSourceType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component4$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\b\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation;", "productUsage", "", "", "(Ljava/util/Set;)V", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "RetrievePin", "UpdatePin", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "payments-core_debug"})
    public static abstract class Issuing extends com.stripe.android.EphemeralOperation {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        
        private Issuing(java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0010\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "verificationId", "userOneTimeCode", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getId$payments_core_debug", "getUserOneTimeCode", "getVerificationId", "component1", "component2", "component3", "component4", "component4$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class RetrievePin extends com.stripe.android.EphemeralOperation.Issuing {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String cardId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String verificationId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String userOneTimeCode = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Issuing.RetrievePin> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Issuing.RetrievePin copy(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId, @org.jetbrains.annotations.NotNull()
            java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
            java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public RetrievePin(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId, @org.jetbrains.annotations.NotNull()
            java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
            java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCardId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getVerificationId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUserOneTimeCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Issuing.RetrievePin> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Issuing.RetrievePin createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Issuing.RetrievePin[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0013\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0014J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "newPin", "verificationId", "userOneTimeCode", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getId$payments_core_debug", "getNewPin", "getUserOneTimeCode", "getVerificationId", "component1", "component2", "component3", "component4", "component5", "component5$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class UpdatePin extends com.stripe.android.EphemeralOperation.Issuing {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String cardId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String newPin = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String verificationId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String userOneTimeCode = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String id = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Issuing.UpdatePin> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.EphemeralOperation.Issuing.UpdatePin copy(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId, @org.jetbrains.annotations.NotNull()
            java.lang.String newPin, @org.jetbrains.annotations.NotNull()
            java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
            java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public UpdatePin(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId, @org.jetbrains.annotations.NotNull()
            java.lang.String newPin, @org.jetbrains.annotations.NotNull()
            java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
            java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCardId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getNewPin() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getVerificationId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUserOneTimeCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component5$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getId$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralOperation.Issuing.UpdatePin> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Issuing.UpdatePin createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.EphemeralOperation.Issuing.UpdatePin[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}