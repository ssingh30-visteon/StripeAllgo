package com.stripe.android.view;

import java.lang.System;

/**
 * Activity used to display a [AddPaymentMethodView] and receive the resulting
 * [PaymentMethod] in the `Activity#onActivityResult(int, int, Intent)` of the
 * launching Activity.
 *
 *
 * Should be started with [AddPaymentMethodActivityStarter].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J\u001f\u0010/\u001a\u00020\'2\u0006\u0010!\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u000101H\u0000\u00a2\u0006\u0002\b2J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u00104\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00105\u001a\u00020\'2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\'H\u0016J\u0012\u00109\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0014H\u0014J\b\u0010>\u001a\u00020\'H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001e8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$\u00a8\u0006@"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "addPaymentMethodView", "Lcom/stripe/android/view/AddPaymentMethodView;", "getAddPaymentMethodView", "()Lcom/stripe/android/view/AddPaymentMethodView;", "addPaymentMethodView$delegate", "Lkotlin/Lazy;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args$delegate", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType$delegate", "shouldAttachToCustomer", "", "getShouldAttachToCustomer", "()Z", "shouldAttachToCustomer$delegate", "stripe", "Lcom/stripe/android/Stripe;", "getStripe", "()Lcom/stripe/android/Stripe;", "stripe$delegate", "titleStringRes", "", "getTitleStringRes", "()I", "viewModel", "Lcom/stripe/android/view/AddPaymentMethodViewModel;", "getViewModel", "()Lcom/stripe/android/view/AddPaymentMethodViewModel;", "viewModel$delegate", "attachPaymentMethodToCustomer", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "configureView", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "createPaymentMethod", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod$payments_core_debug", "createPaymentMethodView", "finishWithPaymentMethod", "finishWithResult", "result", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onActionSave", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onProgressBarVisibilityChanged", "visible", "onResume", "Companion", "payments-core_debug"})
public final class AddPaymentMethodActivity extends com.stripe.android.view.StripeActivity {
    private final kotlin.Lazy args$delegate = null;
    private final kotlin.Lazy stripe$delegate = null;
    private final kotlin.Lazy paymentMethodType$delegate = null;
    private final kotlin.Lazy shouldAttachToCustomer$delegate = null;
    private final kotlin.Lazy addPaymentMethodView$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.AddPaymentMethodActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_TOKEN = "AddPaymentMethodActivity";
    
    public AddPaymentMethodActivity() {
        super();
    }
    
    private final com.stripe.android.view.AddPaymentMethodActivityStarter.Args getArgs() {
        return null;
    }
    
    private final com.stripe.android.Stripe getStripe() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethod.Type getPaymentMethodType() {
        return null;
    }
    
    private final boolean getShouldAttachToCustomer() {
        return false;
    }
    
    private final com.stripe.android.view.AddPaymentMethodView getAddPaymentMethodView() {
        return null;
    }
    
    private final com.stripe.android.view.AddPaymentMethodViewModel getViewModel() {
        return null;
    }
    
    @androidx.annotation.StringRes()
    private final int getTitleStringRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void configureView(com.stripe.android.view.AddPaymentMethodActivityStarter.Args args) {
    }
    
    private final com.stripe.android.view.AddPaymentMethodView createPaymentMethodView(com.stripe.android.view.AddPaymentMethodActivityStarter.Args args) {
        return null;
    }
    
    private final android.view.View createFooterView(android.view.ViewGroup contentRoot) {
        return null;
    }
    
    @java.lang.Override()
    public void onActionSave() {
    }
    
    public final void createPaymentMethod$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AddPaymentMethodViewModel viewModel, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams params) {
    }
    
    private final void attachPaymentMethodToCustomer(com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    private final void finishWithPaymentMethod(com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    private final void finishWithResult(com.stripe.android.view.AddPaymentMethodActivityStarter.Result result) {
    }
    
    @java.lang.Override()
    protected void onProgressBarVisibilityChanged(boolean visible) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}