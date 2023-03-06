package com.stripe.android.payments.core.authentication;

import java.lang.System;

/**
 * Default registry to provide look ups for [PaymentAuthenticator].
 * Should be only accessed through [DefaultPaymentAuthenticatorRegistry.createInstance].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B@\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\'\b\u0001\u0010\u0007\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\r0\b\u00a2\u0006\u0002\u0010\u000eJ!\u0010\'\u001a\b\u0012\u0004\u0012\u0002H(0\u000b\"\u0004\b\u0000\u0010(2\u0006\u0010)\u001a\u0002H(H\u0016\u00a2\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020,2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0016J\b\u0010/\u001a\u00020,H\u0016J\u001e\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016R*\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b0\u00108\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u0007\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/core/injection/Injector;", "noOpIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "sourceAuthenticator", "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;", "paymentAuthenticatorMap", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)V", "allAuthenticators", "", "Lcom/stripe/android/model/StripeModel;", "getAllAuthenticators$payments_core_debug$annotations", "()V", "getAllAuthenticators$payments_core_debug", "()Ljava/util/List;", "authenticationComponent", "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "getAuthenticationComponent", "()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "setAuthenticationComponent", "(Lcom/stripe/android/payments/core/injection/AuthenticationComponent;)V", "paymentBrowserAuthLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "getPaymentBrowserAuthLauncher$payments_core_debug", "()Landroidx/activity/result/ActivityResultLauncher;", "setPaymentBrowserAuthLauncher$payments_core_debug", "(Landroidx/activity/result/ActivityResultLauncher;)V", "paymentRelayLauncher", "Lcom/stripe/android/PaymentRelayStarter$Args;", "getPaymentRelayLauncher$payments_core_debug", "setPaymentRelayLauncher$payments_core_debug", "getAuthenticator", "Authenticatable", "authenticatable", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "inject", "", "injectable", "Lcom/stripe/android/payments/core/injection/Injectable;", "onLauncherInvalidated", "onNewActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Companion", "payments-core_debug"})
@javax.inject.Singleton()
public final class DefaultPaymentAuthenticatorRegistry implements com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry, com.stripe.android.payments.core.injection.Injector {
    private final com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator noOpIntentAuthenticator = null;
    private final com.stripe.android.payments.core.authentication.SourceAuthenticator sourceAuthenticator = null;
    private final java.util.Map<java.lang.Class<? extends com.stripe.android.model.StripeIntent.NextActionData>, com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent>> paymentAuthenticatorMap = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.payments.core.authentication.PaymentAuthenticator<? extends com.stripe.android.model.StripeModel>> allAuthenticators = null;
    
    /**
     * [AuthenticationComponent] instance is hold to inject into [Activity]s and [ViewModel]s
     * started by the [PaymentAuthenticator]s.
     */
    public com.stripe.android.payments.core.injection.AuthenticationComponent authenticationComponent;
    
    /**
     * [paymentRelayLauncher] is mutable and might be updated through [onNewActivityResultCaller]
     */
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> paymentRelayLauncher;
    
    /**
     * [paymentBrowserAuthLauncher] is mutable and might be updated through
     * [onNewActivityResultCaller]
     */
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry.Companion Companion = null;
    
    @javax.inject.Inject()
    public DefaultPaymentAuthenticatorRegistry(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator noOpIntentAuthenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.SourceAuthenticator sourceAuthenticator, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IntentAuthenticatorMap()
    java.util.Map<java.lang.Class<? extends com.stripe.android.model.StripeIntent.NextActionData>, com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent>> paymentAuthenticatorMap) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.payments.core.authentication.PaymentAuthenticator<? extends com.stripe.android.model.StripeModel>> getAllAuthenticators$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getAllAuthenticators$payments_core_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.core.injection.AuthenticationComponent getAuthenticationComponent() {
        return null;
    }
    
    public final void setAuthenticationComponent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.AuthenticationComponent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> getPaymentRelayLauncher$payments_core_debug() {
        return null;
    }
    
    public final void setPaymentRelayLauncher$payments_core_debug(@org.jetbrains.annotations.Nullable()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract.Args> getPaymentBrowserAuthLauncher$payments_core_debug() {
        return null;
    }
    
    public final void setPaymentBrowserAuthLauncher$payments_core_debug(@org.jetbrains.annotations.Nullable()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract.Args> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <Authenticatable extends java.lang.Object>com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable) {
        return null;
    }
    
    @java.lang.Override()
    public void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
    }
    
    @java.lang.Override()
    public void onLauncherInvalidated() {
    }
    
    @java.lang.Override()
    public void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<?> injectable) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jn\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;", "", "()V", "createInstance", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "context", "Landroid/content/Context;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "productUsage", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry createInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
        com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext uiContext, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            return null;
        }
    }
}