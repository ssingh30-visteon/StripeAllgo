package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * Implementation of [PaymentLauncher], start an [PaymentLauncherConfirmationActivity] to confirm and
 * handle next actions for intents.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\b\u0001\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0014\u0010%\u001a\u00020\u001e2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\'H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "Lcom/stripe/android/payments/core/injection/Injector;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "context", "Landroid/content/Context;", "enableLogging", "", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "productUsage", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V", "injectorKey", "getInjectorKey$annotations", "()V", "paymentLauncherComponent", "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "confirm", "", "params", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionForPaymentIntent", "clientSecret", "handleNextActionForSetupIntent", "inject", "injectable", "Lcom/stripe/android/payments/core/injection/Injectable;", "payments-core_debug"})
public final class StripePaymentLauncher implements com.stripe.android.payments.paymentlauncher.PaymentLauncher, com.stripe.android.payments.core.injection.Injector {
    private final kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider = null;
    private final kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider = null;
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> hostActivityLauncher = null;
    private final boolean enableLogging = false;
    private final java.util.Set<java.lang.String> productUsage = null;
    private final com.stripe.android.payments.core.injection.PaymentLauncherComponent paymentLauncherComponent = null;
    private final java.lang.String injectorKey = null;
    
    @dagger.assisted.AssistedInject()
    public StripePaymentLauncher(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted(value = "stripeAccountId")
    kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args> hostActivityLauncher, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext ioContext, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.UIContext()
    kotlin.coroutines.CoroutineContext uiContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsage) {
        super();
    }
    
    @com.stripe.android.payments.core.injection.InjectorKey()
    @java.lang.Deprecated()
    private static void getInjectorKey$annotations() {
    }
    
    @java.lang.Override()
    public void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<?> injectable) {
    }
    
    @java.lang.Override()
    public void confirm(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams params) {
    }
    
    @java.lang.Override()
    public void confirm(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams params) {
    }
    
    @java.lang.Override()
    public void handleNextActionForPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    @java.lang.Override()
    public void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
}