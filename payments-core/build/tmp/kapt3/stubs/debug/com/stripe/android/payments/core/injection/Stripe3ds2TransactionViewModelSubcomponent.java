package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "getViewModel", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "Builder", "payments-core_debug"})
@dagger.Subcomponent(modules = {com.stripe.android.payments.core.injection.Stripe3dsTransactionViewModelModule.class})
public abstract interface Stripe3ds2TransactionViewModelSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel getViewModel();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "build", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent;", "savedStateHandle", "handle", "Landroidx/lifecycle/SavedStateHandle;", "payments-core_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder savedStateHandle(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle handle);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent build();
    }
}