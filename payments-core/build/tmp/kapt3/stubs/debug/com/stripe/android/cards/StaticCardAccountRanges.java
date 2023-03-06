package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/cards/StaticCardAccountRanges;", "", "filter", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "first", "payments-core_debug"})
public abstract interface StaticCardAccountRanges {
    
    /**
     * Return the first [AccountRange] that contains the given [cardNumber], or `null`.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.AccountRange first(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber);
    
    /**
     * Return all [AccountRange]s that contain the given [cardNumber].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.stripe.android.model.AccountRange> filter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber);
}