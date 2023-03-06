package com.stripe.android;

import java.lang.System;

/**
 * Represents a logged-in session of a single Customer.
 *
 * See [Creating ephemeral keys](https://stripe.com/docs/mobile/android/standard#creating-ephemeral-keys)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \\2\u00020\u0001:\u0006\\]^_`aBY\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u001e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u000201J3\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000201H\u0000\u00a2\u0006\u0002\b4J\u0016\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u000207J+\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000207H\u0000\u00a2\u0006\u0002\b8J\r\u00109\u001a\u00020-H\u0000\u00a2\u0006\u0002\b:J\u0016\u0010;\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u00100\u001a\u000201J+\u0010;\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000201H\u0000\u00a2\u0006\u0002\b<J\u0016\u0010=\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u000207J+\u0010=\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u000207H\u0000\u00a2\u0006\u0002\b>J#\u0010?\u001a\u0004\u0018\u0001H@\"\n\b\u0000\u0010@*\u0004\u0018\u00010)2\u0006\u0010A\u001a\u00020\u0007H\u0002\u00a2\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\u0006\u00100\u001a\u00020FJA\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020FH\u0007\u00a2\u0006\u0002\u0010KJQ\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020E2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020FH\u0000\u00a2\u0006\u0004\bL\u0010MJ\u000e\u0010N\u001a\u00020-2\u0006\u00100\u001a\u00020OJ#\u0010N\u001a\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000\u00a2\u0006\u0002\bPJ\u001e\u0010Q\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020OJ3\u0010Q\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000\u00a2\u0006\u0002\bRJ\u0016\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020U2\u0006\u00100\u001a\u00020OJ+\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020U2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000\u00a2\u0006\u0002\bVJ\u001a\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020Y2\b\u00100\u001a\u0004\u0018\u00010)H\u0002J\u000e\u0010Z\u001a\u00020-2\u0006\u00100\u001a\u00020OJ#\u0010Z\u001a\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u00100\u001a\u00020OH\u0000\u00a2\u0006\u0002\b[R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/stripe/android/CustomerSession;", "", "context", "Landroid/content/Context;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", "stripeAccountId", "workContext", "Lkotlin/coroutines/CoroutineContext;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "ephemeralKeyManagerFactory", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/EphemeralKeyManager$Factory;)V", "cachedCustomer", "Lcom/stripe/android/model/Customer;", "getCachedCustomer", "()Lcom/stripe/android/model/Customer;", "canUseCachedCustomer", "", "getCanUseCachedCustomer", "()Z", "customer", "getCustomer$payments_core_debug", "setCustomer$payments_core_debug", "(Lcom/stripe/android/model/Customer;)V", "customerCacheTime", "getCustomerCacheTime$payments_core_debug", "()J", "setCustomerCacheTime$payments_core_debug", "(J)V", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "listeners", "", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "operationExecutor", "Lcom/stripe/android/CustomerSessionOperationExecutor;", "addCustomerSource", "", "sourceId", "sourceType", "listener", "Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", "productUsage", "", "addCustomerSource$payments_core_debug", "attachPaymentMethod", "paymentMethodId", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "attachPaymentMethod$payments_core_debug", "cancel", "cancel$payments_core_debug", "deleteCustomerSource", "deleteCustomerSource$payments_core_debug", "detachPaymentMethod", "detachPaymentMethod$payments_core_debug", "getListener", "L", "operationId", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "getPaymentMethods", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "limit", "", "endingBefore", "startingAfter", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "getPaymentMethods$payments_core_debug", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;)V", "retrieveCurrentCustomer", "Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "retrieveCurrentCustomer$payments_core_debug", "setCustomerDefaultSource", "setCustomerDefaultSource$payments_core_debug", "setCustomerShippingInformation", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInformation$payments_core_debug", "startOperation", "operation", "Lcom/stripe/android/EphemeralOperation;", "updateCurrentCustomer", "updateCurrentCustomer$payments_core_debug", "Companion", "CustomerRetrievalListener", "PaymentMethodRetrievalListener", "PaymentMethodsRetrievalListener", "RetrievalListener", "SourceRetrievalListener", "payments-core_debug"})
public final class CustomerSession {
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final com.stripe.android.OperationIdFactory operationIdFactory = null;
    private final kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier = null;
    private final java.util.Map<java.lang.String, com.stripe.android.CustomerSession.RetrievalListener> listeners = null;
    private final com.stripe.android.CustomerSessionOperationExecutor operationExecutor = null;
    private final com.stripe.android.EphemeralKeyManager ephemeralKeyManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.CustomerSession.Companion Companion = null;
    private static final int THREAD_POOL_SIZE = 3;
    private static final int KEEP_ALIVE_TIME = 2;
    private static final java.util.concurrent.TimeUnit KEEP_ALIVE_TIME_UNIT = java.util.concurrent.TimeUnit.SECONDS;
    private static final long CUSTOMER_CACHE_DURATION_MILLISECONDS = 0L;
    
    @androidx.annotation.VisibleForTesting()
    public CustomerSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.OperationIdFactory operationIdFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyManager.Factory ephemeralKeyManagerFactory) {
        super();
    }
    
    public final long getCustomerCacheTime$payments_core_debug() {
        return 0L;
    }
    
    public final void setCustomerCacheTime$payments_core_debug(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Customer getCustomer$payments_core_debug() {
        return null;
    }
    
    public final void setCustomer$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Customer p0) {
    }
    
    /**
     * Retrieve the current [Customer]. If [customer] is not stale, this returns immediately with
     * the cache. If not, it fetches a new value and returns that to the listener.
     *
     * @param listener a [CustomerRetrievalListener] to invoke with the result of getting the
     * customer, either from the cache or from the server
     */
    public final void retrieveCurrentCustomer(@org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.CustomerRetrievalListener listener) {
    }
    
    /**
     * Force an update of the current customer, regardless of how much time has passed.
     *
     * @param listener a [CustomerRetrievalListener] to invoke with the result of getting
     * the customer from the server
     */
    public final void updateCurrentCustomer(@org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.CustomerRetrievalListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Customer getCachedCustomer() {
        return null;
    }
    
    /**
     * Add the Source to the current customer.
     *
     * @param sourceId the ID of the source to be added
     * @param listener a [SourceRetrievalListener] called when the API call completes
     * with the added [Source].
     */
    public final void addCustomerSource(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.SourceRetrievalListener listener) {
    }
    
    /**
     * Delete the Source from the current customer.
     *
     * @param sourceId the ID of the source to be deleted
     * @param listener a [SourceRetrievalListener] called when the API call completes
     * with the added [Source].
     */
    public final void deleteCustomerSource(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.SourceRetrievalListener listener) {
    }
    
    /**
     * Attaches a PaymentMethod to a customer.
     *
     * @param paymentMethodId the ID of the payment method to be attached
     * @param listener a [PaymentMethodRetrievalListener] called when the API call
     * completes with the attached [PaymentMethod].
     */
    public final void attachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodRetrievalListener listener) {
    }
    
    /**
     * Detaches a PaymentMethod from a customer.
     *
     * @param paymentMethodId the ID of the payment method to be detached
     * @param listener a [PaymentMethodRetrievalListener] called when the API call
     * completes with the detached [PaymentMethod].
     */
    public final void detachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodRetrievalListener listener) {
    }
    
    /**
     * Retrieves all of the customer's PaymentMethod objects, filtered by a [PaymentMethod.Type].
     *
     * See [List a Customer's PaymentMethods](https://stripe.com/docs/api/payment_methods/list)
     *
     * @param paymentMethodType the [PaymentMethod.Type] to filter by
     * @param listener a [PaymentMethodRetrievalListener] called when the API call
     * completes with a list of [PaymentMethod] objects
     *
     * @param limit Optional. A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the default is 10.
     * @param endingBefore Optional. A cursor for use in pagination. `ending_before` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, starting with `obj_bar`, your subsequent call can include
     * `ending_before=obj_bar` in order to fetch the previous page of the list.
     * @param startingAfter Optional. A cursor for use in pagination. `starting_after` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo`
     * in order to fetch the next page of the list.
     */
    @kotlin.jvm.JvmOverloads()
    public final void getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.IntRange(from = 1L, to = 100L)
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener listener) {
    }
    
    /**
     * Retrieves all of the customer's PaymentMethod objects, filtered by a [PaymentMethod.Type].
     *
     * See [List a Customer's PaymentMethods](https://stripe.com/docs/api/payment_methods/list)
     *
     * @param paymentMethodType the [PaymentMethod.Type] to filter by
     * @param listener a [PaymentMethodRetrievalListener] called when the API call
     * completes with a list of [PaymentMethod] objects
     *
     * @param limit Optional. A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the default is 10.
     * @param endingBefore Optional. A cursor for use in pagination. `ending_before` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, starting with `obj_bar`, your subsequent call can include
     * `ending_before=obj_bar` in order to fetch the previous page of the list.
     * @param startingAfter Optional. A cursor for use in pagination. `starting_after` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo`
     * in order to fetch the next page of the list.
     */
    @kotlin.jvm.JvmOverloads()
    public final void getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.IntRange(from = 1L, to = 100L)
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    java.lang.String endingBefore, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener listener) {
    }
    
    /**
     * Retrieves all of the customer's PaymentMethod objects, filtered by a [PaymentMethod.Type].
     *
     * See [List a Customer's PaymentMethods](https://stripe.com/docs/api/payment_methods/list)
     *
     * @param paymentMethodType the [PaymentMethod.Type] to filter by
     * @param listener a [PaymentMethodRetrievalListener] called when the API call
     * completes with a list of [PaymentMethod] objects
     *
     * @param limit Optional. A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the default is 10.
     * @param endingBefore Optional. A cursor for use in pagination. `ending_before` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, starting with `obj_bar`, your subsequent call can include
     * `ending_before=obj_bar` in order to fetch the previous page of the list.
     * @param startingAfter Optional. A cursor for use in pagination. `starting_after` is an object
     * ID that defines your place in the list. For instance, if you make a list request and receive
     * 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo`
     * in order to fetch the next page of the list.
     */
    @kotlin.jvm.JvmOverloads()
    public final void getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.IntRange(from = 1L, to = 100L)
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    java.lang.String endingBefore, @org.jetbrains.annotations.Nullable()
    java.lang.String startingAfter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener listener) {
    }
    
    public final void getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener listener) {
    }
    
    /**
     * Set the shipping information on the current customer.
     *
     * @param shippingInformation the data to be set
     */
    public final void setCustomerShippingInformation(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.CustomerRetrievalListener listener) {
    }
    
    /**
     * Set the default Source of the current customer.
     *
     * @param sourceId the ID of the source to be set
     * @param listener a [CustomerRetrievalListener] called when the API call
     * completes with the updated customer
     */
    public final void setCustomerDefaultSource(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession.CustomerRetrievalListener listener) {
    }
    
    private final void startOperation(com.stripe.android.EphemeralOperation operation, com.stripe.android.CustomerSession.RetrievalListener listener) {
    }
    
    private final boolean getCanUseCachedCustomer() {
        return false;
    }
    
    private final <L extends com.stripe.android.CustomerSession.RetrievalListener>L getListener(java.lang.String operationId) {
        return null;
    }
    
    /**
     * Create a CustomerSession with the provided [EphemeralKeyProvider].
     *
     * You must call [PaymentConfiguration.init] with your publishable key
     * before calling this method.
     *
     * @param context The application context
     * @param ephemeralKeyProvider An [EphemeralKeyProvider] used to retrieve
     * [EphemeralKey] ephemeral keys
     * @param shouldPrefetchEphemeralKey If true, will immediately fetch an ephemeral key using
     * {@param ephemeralKeyProvider}. Otherwise, will only fetch
     * an ephemeral key when needed.
     */
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void initCustomerSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider) {
    }
    
    /**
     * Create a CustomerSession with the provided [EphemeralKeyProvider].
     *
     * You must call [PaymentConfiguration.init] with your publishable key
     * before calling this method.
     *
     * @param context The application context
     * @param ephemeralKeyProvider An [EphemeralKeyProvider] used to retrieve
     * [EphemeralKey] ephemeral keys
     * @param shouldPrefetchEphemeralKey If true, will immediately fetch an ephemeral key using
     * {@param ephemeralKeyProvider}. Otherwise, will only fetch
     * an ephemeral key when needed.
     */
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void initCustomerSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider, boolean shouldPrefetchEphemeralKey) {
    }
    
    /**
     * Gets the singleton instance of [CustomerSession]. If the session has not been
     * initialized, this will throw a [RuntimeException].
     *
     * @return the singleton [CustomerSession] instance.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.CustomerSession getInstance() {
        return null;
    }
    
    /**
     * End the singleton instance of a [CustomerSession].
     * Calls to [getInstance] will throw an [IllegalStateException]
     * after this call, until the user calls
     * [initCustomerSession] again.
     */
    @kotlin.jvm.JvmStatic()
    public static final void endCustomerSession() {
    }
    
    /**
     * Cancel any in-flight [CustomerSession] operations.
     * Their callback listeners will not be called.
     *
     * It will not clear the singleton [CustomerSession] instance.
     *
     * It is not necessary to call [initCustomerSession] after calling [cancelCallbacks].
     */
    @kotlin.jvm.JvmStatic()
    public static final void cancelCallbacks() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onCustomerRetrieved", "", "customer", "Lcom/stripe/android/model/Customer;", "payments-core_debug"})
    public static abstract interface CustomerRetrievalListener extends com.stripe.android.CustomerSession.RetrievalListener {
        
        public abstract void onCustomerRetrieved(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Customer customer);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/CustomerSession$SourceRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onSourceRetrieved", "", "source", "Lcom/stripe/android/model/Source;", "payments-core_debug"})
    public static abstract interface SourceRetrievalListener extends com.stripe.android.CustomerSession.RetrievalListener {
        
        public abstract void onSourceRetrieved(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Source source);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onPaymentMethodRetrieved", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_debug"})
    public static abstract interface PaymentMethodRetrievalListener extends com.stripe.android.CustomerSession.RetrievalListener {
        
        public abstract void onPaymentMethodRetrieved(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "onPaymentMethodsRetrieved", "", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_debug"})
    public static abstract interface PaymentMethodsRetrievalListener extends com.stripe.android.CustomerSession.RetrievalListener {
        
        public abstract void onPaymentMethodsRetrieved(@org.jetbrains.annotations.NotNull()
        java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/CustomerSession$RetrievalListener;", "", "onError", "", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/StripeError;", "payments-core_debug"})
    public static abstract interface RetrievalListener {
        
        public abstract void onError(int errorCode, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.StripeError stripeError);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\r\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0007J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/CustomerSession$Companion;", "", "()V", "CUSTOMER_CACHE_DURATION_MILLISECONDS", "", "KEEP_ALIVE_TIME", "", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "THREAD_POOL_SIZE", "instance", "Lcom/stripe/android/CustomerSession;", "getInstance$payments_core_debug", "()Lcom/stripe/android/CustomerSession;", "setInstance$payments_core_debug", "(Lcom/stripe/android/CustomerSession;)V", "cancelCallbacks", "", "clearInstance", "clearInstance$payments_core_debug", "createCoroutineDispatcher", "Lkotlin/coroutines/CoroutineContext;", "endCustomerSession", "getInstance", "initCustomerSession", "context", "Landroid/content/Context;", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "shouldPrefetchEphemeralKey", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a CustomerSession with the provided [EphemeralKeyProvider].
         *
         * You must call [PaymentConfiguration.init] with your publishable key
         * before calling this method.
         *
         * @param context The application context
         * @param ephemeralKeyProvider An [EphemeralKeyProvider] used to retrieve
         * [EphemeralKey] ephemeral keys
         * @param shouldPrefetchEphemeralKey If true, will immediately fetch an ephemeral key using
         * {@param ephemeralKeyProvider}. Otherwise, will only fetch
         * an ephemeral key when needed.
         */
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void initCustomerSession(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider) {
        }
        
        /**
         * Create a CustomerSession with the provided [EphemeralKeyProvider].
         *
         * You must call [PaymentConfiguration.init] with your publishable key
         * before calling this method.
         *
         * @param context The application context
         * @param ephemeralKeyProvider An [EphemeralKeyProvider] used to retrieve
         * [EphemeralKey] ephemeral keys
         * @param shouldPrefetchEphemeralKey If true, will immediately fetch an ephemeral key using
         * {@param ephemeralKeyProvider}. Otherwise, will only fetch
         * an ephemeral key when needed.
         */
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void initCustomerSession(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider, boolean shouldPrefetchEphemeralKey) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.CustomerSession getInstance$payments_core_debug() {
            return null;
        }
        
        public final void setInstance$payments_core_debug(@org.jetbrains.annotations.Nullable()
        com.stripe.android.CustomerSession p0) {
        }
        
        /**
         * Gets the singleton instance of [CustomerSession]. If the session has not been
         * initialized, this will throw a [RuntimeException].
         *
         * @return the singleton [CustomerSession] instance.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.CustomerSession getInstance() {
            return null;
        }
        
        /**
         * End the singleton instance of a [CustomerSession].
         * Calls to [getInstance] will throw an [IllegalStateException]
         * after this call, until the user calls
         * [initCustomerSession] again.
         */
        @kotlin.jvm.JvmStatic()
        public final void endCustomerSession() {
        }
        
        /**
         * Cancel any in-flight [CustomerSession] operations.
         * Their callback listeners will not be called.
         *
         * It will not clear the singleton [CustomerSession] instance.
         *
         * It is not necessary to call [initCustomerSession] after calling [cancelCallbacks].
         */
        @kotlin.jvm.JvmStatic()
        public final void cancelCallbacks() {
        }
        
        private final kotlin.coroutines.CoroutineContext createCoroutineDispatcher() {
            return null;
        }
    }
}