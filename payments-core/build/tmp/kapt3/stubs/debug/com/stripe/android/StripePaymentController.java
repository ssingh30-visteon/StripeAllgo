package com.stripe.android;

import java.lang.System;

/**
 * A controller responsible for confirming and authenticating payment (typically through resolving
 * any required customer action). The payment authentication mechanism (e.g. 3DS) will be determined
 * by the [PaymentIntent] or [SetupIntent] object.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 j2\u00020\u0001:\u0001jB_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0014J)\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J)\u00101\u001a\u00020)2\u0006\u00102\u001a\u0002032\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J!\u00105\u001a\u00020+2\u0006\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u00108\u001a\u0002092\u0006\u00106\u001a\u00020:2\u0006\u0010.\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J!\u0010<\u001a\u00020=2\u0006\u00102\u001a\u0002032\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0019\u0010C\u001a\u00020)2\u0006\u0010@\u001a\u00020AH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0019\u0010D\u001a\u00020E2\u0006\u0010@\u001a\u00020AH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ)\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ)\u0010N\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010O\u001a\u00020P2\u0006\u0010.\u001a\u00020/H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u0012\u0010R\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010\u0006H\u0002J)\u0010T\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010U\u001a\u00020?2\u0006\u0010.\u001a\u00020/H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010VJ\u001e\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0016J\u001a\u0010]\u001a\u00020\n2\u0006\u0010I\u001a\u00020J2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010^\u001a\u00020\n2\u0006\u0010I\u001a\u00020J2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010_\u001a\u00020\n2\u0006\u0010I\u001a\u00020J2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J1\u0010`\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010a\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u0006\u0010b\u001a\u00020cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ)\u0010e\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010U\u001a\u00020?2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010VJ)\u0010f\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u00106\u001a\u00020g2\u0006\u0010.\u001a\u00020/H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020GH\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006k"}, d2 = {"Lcom/stripe/android/StripePaymentController;", "Lcom/stripe/android/PaymentController;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "alipayRepository", "Lcom/stripe/android/networking/AlipayRepository;", "uiContext", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V", "authenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "paymentIntentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "paymentRelayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "setupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "threeDs1IntentReturnUrlMap", "", "authenticateAlipay", "Lcom/stripe/android/PaymentIntentResult;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmAndAuthenticateAlipay", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "confirmStripeIntentParams", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPay", "Lcom/stripe/android/model/WeChatPayNextAction;", "getAuthenticateSourceResult", "Lcom/stripe/android/model/Source;", "data", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "handleError", "", "host", "requestCode", "", "throwable", "", "(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNextAction", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logReturnUrl", "returnUrl", "onSourceRetrieved", "source", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerLaunchersWithActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "shouldHandlePaymentResult", "shouldHandleSetupResult", "shouldHandleSourceResult", "startAuth", "clientSecret", "type", "Lcom/stripe/android/PaymentController$StripeIntentType;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthenticateSource", "startConfirmAndAuth", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterLaunchers", "Companion", "payments-core_debug"})
public final class StripePaymentController implements com.stripe.android.PaymentController {
    private final kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final boolean enableLogging = false;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final com.stripe.android.networking.AlipayRepository alipayRepository = null;
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    private final com.stripe.android.payments.PaymentFlowFailureMessageFactory failureMessageFactory = null;
    private final com.stripe.android.payments.PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor = null;
    private final com.stripe.android.payments.SetupIntentFlowResultProcessor setupIntentFlowResultProcessor = null;
    private final com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl = null;
    
    /**
     * [paymentRelayLauncher] is mutable and might be updated during
     * through [registerLaunchersWithActivityResultCaller]
     */
    private androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> paymentRelayLauncher;
    private final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentRelayStarter> paymentRelayStarterFactory = null;
    
    /**
     * A map between 3ds1 [StripeIntent] ids to its corresponding returnUrl.
     * An entry will be removed once the [StripeIntent] is confirmed.
     */
    private final java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap = null;
    private final com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry authenticatorRegistry = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.StripePaymentController.Companion Companion = null;
    public static final int PAYMENT_REQUEST_CODE = 50000;
    public static final int SETUP_REQUEST_CODE = 50001;
    public static final int SOURCE_REQUEST_CODE = 50002;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> EXPAND_PAYMENT_METHOD = null;
    private static final long CHALLENGE_DELAY = 0L;
    private static final java.lang.String REQUIRED_ERROR = "API request returned an invalid response.";
    
    public StripePaymentController(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, boolean enableLogging, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.AlipayRepository alipayRepository, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super();
    }
    
    @java.lang.Override()
    public void registerLaunchersWithActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
    }
    
    @java.lang.Override()
    public void unregisterLaunchers() {
    }
    
    /**
     * Confirm the Stripe Intent and resolve any next actions
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object startConfirmAndAuth(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object confirmAndAuthenticateAlipay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object confirmWeChatPay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.WeChatPayNextAction> continuation) {
        return null;
    }
    
    private final java.lang.Object confirmPaymentIntent(com.stripe.android.model.ConfirmPaymentIntentParams confirmStripeIntentParams, com.stripe.android.networking.ApiRequest.Options requestOptions, kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    private final java.lang.Object confirmSetupIntent(com.stripe.android.model.ConfirmSetupIntentParams confirmStripeIntentParams, com.stripe.android.networking.ApiRequest.Options requestOptions, kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object startAuth(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentController.StripeIntentType type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object startAuthenticateSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object onSourceRetrieved(com.stripe.android.view.AuthActivityStarterHost host, com.stripe.android.model.Source source, com.stripe.android.networking.ApiRequest.Options requestOptions, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Decide whether [getPaymentIntentResult] should be called.
     */
    @java.lang.Override()
    public boolean shouldHandlePaymentResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    /**
     * Decide whether [getSetupIntentResult] should be called.
     */
    @java.lang.Override()
    public boolean shouldHandleSetupResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    @java.lang.Override()
    public boolean shouldHandleSourceResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    /**
     * Get the PaymentIntent's client_secret from {@param data} and use to retrieve
     * the PaymentIntent object with updated status.
     *
     * @param data the result Intent
     * @return the [PaymentIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    @java.lang.Override()
    public java.lang.Object getPaymentIntentResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> continuation) {
        return null;
    }
    
    /**
     * Get the SetupIntent's client_secret from {@param data} and use to retrieve
     * the PaymentIntent object with updated status.
     *
     * @param data the result Intent
     * @return the [SetupIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    @java.lang.Override()
    public java.lang.Object getSetupIntentResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.SetupIntentResult> continuation) {
        return null;
    }
    
    /**
     * Get the Source's client_secret from {@param data} and use to retrieve
     * the Source object with updated status.
     *
     * @param data the result Intent
     * @return the [Source] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the Source response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    @java.lang.Override()
    public java.lang.Object getAuthenticateSourceResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation) {
        return null;
    }
    
    private final java.lang.Object authenticateAlipay(com.stripe.android.model.PaymentIntent paymentIntent, com.stripe.android.AlipayAuthenticator authenticator, com.stripe.android.networking.ApiRequest.Options requestOptions, kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> continuation) {
        return null;
    }
    
    private final java.lang.Object handleError(com.stripe.android.view.AuthActivityStarterHost host, int requestCode, java.lang.Throwable throwable, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Determine which authentication mechanism should be used, or bypass authentication
     * if it is not needed.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    @java.lang.Override()
    public java.lang.Object handleNextAction(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void logReturnUrl(java.lang.String returnUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.PaymentController create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.PaymentController create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, boolean enableLogging) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\b\u001dJ\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\u00a2\u0006\u0002\b\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/StripePaymentController$Companion;", "", "()V", "CHALLENGE_DELAY", "", "getCHALLENGE_DELAY$payments_core_debug", "()J", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD$payments_core_debug", "()Ljava/util/List;", "PAYMENT_REQUEST_CODE", "", "REQUIRED_ERROR", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "create", "Lcom/stripe/android/PaymentController;", "context", "Landroid/content/Context;", "publishableKey", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "enableLogging", "", "getRequestCode", "params", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getRequestCode$payments_core_debug", "intent", "Lcom/stripe/android/model/StripeIntent;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.PaymentController create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.PaymentController create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository, boolean enableLogging) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEXPAND_PAYMENT_METHOD$payments_core_debug() {
            return null;
        }
        
        public final long getCHALLENGE_DELAY$payments_core_debug() {
            return 0L;
        }
    }
}