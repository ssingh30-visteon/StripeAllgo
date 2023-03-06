package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is an element that is in a section and accepts user input.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionSingleFieldElement;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;)V", "controller", "Lcom/stripe/android/paymentsheet/elements/InputController;", "getController", "()Lcom/stripe/android/paymentsheet/elements/InputController;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "sectionFieldErrorController", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "Lcom/stripe/android/paymentsheet/elements/CountryElement;", "Lcom/stripe/android/paymentsheet/elements/EmailElement;", "Lcom/stripe/android/paymentsheet/elements/IbanElement;", "Lcom/stripe/android/paymentsheet/elements/SimpleDropdownElement;", "Lcom/stripe/android/paymentsheet/elements/SimpleTextElement;", "paymentsheet_debug"})
public abstract class SectionSingleFieldElement implements com.stripe.android.paymentsheet.elements.SectionFieldElement {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    
    private SectionSingleFieldElement(com.stripe.android.paymentsheet.elements.IdentifierSpec identifier) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier() {
        return null;
    }
    
    /**
     * Some fields in the section will have a single input controller.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.elements.InputController getController();
    
    /**
     * This will return a controller that abides by the SectionFieldErrorController interface.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.SectionFieldErrorController sectionFieldErrorController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
}