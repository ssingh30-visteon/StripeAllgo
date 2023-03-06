package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This represents a field in a section.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0007\b\t\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionFieldSpec;", "", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;)V", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "Lcom/stripe/android/paymentsheet/elements/AddressSpec;", "Lcom/stripe/android/paymentsheet/elements/BankDropdownSpec;", "Lcom/stripe/android/paymentsheet/elements/CountrySpec;", "Lcom/stripe/android/paymentsheet/elements/EmailSpec;", "Lcom/stripe/android/paymentsheet/elements/IbanSpec;", "Lcom/stripe/android/paymentsheet/elements/KlarnaCountrySpec;", "Lcom/stripe/android/paymentsheet/elements/SimpleTextSpec;", "paymentsheet_debug"})
public abstract class SectionFieldSpec {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    
    private SectionFieldSpec(com.stripe.android.paymentsheet.elements.IdentifierSpec identifier) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier() {
        return null;
    }
}