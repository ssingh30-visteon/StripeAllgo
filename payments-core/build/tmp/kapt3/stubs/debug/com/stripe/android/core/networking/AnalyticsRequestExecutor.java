package com.stripe.android.core.networking;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e7\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "", "executeAsync", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "payments-core_debug"})
public abstract interface AnalyticsRequestExecutor {
    
    /**
     * Execute the fire-and-forget request asynchronously.
     */
    public abstract void executeAsync(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequest request);
}