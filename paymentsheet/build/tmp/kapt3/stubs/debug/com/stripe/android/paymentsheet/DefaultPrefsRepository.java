package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "context", "Landroid/content/Context;", "customerId", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getKey", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "write", "value", "Companion", "paymentsheet_debug"})
public final class DefaultPrefsRepository implements com.stripe.android.paymentsheet.PrefsRepository {
    private final android.content.Context context = null;
    private final java.lang.String customerId = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final kotlin.Lazy prefs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.paymentsheet.DefaultPrefsRepository.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PREF_FILE = "DefaultPrefsRepository";
    
    public DefaultPrefsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSavedSelection(boolean isGooglePayAvailable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.model.SavedSelection> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void savePaymentSelection(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    private final void write(java.lang.String value) {
    }
    
    private final java.lang.String getKey() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$Companion;", "", "()V", "PREF_FILE", "", "paymentsheet_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}