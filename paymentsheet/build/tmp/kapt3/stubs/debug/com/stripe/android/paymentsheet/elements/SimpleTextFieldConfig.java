package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B&\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0016R\u001f\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\rX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SimpleTextFieldConfig;", "Lcom/stripe/android/paymentsheet/elements/TextFieldConfig;", "label", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "getKeyboard-PjHm6EE", "getLabel", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "determineState", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "input", "filter", "userTyped", "paymentsheet_debug"})
public final class SimpleTextFieldConfig implements com.stripe.android.paymentsheet.elements.TextFieldConfig {
    private final int label = 0;
    private final int capitalization = 0;
    private final int keyboard = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugLabel = "generic_text";
    @org.jetbrains.annotations.Nullable()
    private final androidx.compose.ui.text.input.VisualTransformation visualTransformation = null;
    
    private SimpleTextFieldConfig(int label, int capitalization, int keyboard) {
        super();
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.compose.ui.text.input.VisualTransformation getVisualTransformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.TextFieldState determineState(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
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
}