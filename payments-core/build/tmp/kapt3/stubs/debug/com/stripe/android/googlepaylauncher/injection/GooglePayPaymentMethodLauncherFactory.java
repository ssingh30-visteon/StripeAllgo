package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "", "create", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "skipReadyCheck", "", "payments-core_debug"})
@dagger.assisted.AssistedFactory()
public abstract interface GooglePayPaymentMethodLauncherFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher create(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher, boolean skipReadyCheck);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}