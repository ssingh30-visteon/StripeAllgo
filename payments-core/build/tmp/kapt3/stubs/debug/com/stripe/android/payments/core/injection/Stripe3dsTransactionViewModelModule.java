package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3dsTransactionViewModelModule;", "", "()V", "providesInitChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "payments-core_debug"})
@dagger.Module()
public final class Stripe3dsTransactionViewModelModule {
    
    public Stripe3dsTransactionViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stripe.android.stripe3ds2.transaction.InitChallengeRepository providesInitChallengeRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args, @org.jetbrains.annotations.NotNull()
    @IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        return null;
    }
}