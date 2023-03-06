package com.stripe.android.exception;

import java.lang.System;

/**
 * An [Exception] indicating that too many requests have hit the API too quickly.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/exception/RateLimitException;", "Lcom/stripe/android/exception/StripeException;", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "message", "cause", "", "(Lcom/stripe/android/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "payments-core_debug"})
public final class RateLimitException extends com.stripe.android.exception.StripeException {
    
    public RateLimitException() {
        super(null, null, 0, null, null);
    }
    
    public RateLimitException(@org.jetbrains.annotations.Nullable()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super(null, null, 0, null, null);
    }
}