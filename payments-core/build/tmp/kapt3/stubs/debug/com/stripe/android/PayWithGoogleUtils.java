package com.stripe.android;

import java.lang.System;

/**
 * Public utility class for common Pay with Google-related tasks.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PayWithGoogleUtils;", "", "()V", "getPriceString", "", "price", "", "currency", "Ljava/util/Currency;", "payments-core_debug"})
public final class PayWithGoogleUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PayWithGoogleUtils INSTANCE = null;
    
    private PayWithGoogleUtils() {
        super();
    }
    
    /**
     * Converts an integer price in the lowest currency denomination to a Google string value.
     * For instance: (100L, USD) -> "1.00", but (100L, JPY) -> "100".
     * @param price the price in the lowest available currency denomination
     * @param currency the [Currency] used to determine how many digits after the decimal
     * @return a String that can be used as a Pay with Google price string
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getPriceString(int price, @org.jetbrains.annotations.NotNull()
    java.util.Currency currency) {
        return null;
    }
}