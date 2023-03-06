package com.stripe.android.paymentsheet.viewmodels;

import java.lang.System;

/**
 * Base `ViewModel` for activities that use `BottomSheet`.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0080\u0001\u0081\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\n\u0010o\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u001cH&J\b\u0010s\u001a\u00020qH&J\u000e\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\'J\u000e\u0010w\u001a\u00020q2\u0006\u0010x\u001a\u00020\u001fJ\u0012\u0010y\u001a\u00020q2\b\u0010c\u001a\u0004\u0018\u000103H\u0007J\u0015\u0010z\u001a\u00020q2\u0006\u0010{\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010|J\u0010\u0010}\u001a\u00020q2\b\u0010a\u001a\u0004\u0018\u000101J\u0016\u0010~\u001a\u00020q2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00120&H\u0002R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u00158\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR*\u0010*\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u001f0\u001f0\u00158\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001aR\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000050\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001607X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001f\u0010<\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u001f0\u001f07\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001c\u0010D\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u001f0\u001f0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001f\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010H0507\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001f07X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001f07X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0014\u0010\u000f\u001a\u00020\u0010X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u0012X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010KR\u001a\u0010T\u001a\u0004\u0018\u00010UX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&07X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00109R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001f07\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020/07X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010107X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00109R\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010307X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00109R \u0010e\u001a\b\u0012\u0004\u0012\u00020f0&X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000507X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u00109R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010n\u00a8\u0006\u0082\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "TransitionTargetType", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "prefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/Logger;", "injectorKey", "", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/Logger;Ljava/lang/String;)V", "_amount", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/paymentsheet/model/Amount;", "get_amount$paymentsheet_debug$annotations", "()V", "get_amount$paymentsheet_debug", "()Landroidx/lifecycle/MutableLiveData;", "_fatal", "", "get_fatal", "_isGooglePayReady", "", "get_isGooglePayReady$paymentsheet_debug$annotations", "get_isGooglePayReady$paymentsheet_debug", "_liveMode", "get_liveMode$paymentsheet_debug$annotations", "get_liveMode$paymentsheet_debug", "_paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "get_paymentMethods$paymentsheet_debug$annotations", "get_paymentMethods$paymentsheet_debug", "_processing", "kotlin.jvm.PlatformType", "get_processing$paymentsheet_debug$annotations", "get_processing$paymentsheet_debug", "_savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "_selection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "_stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "_transition", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "amount", "Landroidx/lifecycle/LiveData;", "getAmount$paymentsheet_debug", "()Landroidx/lifecycle/LiveData;", "getConfig$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "ctaEnabled", "getCtaEnabled", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomerConfig$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomerRepository", "()Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "editing", "getEventReporter$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "fragmentConfigEvent", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfigEvent", "getInjectorKey", "()Ljava/lang/String;", "isGooglePayReady", "isGooglePayReady$paymentsheet_debug", "liveMode", "getLiveMode$paymentsheet_debug", "getLogger", "()Lcom/stripe/android/Logger;", "merchantName", "getMerchantName$paymentsheet_debug", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "paymentMethods", "getPaymentMethods$paymentsheet_debug", "getPrefsRepository", "()Lcom/stripe/android/paymentsheet/PrefsRepository;", "processing", "getProcessing", "savedSelection", "selection", "getSelection$paymentsheet_debug", "stripeIntent", "getStripeIntent$paymentsheet_debug", "supportedPaymentMethods", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "getSupportedPaymentMethods$paymentsheet_debug", "()Ljava/util/List;", "setSupportedPaymentMethods$paymentsheet_debug", "(Ljava/util/List;)V", "transition", "getTransition$paymentsheet_debug", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "createFragmentConfig", "onFatal", "", "throwable", "onUserCancel", "removePaymentMethod", "Lkotlinx/coroutines/Job;", "paymentMethod", "setEditing", "isEditing", "setStripeIntent", "transitionTo", "target", "(Ljava/lang/Object;)V", "updateSelection", "warnUnactivatedIfNeeded", "unactivatedPaymentMethodTypes", "Event", "UserErrorMessage", "paymentsheet_debug"})
public abstract class BaseSheetViewModel<TransitionTargetType extends java.lang.Object> extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.PaymentSheet.Configuration config = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.analytics.EventReporter eventReporter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.PrefsRepository prefsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext workContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String injectorKey = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String merchantName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _fatal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isGooglePayReady = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isGooglePayReady = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.model.StripeIntent> _stripeIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.model.StripeIntent> stripeIntent = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.stripe.android.paymentsheet.model.SupportedPaymentMethod> supportedPaymentMethods;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.stripe.android.model.PaymentMethod>> _paymentMethods = null;
    
    /**
     * The list of saved payment methods for the current customer.
     * Value is null until it's loaded, and non-null (could be empty) after that.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.stripe.android.model.PaymentMethod>> paymentMethods = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.Amount> _amount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.Amount> amount = null;
    
    /**
     * Request to retrieve the value from the repository happens when initialize any fragment
     * and any fragment will re-update when the result comes back.
     * Represents what the user last selects (add or buy) on the
     * [PaymentOptionsActivity]/[PaymentSheetActivity], and saved/restored from the preferences.
     */
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.SavedSelection> _savedSelection = null;
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.SavedSelection> savedSelection = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<TransitionTargetType>> _transition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<TransitionTargetType>> transition = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _liveMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> liveMode = null;
    
    /**
     * On [CardDataCollectionFragment] this is set every time the details in the add
     * card fragment is determined to be valid (not necessarily selected)
     * On [BasePaymentMethodsListFragment] this is set when a user selects one of the options
     */
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.PaymentSelection> _selection = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.PaymentSelection> selection = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> editing = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _processing = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> processing = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> ctaEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<com.stripe.android.paymentsheet.model.FragmentConfig>> fragmentConfigEvent = null;
    
    public BaseSheetViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PrefsRepository prefsRepository, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.Configuration getConfig$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.analytics.EventReporter getEventReporter$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.stripe.android.paymentsheet.repositories.CustomerRepository getCustomerRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.stripe.android.paymentsheet.PrefsRepository getPrefsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.coroutines.CoroutineContext getWorkContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.stripe.android.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInjectorKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration getCustomerConfig$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantName$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<java.lang.Throwable> get_fatal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isGooglePayReady$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_isGooglePayReady$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isGooglePayReady$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.model.StripeIntent> getStripeIntent$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> getSupportedPaymentMethods$paymentsheet_debug() {
        return null;
    }
    
    public final void setSupportedPaymentMethods$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.model.SupportedPaymentMethod> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.stripe.android.model.PaymentMethod>> get_paymentMethods$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_paymentMethods$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.stripe.android.model.PaymentMethod>> getPaymentMethods$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.Amount> get_amount$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_amount$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.Amount> getAmount$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<TransitionTargetType>> getTransition$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_liveMode$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_liveMode$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLiveMode$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.PaymentSelection> getSelection$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_processing$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_processing$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProcessing() {
        return null;
    }
    
    /**
     * This should be initialized from the starter args, and then from that
     * point forward it will be the last valid card seen or entered in the add card view.
     * In contrast to selection, this field will not be updated by the list fragment. On the
     * Payment Sheet it is used to save a new card that is added for when you go back to the list
     * and reopen the card view. It is used on the Payment Options sheet similar to what is
     * described above, and when you have an unsaved card.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.paymentsheet.model.PaymentSelection.New.Card getNewCard();
    
    /**
     * This should be initialized from the starter args, and then from that
     * point forward it will be the last valid card seen or entered in the add card view.
     * In contrast to selection, this field will not be updated by the list fragment. On the
     * Payment Sheet it is used to save a new card that is added for when you go back to the list
     * and reopen the card view. It is used on the Payment Options sheet similar to what is
     * described above, and when you have an unsaved card.
     */
    public abstract void setNewCard(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection.New.Card p0);
    
    public abstract void onFatal(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCtaEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<com.stripe.android.paymentsheet.model.FragmentConfig>> getFragmentConfigEvent() {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.model.FragmentConfig createFragmentConfig() {
        return null;
    }
    
    public void transitionTo(TransitionTargetType target) {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    public final void setStripeIntent(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeIntent stripeIntent) {
    }
    
    private final void warnUnactivatedIfNeeded(java.util.List<java.lang.String> unactivatedPaymentMethodTypes) {
    }
    
    public final void updateSelection(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection selection) {
    }
    
    public final void setEditing(boolean isEditing) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removePaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
        return null;
    }
    
    public abstract void onUserCancel();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "paymentsheet_debug"})
    public static final class UserErrorMessage {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public UserErrorMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    /**
     * Used as a wrapper for data that is exposed via a LiveData that represents an event.
     * From https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150
     * TODO(brnunes): Migrate to Flows once stable: https://medium.com/androiddevelopers/a-safer-way-to-collect-flows-from-android-uis-23080b1f8bda
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\r\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\fR\u0010\u0010\u0003\u001a\u00028\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "paymentsheet_debug"})
    public static final class Event<T extends java.lang.Object> {
        private final T content = null;
        private boolean hasBeenHandled = false;
        
        public Event(T content) {
            super();
        }
        
        public final boolean getHasBeenHandled() {
            return false;
        }
        
        /**
         * Returns the content and prevents its use again.
         */
        @org.jetbrains.annotations.Nullable()
        public final T getContentIfNotHandled() {
            return null;
        }
        
        /**
         * Returns the content, even if it's already been handled.
         */
        @org.jetbrains.annotations.TestOnly()
        public final T peekContent() {
            return null;
        }
    }
}