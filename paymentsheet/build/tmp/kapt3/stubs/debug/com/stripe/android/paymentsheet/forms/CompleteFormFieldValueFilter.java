package com.stripe.android.paymentsheet.forms;

import java.lang.System;

/**
 * This class will take a list of form elements and hidden identifiers.
 * [filterFlow] is the only public method and it will transform
 * the list of form elements into a [FormFieldValues].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0003J<\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;", "", "currentFieldValueMap", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "hiddenIdentifiers", "", "showingMandate", "", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)V", "getShowingMandate", "()Lkotlinx/coroutines/flow/Flow;", "filterFlow", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "idFieldSnapshotMap", "paymentsheet_debug"})
public final class CompleteFormFieldValueFilter {
    private final kotlinx.coroutines.flow.Flow<java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>> currentFieldValueMap = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> hiddenIdentifiers = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> showingMandate = null;
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave> userRequestedReuse = null;
    
    public CompleteFormFieldValueFilter(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>> currentFieldValueMap, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.stripe.android.paymentsheet.elements.IdentifierSpec>> hiddenIdentifiers, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.Boolean> showingMandate, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave> userRequestedReuse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getShowingMandate() {
        return null;
    }
    
    /**
     * This will return null if any form field values are incomplete, otherwise it is an object
     * representing all the complete, non-hidden fields.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldValues> filterFlow() {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.forms.FormFieldValues filterFlow(java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry> idFieldSnapshotMap, java.util.List<? extends com.stripe.android.paymentsheet.elements.IdentifierSpec> hiddenIdentifiers, boolean showingMandate, com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave userRequestedReuse) {
        return null;
    }
}