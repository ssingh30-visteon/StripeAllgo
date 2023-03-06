package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "contains", "", "bin", "Lcom/stripe/android/cards/Bin;", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPrefKey", "", "createPrefKey$payments_core_debug", "get", "", "Lcom/stripe/android/model/AccountRange;", "save", "", "accountRanges", "Companion", "payments-core_debug"})
public final class DefaultCardAccountRangeStore implements com.stripe.android.cards.CardAccountRangeStore {
    private final android.content.Context context = null;
    private final com.stripe.android.model.parsers.AccountRangeJsonParser accountRangeJsonParser = null;
    private final kotlin.Lazy prefs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.cards.DefaultCardAccountRangeStore.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PREF_FILE = "InMemoryCardAccountRangeSource.Store";
    @java.lang.Deprecated()
    private static final java.lang.String PREF_KEY_ACCOUNT_RANGES = "key_account_ranges";
    
    public DefaultCardAccountRangeStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object get(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.AccountRange>> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.AccountRange> accountRanges) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object contains(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.String createPrefKey$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore$Companion;", "", "()V", "PREF_FILE", "", "PREF_KEY_ACCOUNT_RANGES", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}