package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/AccountRange;", "()V", "parse", "json", "Lorg/json/JSONObject;", "serialize", "accountRange", "Companion", "payments-core_debug"})
public final class AccountRangeJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.AccountRange> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.AccountRangeJsonParser.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String FIELD_ACCOUNT_RANGE_HIGH = "account_range_high";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String FIELD_ACCOUNT_RANGE_LOW = "account_range_low";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String FIELD_PAN_LENGTH = "pan_length";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String FIELD_BRAND = "brand";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String FIELD_COUNTRY = "country";
    
    public AccountRangeJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.AccountRange parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject serialize(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountRange accountRange) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_RANGE_HIGH", "", "FIELD_ACCOUNT_RANGE_LOW", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_PAN_LENGTH", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}