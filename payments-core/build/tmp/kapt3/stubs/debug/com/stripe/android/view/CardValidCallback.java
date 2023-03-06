package com.stripe.android.view;

import java.lang.System;

/**
 * An interface for a callback object that will be called when the user's input changes.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/CardValidCallback;", "", "onInputChanged", "", "isValid", "", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "Fields", "payments-core_debug"})
public abstract interface CardValidCallback {
    
    /**
     * @param isValid if the current input is valid
     * @param invalidFields if the current input is invalid, this [Set] will be populated with the
     * fields that are invalid, represented by [Fields]; if the current input is valid,
     * this [Set] will be empty
     */
    public abstract void onInputChanged(boolean isValid, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.view.CardValidCallback.Fields> invalidFields);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardValidCallback$Fields;", "", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "Postal", "payments-core_debug"})
    public static enum Fields {
        /*public static final*/ Number /* = new Number() */,
        /*public static final*/ Expiry /* = new Expiry() */,
        /*public static final*/ Cvc /* = new Cvc() */,
        /*public static final*/ Postal /* = new Postal() */;
        
        Fields() {
        }
    }
}