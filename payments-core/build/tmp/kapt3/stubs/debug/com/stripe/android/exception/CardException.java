package com.stripe.android.exception;

import java.lang.System;

/**
 * An [Exception] indicating that there is a problem with a Card used for a request.
 * Card errors are the most common type of error you should expect to handle.
 * They result when the user enters a card that can't be charged for some reason.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/exception/CardException;", "Lcom/stripe/android/exception/StripeException;", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "(Lcom/stripe/android/StripeError;Ljava/lang/String;)V", "charge", "getCharge", "()Ljava/lang/String;", "code", "getCode", "declineCode", "getDeclineCode", "param", "getParam", "payments-core_debug"})
public final class CardException extends com.stripe.android.exception.StripeException {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String param = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String declineCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String charge = null;
    
    public CardException(@org.jetbrains.annotations.NotNull()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId) {
        super(null, null, 0, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeclineCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCharge() {
        return null;
    }
}