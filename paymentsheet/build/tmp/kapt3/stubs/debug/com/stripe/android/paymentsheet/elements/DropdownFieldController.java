package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This class controls the dropdown view and implements the [InputController] interface.
 * Because it can never be in error the `errorMessage` is always null.  It is also
 * designed to always have a value selected, so isComplete is always true.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0006H\u0016J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\nR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/DropdownFieldController;", "Lcom/stripe/android/paymentsheet/elements/InputController;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "config", "Lcom/stripe/android/paymentsheet/elements/DropdownConfig;", "initialValue", "", "(Lcom/stripe/android/paymentsheet/elements/DropdownConfig;Ljava/lang/String;)V", "_selectedIndex", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "displayItems", "", "getDisplayItems", "()Ljava/util/List;", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "fieldValue", "getFieldValue", "formFieldValue", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "getFormFieldValue", "isComplete", "", "label", "getLabel", "()I", "rawFieldValue", "getRawFieldValue", "selectedIndex", "getSelectedIndex", "showOptionalLabel", "getShowOptionalLabel", "()Z", "onRawValueChange", "", "rawValue", "onValueChange", "index", "paymentsheet_debug"})
public final class DropdownFieldController implements com.stripe.android.paymentsheet.elements.InputController, com.stripe.android.paymentsheet.elements.SectionFieldErrorController {
    private final com.stripe.android.paymentsheet.elements.DropdownConfig config = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> displayItems = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _selectedIndex = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> selectedIndex = null;
    private final int label = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> fieldValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> rawFieldValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> error = null;
    private final boolean showOptionalLabel = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isComplete = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldEntry> formFieldValue = null;
    
    public DropdownFieldController(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.DropdownConfig config, @org.jetbrains.annotations.Nullable()
    java.lang.String initialValue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDisplayItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getSelectedIndex() {
        return null;
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
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
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> getError() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getShowOptionalLabel() {
        return false;
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
    public final void onValueChange(int index) {
    }
    
    /**
     * This is called when the value changed to is a raw backing value, not a display value.
     */
    @java.lang.Override()
    public void onRawValueChange(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue) {
    }
}