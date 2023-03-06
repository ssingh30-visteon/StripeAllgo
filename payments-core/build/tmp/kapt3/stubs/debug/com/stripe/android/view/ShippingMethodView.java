package com.stripe.android.view;

import java.lang.System;

/**
 * Renders the information related to a shipping method.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/view/ShippingMethodView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "selectedColorInt", "unselectedTextColorPrimaryInt", "unselectedTextColorSecondaryInt", "viewBinding", "Lcom/stripe/android/databinding/ShippingMethodViewBinding;", "setSelected", "", "selected", "", "setShippingMethod", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "payments-core_debug"})
public final class ShippingMethodView extends android.widget.RelativeLayout {
    private final com.stripe.android.view.StripeColorUtils colorUtils = null;
    @androidx.annotation.ColorInt()
    private final int selectedColorInt = 0;
    @androidx.annotation.ColorInt()
    private final int unselectedTextColorSecondaryInt = 0;
    @androidx.annotation.ColorInt()
    private final int unselectedTextColorPrimaryInt = 0;
    private final com.stripe.android.databinding.ShippingMethodViewBinding viewBinding = null;
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethodView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethodView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethodView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    public void setSelected(boolean selected) {
    }
    
    public final void setShippingMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingMethod shippingMethod) {
    }
}