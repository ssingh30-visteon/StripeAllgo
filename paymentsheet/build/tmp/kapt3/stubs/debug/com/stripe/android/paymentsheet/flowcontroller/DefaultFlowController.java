package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00fe\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0003cdeB\u00b3\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\b\b\u0001\u0010!\u001a\u00020\"\u0012\b\b\u0001\u0010#\u001a\u00020$\u0012\u000e\b\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130&\u0012\u0006\u0010\'\u001a\u00020(\u00a2\u0006\u0002\u0010)J\"\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0002J\"\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0016J\"\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010C\u001a\u000208H\u0016J\u001a\u0010D\u001a\u0002082\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020HH\u0007J\u0010\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0002J!\u0010M\u001a\u0002082\u0006\u0010N\u001a\u00020O2\u0006\u0010=\u001a\u00020>H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ\n\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0014\u0010S\u001a\u0002082\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UH\u0016J\u0010\u0010V\u001a\u0002082\u0006\u0010G\u001a\u00020HH\u0002J\u0015\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020YH\u0000\u00a2\u0006\u0002\bZJ\u0018\u0010[\u001a\u0002082\u0006\u0010G\u001a\u00020H2\u0006\u0010=\u001a\u00020>H\u0002J\u0017\u0010\\\u001a\u0002082\b\u0010]\u001a\u0004\u0018\u00010^H\u0000\u00a2\u0006\u0002\b_J\u0015\u0010`\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0000\u00a2\u0006\u0002\baJ\b\u0010b\u001a\u000208H\u0016R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020601X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006f"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "Lcom/stripe/android/payments/core/injection/Injector;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "statusBarColor", "Lkotlin/Function0;", "", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "injectorKey", "", "flowControllerInitializer", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "paymentLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "resourceRepository", "Lcom/stripe/android/paymentsheet/elements/ResourceRepository;", "lazyPaymentConfiguration", "Ldagger/Lazy;", "Lcom/stripe/android/PaymentConfiguration;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "enableLogging", "", "productUsage", "", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/activity/result/ActivityResultCaller;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/paymentsheet/elements/ResourceRepository;Ldagger/Lazy;Lkotlin/coroutines/CoroutineContext;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;)V", "flowControllerComponent", "Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent;", "getFlowControllerComponent", "()Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent;", "setFlowControllerComponent", "(Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent;)V", "googlePayActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "paymentOptionActivityLauncher", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "configureInternal", "", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureWithPaymentIntent", "paymentIntentClientSecret", "configureWithSetupIntent", "setupIntentClientSecret", "confirm", "confirmPaymentSelection", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "initData", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "createPaymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "dispatchResult", "result", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "inject", "injectable", "Lcom/stripe/android/payments/core/injection/Injectable;", "launchGooglePay", "onGooglePayResult", "googlePayResult", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "onGooglePayResult$paymentsheet_debug", "onInitSuccess", "onPaymentOptionResult", "paymentOptionResult", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "onPaymentOptionResult$paymentsheet_debug", "onPaymentResult", "onPaymentResult$paymentsheet_debug", "presentPaymentOptions", "Args", "Companion", "GooglePayException", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class DefaultFlowController implements com.stripe.android.paymentsheet.PaymentSheet.FlowController, com.stripe.android.payments.core.injection.Injector {
    private final kotlinx.coroutines.CoroutineScope lifecycleScope = null;
    private final kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor = null;
    private final com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory = null;
    private final com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback = null;
    private final com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback = null;
    private final java.lang.String injectorKey = null;
    private final com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer flowControllerInitializer = null;
    private final com.stripe.android.paymentsheet.analytics.EventReporter eventReporter = null;
    private final com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel viewModel = null;
    private final com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory paymentLauncherFactory = null;
    
    /**
     * [PaymentConfiguration] is [Lazy] because the client might set publishableKey and
     * stripeAccountId after creating a [DefaultFlowController].
     */
    private final dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfiguration = null;
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    private final boolean enableLogging = false;
    private final java.util.Set<java.lang.String> productUsage = null;
    private final com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory = null;
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.paymentsheet.PaymentOptionContract.Args> paymentOptionActivityLauncher = null;
    private androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> googlePayActivityLauncher;
    
    /**
     * [FlowControllerComponent] is hold to inject into [Activity]s and created
     * after [DefaultFlowController].
     */
    public com.stripe.android.paymentsheet.injection.FlowControllerComponent flowControllerComponent;
    private com.stripe.android.payments.paymentlauncher.PaymentLauncher paymentLauncher;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Companion Companion = null;
    
    @javax.inject.Inject()
    public DefaultFlowController(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer flowControllerInitializer, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory paymentLauncherFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.ResourceRepository resourceRepository, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfiguration, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.UIContext()
    kotlin.coroutines.CoroutineContext uiContext, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.injection.FlowControllerComponent getFlowControllerComponent() {
        return null;
    }
    
    public final void setFlowControllerComponent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.injection.FlowControllerComponent p0) {
    }
    
    @java.lang.Override()
    public void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<?> injectable) {
    }
    
    @java.lang.Override()
    public void configureWithPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback) {
    }
    
    @java.lang.Override()
    public void configureWithSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback) {
    }
    
    private final void configureInternal(com.stripe.android.paymentsheet.model.ClientSecret clientSecret, com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration, com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.model.PaymentOption getPaymentOption() {
        return null;
    }
    
    @java.lang.Override()
    public void presentPaymentOptions() {
    }
    
    @java.lang.Override()
    public void confirm() {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void confirmPaymentSelection(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.flowcontroller.InitData initData) {
    }
    
    public final void onGooglePayResult$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result googlePayResult) {
    }
    
    private final java.lang.Object dispatchResult(com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult result, com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onInitSuccess(com.stripe.android.paymentsheet.flowcontroller.InitData initData, com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback) {
    }
    
    public final void onPaymentResult$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentResult paymentResult) {
    }
    
    private final void launchGooglePay(com.stripe.android.paymentsheet.flowcontroller.InitData initData) {
    }
    
    private final com.stripe.android.paymentsheet.PaymentSheetResult createPaymentSheetResult(com.stripe.android.payments.paymentlauncher.PaymentResult paymentResult) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$GooglePayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "paymentsheet_debug"})
    public static final class GooglePayException extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        
        public GooglePayException(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Args;", "Landroid/os/Parcelable;", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "getClientSecret", "()Ljava/lang/String;", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clientSecret = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.Configuration config = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Args copy(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Args(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClientSecret() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration getConfig() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.Args[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;", "", "()V", "getInstance", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "appContext", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "statusBarColor", "Lkotlin/Function0;", "", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.FlowController getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
            return null;
        }
    }
}