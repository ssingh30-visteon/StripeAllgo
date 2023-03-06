package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e0\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "", "create", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "arg", "Lcom/stripe/android/networking/FraudDetectionData;", "payments-core_debug"})
public abstract interface FraudDetectionDataRequestFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.networking.FraudDetectionDataRequest create(@org.jetbrains.annotations.Nullable()
    com.stripe.android.networking.FraudDetectionData arg);
}