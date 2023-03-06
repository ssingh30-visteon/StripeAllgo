package com.stripe.android.payments.core.authentication;

import java.lang.System;

/**
 * Registry to map [Authenticatable] to the corresponding [PaymentAuthenticator].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "getAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Authenticatable", "authenticatable", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "payments-core_debug"})
public abstract interface PaymentAuthenticatorRegistry extends com.stripe.android.payments.core.ActivityResultLauncherHost {
    
    /**
     * Returns the correct [PaymentAuthenticator] to handle the [Authenticatable].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract <Authenticatable extends java.lang.Object>com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable);
    
    /**
     * Registry to map [Authenticatable] to the corresponding [PaymentAuthenticator].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Notify the [ActivityResultLauncher]s are invalid. This happens when the host [Activity] is
         * destroyed.
         */
        @java.lang.Override()
        public static void onLauncherInvalidated(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry $this) {
        }
        
        /**
         * Notify the [PaymentAuthenticator] that a new [ActivityResultCaller] and
         * [ActivityResultCallback] is available. This happens when the host Activity is recreated and
         * its [ActivityResultLauncher] needs to be re-registered.
         */
        @java.lang.Override()
        public static void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry $this, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
        }
    }
}