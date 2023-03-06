package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

/**
 * [PaymentAuthenticator] authenticating through Stripe's 3ds2 SDK.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\u0002\u0010\rJ)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001cH\u0016J\u001e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "config", "Lcom/stripe/android/PaymentAuthConfig;", "enableLogging", "", "injectorKey", "", "publishableKeyProvider", "Lkotlin/Function0;", "productUsage", "", "(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "stripe3ds2CompletionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getStripe3ds2CompletionLauncher$payments_core_debug$annotations", "()V", "getStripe3ds2CompletionLauncher$payments_core_debug", "()Landroidx/activity/result/ActivityResultLauncher;", "setStripe3ds2CompletionLauncher$payments_core_debug", "(Landroidx/activity/result/ActivityResultLauncher;)V", "stripe3ds2CompletionStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "authenticate", "", "host", "authenticatable", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLauncherInvalidated", "onNewActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_debug"})
@javax.inject.Singleton()
public final class Stripe3DS2Authenticator implements com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> {
    private final com.stripe.android.PaymentAuthConfig config = null;
    private final boolean enableLogging = false;
    private final java.lang.String injectorKey = null;
    private final kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider = null;
    private final java.util.Set<java.lang.String> productUsage = null;
    
    /**
     * [stripe3ds2CompletionLauncher] is mutable and might be updated during
     * through [onNewActivityResultCaller]
     */
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;
    private final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter> stripe3ds2CompletionStarterFactory = null;
    
    @javax.inject.Inject()
    public Stripe3DS2Authenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentAuthConfig config, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> getStripe3ds2CompletionLauncher$payments_core_debug() {
        return null;
    }
    
    /**
     * [stripe3ds2CompletionLauncher] is mutable and might be updated during
     * through [onNewActivityResultCaller]
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStripe3ds2CompletionLauncher$payments_core_debug$annotations() {
    }
    
    public final void setStripe3ds2CompletionLauncher$payments_core_debug(@org.jetbrains.annotations.Nullable()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> p0) {
    }
    
    @java.lang.Override()
    public void onNewActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback) {
    }
    
    @java.lang.Override()
    public void onLauncherInvalidated() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent authenticatable, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}