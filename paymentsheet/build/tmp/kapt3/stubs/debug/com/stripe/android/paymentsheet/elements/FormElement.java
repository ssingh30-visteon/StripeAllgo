package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is used to define each section in the visual form layout.
 * Each item in the layout has an identifier and a controller associated with it.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/FormElement;", "", "()V", "controller", "Lcom/stripe/android/paymentsheet/elements/Controller;", "getController", "()Lcom/stripe/android/paymentsheet/elements/Controller;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "Lcom/stripe/android/paymentsheet/elements/AfterpayClearpayHeaderElement;", "Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseElement;", "Lcom/stripe/android/paymentsheet/elements/SectionElement;", "Lcom/stripe/android/paymentsheet/elements/StaticTextElement;", "paymentsheet_debug"})
public abstract class FormElement {
    
    private FormElement() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.paymentsheet.elements.Controller getController();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow();
}