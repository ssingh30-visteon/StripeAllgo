package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ \u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0 0\u001a0\u0019H\u0017J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/AddressElement;", "Lcom/stripe/android/paymentsheet/elements/SectionMultiFieldElement;", "_identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "addressFieldRepository", "Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;", "args", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "countryCodes", "", "", "countryDropdownFieldController", "Lcom/stripe/android/paymentsheet/elements/DropdownFieldController;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;Ljava/util/Set;Lcom/stripe/android/paymentsheet/elements/DropdownFieldController;)V", "controller", "Lcom/stripe/android/paymentsheet/elements/AddressController;", "getController", "()Lcom/stripe/android/paymentsheet/elements/AddressController;", "countryElement", "Lcom/stripe/android/paymentsheet/elements/CountryElement;", "getCountryElement$annotations", "()V", "getCountryElement", "()Lcom/stripe/android/paymentsheet/elements/CountryElement;", "fields", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "getFields", "()Lkotlinx/coroutines/flow/Flow;", "otherFields", "getFormFieldValueFlow", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "sectionFieldErrorController", "Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "setRawValue", "", "formFragmentArguments", "paymentsheet_debug"})
public final class AddressElement extends com.stripe.android.paymentsheet.elements.SectionMultiFieldElement {
    private final com.stripe.android.paymentsheet.address.AddressFieldElementRepository addressFieldRepository = null;
    private com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments args;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.CountryElement countryElement = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> otherFields = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> fields = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.AddressController controller = null;
    
    public AddressElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec _identifier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.address.AddressFieldElementRepository addressFieldRepository, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments args, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> countryCodes, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.DropdownFieldController countryDropdownFieldController) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.CountryElement getCountryElement() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCountryElement$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.AddressController getController() {
        return null;
    }
    
    /**
     * This will return a controller that abides by the SectionFieldErrorController interface.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.SectionFieldErrorController sectionFieldErrorController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
    
    @java.lang.Override()
    public void setRawValue(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments formFragmentArguments) {
    }
}