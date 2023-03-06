package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * Any element in a section must have a controller that provides
 * an error and have a type.  This is used for a single field in a section
 * or a section field that has other fields in it.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionFieldErrorController;", "Lcom/stripe/android/paymentsheet/elements/Controller;", "error", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/elements/AddressController;", "Lcom/stripe/android/paymentsheet/elements/DropdownFieldController;", "Lcom/stripe/android/paymentsheet/elements/InputController;", "Lcom/stripe/android/paymentsheet/elements/RowController;", "Lcom/stripe/android/paymentsheet/elements/TextFieldController;", "paymentsheet_debug"})
public abstract interface SectionFieldErrorController extends com.stripe.android.paymentsheet.elements.Controller {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.elements.FieldError> getError();
}