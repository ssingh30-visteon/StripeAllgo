package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This class will provide the onValueChanged and onFocusChanged functionality to the field's
 * composable.  These functions will update the observables as needed.  It is responsible for
 * exposing immutable observers for its data
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006J\u0010\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\bH\u0016J\u000e\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u00020\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001c\u0010#\u001a\u00020$\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b%\u0010\u0012R\u0016\u0010&\u001a\u00020\'8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010/\u001a\u000200\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006:"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldController;", "Lcom/stripe/android/paymentsheet/elements/InputController;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "textFieldConfig", "Lcom/stripe/android/paymentsheet/elements/TextFieldConfig;", "showOptionalLabel", "", "initialValue", "", "(Lcom/stripe/android/paymentsheet/elements/TextFieldConfig;ZLjava/lang/String;)V", "_fieldState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "_fieldValue", "_hasFocus", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "fieldValue", "getFieldValue", "formFieldValue", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "getFormFieldValue", "isComplete", "isFull", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE", "label", "", "getLabel", "rawFieldValue", "getRawFieldValue", "getShowOptionalLabel", "()Z", "visibleError", "getVisibleError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "onFocusChange", "", "newHasFocus", "onRawValueChange", "rawValue", "onValueChange", "displayFormatted", "paymentsheet_debug"})
public final class TextFieldController implements com.stripe.android.paymentsheet.elements.InputController, com.stripe.android.paymentsheet.elements.SectionFieldErrorController {
    private final com.stripe.android.paymentsheet.elements.TextFieldConfig textFieldConfig = null;
    private final boolean showOptionalLabel = false;
    private final int capitalization = 0;
    private final int keyboardType = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.input.VisualTransformation visualTransformation = null;
    @androidx.annotation.StringRes()
    private final int label = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugLabel = null;
    
    /**
     * This is all the information that can be observed on the element
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _fieldValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> fieldValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> rawFieldValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.stripe.android.paymentsheet.elements.TextFieldState> _fieldState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _hasFocus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> visibleError = null;
    
    /**
     * An error must be emitted if it is visible or not visible.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> error = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isFull = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isComplete = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldEntry> formFieldValue = null;
    
    public TextFieldController(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.TextFieldConfig textFieldConfig, boolean showOptionalLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String initialValue) {
        super();
    }
    
    @java.lang.Override()
    public boolean getShowOptionalLabel() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.input.VisualTransformation getVisualTransformation() {
        return null;
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDebugLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getFieldValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getRawFieldValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getVisibleError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isFull() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isComplete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldEntry> getFormFieldValue() {
        return null;
    }
    
    /**
     * This is called when the value changed to is a display value.
     */
    public final void onValueChange(@org.jetbrains.annotations.NotNull()
    java.lang.String displayFormatted) {
    }
    
    /**
     * This is called when the value changed to is a raw backing value, not a display value.
     */
    @java.lang.Override()
    public void onRawValueChange(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue) {
    }
    
    public final void onFocusChange(boolean newHasFocus) {
    }
}