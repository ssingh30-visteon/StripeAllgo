package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "sectionFieldErrorController", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "setRawValue", "", "formFragmentArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "Lcom/stripe/android/paymentsheet/elements/SectionMultiFieldElement;", "Lcom/stripe/android/paymentsheet/elements/SectionSingleFieldElement;", "paymentsheet_debug"})
public abstract interface SectionFieldElement {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.elements.SectionFieldErrorController sectionFieldErrorController();
    
    public abstract void setRawValue(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments formFragmentArguments);
}