package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataRepository;", "Lcom/stripe/android/FraudDetectionDataRepository;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "localStore", "Lcom/stripe/android/FraudDetectionDataStore;", "fraudDetectionDataRequestFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;)V", "cachedFraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "getCached", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "", "save", "fraudDetectionData", "payments-core_debug"})
public final class DefaultFraudDetectionDataRepository implements com.stripe.android.FraudDetectionDataRepository {
    private final com.stripe.android.FraudDetectionDataStore localStore = null;
    private final com.stripe.android.networking.FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory = null;
    private final com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private com.stripe.android.networking.FraudDetectionData cachedFraudDetectionData;
    
    public DefaultFraudDetectionDataRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataStore localStore, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultFraudDetectionDataRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultFraudDetectionDataRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLatest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.networking.FraudDetectionData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.networking.FraudDetectionData getCached() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionData fraudDetectionData) {
    }
}