package com.stripe.android.view;

import java.lang.System;

/**
 * Represents a listener for card input events. Note that events are
 * not one-time events. For instance, a user can "complete" the CVC many times
 * by deleting and re-entering the value.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/CardInputListener;", "", "onCardComplete", "", "onCvcComplete", "onExpirationComplete", "onFocusChange", "focusField", "Lcom/stripe/android/view/CardInputListener$FocusField;", "FocusField", "payments-core_debug"})
public abstract interface CardInputListener {
    
    /**
     * Called whenever the field of focus within the widget changes.
     *
     * @param focusField a [FocusField] to which the focus has just changed.
     */
    public abstract void onFocusChange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CardInputListener.FocusField focusField);
    
    /**
     * Called when a potentially valid card number has been completed in the
     * [CardNumberEditText]. May be called multiple times if the user edits
     * the field.
     */
    public abstract void onCardComplete();
    
    /**
     * Called when a expiration date (one that has not yet passed) has been entered.
     * May be called multiple times, if the user edits the date.
     */
    public abstract void onExpirationComplete();
    
    /**
     * Called when a potentially valid CVC has been entered. The only verification performed
     * on the number is that it is the correct length. May be called multiple times, if
     * the user edits the CVC.
     */
    public abstract void onCvcComplete();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardInputListener$FocusField;", "", "(Ljava/lang/String;I)V", "CardNumber", "ExpiryDate", "Cvc", "PostalCode", "payments-core_debug"})
    public static enum FocusField {
        /*public static final*/ CardNumber /* = new CardNumber() */,
        /*public static final*/ ExpiryDate /* = new ExpiryDate() */,
        /*public static final*/ Cvc /* = new Cvc() */,
        /*public static final*/ PostalCode /* = new PostalCode() */;
        
        FocusField() {
        }
    }
}