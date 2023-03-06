package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is an element that has static text because it takes no user input, it is not
 * outputted from the list of form field values.  If the stringResId contains a %s, the first
 * one will be populated in the form with the merchantName parameter.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001\u00a2\u0006\u0002\b J\u000b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\b&J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J \u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/0.0-0,H\u0016J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J\t\u00101\u001a\u00020\tH\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/StaticTextElement;", "Lcom/stripe/android/paymentsheet/elements/FormElement;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "stringResId", "", "color", "Landroidx/compose/ui/graphics/Color;", "merchantName", "", "fontSizeSp", "letterSpacingSp", "", "controller", "Lcom/stripe/android/paymentsheet/elements/InputController;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;ILandroidx/compose/ui/graphics/Color;Ljava/lang/String;IDLcom/stripe/android/paymentsheet/elements/InputController;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getController", "()Lcom/stripe/android/paymentsheet/elements/InputController;", "getFontSizeSp", "()I", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getLetterSpacingSp", "()D", "getMerchantName", "()Ljava/lang/String;", "getStringResId", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "component5", "component6", "component7", "copy", "copy-drOMvmE", "equals", "", "other", "", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "hashCode", "toString", "paymentsheet_debug"})
public final class StaticTextElement extends com.stripe.android.paymentsheet.elements.FormElement {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    private final int stringResId = 0;
    @org.jetbrains.annotations.Nullable()
    private final androidx.compose.ui.graphics.Color color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String merchantName = null;
    private final int fontSizeSp = 0;
    private final double letterSpacingSp = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.elements.InputController controller = null;
    
    /**
     * This is an element that has static text because it takes no user input, it is not
     * outputted from the list of form field values.  If the stringResId contains a %s, the first
     * one will be populated in the form with the merchantName parameter.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * This is an element that has static text because it takes no user input, it is not
     * outputted from the list of form field values.  If the stringResId contains a %s, the first
     * one will be populated in the form with the merchantName parameter.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This is an element that has static text because it takes no user input, it is not
     * outputted from the list of form field values.  If the stringResId contains a %s, the first
     * one will be populated in the form with the merchantName parameter.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private StaticTextElement(com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, int stringResId, androidx.compose.ui.graphics.Color color, java.lang.String merchantName, int fontSizeSp, double letterSpacingSp, com.stripe.android.paymentsheet.elements.InputController controller) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantName() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFontSizeSp() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getLetterSpacingSp() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.elements.InputController component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.InputController getController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
}