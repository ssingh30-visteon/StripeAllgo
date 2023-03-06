package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Mark a class that can be injected by a [Injector].
 * This should be implemented by classes that cannot directly have their dependencies injected
 * through constructor and need to have them injected through lateinit properties.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/Injectable;", "FallbackInitializeParam", "", "fallbackInitialize", "", "arg", "(Ljava/lang/Object;)V", "payments-core_debug"})
public abstract interface Injectable<FallbackInitializeParam extends java.lang.Object> {
    
    /**
     * Fallback initialization logic for the dependencies when [Injector] is not available. This
     * could happen when the app process is killed and static [Injector]s are cleared up.
     *
     * An [Injectable] should check when this happens and calls this function manually.
     */
    public abstract void fallbackInitialize(FallbackInitializeParam arg);
}