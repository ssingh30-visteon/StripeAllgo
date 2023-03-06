package com.stripe.android.exception;

import java.lang.System;

/**
 * A base class for Stripe-related exceptions.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000 \u001e2\u00060\u0001j\u0002`\u0002:\u0001\u001eB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "stripeError", "Lcom/stripe/android/StripeError;", "requestId", "", "statusCode", "", "cause", "", "message", "(Lcom/stripe/android/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "isClientError", "", "isClientError$payments_core_debug", "()Z", "getRequestId", "()Ljava/lang/String;", "getStatusCode", "()I", "getStripeError", "()Lcom/stripe/android/StripeError;", "equals", "other", "", "hashCode", "toString", "typedEquals", "ex", "Companion", "payments-core_debug"})
public abstract class StripeException extends java.lang.Exception {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.StripeError stripeError = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String requestId = null;
    private final int statusCode = 0;
    private final boolean isClientError = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.exception.StripeException.Companion Companion = null;
    
    public StripeException() {
        super();
    }
    
    public StripeException(@org.jetbrains.annotations.Nullable()
    com.stripe.android.StripeError stripeError, @org.jetbrains.annotations.Nullable()
    java.lang.String requestId, int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.StripeError getStripeError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequestId() {
        return null;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final boolean isClientError$payments_core_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    private final boolean typedEquals(com.stripe.android.exception.StripeException ex) {
        return false;
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/exception/StripeException$Companion;", "", "()V", "create", "Lcom/stripe/android/exception/StripeException;", "throwable", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.exception.StripeException create(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
    }
}