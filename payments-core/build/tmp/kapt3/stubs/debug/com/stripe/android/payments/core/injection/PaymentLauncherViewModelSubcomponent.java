package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "Builder", "payments-core_debug"})
@dagger.Subcomponent()
public abstract interface PaymentLauncherViewModelSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel getViewModel();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent$Builder;", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "authActivityStarterHost", "Lcom/stripe/android/view/AuthActivityStarterHost;", "build", "Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent;", "isPaymentIntent", "", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", "payments-core_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder isPaymentIntent(@javax.inject.Named(value = "isPaymentIntent")
        boolean isPaymentIntent);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder savedStateHandle(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle handle);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder authActivityStarterHost(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AuthActivityStarterHost authActivityStarterHost);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder activityResultCaller(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent build();
    }
}