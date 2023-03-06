package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is the style for the section title.
 *
 * Once credit card is converted use one of the default material theme styles.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BD\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\u0019\u0010\u001d\u001a\u00020\bH\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001e\u0010\u0016J\u0019\u0010\u001f\u001a\u00020\nH\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b \u0010\u000eJ\u0019\u0010!\u001a\u00020\nH\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\b\"\u0010\u000eJR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u001c\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000b\u001a\u00020\n\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u00020\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionTitle;", "", "light", "Landroidx/compose/ui/graphics/Color;", "dark", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "paddingBottom", "Landroidx/compose/ui/unit/Dp;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "(JJLandroidx/compose/ui/text/font/FontWeight;FJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDark-0d7_KjU", "()J", "J", "getFontSize-XSAIIZE", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLight-0d7_KjU", "getPaddingBottom-D9Ej5fM", "()F", "F", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component4", "component4-D9Ej5fM", "component5", "component5-XSAIIZE", "component6", "component6-XSAIIZE", "copy", "copy-RwOOn5U", "(JJLandroidx/compose/ui/text/font/FontWeight;FJJ)Lcom/stripe/android/paymentsheet/elements/SectionTitle;", "equals", "", "other", "hashCode", "", "toString", "", "paymentsheet_debug"})
public final class SectionTitle {
    private final long light = 0L;
    private final long dark = 0L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.font.FontWeight fontWeight = null;
    private final float paddingBottom = 0.0F;
    private final long letterSpacing = 0L;
    private final long fontSize = 0L;
    
    /**
     * This is the style for the section title.
     *
     * Once credit card is converted use one of the default material theme styles.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * This is the style for the section title.
     *
     * Once credit card is converted use one of the default material theme styles.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This is the style for the section title.
     *
     * Once credit card is converted use one of the default material theme styles.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private SectionTitle(long light, long dark, androidx.compose.ui.text.font.FontWeight fontWeight, float paddingBottom, long letterSpacing, long fontSize) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.font.FontWeight component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.font.FontWeight getFontWeight() {
        return null;
    }
}