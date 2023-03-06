package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "activity", "Landroid/app/Activity;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "(Landroid/app/Activity;Lcom/stripe/android/PaymentSessionConfig;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "Args", "Companion", "payments-core_debug"})
public final class PaymentFlowActivityStarter extends com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentFlowActivity, com.stripe.android.view.PaymentFlowActivityStarter.Args> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentFlowActivityStarter.Companion Companion = null;
    public static final int REQUEST_CODE = 6002;
    
    public PaymentFlowActivityStarter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config) {
        super(null, null, 0, null);
    }
    
    public PaymentFlowActivityStarter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config) {
        super(null, null, 0, null);
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c0\u0003\u00a2\u0006\u0004\b\u001b\u0010\u0012J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "isPaymentSessionActive", "", "windowFlags", "", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)V", "isPaymentSessionActive$payments_core_debug", "()Z", "getPaymentSessionConfig$payments_core_debug", "()Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionData$payments_core_debug", "()Lcom/stripe/android/PaymentSessionData;", "getWindowFlags$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "copy", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.PaymentSessionConfig paymentSessionConfig = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.PaymentSessionData paymentSessionData = null;
        private final boolean isPaymentSessionActive = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer windowFlags = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.PaymentFlowActivityStarter.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.PaymentFlowActivityStarter.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.PaymentFlowActivityStarter.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionConfig paymentSessionConfig, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionData paymentSessionData, boolean isPaymentSessionActive, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags) {
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
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionConfig paymentSessionConfig, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionData paymentSessionData, boolean isPaymentSessionActive, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig getPaymentSessionConfig$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionData component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionData getPaymentSessionData$payments_core_debug() {
            return null;
        }
        
        public final boolean component3$payments_core_debug() {
            return false;
        }
        
        public final boolean isPaymentSessionActive$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWindowFlags$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.stripe.android.view.PaymentFlowActivityStarter.Args create(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.PaymentFlowActivityStarter.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "()V", "isPaymentSessionActive", "", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "windowFlags", "", "Ljava/lang/Integer;", "build", "setIsPaymentSessionActive", "setPaymentSessionConfig", "setPaymentSessionData", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.view.PaymentFlowActivityStarter.Args> {
            private com.stripe.android.PaymentSessionConfig paymentSessionConfig;
            private com.stripe.android.PaymentSessionData paymentSessionData;
            private boolean isPaymentSessionActive = false;
            private java.lang.Integer windowFlags;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args.Builder setPaymentSessionConfig(@org.jetbrains.annotations.Nullable()
            com.stripe.android.PaymentSessionConfig paymentSessionConfig) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args.Builder setPaymentSessionData(@org.jetbrains.annotations.Nullable()
            com.stripe.android.PaymentSessionData paymentSessionData) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args.Builder setIsPaymentSessionActive(boolean isPaymentSessionActive) {
                return null;
            }
            
            /**
             * @param windowFlags optional flags to set on the `Window` object of Stripe Activities
             *
             * See [WindowManager.LayoutParams](https://developer.android.com/reference/android/view/WindowManager.LayoutParams)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args.Builder setWindowFlags(@org.jetbrains.annotations.Nullable()
            java.lang.Integer windowFlags) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.view.PaymentFlowActivityStarter.Args build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.view.PaymentFlowActivityStarter.Args create(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Companion;", "", "()V", "REQUEST_CODE", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}