package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0004H\u00c2\u0003J\u000e\u0010\u0010\u001a\u00020\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c2\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001fH\u0016J\t\u0010 \u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u00d6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "customerId", "", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "limit", "", "endingBefore", "startingAfter", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getPaymentMethodType$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component2$payments_core_debug", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ListPaymentMethodsParams;", "describeContents", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class ListPaymentMethodsParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    private final java.lang.String customerId = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.PaymentMethod.Type paymentMethodType = null;
    private final java.lang.Integer limit = null;
    private final java.lang.String endingBefore = null;
    private final java.lang.String startingAfter = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.ListPaymentMethodsParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CUSTOMER = "customer";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_TYPE = "type";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LIMIT = "limit";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ENDING_BEFORE = "ending_before";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_STARTING_AFTER = "starting_after";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.ListPaymentMethodsParams> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.ListPaymentMethodsParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    java.lang.String endingBefore, @org.jetbrains.annotations.Nullable()
    java.lang.String startingAfter) {
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
    
    public ListPaymentMethodsParams(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    java.lang.String endingBefore, @org.jetbrains.annotations.Nullable()
    java.lang.String startingAfter) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod.Type component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod.Type getPaymentMethodType$payments_core_debug() {
        return null;
    }
    
    private final java.lang.Integer component3() {
        return null;
    }
    
    private final java.lang.String component4() {
        return null;
    }
    
    private final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.ListPaymentMethodsParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ListPaymentMethodsParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ListPaymentMethodsParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams$Companion;", "", "()V", "PARAM_CUSTOMER", "", "PARAM_ENDING_BEFORE", "PARAM_LIMIT", "PARAM_STARTING_AFTER", "PARAM_TYPE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}