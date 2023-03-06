package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0004<=>?B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\b\b\u0002\u0010 \u001a\u00020!J7\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$2#\u0010%\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001d0&H\u0002J\u0014\u0010+\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010$J\u0006\u0010-\u001a\u00020\u001dJ/\u0010.\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d00H\u0000\u00a2\u0006\u0002\b1J\u0006\u00102\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00104\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u000106J\u001a\u00107\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010\'2\u0006\u00108\u001a\u00020!H\u0002J\u0010\u00109\u001a\u00020\u001d2\b\b\u0001\u0010:\u001a\u00020;R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentSessionPrefs", "Lcom/stripe/android/PaymentSessionPrefs;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionPrefs;)V", "_networkState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "_paymentSessionDataLiveData", "networkState", "Landroidx/lifecycle/LiveData;", "getNetworkState$payments_core_debug", "()Landroidx/lifecycle/LiveData;", "value", "getPaymentSessionData", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData", "(Lcom/stripe/android/PaymentSessionData;)V", "paymentSessionDataLiveData", "getPaymentSessionDataLiveData", "clearPaymentMethod", "", "fetchCustomer", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "isInitialFetch", "", "fetchCustomerPaymentMethod", "paymentMethodId", "", "onComplete", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlin/ParameterName;", "name", "paymentMethod", "getSelectedPaymentMethodId", "userSelectedPaymentMethodId", "onCompleted", "onCustomerRetrieved", "customerId", "Lkotlin/Function0;", "onCustomerRetrieved$payments_core_debug", "onListenerAttached", "onPaymentFlowResult", "onPaymentMethodResult", "result", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "persistPaymentMethodResult", "useGooglePay", "updateCartTotal", "cartTotal", "", "Companion", "Factory", "FetchCustomerResult", "NetworkState", "payments-core_debug"})
public final class PaymentSessionViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.stripe.android.CustomerSession customerSession = null;
    private final com.stripe.android.PaymentSessionPrefs paymentSessionPrefs = null;
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.PaymentSessionData paymentSessionData;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.PaymentSessionData> _paymentSessionDataLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.PaymentSessionData> paymentSessionDataLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.PaymentSessionViewModel.NetworkState> _networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.PaymentSessionViewModel.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PaymentSessionViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PAYMENT_SESSION_DATA = "key_payment_session_data";
    private static final int MAX_PAYMENT_METHODS_LIMIT = 100;
    
    public PaymentSessionViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionData paymentSessionData, @org.jetbrains.annotations.NotNull()
    com.stripe.android.CustomerSession customerSession, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionPrefs paymentSessionPrefs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionData getPaymentSessionData() {
        return null;
    }
    
    public final void setPaymentSessionData(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionData value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.PaymentSessionData> getPaymentSessionDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.PaymentSessionViewModel.NetworkState> getNetworkState$payments_core_debug() {
        return null;
    }
    
    public final void clearPaymentMethod() {
    }
    
    private final void fetchCustomerPaymentMethod(java.lang.String paymentMethodId, kotlin.jvm.functions.Function1<? super com.stripe.android.model.PaymentMethod, kotlin.Unit> onComplete) {
    }
    
    private final void persistPaymentMethodResult(com.stripe.android.model.PaymentMethod paymentMethod, boolean useGooglePay) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "", "()V", "Error", "Success", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "payments-core_debug"})
    public static abstract class FetchCustomerResult {
        
        private FetchCustomerResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "()V", "payments-core_debug"})
        public static final class Success extends com.stripe.android.PaymentSessionViewModel.FetchCustomerResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.PaymentSessionViewModel.FetchCustomerResult.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/StripeError;", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getStripeError", "()Lcom/stripe/android/StripeError;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "payments-core_debug"})
        public static final class Error extends com.stripe.android.PaymentSessionViewModel.FetchCustomerResult {
            private final int errorCode = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String errorMessage = null;
            @org.jetbrains.annotations.Nullable()
            private final com.stripe.android.StripeError stripeError = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentSessionViewModel.FetchCustomerResult.Error copy(int errorCode, @org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
            com.stripe.android.StripeError stripeError) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(int errorCode, @org.jetbrains.annotations.NotNull()
            java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
            com.stripe.android.StripeError stripeError) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getErrorCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getErrorMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.StripeError component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.StripeError getStripeError() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "", "(Ljava/lang/String;I)V", "Active", "Inactive", "payments-core_debug"})
    public static enum NetworkState {
        /*public static final*/ Active /* = new Active() */,
        /*public static final*/ Inactive /* = new Inactive() */;
        
        NetworkState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ7\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Factory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "customerSession", "Lcom/stripe/android/CustomerSession;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory extends androidx.lifecycle.AbstractSavedStateViewModelFactory {
        private final android.app.Application application = null;
        private final com.stripe.android.PaymentSessionData paymentSessionData = null;
        private final com.stripe.android.CustomerSession customerSession = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        androidx.savedstate.SavedStateRegistryOwner owner, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentSessionData paymentSessionData, @org.jetbrains.annotations.NotNull()
        com.stripe.android.CustomerSession customerSession) {
            super(null, null);
        }
        
        @java.lang.Override()
        protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle handle) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Companion;", "", "()V", "KEY_PAYMENT_SESSION_DATA", "", "MAX_PAYMENT_METHODS_LIMIT", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}