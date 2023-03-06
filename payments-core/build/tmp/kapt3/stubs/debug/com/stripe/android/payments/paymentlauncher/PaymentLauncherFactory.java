package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * Factory to create a [PaymentLauncher], initialize all required dependencies.
 *
 * Used when [PaymentLauncher] is used as a standalone API.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u001b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;", "", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V", "context", "Landroid/content/Context;", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultLauncher;)V", "create", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "publishableKey", "", "stripeAccountId", "payments-core_debug"})
public final class PaymentLauncherFactory {
    private final android.content.Context context = null;
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> hostActivityLauncher = null;
    
    public PaymentLauncherFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> hostActivityLauncher) {
        super();
    }
    
    public PaymentLauncherFactory(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback callback) {
        super();
    }
    
    public PaymentLauncherFactory(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.paymentlauncher.PaymentLauncher create(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
        return null;
    }
}