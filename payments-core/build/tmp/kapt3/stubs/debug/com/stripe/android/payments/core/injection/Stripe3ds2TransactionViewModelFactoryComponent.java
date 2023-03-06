package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Component to inject [Stripe3ds2TransactionViewModelFactory] when the app process is killed and
 * there is no [Injector] available.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent;", "", "inject", "", "stripe3ds2TransactionViewModelFactory", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Builder", "payments-core_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.StripeRepositoryModule.class, com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule.class, com.stripe.android.payments.core.injection.CoroutineContextModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface Stripe3ds2TransactionViewModelFactoryComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\u00020\u00002\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0018\u0010\u000b\u001a\u00020\u00002\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent$Builder;", "", "build", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "payments-core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder enableLogging(@javax.inject.Named(value = "enableLogging")
        boolean enableLogging);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder publishableKeyProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder productUsage(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        java.util.Set<java.lang.String> productUsage);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent build();
    }
}