package com.stripe.android;

import java.lang.System;

/**
 * Utility class for functions to do with cards.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/CardUtils;", "", "()V", "getPossibleCardBrand", "Lcom/stripe/android/model/CardBrand;", "cardNumber", "", "isValidLuhnNumber", "", "isValidLuhnNumber$payments_core_debug", "payments-core_debug"})
public final class CardUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.CardUtils INSTANCE = null;
    
    private CardUtils() {
        super();
    }
    
    /**
     * @param cardNumber a full or partial card number
     * @return the [CardBrand] that matches the card number based on prefixes,
     * or [CardBrand.Unknown] if it can't be determined
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static final com.stripe.android.model.CardBrand getPossibleCardBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String cardNumber) {
        return null;
    }
    
    /**
     * Checks the input string to see whether or not it is a valid Luhn number.
     *
     * @param cardNumber a String that may or may not represent a valid Luhn number
     * @return `true` if and only if the input value is a valid Luhn number
     */
    public final boolean isValidLuhnNumber$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String cardNumber) {
        return false;
    }
}