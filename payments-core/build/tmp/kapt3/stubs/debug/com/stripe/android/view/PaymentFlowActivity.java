package com.stripe.android.view;

import java.lang.System;

/**
 * Activity containing a two-part payment flow that allows users to provide a shipping address
 * as well as select a shipping method.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000201H\u0016J\b\u00108\u001a\u000201H\u0016J\u0012\u00109\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>H\u0002J\'\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0000\u00a2\u0006\u0002\bDJ\b\u0010E\u001a\u000201H\u0002J\u0016\u0010F\u001a\u0002012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\b\u0010G\u001a\u000201H\u0002J\u0016\u0010H\u001a\u0002012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\"\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010@\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b-\u0010.\u00a8\u0006O"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "args", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "args$delegate", "Lkotlin/Lazy;", "customerSession", "Lcom/stripe/android/CustomerSession;", "getCustomerSession", "()Lcom/stripe/android/CustomerSession;", "customerSession$delegate", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "getKeyboardController", "()Lcom/stripe/android/view/KeyboardController;", "keyboardController$delegate", "paymentFlowPagerAdapter", "Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "getPaymentFlowPagerAdapter", "()Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "paymentFlowPagerAdapter$delegate", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionConfig", "()Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig$delegate", "shippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "viewBinding", "Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentFlowViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentFlowViewModel;", "viewModel$delegate", "viewPager", "Lcom/stripe/android/view/PaymentFlowViewPager;", "getViewPager", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager$delegate", "finishWithData", "", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "hasNextPage", "", "hasPreviousPage", "onActionSave", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShippingInfoError", "error", "", "onShippingInfoSaved", "shippingInformation", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "onShippingInfoSaved$payments_core_debug", "onShippingInfoSubmitted", "onShippingInfoValidated", "onShippingMethodSave", "onShippingMethodsReady", "validateShippingInformation", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Companion", "payments-core_debug"})
public final class PaymentFlowActivity extends com.stripe.android.view.StripeActivity {
    private final kotlin.Lazy viewBinding$delegate = null;
    private final kotlin.Lazy viewPager$delegate = null;
    private final kotlin.Lazy customerSession$delegate = null;
    private final kotlin.Lazy args$delegate = null;
    private final kotlin.Lazy paymentSessionConfig$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy paymentFlowPagerAdapter$delegate = null;
    private final kotlin.Lazy keyboardController$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentFlowActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_TOKEN = "PaymentFlowActivity";
    
    public PaymentFlowActivity() {
        super();
    }
    
    private final com.stripe.android.databinding.PaymentFlowActivityBinding getViewBinding() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentFlowViewPager getViewPager() {
        return null;
    }
    
    private final com.stripe.android.CustomerSession getCustomerSession() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentFlowActivityStarter.Args getArgs() {
        return null;
    }
    
    private final com.stripe.android.PaymentSessionConfig getPaymentSessionConfig() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentFlowViewModel getViewModel() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentFlowPagerAdapter getPaymentFlowPagerAdapter() {
        return null;
    }
    
    private final com.stripe.android.view.KeyboardController getKeyboardController() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActionSave() {
    }
    
    private final void onShippingInfoValidated(java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods) {
    }
    
    private final void onShippingMethodsReady(java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods) {
    }
    
    private final void onShippingInfoSubmitted() {
    }
    
    private final com.stripe.android.model.ShippingInformation getShippingInfo() {
        return null;
    }
    
    private final boolean hasNextPage() {
        return false;
    }
    
    private final boolean hasPreviousPage() {
        return false;
    }
    
    private final void onShippingMethodSave() {
    }
    
    private final void validateShippingInformation(com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInfoValidator, com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, com.stripe.android.model.ShippingInformation shippingInformation) {
    }
    
    private final void onShippingInfoError(java.lang.Throwable error) {
    }
    
    private final void finishWithData(com.stripe.android.PaymentSessionData paymentSessionData) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}