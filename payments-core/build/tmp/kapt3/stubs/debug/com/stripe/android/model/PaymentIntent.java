package com.stripe.android.model;

import java.lang.System;

/**
 * A [PaymentIntent] tracks the process of collecting a payment from your customer.
 *
 * - [Payment Intents Overview](https://stripe.com/docs/payments/payment-intents)
 * - [PaymentIntents API Reference](https://stripe.com/docs/api/payment_intents)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 x2\u00020\u0001:\u0007uvwxyz{B\u00f1\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010$J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010#H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\t\u0010^\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010`\u001a\u00020\fH\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u000fH\u00c6\u0003J\t\u0010c\u001a\u00020\u0007H\u00c6\u0003J\u0088\u0002\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u00c6\u0001\u00a2\u0006\u0002\u0010eJ\t\u0010f\u001a\u00020gH\u00d6\u0001J\u0013\u0010h\u001a\u00020\u00142\b\u0010i\u001a\u0004\u0018\u00010jH\u00d6\u0003J\t\u0010k\u001a\u00020gH\u00d6\u0001J\b\u0010l\u001a\u00020\u0014H\u0007J\b\u0010m\u001a\u00020\u0014H\u0016J\b\u0010n\u001a\u00020\u0014H\u0016J\t\u0010o\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020gH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0014\u00106\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010/R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010?8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010F\u00a8\u0006|"}, d2 = {"Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "paymentMethodTypes", "", "amount", "", "canceledAt", "cancellationReason", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "captureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "clientSecret", "confirmationMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "created", "currency", "description", "isLiveMode", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "receiptEmail", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "lastPaymentError", "Lcom/stripe/android/model/PaymentIntent$Error;", "shipping", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "unactivatedPaymentMethods", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCanceledAt", "()J", "getCancellationReason", "()Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "getCaptureMethod", "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "getClientSecret", "()Ljava/lang/String;", "getConfirmationMethod", "()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "getCreated", "getCurrency", "getDescription", "getId", "isConfirmed", "()Z", "lastErrorMessage", "getLastErrorMessage", "getLastPaymentError", "()Lcom/stripe/android/model/PaymentIntent$Error;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getPaymentMethodTypes", "()Ljava/util/List;", "getReceiptEmail", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getShipping", "()Lcom/stripe/android/model/PaymentIntent$Shipping;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getUnactivatedPaymentMethods", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;)Lcom/stripe/android/model/PaymentIntent;", "describeContents", "", "equals", "other", "", "hashCode", "isSetupFutureUsageSet", "requiresAction", "requiresConfirmation", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CancellationReason", "CaptureMethod", "ClientSecret", "Companion", "ConfirmationMethod", "Error", "Shipping", "payments-core_debug"})
public final class PaymentIntent implements com.stripe.android.model.StripeIntent {
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * The list of payment method types (e.g. card) that this [PaymentIntent] is allowed to
     * use.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> paymentMethodTypes = null;
    
    /**
     * Amount intended to be collected by this [PaymentIntent]. A positive integer
     * representing how much to charge in the smallest currency unit (e.g., 100 cents to charge
     * $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or
     * equivalent in charge currency. The amount value supports up to eight digits (e.g., a value
     * of 99999999 for a USD charge of $999,999.99).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long amount = null;
    
    /**
     * Populated when `status` is `canceled`, this is the time at which the [PaymentIntent]
     * was canceled. Measured in seconds since the Unix epoch. If unavailable, will return 0.
     */
    private final long canceledAt = 0L;
    
    /**
     * Reason for cancellation of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentIntent.CancellationReason cancellationReason = null;
    
    /**
     * Controls when the funds will be captured from the customer’s account.
     * See [CaptureMethod].
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.PaymentIntent.CaptureMethod captureMethod = null;
    
    /**
     * The client secret of this [PaymentIntent]. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend.
     * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the
     * customer. Make sure that you have TLS enabled on any page that includes the client
     * secret.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String clientSecret = null;
    
    /**
     * One of automatic (default) or manual. See [ConfirmationMethod].
     *
     * When [confirmationMethod] is `automatic`, a [PaymentIntent] can be confirmed
     * using a publishable key. After `next_action`s are handled, no additional
     * confirmation is required to complete the payment.
     *
     * When [confirmationMethod] is `manual`, all payment attempts must be made
     * using a secret key. The [PaymentIntent] returns to the
     * [RequiresConfirmation][StripeIntent.Status.RequiresConfirmation]
     * state after handling `next_action`s, and requires your server to initiate each
     * payment attempt with an explicit confirmation.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.PaymentIntent.ConfirmationMethod confirmationMethod = null;
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    private final long created = 0L;
    
    /**
     * Three-letter ISO currency code, in lowercase. Must be a supported currency.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currency = null;
    
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
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethod paymentMethod = null;
    
    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
     * to attach to this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethodId = null;
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String receiptEmail = null;
    
    /**
     * Status of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.Usage setupFutureUsage = null;
    
    /**
     * The payment error encountered in the previous [PaymentIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentIntent.Error lastPaymentError = null;
    
    /**
     * Shipping information for this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentIntent.Shipping shipping = null;
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> unactivatedPaymentMethods = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeIntent.NextActionData nextActionData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.PaymentIntent.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent> CREATOR = null;
    
    /**
     * A [PaymentIntent] tracks the process of collecting a payment from your customer.
     *
     * - [Payment Intents Overview](https://stripe.com/docs/payments/payment-intents)
     * - [PaymentIntents API Reference](https://stripe.com/docs/api/payment_intents)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentIntent copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, long canceledAt, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.CancellationReason cancellationReason, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent.CaptureMethod captureMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent.ConfirmationMethod confirmationMethod, long created, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptEmail, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Status status, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Usage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.Error lastPaymentError, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> unactivatedPaymentMethods, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.NextActionData nextActionData) {
        return null;
    }
    
    /**
     * A [PaymentIntent] tracks the process of collecting a payment from your customer.
     *
     * - [Payment Intents Overview](https://stripe.com/docs/payments/payment-intents)
     * - [PaymentIntents API Reference](https://stripe.com/docs/api/payment_intents)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A [PaymentIntent] tracks the process of collecting a payment from your customer.
     *
     * - [Payment Intents Overview](https://stripe.com/docs/payments/payment-intents)
     * - [PaymentIntents API Reference](https://stripe.com/docs/api/payment_intents)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A [PaymentIntent] tracks the process of collecting a payment from your customer.
     *
     * - [Payment Intents Overview](https://stripe.com/docs/payments/payment-intents)
     * - [PaymentIntents API Reference](https://stripe.com/docs/api/payment_intents)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentIntent(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, long canceledAt, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.CancellationReason cancellationReason, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent.CaptureMethod captureMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent.ConfirmationMethod confirmationMethod, long created, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptEmail, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Status status, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent.Usage setupFutureUsage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.Error lastPaymentError, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentIntent.Shipping shipping, @org.jetbrains.annotations.NotNull()
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
     * The list of payment method types (e.g. card) that this [PaymentIntent] is allowed to
     * use.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    /**
     * The list of payment method types (e.g. card) that this [PaymentIntent] is allowed to
     * use.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getPaymentMethodTypes() {
        return null;
    }
    
    /**
     * Amount intended to be collected by this [PaymentIntent]. A positive integer
     * representing how much to charge in the smallest currency unit (e.g., 100 cents to charge
     * $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or
     * equivalent in charge currency. The amount value supports up to eight digits (e.g., a value
     * of 99999999 for a USD charge of $999,999.99).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    /**
     * Amount intended to be collected by this [PaymentIntent]. A positive integer
     * representing how much to charge in the smallest currency unit (e.g., 100 cents to charge
     * $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or
     * equivalent in charge currency. The amount value supports up to eight digits (e.g., a value
     * of 99999999 for a USD charge of $999,999.99).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAmount() {
        return null;
    }
    
    /**
     * Populated when `status` is `canceled`, this is the time at which the [PaymentIntent]
     * was canceled. Measured in seconds since the Unix epoch. If unavailable, will return 0.
     */
    public final long component4() {
        return 0L;
    }
    
    /**
     * Populated when `status` is `canceled`, this is the time at which the [PaymentIntent]
     * was canceled. Measured in seconds since the Unix epoch. If unavailable, will return 0.
     */
    public final long getCanceledAt() {
        return 0L;
    }
    
    /**
     * Reason for cancellation of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.CancellationReason component5() {
        return null;
    }
    
    /**
     * Reason for cancellation of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.CancellationReason getCancellationReason() {
        return null;
    }
    
    /**
     * Controls when the funds will be captured from the customer’s account.
     * See [CaptureMethod].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentIntent.CaptureMethod component6() {
        return null;
    }
    
    /**
     * Controls when the funds will be captured from the customer’s account.
     * See [CaptureMethod].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentIntent.CaptureMethod getCaptureMethod() {
        return null;
    }
    
    /**
     * The client secret of this [PaymentIntent]. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend.
     * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the
     * customer. Make sure that you have TLS enabled on any page that includes the client
     * secret.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * The client secret of this [PaymentIntent]. Used for client-side retrieval using a
     * publishable key.
     *
     * The client secret can be used to complete a payment from your frontend.
     * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the
     * customer. Make sure that you have TLS enabled on any page that includes the client
     * secret.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getClientSecret() {
        return null;
    }
    
    /**
     * One of automatic (default) or manual. See [ConfirmationMethod].
     *
     * When [confirmationMethod] is `automatic`, a [PaymentIntent] can be confirmed
     * using a publishable key. After `next_action`s are handled, no additional
     * confirmation is required to complete the payment.
     *
     * When [confirmationMethod] is `manual`, all payment attempts must be made
     * using a secret key. The [PaymentIntent] returns to the
     * [RequiresConfirmation][StripeIntent.Status.RequiresConfirmation]
     * state after handling `next_action`s, and requires your server to initiate each
     * payment attempt with an explicit confirmation.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentIntent.ConfirmationMethod component8() {
        return null;
    }
    
    /**
     * One of automatic (default) or manual. See [ConfirmationMethod].
     *
     * When [confirmationMethod] is `automatic`, a [PaymentIntent] can be confirmed
     * using a publishable key. After `next_action`s are handled, no additional
     * confirmation is required to complete the payment.
     *
     * When [confirmationMethod] is `manual`, all payment attempts must be made
     * using a secret key. The [PaymentIntent] returns to the
     * [RequiresConfirmation][StripeIntent.Status.RequiresConfirmation]
     * state after handling `next_action`s, and requires your server to initiate each
     * payment attempt with an explicit confirmation.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentIntent.ConfirmationMethod getConfirmationMethod() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public final long component9() {
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
     * Three-letter ISO currency code, in lowercase. Must be a supported currency.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * Three-letter ISO currency code, in lowercase. Must be a supported currency.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
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
    public final boolean component12() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethod getPaymentMethod() {
        return null;
    }
    
    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
     * to attach to this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    /**
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
     * to attach to this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPaymentMethodId() {
        return null;
    }
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * Email address that the receipt for the resulting payment will be sent to.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiptEmail() {
        return null;
    }
    
    /**
     * Status of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Status component16() {
        return null;
    }
    
    /**
     * Status of this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.StripeIntent.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Usage component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeIntent.Usage getSetupFutureUsage() {
        return null;
    }
    
    /**
     * The payment error encountered in the previous [PaymentIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.Error component18() {
        return null;
    }
    
    /**
     * The payment error encountered in the previous [PaymentIntent] confirmation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.Error getLastPaymentError() {
        return null;
    }
    
    /**
     * Shipping information for this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.Shipping component19() {
        return null;
    }
    
    /**
     * Shipping information for this [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentIntent.Shipping getShipping() {
        return null;
    }
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component20() {
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
    public final com.stripe.android.model.StripeIntent.NextActionData component21() {
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
    
    /**
     * SetupFutureUsage is considered to be set if it is on or off session.
     */
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isSetupFutureUsageSet() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentIntent fromJson(@org.jetbrains.annotations.Nullable()
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentIntent createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentIntent[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * The payment error encountered in the previous [PaymentIntent] confirmation.
     *
     * See [last_payment_error](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-last_payment_error).
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0BW\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fH\u00c6\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020#H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00061"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/model/StripeModel;", "charge", "", "code", "declineCode", "docUrl", "message", "param", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentIntent$Error$Type;)V", "getCharge", "()Ljava/lang/String;", "getCode", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/PaymentIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
    public static final class Error implements com.stripe.android.model.StripeModel {
        
        /**
         * For card errors, the ID of the failed charge.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String charge = null;
        
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
        private final com.stripe.android.model.PaymentIntent.Error.Type type = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentIntent.Error.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent.Error> CREATOR = null;
        
        /**
         * The payment error encountered in the previous [PaymentIntent] confirmation.
         *
         * See [last_payment_error](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-last_payment_error).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentIntent.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String charge, @org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
        java.lang.String docUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String param, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentIntent.Error.Type type) {
            return null;
        }
        
        /**
         * The payment error encountered in the previous [PaymentIntent] confirmation.
         *
         * See [last_payment_error](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-last_payment_error).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The payment error encountered in the previous [PaymentIntent] confirmation.
         *
         * See [last_payment_error](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-last_payment_error).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The payment error encountered in the previous [PaymentIntent] confirmation.
         *
         * See [last_payment_error](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-last_payment_error).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String charge, @org.jetbrains.annotations.Nullable()
        java.lang.String code, @org.jetbrains.annotations.Nullable()
        java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
        java.lang.String docUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.String param, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentIntent.Error.Type type) {
            super();
        }
        
        /**
         * For card errors, the ID of the failed charge.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * For card errors, the ID of the failed charge.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCharge() {
            return null;
        }
        
        /**
         * For some errors that could be handled programmatically, a short string indicating the
         * [error code](https://stripe.com/docs/error-codes) reported.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
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
        public final java.lang.String component3() {
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
        public final java.lang.String component4() {
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
        public final java.lang.String component5() {
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
        public final java.lang.String component6() {
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
        public final com.stripe.android.model.PaymentMethod component7() {
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
        public final com.stripe.android.model.PaymentIntent.Error.Type component8() {
            return null;
        }
        
        /**
         * The type of error returned.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentIntent.Error.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent.Error> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentIntent.Error createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentIntent.Error[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_debug"})
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
            public static final com.stripe.android.model.PaymentIntent.Error.Type.Companion Companion = null;
            
            Type(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "typeCode", "", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.PaymentIntent.Error.Type fromCode(@org.jetbrains.annotations.Nullable()
                java.lang.String typeCode) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Companion;", "", "()V", "CODE_AUTHENTICATION_ERROR", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Shipping information for this [PaymentIntent].
     *
     * See [shipping](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lcom/stripe/android/model/StripeModel;", "address", "Lcom/stripe/android/model/Address;", "carrier", "", "name", "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Shipping implements com.stripe.android.model.StripeModel {
        
        /**
         * Shipping address.
         *
         * See [shipping.address](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-address)
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.Address address = null;
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         *
         * See [shipping.carrier](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-carrier)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String carrier = null;
        
        /**
         * Recipient name.
         *
         * See [shipping.name](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-name)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        
        /**
         * Recipient phone (including extension).
         *
         * See [shipping.phone](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-phone)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate them
         * with commas.
         *
         * See [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-tracking_number)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String trackingNumber = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent.Shipping> CREATOR = null;
        
        /**
         * Shipping information for this [PaymentIntent].
         *
         * See [shipping](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentIntent.Shipping copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            return null;
        }
        
        /**
         * Shipping information for this [PaymentIntent].
         *
         * See [shipping](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Shipping information for this [PaymentIntent].
         *
         * See [shipping](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Shipping information for this [PaymentIntent].
         *
         * See [shipping](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            super();
        }
        
        /**
         * Shipping address.
         *
         * See [shipping.address](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-address)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address component1() {
            return null;
        }
        
        /**
         * Shipping address.
         *
         * See [shipping.address](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-address)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address getAddress() {
            return null;
        }
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         *
         * See [shipping.carrier](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-carrier)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         *
         * See [shipping.carrier](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-carrier)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarrier() {
            return null;
        }
        
        /**
         * Recipient name.
         *
         * See [shipping.name](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-name)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Recipient name.
         *
         * See [shipping.name](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-name)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * Recipient phone (including extension).
         *
         * See [shipping.phone](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-phone)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Recipient phone (including extension).
         *
         * See [shipping.phone](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-phone)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate them
         * with commas.
         *
         * See [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-tracking_number)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate them
         * with commas.
         *
         * See [shipping.tracking_number](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-shipping-tracking_number)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTrackingNumber() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentIntent.Shipping> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentIntent.Shipping createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentIntent.Shipping[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret;", "", "value", "", "(Ljava/lang/String;)V", "paymentIntentId", "getPaymentIntentId$payments_core_debug", "()Ljava/lang/String;", "getValue$payments_core_debug", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_debug"})
    public static final class ClientSecret {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String paymentIntentId = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentIntent.ClientSecret.Companion Companion = null;
        private static final java.util.regex.Pattern PATTERN = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentIntent.ClientSecret copy(@org.jetbrains.annotations.NotNull()
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
        public final java.lang.String getPaymentIntentId$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isMatch", "", "value", "", "payments-core_debug"})
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
     * Reason for cancellation of this [PaymentIntent], either user-provided (duplicate, fraudulent,
     * requested_by_customer, or abandoned) or generated by Stripe internally (failed_invoice,
     * void_invoice, or automatic).
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "Fraudulent", "RequestedByCustomer", "Abandoned", "FailedInvoice", "VoidInvoice", "Automatic", "Companion", "payments-core_debug"})
    public static enum CancellationReason {
        /*public static final*/ Duplicate /* = new Duplicate(null) */,
        /*public static final*/ Fraudulent /* = new Fraudulent(null) */,
        /*public static final*/ RequestedByCustomer /* = new RequestedByCustomer(null) */,
        /*public static final*/ Abandoned /* = new Abandoned(null) */,
        /*public static final*/ FailedInvoice /* = new FailedInvoice(null) */,
        /*public static final*/ VoidInvoice /* = new VoidInvoice(null) */,
        /*public static final*/ Automatic /* = new Automatic(null) */;
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentIntent.CancellationReason.Companion Companion = null;
        
        CancellationReason(java.lang.String code) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.PaymentIntent.CancellationReason fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * Controls when the funds will be captured from the customer’s account.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Automatic", "Manual", "Companion", "payments-core_debug"})
    public static enum CaptureMethod {
        /*public static final*/ Automatic /* = new Automatic(null) */,
        /*public static final*/ Manual /* = new Manual(null) */;
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentIntent.CaptureMethod.Companion Companion = null;
        
        CaptureMethod(java.lang.String code) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentIntent.CaptureMethod fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Automatic", "Manual", "Companion", "payments-core_debug"})
    public static enum ConfirmationMethod {
        /*public static final*/ Automatic /* = new Automatic(null) */,
        /*public static final*/ Manual /* = new Manual(null) */;
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentIntent.ConfirmationMethod.Companion Companion = null;
        
        ConfirmationMethod(java.lang.String code) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentIntent.ConfirmationMethod fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/PaymentIntent;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentIntent fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject jsonObject) {
            return null;
        }
    }
}