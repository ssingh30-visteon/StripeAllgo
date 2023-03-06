package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeStore;", "", "contains", "", "bin", "Lcom/stripe/android/cards/Bin;", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "", "Lcom/stripe/android/model/AccountRange;", "save", "", "accountRanges", "payments-core_debug"})
public abstract interface CardAccountRangeStore {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.AccountRange>> continuation);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.AccountRange> accountRanges);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object contains(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}