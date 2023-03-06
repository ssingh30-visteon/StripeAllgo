package com.stripe.android.payments.core.authentication;

import java.lang.System;

/**
 * A class to authenticate a [StripeIntent] or [Source].
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Authenticatable", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "authenticate", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "authenticatable", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public abstract interface PaymentAuthenticator<Authenticatable extends java.lang.Object> extends com.stripe.android.payments.core.ActivityResultLauncherHost {
    
    /**
     * Authenticates a [StripeIntent] or [Source].
     *
     * @param host the host([Activity] or [Fragment]) where client is calling from, used to redirect back to client
     * @param authenticatable the [StripeIntent] or [Source] object to authenticate
     * @param requestOptions configurations for the API request which triggers the authentication
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, Authenticatable authenticatable, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * A class to authenticate a [StripeIntent] or [Source].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Notify the [ActivityResultLauncher]s are invalid. This happens when the host [Activity] is
         * destroyed.
         */
        @java.lang.Override()
        public static <Authenticatable extends java.lang.Object>void onLauncherInvalidated(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable> $this) {
        }
        
        /**
         * Notify the [PaymentAuthenticator] that a new [ActivityResultCaller] and
         * [ActivityResultCallback] is available. This happens when the host Activity is recreated and
         * its [ActivityResultLauncher] needs to be re-registered.
         */
        @java.lang.Override()
        public static <Authenticatable extends java.lang.Object>void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable> $this, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
        }
    }
}