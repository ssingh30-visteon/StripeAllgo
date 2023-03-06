package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "Builder", "payments-core_debug"})
@dagger.Subcomponent()
public abstract interface GooglePayPaymentMethodLauncherViewModelSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel getViewModel();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "build", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "payments-core_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder savedStateHandle(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent build();
    }
}