package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository;", "", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Noop", "paymentsheet_debug"})
public abstract interface PrefsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSavedSelection(boolean isGooglePayAvailable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.model.SavedSelection> continuation);
    
    public abstract void savePaymentSelection(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PrefsRepository$Noop;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "()V", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_debug"})
    public static final class Noop implements com.stripe.android.paymentsheet.PrefsRepository {
        
        public Noop() {
            super();
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
    }
}