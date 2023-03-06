package com.stripe.android.paymentsheet.forms;

import java.lang.System;

/**
 * Transform a [LayoutSpec] data object into an Element, which
 * has a controller and identifier.  With only a single field in a section the section
 * controller will be a pass through the field controller.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0000\u00a2\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0014\u0010\u0007\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\f\u0010\u0007\u001a\u00020\u0013*\u00020\u0014H\u0002J\u0016\u0010\u0007\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0016\u0010\u0007\u001a\u00020\u0019*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002J\f\u0010\u0007\u001a\u00020\u001c*\u00020\u001dH\u0002J \u0010\u0007\u001a\u00020\u0015*\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010\u0007\u001a\u00020 *\u00020!2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010\u0007\u001a\u00020\"*\u00020#2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0014\u0010\u0007\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0018H\u0002J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\'0\b*\b\u0012\u0004\u0012\u00020(0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/TransformSpecToElement;", "", "resourceRepository", "Lcom/stripe/android/paymentsheet/elements/ResourceRepository;", "initialValues", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "(Lcom/stripe/android/paymentsheet/elements/ResourceRepository;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;)V", "transform", "", "Lcom/stripe/android/paymentsheet/elements/FormElement;", "list", "Lcom/stripe/android/paymentsheet/elements/FormItemSpec;", "transform$paymentsheet_debug", "transformAddress", "Lcom/stripe/android/paymentsheet/elements/AddressElement;", "Lcom/stripe/android/paymentsheet/elements/AfterpayClearpayHeaderElement;", "Lcom/stripe/android/paymentsheet/elements/AfterpayClearpayTextSpec;", "amount", "Lcom/stripe/android/paymentsheet/model/Amount;", "Lcom/stripe/android/paymentsheet/elements/SimpleDropdownElement;", "Lcom/stripe/android/paymentsheet/elements/BankDropdownSpec;", "Lcom/stripe/android/paymentsheet/elements/CountryElement;", "Lcom/stripe/android/paymentsheet/elements/CountrySpec;", "country", "", "Lcom/stripe/android/paymentsheet/elements/EmailElement;", "Lcom/stripe/android/paymentsheet/elements/EmailSpec;", "email", "Lcom/stripe/android/paymentsheet/elements/IbanElement;", "Lcom/stripe/android/paymentsheet/elements/IbanSpec;", "Lcom/stripe/android/paymentsheet/elements/KlarnaCountrySpec;", "currencyCode", "Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseElement;", "Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseSpec;", "Lcom/stripe/android/paymentsheet/elements/SectionElement;", "Lcom/stripe/android/paymentsheet/elements/SectionSpec;", "Lcom/stripe/android/paymentsheet/elements/StaticTextElement;", "Lcom/stripe/android/paymentsheet/elements/StaticTextSpec;", "merchantName", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldSpec;", "paymentsheet_debug"})
public final class TransformSpecToElement {
    private final com.stripe.android.paymentsheet.elements.ResourceRepository resourceRepository = null;
    private final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues = null;
    
    @javax.inject.Inject()
    public TransformSpecToElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.ResourceRepository resourceRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.FormElement> transform$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.FormItemSpec> list) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.SectionElement transform(com.stripe.android.paymentsheet.elements.SectionSpec $this$transform, com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues) {
        return null;
    }
    
    /**
     * This function will transform a list of specs into a list of elements
     */
    private final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> transform(java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldSpec> $this$transform, com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.AddressElement transformAddress(com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.StaticTextElement transform(com.stripe.android.paymentsheet.elements.StaticTextSpec $this$transform, java.lang.String merchantName) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.EmailElement transform(com.stripe.android.paymentsheet.elements.EmailSpec $this$transform, java.lang.String email) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.IbanElement transform(com.stripe.android.paymentsheet.elements.IbanSpec $this$transform) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.CountryElement transform(com.stripe.android.paymentsheet.elements.CountrySpec $this$transform, java.lang.String country) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.CountryElement transform(com.stripe.android.paymentsheet.elements.KlarnaCountrySpec $this$transform, java.lang.String currencyCode, java.lang.String country) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.SimpleDropdownElement transform(com.stripe.android.paymentsheet.elements.BankDropdownSpec $this$transform) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.SaveForFutureUseElement transform(com.stripe.android.paymentsheet.elements.SaveForFutureUseSpec $this$transform, com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments initialValues) {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.elements.AfterpayClearpayHeaderElement transform(com.stripe.android.paymentsheet.elements.AfterpayClearpayTextSpec $this$transform, com.stripe.android.paymentsheet.model.Amount amount) {
        return null;
    }
}