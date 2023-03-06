package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * [AssistedFactory] to create a [StripePaymentLauncher] with shared dependencies already created
 * elsewhere.
 *
 * Used when [PaymentLauncher] is declared as an internal dependency by another daggerized public
 * API (e.g PaymentSheet).
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "", "create", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "publishableKey", "Lkotlin/Function0;", "", "stripeAccountId", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "payments-core_debug"})
@dagger.assisted.AssistedFactory()
public abstract interface StripePaymentLauncherAssistedFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.payments.paymentlauncher.StripePaymentLauncher create(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKey, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted(value = "stripeAccountId")
    kotlin.jvm.functions.Function0<java.lang.String> stripeAccountId, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> hostActivityLauncher);
}