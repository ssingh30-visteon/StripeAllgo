package com.stripe.android;

import java.lang.System;

/**
 * A factory for generating [Google Pay JSON request objects](https://developers.google.com/pay/api/android/reference/request-objects)
 * for Google Pay API version 2.0.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0005\"#$%&B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B1\b\u0011\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J%\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0017J>\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory;", "", "context", "Landroid/content/Context;", "isJcbEnabled", "", "(Landroid/content/Context;Z)V", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)V", "Lcom/stripe/android/GooglePayConfig;", "(Lcom/stripe/android/GooglePayConfig;Z)V", "createBaseCardPaymentMethodParams", "Lorg/json/JSONObject;", "createCardPaymentMethod", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "createIsReadyToPayRequest", "existingPaymentMethodRequired", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createPaymentDataRequest", "transactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "shippingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "isEmailRequired", "merchantInfo", "Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "createShippingAddressParameters", "createTransactionInfo", "BillingAddressParameters", "Companion", "MerchantInfo", "ShippingAddressParameters", "TransactionInfo", "payments-core_debug"})
@javax.inject.Singleton()
public final class GooglePayJsonFactory {
    private final com.stripe.android.GooglePayConfig googlePayConfig = null;
    
    /**
     * Enable JCB as an allowed card network. By default, JCB is disabled.
     *
     * JCB currently can only be accepted in Japan.
     */
    private final boolean isJcbEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.GooglePayJsonFactory.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int API_VERSION = 2;
    @java.lang.Deprecated()
    private static final int API_VERSION_MINOR = 0;
    @java.lang.Deprecated()
    private static final java.lang.String CARD_PAYMENT_METHOD = "CARD";
    @java.lang.Deprecated()
    private static final java.util.List<java.lang.String> ALLOWED_AUTH_METHODS = null;
    @java.lang.Deprecated()
    private static final java.util.List<java.lang.String> DEFAULT_CARD_NETWORKS = null;
    @java.lang.Deprecated()
    private static final java.lang.String JCB_CARD_NETWORK = "JCB";
    
    public GooglePayJsonFactory(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayConfig googlePayConfig, boolean isJcbEnabled) {
        super();
    }
    
    /**
     * [PaymentConfiguration] must be instantiated before calling this.
     */
    public GooglePayJsonFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isJcbEnabled) {
        super();
    }
    
    @javax.inject.Inject()
    public GooglePayJsonFactory(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "stripeAccountId")
    kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config googlePayConfig) {
        super();
    }
    
    /**
     * [IsReadyToPayRequest](https://developers.google.com/pay/api/android/reference/request-objects#IsReadyToPayRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createIsReadyToPayRequest() {
        return null;
    }
    
    /**
     * [IsReadyToPayRequest](https://developers.google.com/pay/api/android/reference/request-objects#IsReadyToPayRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createIsReadyToPayRequest(@org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters) {
        return null;
    }
    
    /**
     * [IsReadyToPayRequest](https://developers.google.com/pay/api/android/reference/request-objects#IsReadyToPayRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createIsReadyToPayRequest(@org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean existingPaymentMethodRequired) {
        return null;
    }
    
    /**
     * [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/request-objects#PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo) {
        return null;
    }
    
    /**
     * [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/request-objects#PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters) {
        return null;
    }
    
    /**
     * [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/request-objects#PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters shippingAddressParameters) {
        return null;
    }
    
    /**
     * [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/request-objects#PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters shippingAddressParameters, boolean isEmailRequired) {
        return null;
    }
    
    /**
     * [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/request-objects#PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final org.json.JSONObject createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters shippingAddressParameters, boolean isEmailRequired, @org.jetbrains.annotations.Nullable()
    com.stripe.android.GooglePayJsonFactory.MerchantInfo merchantInfo) {
        return null;
    }
    
    private final org.json.JSONObject createTransactionInfo(com.stripe.android.GooglePayJsonFactory.TransactionInfo transactionInfo) {
        return null;
    }
    
    private final org.json.JSONObject createShippingAddressParameters(com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters shippingAddressParameters) {
        return null;
    }
    
    private final org.json.JSONObject createCardPaymentMethod(com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters) {
        return null;
    }
    
    private final org.json.JSONObject createBaseCardPaymentMethodParams() {
        return null;
    }
    
    /**
     * [BillingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#BillingAddressParameters)
     *
     * Configure additional fields to be returned for a requested billing address.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u000e\u0010\u0011\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "isPhoneNumberRequired", "(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V", "getFormat$payments_core_debug", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "isPhoneNumberRequired$payments_core_debug", "()Z", "isRequired$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Format", "payments-core_debug"})
    public static final class BillingAddressParameters implements android.os.Parcelable {
        private final boolean isRequired = false;
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format format = null;
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        private final boolean isPhoneNumberRequired = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.BillingAddressParameters> CREATOR = null;
        
        /**
         * [BillingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#BillingAddressParameters)
         *
         * Configure additional fields to be returned for a requested billing address.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters copy(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format format, boolean isPhoneNumberRequired) {
            return null;
        }
        
        /**
         * [BillingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#BillingAddressParameters)
         *
         * Configure additional fields to be returned for a requested billing address.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [BillingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#BillingAddressParameters)
         *
         * Configure additional fields to be returned for a requested billing address.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [BillingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#BillingAddressParameters)
         *
         * Configure additional fields to be returned for a requested billing address.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressParameters() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressParameters(boolean isRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressParameters(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format format) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressParameters(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format format, boolean isPhoneNumberRequired) {
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
        public final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format component2$payments_core_debug() {
            return null;
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters.Format getFormat$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.BillingAddressParameters> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Min", "Full", "payments-core_debug"})
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
    
    /**
     * [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c0\u0003\u00a2\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\fH\u00c0\u0003\u00a2\u0006\u0002\b\'J^\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\tH\u00d6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\tH\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u00068"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "Landroid/os/Parcelable;", "currencyCode", "", "totalPriceStatus", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "countryCode", "transactionId", "totalPrice", "", "totalPriceLabel", "checkoutOption", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V", "getCheckoutOption$payments_core_debug", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "getCountryCode$payments_core_debug", "()Ljava/lang/String;", "getCurrencyCode$payments_core_debug", "getTotalPrice$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalPriceLabel$payments_core_debug", "getTotalPriceStatus$payments_core_debug", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "getTransactionId$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "copy", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CheckoutOption", "TotalPriceStatus", "payments-core_debug"})
    public static final class TransactionInfo implements android.os.Parcelable {
        
        /**
         * ISO 4217 alphabetic currency code.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currencyCode = null;
        
        /**
         * The status of the total price used.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus = null;
        
        /**
         * ISO 3166-1 alpha-2 country code where the transaction is processed.
         * This is required for merchants based in European Economic Area (EEA) countries.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String countryCode = null;
        
        /**
         * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
         * generate a specific one for Google Pay transaction attempts. This field is required
         * when you send callbacks to the Google Transaction Events API.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String transactionId = null;
        
        /**
         * Total monetary value of the transaction.
         *
         * This field is required unless [totalPriceStatus] is set to [TotalPriceStatus.NotCurrentlyKnown].
         *
         * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
         * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer totalPrice = null;
        
        /**
         * Custom label for the total price within the display items.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String totalPriceLabel = null;
        
        /**
         * Affects the submit button text displayed in the Google Pay payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.GooglePayJsonFactory.TransactionInfo.CheckoutOption checkoutOption = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.TransactionInfo> CREATOR = null;
        
        /**
         * [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.TransactionInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String totalPriceLabel, @org.jetbrains.annotations.Nullable()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.CheckoutOption checkoutOption) {
            return null;
        }
        
        /**
         * [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [TransactionInfo](https://developers.google.com/pay/api/android/reference/request-objects#TransactionInfo)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalPrice) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String totalPriceLabel) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public TransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer totalPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String totalPriceLabel, @org.jetbrains.annotations.Nullable()
        com.stripe.android.GooglePayJsonFactory.TransactionInfo.CheckoutOption checkoutOption) {
            super();
        }
        
        /**
         * ISO 4217 alphabetic currency code.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        /**
         * ISO 4217 alphabetic currency code.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrencyCode$payments_core_debug() {
            return null;
        }
        
        /**
         * The status of the total price used.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus component2$payments_core_debug() {
            return null;
        }
        
        /**
         * The status of the total price used.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.TransactionInfo.TotalPriceStatus getTotalPriceStatus$payments_core_debug() {
            return null;
        }
        
        /**
         * ISO 3166-1 alpha-2 country code where the transaction is processed.
         * This is required for merchants based in European Economic Area (EEA) countries.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        /**
         * ISO 3166-1 alpha-2 country code where the transaction is processed.
         * This is required for merchants based in European Economic Area (EEA) countries.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryCode$payments_core_debug() {
            return null;
        }
        
        /**
         * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
         * generate a specific one for Google Pay transaction attempts. This field is required
         * when you send callbacks to the Google Transaction Events API.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        /**
         * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
         * generate a specific one for Google Pay transaction attempts. This field is required
         * when you send callbacks to the Google Transaction Events API.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTransactionId$payments_core_debug() {
            return null;
        }
        
        /**
         * Total monetary value of the transaction.
         *
         * This field is required unless [totalPriceStatus] is set to [TotalPriceStatus.NotCurrentlyKnown].
         *
         * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
         * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5$payments_core_debug() {
            return null;
        }
        
        /**
         * Total monetary value of the transaction.
         *
         * This field is required unless [totalPriceStatus] is set to [TotalPriceStatus.NotCurrentlyKnown].
         *
         * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
         * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTotalPrice$payments_core_debug() {
            return null;
        }
        
        /**
         * Custom label for the total price within the display items.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6$payments_core_debug() {
            return null;
        }
        
        /**
         * Custom label for the total price within the display items.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTotalPriceLabel$payments_core_debug() {
            return null;
        }
        
        /**
         * Affects the submit button text displayed in the Google Pay payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.GooglePayJsonFactory.TransactionInfo.CheckoutOption component7$payments_core_debug() {
            return null;
        }
        
        /**
         * Affects the submit button text displayed in the Google Pay payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.GooglePayJsonFactory.TransactionInfo.CheckoutOption getCheckoutOption$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.TransactionInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.TransactionInfo createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.TransactionInfo[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * The status of the total price used.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "NotCurrentlyKnown", "Estimated", "Final", "payments-core_debug"})
        public static enum TotalPriceStatus {
            /*public static final*/ NotCurrentlyKnown /* = new NotCurrentlyKnown(null) */,
            /*public static final*/ Estimated /* = new Estimated(null) */,
            /*public static final*/ Final /* = new Final(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            TotalPriceStatus(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
        
        /**
         * Affects the submit button text displayed in the Google Pay payment sheet.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Default", "CompleteImmediatePurchase", "payments-core_debug"})
        public static enum CheckoutOption {
            /*public static final*/ Default /* = new Default(null) */,
            /*public static final*/ CompleteImmediatePurchase /* = new CompleteImmediatePurchase(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            CheckoutOption(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
    }
    
    /**
     * [ShippingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#ShippingAddressParameters)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c2\u0003J\u000e\u0010\u0012\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0013J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u00d6\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "Landroid/os/Parcelable;", "isRequired", "", "allowedCountryCodes", "", "", "phoneNumberRequired", "(ZLjava/util/Set;Z)V", "isRequired$payments_core_debug", "()Z", "normalizedAllowedCountryCodes", "getNormalizedAllowedCountryCodes$payments_core_debug", "()Ljava/util/Set;", "getPhoneNumberRequired$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class ShippingAddressParameters implements android.os.Parcelable {
        
        /**
         * Set to true to request a full shipping address.
         */
        private final boolean isRequired = false;
        
        /**
         * ISO 3166-1 alpha-2 country code values of the countries where shipping is allowed.
         * If this object isn't specified, all shipping address countries are allowed.
         */
        private final java.util.Set<java.lang.String> allowedCountryCodes = null;
        
        /**
         * Set to true if a phone number is required for the provided shipping address.
         */
        private final boolean phoneNumberRequired = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters> CREATOR = null;
        
        /**
         * [ShippingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#ShippingAddressParameters)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters copy(boolean isRequired, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowedCountryCodes, boolean phoneNumberRequired) {
            return null;
        }
        
        /**
         * [ShippingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#ShippingAddressParameters)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [ShippingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#ShippingAddressParameters)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [ShippingAddressParameters](https://developers.google.com/pay/api/android/reference/request-objects#ShippingAddressParameters)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public ShippingAddressParameters() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public ShippingAddressParameters(boolean isRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public ShippingAddressParameters(boolean isRequired, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowedCountryCodes) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public ShippingAddressParameters(boolean isRequired, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowedCountryCodes, boolean phoneNumberRequired) {
            super();
        }
        
        /**
         * Set to true to request a full shipping address.
         */
        public final boolean component1$payments_core_debug() {
            return false;
        }
        
        /**
         * Set to true to request a full shipping address.
         */
        public final boolean isRequired$payments_core_debug() {
            return false;
        }
        
        /**
         * ISO 3166-1 alpha-2 country code values of the countries where shipping is allowed.
         * If this object isn't specified, all shipping address countries are allowed.
         */
        private final java.util.Set<java.lang.String> component2() {
            return null;
        }
        
        /**
         * Set to true if a phone number is required for the provided shipping address.
         */
        public final boolean component3$payments_core_debug() {
            return false;
        }
        
        /**
         * Set to true if a phone number is required for the provided shipping address.
         */
        public final boolean getPhoneNumberRequired$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getNormalizedAllowedCountryCodes$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.ShippingAddressParameters[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * [MerchantInfo](https://developers.google.com/pay/api/android/reference/request-objects#MerchantInfo)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "Landroid/os/Parcelable;", "merchantName", "", "(Ljava/lang/String;)V", "getMerchantName$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class MerchantInfo implements android.os.Parcelable {
        
        /**
         * Merchant name encoded as UTF-8. Merchant name is rendered in the payment sheet.
         * In TEST environment, or if a merchant isn't recognized, a “Pay Unverified Merchant”
         * message is displayed in the payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String merchantName = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.MerchantInfo> CREATOR = null;
        
        /**
         * [MerchantInfo](https://developers.google.com/pay/api/android/reference/request-objects#MerchantInfo)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.GooglePayJsonFactory.MerchantInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String merchantName) {
            return null;
        }
        
        /**
         * [MerchantInfo](https://developers.google.com/pay/api/android/reference/request-objects#MerchantInfo)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [MerchantInfo](https://developers.google.com/pay/api/android/reference/request-objects#MerchantInfo)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [MerchantInfo](https://developers.google.com/pay/api/android/reference/request-objects#MerchantInfo)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public MerchantInfo() {
            super();
        }
        
        public MerchantInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String merchantName) {
            super();
        }
        
        /**
         * Merchant name encoded as UTF-8. Merchant name is rendered in the payment sheet.
         * In TEST environment, or if a merchant isn't recognized, a “Pay Unverified Merchant”
         * message is displayed in the payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        /**
         * Merchant name encoded as UTF-8. Merchant name is rendered in the payment sheet.
         * In TEST environment, or if a merchant isn't recognized, a “Pay Unverified Merchant”
         * message is displayed in the payment sheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMerchantName$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.GooglePayJsonFactory.MerchantInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.MerchantInfo createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.GooglePayJsonFactory.MerchantInfo[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$Companion;", "", "()V", "ALLOWED_AUTH_METHODS", "", "", "API_VERSION", "", "API_VERSION_MINOR", "CARD_PAYMENT_METHOD", "DEFAULT_CARD_NETWORKS", "JCB_CARD_NETWORK", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}