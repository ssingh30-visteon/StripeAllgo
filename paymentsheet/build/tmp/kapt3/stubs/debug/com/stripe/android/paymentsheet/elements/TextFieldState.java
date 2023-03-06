package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This represents the different states a field can be in,
 * in each of these cases there might be a reason to show the
 * error in a different way.  This interface separates how the state
 * is implemented from what information is required by clients of the interface.
 * This will allow the implementation to change without impacting the clients.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "", "getError", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "isBlank", "", "isFull", "isValid", "shouldShowError", "hasFocus", "paymentsheet_debug"})
public abstract interface TextFieldState {
    
    /**
     * Indicate if this is an error that should be displayed to the user.
     * This cannot be used to determine if the field is valid or not because
     * there are some cases such as incomplete or blank where the error is not
     * displayed, but also not valid.
     */
    public abstract boolean shouldShowError(boolean hasFocus);
    
    /**
     * Indicates an field is valid and field extraction can happen
     * and be used to create PaymentMethod Parameters
     */
    public abstract boolean isValid();
    
    /**
     * If in a state where isValid() returns false, this function returns the error message.
     * It is up to calling shouldShowError to determine if it should be displayed on screen.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.paymentsheet.elements.FieldError getError();
    
    /**
     * This is used to indicate the field contains the maximum number of characters.
     * This is needed to know when to advance to the next field.
     */
    public abstract boolean isFull();
    
    /**
     * This is used to indicate the field is blank which can be helpful when ignoring optional
     * fields.
     */
    public abstract boolean isBlank();
}