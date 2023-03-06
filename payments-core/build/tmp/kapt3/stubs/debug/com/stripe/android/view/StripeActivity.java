package com.stripe.android.view;

import java.lang.System;

/**
 * Provides a toolbar, save button, and loading states for the save button.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H$J\u0012\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\nH\u0014J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/stripe/android/view/StripeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "Lkotlin/Lazy;", "value", "", "isProgressBarVisible", "()Z", "setProgressBarVisible", "(Z)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$payments_core_debug", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "stripeColorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "getStripeColorUtils", "()Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils$delegate", "viewBinding", "Lcom/stripe/android/databinding/StripeActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding$delegate", "viewStub", "Landroid/view/ViewStub;", "getViewStub$payments_core_debug", "()Landroid/view/ViewStub;", "viewStub$delegate", "onActionSave", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onProgressBarVisibilityChanged", "visible", "showError", "error", "", "payments-core_debug"})
public abstract class StripeActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy progressBar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewStub$delegate = null;
    private boolean isProgressBarVisible = false;
    private final kotlin.Lazy alertDisplayer$delegate = null;
    private final kotlin.Lazy stripeColorUtils$delegate = null;
    
    public StripeActivity() {
        super();
    }
    
    private final com.stripe.android.databinding.StripeActivityBinding getViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewStub getViewStub$payments_core_debug() {
        return null;
    }
    
    protected final boolean isProgressBarVisible() {
        return false;
    }
    
    protected final void setProgressBarVisible(boolean value) {
    }
    
    private final com.stripe.android.view.AlertDisplayer getAlertDisplayer() {
        return null;
    }
    
    private final com.stripe.android.view.StripeColorUtils getStripeColorUtils() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    protected abstract void onActionSave();
    
    protected void onProgressBarVisibilityChanged(boolean visible) {
    }
    
    protected final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
}