package com.stripe.android.core.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0010\u00a2\u0006\u0002\u0010\u0002B\u0019\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "()V", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;)V", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/Logger;)V", "executeAsync", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "payments-core_debug"})
public final class DefaultAnalyticsRequestExecutor implements com.stripe.android.core.networking.AnalyticsRequestExecutor {
    private final com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final com.stripe.android.Logger logger = null;
    
    public DefaultAnalyticsRequestExecutor(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    public DefaultAnalyticsRequestExecutor() {
        super();
    }
    
    @javax.inject.Inject()
    public DefaultAnalyticsRequestExecutor(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    /**
     * Make the request and ignore the response.
     */
    @java.lang.Override()
    public void executeAsync(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequest request) {
    }
}