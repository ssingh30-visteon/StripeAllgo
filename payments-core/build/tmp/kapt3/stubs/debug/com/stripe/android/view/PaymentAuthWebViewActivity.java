package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0001\u00a2\u0006\u0002\b\"J\b\u0010#\u001a\u00020\u0019H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0014J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "get_args", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args$delegate", "Lkotlin/Lazy;", "logger", "Lcom/stripe/android/Logger;", "getLogger", "()Lcom/stripe/android/Logger;", "logger$delegate", "viewBinding", "Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel$delegate", "cancelIntentSource", "", "createResultIntent", "Landroid/content/Intent;", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "customizeToolbar", "onAuthComplete", "error", "", "onAuthComplete$payments_core_debug", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "payments-core_debug"})
public final class PaymentAuthWebViewActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewBinding$delegate = null;
    private final kotlin.Lazy _args$delegate = null;
    private final kotlin.Lazy logger$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public PaymentAuthWebViewActivity() {
        super();
    }
    
    private final com.stripe.android.databinding.PaymentAuthWebViewActivityBinding getViewBinding() {
        return null;
    }
    
    private final com.stripe.android.auth.PaymentBrowserAuthContract.Args get_args() {
        return null;
    }
    
    private final com.stripe.android.Logger getLogger() {
        return null;
    }
    
    private final com.stripe.android.view.PaymentAuthWebViewActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onAuthComplete$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void cancelIntentSource() {
    }
    
    private final void customizeToolbar() {
    }
    
    private final android.content.Intent createResultIntent(com.stripe.android.payments.PaymentFlowResult.Unvalidated paymentFlowResult) {
        return null;
    }
}