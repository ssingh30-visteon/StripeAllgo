package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0006H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "colorAccent", "", "getColorAccent", "()I", "colorControlNormal", "getColorControlNormal", "textColorPrimary", "getTextColorPrimary", "textColorSecondary", "getTextColorSecondary", "getTintedIconWithAttribute", "Landroid/graphics/drawable/Drawable;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeResource", "iconResourceId", "getTypedValue", "Landroid/util/TypedValue;", "idRes", "Companion", "payments-core_debug"})
public final class StripeColorUtils {
    private final android.content.Context context = null;
    private final int colorAccent = 0;
    private final int colorControlNormal = 0;
    private final int textColorPrimary = 0;
    private final int textColorSecondary = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.StripeColorUtils.Companion Companion = null;
    
    public StripeColorUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final int getColorAccent() {
        return 0;
    }
    
    public final int getColorControlNormal() {
        return 0;
    }
    
    public final int getTextColorPrimary() {
        return 0;
    }
    
    public final int getTextColorSecondary() {
        return 0;
    }
    
    private final android.util.TypedValue getTypedValue(@androidx.annotation.AttrRes()
    int idRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getTintedIconWithAttribute(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources.Theme theme, @androidx.annotation.AttrRes()
    int attributeResource, @androidx.annotation.DrawableRes()
    int iconResourceId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils$Companion;", "", "()V", "isColorDark", "", "color", "", "isColorTransparent", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Check to see whether the color int is essentially transparent.
         *
         * @param color a [ColorInt] integer
         * @return `true` if this color is too transparent to be seen
         */
        public final boolean isColorTransparent(@androidx.annotation.ColorInt()
        int color) {
            return false;
        }
        
        /**
         * A crude mechanism by which we check whether or not a color is "dark".
         * This is subject to much interpretation, but we attempt to follow traditional
         * design standards.
         *
         * Formula comes from W3C standards and conventional theory about how to calculate the
         * "brightness" of a color, often thought of as how far along the spectrum from white to black
         * the gray-scale version would be.
         *
         * See [W3C's Techniques For Accessibility Evaluation And Repair Tools](https://www.w3.org/TR/AERT#color-contrast)
         * and [RGB colour space](http://paulbourke.net/miscellaneous/colourspace/) for further reading.
         *
         * @param color an integer representation of a color
         * @return `true` if the color is "dark", else `false`
         */
        public final boolean isColorDark(@androidx.annotation.ColorInt()
        int color) {
            return false;
        }
    }
}