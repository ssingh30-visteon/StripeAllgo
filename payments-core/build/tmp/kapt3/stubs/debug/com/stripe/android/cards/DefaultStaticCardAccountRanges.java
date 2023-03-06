package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "()V", "filter", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "first", "Companion", "payments-core_debug"})
public final class DefaultStaticCardAccountRanges implements com.stripe.android.cards.StaticCardAccountRanges {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.cards.DefaultStaticCardAccountRanges.Companion Companion = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> VISA_ACCOUNTS = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> MASTERCARD_ACCOUNTS = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> AMEX_ACCOUNTS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.stripe.android.model.AccountRange> DISCOVER_ACCOUNTS = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> JCB_ACCOUNTS = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> UNIONPAY_ACCOUNTS = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> DINERSCLUB16_ACCOUNT_RANGES = null;
    private static final java.util.List<com.stripe.android.model.AccountRange> DINERSCLUB14_ACCOUNT_RANGES = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.stripe.android.model.AccountRange> ACCOUNTS = null;
    
    public DefaultStaticCardAccountRanges() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.AccountRange first(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.stripe.android.model.AccountRange> filter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;", "", "()V", "ACCOUNTS", "", "Lcom/stripe/android/model/AccountRange;", "getACCOUNTS$payments_core_debug", "()Ljava/util/List;", "AMEX_ACCOUNTS", "DINERSCLUB14_ACCOUNT_RANGES", "DINERSCLUB16_ACCOUNT_RANGES", "DISCOVER_ACCOUNTS", "getDISCOVER_ACCOUNTS$payments_core_debug", "JCB_ACCOUNTS", "MASTERCARD_ACCOUNTS", "UNIONPAY_ACCOUNTS", "VISA_ACCOUNTS", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.AccountRange> getDISCOVER_ACCOUNTS$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.AccountRange> getACCOUNTS$payments_core_debug() {
            return null;
        }
    }
}