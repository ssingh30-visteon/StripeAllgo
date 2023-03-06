package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "", "inject", "", "factory", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.StripeRepositoryModule.class, com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule.class, com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule.class, com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule.class, com.stripe.android.payments.core.injection.CoroutineContextModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface PaymentSheetLauncherComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory factory);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.forms.FormViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "injectorKey", "", "paymentsheet_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder injectorKey(@org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent build();
    }
}