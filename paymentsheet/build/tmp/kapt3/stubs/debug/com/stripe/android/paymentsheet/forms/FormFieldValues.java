package com.stripe.android.paymentsheet.forms;

import java.lang.System;

/**
 * The identifier here comes from the form element (section, static text, etc)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "fieldValuePairs", "", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "showsMandate", "", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Ljava/util/Map;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getFieldValuePairs", "()Ljava/util/Map;", "getShowsMandate", "()Z", "getUserRequestedReuse", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentsheet_debug"})
public final class FormFieldValues {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry> fieldValuePairs = null;
    private final boolean showsMandate = false;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave userRequestedReuse = null;
    
    public FormFieldValues(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry> fieldValuePairs, boolean showsMandate, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry> getFieldValuePairs() {
        return null;
    }
    
    public final boolean getShowsMandate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave getUserRequestedReuse() {
        return null;
    }
}