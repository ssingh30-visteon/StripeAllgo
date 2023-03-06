package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;", "", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "(Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;)V", "provideArgs", "providePrefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_debug"})
@dagger.Module()
public final class PaymentSheetViewModelModule {
    private final com.stripe.android.paymentsheet.PaymentSheetContract.Args starterArgs = null;
    
    public PaymentSheetViewModelModule(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetContract.Args starterArgs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stripe.android.paymentsheet.PaymentSheetContract.Args provideArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stripe.android.paymentsheet.PrefsRepository providePrefsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        return null;
    }
}