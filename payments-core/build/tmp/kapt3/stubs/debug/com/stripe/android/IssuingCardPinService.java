package com.stripe.android;

import java.lang.System;

/**
 * Methods for retrieval / update of a Stripe Issuing card
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000f\u0018\u0000 +2\u00020\u0001:\u0005*+,-.B7\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0011J.\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/IssuingCardPinService;", "", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "stripeAccountId", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "retrievalListeners", "", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "updateListeners", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "fireRetrievePinRequest", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "listener", "fireUpdatePinRequest", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "logMissingListener", "onRetrievePinError", "throwable", "", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdatePinError", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePin", "cardId", "verificationId", "userOneTimeCode", "updatePin", "newPin", "CardPinActionError", "Companion", "IssuingCardPinRetrievalListener", "IssuingCardPinUpdateListener", "Listener", "payments-core_debug"})
public final class IssuingCardPinService {
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.OperationIdFactory operationIdFactory = null;
    private final java.lang.String stripeAccountId = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final java.util.Map<java.lang.String, com.stripe.android.IssuingCardPinService.IssuingCardPinRetrievalListener> retrievalListeners = null;
    private final java.util.Map<java.lang.String, com.stripe.android.IssuingCardPinService.IssuingCardPinUpdateListener> updateListeners = null;
    private final com.stripe.android.EphemeralKeyManager ephemeralKeyManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.IssuingCardPinService.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @androidx.annotation.VisibleForTesting()
    public IssuingCardPinService(@org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider keyProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.OperationIdFactory operationIdFactory, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    /**
     * Retrieves a PIN for a given card
     *
     * @param cardId the ID of the card (looks like ic_abcdef1234)
     * @param verificationId the ID of the verification that was sent to the cardholder
     * (typically server-side, through /v1/issuing/verifications)
     * @param userOneTimeCode the one-time code that was sent to the cardholder through sms or email
     * @param listener a listener for either the PIN, or any error that can occur
     */
    public final void retrievePin(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.IssuingCardPinService.IssuingCardPinRetrievalListener listener) {
    }
    
    /**
     * Retrieves a PIN for a given card
     *
     * @param cardId the ID of the card (looks like ic_abcdef1234)
     * @param newPin the new desired PIN
     * @param verificationId the ID of the verification that was sent to the cardholder
     * (typically server-side, through /v1/issuing/verifications)
     * @param userOneTimeCode the one-time code that was sent to the cardholder through sms or email
     * @param listener a listener for either the PIN, or any error that can occur
     */
    public final void updatePin(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String newPin, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.IssuingCardPinService.IssuingCardPinUpdateListener listener) {
    }
    
    private final void fireRetrievePinRequest(com.stripe.android.EphemeralKey ephemeralKey, com.stripe.android.EphemeralOperation.Issuing.RetrievePin operation, com.stripe.android.IssuingCardPinService.IssuingCardPinRetrievalListener listener) {
    }
    
    private final java.lang.Object onRetrievePinError(java.lang.Throwable throwable, com.stripe.android.IssuingCardPinService.IssuingCardPinRetrievalListener listener, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void fireUpdatePinRequest(com.stripe.android.EphemeralKey ephemeralKey, com.stripe.android.EphemeralOperation.Issuing.UpdatePin operation, com.stripe.android.IssuingCardPinService.IssuingCardPinUpdateListener listener) {
    }
    
    private final java.lang.Object onUpdatePinError(java.lang.Throwable throwable, com.stripe.android.IssuingCardPinService.IssuingCardPinUpdateListener listener, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void logMissingListener() {
    }
    
    /**
     * Create a IssuingCardPinService with the provided [EphemeralKeyProvider].
     *
     * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider keyProvider) {
        return null;
    }
    
    /**
     * Create a [IssuingCardPinService] with the provided [EphemeralKeyProvider].
     *
     * @param publishableKey an API publishable key
     * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider keyProvider) {
        return null;
    }
    
    /**
     * Create a [IssuingCardPinService] with the provided [EphemeralKeyProvider].
     *
     * @param publishableKey an API publishable key
     * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider keyProvider) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "", "(Ljava/lang/String;I)V", "UNKNOWN_ERROR", "EPHEMERAL_KEY_ERROR", "ONE_TIME_CODE_INCORRECT", "ONE_TIME_CODE_EXPIRED", "ONE_TIME_CODE_TOO_MANY_ATTEMPTS", "ONE_TIME_CODE_ALREADY_REDEEMED", "payments-core_debug"})
    public static enum CardPinActionError {
        /*public static final*/ UNKNOWN_ERROR /* = new UNKNOWN_ERROR() */,
        /*public static final*/ EPHEMERAL_KEY_ERROR /* = new EPHEMERAL_KEY_ERROR() */,
        /*public static final*/ ONE_TIME_CODE_INCORRECT /* = new ONE_TIME_CODE_INCORRECT() */,
        /*public static final*/ ONE_TIME_CODE_EXPIRED /* = new ONE_TIME_CODE_EXPIRED() */,
        /*public static final*/ ONE_TIME_CODE_TOO_MANY_ATTEMPTS /* = new ONE_TIME_CODE_TOO_MANY_ATTEMPTS() */,
        /*public static final*/ ONE_TIME_CODE_ALREADY_REDEEMED /* = new ONE_TIME_CODE_ALREADY_REDEEMED() */;
        
        CardPinActionError() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinRetrieved", "", "pin", "", "payments-core_debug"})
    public static abstract interface IssuingCardPinRetrievalListener extends com.stripe.android.IssuingCardPinService.Listener {
        
        public abstract void onIssuingCardPinRetrieved(@org.jetbrains.annotations.NotNull()
        java.lang.String pin);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinUpdated", "", "payments-core_debug"})
    public static abstract interface IssuingCardPinUpdateListener extends com.stripe.android.IssuingCardPinService.Listener {
        
        public abstract void onIssuingCardPinUpdated();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Listener;", "", "onError", "", "errorCode", "Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "errorMessage", "", "exception", "", "payments-core_debug"})
    public static abstract interface Listener {
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        com.stripe.android.IssuingCardPinService.CardPinActionError errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable exception);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "create", "Lcom/stripe/android/IssuingCardPinService;", "context", "Landroid/content/Context;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "publishableKey", "stripeAccountId", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a IssuingCardPinService with the provided [EphemeralKeyProvider].
         *
         * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyProvider keyProvider) {
            return null;
        }
        
        /**
         * Create a [IssuingCardPinService] with the provided [EphemeralKeyProvider].
         *
         * @param publishableKey an API publishable key
         * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyProvider keyProvider) {
            return null;
        }
        
        /**
         * Create a [IssuingCardPinService] with the provided [EphemeralKeyProvider].
         *
         * @param publishableKey an API publishable key
         * @param keyProvider an [EphemeralKeyProvider] used to obtain an [EphemeralKey]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.IssuingCardPinService create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyProvider keyProvider) {
            return null;
        }
    }
}