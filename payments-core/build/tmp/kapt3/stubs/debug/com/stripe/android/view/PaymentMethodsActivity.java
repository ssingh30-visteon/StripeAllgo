package com.stripe.android.view;

import java.lang.System;

/**
 * An activity that allows a customer to select from their attached payment methods,
 * or add a new one via [AddPaymentMethodActivity].
 *
 * This Activity is typically started through [com.stripe.android.PaymentSession].
 * To directly start this activity, use [PaymentMethodsActivityStarter.startForResult].
 *
 * Use [PaymentMethodsActivityStarter.Result.fromIntent]
 * to retrieve the result of this activity from an intent in onActivityResult().
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\u001c\u00104\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001062\b\b\u0002\u00107\u001a\u000208H\u0002J\u0015\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;H\u0001\u00a2\u0006\u0002\b<J\u0010\u0010=\u001a\u0002022\u0006\u00105\u001a\u000206H\u0002J\b\u0010>\u001a\u000202H\u0016J\u0012\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u000202H\u0014J\b\u0010C\u001a\u00020\u001fH\u0016J\b\u0010D\u001a\u000202H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\b\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006F"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "getAdapter", "()Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "args", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "args$delegate", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "getCardDisplayTextFactory", "()Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory$delegate", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "getCustomerSession-d1pmJ48", "()Ljava/lang/Object;", "customerSession$delegate", "startedFromPaymentSession", "", "getStartedFromPaymentSession", "()Z", "startedFromPaymentSession$delegate", "viewBinding", "Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "getViewBinding$payments_core_debug", "()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentMethodsViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentMethodsViewModel;", "viewModel$delegate", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "fetchCustomerPaymentMethods", "", "finishWithGooglePay", "finishWithResult", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "resultCode", "", "onAddPaymentMethodResult", "result", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onAddPaymentMethodResult$payments_core_debug", "onAddedPaymentMethod", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSupportNavigateUp", "setupRecyclerView", "Companion", "payments-core_debug"})
public final class PaymentMethodsActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewBinding$delegate = null;
    private final kotlin.Lazy startedFromPaymentSession$delegate = null;
    private final kotlin.Lazy customerSession$delegate = null;
    private final kotlin.Lazy cardDisplayTextFactory$delegate = null;
    private final kotlin.Lazy alertDisplayer$delegate = null;
    private final kotlin.Lazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentMethodsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_TOKEN = "PaymentMethodsActivity";
    
    public PaymentMethodsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.databinding.PaymentMethodsActivityBinding getViewBinding$payments_core_debug() {
        return null;
    }
    
    private final boolean getStartedFromPaymentSession() {
        return false;
    }
    
    private final com.stripe.android.view.CardDisplayTextFactory getCardDisplayTextFactory() {
        return null;
    }
    
    private final com.stripe.android.view.AlertDisplayer getAlertDisplayer() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsActivityStarter.Args getArgs() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsViewModel getViewModel() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onAddPaymentMethodResult$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AddPaymentMethodActivityStarter.Result result) {
    }
    
    private final void onAddedPaymentMethod(com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void fetchCustomerPaymentMethods() {
    }
    
    private final void finishWithGooglePay() {
    }
    
    private final void finishWithResult(com.stripe.android.model.PaymentMethod paymentMethod, int resultCode) {
    }
    
    private final android.view.View createFooterView(android.view.ViewGroup contentRoot) {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}