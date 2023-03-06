package com.stripe.android.exception;

import java.lang.System;

/**
 * An [Exception] that represents an internal problem with Stripe's servers.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B?\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/exception/APIException;", "Lcom/stripe/android/exception/StripeException;", "throwable", "", "(Ljava/lang/Throwable;)V", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "statusCode", "", "message", "cause", "(Lcom/stripe/android/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "payments-core_debug"})
public final class APIException extends com.stripe.android.exception.StripeException {
    
    public APIException() {
        super(null, null, 0, null, null);
    }
    
    public APIException(@org.jetbrains.annotations.Nullable()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId, int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super(null, null, 0, null, null);
    }
    
    public APIException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        super(null, null, 0, null, null);
    }
}