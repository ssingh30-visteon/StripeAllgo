package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001.B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020$H\u0002J\"\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\'0\u00050&H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\b(J\u0015\u0010)\u001a\u00020*2\u0006\u0010!\u001a\u00020\"H\u0000\u00a2\u0006\u0002\b+J\u0015\u0010,\u001a\u00020*2\u0006\u0010!\u001a\u00020\"H\u0000\u00a2\u0006\u0002\b-R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "selectedPaymentMethodId", "", "startedFromPaymentSession", "", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "Ljava/lang/Object;", "productUsage", "", "getProductUsage$payments_core_debug", "()Ljava/util/Set;", "progressData", "Landroidx/lifecycle/MutableLiveData;", "getProgressData$payments_core_debug", "()Landroidx/lifecycle/MutableLiveData;", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getSelectedPaymentMethodId$payments_core_debug", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_debug", "(Ljava/lang/String;)V", "snackbarData", "getSnackbarData$payments_core_debug", "createSnackbarText", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "stringRes", "", "getPaymentMethods", "Landroidx/lifecycle/LiveData;", "", "getPaymentMethods$payments_core_debug", "onPaymentMethodAdded", "", "onPaymentMethodAdded$payments_core_debug", "onPaymentMethodRemoved", "onPaymentMethodRemoved$payments_core_debug", "Factory", "payments-core_debug"})
public final class PaymentMethodsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.Object customerSession = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedPaymentMethodId;
    private final boolean startedFromPaymentSession = false;
    private final android.content.res.Resources resources = null;
    private final com.stripe.android.view.CardDisplayTextFactory cardDisplayTextFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> productUsage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> snackbarData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressData = null;
    
    public PaymentMethodsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.Object customerSession, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedPaymentMethodId, boolean startedFromPaymentSession) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedPaymentMethodId$payments_core_debug() {
        return null;
    }
    
    public final void setSelectedPaymentMethodId$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getProductUsage$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSnackbarData$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressData$payments_core_debug() {
        return null;
    }
    
    public final void onPaymentMethodAdded$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    public final void onPaymentMethodRemoved$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    private final java.lang.String createSnackbarText(com.stripe.android.model.PaymentMethod paymentMethod, @androidx.annotation.StringRes()
    int stringRes) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "initialPaymentMethodId", "", "startedFromPaymentSession", "", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "Ljava/lang/Object;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.app.Application application = null;
        private final java.lang.Object customerSession = null;
        private final java.lang.String initialPaymentMethodId = null;
        private final boolean startedFromPaymentSession = false;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        java.lang.Object customerSession, @org.jetbrains.annotations.Nullable()
        java.lang.String initialPaymentMethodId, boolean startedFromPaymentSession) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}