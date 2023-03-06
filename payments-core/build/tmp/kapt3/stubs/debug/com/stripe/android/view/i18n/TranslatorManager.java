package com.stripe.android.view.i18n;

import java.lang.System;

/**
 * A class that provides a [ErrorMessageTranslator] for translating server-provided error
 * messages, as defined in [Stripe API Errors Reference](https://stripe.com/docs/api/errors).
 *
 * See [com.stripe.android.view.PaymentMethodsActivity] for example usage.
 *
 * To use a custom [ErrorMessageTranslator] in your app, override [Application.onCreate] in
 * your app's Application subclass and call [setErrorMessageTranslator].
 *
 * <pre>
 * public class MyApp extends Application {
 *  public void onCreate() {
 *    super.onCreate();
 *    TranslatorManager.setErrorMessageTranslator(new MyErrorMessageTranslator());
 *  }
 * }
 * </pre>
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager;", "", "()V", "DEFAULT_ERROR_MESSAGE_TRANSLATOR", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "getErrorMessageTranslator", "setErrorMessageTranslator", "", "Default", "payments-core_debug"})
public final class TranslatorManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.i18n.TranslatorManager INSTANCE = null;
    private static final com.stripe.android.view.i18n.TranslatorManager.Default DEFAULT_ERROR_MESSAGE_TRANSLATOR = null;
    private static com.stripe.android.view.i18n.ErrorMessageTranslator errorMessageTranslator;
    
    private TranslatorManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.i18n.ErrorMessageTranslator getErrorMessageTranslator() {
        return null;
    }
    
    public final void setErrorMessageTranslator(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.i18n.ErrorMessageTranslator errorMessageTranslator) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "()V", "translate", "", "httpCode", "", "errorMessage", "stripeError", "Lcom/stripe/android/StripeError;", "payments-core_debug"})
    static final class Default implements com.stripe.android.view.i18n.ErrorMessageTranslator {
        
        public Default() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String translate(int httpCode, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.StripeError stripeError) {
            return null;
        }
    }
}