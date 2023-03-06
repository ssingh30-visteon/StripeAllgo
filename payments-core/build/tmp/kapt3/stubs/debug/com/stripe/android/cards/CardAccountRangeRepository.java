package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\fJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository;", "", "loading", "Lkotlinx/coroutines/flow/Flow;", "", "getLoading", "()Lkotlinx/coroutines/flow/Flow;", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "payments-core_debug"})
public abstract interface CardAccountRangeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAccountRange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.AccountRange> continuation);
    
    /**
     * Flow that represents whether any of the [CardAccountRangeSource] instances are loading.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> getLoading();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "", "create", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "payments-core_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.cards.CardAccountRangeRepository create();
    }
}