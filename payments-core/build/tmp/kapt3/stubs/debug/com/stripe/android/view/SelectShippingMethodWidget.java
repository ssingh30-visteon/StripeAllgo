package com.stripe.android.view;

import java.lang.System;

/**
 * A widget that allows the user to select a shipping method.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u001a\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/SelectShippingMethodWidget;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "shippingMethodAdapter", "Lcom/stripe/android/view/ShippingMethodAdapter;", "setSelectedShippingMethod", "", "shippingMethod", "setShippingMethodSelectedCallback", "callback", "Lkotlin/Function1;", "setShippingMethods", "shippingMethods", "", "payments-core_debug"})
public final class SelectShippingMethodWidget extends android.widget.FrameLayout {
    private final com.stripe.android.view.ShippingMethodAdapter shippingMethodAdapter = null;
    
    @kotlin.jvm.JvmOverloads()
    public SelectShippingMethodWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SelectShippingMethodWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public SelectShippingMethodWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod getSelectedShippingMethod() {
        return null;
    }
    
    public final void setShippingMethodSelectedCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.ShippingMethod, kotlin.Unit> callback) {
    }
    
    /**
     * Specify the shipping methods to show.
     */
    public final void setShippingMethods(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods) {
    }
    
    public final void setSelectedShippingMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingMethod shippingMethod) {
    }
}