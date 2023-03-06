package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetAddPaymentMethodFragment;", "Lcom/stripe/android/paymentsheet/BaseAddPaymentMethodFragment;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "sheetViewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "sheetViewModel$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/FragmentPaymentsheetAddPaymentMethodBinding;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateErrorMessage", "userMessage", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "paymentsheet_debug"})
public final class PaymentSheetAddPaymentMethodFragment extends com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sheetViewModel$delegate = null;
    private com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetAddPaymentMethodBinding viewBinding;
    
    public PaymentSheetAddPaymentMethodFragment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentSheetViewModel getSheetViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateErrorMessage(com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage userMessage) {
    }
}