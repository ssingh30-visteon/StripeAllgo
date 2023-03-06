package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * Host activity to perform actions for [PaymentLauncher].
 * This activity starts activities to handle next actions, capture their result
 * and convert them to [PaymentResult] and return back to client.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0015J\b\u0010\u001f\u001a\u00020\u0017H\u0014R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\t\u001a\u00020\n8@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "starterArgs", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "getStarterArgs", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "getViewModel$payments_core_debug$annotations", "getViewModel$payments_core_debug", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_debug$annotations", "getViewModelFactory$payments_core_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "disableAnimations", "", "finish", "finishWithResult", "result", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "payments-core_debug"})
public final class PaymentLauncherConfirmationActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy starterArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPTY_ARG_ERROR = "PaymentLauncherConfirmationActivity was started without arguments";
    
    public PaymentLauncherConfirmationActivity() {
        super();
    }
    
    private final com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args getStarterArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getViewModelFactory$payments_core_debug$annotations() {
    }
    
    public final void setViewModelFactory$payments_core_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel getViewModel$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getViewModel$payments_core_debug$annotations() {
    }
    
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    private final void disableAnimations() {
    }
    
    /**
     * After confirmation and next action is handled, finish the activity with
     * corresponding [PaymentResult]
     */
    private final void finishWithResult(com.stripe.android.payments.paymentlauncher.PaymentResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity$Companion;", "", "()V", "EMPTY_ARG_ERROR", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}