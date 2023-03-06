package com.stripe.android.model;

import java.lang.System;

/**
 * Model representing parameters for [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0003cdeB\u00a9\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010P\u001a\u00020\fH\u00c2\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00b2\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\t\u0010T\u001a\u00020UH\u00d6\u0001J\u0013\u0010V\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010X\u001a\u00020UH\u00d6\u0001J\u0006\u0010Y\u001a\u00020\fJ\b\u0010Z\u001a\u00020\fH\u0016J\u0014\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 H\u0016J\t\u0010\\\u001a\u00020\u0005H\u00d6\u0001J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\fH\u0016J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020UH\u00d6\u0001R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodId", "", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "sourceId", "clientSecret", "returnUrl", "savePaymentMethod", "", "useStripeSdk", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "receiptEmail", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "mandateDataParams", "", "", "getMandateDataParams", "()Ljava/util/Map;", "getMandateId", "setMandateId", "(Ljava/lang/String;)V", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodId", "getPaymentMethodOptions", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setPaymentMethodOptions", "(Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "paymentMethodParamMap", "getPaymentMethodParamMap", "getReceiptEmail", "setReceiptEmail", "getReturnUrl", "setReturnUrl", "getSavePaymentMethod", "()Ljava/lang/Boolean;", "setSavePaymentMethod", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setSetupFutureUsage", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getShipping", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setShipping", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "getSourceId", "getSourceParams", "()Lcom/stripe/android/model/SourceParams;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "describeContents", "", "equals", "other", "hashCode", "shouldSavePaymentMethod", "shouldUseStripeSdk", "toParamMap", "toString", "withShouldUseStripeSdk", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "SetupFutureUsage", "Shipping", "payments-core_debug"})
public final class ConfirmPaymentIntentParams implements com.stripe.android.model.ConfirmStripeIntentParams {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams = null;
    
    /**
     * ID of the payment method (a PaymentMethod, Card, or compatible Source object) to attach to
     * this PaymentIntent.
     *
     * See [payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethodId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SourceParams sourceParams = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sourceId = null;
    
    /**
     * The client secret of this PaymentIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend. It should not be
     * stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make sure
     * that you have TLS enabled on any page that includes the client secret.
     *
     * Refer to our docs to [accept a payment](https://stripe.com/docs/payments/accept-a-payment)
     * and learn about how `client_secret` should be handled.
     *
     * See [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret).
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientSecret = null;
    
    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards
     * and other redirect-based payment methods.
     *
     * See [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url).
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String returnUrl;
    
    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you’re attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     *
     * See [save_payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-save_payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean savePaymentMethod;
    
    /**
     * Set to `true` only when using manual confirmation and the iOS or Android SDKs to handle
     * additional authentication steps.
     *
     * See [use_stripe_sdk](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-use_stripe_sdk).
     */
    private final boolean useStripeSdk = false;
    
    /**
     * Payment-method-specific configuration for this PaymentIntent.
     *
     * See [payment_method_options](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method_options).
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions;
    
    /**
     * ID of the mandate to be used for this payment.
     *
     * See [mandate](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate).
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mandateId;
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.MandateDataParams mandateData;
    
    /**
     * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
     *
     * See [SetupFutureUsage] for more information.
     *
     * See [setup_future_usage](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-setup_future_usage).
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
    
    /**
     * Shipping information for this PaymentIntent.
     *
     * See [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping).
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping;
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     *
     * See [receipt_email](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-receipt_email).
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String receiptEmail;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams.Companion Companion = null;
    private static final java.lang.String PARAM_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final java.lang.String PARAM_RECEIPT_EMAIL = "receipt_email";
    private static final java.lang.String PARAM_SAVE_PAYMENT_METHOD = "save_payment_method";
    private static final java.lang.String PARAM_SHIPPING = "shipping";
    private static final java.lang.String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_SOURCE_DATA = "source_data";
    private static final java.lang.String PARAM_SOURCE_ID = "source";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.ConfirmPaymentIntentParams> CREATOR = null;
    
    /**
     * Model representing parameters for [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.ConfirmPaymentIntentParams copy(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, boolean useStripeSdk, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptEmail) {
        return null;
    }
    
    /**
     * Model representing parameters for [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model representing parameters for [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model representing parameters for [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ConfirmPaymentIntentParams(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, boolean useStripeSdk, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptEmail) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return null;
    }
    
    /**
     * ID of the payment method (a PaymentMethod, Card, or compatible Source object) to attach to
     * this PaymentIntent.
     *
     * See [payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * ID of the payment method (a PaymentMethod, Card, or compatible Source object) to attach to
     * this PaymentIntent.
     *
     * See [payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams getSourceParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSourceId() {
        return null;
    }
    
    /**
     * The client secret of this PaymentIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend. It should not be
     * stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make sure
     * that you have TLS enabled on any page that includes the client secret.
     *
     * Refer to our docs to [accept a payment](https://stripe.com/docs/payments/accept-a-payment)
     * and learn about how `client_secret` should be handled.
     *
     * See [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * The client secret of this PaymentIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend. It should not be
     * stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make sure
     * that you have TLS enabled on any page that includes the client secret.
     *
     * Refer to our docs to [accept a payment](https://stripe.com/docs/payments/accept-a-payment)
     * and learn about how `client_secret` should be handled.
     *
     * See [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getClientSecret() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards
     * and other redirect-based payment methods.
     *
     * See [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards
     * and other redirect-based payment methods.
     *
     * See [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url).
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getReturnUrl() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter is only used for cards
     * and other redirect-based payment methods.
     *
     * See [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url).
     */
    @java.lang.Override()
    public void setReturnUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you’re attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     *
     * See [save_payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-save_payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you’re attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     *
     * See [save_payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-save_payment_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSavePaymentMethod() {
        return null;
    }
    
    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you’re attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     *
     * See [save_payment_method](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-save_payment_method).
     */
    public final void setSavePaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    /**
     * Set to `true` only when using manual confirmation and the iOS or Android SDKs to handle
     * additional authentication steps.
     *
     * See [use_stripe_sdk](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-use_stripe_sdk).
     */
    private final boolean component8() {
        return false;
    }
    
    /**
     * Payment-method-specific configuration for this PaymentIntent.
     *
     * See [payment_method_options](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method_options).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodOptionsParams component9() {
        return null;
    }
    
    /**
     * Payment-method-specific configuration for this PaymentIntent.
     *
     * See [payment_method_options](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method_options).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodOptionsParams getPaymentMethodOptions() {
        return null;
    }
    
    /**
     * Payment-method-specific configuration for this PaymentIntent.
     *
     * See [payment_method_options](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-payment_method_options).
     */
    public final void setPaymentMethodOptions(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams p0) {
    }
    
    /**
     * ID of the mandate to be used for this payment.
     *
     * See [mandate](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * ID of the mandate to be used for this payment.
     *
     * See [mandate](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMandateId() {
        return null;
    }
    
    /**
     * ID of the mandate to be used for this payment.
     *
     * See [mandate](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate).
     */
    public final void setMandateId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.MandateDataParams component11() {
        return null;
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.MandateDataParams getMandateData() {
        return null;
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data).
     */
    public final void setMandateData(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams p0) {
    }
    
    /**
     * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
     *
     * See [SetupFutureUsage] for more information.
     *
     * See [setup_future_usage](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-setup_future_usage).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage component12() {
        return null;
    }
    
    /**
     * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
     *
     * See [SetupFutureUsage] for more information.
     *
     * See [setup_future_usage](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-setup_future_usage).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
        return null;
    }
    
    /**
     * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
     *
     * See [SetupFutureUsage] for more information.
     *
     * See [setup_future_usage](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-setup_future_usage).
     */
    public final void setSetupFutureUsage(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage p0) {
    }
    
    /**
     * Shipping information for this PaymentIntent.
     *
     * See [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping component13() {
        return null;
    }
    
    /**
     * Shipping information for this PaymentIntent.
     *
     * See [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping getShipping() {
        return null;
    }
    
    /**
     * Shipping information for this PaymentIntent.
     *
     * See [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping).
     */
    public final void setShipping(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping p0) {
    }
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     *
     * See [receipt_email](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-receipt_email).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     *
     * See [receipt_email](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-receipt_email).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiptEmail() {
        return null;
    }
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     *
     * See [receipt_email](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-receipt_email).
     */
    public final void setReceiptEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean shouldSavePaymentMethod() {
        return false;
    }
    
    @java.lang.Override()
    public boolean shouldUseStripeSdk() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.ConfirmPaymentIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk) {
        return null;
    }
    
    /**
     * Create a Map representing this object that is prepared for the Stripe API.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getPaymentMethodParamMap() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getMandateDataParams() {
        return null;
    }
    
    /**
     * Create a [ConfirmPaymentIntentParams] without a payment method.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create a [ConfirmPaymentIntentParams] without a payment method.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Create a [ConfirmPaymentIntentParams] without a payment method.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
     * PaymentIntent being confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
     * @param mandateId Optional ID of the Mandate to be used for this payment.
     * @param mandateData Optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent while attaching
     * [PaymentMethodCreateParams] data
     *
     * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
     * PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
     * the associated Customer, if the payment method is not already
     * attached. This parameter only applies to the payment method passed
     * in the same request or the current payment method attached to the
     * PaymentIntent and must be specified again if a new payment method is
     * added.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     * @param mandateData optional details about the Mandate to create.
     * @param setupFutureUsage Optional. See [SetupFutureUsage].
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with an
     * existing [Source].
     *
     * @param sourceId the ID of the source that is being attached to the PaymentIntent being
     * confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with an
     * existing [Source].
     *
     * @param sourceId the ID of the source that is being attached to the PaymentIntent being
     * confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with an
     * existing [Source].
     *
     * @param sourceId the ID of the source that is being attached to the PaymentIntent being
     * confirmed
     * @param clientSecret client secret from the PaymentIntent being confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
     *
     * @param sourceParams params for the source that will be attached to this PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
     *
     * @param sourceParams params for the source that will be attached to this PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
     *
     * @param sourceParams params for the source that will be attached to this PaymentIntent
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     * @param returnUrl the URL the customer should be redirected to after the authorization
     * process
     * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
     * associated Customer, if the source is not already attached.
     * This parameter only applies to the source passed in the same request
     * or the current source attached to the PaymentIntent and must be
     * specified again if a new source is added.
     * @param shipping Optional. See [Shipping].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a [PaymentIntent] with Alipay
     *
     * @param clientSecret client secret from the PaymentIntent that is to be confirmed
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmPaymentIntentParams createAlipay(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.ConfirmPaymentIntentParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ConfirmPaymentIntentParams[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
     *
     * Providing this parameter will
     * [attach the payment method](https://stripe.com/docs/payments/save-during-payment) to the
     * PaymentIntent’s Customer, if present, after the PaymentIntent is confirmed and any required
     * actions from the user are complete. If no Customer was provided, the payment method can still
     * be [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer after the
     * transaction completes.
     *
     * When processing card payments, Stripe also uses `setup_future_usage` to dynamically optimize
     * your payment flow and comply with regional legislation and network rules, such as
     * [SCA](https://stripe.com/docs/strong-customer-authentication).
     *
     * If `setup_future_usage` is already set, you may only update the value
     * from [OnSession] to [OffSession].
     *
     * See [setup_future_usage](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-setup_future_usage).
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "OnSession", "OffSession", "Blank", "payments-core_debug"})
    public static enum SetupFutureUsage {
        /*public static final*/ OnSession /* = new OnSession(null) */,
        /*public static final*/ OffSession /* = new OffSession(null) */,
        /*public static final*/ Blank /* = new Blank(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        SetupFutureUsage(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
    }
    
    /**
     * Shipping information for this PaymentIntent.
     *
     * [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u001eH\u00d6\u0001J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0%H\u0016J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001eH\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "name", "", "carrier", "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_debug", "()Lcom/stripe/android/model/Address;", "getCarrier$payments_core_debug", "()Ljava/lang/String;", "getName$payments_core_debug", "getPhone$payments_core_debug", "getTrackingNumber$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Shipping implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * [shipping.address](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-address)
         *
         * Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.Address address = null;
        
        /**
         * [shipping.name](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-name)
         *
         * Recipient name.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        /**
         * [shipping.carrier](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-carrier)
         *
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String carrier = null;
        
        /**
         * [shipping.phone](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-phone)
         *
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        
        /**
         * [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-tracking_number)
         *
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String trackingNumber = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_CARRIER = "carrier";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PHONE = "phone";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_TRACKING_NUMBER = "tracking_number";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.ConfirmPaymentIntentParams.Shipping> CREATOR = null;
        
        /**
         * Shipping information for this PaymentIntent.
         *
         * [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            return null;
        }
        
        /**
         * Shipping information for this PaymentIntent.
         *
         * [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Shipping information for this PaymentIntent.
         *
         * [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Shipping information for this PaymentIntent.
         *
         * [shipping](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            super();
        }
        
        /**
         * [shipping.address](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-address)
         *
         * Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address component1$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.address](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-address)
         *
         * Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address getAddress$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.name](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-name)
         *
         * Recipient name.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.name](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-name)
         *
         * Recipient name.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.carrier](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-carrier)
         *
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.carrier](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-carrier)
         *
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarrier$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.phone](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-phone)
         *
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.phone](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-phone)
         *
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-tracking_number)
         *
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5$payments_core_debug() {
            return null;
        }
        
        /**
         * [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-shipping-tracking_number)
         *
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTrackingNumber$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.ConfirmPaymentIntentParams.Shipping> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.ConfirmPaymentIntentParams.Shipping[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007JY\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u001bJe\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010 J=\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010$J=\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;", "", "()V", "PARAM_PAYMENT_METHOD_OPTIONS", "", "PARAM_RECEIPT_EMAIL", "PARAM_SAVE_PAYMENT_METHOD", "PARAM_SETUP_FUTURE_USAGE", "PARAM_SHIPPING", "PARAM_SOURCE_DATA", "PARAM_SOURCE_ID", "create", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "createAlipay", "createWithPaymentMethodCreateParams", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "savePaymentMethod", "", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithPaymentMethodId", "paymentMethodId", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceId", "sourceId", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createWithSourceParams", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a [ConfirmPaymentIntentParams] without a payment method.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create a [ConfirmPaymentIntentParams] without a payment method.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
            return null;
        }
        
        /**
         * Create a [ConfirmPaymentIntentParams] without a payment method.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId the ID of the PaymentMethod that is being attached to the
         * PaymentIntent being confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param paymentMethodOptions Optional [PaymentMethodOptionsParams]
         * @param mandateId Optional ID of the Mandate to be used for this payment.
         * @param mandateData Optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethodOptionsParams paymentMethodOptions, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent while attaching
         * [PaymentMethodCreateParams] data
         *
         * @param paymentMethodCreateParams params for the PaymentMethod that will be attached to this
         * PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s payment method to
         * the associated Customer, if the payment method is not already
         * attached. This parameter only applies to the payment method passed
         * in the same request or the current payment method attached to the
         * PaymentIntent and must be specified again if a new payment method is
         * added.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         * @param mandateData optional details about the Mandate to create.
         * @param setupFutureUsage Optional. See [SetupFutureUsage].
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with an
         * existing [Source].
         *
         * @param sourceId the ID of the source that is being attached to the PaymentIntent being
         * confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with an
         * existing [Source].
         *
         * @param sourceId the ID of the source that is being attached to the PaymentIntent being
         * confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with an
         * existing [Source].
         *
         * @param sourceId the ID of the source that is being attached to the PaymentIntent being
         * confirmed
         * @param clientSecret client secret from the PaymentIntent being confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceId(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
         *
         * @param sourceParams params for the source that will be attached to this PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
         *
         * @param sourceParams params for the source that will be attached to this PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a PaymentIntent with [SourceParams]
         *
         * @param sourceParams params for the source that will be attached to this PaymentIntent
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         * @param returnUrl the URL the customer should be redirected to after the authorization
         * process
         * @param savePaymentMethod Set to `true` to save this PaymentIntent’s source to the
         * associated Customer, if the source is not already attached.
         * This parameter only applies to the source passed in the same request
         * or the current source attached to the PaymentIntent and must be
         * specified again if a new source is added.
         * @param shipping Optional. See [Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createWithSourceParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean savePaymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ConfirmPaymentIntentParams.Shipping shipping) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a [PaymentIntent] with Alipay
         *
         * @param clientSecret client secret from the PaymentIntent that is to be confirmed
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmPaymentIntentParams createAlipay(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
    }
}