package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore;", "Lcom/stripe/android/FraudDetectionDataStore;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/networking/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "fraudDetectionData", "Companion", "payments-core_debug"})
public final class DefaultFraudDetectionDataStore implements com.stripe.android.FraudDetectionDataStore {
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final kotlin.Lazy prefs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.DefaultFraudDetectionDataStore.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PREF_FILE = "FraudDetectionDataStore";
    @java.lang.Deprecated()
    private static final java.lang.String KEY_DATA = "key_fraud_detection_data";
    
    public DefaultFraudDetectionDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.networking.FraudDetectionData> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionData fraudDetectionData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore$Companion;", "", "()V", "KEY_DATA", "", "PREF_FILE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}