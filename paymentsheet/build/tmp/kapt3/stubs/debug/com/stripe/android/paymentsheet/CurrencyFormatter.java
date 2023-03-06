package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "", "()V", "format", "", "amount", "", "amountCurrency", "Ljava/util/Currency;", "targetLocale", "Ljava/util/Locale;", "amountCurrencyCode", "getDefaultDecimalDigits", "", "currency", "Companion", "paymentsheet_debug"})
public final class CurrencyFormatter {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.CurrencyFormatter.Companion Companion = null;
    private static final double MAJOR_UNIT_BASE = 10.0;
    private static final java.util.Map<java.util.Set<java.lang.String>, java.lang.Integer> SERVER_DECIMAL_DIGITS = null;
    
    public CurrencyFormatter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String amountCurrencyCode, @org.jetbrains.annotations.NotNull()
    java.util.Locale targetLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(long amount, @org.jetbrains.annotations.NotNull()
    java.util.Currency amountCurrency, @org.jetbrains.annotations.NotNull()
    java.util.Locale targetLocale) {
        return null;
    }
    
    private final int getDefaultDecimalDigits(java.util.Currency currency) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/CurrencyFormatter$Companion;", "", "()V", "MAJOR_UNIT_BASE", "", "SERVER_DECIMAL_DIGITS", "", "", "", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}