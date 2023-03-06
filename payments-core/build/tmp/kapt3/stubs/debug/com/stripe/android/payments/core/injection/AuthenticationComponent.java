package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * [Component] for com.stripe.android.payments.core.authentication.
 *
 * It holds the dagger graph for [DefaultPaymentAuthenticatorRegistry], with
 * more dependencies daggerized and a higher level [Component]s created, this class will be merged
 * into it.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "", "registry", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "getRegistry", "()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "inject", "", "stripe3ds2TransactionViewModelFactory", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Builder", "payments-core_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.AuthenticationModule.class, com.stripe.android.payments.core.injection.Stripe3DSAuthenticatorModule.class, com.stripe.android.payments.core.injection.WeChatPayAuthenticatorModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface AuthenticationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry getRegistry();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\u00020\u00002\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\'J\u0018\u0010\u0012\u001a\u00020\u00002\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u001c\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0017H\'J\u0012\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\'J\u0012\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\'\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;", "", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "build", "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "injectorKey", "id", "", "productUsage", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "threeDs1IntentReturnUrlMap", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "payments-core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder stripeRepository(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder analyticsRequestExecutor(@org.jetbrains.annotations.NotNull()
        com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder analyticsRequestFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder enableLogging(@javax.inject.Named(value = "enableLogging")
        boolean enableLogging);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder workContext(@org.jetbrains.annotations.NotNull()
        @IOContext()
        kotlin.coroutines.CoroutineContext workContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder uiContext(@org.jetbrains.annotations.NotNull()
        @UIContext()
        kotlin.coroutines.CoroutineContext uiContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder threeDs1IntentReturnUrlMap(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> threeDs1IntentReturnUrlMap);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder injectorKey(@org.jetbrains.annotations.NotNull()
        @InjectorKey()
        java.lang.String id);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder publishableKeyProvider(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent.Builder productUsage(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        java.util.Set<java.lang.String> productUsage);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.core.injection.AuthenticationComponent build();
    }
}