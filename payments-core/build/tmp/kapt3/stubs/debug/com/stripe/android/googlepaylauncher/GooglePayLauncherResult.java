package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00062\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0004\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "Lcom/stripe/android/view/ActivityStarter$Result;", "()V", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Error", "PaymentData", "Unavailable", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "payments-core_debug"})
public abstract class GooglePayLauncherResult implements com.stripe.android.view.ActivityStarter.Result {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Companion Companion = null;
    
    private GooglePayLauncherResult() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.Bundle toBundle() {
        return null;
    }
    
    /**
     * @return the [Result] object from the given `Intent`
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.googlepaylauncher.GooglePayLauncherResult fromIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "exception", "", "googlePayStatus", "Lcom/google/android/gms/common/api/Status;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getException", "()Ljava/lang/Throwable;", "getGooglePayStatus", "()Lcom/google/android/gms/common/api/Status;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Error extends com.stripe.android.googlepaylauncher.GooglePayLauncherResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.gms.common.api.Status googlePayStatus = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.PaymentMethod paymentMethod = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.ShippingInformation shippingInformation = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception, @org.jetbrains.annotations.Nullable()
        com.google.android.gms.common.api.Status googlePayStatus, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ShippingInformation shippingInformation) {
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
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception, @org.jetbrains.annotations.Nullable()
        com.google.android.gms.common.api.Status googlePayStatus, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ShippingInformation shippingInformation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getException() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.gms.common.api.Status component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.gms.common.api.Status getGooglePayStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.ShippingInformation component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.ShippingInformation getShippingInformation() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "payments-core_debug"})
        public static final class Companion implements kotlinx.parcelize.Parceler<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error> {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error create(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel) {
                return null;
            }
            
            @java.lang.Override()
            public void write(@org.jetbrains.annotations.NotNull()
            com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error $this$write, @org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Error[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * See [StripeGooglePayContract.Args]
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class PaymentData extends com.stripe.android.googlepaylauncher.GooglePayLauncherResult {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.PaymentMethod paymentMethod = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.ShippingInformation shippingInformation = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.PaymentData> CREATOR = null;
        
        /**
         * See [StripeGooglePayContract.Args]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.PaymentData copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ShippingInformation shippingInformation) {
            return null;
        }
        
        /**
         * See [StripeGooglePayContract.Args]
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * See [StripeGooglePayContract.Args]
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * See [StripeGooglePayContract.Args]
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PaymentData(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ShippingInformation shippingInformation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.ShippingInformation component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.ShippingInformation getShippingInformation() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.PaymentData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.PaymentData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.PaymentData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Canceled extends com.stripe.android.googlepaylauncher.GooglePayLauncherResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Canceled INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Canceled> CREATOR = null;
        
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Canceled> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Canceled[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Unavailable extends com.stripe.android.googlepaylauncher.GooglePayLauncherResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Unavailable INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Unavailable> CREATOR = null;
        
        private Unavailable() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Unavailable> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Unavailable createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult.Unavailable[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @return the [Result] object from the given `Intent`
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncherResult fromIntent(@org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
            return null;
        }
    }
}