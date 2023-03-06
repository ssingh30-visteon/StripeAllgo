package com.stripe.android.model;

import java.lang.System;

/**
 * A representation of a [Card API object](https://stripe.com/docs/api/cards/object).
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u00f9\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0088\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00c6\u0001\u00a2\u0006\u0002\u0010OJ\t\u0010P\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\t\u0010U\u001a\u00020\u0004H\u00d6\u0001J\t\u0010V\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0007\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108\u00a8\u0006]"}, d2 = {"Lcom/stripe/android/model/Card;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "expMonth", "", "expYear", "name", "", "addressLine1", "addressLine1Check", "addressLine2", "addressCity", "addressState", "addressZip", "addressZipCheck", "addressCountry", "last4", "brand", "Lcom/stripe/android/model/CardBrand;", "funding", "Lcom/stripe/android/model/CardFunding;", "fingerprint", "country", "currency", "customerId", "cvcCheck", "id", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)V", "getAddressCity", "()Ljava/lang/String;", "getAddressCountry", "getAddressLine1", "getAddressLine1Check", "getAddressLine2", "getAddressState", "getAddressZip", "getAddressZipCheck", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCountry", "getCurrency", "getCustomerId", "getCvcCheck", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getFingerprint", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getId", "getLast4", "getName", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/Card;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class Card implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripePaymentSource {
    
    /**
     * Two-digit number representing the card’s expiration month.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer expMonth = null;
    
    /**
     * Four-digit number representing the card’s expiration year.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer expYear = null;
    
    /**
     * Cardholder name.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-name).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * Address line 1 (Street address/PO Box/Company name).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressLine1 = null;
    
    /**
     * If address_line1 was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1_check).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressLine1Check = null;
    
    /**
     * Address line 2 (Apartment/Suite/Unit/Building).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line2).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressLine2 = null;
    
    /**
     * City/District/Suburb/Town/Village.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_city).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressCity = null;
    
    /**
     * State/County/Province/Region.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_state).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressState = null;
    
    /**
     * ZIP or postal code.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressZip = null;
    
    /**
     * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip_check).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressZipCheck = null;
    
    /**
     * Billing address country, if provided when creating card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_country).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String addressCountry = null;
    
    /**
     * The last four digits of the card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-last4).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last4 = null;
    
    /**
     * Card brand. See [CardBrand].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-brand).
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.CardBrand brand = null;
    
    /**
     * Card funding type. See [CardFunding].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-funding).
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.CardFunding funding = null;
    
    /**
     * Uniquely identifies this particular card number. You can use this attribute to check whether
     * two customers who’ve signed up with you are using the same card number, for example.
     * For payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized
     * number might be provided instead of the underlying card number.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-fingerprint).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fingerprint = null;
    
    /**
     * Two-letter ISO code representing the country of the card. You could use this
     * attribute to get a sense of the international breakdown of cards you’ve collected.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-country).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    
    /**
     * Three-letter [ISO code for currency](https://stripe.com/docs/payouts). Only
     * applicable on accounts (not customers or recipients). The card can be used as a transfer
     * destination for funds in this currency.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-currency).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currency = null;
    
    /**
     * The ID of the customer that this card belongs to.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-customer).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String customerId = null;
    
    /**
     * If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-cvc_check).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cvcCheck = null;
    
    /**
     * Unique identifier for the object.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-id).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * If the card number is tokenized, this is the method that was used. See [TokenizationMethod].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-tokenization_method).
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.TokenizationMethod tokenizationMethod = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.Card.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Card> CREATOR = null;
    
    /**
     * A representation of a [Card API object](https://stripe.com/docs/api/cards/object).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Card copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer expMonth, @org.jetbrains.annotations.Nullable()
    java.lang.Integer expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
    java.lang.String addressCity, @org.jetbrains.annotations.Nullable()
    java.lang.String addressState, @org.jetbrains.annotations.Nullable()
    java.lang.String addressZip, @org.jetbrains.annotations.Nullable()
    java.lang.String addressZipCheck, @org.jetbrains.annotations.Nullable()
    java.lang.String addressCountry, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 4L)
    java.lang.String last4, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.CardFunding funding, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String cvcCheck, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.TokenizationMethod tokenizationMethod) {
        return null;
    }
    
    /**
     * A representation of a [Card API object](https://stripe.com/docs/api/cards/object).
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A representation of a [Card API object](https://stripe.com/docs/api/cards/object).
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A representation of a [Card API object](https://stripe.com/docs/api/cards/object).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Card(@org.jetbrains.annotations.Nullable()
    java.lang.Integer expMonth, @org.jetbrains.annotations.Nullable()
    java.lang.Integer expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine2, @org.jetbrains.annotations.Nullable()
    java.lang.String addressCity, @org.jetbrains.annotations.Nullable()
    java.lang.String addressState, @org.jetbrains.annotations.Nullable()
    java.lang.String addressZip, @org.jetbrains.annotations.Nullable()
    java.lang.String addressZipCheck, @org.jetbrains.annotations.Nullable()
    java.lang.String addressCountry, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 4L)
    java.lang.String last4, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.CardFunding funding, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String cvcCheck, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.TokenizationMethod tokenizationMethod) {
        super();
    }
    
    /**
     * Two-digit number representing the card’s expiration month.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * Two-digit number representing the card’s expiration month.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.IntRange(from = 1L, to = 12L)
    public final java.lang.Integer getExpMonth() {
        return null;
    }
    
    /**
     * Four-digit number representing the card’s expiration year.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * Four-digit number representing the card’s expiration year.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExpYear() {
        return null;
    }
    
    /**
     * Cardholder name.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-name).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Cardholder name.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-name).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * Address line 1 (Street address/PO Box/Company name).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Address line 1 (Street address/PO Box/Company name).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressLine1() {
        return null;
    }
    
    /**
     * If address_line1 was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * If address_line1 was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line1_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressLine1Check() {
        return null;
    }
    
    /**
     * Address line 2 (Apartment/Suite/Unit/Building).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line2).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Address line 2 (Apartment/Suite/Unit/Building).
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_line2).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressLine2() {
        return null;
    }
    
    /**
     * City/District/Suburb/Town/Village.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_city).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * City/District/Suburb/Town/Village.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_city).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressCity() {
        return null;
    }
    
    /**
     * State/County/Province/Region.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_state).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * State/County/Province/Region.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_state).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressState() {
        return null;
    }
    
    /**
     * ZIP or postal code.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * ZIP or postal code.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressZip() {
        return null;
    }
    
    /**
     * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * If `address_zip` was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_zip_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressZipCheck() {
        return null;
    }
    
    /**
     * Billing address country, if provided when creating card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_country).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * Billing address country, if provided when creating card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-address_country).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressCountry() {
        return null;
    }
    
    /**
     * The last four digits of the card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-last4).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    /**
     * The last four digits of the card.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-last4).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast4() {
        return null;
    }
    
    /**
     * Card brand. See [CardBrand].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-brand).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand component13() {
        return null;
    }
    
    /**
     * Card brand. See [CardBrand].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-brand).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getBrand() {
        return null;
    }
    
    /**
     * Card funding type. See [CardFunding].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-funding).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CardFunding component14() {
        return null;
    }
    
    /**
     * Card funding type. See [CardFunding].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-funding).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CardFunding getFunding() {
        return null;
    }
    
    /**
     * Uniquely identifies this particular card number. You can use this attribute to check whether
     * two customers who’ve signed up with you are using the same card number, for example.
     * For payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized
     * number might be provided instead of the underlying card number.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-fingerprint).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * Uniquely identifies this particular card number. You can use this attribute to check whether
     * two customers who’ve signed up with you are using the same card number, for example.
     * For payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized
     * number might be provided instead of the underlying card number.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-fingerprint).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFingerprint() {
        return null;
    }
    
    /**
     * Two-letter ISO code representing the country of the card. You could use this
     * attribute to get a sense of the international breakdown of cards you’ve collected.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-country).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    /**
     * Two-letter ISO code representing the country of the card. You could use this
     * attribute to get a sense of the international breakdown of cards you’ve collected.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-country).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    /**
     * Three-letter [ISO code for currency](https://stripe.com/docs/payouts). Only
     * applicable on accounts (not customers or recipients). The card can be used as a transfer
     * destination for funds in this currency.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-currency).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    /**
     * Three-letter [ISO code for currency](https://stripe.com/docs/payouts). Only
     * applicable on accounts (not customers or recipients). The card can be used as a transfer
     * destination for funds in this currency.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-currency).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * The ID of the customer that this card belongs to.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-customer).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * The ID of the customer that this card belongs to.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-customer).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerId() {
        return null;
    }
    
    /**
     * If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-cvc_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    /**
     * If a CVC was provided, results of the check: `pass`, `fail`, `unavailable`,
     * or `unchecked`.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-cvc_check).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCvcCheck() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-id).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-id).
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    /**
     * If the card number is tokenized, this is the method that was used. See [TokenizationMethod].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-tokenization_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.TokenizationMethod component21() {
        return null;
    }
    
    /**
     * If the card number is tokenized, this is the method that was used. See [TokenizationMethod].
     *
     * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-tokenization_method).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.TokenizationMethod getTokenizationMethod() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Card> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Card createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Card[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/Card$Companion;", "", "()V", "getCardBrand", "Lcom/stripe/android/model/CardBrand;", "brandName", "", "getCardBrand$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}