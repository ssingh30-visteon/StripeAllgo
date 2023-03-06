package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * A text field configuration for an IBAN, or International Bank Account Number, as defined in
 * ISO 13616-1.
 *
 * @see [IBAN on Wikipedia](https://en.wikipedia.org/wiki/International_Bank_Account_Number)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0002R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u00020\rX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00108\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IbanConfig;", "Lcom/stripe/android/paymentsheet/elements/TextFieldConfig;", "()V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "label", "", "getLabel", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "determineState", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "input", "filter", "userTyped", "isIbanValid", "", "iban", "Companion", "paymentsheet_debug"})
public final class IbanConfig implements com.stripe.android.paymentsheet.elements.TextFieldConfig {
    private final int capitalization = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugLabel = "iban";
    @androidx.annotation.StringRes()
    private final int label = 0;
    private final int keyboard = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.input.VisualTransformation visualTransformation = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.paymentsheet.elements.IbanConfig.Companion Companion = null;
    @java.lang.Deprecated()
    public static final int MIN_LENGTH = 8;
    @java.lang.Deprecated()
    public static final int MAX_LENGTH = 34;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    private static final java.util.List<java.lang.Character> VALID_INPUT_RANGES = null;
    
    public IbanConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugLabel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.compose.ui.text.input.VisualTransformation getVisualTransformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String filter(@org.jetbrains.annotations.NotNull()
    java.lang.String userTyped) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String convertToRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String displayName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String convertFromRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.TextFieldState determineState(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    /**
     * Verify an IBAN based on the validation algorithm:
     * https://en.wikipedia.org/wiki/International_Bank_Account_Number#Validating_the_IBAN
     *
     * 1. Move the four initial characters to the end of the string
     * 2. Convert letters to numbers, where A = 10, B = 11, ..., Z = 35
     * 3. Interpret the string as a decimal integer and check that the mod 97 is 1
     */
    private final boolean isIbanValid(java.lang.String iban) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IbanConfig$Companion;", "", "()V", "MAX_LENGTH", "", "MIN_LENGTH", "VALID_INPUT_RANGES", "", "", "getVALID_INPUT_RANGES", "()Ljava/util/List;", "paymentsheet_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Character> getVALID_INPUT_RANGES() {
            return null;
        }
    }
}