package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

/**
 * Component to inject [GooglePayPaymentMethodLauncherViewModel.Factory] when the app process is
 * killed and there is no [Injector] available.
 * This component will create new instances of all dependencies.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent;", "", "inject", "", "factory", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory;", "Builder", "payments-core_debug"})
@dagger.Component(modules = {com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherModule.class, com.stripe.android.payments.core.injection.StripeRepositoryModule.class, com.stripe.android.payments.core.injection.CoroutineContextModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface GooglePayPaymentMethodLauncherViewModelFactoryComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\u00020\u00002\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\'J\u0018\u0010\u000e\u001a\u00020\u00002\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\'J\u001a\u0010\u0010\u001a\u00020\u00002\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent$Builder;", "", "build", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "googlePayConfig", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "payments-core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder enableLogging(@javax.inject.Named(value = "enableLogging")
        boolean enableLogging);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder publishableKeyProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "stripeAccountId")
        kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder productUsage(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        java.util.Set<java.lang.String> productUsage);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder googlePayConfig(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent build();
    }
}