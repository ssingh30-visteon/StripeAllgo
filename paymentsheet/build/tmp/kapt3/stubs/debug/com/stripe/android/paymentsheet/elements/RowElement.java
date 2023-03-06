package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ \u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00100\u00050\u000fH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/RowElement;", "Lcom/stripe/android/paymentsheet/elements/SectionMultiFieldElement;", "_identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "fields", "", "Lcom/stripe/android/paymentsheet/elements/SectionSingleFieldElement;", "controller", "Lcom/stripe/android/paymentsheet/elements/RowController;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/paymentsheet/elements/RowController;)V", "getController", "()Lcom/stripe/android/paymentsheet/elements/RowController;", "getFields", "()Ljava/util/List;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "sectionFieldErrorController", "setRawValue", "", "formFragmentArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "paymentsheet_debug"})
public final class RowElement extends com.stripe.android.paymentsheet.elements.SectionMultiFieldElement {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> fields = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.RowController controller = null;
    
    public RowElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec _identifier, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> fields, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.RowController controller) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.RowController getController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.RowController sectionFieldErrorController() {
        return null;
    }
    
    @java.lang.Override()
    public void setRawValue(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments formFragmentArguments) {
    }
}