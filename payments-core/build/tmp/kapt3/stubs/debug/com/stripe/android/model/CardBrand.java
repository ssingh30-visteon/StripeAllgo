package com.stripe.android.model;

import java.lang.System;

/**
 * A representation of supported card brands and related data
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001/B\u0085\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0003J\u0010\u0010$\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.\u00a8\u00060"}, d2 = {"Lcom/stripe/android/model/CardBrand;", "", "code", "", "displayName", "icon", "", "cvcIcon", "errorIcon", "cvcLength", "", "defaultMaxLength", "pattern", "Ljava/util/regex/Pattern;", "partialPatterns", "", "variantMaxLength", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;)V", "getCode", "()Ljava/lang/String;", "getCvcIcon", "()I", "getCvcLength", "()Ljava/util/Set;", "getDisplayName", "getErrorIcon", "getIcon", "maxCvcLength", "getMaxCvcLength", "getMaxLengthForCardNumber", "cardNumber", "getMaxLengthForCardNumber$payments_core_debug", "getPatternForLength", "isMaxCvc", "", "cvcText", "isValidCardNumberLength", "isValidCvc", "cvc", "AmericanExpress", "Discover", "JCB", "DinersClub", "Visa", "MasterCard", "UnionPay", "Unknown", "Companion", "payments-core_debug"})
public enum CardBrand {
    /*public static final*/ AmericanExpress /* = new AmericanExpress(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ Discover /* = new Discover(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ JCB /* = new JCB(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ DinersClub /* = new DinersClub(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ Visa /* = new Visa(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ MasterCard /* = new MasterCard(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ UnionPay /* = new UnionPay(null, null, 0, 0, 0, null, 0, null, null, null) */,
    /*public static final*/ Unknown /* = new Unknown(null, null, 0, 0, 0, null, 0, null, null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayName = null;
    private final int icon = 0;
    private final int cvcIcon = 0;
    private final int errorIcon = 0;
    
    /**
     * Accepted CVC lengths
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Integer> cvcLength = null;
    
    /**
     * The default max length when the card number is formatted without spaces (e.g. "4242424242424242")
     *
     * Note that [CardBrand.DinersClub]'s max length depends on the BIN (e.g. card number prefix).
     * In the case of a [CardBrand.DinersClub] card, use [getMaxLengthForCardNumber].
     */
    private final int defaultMaxLength = 0;
    
    /**
     * Based on [Issuer identification number table](http://en.wikipedia.org/wiki/Bank_card_number#Issuer_identification_number_.28IIN.29)
     */
    private final java.util.regex.Pattern pattern = null;
    
    /**
     * Patterns for discrete lengths
     */
    private final java.util.Map<java.lang.Integer, java.util.regex.Pattern> partialPatterns = null;
    
    /**
     * By default, a [CardBrand] does not have variants.
     */
    private final java.util.Map<java.util.regex.Pattern, java.lang.Integer> variantMaxLength = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.CardBrand.Companion Companion = null;
    private static final int CVC_COMMON_LENGTH = 3;
    
    CardBrand(java.lang.String code, java.lang.String displayName, @androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.DrawableRes()
    int cvcIcon, @androidx.annotation.DrawableRes()
    int errorIcon, java.util.Set<java.lang.Integer> cvcLength, int defaultMaxLength, java.util.regex.Pattern pattern, java.util.Map<java.lang.Integer, java.util.regex.Pattern> partialPatterns, java.util.Map<java.util.regex.Pattern, java.lang.Integer> variantMaxLength) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final int getCvcIcon() {
        return 0;
    }
    
    public final int getErrorIcon() {
        return 0;
    }
    
    /**
     * Accepted CVC lengths
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getCvcLength() {
        return null;
    }
    
    public final int getMaxCvcLength() {
        return 0;
    }
    
    /**
     * Checks to see whether the input number is of the correct length, given the assumed brand of
     * the card. This function does not perform a Luhn check.
     *
     * @param cardNumber the card number with no spaces or dashes
     * @return `true` if the card number is the correct length for the assumed brand
     */
    public final boolean isValidCardNumberLength(@org.jetbrains.annotations.Nullable()
    java.lang.String cardNumber) {
        return false;
    }
    
    public final boolean isValidCvc(@org.jetbrains.annotations.NotNull()
    java.lang.String cvc) {
        return false;
    }
    
    public final boolean isMaxCvc(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcText) {
        return false;
    }
    
    /**
     * If the [CardBrand] has variants, and the [cardNumber] starts with one of the variant
     * prefixes, return the length for that variant. Otherwise, return [defaultMaxLength].
     *
     * Note: currently only [CardBrand.DinersClub] has variants
     */
    public final int getMaxLengthForCardNumber$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String cardNumber) {
        return 0;
    }
    
    private final java.util.regex.Pattern getPatternForLength(java.lang.String cardNumber) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\tJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/CardBrand$Companion;", "", "()V", "CVC_COMMON_LENGTH", "", "fromCardNumber", "Lcom/stripe/android/model/CardBrand;", "cardNumber", "", "fromCardNumber$payments_core_debug", "fromCode", "code", "getCardBrands", "", "getCardBrands$payments_core_debug", "getMatchingCards", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @param cardNumber a card number
         * @return the [CardBrand] that matches the [cardNumber]'s prefix, if one is found;
         * otherwise, [CardBrand.Unknown]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand fromCardNumber$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String cardNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.CardBrand> getCardBrands$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String cardNumber) {
            return null;
        }
        
        private final java.util.List<com.stripe.android.model.CardBrand> getMatchingCards(java.lang.String cardNumber) {
            return null;
        }
        
        /**
         * @param code a brand code, such as `Visa` or `American Express`.
         * See [PaymentMethod.Card.brand].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand fromCode(@org.jetbrains.annotations.Nullable()
        java.lang.String code) {
            return null;
        }
    }
}