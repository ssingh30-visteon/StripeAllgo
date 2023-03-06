package com.stripe.android.model.parsers;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "payments-core_debug"})
public final class SetupIntentJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.SetupIntent> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.SetupIntentJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String VALUE_SETUP_INTENT = "setup_intent";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_OBJECT = "object";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CLIENT_SECRET = "client_secret";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DESCRIPTION = "description";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LAST_SETUP_ERROR = "last_setup_error";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_NEXT_ACTION = "next_action";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATUS = "status";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_USAGE = "usage";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PAYMENT_METHOD = "payment_method";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    
    public SetupIntentJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.SetupIntent parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ErrorJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.SetupIntent.Error> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SetupIntentJsonParser.ErrorJsonParser.Companion Companion = null;
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
        public com.stripe.android.model.SetupIntent.Error parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CODE", "", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$Companion;", "", "()V", "FIELD_CANCELLATION_REASON", "", "FIELD_CLIENT_SECRET", "FIELD_CREATED", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_SETUP_ERROR", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_USAGE", "VALUE_SETUP_INTENT", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}