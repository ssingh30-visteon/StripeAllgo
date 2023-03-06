package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder;", "()V", "itemJsonParser", "Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ItemJsonParser", "ShippingJsonParser", "payments-core_debug"})
public final class SourceOrderJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.SourceOrder> {
    private final com.stripe.android.model.parsers.SourceOrderJsonParser.ItemJsonParser itemJsonParser = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.SourceOrderJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_AMOUNT = "amount";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_CURRENCY = "currency";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_EMAIL = "email";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_ITEMS = "items";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SHIPPING = "shipping";
    
    public SourceOrderJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.SourceOrder parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Item;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ItemJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.SourceOrder.Item> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceOrderJsonParser.ItemJsonParser.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_TYPE = "type";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_AMOUNT = "amount";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_CURRENCY = "currency";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_DESCRIPTION = "description";
        @java.lang.Deprecated()
        private static final java.lang.String FIELD_QUANTITY = "quantity";
        
        public ItemJsonParser() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.stripe.android.model.SourceOrder.Item parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_QUANTITY", "FIELD_TYPE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Shipping;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
    public static final class ShippingJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.SourceOrder.Shipping> {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.parsers.SourceOrderJsonParser.ShippingJsonParser.Companion Companion = null;
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
        public com.stripe.android.model.SourceOrder.Shipping parse(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CURRENCY", "FIELD_EMAIL", "FIELD_ITEMS", "FIELD_SHIPPING", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}