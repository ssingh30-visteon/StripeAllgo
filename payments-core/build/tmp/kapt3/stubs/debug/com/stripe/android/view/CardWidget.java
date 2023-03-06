package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b`\u0018\u0000 *2\u00020\u0001:\u0001*J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u001aH&J\u001c\u0010\"\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020$H&J\u0012\u0010&\u001a\u00020\u000f2\b\u0010\'\u001a\u0004\u0018\u00010\u001aH&J\u0012\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u001aH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006+"}, d2 = {"Lcom/stripe/android/view/CardWidget;", "", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "clear", "", "setCardHint", "cardHint", "", "setCardInputListener", "listener", "Lcom/stripe/android/view/CardInputListener;", "setCardNumber", "cardNumber", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setCardValidCallback", "callback", "Lcom/stripe/android/view/CardValidCallback;", "setCvcCode", "cvcCode", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setExpiryDate", "month", "", "year", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "Companion", "payments-core_debug"})
public abstract interface CardWidget {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.CardWidget.Companion Companion = null;
    public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
    public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
    public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;
    
    /**
     * A [CardParams] representing the card details and postal code if all fields are valid;
     * otherwise `null`
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.CardParams getCardParams();
    
    /**
     * A [PaymentMethodCreateParams.Card] representing the card details if all fields are valid;
     * otherwise `null`
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.PaymentMethodCreateParams.Card getPaymentMethodCard();
    
    /**
     * A [PaymentMethodCreateParams] representing the card details and postal code if all fields
     * are valid; otherwise `null`
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams();
    
    public abstract void setCardValidCallback(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardValidCallback callback);
    
    public abstract void setCardInputListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardInputListener listener);
    
    /**
     * Set a `TextWatcher` to receive card number changes.
     */
    public abstract void setCardNumberTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher cardNumberTextWatcher);
    
    /**
     * Set a `TextWatcher` to receive expiration date changes.
     */
    public abstract void setExpiryDateTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher expiryDateTextWatcher);
    
    /**
     * Set a `TextWatcher` to receive CVC value changes.
     */
    public abstract void setCvcNumberTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher cvcNumberTextWatcher);
    
    /**
     * Set a `TextWatcher` to receive postal code changes.
     */
    public abstract void setPostalCodeTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher postalCodeTextWatcher);
    
    public abstract void setCardHint(@org.jetbrains.annotations.NotNull()
    java.lang.String cardHint);
    
    public abstract void clear();
    
    public abstract void setCardNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String cardNumber);
    
    public abstract void setExpiryDate(@androidx.annotation.IntRange(from = 1L, to = 12L)
    int month, @androidx.annotation.IntRange(from = 0L, to = 9999L)
    int year);
    
    public abstract void setCvcCode(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcCode);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardWidget$Companion;", "", "()V", "DEFAULT_POSTAL_CODE_ENABLED", "", "DEFAULT_POSTAL_CODE_REQUIRED", "DEFAULT_US_ZIP_CODE_REQUIRED", "payments-core_debug"})
    public static final class Companion {
        public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
        public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
        public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;
        
        private Companion() {
            super();
        }
    }
}