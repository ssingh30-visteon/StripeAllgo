package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\u00a2\u0006\u0002\b\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paymentMethodSelectedCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "", "getPaymentMethodSelectedCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function1;", "setPaymentMethodSelectedCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function1;)V", "tappedPaymentMethod", "getTappedPaymentMethod$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod;", "setTappedPaymentMethod$payments_core_debug", "(Lcom/stripe/android/model/PaymentMethod;)V", "attachItemTouchHelper", "callback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "attachItemTouchHelper$payments_core_debug", "payments-core_debug"})
public final class PaymentMethodsRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.stripe.android.model.PaymentMethod, kotlin.Unit> paymentMethodSelectedCallback;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.PaymentMethod tappedPaymentMethod;
    
    @kotlin.jvm.JvmOverloads()
    public PaymentMethodsRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PaymentMethodsRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PaymentMethodsRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.model.PaymentMethod, kotlin.Unit> getPaymentMethodSelectedCallback$payments_core_debug() {
        return null;
    }
    
    public final void setPaymentMethodSelectedCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.PaymentMethod, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod getTappedPaymentMethod$payments_core_debug() {
        return null;
    }
    
    public final void setTappedPaymentMethod$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod p0) {
    }
}