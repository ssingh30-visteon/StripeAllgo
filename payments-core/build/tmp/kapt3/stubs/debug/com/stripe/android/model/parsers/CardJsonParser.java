package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class CardJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Card> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.parsers.CardJsonParser.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VALUE_CARD = "card";
    private static final java.lang.String FIELD_OBJECT = "object";
    private static final java.lang.String FIELD_ADDRESS_CITY = "address_city";
    private static final java.lang.String FIELD_ADDRESS_COUNTRY = "address_country";
    private static final java.lang.String FIELD_ADDRESS_LINE1 = "address_line1";
    private static final java.lang.String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final java.lang.String FIELD_ADDRESS_LINE2 = "address_line2";
    private static final java.lang.String FIELD_ADDRESS_STATE = "address_state";
    private static final java.lang.String FIELD_ADDRESS_ZIP = "address_zip";
    private static final java.lang.String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final java.lang.String FIELD_BRAND = "brand";
    private static final java.lang.String FIELD_COUNTRY = "country";
    private static final java.lang.String FIELD_CURRENCY = "currency";
    private static final java.lang.String FIELD_CUSTOMER = "customer";
    private static final java.lang.String FIELD_CVC_CHECK = "cvc_check";
    private static final java.lang.String FIELD_EXP_MONTH = "exp_month";
    private static final java.lang.String FIELD_EXP_YEAR = "exp_year";
    private static final java.lang.String FIELD_FINGERPRINT = "fingerprint";
    private static final java.lang.String FIELD_FUNDING = "funding";
    private static final java.lang.String FIELD_NAME = "name";
    private static final java.lang.String FIELD_LAST4 = "last4";
    private static final java.lang.String FIELD_ID = "id";
    private static final java.lang.String FIELD_TOKENIZATION_METHOD = "tokenization_method";
    
    public CardJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.Card parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_CITY", "", "FIELD_ADDRESS_COUNTRY", "FIELD_ADDRESS_LINE1", "FIELD_ADDRESS_LINE1_CHECK", "FIELD_ADDRESS_LINE2", "FIELD_ADDRESS_STATE", "FIELD_ADDRESS_ZIP", "FIELD_ADDRESS_ZIP_CHECK", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_CUSTOMER", "FIELD_CVC_CHECK", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_ID", "FIELD_LAST4", "FIELD_NAME", "FIELD_OBJECT", "FIELD_TOKENIZATION_METHOD", "VALUE_CARD", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}