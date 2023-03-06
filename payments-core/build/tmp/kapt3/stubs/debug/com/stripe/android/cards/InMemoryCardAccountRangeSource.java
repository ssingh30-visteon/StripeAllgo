package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/cards/InMemoryCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "(Lcom/stripe/android/cards/CardAccountRangeStore;)V", "loading", "Lkotlinx/coroutines/flow/Flow;", "", "getLoading", "()Lkotlinx/coroutines/flow/Flow;", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public final class InMemoryCardAccountRangeSource implements com.stripe.android.cards.CardAccountRangeSource {
    private final com.stripe.android.cards.CardAccountRangeStore store = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> loading = null;
    
    public InMemoryCardAccountRangeSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeStore store) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAccountRange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.AccountRange> continuation) {
        return null;
    }
}