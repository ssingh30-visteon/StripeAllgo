package com.stripe.android.paymentsheet.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "", "get", "Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
public abstract interface DeviceIdRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.analytics.DeviceId> continuation);
}