package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/RowController;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "fields", "", "Lcom/stripe/android/paymentsheet/elements/SectionSingleFieldElement;", "(Ljava/util/List;)V", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError$annotations", "()V", "getError", "()Lkotlinx/coroutines/flow/Flow;", "getFields", "()Ljava/util/List;", "paymentsheet_debug"})
public final class RowController implements com.stripe.android.paymentsheet.elements.SectionFieldErrorController {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> fields = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> error = null;
    
    public RowController(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> fields) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> getFields() {
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