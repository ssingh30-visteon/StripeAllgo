package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Provides dependencies for 3ds2 transaction.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule;", "", "()V", "bindsStripe3ds2ChallengeResultProcessor", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "defaultStripe3ds2ChallengeResultProcessor", "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;", "Companion", "payments-core_debug"})
@dagger.Module(subcomponents = {com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.class})
public abstract class Stripe3ds2TransactionModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule.Companion Companion = null;
    
    public Stripe3ds2TransactionModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor bindsStripe3ds2ChallengeResultProcessor(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule$Companion;", "", "()V", "provideMessageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "provideStripeThreeDs2Service", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "context", "Landroid/content/Context;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry provideMessageVersionRegistry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.stripe3ds2.service.StripeThreeDs2Service provideStripeThreeDs2Service(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @javax.inject.Named(value = "enableLogging")
        boolean enableLogging, @org.jetbrains.annotations.NotNull()
        @IOContext()
        kotlin.coroutines.CoroutineContext workContext) {
            return null;
        }
    }
}