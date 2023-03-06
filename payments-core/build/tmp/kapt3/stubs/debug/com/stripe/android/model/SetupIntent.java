package com.stripe.android.model;

import java.lang.System;

/**
 * A [SetupIntent] guides you through the process of setting up a customer's payment credentials for
 * future payments.
 *
 * - [Setup Intents Overview](https://stripe.com/docs/payments/setup-intents)
 * - [SetupIntents API Reference](https://stripe.com/docs/api/setup_intents)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0004VWXYB\u009b\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u00c6\u0003J\u00b5\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\t\u0010H\u001a\u00020IH\u00d6\u0001J\u0013\u0010J\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010LH\u00d6\u0003J\t\u0010M\u001a\u00020IH\u00d6\u0001J\b\u0010N\u001a\u00020\u000bH\u0016J\b\u0010O\u001a\u00020\u000bH\u0016J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020IH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108\u00a8\u0006Z"}, d2 = {"Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "cancellationReason", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "created", "", "clientSecret", "description", "isLiveMode", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "paymentMethodTypes", "", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "usage", "Lcom/stripe/android/model/StripeIntent$Usage;", "lastSetupError", "Lcom/stripe/android/model/SetupIntent$Error;", "unactivatedPaymentMethods", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "getCancellationReason", "()Lcom/stripe/android/model/SetupIntent$CancellationReason;", "getClientSecret", "()Ljava/lang/String;", "getCreated", "()J", "getDescription", "getId", "isConfirmed", "()Z", "lastErrorMessage", "getLastErrorMessage", "getLastSetupError", "()Lcom/stripe/android/model/SetupIntent$Error;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getPaymentMethodTypes", "()Ljava/util/List;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getUnactivatedPaymentMethods", "getUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "requiresAction", "requiresConfirmation", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CancellationReason", "ClientSecret", "Companion", "Error", "payments-core_debug"})
public final class SetupIntent implements com.stripe.android.model.StripeIntent {
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * Reason for cancellation of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SetupIntent.CancellationReason cancellationReason = null;
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    private final long created = 0L;
    
    /**
     * The client secret of this SetupIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete payment setup from your frontend. It should not
     * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
     * sure that you have TLS enabled on any page that includes the client secret.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String clientSecret = null;
    
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * Has the value `true` if the object exists in live mode or the value
     * `false` if the object exists in test mode.
     */
    private final boolean isLiveMode = false;
    
    /**
     * The expanded [PaymentMethod] represented by [paymentMethodId].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethod paymentMethod = null;
    
    /**
     * ID of the payment method used with this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethodId = null;
    
    /**
     * The list of payment method types (e.g. card) that this [SetupIntent] is allowed to set up.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> paymentMethodTypes = null;
    
    /**
     * [Status](https://stripe.com/docs/payments/intents#intent-statuses) of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.Status status = null;
    
    /**
     * Indicates how the payment method is intended to be used in the future.
     *
     * Use [StripeIntent.Usage.OnSession] if you intend to only reuse the payment method when the
     * customer is in your checkout flow. Use [StripeIntent.Usage.OffSession] if your customer may
     * or may not be in your checkout flow. If not provided, this value defaults to
     * [StripeIntent.Usage.OffSession].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.Usage usage = null;
    
    /**
     * The error encountered in the previous [SetupIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SetupIntent.Error lastSetupError = null;
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> unactivatedPaymentMethods = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.NextActionData nextActionData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.SetupIntent.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.SetupIntent> CREATOR = null;
    
    /**
     * A [SetupIntent] guides you through the process of setting up a customer's payment credentials for
     * future payments.
     *
     * - [Setup Intents Overview](https://stripe.com/docs/payments/setup-intents)
     * - [SetupIntents API Reference](https://stripe.com/docs/api/setup_intents)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SetupIntent copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SetupIntent.CancellationReason cancellationReason, long created, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Status status, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Usage usage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SetupIntent.Error lastSetupError, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> unactivatedPaymentMethods, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.NextActionData nextActionData) {
        return null;
    }
    
    /**
     * A [SetupIntent] guides you through the process of setting up a customer's payment credentials for
     * future payments.
     *
     * - [Setup Intents Overview](https://stripe.com/docs/payments/setup-intents)
     * - [SetupIntents API Reference](https://stripe.com/docs/api/setup_intents)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A [SetupIntent] guides you through the process of setting up a customer's payment credentials for
     * future payments.
     *
     * - [Setup Intents Overview](https://stripe.com/docs/payments/setup-intents)
     * - [SetupIntents API Reference](https://stripe.com/docs/api/setup_intents)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A [SetupIntent] guides you through the process of setting up a customer's payment credentials for
     * future payments.
     *
     * - [Setup Intents Overview](https://stripe.com/docs/payments/setup-intents)
     * - [SetupIntents API Reference](https://stripe.com/docs/api/setup_intents)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SetupIntent(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SetupIntent.CancellationReason cancellationReason, long created, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Status status, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Usage usage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SetupIntent.Error lastSetupError, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> unactivatedPaymentMethods, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.NextActionData nextActionData) {
        super();
    }
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    /**
     * Reason for cancellation of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SetupIntent.CancellationReason component2() {
        return null;
    }
    
    /**
     * Reason for cancellation of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SetupIntent.CancellationReason getCancellationReason() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public final long component3() {
        return 0L;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @java.lang.Override()
    public long getCreated() {
        return 0L;
    }
    
    /**
     * The client secret of this SetupIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete payment setup from your frontend. It should not
     * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
     * sure that you have TLS enabled on any page that includes the client secret.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * The client secret of this SetupIntent. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete payment setup from your frontend. It should not
     * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
     * sure that you have TLS enabled on any page that includes the client secret.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getClientSecret() {
        return null;
    }
    
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Has the value `true` if the object exists in live mode or the value
     * `false` if the object exists in test mode.
     */
    public final boolean component6() {
        return false;
    }
    
    /**
     * Has the value `true` if the object exists in live mode or the value
     * `false` if the object exists in test mode.
     */
    @java.lang.Override()
    public boolean isLiveMode() {
        return false;
    }
    
    /**
     * The expanded [PaymentMethod] represented by [paymentMethodId].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod component7() {
        return null;
    }
    
    /**
     * The expanded [PaymentMethod] represented by [paymentMethodId].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethod getPaymentMethod() {
        return null;
    }
    
    /**
     * ID of the payment method used with this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * ID of the payment method used with this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPaymentMethodId() {
        return null;
    }
    
    /**
     * The list of payment method types (e.g. card) that this [SetupIntent] is allowed to set up.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    /**
     * The list of payment method types (e.g. card) that this [SetupIntent] is allowed to set up.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getPaymentMethodTypes() {
        return null;
    }
    
    /**
     * [Status](https://stripe.com/docs/payments/intents#intent-statuses) of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Status component10() {
        return null;
    }
    
    /**
     * [Status](https://stripe.com/docs/payments/intents#intent-statuses) of this [SetupIntent].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.StripeIntent.Status getStatus() {
        return null;
    }
    
    /**
     * Indicates how the payment method is intended to be used in the future.
     *
     * Use [StripeIntent.Usage.OnSession] if you intend to only reuse the payment method when the
     * customer is in your checkout flow. Use [StripeIntent.Usage.OffSession] if your customer may
     * or may not be in your checkout flow. If not provided, this value defaults to
     * [StripeIntent.Usage.OffSession].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Usage component11() {
        return null;
    }
    
    /**
     * Indicates how the payment method is intended to be used in the future.
     *
     * Use [StripeIntent.Usage.OnSession] if you intend to only reuse the payment method when the
     * customer is in your checkout flow. Use [StripeIntent.Usage.OffSession] if your customer may
     * or may not be in your checkout flow. If not provided, this value defaults to
     * [StripeIntent.Usage.OffSession].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Usage getUsage() {
        return null;
    }
    
    /**
     * The error encountered in the previous [SetupIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SetupIntent.Error component12() {
        return null;
    }
    
    /**
     * The error encountered in the previous [SetupIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SetupIntent.Error getLastSetupError() {
        return null;
    }
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getUnactivatedPaymentMethods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.NextActionData component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.StripeIntent.NextActionData getNextActionData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.StripeIntent.NextActionType getNextActionType() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isConfirmed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLastErrorMessage() {
        return null;
    }
    
    @java.lang.Override()
    public boolean requiresAction() {
        return false;
    }
    
    @java.lang.Override()
    public boolean requiresConfirmation() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SetupIntent fromJson(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject jsonObject) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SetupIntent> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SetupIntent createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SetupIntent[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * The error encountered in the previous [SetupIntent] confirmation.
     *
     * See [last_setup_error](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-last_setup_error).
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002,-BM\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020 H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006."}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error;", "Lcom/stripe/android/model/StripeModel;", "code", "", "declineCode", "docUrl", "message", "param", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/SetupIntent$Error$Type;)V", "getCode", "()Ljava/lang/String;", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/SetupIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
    public static final class Error implements com.stripe.android.model.StripeModel {
        
        /**
         * For some errors that could be handled programmatically, a short string indicating the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String code = null;
        
        /**
         * For card errors resulting from a card issuer decline, a short string indicating the
         * [card issuer’s reason for the decline](https://stripe.com/docs/declines#issuer-declines)
         * if they provide one.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String declineCode = null;
        
        /**
         * A URL to more information about the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String docUrl = null;
        
        /**
         * A human-readable message providing more details about the error. For card errors,
         * these messages can be shown to your users.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        
        /**
         * If the error is parameter-specific, the parameter related to the error.
         * For example, you can use this to display a message near the correct form field.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String param = null;
        
        /**
         * The PaymentMethod object for errors returned on a request involving a PaymentMethod.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.PaymentMethod paymentMethod = null;
        
        /**
         * The type of error returned.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.SetupIntent.Error.Type type = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.SetupIntent.Error.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CODE_AUTHENTICATION_ERROR = "setup_intent_authentication_failure";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SetupIntent.Error> CREATOR = null;
        
        /**
         * The error encountered in the previous [SetupIntent] confirmation.
         *
         * See [last_setup_error](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-last_setup_error).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SetupIntent.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
        java.lang.String docUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String param, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SetupIntent.Error.Type type) {
            return null;
        }
        
        /**
         * The error encountered in the previous [SetupIntent] confirmation.
         *
         * See [last_setup_error](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-last_setup_error).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The error encountered in the previous [SetupIntent] confirmation.
         *
         * See [last_setup_error](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-last_setup_error).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The error encountered in the previous [SetupIntent] confirmation.
         *
         * See [last_setup_error](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-last_setup_error).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
        java.lang.String docUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String param, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SetupIntent.Error.Type type) {
            super();
        }
        
        /**
         * For some errors that could be handled programmatically, a short string indicating the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * For some errors that could be handled programmatically, a short string indicating the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCode() {
            return null;
        }
        
        /**
         * For card errors resulting from a card issuer decline, a short string indicating the
         * [card issuer’s reason for the decline](https://stripe.com/docs/declines#issuer-declines)
         * if they provide one.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * For card errors resulting from a card issuer decline, a short string indicating the
         * [card issuer’s reason for the decline](https://stripe.com/docs/declines#issuer-declines)
         * if they provide one.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeclineCode() {
            return null;
        }
        
        /**
         * A URL to more information about the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * A URL to more information about the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDocUrl() {
            return null;
        }
        
        /**
         * A human-readable message providing more details about the error. For card errors,
         * these messages can be shown to your users.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * A human-readable message providing more details about the error. For card errors,
         * these messages can be shown to your users.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        /**
         * If the error is parameter-specific, the parameter related to the error.
         * For example, you can use this to display a message near the correct form field.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * If the error is parameter-specific, the parameter related to the error.
         * For example, you can use this to display a message near the correct form field.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getParam() {
            return null;
        }
        
        /**
         * The PaymentMethod object for errors returned on a request involving a PaymentMethod.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod component6() {
            return null;
        }
        
        /**
         * The PaymentMethod object for errors returned on a request involving a PaymentMethod.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
            return null;
        }
        
        /**
         * The type of error returned.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SetupIntent.Error.Type component7() {
            return null;
        }
        
        /**
         * The type of error returned.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SetupIntent.Error.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SetupIntent.Error> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SetupIntent.Error createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SetupIntent.Error[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_debug"})
        public static enum Type {
            /*public static final*/ ApiConnectionError /* = new ApiConnectionError(null) */,
            /*public static final*/ ApiError /* = new ApiError(null) */,
            /*public static final*/ AuthenticationError /* = new AuthenticationError(null) */,
            /*public static final*/ CardError /* = new CardError(null) */,
            /*public static final*/ IdempotencyError /* = new IdempotencyError(null) */,
            /*public static final*/ InvalidRequestError /* = new InvalidRequestError(null) */,
            /*public static final*/ RateLimitError /* = new RateLimitError(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.SetupIntent.Error.Type.Companion Companion = null;
            
            Type(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "typeCode", "", "fromCode$payments_core_debug", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.SetupIntent.Error.Type fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
                java.lang.String typeCode) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Companion;", "", "()V", "CODE_AUTHENTICATION_ERROR", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret;", "", "value", "", "(Ljava/lang/String;)V", "setupIntentId", "getSetupIntentId$payments_core_debug", "()Ljava/lang/String;", "getValue$payments_core_debug", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_debug"})
    public static final class ClientSecret {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String setupIntentId = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.SetupIntent.ClientSecret.Companion Companion = null;
        private static final java.util.regex.Pattern PATTERN = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SetupIntent.ClientSecret copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
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
        
        public ClientSecret(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSetupIntentId$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isMatch", "", "value", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            public final boolean isMatch(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                return false;
            }
        }
    }
    
    /**
     * Reason for cancellation of a [SetupIntent].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "RequestedByCustomer", "Abandoned", "Companion", "payments-core_debug"})
    public static enum CancellationReason {
        /*public static final*/ Duplicate /* = new Duplicate(null) */,
        /*public static final*/ RequestedByCustomer /* = new RequestedByCustomer(null) */,
        /*public static final*/ Abandoned /* = new Abandoned(null) */;
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.SetupIntent.CancellationReason.Companion Companion = null;
        
        CancellationReason(java.lang.String code) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.SetupIntent.CancellationReason fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/SetupIntent;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SetupIntent fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject jsonObject) {
            return null;
        }
    }
}