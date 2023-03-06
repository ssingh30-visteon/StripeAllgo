package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000f*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000fB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\fR\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodPreferenceJsonParser;", "StripeIntentType", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "()V", "stripeIntentFieldName", "", "getStripeIntentFieldName", "()Ljava/lang/String;", "parse", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent;", "parseStripeIntent", "stripeIntentJson", "Companion", "Lcom/stripe/android/model/parsers/PaymentMethodPreferenceForPaymentIntentJsonParser;", "Lcom/stripe/android/model/parsers/PaymentMethodPreferenceForSetupIntentJsonParser;", "payments-core_debug"})
public abstract class PaymentMethodPreferenceJsonParser<StripeIntentType extends com.stripe.android.model.StripeIntent> implements com.stripe.android.model.parsers.ModelJsonParser<StripeIntentType> {
    @org.jetbrains.annotations.NotNull()
    protected static final com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser.Companion Companion = null;
    private static final java.lang.String OBJECT_TYPE = "payment_method_preference";
    private static final java.lang.String FIELD_OBJECT = "object";
    private static final java.lang.String FIELD_ORDERED_PAYMENT_METHOD_TYPES = "ordered_payment_method_types";
    private static final java.lang.String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final java.lang.String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    
    private PaymentMethodPreferenceJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStripeIntentFieldName();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public StripeIntentType parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract StripeIntentType parseStripeIntent(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject stripeIntentJson);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodPreferenceJsonParser$Companion;", "", "()V", "FIELD_OBJECT", "", "FIELD_ORDERED_PAYMENT_METHOD_TYPES", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "OBJECT_TYPE", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}