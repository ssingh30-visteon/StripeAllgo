package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source;", "()V", "parse", "json", "Lorg/json/JSONObject;", "CodeVerificationJsonParser", "Companion", "KlarnaJsonParser", "OwnerJsonParser", "ReceiverJsonParser", "RedirectJsonParser", "payments-core_debug"})
public final class SourceJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.SourceJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String VALUE_SOURCE = "source";
    @java.lang.Deprecated()
    private static final java.lang.String VALUE_CARD = "card";
    @java.lang.Deprecated()
    private static final java.util.Set<java.lang.String> MODELED_TYPES = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_OBJECT = "object";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_AMOUNT = "amount";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CLIENT_SECRET = "client_secret";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CODE_VERIFICATION = "code_verification";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CURRENCY = "currency";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_FLOW = "flow";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_OWNER = "owner";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_RECEIVER = "receiver";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_REDIRECT = "redirect";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SOURCE_ORDER = "source_order";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATUS = "status";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TYPE = "type";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_USAGE = "usage";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_WECHAT = "wechat";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_KLARNA = "klarna";
    
    public SourceJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.Source parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Redirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class RedirectJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source.Redirect> {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.parsers.SourceJsonParser.RedirectJsonParser.Companion Companion = null;
        private static final java.lang.String FIELD_RETURN_URL = "return_url";
        private static final java.lang.String FIELD_STATUS = "status";
        private static final java.lang.String FIELD_URL = "url";
        
        public RedirectJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Source.Redirect parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser$Companion;", "", "()V", "FIELD_RETURN_URL", "", "FIELD_STATUS", "FIELD_URL", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$CodeVerification;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class CodeVerificationJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source.CodeVerification> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceJsonParser.CodeVerificationJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ATTEMPTS_REMAINING = "attempts_remaining";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_STATUS = "status";
        @java.lang.Deprecated()
        private static final int INVALID_ATTEMPTS_REMAINING = -1;
        
        public CodeVerificationJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Source.CodeVerification parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser$Companion;", "", "()V", "FIELD_ATTEMPTS_REMAINING", "", "FIELD_STATUS", "INVALID_ATTEMPTS_REMAINING", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Receiver;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ReceiverJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source.Receiver> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceJsonParser.ReceiverJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_AMOUNT_CHARGED = "amount_charged";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_AMOUNT_RECEIVED = "amount_received";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_AMOUNT_RETURNED = "amount_returned";
        
        public ReceiverJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Source.Receiver parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_AMOUNT_CHARGED", "FIELD_AMOUNT_RECEIVED", "FIELD_AMOUNT_RETURNED", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class OwnerJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source.Owner> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceJsonParser.OwnerJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_EMAIL = "email";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PHONE = "phone";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_VERIFIED_ADDRESS = "verified_address";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_VERIFIED_EMAIL = "verified_email";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_VERIFIED_NAME = "verified_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_VERIFIED_PHONE = "verified_phone";
        
        public OwnerJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Source.Owner parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Klarna;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseSet", "", "", "key", "Companion", "payments-core_debug"})
    public static final class KlarnaJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Source.Klarna> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceJsonParser.KlarnaJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FIRST_NAME = "first_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_LAST_NAME = "last_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PURCHASE_COUNTRY = "purchase_country";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CLIENT_TOKEN = "client_token";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE = "pay_later_asset_urls_descriptive";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_LATER_ASSET_URLS_STANDARD = "pay_later_asset_urls_standard";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_LATER_NAME = "pay_later_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_LATER_REDIRECT_URL = "pay_later_redirect_url";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE = "pay_now_asset_urls_descriptive";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_NOW_ASSET_URLS_STANDARD = "pay_now_asset_urls_standard";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_NOW_NAME = "pay_now_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_NOW_REDIRECT_URL = "pay_now_redirect_url";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE = "pay_over_time_asset_urls_descriptive";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD = "pay_over_time_asset_urls_standard";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_OVER_TIME_NAME = "pay_over_time_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAY_OVER_TIME_REDIRECT_URL = "pay_over_time_redirect_url";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
        
        public KlarnaJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Source.Klarna parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        private final java.util.Set<java.lang.String> parseSet(org.json.JSONObject json, java.lang.String key) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser$Companion;", "", "()V", "FIELD_CLIENT_TOKEN", "", "FIELD_CUSTOM_PAYMENT_METHODS", "FIELD_FIRST_NAME", "FIELD_LAST_NAME", "FIELD_PAYMENT_METHOD_CATEGORIES", "FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_LATER_ASSET_URLS_STANDARD", "FIELD_PAY_LATER_NAME", "FIELD_PAY_LATER_REDIRECT_URL", "FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_NOW_ASSET_URLS_STANDARD", "FIELD_PAY_NOW_NAME", "FIELD_PAY_NOW_REDIRECT_URL", "FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD", "FIELD_PAY_OVER_TIME_NAME", "FIELD_PAY_OVER_TIME_REDIRECT_URL", "FIELD_PURCHASE_COUNTRY", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\"\u001a\u0004\u0018\u0001H#\"\n\b\u0000\u0010#\u0018\u0001*\u00020$2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010%\u001a\u00020\u0004H\u0082\b\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CLIENT_SECRET", "FIELD_CODE_VERIFICATION", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_FLOW", "FIELD_ID", "FIELD_KLARNA", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_OWNER", "FIELD_RECEIVER", "FIELD_REDIRECT", "FIELD_SOURCE_ORDER", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_STATUS", "FIELD_TYPE", "FIELD_USAGE", "FIELD_WECHAT", "MODELED_TYPES", "", "VALUE_CARD", "VALUE_SOURCE", "asSourceType", "sourceType", "fromCardJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "fromSourceJson", "optStripeJsonModel", "T", "Lcom/stripe/android/model/StripeModel;", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/model/StripeModel;", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.stripe.android.model.Source fromCardJson(org.json.JSONObject jsonObject) {
            return null;
        }
        
        private final com.stripe.android.model.Source fromSourceJson(org.json.JSONObject jsonObject) {
            return null;
        }
        
        @com.stripe.android.model.Source.SourceType()
        private final java.lang.String asSourceType(java.lang.String sourceType) {
            return null;
        }
    }
}