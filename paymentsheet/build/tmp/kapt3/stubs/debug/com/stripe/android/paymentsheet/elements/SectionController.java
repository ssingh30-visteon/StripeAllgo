package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is the controller for a section with a static number of fields.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionController;", "Lcom/stripe/android/paymentsheet/elements/Controller;", "label", "", "sectionFieldErrorControllers", "", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "(Ljava/lang/Integer;Ljava/util/List;)V", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "getLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSectionFieldErrorControllers", "()Ljava/util/List;", "paymentsheet_debug"})
public final class SectionController implements com.stripe.android.paymentsheet.elements.Controller {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer label = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldErrorController> sectionFieldErrorControllers = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> error = null;
    
    public SectionController(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer label, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldErrorController> sectionFieldErrorControllers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldErrorController> getSectionFieldErrorControllers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> getError() {
        return null;
    }
}