package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\n\b\u0000\u0010\u0017*\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", "stripeAccountId", "listeners", "", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerUpdated", "Lkotlin/Function1;", "Lcom/stripe/android/model/Customer;", "", "(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "execute", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation;", "execute$payments_core_debug", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListener", "L", "operationId", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerRetrieved", "result", "Lkotlin/Result;", "(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V", "onError", "listener", "error", "", "retrieveCustomerWithKey", "key", "productUsage", "", "(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_debug"})
public final class CustomerSessionOperationExecutor {
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final java.lang.String publishableKey = null;
    private final java.lang.String stripeAccountId = null;
    private final java.util.Map<java.lang.String, com.stripe.android.CustomerSession.RetrievalListener> listeners = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.model.Customer, kotlin.Unit> onCustomerUpdated = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.CustomerSessionOperationExecutor.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String REQUIRED_ERROR = "API request returned an invalid response.";
    
    public CustomerSessionOperationExecutor(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.stripe.android.CustomerSession.RetrievalListener> listeners, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.Customer, kotlin.Unit> onCustomerUpdated) {
        super();
    }
    
    private final void onCustomerRetrieved(com.stripe.android.EphemeralOperation operation, java.lang.Object result) {
    }
    
    private final void onError(com.stripe.android.CustomerSession.RetrievalListener listener, java.lang.Throwable error) {
    }
    
    private final <L extends com.stripe.android.CustomerSession.RetrievalListener>L getListener(java.lang.String operationId) {
        return null;
    }
    
    /**
     * Fetch a [Customer]. If the provided key is expired, this method **does not** update the key.
     * Use [createUpdateCustomer] to validate the key before refreshing the customer.
     *
     * @param key the [EphemeralKey] used for this access
     * @return a [Customer] if one can be found with this key, or `null` if one cannot.
     */
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.StripeException.class})
    private final java.lang.Object retrieveCustomerWithKey(com.stripe.android.EphemeralKey key, java.util.Set<java.lang.String> productUsage, kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;", "", "()V", "REQUIRED_ERROR", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}