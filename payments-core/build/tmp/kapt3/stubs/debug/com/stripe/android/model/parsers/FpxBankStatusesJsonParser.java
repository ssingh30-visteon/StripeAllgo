package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/BankStatuses;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class FpxBankStatusesJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.BankStatuses> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.FpxBankStatusesJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PARSED_BANK_STATUS = "parsed_bank_status";
    
    public FpxBankStatusesJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.BankStatuses parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/parsers/FpxBankStatusesJsonParser$Companion;", "", "()V", "FIELD_PARSED_BANK_STATUS", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}