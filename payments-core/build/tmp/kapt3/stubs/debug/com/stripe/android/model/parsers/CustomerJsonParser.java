package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Customer;", "()V", "customerSourceJsonParser", "Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class CustomerJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.Customer> {
    private final com.stripe.android.model.parsers.CustomerPaymentSourceJsonParser customerSourceJsonParser = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.CustomerJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ID = "id";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_OBJECT = "object";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DESCRIPTION = "description";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DEFAULT_SOURCE = "default_source";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_EMAIL = "email";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_LIVEMODE = "livemode";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SHIPPING = "shipping";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SOURCES = "sources";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DATA = "data";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_HAS_MORE = "has_more";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TOTAL_COUNT = "total_count";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_URL = "url";
    @java.lang.Deprecated()
    private static final java.lang.String VALUE_LIST = "list";
    @java.lang.Deprecated()
    private static final java.lang.String VALUE_CUSTOMER = "customer";
    
    public CustomerJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.Customer parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser$Companion;", "", "()V", "FIELD_DATA", "", "FIELD_DEFAULT_SOURCE", "FIELD_DESCRIPTION", "FIELD_EMAIL", "FIELD_HAS_MORE", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SHIPPING", "FIELD_SOURCES", "FIELD_TOTAL_COUNT", "FIELD_URL", "VALUE_CUSTOMER", "VALUE_LIST", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}