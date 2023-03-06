package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/FraudDetectionDataStore;", "", "get", "Lcom/stripe/android/networking/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "fraudDetectionData", "payments-core_debug"})
public abstract interface FraudDetectionDataStore {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.networking.FraudDetectionData> continuation);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionData fraudDetectionData);
}