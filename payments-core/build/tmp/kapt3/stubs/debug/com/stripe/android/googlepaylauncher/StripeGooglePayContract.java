package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "payments-core_debug"})
public final class StripeGooglePayContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args, com.stripe.android.googlepaylauncher.GooglePayLauncherResult> {
    
    public StripeGooglePayContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.googlepaylauncher.GooglePayLauncherResult parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    /**
     * Args to start [StripeGooglePayActivity] and collect payment data. If successful, the
     * result will be returned through [GooglePayLauncherResult.PaymentData].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "statusBarColor", "", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;Ljava/lang/Integer;)V", "getConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "setConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;)V", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;Ljava/lang/Integer;)Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.NotNull()
        private com.stripe.android.googlepaylauncher.GooglePayConfig config;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args> CREATOR = null;
        
        /**
         * Args to start [StripeGooglePayActivity] and collect payment data. If successful, the
         * result will be returned through [GooglePayLauncherResult.PaymentData].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayConfig config, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor) {
            return null;
        }
        
        /**
         * Args to start [StripeGooglePayActivity] and collect payment data. If successful, the
         * result will be returned through [GooglePayLauncherResult.PaymentData].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Args to start [StripeGooglePayActivity] and collect payment data. If successful, the
         * result will be returned through [GooglePayLauncherResult.PaymentData].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Args to start [StripeGooglePayActivity] and collect payment data. If successful, the
         * result will be returned through [GooglePayLauncherResult.PaymentData].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayConfig config, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayConfig component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayConfig getConfig() {
            return null;
        }
        
        public final void setConfig(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayConfig p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusBarColor() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}