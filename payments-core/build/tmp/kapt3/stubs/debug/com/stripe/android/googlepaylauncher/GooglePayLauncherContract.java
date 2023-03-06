package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u000e\u000f\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "PaymentIntentArgs", "SetupIntentArgs", "payments-core_debug"})
public final class GooglePayLauncherContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args, com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_RESULT = "extra_result";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_STATUS_BAR_COLOR = "extra_status_bar_color";
    
    public GooglePayLauncherContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.googlepaylauncher.GooglePayLauncher.Result parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    /**
     * Args for launching [GooglePayLauncherContract] to confirm a [PaymentIntent].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;)V", "getClientSecret$payments_core_debug", "()Ljava/lang/String;", "getConfig$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class PaymentIntentArgs extends com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clientSecret = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.PaymentIntentArgs> CREATOR = null;
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [PaymentIntent].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.PaymentIntentArgs copy(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config) {
            return null;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [PaymentIntent].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [PaymentIntent].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [PaymentIntent].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PaymentIntentArgs(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getClientSecret$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.googlepaylauncher.GooglePayLauncher.Config getConfig$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.PaymentIntentArgs> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.PaymentIntentArgs createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.PaymentIntentArgs[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Args for launching [GooglePayLauncherContract] to confirm a [SetupIntent].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "currencyCode", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;)V", "getClientSecret$payments_core_debug", "()Ljava/lang/String;", "getConfig$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getCurrencyCode$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class SetupIntentArgs extends com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clientSecret = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currencyCode = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.SetupIntentArgs> CREATOR = null;
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [SetupIntent].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.SetupIntentArgs copy(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode) {
            return null;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [SetupIntent].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [SetupIntent].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Args for launching [GooglePayLauncherContract] to confirm a [SetupIntent].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SetupIntentArgs(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getClientSecret$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.googlepaylauncher.GooglePayLauncher.Config getConfig$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrencyCode$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.SetupIntentArgs> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.SetupIntentArgs createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.SetupIntentArgs[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\rR\u0012\u0010\u0003\u001a\u00020\u0004X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Landroid/os/Parcelable;", "()V", "clientSecret", "", "getClientSecret$payments_core_debug", "()Ljava/lang/String;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getConfig$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "toBundle", "Landroid/os/Bundle;", "toBundle$payments_core_debug", "Companion", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "payments-core_debug"})
    public static abstract class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args.Companion Companion = null;
        private static final java.lang.String EXTRA_ARGS = "extra_args";
        
        private Args() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getClientSecret$payments_core_debug();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.googlepaylauncher.GooglePayLauncher.Config getConfig$payments_core_debug();
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle toBundle$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args fromIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Companion;", "", "()V", "EXTRA_RESULT", "", "EXTRA_STATUS_BAR_COLOR", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}