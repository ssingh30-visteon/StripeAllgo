package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u0007R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrandsAdapter", "Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "defaultBackground", "Landroid/graphics/drawable/Drawable;", "onFinishInflate", "", "setCardBrands", "cardBrands", "", "setTintColor", "tintColor", "Adapter", "payments-core_debug"})
public final class CardBrandSpinner extends androidx.appcompat.widget.AppCompatSpinner {
    private final com.stripe.android.view.CardBrandSpinner.Adapter cardBrandsAdapter = null;
    private android.graphics.drawable.Drawable defaultBackground;
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandSpinner(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandSpinner(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardBrandSpinner(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CardBrand getCardBrand() {
        return null;
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void setTintColor(@androidx.annotation.ColorInt()
    int tintColor) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/CardBrand;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "tintColor", "", "getTintColor$payments_core_debug", "()I", "setTintColor$payments_core_debug", "(I)V", "createCardBrandDrawable", "Landroid/graphics/drawable/Drawable;", "cardBrand", "getDropDownView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getView", "payments-core_debug"})
    public static final class Adapter extends android.widget.ArrayAdapter<com.stripe.android.model.CardBrand> {
        private final android.view.LayoutInflater layoutInflater = null;
        @androidx.annotation.ColorInt()
        private int tintColor = 0;
        
        public Adapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null, 0);
        }
        
        public final int getTintColor$payments_core_debug() {
            return 0;
        }
        
        public final void setTintColor$payments_core_debug(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
        android.view.View convertView, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getDropDownView(int position, @org.jetbrains.annotations.Nullable()
        android.view.View convertView, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private final android.graphics.drawable.Drawable createCardBrandDrawable(com.stripe.android.model.CardBrand cardBrand) {
            return null;
        }
    }
}