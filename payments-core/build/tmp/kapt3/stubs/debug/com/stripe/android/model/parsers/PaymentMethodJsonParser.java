package com.stripe.android.model.parsers;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AuBecsDebitJsonParser", "BacsDebitJsonParser", "BillingDetails", "CardJsonParser", "Companion", "FpxJsonParser", "IdealJsonParser", "NetbankingJsonParser", "SepaDebitJsonParser", "SofortJsonParser", "UpiJsonParser", "payments-core_debug"})
public final class PaymentMethodJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_BILLING_DETAILS = "billing_details";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CREATED = "created";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CUSTOMER = "customer";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TYPE = "type";
    
    public PaymentMethodJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethod parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class BillingDetails implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.BillingDetails> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.BillingDetails.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_EMAIL = "email";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_PHONE = "phone";
        
        public BillingDetails() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.BillingDetails parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "ChecksJsonParser", "Companion", "NetworksJsonParser", "ThreeDSecureUsageJsonParser", "payments-core_debug"})
    public static final class CardJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Card> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.CardJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BRAND = "brand";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CHECKS = "checks";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_COUNTRY = "country";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_EXP_MONTH = "exp_month";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_EXP_YEAR = "exp_year";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FINGERPRINT = "fingerprint";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FUNDING = "funding";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_LAST4 = "last4";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_THREE_D_SECURE_USAGE = "three_d_secure_usage";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_WALLET = "wallet";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_NETWORKS = "networks";
        
        public CardJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Card parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
        public static final class ChecksJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Card.Checks> {
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.CardJsonParser.ChecksJsonParser.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_ADDRESS_POSTAL_CODE_CHECK = "address_postal_code_check";
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_CVC_CHECK = "cvc_check";
            
            public ChecksJsonParser() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethod.Card.Checks parse(@org.jetbrains.annotations.NotNull()
            org.json.JSONObject json) {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_LINE1_CHECK", "", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
        public static final class ThreeDSecureUsageJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage> {
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.CardJsonParser.ThreeDSecureUsageJsonParser.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_IS_SUPPORTED = "supported";
            
            public ThreeDSecureUsageJsonParser() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage parse(@org.jetbrains.annotations.NotNull()
            org.json.JSONObject json) {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser$Companion;", "", "()V", "FIELD_IS_SUPPORTED", "", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
        public static final class NetworksJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Card.Networks> {
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.CardJsonParser.NetworksJsonParser.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_AVAIABLE = "available";
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_SELECTION_MANDATORY = "selection_mandatory";
            @java.lang.Deprecated()
            private static final java.lang.String FIELD_PREFERRED = "preferred";
            
            public NetworksJsonParser() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethod.Card.Networks parse(@org.jetbrains.annotations.NotNull()
            org.json.JSONObject json) {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser$Companion;", "", "()V", "FIELD_AVAIABLE", "", "FIELD_PREFERRED", "FIELD_SELECTION_MANDATORY", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$Companion;", "", "()V", "FIELD_BRAND", "", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class IdealJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Ideal> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.IdealJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BANK = "bank";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BIC = "bic";
        
        public IdealJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Ideal parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "FIELD_BIC", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class FpxJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Fpx> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.FpxJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BANK = "bank";
        
        public FpxJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Fpx parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_BANK", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class NetbankingJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Netbanking> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.NetbankingJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BANK = "bank";
        
        public NetbankingJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Netbanking parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class SepaDebitJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.SepaDebit> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.SepaDebitJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BANK_CODE = "bank_code";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BRANCH_CODE = "branch_code";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_COUNTRY = "country";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FINGERPRINT = "fingerprint";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_LAST4 = "last4";
        
        public SepaDebitJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.SepaDebit parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser$Companion;", "", "()V", "FIELD_BANK_CODE", "", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class AuBecsDebitJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.AuBecsDebit> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.AuBecsDebitJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_BSB_NUMBER = "bsb_number";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FINGERPRINT = "fingerprint";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_LAST4 = "last4";
        
        public AuBecsDebitJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.AuBecsDebit parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser$Companion;", "", "()V", "FIELD_BSB_NUMBER", "", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class BacsDebitJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.BacsDebit> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.BacsDebitJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_FINGERPRINT = "fingerprint";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_LAST4 = "last4";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_SORT_CODE = "sort_code";
        
        public BacsDebitJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.BacsDebit parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser$Companion;", "", "()V", "FIELD_FINGERPRINT", "", "FIELD_LAST4", "FIELD_SORT_CODE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class SofortJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Sofort> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.SofortJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_COUNTRY = "country";
        
        public SofortJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Sofort parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser$Companion;", "", "()V", "FIELD_COUNTRY", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class UpiJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.PaymentMethod.Upi> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.PaymentMethodJsonParser.UpiJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_VPA = "vpa";
        
        public UpiJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PaymentMethod.Upi parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser$Companion;", "", "()V", "FIELD_VPA", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$Companion;", "", "()V", "FIELD_BILLING_DETAILS", "", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}