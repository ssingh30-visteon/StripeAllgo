package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", "", "inject", "", "factory", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Builder", "paymentsheet_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.StripeRepositoryModule.class, com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule.class, com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelModule.class, com.stripe.android.payments.core.injection.CoroutineContextModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface PaymentOptionsViewModelFactoryComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent$Builder;", "", "build", "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelFactoryComponent;", "context", "Landroid/content/Context;", "productUsage", "", "", "paymentsheet_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder productUsage(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        java.util.Set<java.lang.String> productUsage);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent build();
    }
}