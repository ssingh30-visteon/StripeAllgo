package com.stripe.android.model;

import java.lang.System;

/**
 * [Create a card token](https://stripe.com/docs/api/tokens/create_card)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MBg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eB\u007f\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0013J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c2\u0003J\u000e\u00106\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b;J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b=J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0089\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001bR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010)\u00a8\u0006N"}, d2 = {"Lcom/stripe/android/model/CardParams;", "Lcom/stripe/android/model/TokenParams;", "number", "", "expMonth", "", "expYear", "cvc", "name", "address", "Lcom/stripe/android/model/Address;", "currency", "metadata", "", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "brand", "Lcom/stripe/android/model/CardBrand;", "loggingTokens", "", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCvc$payments_core_debug", "setCvc$payments_core_debug", "getExpMonth$payments_core_debug", "()I", "setExpMonth$payments_core_debug", "(I)V", "getExpYear$payments_core_debug", "setExpYear$payments_core_debug", "last4", "getLast4", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getName", "setName", "getNumber$payments_core_debug", "setNumber$payments_core_debug", "typeDataParams", "", "getTypeDataParams", "component1", "component10", "component2", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class CardParams extends com.stripe.android.model.TokenParams {
    
    /**
     * The likely [CardBrand] based on the [number].
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.CardBrand brand = null;
    private final java.util.Set<java.lang.String> loggingTokens = null;
    
    /**
     * [card.number](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-number)
     *
     * Required
     *
     * The card number, as a string without any separators.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String number;
    
    /**
     * [card.exp_month](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_month)
     *
     * Required
     *
     * Two-digit number representing the card's expiration month.
     */
    private int expMonth;
    
    /**
     * [card.exp_year](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_year)
     *
     * Required
     *
     * Two- or four-digit number representing the card's expiration year.
     */
    private int expYear;
    
    /**
     * [card.cvc](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-cvc)
     *
     * Usually required
     *
     * Card security code. Highly recommended to always include this value, but it's required only
     * for accounts based in European countries.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cvc;
    
    /**
     * [card.name](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-name)
     *
     * Optional
     *
     * Cardholder's full name.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.Address address;
    
    /**
     * [card.currency](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-currency)
     *
     * Optional - Custom Connect Only
     *
     * Required in order to add the card to an account; in all other cases, this parameter is
     * not used. When added to an account, the card (which must be a debit card) can be used
     * as a transfer destination for funds in this currency. Currently, the only supported
     * currency for debit card payouts is `usd`.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency;
    
    /**
     * [card.metadata](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-metadata)
     *
     * Optional
     *
     * A set of key-value pairs that you can attach to a card object. This can be useful for
     * storing additional information about the card in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> metadata;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.CardParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_NUMBER = "number";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_EXP_MONTH = "exp_month";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_EXP_YEAR = "exp_year";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CVC = "cvc";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_NAME = "name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_LINE1 = "address_line1";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_LINE2 = "address_line2";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_CITY = "address_city";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_STATE = "address_state";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_ZIP = "address_zip";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_COUNTRY = "address_country";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CURRENCY = "currency";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_METADATA = "metadata";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.CardParams> CREATOR = null;
    
    /**
     * [Create a card token](https://stripe.com/docs/api/tokens/create_card)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardParams copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> loggingTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        return null;
    }
    
    /**
     * [Create a card token](https://stripe.com/docs/api/tokens/create_card)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [Create a card token](https://stripe.com/docs/api/tokens/create_card)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [Create a card token](https://stripe.com/docs/api/tokens/create_card)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CardParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> loggingTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        super(null, null);
    }
    
    /**
     * The likely [CardBrand] based on the [number].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand component1() {
        return null;
    }
    
    /**
     * The likely [CardBrand] based on the [number].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getBrand() {
        return null;
    }
    
    private final java.util.Set<java.lang.String> component2() {
        return null;
    }
    
    /**
     * [card.number](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-number)
     *
     * Required
     *
     * The card number, as a string without any separators.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3$payments_core_debug() {
        return null;
    }
    
    /**
     * [card.number](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-number)
     *
     * Required
     *
     * The card number, as a string without any separators.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber$payments_core_debug() {
        return null;
    }
    
    /**
     * [card.number](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-number)
     *
     * Required
     *
     * The card number, as a string without any separators.
     */
    public final void setNumber$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * [card.exp_month](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_month)
     *
     * Required
     *
     * Two-digit number representing the card's expiration month.
     */
    public final int component4$payments_core_debug() {
        return 0;
    }
    
    /**
     * [card.exp_month](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_month)
     *
     * Required
     *
     * Two-digit number representing the card's expiration month.
     */
    public final int getExpMonth$payments_core_debug() {
        return 0;
    }
    
    /**
     * [card.exp_month](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_month)
     *
     * Required
     *
     * Two-digit number representing the card's expiration month.
     */
    public final void setExpMonth$payments_core_debug(int p0) {
    }
    
    /**
     * [card.exp_year](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_year)
     *
     * Required
     *
     * Two- or four-digit number representing the card's expiration year.
     */
    public final int component5$payments_core_debug() {
        return 0;
    }
    
    /**
     * [card.exp_year](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_year)
     *
     * Required
     *
     * Two- or four-digit number representing the card's expiration year.
     */
    public final int getExpYear$payments_core_debug() {
        return 0;
    }
    
    /**
     * [card.exp_year](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-exp_year)
     *
     * Required
     *
     * Two- or four-digit number representing the card's expiration year.
     */
    public final void setExpYear$payments_core_debug(int p0) {
    }
    
    /**
     * [card.cvc](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-cvc)
     *
     * Usually required
     *
     * Card security code. Highly recommended to always include this value, but it's required only
     * for accounts based in European countries.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6$payments_core_debug() {
        return null;
    }
    
    /**
     * [card.cvc](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-cvc)
     *
     * Usually required
     *
     * Card security code. Highly recommended to always include this value, but it's required only
     * for accounts based in European countries.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCvc$payments_core_debug() {
        return null;
    }
    
    /**
     * [card.cvc](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-cvc)
     *
     * Usually required
     *
     * Card security code. Highly recommended to always include this value, but it's required only
     * for accounts based in European countries.
     */
    public final void setCvc$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * [card.name](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-name)
     *
     * Optional
     *
     * Cardholder's full name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * [card.name](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-name)
     *
     * Optional
     *
     * Cardholder's full name.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * [card.name](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-name)
     *
     * Optional
     *
     * Cardholder's full name.
     */
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address p0) {
    }
    
    /**
     * [card.currency](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-currency)
     *
     * Optional - Custom Connect Only
     *
     * Required in order to add the card to an account; in all other cases, this parameter is
     * not used. When added to an account, the card (which must be a debit card) can be used
     * as a transfer destination for funds in this currency. Currently, the only supported
     * currency for debit card payouts is `usd`.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * [card.currency](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-currency)
     *
     * Optional - Custom Connect Only
     *
     * Required in order to add the card to an account; in all other cases, this parameter is
     * not used. When added to an account, the card (which must be a debit card) can be used
     * as a transfer destination for funds in this currency. Currently, the only supported
     * currency for debit card payouts is `usd`.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * [card.currency](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-currency)
     *
     * Optional - Custom Connect Only
     *
     * Required in order to add the card to an account; in all other cases, this parameter is
     * not used. When added to an account, the card (which must be a debit card) can be used
     * as a transfer destination for funds in this currency. Currently, the only supported
     * currency for debit card payouts is `usd`.
     */
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * [card.metadata](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-metadata)
     *
     * Optional
     *
     * A set of key-value pairs that you can attach to a card object. This can be useful for
     * storing additional information about the card in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component10() {
        return null;
    }
    
    /**
     * [card.metadata](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-metadata)
     *
     * Optional
     *
     * A set of key-value pairs that you can attach to a card object. This can be useful for
     * storing additional information about the card in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return null;
    }
    
    /**
     * [card.metadata](https://stripe.com/docs/api/tokens/create_card#create_card_token-card-metadata)
     *
     * Optional
     *
     * A set of key-value pairs that you can attach to a card object. This can be useful for
     * storing additional information about the card in a structured format.
     */
    public final void setMetadata(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast4() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String currency) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardParams(@org.jetbrains.annotations.NotNull()
    java.lang.String number, int expMonth, int expYear, @org.jetbrains.annotations.Nullable()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getTypeDataParams() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.CardParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.CardParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.CardParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/CardParams$Companion;", "", "()V", "PARAM_ADDRESS_CITY", "", "PARAM_ADDRESS_COUNTRY", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_METADATA", "PARAM_NAME", "PARAM_NUMBER", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}