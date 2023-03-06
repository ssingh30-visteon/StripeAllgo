package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is for elements that do not receive user input
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B:\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/StaticTextSpec;", "Lcom/stripe/android/paymentsheet/elements/FormItemSpec;", "Lcom/stripe/android/paymentsheet/elements/RequiredItemSpec;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "stringResId", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSizeSp", "letterSpacingSp", "", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;ILandroidx/compose/ui/graphics/Color;IDLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getFontSizeSp", "()I", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getLetterSpacingSp", "()D", "getStringResId", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "component5", "copy", "copy-YJ7xMek", "equals", "", "other", "", "hashCode", "toString", "", "paymentsheet_debug"})
public final class StaticTextSpec extends com.stripe.android.paymentsheet.elements.FormItemSpec implements com.stripe.android.paymentsheet.elements.RequiredItemSpec {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    private final int stringResId = 0;
    @org.jetbrains.annotations.Nullable()
    private final androidx.compose.ui.graphics.Color color = null;
    private final int fontSizeSp = 0;
    private final double letterSpacingSp = 0.0;
    
    /**
     * This is for elements that do not receive user input
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * This is for elements that do not receive user input
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This is for elements that do not receive user input
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private StaticTextSpec(com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, int stringResId, androidx.compose.ui.graphics.Color color, int fontSizeSp, double letterSpacingSp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.IdentifierSpec component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getStringResId() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getFontSizeSp() {
        return 0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getLetterSpacingSp() {
        return 0.0;
    }
}