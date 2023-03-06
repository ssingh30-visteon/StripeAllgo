package com.stripe.android.cards;

import java.lang.System;

/**
 * A [CardAccountRangeRepository.Factory] that returns a [DefaultCardAccountRangeRepositoryFactory].
 *
 * Will throw an exception if [PaymentConfiguration] has not been instantiated.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "(Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "appContext", "kotlin.jvm.PlatformType", "create", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "createRemoteCardAccountRangeSource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "fireAnalyticsEvent", "", "publishableKey", "", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "NullCardAccountRangeSource", "payments-core_debug"})
public final class DefaultCardAccountRangeRepositoryFactory implements com.stripe.android.cards.CardAccountRangeRepository.Factory {
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final android.content.Context appContext = null;
    
    public DefaultCardAccountRangeRepositoryFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor) {
        super();
    }
    
    public DefaultCardAccountRangeRepositoryFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalStateException.class})
    @java.lang.Override()
    public com.stripe.android.cards.CardAccountRangeRepository create() throws java.lang.IllegalStateException {
        return null;
    }
    
    private final com.stripe.android.cards.CardAccountRangeSource createRemoteCardAccountRangeSource() {
        return null;
    }
    
    private final void fireAnalyticsEvent(java.lang.String publishableKey, com.stripe.android.networking.PaymentAnalyticsEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory$NullCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "()V", "loading", "Lkotlinx/coroutines/flow/Flow;", "", "getLoading", "()Lkotlinx/coroutines/flow/Flow;", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
    static final class NullCardAccountRangeSource implements com.stripe.android.cards.CardAccountRangeSource {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> loading = null;
        
        public NullCardAccountRangeSource() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object getAccountRange(@org.jetbrains.annotations.NotNull()
        com.stripe.android.cards.CardNumber.Unvalidated cardNumber, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.stripe.android.model.AccountRange> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.coroutines.flow.Flow<java.lang.Boolean> getLoading() {
            return null;
        }
    }
}