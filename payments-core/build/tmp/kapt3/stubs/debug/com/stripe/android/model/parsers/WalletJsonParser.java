package com.stripe.android.model.parsers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/wallets/Wallet;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseMasterpassWallet", "Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "parseVisaCheckoutWallet", "Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "dynamicLast4", "", "Companion", "payments-core_debug"})
public final class WalletJsonParser implements com.stripe.android.model.parsers.ModelJsonParser<com.stripe.android.model.wallets.Wallet> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.parsers.WalletJsonParser.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_TYPE = "type";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_BILLING_ADDRESS = "billing_address";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_EMAIL = "email";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_NAME = "name";
    @java.lang.Deprecated()
    private static final java.lang.String FIELD_SHIPPING_ADDRESS = "shipping_address";
    
    public WalletJsonParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.wallets.Wallet parse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject json) {
        return null;
    }
    
    private final com.stripe.android.model.wallets.Wallet.MasterpassWallet parseMasterpassWallet(org.json.JSONObject json) {
        return null;
    }
    
    private final com.stripe.android.model.wallets.Wallet.VisaCheckoutWallet parseVisaCheckoutWallet(org.json.JSONObject json, java.lang.String dynamicLast4) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/WalletJsonParser$Companion;", "", "()V", "FIELD_BILLING_ADDRESS", "", "FIELD_DYNAMIC_LAST4", "FIELD_EMAIL", "FIELD_NAME", "FIELD_SHIPPING_ADDRESS", "FIELD_TYPE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}