package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs;", "", "getPaymentMethodId", "", "customerId", "savePaymentMethodId", "", "paymentMethodId", "Companion", "Default", "payments-core_debug"})
public abstract interface PaymentSessionPrefs {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PaymentSessionPrefs.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPaymentMethodId(@org.jetbrains.annotations.Nullable()
    java.lang.String customerId);
    
    public abstract void savePaymentMethodId(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodId);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Default;", "Lcom/stripe/android/PaymentSessionPrefs;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getPaymentMethodId", "", "customerId", "savePaymentMethodId", "", "paymentMethodId", "payments-core_debug"})
    public static final class Default implements com.stripe.android.PaymentSessionPrefs {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy prefs$delegate = null;
        
        public Default(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getPrefs() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getPaymentMethodId(@org.jetbrains.annotations.Nullable()
        java.lang.String customerId) {
            return null;
        }
        
        @java.lang.Override()
        public void savePaymentMethodId(@org.jetbrains.annotations.NotNull()
        java.lang.String customerId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMethodId) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Companion;", "", "()V", "PREF_FILE", "", "getPaymentMethodKey", "customerId", "payments-core_debug"})
    public static final class Companion {
        private static final java.lang.String PREF_FILE = "PaymentSessionPrefs";
        
        private Companion() {
            super();
        }
        
        private final java.lang.String getPaymentMethodKey(java.lang.String customerId) {
            return null;
        }
    }
}