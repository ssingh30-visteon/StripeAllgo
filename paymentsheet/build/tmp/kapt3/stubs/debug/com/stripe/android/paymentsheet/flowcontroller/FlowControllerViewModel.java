package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "value", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "initData", "getInitData", "()Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "setInitData", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)V", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "Companion", "paymentsheet_debug"})
public final class FlowControllerViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.SavedStateHandle handle = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String INIT_DATA_KEY = "init_data";
    
    public FlowControllerViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.model.PaymentSelection getPaymentSelection() {
        return null;
    }
    
    public final void setPaymentSelection(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.flowcontroller.InitData getInitData() {
        return null;
    }
    
    public final void setInitData(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.flowcontroller.InitData value) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;", "", "()V", "INIT_DATA_KEY", "", "paymentsheet_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}