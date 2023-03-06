package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * [ViewModel] for [PaymentLauncherConfirmationActivity].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0099\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u00a2\u0006\u0002\u0010!J\r\u0010*\u001a\u00020+H\u0000\u00a2\u0006\u0002\b,J!\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001b\u00103\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u000fH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\b>J\u0016\u0010?\u001a\u00020+2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020.0AH\u0002R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006D"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "isPaymentIntent", "", "stripeApiRepository", "Lcom/stripe/android/networking/StripeRepository;", "authenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "apiRequestOptionsProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/networking/ApiRequest$Options;", "threeDs1IntentReturnUrlMap", "", "", "lazyPaymentIntentFlowResultProcessor", "Ldagger/Lazy;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "lazySetupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "authActivityStarterHost", "Lcom/stripe/android/view/AuthActivityStarterHost;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(ZLcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;Lcom/stripe/android/payments/DefaultReturnUrl;Ljavax/inject/Provider;Ljava/util/Map;Ldagger/Lazy;Ldagger/Lazy;Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/view/AuthActivityStarterHost;Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/SavedStateHandle;)V", "hasStarted", "getHasStarted$payments_core_debug", "()Z", "paymentLauncherResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "getPaymentLauncherResult$payments_core_debug", "()Landroidx/lifecycle/MutableLiveData;", "cleanUp", "", "cleanUp$payments_core_debug", "confirmIntent", "Lcom/stripe/android/model/StripeIntent;", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "returnUrl", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmStripeIntent", "confirmStripeIntent$payments_core_debug", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNextActionForStripeIntent", "clientSecret", "handleNextActionForStripeIntent$payments_core_debug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logReturnUrl", "onPaymentFlowResult", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onPaymentFlowResult$payments_core_debug", "postResult", "stripeIntentResult", "Lcom/stripe/android/StripeIntentResult;", "Companion", "Factory", "payments-core_debug"})
public final class PaymentLauncherViewModel extends androidx.lifecycle.ViewModel {
    private final boolean isPaymentIntent = false;
    private final com.stripe.android.networking.StripeRepository stripeApiRepository = null;
    private final com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry authenticatorRegistry = null;
    private final com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl = null;
    private final javax.inject.Provider<com.stripe.android.networking.ApiRequest.Options> apiRequestOptionsProvider = null;
    private final java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap = null;
    private final dagger.Lazy<com.stripe.android.payments.PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor = null;
    private final dagger.Lazy<com.stripe.android.payments.SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor = null;
    private final com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    private final com.stripe.android.view.AuthActivityStarterHost authActivityStarterHost = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    /**
     * [PaymentResult] live data to be observed.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.payments.paymentlauncher.PaymentResult> paymentLauncherResult = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIMEOUT_ERROR = "Payment fails due to time out. \n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_ERROR = "Payment fails due to unknown error. \n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUIRED_ERROR = "API request returned an invalid response.";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> EXPAND_PAYMENT_METHOD = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_HAS_STARTED = "key_has_started";
    
    @javax.inject.Inject()
    public PaymentLauncherViewModel(@javax.inject.Named(value = "isPaymentIntent")
    boolean isPaymentIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeApiRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry authenticatorRegistry, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.stripe.android.networking.ApiRequest.Options> apiRequestOptionsProvider, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.stripe.android.payments.PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.stripe.android.payments.SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.UIContext()
    kotlin.coroutines.CoroutineContext uiContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost authActivityStarterHost, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getHasStarted$payments_core_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.stripe.android.payments.paymentlauncher.PaymentResult> getPaymentLauncherResult$payments_core_debug() {
        return null;
    }
    
    /**
     * Confirms a payment intent or setup intent
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object confirmStripeIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object confirmIntent(com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams, java.lang.String returnUrl, kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation) {
        return null;
    }
    
    /**
     * Fetches a [StripeIntent] and handles its next action.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object handleNextActionForStripeIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onPaymentFlowResult$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.PaymentFlowResult.Unvalidated paymentFlowResult) {
    }
    
    /**
     * Cleans up the [PaymentAuthenticatorRegistry] by invalidating [ActivityResultLauncher]s
     * registered within.
     *
     * Because the same [PaymentAuthenticatorRegistry] is used for multiple
     * [PaymentLauncherConfirmationActivity]s. The [ActivityResultLauncher]s registered in the old
     * [PaymentLauncherConfirmationActivity] needs to be unregistered to prevent leaking.
     */
    public final void cleanUp$payments_core_debug() {
    }
    
    /**
     * Parse [StripeIntentResult] into [PaymentResult].
     */
    private final void postResult(com.stripe.android.StripeIntentResult<? extends com.stripe.android.model.StripeIntent> stripeIntentResult) {
    }
    
    private final void logReturnUrl(java.lang.String returnUrl) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001$B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ7\u0010\u0017\u001a\u0002H\u0018\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory$FallbackInitializeParam;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "applicationSupplier", "Landroid/app/Application;", "authActivityStarterHostProvider", "Lcom/stripe/android/view/AuthActivityStarterHost;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultCaller;Landroidx/savedstate/SavedStateRegistryOwner;)V", "subComponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent$Builder;", "getSubComponentBuilderProvider", "()Ljavax/inject/Provider;", "setSubComponentBuilderProvider", "(Ljavax/inject/Provider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInitializeParam", "payments-core_debug"})
    public static final class Factory extends androidx.lifecycle.AbstractSavedStateViewModelFactory implements com.stripe.android.payments.core.injection.Injectable<com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.FallbackInitializeParam> {
        private final kotlin.jvm.functions.Function0<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> argsSupplier = null;
        private final kotlin.jvm.functions.Function0<android.app.Application> applicationSupplier = null;
        private final kotlin.jvm.functions.Function0<com.stripe.android.view.AuthActivityStarterHost> authActivityStarterHostProvider = null;
        private final androidx.activity.result.ActivityResultCaller activityResultCaller = null;
        @javax.inject.Inject()
        public javax.inject.Provider<com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> argsSupplier, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends android.app.Application> applicationSupplier, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends com.stripe.android.view.AuthActivityStarterHost> authActivityStarterHostProvider, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
        androidx.savedstate.SavedStateRegistryOwner owner) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.inject.Provider<com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            return null;
        }
        
        public final void setSubComponentBuilderProvider(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder> p0) {
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle handle) {
            return null;
        }
        
        /**
         * Fallback call to initialize dependencies when injection is not available, this might happen
         * when app process is killed by system and [WeakMapInjectorRegistry] is cleared.
         */
        @java.lang.Override()
        public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.FallbackInitializeParam arg) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00c6\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "enableLogging", "", "publishableKey", "", "stripeAccountId", "productUsage", "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "payments-core_debug"})
        public static final class FallbackInitializeParam {
            @org.jetbrains.annotations.NotNull()
            private final android.app.Application application = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.FallbackInitializeParam copy(@org.jetbrains.annotations.NotNull()
            android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
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
            
            public FallbackInitializeParam(@org.jetbrains.annotations.NotNull()
            android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application getApplication() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            public final boolean getEnableLogging() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPublishableKey() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "KEY_HAS_STARTED", "getKEY_HAS_STARTED$payments_core_debug$annotations", "REQUIRED_ERROR", "TIMEOUT_ERROR", "UNKNOWN_ERROR", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEXPAND_PAYMENT_METHOD() {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getKEY_HAS_STARTED$payments_core_debug$annotations() {
        }
    }
}