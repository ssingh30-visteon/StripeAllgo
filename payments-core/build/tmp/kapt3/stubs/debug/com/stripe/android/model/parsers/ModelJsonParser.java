package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\bJ\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ModelJsonParser;", "ModelType", "Lcom/stripe/android/model/StripeModel;", "", "parse", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeModel;", "Companion", "payments-core_debug"})
public abstract interface ModelJsonParser<ModelType extends com.stripe.android.model.StripeModel> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.parsers.ModelJsonParser.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract ModelType parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ModelJsonParser$Companion;", "", "()V", "jsonArrayToList", "", "", "jsonArray", "Lorg/json/JSONArray;", "jsonArrayToList$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> jsonArrayToList$payments_core_debug(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray jsonArray) {
            return null;
        }
    }
}