package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

/**
 * A transparent [Activity] that will initiate a 3DS2 transaction by making the authentication
 * request (AReq) and handling the response (ARes). Depending on the response,
 * [Stripe3ds2TransactionActivity] might start the challenge flow UI, complete using the
 * frictionless flow, fall back to a web URL, or finish early if there is a failure.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getArgs", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "setArgs", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;)V", "viewBinding", "Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_debug$annotations", "getViewModelFactory$payments_core_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "finishWithResult", "", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "payments-core_debug"})
public final class Stripe3ds2TransactionActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewBinding$delegate = null;
    public com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    
    public Stripe3ds2TransactionActivity() {
        super();
    }
    
    private final com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding getViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args getArgs() {
        return null;
    }
    
    public final void setArgs(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args p0) {
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
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void finishWithResult(com.stripe.android.payments.PaymentFlowResult.Unvalidated paymentFlowResult) {
    }
}