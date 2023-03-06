package com.stripe.android.payments.core.authentication;

import java.lang.System;

/**
 * [PaymentAuthenticator] implementation to perform no-op, just return to client's host.
 */
@kotlin.jvm.JvmSuppressWildcards()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "(Lkotlin/jvm/functions/Function1;)V", "authenticate", "", "host", "authenticatable", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
@javax.inject.Singleton()
public final class NoOpIntentAuthenticator implements com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> {
    private final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentRelayStarter> paymentRelayStarterFactory = null;
    
    @javax.inject.Inject()
    public NoOpIntentAuthenticator(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentRelayStarter> paymentRelayStarterFactory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent authenticatable, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Notify the [ActivityResultLauncher]s are invalid. This happens when the host [Activity] is
     * destroyed.
     */
    @java.lang.Override()
    public void onLauncherInvalidated() {
    }
    
    /**
     * Notify the [PaymentAuthenticator] that a new [ActivityResultCaller] and
     * [ActivityResultCallback] is available. This happens when the host Activity is recreated and
     * its [ActivityResultLauncher] needs to be re-registered.
     */
    @java.lang.Override()
    public void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
    }
}