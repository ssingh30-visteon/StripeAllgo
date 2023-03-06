package com.stripe.android.googlepaylauncher;

import java.lang.System;

/**
 * A drop-in class that presents a Google Pay sheet to collect customer payment details and use it
 * to confirm a [PaymentIntent] or [SetupIntent]. When successful, will return [Result.Completed].
 *
 * Use [GooglePayLauncherContract] for Jetpack Compose integrations.
 *
 * See the [Google Pay integration guide](https://stripe.com/docs/google-pay) for more details.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0006$%&\'()B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\'\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\rBQ\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020!R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;", "", "activity", "Landroidx/activity/ComponentActivity;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;", "resultCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;)V", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "googlePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Landroidx/activity/result/ActivityResultLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "isReady", "", "presentForPaymentIntent", "", "clientSecret", "", "presentForSetupIntent", "currencyCode", "BillingAddressConfig", "Companion", "Config", "ReadyCallback", "Result", "ResultCallback", "payments-core_debug"})
public final class GooglePayLauncher {
    private final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config = null;
    private final com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback readyCallback = null;
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args> activityResultLauncher = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory = null;
    private boolean isReady = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.GooglePayLauncher.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_USAGE = "GooglePayLauncher";
    
    public GooglePayLauncher(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args> activityResultLauncher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.googlepaylauncher.GooglePayEnvironment, ? extends com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor) {
        super();
    }
    
    /**
     * Constructor to be used when launching [GooglePayLauncher] from an Activity.
     *
     * @param activity the Activity that is launching the [GooglePayLauncher]
     *
     * @param readyCallback called after determining whether Google Pay is available and ready on
     * the device. [presentForPaymentIntent] and [presentForSetupIntent] may only be called if
     * Google Pay is ready.
     *
     * @param resultCallback called with the result of the [GooglePayLauncher] operation
     */
    public GooglePayLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback resultCallback) {
        super();
    }
    
    /**
     * Constructor to be used when launching [GooglePayLauncher] from a Fragment.
     *
     * @param fragment the Fragment that is launching the [GooglePayLauncher]
     *
     * @param readyCallback called after determining whether Google Pay is available and ready on
     * the device. [presentForPaymentIntent] and [presentForSetupIntent] may only be called if
     * Google Pay is ready.
     *
     * @param resultCallback called with the result of the [GooglePayLauncher] operation
     */
    public GooglePayLauncher(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback resultCallback) {
        super();
    }
    
    /**
     * Present Google Pay to collect customer payment details and use it to confirm the
     * [PaymentIntent] represented by [clientSecret].
     *
     * [PaymentIntent.currency] and [PaymentIntent.amount] will be used to populate the Google
     * Pay [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
     * object.
     *
     * @param clientSecret the PaymentIntent's [client secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret)
     */
    public final void presentForPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    /**
     * Present Google Pay to collect customer payment details and use it to confirm the
     * [SetupIntent] represented by [clientSecret].
     *
     * The Google Pay API requires a [currencyCode](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo).
     * [currencyCode] is required even though the SetupIntent API does not require it.
     *
     * @param clientSecret the SetupIntent's [client secret](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-client_secret)
     * @param currencyCode The ISO 4217 alphabetic currency code.
     */
    public final void presentForSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020%H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "merchantCountryCode", "", "merchantName", "isEmailRequired", "", "billingAddressConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "existingPaymentMethodRequired", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;Z)V", "getBillingAddressConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;)V", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "getExistingPaymentMethodRequired", "()Z", "setExistingPaymentMethodRequired", "(Z)V", "setEmailRequired", "isJcbEnabled", "isJcbEnabled$payments_core_debug", "getMerchantCountryCode", "()Ljava/lang/String;", "getMerchantName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Config implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayEnvironment environment = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String merchantCountryCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String merchantName = null;
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        private boolean isEmailRequired;
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        private com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig billingAddressConfig;
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        private boolean existingPaymentMethodRequired;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Config> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig billingAddressConfig, boolean existingPaymentMethodRequired) {
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
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig billingAddressConfig) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig billingAddressConfig, boolean existingPaymentMethodRequired) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayEnvironment component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayEnvironment getEnvironment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMerchantCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMerchantName() {
            return null;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final boolean component4() {
            return false;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final boolean isEmailRequired() {
            return false;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final void setEmailRequired(boolean p0) {
        }
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig component5() {
            return null;
        }
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig getBillingAddressConfig() {
            return null;
        }
        
        /**
         * Billing address collection configuration.
         */
        public final void setBillingAddressConfig(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig p0) {
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final boolean component6() {
            return false;
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final boolean getExistingPaymentMethodRequired() {
            return false;
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final void setExistingPaymentMethodRequired(boolean p0) {
        }
        
        public final boolean isJcbEnabled$payments_core_debug() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Config> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Config[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired", "(ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;Z)V", "getFormat$payments_core_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired$payments_core_debug", "()Z", "isRequired$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Format", "payments-core_debug"})
    public static final class BillingAddressConfig implements android.os.Parcelable {
        private final boolean isRequired = false;
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format format = null;
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        private final boolean isPhoneNumberRequired = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig copy(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format format, boolean isPhoneNumberRequired) {
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
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format format) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format format, boolean isPhoneNumberRequired) {
            super();
        }
        
        public final boolean component1$payments_core_debug() {
            return false;
        }
        
        public final boolean isRequired$payments_core_debug() {
            return false;
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format component2$payments_core_debug() {
            return null;
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig.Format getFormat$payments_core_debug() {
            return null;
        }
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        public final boolean component3$payments_core_debug() {
            return false;
        }
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        public final boolean isPhoneNumberRequired$payments_core_debug() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncher.BillingAddressConfig[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Min", "Full", "payments-core_debug"})
        public static enum Format {
            /*public static final*/ Min /* = new Min(null) */,
            /*public static final*/ Full /* = new Full(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            Format(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "Landroid/os/Parcelable;", "()V", "Canceled", "Completed", "Failed", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;", "payments-core_debug"})
    public static abstract class Result implements android.os.Parcelable {
        
        private Result() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Completed extends com.stripe.android.googlepaylauncher.GooglePayLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed> CREATOR = null;
            
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Failed extends com.stripe.android.googlepaylauncher.GooglePayLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Failed> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Failed copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
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
            
            public Failed(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Failed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Failed createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Failed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Canceled extends com.stripe.android.googlepaylauncher.GooglePayLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Canceled INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Canceled> CREATOR = null;
            
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Canceled> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Canceled[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;", "", "onReady", "", "isReady", "", "payments-core_debug"})
    public static abstract interface ReadyCallback {
        
        public abstract void onReady(boolean isReady);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;", "", "onResult", "", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "payments-core_debug"})
    public static abstract interface ResultCallback {
        
        public abstract void onResult(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncher.Result result);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;", "", "()V", "PRODUCT_USAGE", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}