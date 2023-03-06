package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This class provides the logic behind the fields.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0012\u0010\u0012\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/InputController;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "fieldValue", "Lkotlinx/coroutines/flow/Flow;", "", "getFieldValue", "()Lkotlinx/coroutines/flow/Flow;", "formFieldValue", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "getFormFieldValue", "isComplete", "", "label", "", "getLabel", "()I", "rawFieldValue", "getRawFieldValue", "showOptionalLabel", "getShowOptionalLabel", "()Z", "onRawValueChange", "", "rawValue", "Lcom/stripe/android/paymentsheet/elements/DropdownFieldController;", "Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseController;", "Lcom/stripe/android/paymentsheet/elements/TextFieldController;", "paymentsheet_debug"})
public abstract interface InputController extends com.stripe.android.paymentsheet.elements.SectionFieldErrorController {
    
    public abstract int getLabel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getFieldValue();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getRawFieldValue();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> isComplete();
    
    public abstract boolean getShowOptionalLabel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldEntry> getFormFieldValue();
    
    public abstract void onRawValueChange(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue);
}