package com.stripe.android.model;

import java.lang.System;

/**
 * Model for PaymentMethod creation parameters.
 *
 * Used by [Stripe.createPaymentMethod] and [Stripe.createPaymentMethodSynchronous].
 *
 * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
 *
 * See [PaymentMethod] for API object.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\nWXYZ[\\]^_`B/\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nB/\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\rB/\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0010B/\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013B-\b\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016B-\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0019B/\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u001cB/\b\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\u001fB/\b\u0012\u0012\u0006\u0010 \u001a\u00020!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\"B\u00cc\u0001\b\u0000\u0012\u0006\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&\u0012\u001b\b\u0002\u0010\'\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070(\u00a2\u0006\u0002\b)\u0018\u00010\b\u00a2\u0006\u0002\u0010*J\u000e\u0010:\u001a\u00020$H\u00c0\u0003\u00a2\u0006\u0002\b;J\u000b\u0010<\u001a\u0004\u0018\u00010!H\u00c2\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0017\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c2\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0&H\u00c2\u0003J\u001c\u0010@\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070(\u00a2\u0006\u0002\b)\u0018\u00010\bH\u00c2\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fH\u00c2\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000fH\u00c2\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0012H\u00c2\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0015H\u00c2\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0018H\u00c2\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bH\u00c2\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001eH\u00c2\u0003J\u00d0\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&2\u001b\b\u0002\u0010\'\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070(\u00a2\u0006\u0002\b)\u0018\u00010\bH\u00c6\u0001J\t\u0010J\u001a\u00020KH\u00d6\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010O\u001a\u00020KH\u00d6\u0001J\u0014\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(0\bH\u0016J\t\u0010Q\u001a\u00020\tH\u00d6\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020KH\u00d6\u0001R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0&8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\'\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070(\u00a2\u0006\u0002\b)\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b5\u00106R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "card", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "metadata", "", "", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "ideal", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "fpx", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "sepaDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "bacsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "sofort", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "upi", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "netbanking", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "productUsage", "", "overrideParamMap", "", "Lkotlinx/parcelize/RawValue;", "(Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "attribution", "getAttribution$payments_core_debug", "()Ljava/util/Set;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getType$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod$Type;", "typeCode", "getTypeCode", "()Ljava/lang/String;", "typeParams", "getTypeParams", "()Ljava/util/Map;", "component1", "component1$payments_core_debug", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toParamMap", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AuBecsDebit", "BacsDebit", "Card", "Companion", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Upi", "payments-core_debug"})
public final class PaymentMethodCreateParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.PaymentMethod.Type type = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethodCreateParams.Card card = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.Upi upi = null;
    private final com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethod.BillingDetails billingDetails = null;
    private final java.util.Map<java.lang.String, java.lang.String> metadata = null;
    private final java.util.Set<java.lang.String> productUsage = null;
    
    /**
     * If provided, will be used as the representation of this object when calling the Stripe API,
     * instead of generating the map from its content.
     *
     * The map should be valid according to the
     * [PaymentMethod creation API](https://stripe.com/docs/api/payment_methods/create)
     * documentation, including a required `type` entry.
     *
     * The values of the map must be any of the types supported by [android.os.Parcel.writeValue].
     */
    private final java.util.Map<java.lang.String, java.lang.Object> overrideParamMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.PaymentMethodCreateParams.Companion Companion = null;
    private static final java.lang.String PARAM_TYPE = "type";
    private static final java.lang.String PARAM_BILLING_DETAILS = "billing_details";
    private static final java.lang.String PARAM_METADATA = "metadata";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams> CREATOR = null;
    
    /**
     * Model for PaymentMethod creation parameters.
     *
     * Used by [Stripe.createPaymentMethod] and [Stripe.createPaymentMethodSynchronous].
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     *
     * See [PaymentMethod] for API object.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethodCreateParams copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> overrideParamMap) {
        return null;
    }
    
    /**
     * Model for PaymentMethod creation parameters.
     *
     * Used by [Stripe.createPaymentMethod] and [Stripe.createPaymentMethodSynchronous].
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     *
     * See [PaymentMethod] for API object.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model for PaymentMethod creation parameters.
     *
     * Used by [Stripe.createPaymentMethod] and [Stripe.createPaymentMethodSynchronous].
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     *
     * See [PaymentMethod] for API object.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model for PaymentMethod creation parameters.
     *
     * Used by [Stripe.createPaymentMethod] and [Stripe.createPaymentMethodSynchronous].
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     *
     * See [PaymentMethod] for API object.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentMethodCreateParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> overrideParamMap) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod.Type component1$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod.Type getType$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams.Card component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams.Card getCard() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.Ideal component3() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.Fpx component4() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit component5() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit component6() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit component7() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.Sofort component8() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.Upi component9() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams.Netbanking component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BillingDetails component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BillingDetails getBillingDetails() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> component12() {
        return null;
    }
    
    private final java.util.Set<java.lang.String> component13() {
        return null;
    }
    
    /**
     * If provided, will be used as the representation of this object when calling the Stripe API,
     * instead of generating the map from its content.
     *
     * The map should be valid according to the
     * [PaymentMethod creation API](https://stripe.com/docs/api/payment_methods/create)
     * documentation, including a required `type` entry.
     *
     * The values of the map must be any of the types supported by [android.os.Parcel.writeValue].
     */
    private final java.util.Map<java.lang.String, java.lang.Object> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeCode() {
        return null;
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Card card, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Upi upi, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    private PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, java.util.Map<java.lang.String, java.lang.String> metadata) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getTypeParams() {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Card] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createCard(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Card] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Card card) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Card] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Card] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Ideal] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Ideal] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Ideal] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Fpx] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Fpx] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Fpx] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.AuBecsDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.AuBecsDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.BacsDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.BacsDebit] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Sofort] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Sofort] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Sofort] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Upi upi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.P24] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createP24(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.P24] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createP24(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Bancontact] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createBancontact(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Bancontact] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createBancontact(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Giropay] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createGiropay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Giropay] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createGiropay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.GrabPay] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createGrabPay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.GrabPay] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createGrabPay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Eps] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createEps(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    /**
     * @return params for creating a [PaymentMethod.Type.Eps] payment method
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createEps(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createOxxo(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createOxxo(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createAlipay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createAlipay(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createPayPal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createPayPal(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * @param googlePayPaymentData a [JSONObject] derived from Google Pay's
     * [PaymentData#toJson()](https://developers.google.com/pay/api/android/reference/client#tojson)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createFromGooglePay(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject googlePayPaymentData) throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createBlik() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createBlik(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createBlik(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createKlarna() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createKlarna(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethodCreateParams createKlarna(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentMethodCreateParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentMethodCreateParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u000289BU\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\b#J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u00c0\u0003\u00a2\u0006\u0002\b&J\\\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0007J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-01H\u0016J\t\u00102\u001a\u00020\u0004H\u00d6\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "number", "", "expiryMonth", "", "expiryYear", "cvc", "token", "attribution", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getAttribution$payments_core_debug", "()Ljava/util/Set;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand$payments_core_debug", "()Lcom/stripe/android/model/CardBrand;", "getCvc$payments_core_debug", "()Ljava/lang/String;", "getExpiryMonth$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear$payments_core_debug", "last4", "getLast4$payments_core_debug", "getNumber$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component6", "component6$payments_core_debug", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "describeContents", "equals", "", "other", "", "getLast4", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Card implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String number = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer expiryMonth = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer expiryYear = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String cvc = null;
        private final java.lang.String token = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Set<java.lang.String> attribution = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentMethodCreateParams.Card.Companion Companion = null;
        private static final java.lang.String PARAM_NUMBER = "number";
        private static final java.lang.String PARAM_EXP_MONTH = "exp_month";
        private static final java.lang.String PARAM_EXP_YEAR = "exp_year";
        private static final java.lang.String PARAM_CVC = "cvc";
        private static final java.lang.String PARAM_TOKEN = "token";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Card> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Card copy(@org.jetbrains.annotations.Nullable()
        java.lang.String number, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        java.lang.String cvc, @org.jetbrains.annotations.Nullable()
        java.lang.String token, @org.jetbrains.annotations.Nullable()
        java.util.Set<java.lang.String> attribution) {
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
        
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public Card() {
            super();
        }
        
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public Card(@org.jetbrains.annotations.Nullable()
        java.lang.String number, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        java.lang.String cvc, @org.jetbrains.annotations.Nullable()
        java.lang.String token, @org.jetbrains.annotations.Nullable()
        java.util.Set<java.lang.String> attribution) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getNumber$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpiryMonth$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpiryYear$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCvc$payments_core_debug() {
            return null;
        }
        
        private final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Set<java.lang.String> component6$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Set<java.lang.String> getAttribution$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand getBrand$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final java.lang.String getLast4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        /**
         * Create a [Card] from a Card token.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.stripe.android.model.PaymentMethodCreateParams.Card create(@org.jetbrains.annotations.NotNull()
        java.lang.String token) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Card> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * Used to create a [Card] object with the user's card details. To create a
         * [Card] with a Stripe token (e.g. for Google Pay), use [Card.create].
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "()V", "cvc", "", "expiryMonth", "", "Ljava/lang/Integer;", "expiryYear", "number", "build", "setCvc", "setExpiryMonth", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "setExpiryYear", "setNumber", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.PaymentMethodCreateParams.Card> {
            private java.lang.String number;
            private java.lang.Integer expiryMonth;
            private java.lang.Integer expiryYear;
            private java.lang.String cvc;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card.Builder setNumber(@org.jetbrains.annotations.Nullable()
            java.lang.String number) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card.Builder setExpiryMonth(@org.jetbrains.annotations.Nullable()
            java.lang.Integer expiryMonth) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card.Builder setExpiryYear(@org.jetbrains.annotations.Nullable()
            java.lang.Integer expiryYear) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card.Builder setCvc(@org.jetbrains.annotations.Nullable()
            java.lang.String cvc) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethodCreateParams.Card build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Companion;", "", "()V", "PARAM_CVC", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NUMBER", "PARAM_TOKEN", "create", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "token", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Create a [Card] from a Card token.
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.model.PaymentMethodCreateParams.Card create(@org.jetbrains.annotations.NotNull()
            java.lang.String token) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "bank", "", "(Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Ideal implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String bank;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.Ideal.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BANK = "bank";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Ideal> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Ideal copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
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
        
        public Ideal(@org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBank() {
            return null;
        }
        
        public final void setBank(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Ideal> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Ideal createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Ideal[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "bank", "", "(Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Fpx implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String bank;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.Fpx.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BANK = "bank";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Fpx> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Fpx copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
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
        
        public Fpx(@org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBank() {
            return null;
        }
        
        public final void setBank(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Fpx> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Fpx createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Fpx[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\b\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00d6\u0001J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u00d6\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "vpa", "", "(Ljava/lang/String;)V", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Upi implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        private final java.lang.String vpa = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.Upi.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_VPA = "vpa";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Upi> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Upi copy(@org.jetbrains.annotations.Nullable()
        java.lang.String vpa) {
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
        
        public Upi(@org.jetbrains.annotations.Nullable()
        java.lang.String vpa) {
            super();
        }
        
        private final java.lang.String component1() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Upi> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Upi createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Upi[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi$Companion;", "", "()V", "PARAM_VPA", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "iban", "", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "setIban", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class SepaDebit implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String iban;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_IBAN = "iban";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.SepaDebit> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit copy(@org.jetbrains.annotations.Nullable()
        java.lang.String iban) {
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
        
        public SepaDebit(@org.jetbrains.annotations.Nullable()
        java.lang.String iban) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIban() {
            return null;
        }
        
        public final void setIban(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.SepaDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.SepaDebit[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Companion;", "", "()V", "PARAM_IBAN", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "bsbNumber", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getBsbNumber", "setBsbNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class AuBecsDebit implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String bsbNumber;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String accountNumber;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BSB_NUMBER = "bsb_number";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ACCOUNT_NUMBER = "account_number";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit copy(@org.jetbrains.annotations.NotNull()
        java.lang.String bsbNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String accountNumber) {
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
        
        public AuBecsDebit(@org.jetbrains.annotations.NotNull()
        java.lang.String bsbNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String accountNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBsbNumber() {
            return null;
        }
        
        public final void setBsbNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccountNumber() {
            return null;
        }
        
        public final void setAccountNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit$Companion;", "", "()V", "PARAM_ACCOUNT_NUMBER", "", "PARAM_BSB_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * BACS bank account details
     *
     * See [https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit](https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "accountNumber", "", "sortCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getSortCode", "setSortCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class BacsDebit implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * The bank account number (e.g. 00012345)
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String accountNumber;
        
        /**
         * The sort code of the bank account (e.g. 10-88-00)
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sortCode;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ACCOUNT_NUMBER = "account_number";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_SORT_CODE = "sort_code";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.BacsDebit> CREATOR = null;
        
        /**
         * BACS bank account details
         *
         * See [https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit](https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit copy(@org.jetbrains.annotations.NotNull()
        java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String sortCode) {
            return null;
        }
        
        /**
         * BACS bank account details
         *
         * See [https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit](https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * BACS bank account details
         *
         * See [https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit](https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * BACS bank account details
         *
         * See [https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit](https://stripe.com/docs/api/payment_methods/create#create_payment_method-bacs_debit)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public BacsDebit(@org.jetbrains.annotations.NotNull()
        java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String sortCode) {
            super();
        }
        
        /**
         * The bank account number (e.g. 00012345)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The bank account number (e.g. 00012345)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccountNumber() {
            return null;
        }
        
        /**
         * The bank account number (e.g. 00012345)
         */
        public final void setAccountNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * The sort code of the bank account (e.g. 10-88-00)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The sort code of the bank account (e.g. 10-88-00)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSortCode() {
            return null;
        }
        
        /**
         * The sort code of the bank account (e.g. 10-88-00)
         */
        public final void setSortCode(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.BacsDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.BacsDebit[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit$Companion;", "", "()V", "PARAM_ACCOUNT_NUMBER", "", "PARAM_SORT_CODE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "country", "", "(Ljava/lang/String;)V", "getCountry$payments_core_debug", "()Ljava/lang/String;", "setCountry$payments_core_debug", "component1", "component1$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Sofort implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String country;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.Sofort.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_COUNTRY = "country";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Sofort> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Sofort copy(@org.jetbrains.annotations.NotNull()
        java.lang.String country) {
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
        
        public Sofort(@org.jetbrains.annotations.NotNull()
        java.lang.String country) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountry$payments_core_debug() {
            return null;
        }
        
        public final void setCountry$payments_core_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Sofort> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Sofort createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Sofort[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort$Companion;", "", "()V", "PARAM_COUNTRY", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "bank", "", "(Ljava/lang/String;)V", "getBank$payments_core_debug", "()Ljava/lang/String;", "setBank$payments_core_debug", "component1", "component1$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Netbanking implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String bank;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PaymentMethodCreateParams.Netbanking.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BANK = "bank";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Netbanking> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethodCreateParams.Netbanking copy(@org.jetbrains.annotations.NotNull()
        java.lang.String bank) {
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
        
        public Netbanking(@org.jetbrains.annotations.NotNull()
        java.lang.String bank) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBank$payments_core_debug() {
            return null;
        }
        
        public final void setBank$payments_core_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethodCreateParams.Netbanking> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Netbanking createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethodCreateParams.Netbanking[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J,\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J \u0010 \u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J(\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J,\u0010\"\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0007J(\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H\u0007J(\u0010*\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J(\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J,\u0010,\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J(\u0010-\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J(\u0010.\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J \u0010/\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J,\u00100\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0007J9\u00101\u001a\u00020\b2\u0006\u00102\u001a\u0002032\u0019\u00104\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\b5\u0018\u00010\u000e2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;", "", "()V", "PARAM_BILLING_DETAILS", "", "PARAM_METADATA", "PARAM_TYPE", "create", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "metadata", "", "bacsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "card", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "fpx", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "ideal", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "netbanking", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "upi", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "createAfterpayClearpay", "createAlipay", "createBancontact", "createBlik", "createCard", "cardParams", "Lcom/stripe/android/model/CardParams;", "createEps", "createFromGooglePay", "googlePayPaymentData", "Lorg/json/JSONObject;", "createGiropay", "createGrabPay", "createKlarna", "createOxxo", "createP24", "createPayPal", "createWeChatPay", "createWithOverride", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "overrideParamMap", "Lkotlinx/parcelize/RawValue;", "productUsage", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Card] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createCard(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardParams cardParams) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Card] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Card card) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Card] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Card] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Card card, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Ideal] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Ideal] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Ideal] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Ideal ideal, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Fpx] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Fpx] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Fpx] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Fpx fpx, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.SepaDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.AuBecsDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.AuBecsDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.BacsDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.BacsDebit] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.BacsDebit bacsDebit, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Sofort] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Sofort] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Sofort] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Sofort sofort, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Upi upi) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Upi upi, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Netbanking] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethodCreateParams.Netbanking netbanking, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.P24] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createP24(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.P24] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createP24(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Bancontact] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createBancontact(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Bancontact] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createBancontact(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Giropay] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createGiropay(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Giropay] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createGiropay(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.GrabPay] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createGrabPay(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.GrabPay] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createGrabPay(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Eps] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createEps(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        /**
         * @return params for creating a [PaymentMethod.Type.Eps] payment method
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createEps(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createOxxo(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createOxxo(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createAlipay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createAlipay(@org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createPayPal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createPayPal(@org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createAfterpayClearpay(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * @param googlePayPaymentData a [JSONObject] derived from Google Pay's
         * [PaymentData#toJson()](https://developers.google.com/pay/api/android/reference/client#tojson)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createFromGooglePay(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject googlePayPaymentData) throws org.json.JSONException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createBlik() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createBlik(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createBlik(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createWeChatPay(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createKlarna() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createKlarna(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethodCreateParams createKlarna(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final com.stripe.android.model.PaymentMethodCreateParams createWithOverride(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, ? extends java.lang.Object> overrideParamMap, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            return null;
        }
    }
}