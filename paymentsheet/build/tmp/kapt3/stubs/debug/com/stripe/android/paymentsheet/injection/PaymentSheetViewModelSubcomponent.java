package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Builder", "paymentsheet_debug"})
@dagger.Subcomponent(modules = {com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule.class})
public abstract interface PaymentSheetViewModelSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.PaymentSheetViewModel getViewModel();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "", "build", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent;", "paymentSheetViewModelModule", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;", "paymentsheet_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder paymentSheetViewModelModule(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule paymentSheetViewModelModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent build();
    }
}