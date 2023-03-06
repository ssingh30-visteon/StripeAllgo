package com.stripe.android.model;

import java.lang.System;

/**
 * Model representing parameters for [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;BU\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\'J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c2\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fH\u00c6\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u00101\u001a\u00020.H\u00d6\u0001J\b\u00102\u001a\u00020\tH\u0016J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\tH\u0016J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020.H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", "", "paymentMethodId", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "returnUrl", "useStripeSdk", "", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)V", "getClientSecret", "()Ljava/lang/String;", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "mandateDataParams", "", "", "getMandateDataParams", "()Ljava/util/Map;", "getMandateId", "setMandateId", "(Ljava/lang/String;)V", "getPaymentMethodCreateParams$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodId$payments_core_debug", "paymentMethodParamMap", "getPaymentMethodParamMap", "getReturnUrl", "setReturnUrl", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "hashCode", "shouldUseStripeSdk", "toParamMap", "toString", "withShouldUseStripeSdk", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class ConfirmSetupIntentParams implements com.stripe.android.model.ConfirmStripeIntentParams {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientSecret = null;
    
    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
     * SetupIntent.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethodId = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams = null;
    
    /**
     * The URL to redirect your customer back to after they authenticate on the payment method’s
     * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
     * supply an application URI scheme. This parameter is only used for cards and other
     * redirect-based payment methods.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String returnUrl;
    private final boolean useStripeSdk = false;
    
    /**
     * ID of the mandate to be used for this payment.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mandateId;
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.MandateDataParams mandateData;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.ConfirmSetupIntentParams.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.ConfirmSetupIntentParams> CREATOR = null;
    
    /**
     * Model representing parameters for [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.ConfirmSetupIntentParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, boolean useStripeSdk, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        return null;
    }
    
    /**
     * Model representing parameters for [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model representing parameters for [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model representing parameters for [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ConfirmSetupIntentParams(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, boolean useStripeSdk, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
     * SetupIntent.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams component3$payments_core_debug() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate on the payment method’s
     * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
     * supply an application URI scheme. This parameter is only used for cards and other
     * redirect-based payment methods.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate on the payment method’s
     * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
     * supply an application URI scheme. This parameter is only used for cards and other
     * redirect-based payment methods.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getReturnUrl() {
        return null;
    }
    
    /**
     * The URL to redirect your customer back to after they authenticate on the payment method’s
     * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
     * supply an application URI scheme. This parameter is only used for cards and other
     * redirect-based payment methods.
     */
    @java.lang.Override()
    public void setReturnUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    private final boolean component5() {
        return false;
    }
    
    /**
     * ID of the mandate to be used for this payment.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * ID of the mandate to be used for this payment.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMandateId() {
        return null;
    }
    
    /**
     * ID of the mandate to be used for this payment.
     */
    public final void setMandateId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.MandateDataParams component7() {
        return null;
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.MandateDataParams getMandateData() {
        return null;
    }
    
    /**
     * This hash contains details about the Mandate to create.
     *
     * See [mandate_data](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data).
     */
    public final void setMandateData(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams p0) {
    }
    
    @java.lang.Override()
    public boolean shouldUseStripeSdk() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.ConfirmSetupIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk) {
        return null;
    }
    
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
     * Create the parameters necessary for confirming a SetupIntent, without specifying a payment method
     * to attach to the SetupIntent. Only use this if a payment method has already been attached
     * to the SetupIntent.
     *
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams createWithoutPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
     * saved Source object) to attach to this SetupIntent.
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
     * saved Source object) to attach to this SetupIntent.
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent while attaching a
     * PaymentMethod that already exits.
     *
     * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
     * saved Source object) to attach to this SetupIntent.
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
     *
     * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
     * attached to the SetupIntent being confirmed
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
     *
     * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
     * attached to the SetupIntent being confirmed
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData) {
        return null;
    }
    
    /**
     * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
     *
     * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
     * attached to the SetupIntent being confirmed
     * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
     * @param mandateData optional details about the Mandate to create.
     * @param mandateId optional ID of the Mandate to be used for this payment.
     *
     * @return params that can be use to confirm a SetupIntent
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
    java.lang.String mandateId) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.ConfirmSetupIntentParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ConfirmSetupIntentParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ConfirmSetupIntentParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;", "", "()V", "create", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "clientSecret", "", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "mandateId", "paymentMethodId", "createWithoutPaymentMethod", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent, without specifying a payment method
         * to attach to the SetupIntent. Only use this if a payment method has already been attached
         * to the SetupIntent.
         *
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams createWithoutPaymentMethod(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
         * saved Source object) to attach to this SetupIntent.
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
         * saved Source object) to attach to this SetupIntent.
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent while attaching a
         * PaymentMethod that already exits.
         *
         * @param paymentMethodId ID of the payment method (a PaymentMethod, Card, BankAccount, or
         * saved Source object) to attach to this SetupIntent.
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
         *
         * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
         * attached to the SetupIntent being confirmed
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
         *
         * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
         * attached to the SetupIntent being confirmed
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData) {
            return null;
        }
        
        /**
         * Create the parameters necessary for confirming a SetupIntent with a new PaymentMethod
         *
         * @param paymentMethodCreateParams the params to create a new PaymentMethod that will be
         * attached to the SetupIntent being confirmed
         * @param clientSecret The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
         * @param mandateData optional details about the Mandate to create.
         * @param mandateId optional ID of the Mandate to be used for this payment.
         *
         * @return params that can be use to confirm a SetupIntent
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.ConfirmSetupIntentParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.MandateDataParams mandateData, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateId) {
            return null;
        }
    }
}