package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "", "inject", "", "factory", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Builder", "payments-core_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.PaymentLauncherModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface PaymentLauncherComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0018\u0010\u000e\u001a\u00020\u00002\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\'J\u001a\u0010\u0013\u001a\u00020\u00002\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0012H\'J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0012\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\'\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;", "", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "build", "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "ioContext", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "uiContext", "payments-core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder enableLogging(@javax.inject.Named(value = "enableLogging")
        boolean enableLogging);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder ioContext(@org.jetbrains.annotations.NotNull()
        @IOContext()
        kotlin.coroutines.CoroutineContext workContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder uiContext(@org.jetbrains.annotations.NotNull()
        @UIContext()
        kotlin.coroutines.CoroutineContext uiContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder stripeRepository(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder analyticsRequestFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder publishableKeyProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder stripeAccountIdProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "stripeAccountId")
        kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder productUsage(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        java.util.Set<java.lang.String> productUsage);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherComponent build();
    }
}