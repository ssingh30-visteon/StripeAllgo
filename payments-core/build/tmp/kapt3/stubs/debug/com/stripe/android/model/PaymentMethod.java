package com.stripe.android.model;

import java.lang.System;

/**
 * [PaymentMethod](https://stripe.com/docs/api/payment_methods) objects represent your customer's
 * payment instruments. They can be used with
 * [PaymentIntents](https://stripe.com/docs/payments/payment-intents) to collect payments or saved
 * to Customer objects to store instrument details for future payments.
 *
 * Related guides: [Payment Methods](https://stripe.com/docs/payments/payment-methods) and
 * [More Payment Scenarios](https://stripe.com/docs/payments/more-payment-scenarios).
 *
 * See [PaymentMethodCreateParams] for PaymentMethod creation
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u000fCDEFGHIJKLMNOPQB\u00bd\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u00cc\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u00c6\u0001\u00a2\u0006\u0002\u00105J\t\u00106\u001a\u000207H\u00d6\u0001J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\b\u0010;\u001a\u00020\u0007H\u0007J\t\u0010<\u001a\u000207H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000207H\u00d6\u0001R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\"R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/StripeModel;", "id", "", "created", "", "liveMode", "", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "customerId", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "(Ljava/lang/String;Ljava/lang/Long;ZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;)Lcom/stripe/android/model/PaymentMethod;", "describeContents", "", "equals", "other", "", "hasExpectedDetails", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AuBecsDebit", "BacsDebit", "BillingDetails", "Builder", "Card", "CardPresent", "Companion", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Type", "TypeData", "Upi", "payments-core_debug"})
public final class PaymentMethod implements com.stripe.android.model.StripeModel {
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/payment_methods/object#payment_method_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final java.lang.String id = null;
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     *
     * [created](https://stripe.com/docs/api/payment_methods/object#payment_method_object-created)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final java.lang.Long created = null;
    
    /**
     * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
     *
     * [livemode](https://stripe.com/docs/api/payment_methods/object#payment_method_object-livemode)
     */
    @kotlin.jvm.JvmField()
    public final boolean liveMode = false;
    
    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the
     * PaymentMethod type.
     *
     * [type](https://stripe.com/docs/api/payment_methods/object#payment_method_object-type)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Type type = null;
    
    /**
     * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
     *
     * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.BillingDetails billingDetails = null;
    
    /**
     * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the
     * PaymentMethod has not been saved to a Customer.
     *
     * [customer](https://stripe.com/docs/api/payment_methods/object#payment_method_object-customer)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final java.lang.String customerId = null;
    
    /**
     * If this is a `card` PaymentMethod, this hash contains details about the card.
     *
     * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Card card = null;
    
    /**
     * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
     *
     * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.CardPresent cardPresent = null;
    
    /**
     * If this is a `fpx` PaymentMethod, this hash contains details about the FPX payment method.
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Fpx fpx = null;
    
    /**
     * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
     *
     * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Ideal ideal = null;
    
    /**
     * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
     *
     * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.SepaDebit sepaDebit = null;
    
    /**
     * If this is an `au_becs_debit` PaymentMethod, this hash contains details about the bank account.
     *
     * [au_becs_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-au_becs_debit)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.AuBecsDebit auBecsDebit = null;
    
    /**
     * If this is a `bacs_debit` PaymentMethod, this hash contains details about the Bacs Direct Debit bank account.
     *
     * [bacs_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-bacs_debit)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.BacsDebit bacsDebit = null;
    
    /**
     * If this is a `sofort` PaymentMethod, this hash contains details about the SOFORT payment method.
     *
     * [sofort](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sofort)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Sofort sofort = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Upi upi = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public final com.stripe.android.model.PaymentMethod.Netbanking netbanking = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.PaymentMethod.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod> CREATOR = null;
    
    /**
     * [PaymentMethod](https://stripe.com/docs/api/payment_methods) objects represent your customer's
     * payment instruments. They can be used with
     * [PaymentIntents](https://stripe.com/docs/payments/payment-intents) to collect payments or saved
     * to Customer objects to store instrument details for future payments.
     *
     * Related guides: [Payment Methods](https://stripe.com/docs/payments/payment-methods) and
     * [More Payment Scenarios](https://stripe.com/docs/payments/more-payment-scenarios).
     *
     * See [PaymentMethodCreateParams] for PaymentMethod creation
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.CardPresent cardPresent, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BacsDebit bacsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Netbanking netbanking) {
        return null;
    }
    
    /**
     * [PaymentMethod](https://stripe.com/docs/api/payment_methods) objects represent your customer's
     * payment instruments. They can be used with
     * [PaymentIntents](https://stripe.com/docs/payments/payment-intents) to collect payments or saved
     * to Customer objects to store instrument details for future payments.
     *
     * Related guides: [Payment Methods](https://stripe.com/docs/payments/payment-methods) and
     * [More Payment Scenarios](https://stripe.com/docs/payments/more-payment-scenarios).
     *
     * See [PaymentMethodCreateParams] for PaymentMethod creation
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [PaymentMethod](https://stripe.com/docs/api/payment_methods) objects represent your customer's
     * payment instruments. They can be used with
     * [PaymentIntents](https://stripe.com/docs/payments/payment-intents) to collect payments or saved
     * to Customer objects to store instrument details for future payments.
     *
     * Related guides: [Payment Methods](https://stripe.com/docs/payments/payment-methods) and
     * [More Payment Scenarios](https://stripe.com/docs/payments/more-payment-scenarios).
     *
     * See [PaymentMethodCreateParams] for PaymentMethod creation
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [PaymentMethod](https://stripe.com/docs/api/payment_methods) objects represent your customer's
     * payment instruments. They can be used with
     * [PaymentIntents](https://stripe.com/docs/payments/payment-intents) to collect payments or saved
     * to Customer objects to store instrument details for future payments.
     *
     * Related guides: [Payment Methods](https://stripe.com/docs/payments/payment-methods) and
     * [More Payment Scenarios](https://stripe.com/docs/payments/more-payment-scenarios).
     *
     * See [PaymentMethodCreateParams] for PaymentMethod creation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public PaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Type type, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BillingDetails billingDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Card card, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.CardPresent cardPresent, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Fpx fpx, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Ideal ideal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.SepaDebit sepaDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.AuBecsDebit auBecsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.BacsDebit bacsDebit, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Sofort sofort, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Upi upi, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod.Netbanking netbanking) {
        super();
    }
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/payment_methods/object#payment_method_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     *
     * [created](https://stripe.com/docs/api/payment_methods/object#payment_method_object-created)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
     *
     * [livemode](https://stripe.com/docs/api/payment_methods/object#payment_method_object-livemode)
     */
    public final boolean component3() {
        return false;
    }
    
    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the
     * PaymentMethod type.
     *
     * [type](https://stripe.com/docs/api/payment_methods/object#payment_method_object-type)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Type component4() {
        return null;
    }
    
    /**
     * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
     *
     * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BillingDetails component5() {
        return null;
    }
    
    /**
     * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the
     * PaymentMethod has not been saved to a Customer.
     *
     * [customer](https://stripe.com/docs/api/payment_methods/object#payment_method_object-customer)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * If this is a `card` PaymentMethod, this hash contains details about the card.
     *
     * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Card component7() {
        return null;
    }
    
    /**
     * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
     *
     * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.CardPresent component8() {
        return null;
    }
    
    /**
     * If this is a `fpx` PaymentMethod, this hash contains details about the FPX payment method.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Fpx component9() {
        return null;
    }
    
    /**
     * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
     *
     * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Ideal component10() {
        return null;
    }
    
    /**
     * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
     *
     * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.SepaDebit component11() {
        return null;
    }
    
    /**
     * If this is an `au_becs_debit` PaymentMethod, this hash contains details about the bank account.
     *
     * [au_becs_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-au_becs_debit)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.AuBecsDebit component12() {
        return null;
    }
    
    /**
     * If this is a `bacs_debit` PaymentMethod, this hash contains details about the Bacs Direct Debit bank account.
     *
     * [bacs_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-bacs_debit)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BacsDebit component13() {
        return null;
    }
    
    /**
     * If this is a `sofort` PaymentMethod, this hash contains details about the SOFORT payment method.
     *
     * [sofort](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sofort)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Sofort component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Upi component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.Netbanking component16() {
        return null;
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasExpectedDetails() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.PaymentMethod fromJson(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject paymentMethod) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentMethod createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PaymentMethod[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001)B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u00d6\u0001R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "", "Landroid/os/Parcelable;", "code", "", "isReusable", "", "isVoucher", "requiresMandate", "hasDelayedSettlement", "(Ljava/lang/String;ILjava/lang/String;ZZZZ)V", "describeContents", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "Klarna", "Companion", "payments-core_debug"})
    public static enum Type implements android.os.Parcelable {
        /*public static final*/ Card /* = new Card(null, false, false, false, false) */,
        /*public static final*/ CardPresent /* = new CardPresent(null, false, false, false, false) */,
        /*public static final*/ Fpx /* = new Fpx(null, false, false, false, false) */,
        /*public static final*/ Ideal /* = new Ideal(null, false, false, false, false) */,
        /*public static final*/ SepaDebit /* = new SepaDebit(null, false, false, false, false) */,
        /*public static final*/ AuBecsDebit /* = new AuBecsDebit(null, false, false, false, false) */,
        /*public static final*/ BacsDebit /* = new BacsDebit(null, false, false, false, false) */,
        /*public static final*/ Sofort /* = new Sofort(null, false, false, false, false) */,
        /*public static final*/ Upi /* = new Upi(null, false, false, false, false) */,
        /*public static final*/ P24 /* = new P24(null, false, false, false, false) */,
        /*public static final*/ Bancontact /* = new Bancontact(null, false, false, false, false) */,
        /*public static final*/ Giropay /* = new Giropay(null, false, false, false, false) */,
        /*public static final*/ Eps /* = new Eps(null, false, false, false, false) */,
        /*public static final*/ Oxxo /* = new Oxxo(null, false, false, false, false) */,
        /*public static final*/ Alipay /* = new Alipay(null, false, false, false, false) */,
        /*public static final*/ GrabPay /* = new GrabPay(null, false, false, false, false) */,
        /*public static final*/ PayPal /* = new PayPal(null, false, false, false, false) */,
        /*public static final*/ AfterpayClearpay /* = new AfterpayClearpay(null, false, false, false, false) */,
        /*public static final*/ Netbanking /* = new Netbanking(null, false, false, false, false) */,
        /*public static final*/ Blik /* = new Blik(null, false, false, false, false) */,
        /*public static final*/ WeChatPay /* = new WeChatPay(null, false, false, false, false) */,
        /*public static final*/ Klarna /* = new Klarna(null, false, false, false, false) */;
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmField()
        public final java.lang.String code = null;
        @kotlin.jvm.JvmField()
        public final boolean isReusable = false;
        @kotlin.jvm.JvmField()
        public final boolean isVoucher = false;
        @kotlin.jvm.JvmField()
        public final boolean requiresMandate = false;
        private final boolean hasDelayedSettlement = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentMethod.Type.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Type> CREATOR = null;
        
        Type(java.lang.String code, boolean isReusable, boolean isVoucher, boolean requiresMandate, boolean hasDelayedSettlement) {
        }
        
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean hasDelayedSettlement() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Type> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Type createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Type[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentMethod$Type;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020\u0002H\u0016J\u0010\u0010\'\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010)\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010,\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u00100\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012J\u0010\u00101\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u00103\u001a\u00020\u00002\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001bJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u00105\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u00106\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u00107\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u00108\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod;", "()V", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "created", "", "Ljava/lang/Long;", "customerId", "", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "id", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "liveMode", "", "metadata", "", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "build", "setAuBecsDebit", "setBacsDebit", "setBillingDetails", "setCard", "setCardPresent", "setCreated", "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;", "setCustomerId", "setFpx", "setId", "setIdeal", "setLiveMode", "setMetadata", "setNetbanking", "setSepaDebit", "setSofort", "setType", "setUpi", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.PaymentMethod> {
        private java.lang.String id;
        private java.lang.Long created;
        private boolean liveMode = false;
        private com.stripe.android.model.PaymentMethod.Type type;
        private com.stripe.android.model.PaymentMethod.BillingDetails billingDetails;
        private java.util.Map<java.lang.String, java.lang.String> metadata;
        private java.lang.String customerId;
        private com.stripe.android.model.PaymentMethod.Card card;
        private com.stripe.android.model.PaymentMethod.CardPresent cardPresent;
        private com.stripe.android.model.PaymentMethod.Ideal ideal;
        private com.stripe.android.model.PaymentMethod.Fpx fpx;
        private com.stripe.android.model.PaymentMethod.SepaDebit sepaDebit;
        private com.stripe.android.model.PaymentMethod.AuBecsDebit auBecsDebit;
        private com.stripe.android.model.PaymentMethod.BacsDebit bacsDebit;
        private com.stripe.android.model.PaymentMethod.Sofort sofort;
        private com.stripe.android.model.PaymentMethod.Netbanking netbanking;
        private com.stripe.android.model.PaymentMethod.Upi upi;
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setId(@org.jetbrains.annotations.Nullable()
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setCreated(@org.jetbrains.annotations.Nullable()
        java.lang.Long created) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setLiveMode(boolean liveMode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setMetadata(@org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setType(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Type type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setBillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BillingDetails billingDetails) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setCard(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card card) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setCardPresent(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.CardPresent cardPresent) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setCustomerId(@org.jetbrains.annotations.Nullable()
        java.lang.String customerId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setIdeal(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Ideal ideal) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setFpx(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Fpx fpx) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setSepaDebit(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.SepaDebit sepaDebit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setAuBecsDebit(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.AuBecsDebit auBecsDebit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setBacsDebit(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.BacsDebit bacsDebit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setSofort(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Sofort sofort) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setNetbanking(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Netbanking netbanking) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Builder setUpi(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Upi upi) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod build() {
            return null;
        }
    }
    
    /**
     * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
     *
     * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B7\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J9\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u00d6\u0001R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class BillingDetails implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripeParamsModel {
        
        /**
         * Billing address.
         *
         * [billing_details.address](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-address)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.Address address = null;
        
        /**
         * Email address.
         *
         * [billing_details.email](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-email)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String email = null;
        
        /**
         * Full name.
         *
         * [billing_details.name](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-name)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String name = null;
        
        /**
         * Billing phone number (including extension).
         *
         * [billing_details.phone](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-phone)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String phone = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentMethod.BillingDetails.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_ADDRESS = "address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_EMAIL = "email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_NAME = "name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_PHONE = "phone";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.BillingDetails> CREATOR = null;
        
        /**
         * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
         *
         * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.BillingDetails copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            return null;
        }
        
        /**
         * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
         *
         * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
         *
         * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods.
         *
         * [billing_details](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingDetails() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            super();
        }
        
        /**
         * Billing address.
         *
         * [billing_details.address](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-address)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address component1() {
            return null;
        }
        
        /**
         * Email address.
         *
         * [billing_details.email](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-email)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * Full name.
         *
         * [billing_details.name](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-name)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Billing phone number (including extension).
         *
         * [billing_details.phone](https://stripe.com/docs/api/payment_methods/object#payment_method_object-billing_details-phone)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder toBuilder() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.BillingDetails> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.BillingDetails createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.BillingDetails[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "()V", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "build", "setAddress", "setEmail", "setName", "setPhone", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.PaymentMethod.BillingDetails> {
            private com.stripe.android.model.Address address;
            private java.lang.String email;
            private java.lang.String name;
            private java.lang.String phone;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder setAddress(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address address) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder setEmail(@org.jetbrains.annotations.Nullable()
            java.lang.String email) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder setName(@org.jetbrains.annotations.Nullable()
            java.lang.String name) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder setPhone(@org.jetbrains.annotations.Nullable()
            java.lang.String phone) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethod.BillingDetails build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "create", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.BillingDetails create(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.ShippingInformation shippingInformation) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/model/StripeModel;", "()V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "payments-core_debug"})
    public static abstract class TypeData implements com.stripe.android.model.StripeModel {
        
        private TypeData() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.model.PaymentMethod.Type getType();
    }
    
    /**
     * If this is a `card` PaymentMethod, this hash contains details about the card.
     *
     * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003567B\u0089\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0090\u0001\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\tH\u00d6\u0001J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\tH\u00d6\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "brand", "Lcom/stripe/android/model/CardBrand;", "checks", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "country", "", "expiryMonth", "", "expiryYear", "fingerprint", "funding", "last4", "threeDSecureUsage", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "wallet", "Lcom/stripe/android/model/wallets/Wallet;", "networks", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)V", "Ljava/lang/Integer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component10", "component11", "component11$payments_core_debug", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)Lcom/stripe/android/model/PaymentMethod$Card;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Checks", "Networks", "ThreeDSecureUsage", "payments-core_debug"})
    public static final class Card extends com.stripe.android.model.PaymentMethod.TypeData {
        
        /**
         * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`,
         * `visa`, or `unknown`.
         *
         * [card.brand](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-brand)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.CardBrand brand = null;
        
        /**
         * Checks on Card address and CVC if provided
         *
         * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.PaymentMethod.Card.Checks checks = null;
        
        /**
         * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the international breakdown of cards you’ve collected.
         *
         * [card.country](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-country)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String country = null;
        
        /**
         * Two-digit number representing the card’s expiration month.
         *
         * [card.exp_month](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-exp_month)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.Integer expiryMonth = null;
        
        /**
         * Four-digit number representing the card’s expiration year.
         *
         * [card.exp_year](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-exp_year)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.Integer expiryYear = null;
        
        /**
         * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve signed up with you are using the same card number, for example. For payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card number.
         *
         * [card.fingerprint](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-fingerprint)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String fingerprint = null;
        
        /**
         * Card funding type. Can be `credit`, `debit, `prepaid`, or `unknown`.
         *
         * [card.funding](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-funding)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String funding = null;
        
        /**
         * The last four digits of the card.
         *
         * [card.last4](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-last4)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String last4 = null;
        
        /**
         * Contains details on how this Card maybe be used for 3D Secure authentication.
         *
         * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage = null;
        
        /**
         * If this Card is part of a card wallet, this contains the details of the card wallet.
         *
         * [card.wallet](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-wallet)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.wallets.Wallet wallet = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.PaymentMethod.Card.Networks networks = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card> CREATOR = null;
        
        /**
         * If this is a `card` PaymentMethod, this hash contains details about the card.
         *
         * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Card copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.Checks checks, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String funding, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.wallets.Wallet wallet, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.Networks networks) {
            return null;
        }
        
        /**
         * If this is a `card` PaymentMethod, this hash contains details about the card.
         *
         * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * If this is a `card` PaymentMethod, this hash contains details about the card.
         *
         * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * If this is a `card` PaymentMethod, this hash contains details about the card.
         *
         * [card](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card)
         */
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
        public Card(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.Checks checks, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String funding, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.wallets.Wallet wallet, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod.Card.Networks networks) {
            super();
        }
        
        /**
         * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`,
         * `visa`, or `unknown`.
         *
         * [card.brand](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-brand)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand component1() {
            return null;
        }
        
        /**
         * Checks on Card address and CVC if provided
         *
         * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod.Card.Checks component2() {
            return null;
        }
        
        /**
         * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the international breakdown of cards you’ve collected.
         *
         * [card.country](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-country)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Two-digit number representing the card’s expiration month.
         *
         * [card.exp_month](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-exp_month)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        /**
         * Four-digit number representing the card’s expiration year.
         *
         * [card.exp_year](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-exp_year)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        /**
         * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve signed up with you are using the same card number, for example. For payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card number.
         *
         * [card.fingerprint](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-fingerprint)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        /**
         * Card funding type. Can be `credit`, `debit, `prepaid`, or `unknown`.
         *
         * [card.funding](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-funding)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        /**
         * The last four digits of the card.
         *
         * [card.last4](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-last4)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        /**
         * Contains details on how this Card maybe be used for 3D Secure authentication.
         *
         * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage component9() {
            return null;
        }
        
        /**
         * If this Card is part of a card wallet, this contains the details of the card wallet.
         *
         * [card.wallet](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-wallet)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.wallets.Wallet component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod.Card.Networks component11$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Card createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Card[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * Checks on Card address and CVC if provided
         *
         * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lcom/stripe/android/model/StripeModel;", "addressLine1Check", "", "addressPostalCodeCheck", "cvcCheck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Checks implements com.stripe.android.model.StripeModel {
            
            /**
             * If a address line1 was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.address_line1_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-address_line1_check)
             */
            @org.jetbrains.annotations.Nullable()
            @kotlin.jvm.JvmField()
            public final java.lang.String addressLine1Check = null;
            
            /**
             * If a address postal code was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.address_postal_code_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-address_postal_code_check)
             */
            @org.jetbrains.annotations.Nullable()
            @kotlin.jvm.JvmField()
            public final java.lang.String addressPostalCodeCheck = null;
            
            /**
             * If a CVC was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.cvc_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-cvc_check)
             */
            @org.jetbrains.annotations.Nullable()
            @kotlin.jvm.JvmField()
            public final java.lang.String cvcCheck = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.Checks> CREATOR = null;
            
            /**
             * Checks on Card address and CVC if provided
             *
             * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.Card.Checks copy(@org.jetbrains.annotations.Nullable()
            java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
            java.lang.String addressPostalCodeCheck, @org.jetbrains.annotations.Nullable()
            java.lang.String cvcCheck) {
                return null;
            }
            
            /**
             * Checks on Card address and CVC if provided
             *
             * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Checks on Card address and CVC if provided
             *
             * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Checks on Card address and CVC if provided
             *
             * [card.checks](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-checks)
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
            public Checks(@org.jetbrains.annotations.Nullable()
            java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
            java.lang.String addressPostalCodeCheck, @org.jetbrains.annotations.Nullable()
            java.lang.String cvcCheck) {
                super();
            }
            
            /**
             * If a address line1 was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.address_line1_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-address_line1_check)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            /**
             * If a address postal code was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.address_postal_code_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-address_postal_code_check)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            /**
             * If a CVC was provided, results of the check, one of `pass`, `fail`, `unavailable`, or `unchecked`.
             *
             * [payment_method.card.checks.cvc_check](https://stripe.com/docs/api/errors#errors-payment_method-card-checks-cvc_check)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.Checks> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.Checks createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.Checks[] newArray(int size) {
                    return null;
                }
            }
        }
        
        /**
         * Contains details on how this Card maybe be used for 3D Secure authentication.
         *
         * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u00d6\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/StripeModel;", "isSupported", "", "(Z)V", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class ThreeDSecureUsage implements com.stripe.android.model.StripeModel {
            
            /**
             * Whether 3D Secure is supported on this card.
             *
             * [payment_method.card.three_d_secure_usage.supported](https://stripe.com/docs/api/errors#errors-payment_method-card-three_d_secure_usage-supported)
             */
            @kotlin.jvm.JvmField()
            public final boolean isSupported = false;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage> CREATOR = null;
            
            /**
             * Contains details on how this Card maybe be used for 3D Secure authentication.
             *
             * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage copy(boolean isSupported) {
                return null;
            }
            
            /**
             * Contains details on how this Card maybe be used for 3D Secure authentication.
             *
             * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Contains details on how this Card maybe be used for 3D Secure authentication.
             *
             * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Contains details on how this Card maybe be used for 3D Secure authentication.
             *
             * [card.three_d_secure_usage](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-three_d_secure_usage)
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
            public ThreeDSecureUsage(boolean isSupported) {
                super();
            }
            
            /**
             * Whether 3D Secure is supported on this card.
             *
             * [payment_method.card.three_d_secure_usage.supported](https://stripe.com/docs/api/errors#errors-payment_method-card-three_d_secure_usage-supported)
             */
            public final boolean component1() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/model/StripeModel;", "available", "", "", "selectionMandatory", "", "preferred", "(Ljava/util/Set;ZLjava/lang/String;)V", "getAvailable", "()Ljava/util/Set;", "getPreferred", "()Ljava/lang/String;", "getSelectionMandatory", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Networks implements com.stripe.android.model.StripeModel {
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> available = null;
            private final boolean selectionMandatory = false;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String preferred = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.Networks> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.Card.Networks copy(@org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> available, boolean selectionMandatory, @org.jetbrains.annotations.Nullable()
            java.lang.String preferred) {
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
            
            public Networks() {
                super();
            }
            
            public Networks(@org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> available, boolean selectionMandatory, @org.jetbrains.annotations.Nullable()
            java.lang.String preferred) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> getAvailable() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            public final boolean getSelectionMandatory() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPreferred() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Card.Networks> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.Networks createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.PaymentMethod.Card.Networks[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    /**
     * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
     *
     * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "ignore", "", "(Z)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class CardPresent extends com.stripe.android.model.PaymentMethod.TypeData {
        private final boolean ignore = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.PaymentMethod.CardPresent.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.CardPresent> CREATOR = null;
        
        /**
         * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
         *
         * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.CardPresent copy(boolean ignore) {
            return null;
        }
        
        /**
         * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
         *
         * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
         *
         * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * If this is a `card_present` PaymentMethod, this hash contains details about the Card Present payment method.
         *
         * [card_present](https://stripe.com/docs/api/payment_methods/object#payment_method_object-card_present)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CardPresent() {
            super();
        }
        
        public CardPresent(boolean ignore) {
            super();
        }
        
        private final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.CardPresent> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.CardPresent createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.CardPresent[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "getEMPTY$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod.CardPresent getEMPTY$payments_core_debug() {
                return null;
            }
        }
    }
    
    /**
     * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
     *
     * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "bankIdentifierCode", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Ideal extends com.stripe.android.model.PaymentMethod.TypeData {
        
        /**
         * The customer’s bank, if provided. Can be one of `abn_amro`, `asn_bank`, `bunq`,
         * `handelsbanken`, `ing`, `knab`, `moneyou`, `rabobank`, `regiobank`, `sns_bank`,
         * `triodos_bank`, or `van_lanschot`.
         *
         * [ideal.bank](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal-bank)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bank = null;
        
        /**
         * The Bank Identifier Code of the customer’s bank, if the bank was provided.
         *
         * [ideal.bic](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal-bic)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bankIdentifierCode = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Ideal> CREATOR = null;
        
        /**
         * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
         *
         * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Ideal copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bank, @org.jetbrains.annotations.Nullable()
        java.lang.String bankIdentifierCode) {
            return null;
        }
        
        /**
         * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
         *
         * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
         *
         * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
         *
         * [ideal](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Ideal(@org.jetbrains.annotations.Nullable()
        java.lang.String bank, @org.jetbrains.annotations.Nullable()
        java.lang.String bankIdentifierCode) {
            super();
        }
        
        /**
         * The customer’s bank, if provided. Can be one of `abn_amro`, `asn_bank`, `bunq`,
         * `handelsbanken`, `ing`, `knab`, `moneyou`, `rabobank`, `regiobank`, `sns_bank`,
         * `triodos_bank`, or `van_lanschot`.
         *
         * [ideal.bank](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal-bank)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The Bank Identifier Code of the customer’s bank, if the bank was provided.
         *
         * [ideal.bic](https://stripe.com/docs/api/payment_methods/object#payment_method_object-ideal-bic)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Ideal> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Ideal createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Ideal[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Requires the FPX payment method enabled on your account via
     * https://dashboard.stripe.com/account/payments/settings.
     *
     * To obtain the FPX bank's display name and icon, see [com.stripe.android.view.FpxBank].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "accountHolderType", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Fpx extends com.stripe.android.model.PaymentMethod.TypeData {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bank = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String accountHolderType = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Fpx> CREATOR = null;
        
        /**
         * Requires the FPX payment method enabled on your account via
         * https://dashboard.stripe.com/account/payments/settings.
         *
         * To obtain the FPX bank's display name and icon, see [com.stripe.android.view.FpxBank].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Fpx copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bank, @org.jetbrains.annotations.Nullable()
        java.lang.String accountHolderType) {
            return null;
        }
        
        /**
         * Requires the FPX payment method enabled on your account via
         * https://dashboard.stripe.com/account/payments/settings.
         *
         * To obtain the FPX bank's display name and icon, see [com.stripe.android.view.FpxBank].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Requires the FPX payment method enabled on your account via
         * https://dashboard.stripe.com/account/payments/settings.
         *
         * To obtain the FPX bank's display name and icon, see [com.stripe.android.view.FpxBank].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Requires the FPX payment method enabled on your account via
         * https://dashboard.stripe.com/account/payments/settings.
         *
         * To obtain the FPX bank's display name and icon, see [com.stripe.android.view.FpxBank].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Fpx(@org.jetbrains.annotations.Nullable()
        java.lang.String bank, @org.jetbrains.annotations.Nullable()
        java.lang.String accountHolderType) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Fpx> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Fpx createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Fpx[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
     *
     * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bankCode", "", "branchCode", "country", "fingerprint", "last4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class SepaDebit extends com.stripe.android.model.PaymentMethod.TypeData {
        
        /**
         * Bank code of bank associated with the bank account.
         *
         * [sepa_debit.bank_code](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-bank_code)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bankCode = null;
        
        /**
         * Branch code of bank associated with the bank account.
         *
         * [sepa_debit.branch_code](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-branch_code)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String branchCode = null;
        
        /**
         * Two-letter ISO code representing the country the bank account is located in.
         *
         * [sepa_debit.country](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-country)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String country = null;
        
        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are the same.
         *
         * [sepa_debit.fingerprint](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-fingerprint)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String fingerprint = null;
        
        /**
         * Last four characters of the IBAN.
         *
         * [sepa_debit.last4](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-last4)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String last4 = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.SepaDebit> CREATOR = null;
        
        /**
         * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
         *
         * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.SepaDebit copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bankCode, @org.jetbrains.annotations.Nullable()
        java.lang.String branchCode, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4) {
            return null;
        }
        
        /**
         * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
         *
         * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
         *
         * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
         *
         * [sepa_debit](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SepaDebit(@org.jetbrains.annotations.Nullable()
        java.lang.String bankCode, @org.jetbrains.annotations.Nullable()
        java.lang.String branchCode, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4) {
            super();
        }
        
        /**
         * Bank code of bank associated with the bank account.
         *
         * [sepa_debit.bank_code](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-bank_code)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * Branch code of bank associated with the bank account.
         *
         * [sepa_debit.branch_code](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-branch_code)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * Two-letter ISO code representing the country the bank account is located in.
         *
         * [sepa_debit.country](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-country)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are the same.
         *
         * [sepa_debit.fingerprint](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-fingerprint)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Last four characters of the IBAN.
         *
         * [sepa_debit.last4](https://stripe.com/docs/api/payment_methods/object#payment_method_object-sepa_debit-last4)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.SepaDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.SepaDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.SepaDebit[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bsbNumber", "", "fingerprint", "last4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class AuBecsDebit extends com.stripe.android.model.PaymentMethod.TypeData {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bsbNumber = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String fingerprint = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String last4 = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.AuBecsDebit> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.AuBecsDebit copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bsbNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4) {
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
        public AuBecsDebit(@org.jetbrains.annotations.Nullable()
        java.lang.String bsbNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.AuBecsDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.AuBecsDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.AuBecsDebit[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "fingerprint", "", "last4", "sortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class BacsDebit extends com.stripe.android.model.PaymentMethod.TypeData {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String fingerprint = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String last4 = null;
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String sortCode = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.BacsDebit> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.BacsDebit copy(@org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        java.lang.String sortCode) {
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
        
        public BacsDebit(@org.jetbrains.annotations.Nullable()
        java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        java.lang.String sortCode) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.BacsDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.BacsDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.BacsDebit[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "country", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Sofort extends com.stripe.android.model.PaymentMethod.TypeData {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String country = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Sofort> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Sofort copy(@org.jetbrains.annotations.Nullable()
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
        
        public Sofort(@org.jetbrains.annotations.Nullable()
        java.lang.String country) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Sofort> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Sofort createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Sofort[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "vpa", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Upi extends com.stripe.android.model.PaymentMethod.TypeData {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String vpa = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Upi> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Upi copy(@org.jetbrains.annotations.Nullable()
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Upi> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Upi createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Upi[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Netbanking extends com.stripe.android.model.PaymentMethod.TypeData {
        
        /**
         * The customer’s bank.
         *
         * [netbanking.bank](https://stripe.com/docs/payments/netbanking/banks)
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final java.lang.String bank = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Netbanking> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Netbanking copy(@org.jetbrains.annotations.Nullable()
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
        
        public Netbanking(@org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
            super();
        }
        
        /**
         * The customer’s bank.
         *
         * [netbanking.bank](https://stripe.com/docs/payments/netbanking/banks)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Type getType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PaymentMethod.Netbanking> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Netbanking createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PaymentMethod.Netbanking[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.PaymentMethod fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject paymentMethod) {
            return null;
        }
    }
}