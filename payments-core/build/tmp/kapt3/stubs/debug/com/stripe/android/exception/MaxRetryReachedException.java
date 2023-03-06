package com.stripe.android.exception;

import java.lang.System;

/**
 * An [Exception] that represents max retry is reached when making a request.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/exception/MaxRetryReachedException;", "Lcom/stripe/android/exception/StripeException;", "message", "", "(Ljava/lang/String;)V", "payments-core_debug"})
public final class MaxRetryReachedException extends com.stripe.android.exception.StripeException {
    
    public MaxRetryReachedException() {
        super(null, null, 0, null, null);
    }
    
    public MaxRetryReachedException(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super(null, null, 0, null, null);
    }
}