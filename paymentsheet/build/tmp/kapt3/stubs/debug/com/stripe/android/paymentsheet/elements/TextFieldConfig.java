package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H&R\u001b\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u001d\u001e\u001f \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldConfig;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "label", "", "getLabel", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "determineState", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "input", "filter", "userTyped", "Lcom/stripe/android/paymentsheet/elements/EmailConfig;", "Lcom/stripe/android/paymentsheet/elements/IbanConfig;", "Lcom/stripe/android/paymentsheet/elements/NameConfig;", "Lcom/stripe/android/paymentsheet/elements/SimpleTextFieldConfig;", "paymentsheet_debug"})
public abstract interface TextFieldConfig {
    
    /**
     * This is a label for debug logs
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDebugLabel();
    
    /**
     * This is the label to describe the field
     */
    public abstract int getLabel();
    
    /**
     * Transformation for changing visual output of the input field.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.compose.ui.text.input.VisualTransformation getVisualTransformation();
    
    /**
     * This will determine the state of the field based on the text
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.elements.TextFieldState determineState(@org.jetbrains.annotations.NotNull()
    java.lang.String input);
    
    /**
     * This works a little like the input filter, removing pasted characters that are invalid in
     * the case where the keyboard allows more than the allowed characters, or characters are
     * pasted in
     *
     * @return displayable string
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String filter(@org.jetbrains.annotations.NotNull()
    java.lang.String userTyped);
    
    /**
     * This will convert the field to a raw value to use in the parameter map
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String convertToRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String displayName);
    
    /**
     * This will convert from a raw value used in the parameter map to a disiplayValue
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String convertFromRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue);
}