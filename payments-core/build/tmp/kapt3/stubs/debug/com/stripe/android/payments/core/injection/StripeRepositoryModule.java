package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * A [Module] to provide [StripeRepository] and its corresponding dependencies.
 * [Context], [Logger], [PUBLISHABLE_KEY], [PRODUCT_USAGE] and [IOContext] need to be
 * provided elsewhere to use this module.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;", "", "()V", "bindsAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "default", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "bindsAnalyticsRequestExecutor$payments_core_debug", "bindsStripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "stripeApiRepository", "Lcom/stripe/android/networking/StripeApiRepository;", "bindsStripeRepository$payments_core_debug", "payments-core_debug"})
@dagger.Module()
public abstract class StripeRepositoryModule {
    
    public StripeRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.core.networking.AnalyticsRequestExecutor bindsAnalyticsRequestExecutor$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor p0_772401952);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.networking.StripeRepository bindsStripeRepository$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeApiRepository stripeApiRepository);
}