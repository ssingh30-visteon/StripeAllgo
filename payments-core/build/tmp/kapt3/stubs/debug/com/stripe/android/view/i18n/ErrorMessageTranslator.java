package com.stripe.android.view.i18n;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "translate", "", "httpCode", "", "errorMessage", "stripeError", "Lcom/stripe/android/StripeError;", "payments-core_debug"})
public abstract interface ErrorMessageTranslator {
    
    /**
     * See [Stripe API Errors](https://stripe.com/docs/api/errors) for a list of error
     * codes and associated messages.
     *
     * @param httpCode The HTTP code associated with the error response.
     * @param errorMessage A human-readable message providing more details about the error.
     * For card errors, these messages can be shown to your users.
     * @param stripeError The [StripeError] that represents detailed information about the
     * error. Specifically, [StripeError.code] is useful for understanding
     * the underlying error (e.g. "payment_method_unactivated").
     *
     * @return a non-null error message
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String translate(int httpCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.StripeError stripeError);
}