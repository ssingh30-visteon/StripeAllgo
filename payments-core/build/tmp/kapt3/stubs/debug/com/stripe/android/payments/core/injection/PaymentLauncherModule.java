package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007Jz\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;", "", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "context", "Landroid/content/Context;", "providePaymentAuthenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "defaultAnalyticsRequestExecutor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "publishableKeyProvider", "Lkotlin/Function0;", "productUsage", "", "provideThreeDs1IntentReturnUrlMap", "payments-core_debug"})
@dagger.Module(subcomponents = {com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.class})
public final class PaymentLauncherModule {
    
    public PaymentLauncherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.util.Map<java.lang.String, java.lang.String> provideThreeDs1IntentReturnUrlMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.stripe.android.payments.DefaultReturnUrl provideDefaultReturnUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry providePaymentAuthenticatorRegistry(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    @UIContext()
    kotlin.coroutines.CoroutineContext uiContext, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsage) {
        return null;
    }
}