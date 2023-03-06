package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "payments-core_debug"})
public final class Stripe3ds2TransactionContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args, com.stripe.android.payments.PaymentFlowResult.Unvalidated> {
    
    public Stripe3ds2TransactionContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.payments.PaymentFlowResult.Unvalidated parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GB_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u00106\u001a\u00020\u0011H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003Jz\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00109J\t\u0010:\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u00020\u000fH\u00d6\u0001J\u0006\u0010?\u001a\u00020@J\t\u0010A\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006H"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "enableLogging", "", "statusBarColor", "", "injectorKey", "", "publishableKey", "productUsage", "", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getConfig", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getEnableLogging", "()Z", "fingerprint", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getFingerprint", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getInjectorKey", "()Ljava/lang/String;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getRequestOptions", "()Lcom/stripe/android/networking/ApiRequest$Options;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "describeContents", "equals", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.transaction.SdkTransactionId sdkTransactionId = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config config = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.StripeIntent stripeIntent = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.networking.ApiRequest.Options requestOptions = null;
        private final boolean enableLogging = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String injectorKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String publishableKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args.Companion Companion = null;
        private static final java.lang.String EXTRA_ARGS = "extra_args";
        public static final android.os.Parcelable.Creator<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.transaction.SdkTransactionId sdkTransactionId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig.Stripe3ds2Config config, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options requestOptions, boolean enableLogging, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
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
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.transaction.SdkTransactionId sdkTransactionId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig.Stripe3ds2Config config, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options requestOptions, boolean enableLogging, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.transaction.SdkTransactionId component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.transaction.SdkTransactionId getSdkTransactionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent getStripeIntent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest.Options component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest.Options getRequestOptions() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getEnableLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusBarColor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInjectorKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPublishableKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getProductUsage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Stripe3ds2Fingerprint getFingerprint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle toBundle() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args fromIntent(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
}