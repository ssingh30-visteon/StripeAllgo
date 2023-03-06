package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/core/injection/CoroutineContextModule;", "", "()V", "provideUIContext", "Lkotlin/coroutines/CoroutineContext;", "provideWorkContext", "payments-core_debug"})
@dagger.Module()
public final class CoroutineContextModule {
    
    public CoroutineContextModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @IOContext()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlin.coroutines.CoroutineContext provideWorkContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @UIContext()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlin.coroutines.CoroutineContext provideUIContext() {
        return null;
    }
}