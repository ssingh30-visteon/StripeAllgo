package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u000e\u0010&\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0006R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseController;", "Lcom/stripe/android/paymentsheet/elements/InputController;", "identifiersRequiredForFutureUse", "", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "saveForFutureUseInitialValue", "", "(Ljava/util/List;Z)V", "_saveForFutureUse", "Lkotlinx/coroutines/flow/MutableStateFlow;", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "fieldValue", "", "getFieldValue", "formFieldValue", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "getFormFieldValue", "hiddenIdentifiers", "getHiddenIdentifiers", "isComplete", "label", "", "getLabel", "()I", "rawFieldValue", "getRawFieldValue", "saveForFutureUse", "getSaveForFutureUse", "showOptionalLabel", "getShowOptionalLabel", "()Z", "onRawValueChange", "", "rawValue", "onValueChange", "paymentsheet_debug"})
public final class SaveForFutureUseController implements com.stripe.android.paymentsheet.elements.InputController {
    private final int label = 0;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _saveForFutureUse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> saveForFutureUse = null;
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
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> hiddenIdentifiers = null;
    
    public SaveForFutureUseController(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.IdentifierSpec> identifiersRequiredForFutureUse, boolean saveForFutureUseInitialValue) {
        super();
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSaveForFutureUse() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> getHiddenIdentifiers() {
        return null;
    }
    
    public final void onValueChange(boolean saveForFutureUse) {
    }
    
    @java.lang.Override()
    public void onRawValueChange(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue) {
    }
}