package com.stripe.android.exception;

import java.lang.System;

/**
 * A type of [AuthenticationException] resulting from incorrect permissions
 * to perform the requested action.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/exception/PermissionException;", "Lcom/stripe/android/exception/StripeException;", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "(Lcom/stripe/android/StripeError;Ljava/lang/String;)V", "payments-core_debug"})
public final class PermissionException extends com.stripe.android.exception.StripeException {
    
    public PermissionException(@org.jetbrains.annotations.NotNull()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId) {
        super(null, null, 0, null, null);
    }
}