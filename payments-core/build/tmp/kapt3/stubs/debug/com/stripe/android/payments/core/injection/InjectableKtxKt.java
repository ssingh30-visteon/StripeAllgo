package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"injectWithFallback", "", "FallbackInitializeParam", "Lcom/stripe/android/payments/core/injection/Injectable;", "injectorKey", "", "fallbackInitializeParam", "(Lcom/stripe/android/payments/core/injection/Injectable;Ljava/lang/String;Ljava/lang/Object;)V", "payments-core_debug"})
public final class InjectableKtxKt {
    
    /**
     * Try use an [InjectorKey] to retrieve an [Injector] and inject, if no [Injector] is found,
     * invoke [Injectable.fallbackInitialize] with [fallbackInitializeParam].
     */
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final <FallbackInitializeParam extends java.lang.Object>void injectWithFallback(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<FallbackInitializeParam> $this$injectWithFallback, @org.jetbrains.annotations.Nullable()
    @InjectorKey()
    java.lang.String injectorKey, FallbackInitializeParam fallbackInitializeParam) {
    }
}