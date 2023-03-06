package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsListFragment;", "Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "activityViewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "getActivityViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "activityViewModel$delegate", "Lkotlin/Lazy;", "sheetViewModel", "getSheetViewModel", "sheetViewModel$delegate", "onPaymentOptionSelected", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "isClick", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "transitionToAddPaymentMethod", "paymentsheet_debug"})
public final class PaymentOptionsListFragment extends com.stripe.android.paymentsheet.BasePaymentMethodsListFragment {
    private final kotlin.Lazy activityViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sheetViewModel$delegate = null;
    
    public PaymentOptionsListFragment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter) {
        super(false, null);
    }
    
    private final com.stripe.android.paymentsheet.PaymentOptionsViewModel getActivityViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentOptionsViewModel getSheetViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void transitionToAddPaymentMethod() {
    }
    
    @java.lang.Override()
    public void onPaymentOptionSelected(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection, boolean isClick) {
    }
}