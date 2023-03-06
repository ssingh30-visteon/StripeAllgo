package com.stripe.android.payments.core.authentication;

import java.lang.System;

/**
 * [PaymentAuthenticator] implementation to redirect to a URL through [PaymentBrowserAuthStarter].
 */
@kotlin.jvm.JvmSuppressWildcards()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0010\u0014J)\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJc\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "enableLogging", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "authenticate", "", "host", "authenticatable", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beginWebAuth", "stripeIntent", "requestCode", "", "clientSecret", "authUrl", "stripeAccount", "returnUrl", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
@javax.inject.Singleton()
public final class WebIntentAuthenticator implements com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> {
    private final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final boolean enableLogging = false;
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    private final java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap = null;
    private final kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider = null;
    
    @javax.inject.Inject()
    public WebIntentAuthenticator(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.UIContext()
    kotlin.coroutines.CoroutineContext uiContext, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider) {
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
    
    private final java.lang.Object beginWebAuth(com.stripe.android.view.AuthActivityStarterHost host, com.stripe.android.model.StripeIntent stripeIntent, int requestCode, java.lang.String clientSecret, java.lang.String authUrl, java.lang.String stripeAccount, java.lang.String returnUrl, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, kotlin.coroutines.Continuation<kotlin.Unit> continuation) {
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