package com.stripe.android.model.parsers;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "ShippingJsonParser", "payments-core_debug"})
public final class PaymentIntentJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentIntent> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.PaymentIntentJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String OBJECT_TYPE = "payment_intent";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_OBJECT = "object";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_AMOUNT = "amount";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CANCELED_AT = "canceled_at";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CAPTURE_METHOD = "capture_method";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CLIENT_SECRET = "client_secret";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CONFIRMATION_METHOD = "confirmation_method";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CURRENCY = "currency";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DESCRIPTION = "description";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LAST_PAYMENT_ERROR = "last_payment_error";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_NEXT_ACTION = "next_action";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PAYMENT_METHOD = "payment_method";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_RECEIPT_EMAIL = "receipt_email";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SHIPPING = "shipping";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATUS = "status";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    
    public PaymentIntentJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentIntent parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ErrorJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentIntent.Error> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentIntentJsonParser.ErrorJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CHARGE = "charge";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CODE = "code";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DECLINE_CODE = "decline_code";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DOC_URL = "doc_url";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE = "message";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PARAM = "param";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAYMENT_METHOD = "payment_method";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_TYPE = "type";
        
        public ErrorJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentIntent.Error parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ShippingJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentIntent.Shipping> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentIntentJsonParser.ShippingJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CARRIER = "carrier";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PHONE = "phone";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_TRACKING_NUMBER = "tracking_number";
        
        public ShippingJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentIntent.Shipping parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_RECEIPT_EMAIL", "FIELD_SETUP_FUTURE_USAGE", "FIELD_SHIPPING", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "OBJECT_TYPE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}