package com.stripe.android.cards;

import java.lang.System;

/**
 * A [ViewModel] for [CardWidget] instances.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/cards/CardWidgetViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "(Landroid/app/Application;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "getCardAccountRangeRepository", "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository$delegate", "Lkotlin/Lazy;", "getAccountRange", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "payments-core_debug"})
public final class CardWidgetViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlin.Lazy cardAccountRangeRepository$delegate = null;
    
    public CardWidgetViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        super(null);
    }
    
    public CardWidgetViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    private final com.stripe.android.cards.CardAccountRangeRepository getCardAccountRangeRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.model.AccountRange> getAccountRange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardNumber.Unvalidated cardNumber) {
        return null;
    }
}