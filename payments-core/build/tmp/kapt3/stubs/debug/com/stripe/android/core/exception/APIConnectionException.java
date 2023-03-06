package com.stripe.android.core.exception;

import java.lang.System;

/**
 * An [Exception] that represents a failure to connect to Stripe's API.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/exception/StripeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "payments-core_debug"})
public final class APIConnectionException extends com.stripe.android.exception.StripeException {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.core.exception.APIConnectionException.Companion Companion = null;
    
    public APIConnectionException() {
        super(null, null, 0, null, null);
    }
    
    public APIConnectionException(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super(null, null, 0, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/core/exception/APIConnectionException$Companion;", "", "()V", "create", "Lcom/stripe/android/core/exception/APIConnectionException;", "e", "Ljava/io/IOException;", "url", "", "create$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}