package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Mark a class that can inject into [Injectable]s.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/core/injection/Injector;", "", "inject", "", "injectable", "Lcom/stripe/android/payments/core/injection/Injectable;", "payments-core_debug"})
public abstract interface Injector {
    
    /**
     * Injects into a [Injectable] instance.
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<?> injectable);
}