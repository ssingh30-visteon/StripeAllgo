package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelModule;", "", "()V", "provideDummyInjectorKey", "", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "providePrefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_debug"})
@dagger.Module(subcomponents = {com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.class})
public final class PaymentOptionsViewModelModule {
    
    public PaymentOptionsViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.stripe.android.paymentsheet.analytics.EventReporter.Mode provideEventReporterMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> providePrefsRepositoryFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        return null;
    }
    
    /**
     * This module is only used when the app is recovered from a killed process,
     * where no [Injector] is available. Returns a dummy key instead.
     */
    @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    @dagger.Provides()
    public final java.lang.String provideDummyInjectorKey() {
        return null;
    }
}