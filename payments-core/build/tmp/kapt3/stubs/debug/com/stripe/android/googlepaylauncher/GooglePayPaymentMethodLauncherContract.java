package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "payments-core_debug"})
public final class GooglePayPaymentMethodLauncherContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_RESULT = "extra_result";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_STATUS_BAR_COLOR = "extra_status_bar_color";
    
    public GooglePayPaymentMethodLauncherContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    /**
     * Args for launching [GooglePayPaymentMethodLauncherContract] to create a [PaymentMethod].
     *
     * @param config the [GooglePayPaymentMethodLauncher.Config] for this transaction
     * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
     * @param amount if the amount of the transaction is unknown at this time, set to `0`.
     * @param transactionId a unique ID that identifies a transaction attempt. Merchants may use an
     *    existing ID or generate a specific one for Google Pay transaction attempts.
     *    This field is required when you send callbacks to the Google Transaction Events API.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000201B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tB7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001J\r\u0010\'\u001a\u00020(H\u0000\u00a2\u0006\u0002\b)J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u00062"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "currencyCode", "", "amount", "", "transactionId", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;ILjava/lang/String;)V", "injectionParams", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;)V", "getAmount$payments_core_debug", "()I", "getConfig$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getCurrencyCode$payments_core_debug", "()Ljava/lang/String;", "getInjectionParams$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "getTransactionId$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toBundle$payments_core_debug", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "InjectionParams", "payments-core_debug"})
    public static final class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currencyCode = null;
        private final int amount = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String transactionId = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.Companion Companion = null;
        private static final java.lang.String EXTRA_ARGS = "extra_args";
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> CREATOR = null;
        
        /**
         * Args for launching [GooglePayPaymentMethodLauncherContract] to create a [PaymentMethod].
         *
         * @param config the [GooglePayPaymentMethodLauncher.Config] for this transaction
         * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
         * @param amount if the amount of the transaction is unknown at this time, set to `0`.
         * @param transactionId a unique ID that identifies a transaction attempt. Merchants may use an
         *    existing ID or generate a specific one for Google Pay transaction attempts.
         *    This field is required when you send callbacks to the Google Transaction Events API.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, int amount, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams) {
            return null;
        }
        
        /**
         * Args for launching [GooglePayPaymentMethodLauncherContract] to create a [PaymentMethod].
         *
         * @param config the [GooglePayPaymentMethodLauncher.Config] for this transaction
         * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
         * @param amount if the amount of the transaction is unknown at this time, set to `0`.
         * @param transactionId a unique ID that identifies a transaction attempt. Merchants may use an
         *    existing ID or generate a specific one for Google Pay transaction attempts.
         *    This field is required when you send callbacks to the Google Transaction Events API.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Args for launching [GooglePayPaymentMethodLauncherContract] to create a [PaymentMethod].
         *
         * @param config the [GooglePayPaymentMethodLauncher.Config] for this transaction
         * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
         * @param amount if the amount of the transaction is unknown at this time, set to `0`.
         * @param transactionId a unique ID that identifies a transaction attempt. Merchants may use an
         *    existing ID or generate a specific one for Google Pay transaction attempts.
         *    This field is required when you send callbacks to the Google Transaction Events API.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Args for launching [GooglePayPaymentMethodLauncherContract] to create a [PaymentMethod].
         *
         * @param config the [GooglePayPaymentMethodLauncher.Config] for this transaction
         * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
         * @param amount if the amount of the transaction is unknown at this time, set to `0`.
         * @param transactionId a unique ID that identifies a transaction attempt. Merchants may use an
         *    existing ID or generate a specific one for Google Pay transaction attempts.
         *    This field is required when you send callbacks to the Google Transaction Events API.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, int amount, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config getConfig$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrencyCode$payments_core_debug() {
            return null;
        }
        
        public final int component3$payments_core_debug() {
            return 0;
        }
        
        public final int getAmount$payments_core_debug() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTransactionId$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams component5$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams getInjectionParams$payments_core_debug() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, int amount) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, int amount, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle toBundle$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$InjectionParams;", "Landroid/os/Parcelable;", "injectorKey", "", "productUsage", "", "enableLogging", "", "publishableKey", "stripeAccountId", "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/String;Ljava/lang/String;)V", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class InjectionParams implements android.os.Parcelable {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String injectorKey = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams copy(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
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
            
            public InjectionParams(@org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getInjectorKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
            
            public final boolean component3() {
                return false;
            }
            
            public final boolean getEnableLogging() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPublishableKey() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args.InjectionParams[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args$Companion;", "", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args fromIntent(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Companion;", "", "()V", "EXTRA_RESULT", "", "EXTRA_STATUS_BAR_COLOR", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}