package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/WeChat;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class WeChatJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.WeChat> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.WeChatJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_APPID = "android_appId";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_NONCE = "android_nonceStr";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PACKAGE = "android_package";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PARTNERID = "android_partnerId";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_PREPAYID = "android_prepayId";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SIGN = "android_sign";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TIMESTAMP = "android_timeStamp";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_QR_CODE_URL = "qr_code_url";
    
    public WeChatJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.WeChat parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser$Companion;", "", "()V", "FIELD_APPID", "", "FIELD_NONCE", "FIELD_PACKAGE", "FIELD_PARTNERID", "FIELD_PREPAYID", "FIELD_QR_CODE_URL", "FIELD_SIGN", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_TIMESTAMP", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}