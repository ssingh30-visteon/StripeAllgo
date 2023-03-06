package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * Result to be passed to the callback of [PaymentLauncher]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "Landroid/os/Parcelable;", "()V", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Completed", "Failed", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;", "payments-core_debug"})
public abstract class PaymentResult implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.paymentlauncher.PaymentResult.Companion Companion = null;
    private static final java.lang.String EXTRA = "extra_args";
    
    private PaymentResult() {
        super();
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Completed extends com.stripe.android.payments.paymentlauncher.PaymentResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.payments.paymentlauncher.PaymentResult.Completed INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Completed> CREATOR = null;
        
        private Completed() {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Completed> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Completed createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Completed[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Failed extends com.stripe.android.payments.paymentlauncher.PaymentResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Failed> CREATOR = null;
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Failed> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Failed createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Failed[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Canceled extends com.stripe.android.payments.paymentlauncher.PaymentResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.payments.paymentlauncher.PaymentResult.Canceled INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Canceled> CREATOR = null;
        
        private Canceled() {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentResult.Canceled> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.paymentlauncher.PaymentResult.Canceled[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;", "", "()V", "EXTRA", "", "fromIntent", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}