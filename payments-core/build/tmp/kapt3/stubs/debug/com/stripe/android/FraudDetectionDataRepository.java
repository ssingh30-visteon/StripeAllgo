package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/FraudDetectionDataRepository;", "", "getCached", "Lcom/stripe/android/networking/FraudDetectionData;", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "", "save", "fraudDetectionData", "payments-core_debug"})
public abstract interface FraudDetectionDataRepository {
    
    public abstract void refresh();
    
    /**
     * Get the cached [FraudDetectionData]. This is not a blocking request.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.networking.FraudDetectionData getCached();
    
    /**
     * Get the latest [FraudDetectionData]. This is a blocking request.
     *
     * 1. From [FraudDetectionDataStore] if that value is not expired.
     * 2. Otherwise, from the network.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.networking.FraudDetectionData> continuation);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionData fraudDetectionData);
}