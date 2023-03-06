package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R+\u0010 \u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/model/CardBrand;", "brand", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "setBrand", "(Lcom/stripe/android/model/CardBrand;)V", "brand$delegate", "Lkotlin/properties/ReadWriteProperty;", "iconView", "Landroid/widget/ImageView;", "", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "shouldShowCvc", "getShouldShowCvc", "setShouldShowCvc", "shouldShowCvc$delegate", "shouldShowErrorIcon", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "shouldShowErrorIcon$delegate", "tintColorInt", "getTintColorInt$payments_core_debug", "()I", "setTintColorInt$payments_core_debug", "(I)V", "viewBinding", "Lcom/stripe/android/databinding/CardBrandViewBinding;", "applyTint", "", "renderBrandIcon", "updateIcon", "payments-core_debug"})
public final class CardBrandView extends android.widget.FrameLayout {
    private final com.stripe.android.databinding.CardBrandViewBinding viewBinding = null;
    private final android.widget.ImageView iconView = null;
    private final com.stripe.android.view.CardWidgetProgressView progressView = null;
    @androidx.annotation.ColorInt()
    private int tintColorInt = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty isLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty brand$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shouldShowCvc$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shouldShowErrorIcon$delegate = null;
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getTintColorInt$payments_core_debug() {
        return 0;
    }
    
    public final void setTintColorInt$payments_core_debug(int p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getBrand() {
        return null;
    }
    
    public final void setBrand(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand p0) {
    }
    
    public final boolean getShouldShowCvc() {
        return false;
    }
    
    public final void setShouldShowCvc(boolean p0) {
    }
    
    public final boolean getShouldShowErrorIcon() {
        return false;
    }
    
    public final void setShouldShowErrorIcon(boolean p0) {
    }
    
    private final void updateIcon() {
    }
    
    private final void renderBrandIcon() {
    }
    
    private final void applyTint() {
    }
}