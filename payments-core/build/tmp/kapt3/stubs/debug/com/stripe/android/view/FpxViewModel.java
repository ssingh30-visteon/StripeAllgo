package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u00a2\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/view/FpxViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "publishableKey", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Landroid/app/Application;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)V", "selectedPosition", "", "getSelectedPosition$payments_core_debug", "()Ljava/lang/Integer;", "setSelectedPosition$payments_core_debug", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFpxBankStatues", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatues$payments_core_debug", "Factory", "payments-core_debug"})
public final class FpxViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String publishableKey = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedPosition;
    
    public FpxViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedPosition$payments_core_debug() {
        return null;
    }
    
    public final void setSelectedPosition$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/FpxViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.app.Application application = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}