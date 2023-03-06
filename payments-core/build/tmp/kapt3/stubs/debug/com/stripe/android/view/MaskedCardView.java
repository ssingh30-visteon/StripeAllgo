package com.stripe.android.view;

import java.lang.System;

/**
 * View that displays card information without revealing the entire number, usually for
 * selection in a list. The view can be toggled to "selected" state. Colors for the selected
 * and unselected states are taken from the host Activity theme's
 * "colorAccent" and "colorControlNormal" states.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "cardDisplayFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "", "last4", "getLast4", "()Ljava/lang/String;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "viewBinding", "Lcom/stripe/android/databinding/MaskedCardViewBinding;", "getViewBinding$payments_core_debug", "()Lcom/stripe/android/databinding/MaskedCardViewBinding;", "applyTint", "", "imageView", "Landroid/widget/ImageView;", "setPaymentMethod", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "setSelected", "selected", "", "updateBrandIcon", "updateCheckMark", "updateUi", "payments-core_debug"})
public final class MaskedCardView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.model.CardBrand cardBrand = com.stripe.android.model.CardBrand.Unknown;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String last4;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.databinding.MaskedCardViewBinding viewBinding = null;
    private final com.stripe.android.view.ThemeConfig themeConfig = null;
    private final com.stripe.android.view.CardDisplayTextFactory cardDisplayFactory = null;
    
    @kotlin.jvm.JvmOverloads()
    public MaskedCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MaskedCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MaskedCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getCardBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.String getLast4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.databinding.MaskedCardViewBinding getViewBinding$payments_core_debug() {
        return null;
    }
    
    private final void applyTint(android.widget.ImageView imageView) {
    }
    
    @java.lang.Override()
    public void setSelected(boolean selected) {
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
    }
    
    private final void updateUi() {
    }
    
    private final void updateBrandIcon() {
    }
    
    private final void updateCheckMark() {
    }
}