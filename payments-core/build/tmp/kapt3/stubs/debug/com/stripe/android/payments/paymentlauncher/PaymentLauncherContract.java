package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * [ActivityResultContract] to start [PaymentLauncherConfirmationActivity] and return a [PaymentResult].
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "payments-core_debug"})
public final class PaymentLauncherContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args, com.stripe.android.payments.paymentlauncher.PaymentResult> {
    
    public PaymentLauncherContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.payments.paymentlauncher.PaymentResult parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B9\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u0082\u0001\u0003\u0019\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Landroid/os/Parcelable;", "injectorKey", "", "publishableKey", "stripeAccountId", "enableLogging", "", "productUsage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "toBundle", "Landroid/os/Bundle;", "Companion", "IntentConfirmationArgs", "PaymentIntentNextActionArgs", "SetupIntentNextActionArgs", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "payments-core_debug"})
    public static abstract class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String injectorKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String publishableKey = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stripeAccountId = null;
        private final boolean enableLogging = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.Companion Companion = null;
        private static final java.lang.String EXTRA_ARGS = "extra_args";
        
        private Args(@com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey, java.lang.String publishableKey, java.lang.String stripeAccountId, boolean enableLogging, java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getInjectorKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getPublishableKey() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public java.lang.String getStripeAccountId() {
            return null;
        }
        
        public boolean getEnableLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public java.util.Set<java.lang.String> getProductUsage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle toBundle() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u001fH\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", "stripeAccountId", "enableLogging", "", "productUsage", "", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/ConfirmStripeIntentParams;)V", "getConfirmStripeIntentParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class IntentConfirmationArgs extends com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String injectorKey = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.IntentConfirmationArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.IntentConfirmationArgs copy(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams) {
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
            
            public IntentConfirmationArgs(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams) {
                super(null, null, null, false, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getInjectorKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getPublishableKey() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.String getStripeAccountId() {
                return null;
            }
            
            public final boolean component4() {
                return false;
            }
            
            @java.lang.Override()
            public boolean getEnableLogging() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ConfirmStripeIntentParams component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ConfirmStripeIntentParams getConfirmStripeIntentParams() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.IntentConfirmationArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.IntentConfirmationArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.IntentConfirmationArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", "stripeAccountId", "enableLogging", "", "productUsage", "", "paymentIntentClientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getPaymentIntentClientSecret", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class PaymentIntentNextActionArgs extends com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String injectorKey = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String paymentIntentClientSecret = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.PaymentIntentNextActionArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.PaymentIntentNextActionArgs copy(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            java.lang.String paymentIntentClientSecret) {
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
            
            public PaymentIntentNextActionArgs(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            java.lang.String paymentIntentClientSecret) {
                super(null, null, null, false, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getInjectorKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getPublishableKey() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.String getStripeAccountId() {
                return null;
            }
            
            public final boolean component4() {
                return false;
            }
            
            @java.lang.Override()
            public boolean getEnableLogging() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPaymentIntentClientSecret() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.PaymentIntentNextActionArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.PaymentIntentNextActionArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.PaymentIntentNextActionArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "injectorKey", "", "publishableKey", "stripeAccountId", "enableLogging", "", "productUsage", "", "setupIntentClientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getSetupIntentClientSecret", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class SetupIntentNextActionArgs extends com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String injectorKey = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String setupIntentClientSecret = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.SetupIntentNextActionArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.SetupIntentNextActionArgs copy(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            java.lang.String setupIntentClientSecret) {
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
            
            public SetupIntentNextActionArgs(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
            java.lang.String setupIntentClientSecret) {
                super(null, null, null, false, null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getInjectorKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getPublishableKey() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.String getStripeAccountId() {
                return null;
            }
            
            public final boolean component4() {
                return false;
            }
            
            @java.lang.Override()
            public boolean getEnableLogging() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSetupIntentClientSecret() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.SetupIntentNextActionArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.SetupIntentNextActionArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args.SetupIntentNextActionArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args fromIntent(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
}