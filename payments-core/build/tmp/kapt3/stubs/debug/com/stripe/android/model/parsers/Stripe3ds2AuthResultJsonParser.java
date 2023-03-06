package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AresJsonParser", "Companion", "MessageExtensionJsonParser", "ThreeDS2ErrorJsonParser", "payments-core_debug"})
public final class Stripe3ds2AuthResultJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Stripe3ds2AuthResult> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ARES = "ares";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREQ = "creq";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ERROR = "error";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_FALLBACK_REDIRECT_URL = "fallback_redirect_url";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SOURCE = "source";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATE = "state";
    
    public Stripe3ds2AuthResultJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.Stripe3ds2AuthResult parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class AresJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Stripe3ds2AuthResult.Ares> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser.AresJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACS_SIGNED_CONTENT = "acsSignedContent";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACS_TRANS_ID = "acsTransID";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACS_URL = "acsURL";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_AUTHENTICATION_TYPE = "authenticationType";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CARDHOLDER_INFO = "cardholderInfo";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE_EXTENSION = "messageExtension";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE_TYPE = "messageType";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE_VERSION = "messageVersion";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_SDK_TRANS_ID = "sdkTransID";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_TRANS_STATUS = "transStatus";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        
        public AresJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Stripe3ds2AuthResult.Ares parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser$Companion;", "", "()V", "FIELD_ACS_CHALLENGE_MANDATED", "", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "FIELD_TRANS_STATUS", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "()V", "parse", "", "jsonArray", "Lorg/json/JSONArray;", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class MessageExtensionJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser.MessageExtensionJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ID = "id";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DATA = "data";
        
        public MessageExtensionJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONArray jsonArray) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser$Companion;", "", "()V", "FIELD_CRITICALITY_INDICATOR", "", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ThreeDS2ErrorJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser.ThreeDS2ErrorJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACS_TRANS_ID = "acsTransID";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DS_TRANS_ID = "dsTransID";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ERROR_CODE = "errorCode";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ERROR_COMPONENT = "errorComponent";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ERROR_DESCRIPTION = "errorDescription";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ERROR_DETAIL = "errorDetail";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE_TYPE = "messageType";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_MESSAGE_VERSION = "messageVersion";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_SDK_TRANS_ID = "sdkTransID";
        
        public ThreeDS2ErrorJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser$Companion;", "", "()V", "FIELD_ACS_TRANS_ID", "", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$Companion;", "", "()V", "FIELD_ARES", "", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}