package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/networking/FraudDetectionData;", "timestampSupplier", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class FraudDetectionDataJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.networking.FraudDetectionData> {
    private final kotlin.jvm.functions.Function0<java.lang.Long> timestampSupplier = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.FraudDetectionDataJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_GUID = "guid";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_MUID = "muid";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SID = "sid";
    
    public FraudDetectionDataJsonParser(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Long> timestampSupplier) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.networking.FraudDetectionData parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/parsers/FraudDetectionDataJsonParser$Companion;", "", "()V", "FIELD_GUID", "", "FIELD_MUID", "FIELD_SID", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}