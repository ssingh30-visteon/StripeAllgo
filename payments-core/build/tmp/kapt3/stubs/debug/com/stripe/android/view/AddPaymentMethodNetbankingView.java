package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "netbankingAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "selectedPosition", "Ljava/lang/Integer;", "Companion", "payments-core_debug"})
public final class AddPaymentMethodNetbankingView extends com.stripe.android.view.AddPaymentMethodView {
    private java.lang.Integer selectedPosition;
    private final com.stripe.android.view.AddPaymentMethodListAdapter netbankingAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.AddPaymentMethodNetbankingView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodNetbankingView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodNetbankingView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodNetbankingView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams getCreateParams() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}