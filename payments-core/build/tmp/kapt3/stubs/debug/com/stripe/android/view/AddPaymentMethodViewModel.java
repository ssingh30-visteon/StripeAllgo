package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0013J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel;", "Landroidx/lifecycle/ViewModel;", "stripe", "Lcom/stripe/android/Stripe;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;Lcom/stripe/android/view/i18n/ErrorMessageTranslator;)V", "productUsage", "", "", "attachPaymentMethod", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentMethod", "attachPaymentMethod$payments_core_debug", "createPaymentMethod", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod$payments_core_debug", "updatedPaymentMethodCreateParams", "updatedPaymentMethodCreateParams$payments_core_debug", "Factory", "payments-core_debug"})
public final class AddPaymentMethodViewModel extends androidx.lifecycle.ViewModel {
    private final com.stripe.android.Stripe stripe = null;
    private final com.stripe.android.view.AddPaymentMethodActivityStarter.Args args = null;
    private final com.stripe.android.view.i18n.ErrorMessageTranslator errorMessageTranslator = null;
    private final java.util.Set<java.lang.String> productUsage = null;
    
    public AddPaymentMethodViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe stripe, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AddPaymentMethodActivityStarter.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.i18n.ErrorMessageTranslator errorMessageTranslator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.stripe.android.model.PaymentMethod>> createPaymentMethod$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final com.stripe.android.model.PaymentMethodCreateParams updatedPaymentMethodCreateParams$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "stripe", "Lcom/stripe/android/Stripe;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.stripe.android.Stripe stripe = null;
        private final com.stripe.android.view.AddPaymentMethodActivityStarter.Args args = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.Stripe stripe, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AddPaymentMethodActivityStarter.Args args) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}