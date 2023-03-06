package com.stripe.android.core.exception;

import java.lang.System;

/**
 * A [StripeException] indicating that invalid parameters were used in a request.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/core/exception/InvalidRequestException;", "Lcom/stripe/android/exception/StripeException;", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "statusCode", "", "message", "cause", "", "(Lcom/stripe/android/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "payments-core_debug"})
public final class InvalidRequestException extends com.stripe.android.exception.StripeException {
    
    public InvalidRequestException() {
        super(null, null, 0, null, null);
    }
    
    public InvalidRequestException(@org.jetbrains.annotations.Nullable()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId, int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super(null, null, 0, null, null);
    }
}