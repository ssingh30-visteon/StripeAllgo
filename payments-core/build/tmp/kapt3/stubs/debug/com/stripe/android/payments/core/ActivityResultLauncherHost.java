package com.stripe.android.payments.core;

import java.lang.System;

/**
 * A host of [ActivityResultLauncher] which is used to start another [Activity] through
 * [AuthActivityStarter].
 *
 * Gets notified when [ActivityResultLauncher] needs to be recreated or invalidated due to
 * host Activity recreation.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "", "onLauncherInvalidated", "", "onNewActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_debug"})
public abstract interface ActivityResultLauncherHost {
    
    /**
     * Notify the [PaymentAuthenticator] that a new [ActivityResultCaller] and
     * [ActivityResultCallback] is available. This happens when the host Activity is recreated and
     * its [ActivityResultLauncher] needs to be re-registered.
     */
    public abstract void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback);
    
    /**
     * Notify the [ActivityResultLauncher]s are invalid. This happens when the host [Activity] is
     * destroyed.
     */
    public abstract void onLauncherInvalidated();
    
    /**
     * A host of [ActivityResultLauncher] which is used to start another [Activity] through
     * [AuthActivityStarter].
     *
     * Gets notified when [ActivityResultLauncher] needs to be recreated or invalidated due to
     * host Activity recreation.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Notify the [PaymentAuthenticator] that a new [ActivityResultCaller] and
         * [ActivityResultCallback] is available. This happens when the host Activity is recreated and
         * its [ActivityResultLauncher] needs to be re-registered.
         */
        public static void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.ActivityResultLauncherHost $this, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
        }
        
        /**
         * Notify the [ActivityResultLauncher]s are invalid. This happens when the host [Activity] is
         * destroyed.
         */
        public static void onLauncherInvalidated(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.ActivityResultLauncherHost $this) {
        }
    }
}