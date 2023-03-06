package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

/**
 * Component that holds the dependency graph for the lifecycle of [GooglePayPaymentMethodLauncher]
 * and related classes.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherComponent;", "", "()V", "inject", "", "factory", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory;", "Builder", "payments-core_debug"})
@dagger.Component(modules = {com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract class GooglePayPaymentMethodLauncherComponent {
    
    public GooglePayPaymentMethodLauncherComponent() {
        super();
    }
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\'J\u0012\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\'J\u001a\u0010\u0014\u001a\u00020\u00002\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\'J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherComponent$Builder;", "", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "build", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "googlePayConfig", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "ioContext", "workContext", "Lkotlin/coroutines/CoroutineContext;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "payments-core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder ioContext(@org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.IOContext()
        kotlin.coroutines.CoroutineContext workContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder analyticsRequestFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder stripeRepository(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder googlePayConfig(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder enableLogging(@javax.inject.Named(value = "enableLogging")
        boolean enableLogging);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder publishableKeyProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder stripeAccountIdProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "stripeAccountId")
        kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent build();
    }
}