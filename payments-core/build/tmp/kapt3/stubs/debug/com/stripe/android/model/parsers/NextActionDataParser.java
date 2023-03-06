package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AlipayRedirectParser", "BlikAuthorizeParser", "Companion", "DisplayOxxoDetailsJsonParser", "RedirectToUrlParser", "SdkDataJsonParser", "WeChatPayRedirectParser", "payments-core_debug"})
public final class NextActionDataParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.NextActionDataParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_NEXT_ACTION_TYPE = "type";
    
    public NextActionDataParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.StripeIntent.NextActionData parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    static final class DisplayOxxoDetailsJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.NextActionDataParser.DisplayOxxoDetailsJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_EXPIRES_AFTER = "expires_after";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NUMBER = "number";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_HOSTED_VOUCHER_URL = "hosted_voucher_url";
        
        public DisplayOxxoDetailsJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser$Companion;", "", "()V", "FIELD_EXPIRES_AFTER", "", "FIELD_HOSTED_VOUCHER_URL", "FIELD_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class RedirectToUrlParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.NextActionDataParser.RedirectToUrlParser.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static final java.lang.String FIELD_URL = "url";
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static final java.lang.String FIELD_RETURN_URL = "return_url";
        
        public RedirectToUrlParser() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser$Companion;", "", "()V", "FIELD_RETURN_URL", "", "FIELD_URL", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class AlipayRedirectParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.NextActionDataParser.AlipayRedirectParser.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static final java.lang.String FIELD_NATIVE_DATA = "native_data";
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static final java.lang.String FIELD_RETURN_URL = "return_url";
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static final java.lang.String FIELD_URL = "url";
        
        public AlipayRedirectParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser$Companion;", "", "()V", "FIELD_NATIVE_DATA", "", "FIELD_RETURN_URL", "FIELD_URL", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseDirectoryServerEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Companion", "payments-core_debug"})
    static final class SdkDataJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.SdkData> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.NextActionDataParser.SdkDataJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_TYPE = "type";
        @java.lang.Deprecated()
        private static final java.lang.String TYPE_3DS2 = "stripe_3ds2_fingerprint";
        @java.lang.Deprecated()
        private static final java.lang.String TYPE_3DS1 = "three_d_secure_redirect";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_THREE_D_SECURE_2_SOURCE = "three_d_secure_2_source";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DIRECTORY_SERVER_NAME = "directory_server_name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_SERVER_TRANSACTION_ID = "server_transaction_id";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DIRECTORY_SERVER_ENCRYPTION = "directory_server_encryption";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DIRECTORY_SERVER_ID = "directory_server_id";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CERTIFICATE = "certificate";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_KEY_ID = "key_id";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ROOT_CAS = "root_certificate_authorities";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_STRIPE_JS = "stripe_js";
        
        public SdkDataJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.SdkData parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        private final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption parseDirectoryServerEncryption(org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser$Companion;", "", "()V", "FIELD_CERTIFICATE", "", "FIELD_DIRECTORY_SERVER_ENCRYPTION", "FIELD_DIRECTORY_SERVER_ID", "FIELD_DIRECTORY_SERVER_NAME", "FIELD_KEY_ID", "FIELD_ROOT_CAS", "FIELD_SERVER_TRANSACTION_ID", "FIELD_STRIPE_JS", "FIELD_THREE_D_SECURE_2_SOURCE", "FIELD_TYPE", "TYPE_3DS1", "TYPE_3DS2", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class BlikAuthorizeParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize> {
        
        public BlikAuthorizeParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class WeChatPayRedirectParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.NextActionDataParser.WeChatPayRedirectParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String APP_ID = "app_id";
        @java.lang.Deprecated()
        private static final java.lang.String NONCE_STR = "nonce_str";
        @java.lang.Deprecated()
        private static final java.lang.String PACKAGE = "package";
        @java.lang.Deprecated()
        private static final java.lang.String PARTNER_ID = "partner_id";
        @java.lang.Deprecated()
        private static final java.lang.String PREPAY_ID = "prepay_id";
        @java.lang.Deprecated()
        private static final java.lang.String TIMESTAMP = "timestamp";
        @java.lang.Deprecated()
        private static final java.lang.String SIGN = "sign";
        
        public WeChatPayRedirectParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser$Companion;", "", "()V", "APP_ID", "", "NONCE_STR", "PACKAGE", "PARTNER_ID", "PREPAY_ID", "SIGN", "TIMESTAMP", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;", "", "()V", "FIELD_NEXT_ACTION_TYPE", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}