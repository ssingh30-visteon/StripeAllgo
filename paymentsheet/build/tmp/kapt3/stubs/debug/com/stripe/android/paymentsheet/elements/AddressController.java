package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is the controller for a section with a changing number and set of fields.
 * This is in contrast to the [SectionController] which is a section in which the fields
 * in it do not change.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R$\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/AddressController;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "fieldsFlowable", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "(Lkotlinx/coroutines/flow/Flow;)V", "error", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError$annotations", "()V", "getError", "()Lkotlinx/coroutines/flow/Flow;", "getFieldsFlowable", "label", "", "getLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "paymentsheet_debug"})
public final class AddressController implements com.stripe.android.paymentsheet.elements.SectionFieldErrorController {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> fieldsFlowable = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    private final java.lang.Integer label = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> error = null;
    
    public AddressController(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldElement>> fieldsFlowable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> getFieldsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> getError() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getError$annotations() {
    }
}