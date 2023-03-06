package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 72\u00020\u0001:\u000278B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\u0006\u0010/\u001a\u00020&H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\b0J<\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0 0-0,2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u0010/\u001a\u00020&H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\b6R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lkotlin/coroutines/CoroutineContext;)V", "currentPage", "", "getCurrentPage$payments_core_debug", "()I", "setCurrentPage$payments_core_debug", "(I)V", "isShippingInfoSubmitted", "", "isShippingInfoSubmitted$payments_core_debug", "()Z", "setShippingInfoSubmitted$payments_core_debug", "(Z)V", "getPaymentSessionData$payments_core_debug", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData$payments_core_debug", "(Lcom/stripe/android/PaymentSessionData;)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod$payments_core_debug", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_debug", "(Lcom/stripe/android/model/ShippingMethod;)V", "shippingMethods", "", "getShippingMethods$payments_core_debug", "()Ljava/util/List;", "setShippingMethods$payments_core_debug", "(Ljava/util/List;)V", "submittedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getSubmittedShippingInfo$payments_core_debug", "()Lcom/stripe/android/model/ShippingInformation;", "setSubmittedShippingInfo$payments_core_debug", "(Lcom/stripe/android/model/ShippingInformation;)V", "saveCustomerShippingInformation", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "shippingInformation", "saveCustomerShippingInformation$payments_core_debug", "validateShippingInformation", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "validateShippingInformation$payments_core_debug", "Companion", "Factory", "payments-core_debug"})
public final class PaymentFlowViewModel extends androidx.lifecycle.ViewModel {
    private final com.stripe.android.CustomerSession customerSession = null;
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.PaymentSessionData paymentSessionData;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods;
    private boolean isShippingInfoSubmitted = false;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.ShippingMethod selectedShippingMethod;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.ShippingInformation submittedShippingInfo;
    private int currentPage = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentFlowViewModel.Companion Companion = null;
    private static final java.lang.String SHIPPING_INFO_PRODUCT_TOKEN = "ShippingInfoScreen";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> PRODUCT_USAGE = null;
    
    public PaymentFlowViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession customerSession, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionData paymentSessionData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionData getPaymentSessionData$payments_core_debug() {
        return null;
    }
    
    public final void setPaymentSessionData$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.ShippingMethod> getShippingMethods$payments_core_debug() {
        return null;
    }
    
    public final void setShippingMethods$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.ShippingMethod> p0) {
    }
    
    public final boolean isShippingInfoSubmitted$payments_core_debug() {
        return false;
    }
    
    public final void setShippingInfoSubmitted$payments_core_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod getSelectedShippingMethod$payments_core_debug() {
        return null;
    }
    
    public final void setSelectedShippingMethod$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingMethod p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getSubmittedShippingInfo$payments_core_debug() {
        return null;
    }
    
    public final void setSubmittedShippingInfo$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation p0) {
    }
    
    public final int getCurrentPage$payments_core_debug() {
        return 0;
    }
    
    public final void setCurrentPage$payments_core_debug(int p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.stripe.android.CustomerSession customerSession = null;
        private final com.stripe.android.PaymentSessionData paymentSessionData = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.CustomerSession customerSession, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionData paymentSessionData) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Companion;", "", "()V", "PRODUCT_USAGE", "", "", "getPRODUCT_USAGE", "()Ljava/util/Set;", "SHIPPING_INFO_PRODUCT_TOKEN", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getPRODUCT_USAGE() {
            return null;
        }
    }
}