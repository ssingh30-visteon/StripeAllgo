package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "fpxAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "fpxBankStatuses", "Lcom/stripe/android/model/BankStatuses;", "viewModel", "Lcom/stripe/android/view/FpxViewModel;", "getViewModel", "()Lcom/stripe/android/view/FpxViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getItem", "Lcom/stripe/android/view/FpxBank;", "position", "onFpxBankStatusesUpdated", "", "updateStatuses", "Companion", "payments-core_debug"})
public final class AddPaymentMethodFpxView extends com.stripe.android.view.AddPaymentMethodView {
    private com.stripe.android.model.BankStatuses fpxBankStatuses;
    private final com.stripe.android.view.AddPaymentMethodListAdapter fpxAdapter = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.AddPaymentMethodFpxView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodFpxView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodFpxView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodFpxView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final com.stripe.android.view.FpxViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams getCreateParams() {
        return null;
    }
    
    private final void onFpxBankStatusesUpdated(com.stripe.android.model.BankStatuses fpxBankStatuses) {
    }
    
    private final void updateStatuses(com.stripe.android.model.BankStatuses fpxBankStatuses) {
    }
    
    private final com.stripe.android.view.FpxBank getItem(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AddPaymentMethodFpxView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}