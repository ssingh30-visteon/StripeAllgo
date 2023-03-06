package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fraudDetectionDataRequestParamsFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "(Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;)V", "create", "Lcom/stripe/android/networking/FraudDetectionDataRequest;", "arg", "Lcom/stripe/android/networking/FraudDetectionData;", "payments-core_debug"})
public final class DefaultFraudDetectionDataRequestFactory implements com.stripe.android.networking.FraudDetectionDataRequestFactory {
    private final com.stripe.android.networking.FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory = null;
    
    @androidx.annotation.VisibleForTesting()
    public DefaultFraudDetectionDataRequestFactory(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory) {
        super();
    }
    
    public DefaultFraudDetectionDataRequestFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.networking.FraudDetectionDataRequest create(@org.jetbrains.annotations.Nullable()
    com.stripe.android.networking.FraudDetectionData arg) {
        return null;
    }
}