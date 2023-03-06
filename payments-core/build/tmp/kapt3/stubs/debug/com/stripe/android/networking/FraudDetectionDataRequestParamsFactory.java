package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B)\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002J#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000\u00a2\u0006\u0002\b\u0013J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0002R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "packageName", "", "versionName", "timeZone", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "androidVersionString", "screen", "createFirstMap", "", "createParams", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "createParams$payments_core_debug", "createSecondMap", "createValueMap", "value", "Companion", "payments-core_debug"})
public final class FraudDetectionDataRequestParamsFactory {
    private final android.util.DisplayMetrics displayMetrics = null;
    private final java.lang.String packageName = null;
    private final java.lang.String versionName = null;
    private final java.lang.String timeZone = null;
    private final java.lang.String screen = null;
    private final java.lang.String androidVersionString = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.networking.FraudDetectionDataRequestParamsFactory.Companion Companion = null;
    
    @androidx.annotation.VisibleForTesting()
    public FraudDetectionDataRequestParamsFactory(@org.jetbrains.annotations.NotNull()
    android.util.DisplayMetrics displayMetrics, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.Nullable()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    java.lang.String timeZone) {
        super();
    }
    
    public FraudDetectionDataRequestParamsFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createFirstMap() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createSecondMap(com.stripe.android.networking.FraudDetectionData fraudDetectionData) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createValueMap(java.lang.String value) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory$Companion;", "", "()V", "createTimezone", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String createTimezone() {
            return null;
        }
    }
}