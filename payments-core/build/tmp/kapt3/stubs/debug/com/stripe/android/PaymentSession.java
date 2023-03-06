package com.stripe.android;

import java.lang.System;

/**
 * Represents a single start-to-finish payment operation.
 *
 * See [Using Android basic integration](https://stripe.com/docs/mobile/android/basic) for more
 * information.
 *
 * If [PaymentSessionConfig.shouldPrefetchCustomer] is `true`, and the customer has previously
 * selected a payment method, [PaymentSessionData.paymentMethod] will be updated with the
 * payment method and [PaymentSessionListener.onPaymentSessionDataChanged] will be called.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 A2\u00020\u0001:\u0002ABB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tBq\b\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010,\u001a\u00020-J\u0012\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u000200H\u0002J \u00101\u001a\u0002002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106J\u000e\u00107\u001a\u00020-2\u0006\u0010\"\u001a\u00020#J\u0006\u00108\u001a\u00020-J\u0010\u00109\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0002J\u0012\u0010:\u001a\u00020-2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<J\u0006\u0010=\u001a\u00020-J\u0010\u0010>\u001a\u00020-2\b\b\u0001\u0010?\u001a\u00020@R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006C"}, d2 = {"Lcom/stripe/android/PaymentSession;", "", "activity", "Landroidx/activity/ComponentActivity;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/PaymentSessionConfig;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "context", "Landroid/content/Context;", "application", "Landroid/app/Application;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentMethodsActivityStarter", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "paymentFlowActivityStarter", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "(Landroid/content/Context;Landroid/app/Application;Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/PaymentSessionData;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "listener", "Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "getListener$payments_core_debug", "()Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "setListener$payments_core_debug", "(Lcom/stripe/android/PaymentSession$PaymentSessionListener;)V", "viewModel", "Lcom/stripe/android/PaymentSessionViewModel;", "getViewModel$payments_core_debug", "()Lcom/stripe/android/PaymentSessionViewModel;", "clearPaymentMethod", "", "fetchCustomer", "isInitialFetch", "", "handlePaymentData", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "init", "onCompleted", "onPaymentMethodResult", "presentPaymentMethodSelection", "selectedPaymentMethodId", "", "presentShippingFlow", "setCartTotal", "cartTotal", "", "Companion", "PaymentSessionListener", "payments-core_debug"})
public final class PaymentSession {
    private final android.content.Context context = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final com.stripe.android.PaymentSessionConfig config = null;
    private final com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentMethodsActivity, com.stripe.android.view.PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter = null;
    private final com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentFlowActivity, com.stripe.android.view.PaymentFlowActivityStarter.Args> paymentFlowActivityStarter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.PaymentSessionViewModel viewModel = null;
    private final androidx.lifecycle.LifecycleObserver lifecycleObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PaymentSession.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_TOKEN = "PaymentSession";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAYMENT_SESSION_DATA = "extra_payment_session_data";
    private static final java.util.Set<java.lang.Integer> VALID_REQUEST_CODES = null;
    
    @androidx.annotation.VisibleForTesting()
    public PaymentSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession customerSession, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentMethodsActivity, com.stripe.android.view.PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentFlowActivity, com.stripe.android.view.PaymentFlowActivityStarter.Args> paymentFlowActivityStarter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionData paymentSessionData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionViewModel getViewModel$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.PaymentSession.PaymentSessionListener getListener$payments_core_debug() {
        return null;
    }
    
    public final void setListener$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.PaymentSession.PaymentSessionListener p0) {
    }
    
    /**
     * Create a PaymentSession attached to the given host Activity.
     *
     * @param activity a `ComponentActivity` from which to launch other Stripe Activities. This
     * Activity will receive results in
     * `Activity#onActivityResult(int, int, Intent)` that should be
     * passed back to this session.
     * @param config a [PaymentSessionConfig] that configures this [PaymentSession] instance
     */
    public PaymentSession(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config) {
        super();
    }
    
    /**
     * Create a PaymentSession attached to the given host Fragment.
     *
     * @param fragment a `Fragment` from which to launch other Stripe Activities. This
     * Fragment will receive results in `Fragment#onActivityResult(int, int, Intent)` that should be
     * passed back to this session.
     * @param config a [PaymentSessionConfig] that configures this [PaymentSession] instance
     */
    public PaymentSession(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config) {
        super();
    }
    
    /**
     * Notify this payment session that it is complete
     */
    public final void onCompleted() {
    }
    
    /**
     * Method to handle Activity results from Stripe activities. Pass data here from your
     * host's `#onActivityResult(int, int, Intent)` function.
     *
     * @param requestCode the request code used to open the resulting activity
     * @param resultCode a result code representing the success of the intended action
     * @param data an [Intent] with the resulting data from the Activity
     *
     * @return `true` if the activity result was handled by this function,
     * otherwise `false`
     */
    public final boolean handlePaymentData(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    private final void onPaymentMethodResult(android.content.Intent data) {
    }
    
    /**
     * Initialize the [PaymentSession] with a [PaymentSessionListener] to be notified of
     * data changes. The reference to the [listener] will be released when the host (i.e.
     * `Activity` or `Fragment`) is destroyed.
     *
     * The [listener] will be immediately called with the current [PaymentSessionData].
     *
     * If the [PaymentSessionConfig.shouldPrefetchCustomer] is true, a new `Customer` instance
     * will be fetched.
     *
     * @param listener a [PaymentSessionListener]
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSession.PaymentSessionListener listener) {
    }
    
    /**
     * Launch the [PaymentMethodsActivity] to allow the user to select a payment method,
     * or to add a new one.
     *
     * The initial selected Payment Method ID uses the following logic.
     *
     * 1. If {@param userSelectedPaymentMethodId} is specified, use that
     * 2. If the instance's [PaymentSessionData.paymentMethod] is non-null, use that
     * 3. If the instance's [PaymentSessionPrefs.getPaymentMethodId] is non-null, use that
     * 4. Otherwise, choose the most recently added Payment Method
     *
     * @param selectedPaymentMethodId if non-null, the ID of the Payment Method that should be
     * initially selected on the Payment Method selection screen
     */
    public final void presentPaymentMethodSelection(@org.jetbrains.annotations.Nullable()
    java.lang.String selectedPaymentMethodId) {
    }
    
    /**
     * Set the cart total for this PaymentSession. This should not include shipping costs.
     *
     * @param cartTotal the current total price for all non-shipping and non-tax items in
     * a customer's cart
     */
    public final void setCartTotal(@androidx.annotation.IntRange(from = 0L)
    long cartTotal) {
    }
    
    /**
     * Launch the [PaymentFlowActivity] to allow the user to fill in payment details.
     */
    public final void presentShippingFlow() {
    }
    
    /**
     * Clear the payment method associated with this [PaymentSession] in [PaymentSessionData].
     *
     * Will trigger a call to [PaymentSessionListener.onPaymentSessionDataChanged].
     */
    public final void clearPaymentMethod() {
    }
    
    private final void fetchCustomer(boolean isInitialFetch) {
    }
    
    /**
     * Represents a listener for PaymentSession actions, used to update the host activity
     * when necessary.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "", "onCommunicatingStateChanged", "", "isCommunicating", "", "onError", "errorCode", "", "errorMessage", "", "onPaymentSessionDataChanged", "data", "Lcom/stripe/android/PaymentSessionData;", "payments-core_debug"})
    public static abstract interface PaymentSessionListener {
        
        /**
         * Notification method called when network communication is beginning or ending.
         *
         * @param isCommunicating `true` if communication is starting, `false` if it is stopping.
         */
        public abstract void onCommunicatingStateChanged(boolean isCommunicating);
        
        /**
         * Notification method called when an error has occurred.
         *
         * @param errorCode a network code associated with the error
         * @param errorMessage a message associated with the error
         */
        public abstract void onError(int errorCode, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        /**
         * Notification method called when the [PaymentSessionData] for this session has changed.
         *
         * @param data the updated [PaymentSessionData]
         */
        public abstract void onPaymentSessionDataChanged(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionData data);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentSession$Companion;", "", "()V", "EXTRA_PAYMENT_SESSION_DATA", "", "PRODUCT_TOKEN", "VALID_REQUEST_CODES", "", "", "isValidRequestCode", "", "requestCode", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final boolean isValidRequestCode(int requestCode) {
            return false;
        }
    }
}