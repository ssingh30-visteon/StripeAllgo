package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0095\u0001\u0096\u0001\u0097\u0001B\u0081\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u000e\u0010i\u001a\u00020j2\u0006\u00106\u001a\u000207J\u0012\u0010k\u001a\u00020j2\b\u0010l\u001a\u0004\u0018\u00010RH\u0002J\u000e\u0010m\u001a\u00020j2\u0006\u0010n\u001a\u00020/J\u001d\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010p2\u0006\u00106\u001a\u000207H\u0000\u00a2\u0006\u0002\bqJ\r\u0010r\u001a\u00020jH\u0000\u00a2\u0006\u0002\bsJ\u0010\u0010t\u001a\u00020j2\u0006\u0010u\u001a\u00020vH\u0016J\u0015\u0010w\u001a\u00020j2\u0006\u0010x\u001a\u00020yH\u0000\u00a2\u0006\u0002\bzJ\u0010\u0010{\u001a\u00020j2\u0006\u0010|\u001a\u00020}H\u0007J\u0011\u0010~\u001a\u00020j2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J\t\u0010\u0081\u0001\u001a\u00020jH\u0016J\u001a\u0010\u0082\u0001\u001a\u00020j2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020}H\u0002J\u0011\u0010\u0083\u0001\u001a\u00020j2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u001d\u0010\u0086\u0001\u001a\u00020j2\f\b\u0001\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0002\u00a2\u0006\u0003\u0010\u0089\u0001J\u0016\u0010\u0086\u0001\u001a\u00020j2\u000b\b\u0002\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010\u008b\u0001\u001a\u00020j2\u0007\u0010\u008c\u0001\u001a\u00020#J\"\u0010\u008d\u0001\u001a\u00020j2\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u000f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001J\u0007\u0010\u0093\u0001\u001a\u00020jJ\u0012\u0010\u0094\u0001\u001a\u00020j2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007R*\u0010!\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b\'\u0010(R\"\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\"8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u00100\u001a\b\u0012\u0004\u0012\u0002010\"8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020/0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020#0?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010C8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bD\u0010&\u001a\u0004\bE\u0010FR&\u0010G\u001a\u0004\u0018\u00010H8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bI\u0010&\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010N\u001a\u00020#8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bO\u0010PR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010W\u001a\u0004\u0018\u00010XX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020*0?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010AR \u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u0002010?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010A\u00a8\u0006\u0098\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "lazyPaymentConfig", "Ldagger/Lazy;", "Lcom/stripe/android/PaymentConfiguration;", "stripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "prefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "resourceRepository", "Lcom/stripe/android/paymentsheet/elements/ResourceRepository;", "paymentLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "injectorKey", "", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/paymentsheet/elements/ResourceRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "_contentVisible", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "get_contentVisible$paymentsheet_debug$annotations", "()V", "get_contentVisible$paymentsheet_debug", "()Landroidx/lifecycle/MutableLiveData;", "_paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "get_paymentSheetResult$paymentsheet_debug$annotations", "get_paymentSheetResult$paymentsheet_debug", "_startConfirm", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "_viewState", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "get_viewState$paymentsheet_debug$annotations", "get_viewState$paymentsheet_debug", "getArgs$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "checkoutIdentifier", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "getCheckoutIdentifier$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "setCheckoutIdentifier$paymentsheet_debug", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V", "confirmParamsFactory", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "contentVisible", "Landroidx/lifecycle/LiveData;", "getContentVisible$paymentsheet_debug", "()Landroidx/lifecycle/LiveData;", "googlePayLauncherConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getGooglePayLauncherConfig$paymentsheet_debug$annotations", "getGooglePayLauncherConfig$paymentsheet_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "googlePayPaymentMethodLauncher", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "getGooglePayPaymentMethodLauncher$paymentsheet_debug$annotations", "getGooglePayPaymentMethodLauncher$paymentsheet_debug", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "setGooglePayPaymentMethodLauncher$paymentsheet_debug", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;)V", "isProcessingPaymentIntent", "isProcessingPaymentIntent$paymentsheet_debug", "()Z", "lastSelectedPaymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getLastSelectedPaymentMethod$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setLastSelectedPaymentMethod$paymentsheet_debug", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "getPaymentLauncher$paymentsheet_debug", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "setPaymentLauncher$paymentsheet_debug", "(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;)V", "paymentSheetResult", "getPaymentSheetResult$paymentsheet_debug", "startConfirm", "getStartConfirm$paymentsheet_debug", "viewState", "getViewState$paymentsheet_debug", "checkout", "", "confirmPaymentSelection", "paymentSelection", "confirmStripeIntent", "confirmStripeIntentParams", "getButtonStateObservable", "Landroidx/lifecycle/MediatorLiveData;", "getButtonStateObservable$paymentsheet_debug", "maybeFetchStripeIntent", "maybeFetchStripeIntent$paymentsheet_debug", "onFatal", "throwable", "", "onGooglePayResult", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "onGooglePayResult$paymentsheet_debug", "onPaymentResult", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "onStripeIntentFetchResponse", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "onUserCancel", "processPayment", "registerFromActivity", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "resetViewState", "stringResId", "", "(Ljava/lang/Integer;)V", "userErrorMessage", "setContentVisible", "visible", "setupGooglePay", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "unregisterFromActivity", "updatePaymentMethods", "CheckoutIdentifier", "Factory", "TransitionTarget", "paymentsheet_debug"})
public final class PaymentSheetViewModel extends com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget> {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.PaymentSheetContract.Args args = null;
    private final dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig = null;
    private final com.stripe.android.paymentsheet.repositories.StripeIntentRepository stripeIntentRepository = null;
    private final com.stripe.android.paymentsheet.model.StripeIntentValidator stripeIntentValidator = null;
    private final com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory paymentLauncherFactory = null;
    private final com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory = null;
    private final com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory<com.stripe.android.model.ConfirmStripeIntentParams> confirmParamsFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.PaymentSheetResult> _paymentSheetResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.PaymentSheetResult> paymentSheetResult = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<com.stripe.android.model.ConfirmStripeIntentParams>> _startConfirm = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<com.stripe.android.model.ConfirmStripeIntentParams>> startConfirm = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.PaymentSheetViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.PaymentSheetViewState> viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _contentVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> contentVisible = null;
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier checkoutIdentifier = com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier.SheetBottomBuy;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.paymentsheet.model.PaymentSelection lastSelectedPaymentMethod;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.paymentsheet.model.PaymentSelection.New.Card newCard;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config googlePayLauncherConfig = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.payments.paymentlauncher.PaymentLauncher paymentLauncher;
    
    @javax.inject.Inject()
    public PaymentSheetViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.StripeIntentRepository stripeIntentRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.StripeIntentValidator stripeIntentValidator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PrefsRepository prefsRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.ResourceRepository resourceRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory paymentLauncherFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey) {
        super(null, null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.PaymentSheetContract.Args getArgs$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.PaymentSheetResult> get_paymentSheetResult$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_paymentSheetResult$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.PaymentSheetResult> getPaymentSheetResult$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.Event<com.stripe.android.model.ConfirmStripeIntentParams>> getStartConfirm$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.model.PaymentSheetViewState> get_viewState$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_viewState$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.model.PaymentSheetViewState> getViewState$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_contentVisible$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_contentVisible$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getContentVisible$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier getCheckoutIdentifier$paymentsheet_debug() {
        return null;
    }
    
    public final void setCheckoutIdentifier$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.stripe.android.paymentsheet.model.PaymentSheetViewState> getButtonStateObservable$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier checkoutIdentifier) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.model.PaymentSelection getLastSelectedPaymentMethod$paymentsheet_debug() {
        return null;
    }
    
    public final void setLastSelectedPaymentMethod$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection p0) {
    }
    
    public final boolean isProcessingPaymentIntent$paymentsheet_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.model.PaymentSelection.New.Card getNewCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setNewCard(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection.New.Card p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher getGooglePayPaymentMethodLauncher$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getGooglePayPaymentMethodLauncher$paymentsheet_debug$annotations() {
    }
    
    public final void setGooglePayPaymentMethodLauncher$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config getGooglePayLauncherConfig$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getGooglePayLauncherConfig$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.payments.paymentlauncher.PaymentLauncher getPaymentLauncher$paymentsheet_debug() {
        return null;
    }
    
    public final void setPaymentLauncher$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.payments.paymentlauncher.PaymentLauncher p0) {
    }
    
    public final void setupGooglePay(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher) {
    }
    
    /**
     * Fetch the [StripeIntent] for the client secret received in the initialization arguments, if
     * not fetched yet. If successful, continues through validation and fetching the saved payment
     * methods for the customer.
     */
    public final void maybeFetchStripeIntent$paymentsheet_debug() {
    }
    
    private final void onStripeIntentFetchResponse(com.stripe.android.model.StripeIntent stripeIntent) {
    }
    
    /**
     * Fetch the saved payment methods for the customer, if a [PaymentSheet.CustomerConfiguration]
     * was provided.
     * It will fetch only the payment method types as defined in [SupportedPaymentMethod.getSupportedSavedCustomerPMs].
     */
    @androidx.annotation.VisibleForTesting()
    public final void updatePaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent) {
    }
    
    private final void resetViewState(@androidx.annotation.IntegerRes()
    java.lang.Integer stringResId) {
    }
    
    private final void resetViewState(java.lang.String userErrorMessage) {
    }
    
    public final void checkout(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier checkoutIdentifier) {
    }
    
    public final void confirmStripeIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams) {
    }
    
    public final void registerFromActivity(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller) {
    }
    
    public final void unregisterFromActivity() {
    }
    
    public final void setContentVisible(boolean visible) {
    }
    
    private final void confirmPaymentSelection(com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onPaymentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.paymentlauncher.PaymentResult paymentResult) {
    }
    
    private final void processPayment(com.stripe.android.model.StripeIntent stripeIntent, com.stripe.android.payments.paymentlauncher.PaymentResult paymentResult) {
    }
    
    public final void onGooglePayResult$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result result) {
    }
    
    @java.lang.Override()
    public void onFatal(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onUserCancel() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "", "()V", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "AddPaymentMethodFull", "AddPaymentMethodSheet", "SelectSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodSheet;", "paymentsheet_debug"})
    public static abstract class TransitionTarget {
        
        private TransitionTarget() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig();
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class SelectSavedPaymentMethod extends com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget.SelectSavedPaymentMethod copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
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
            
            public SelectSavedPaymentMethod(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class AddPaymentMethodFull extends com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget.AddPaymentMethodFull copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
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
            
            public AddPaymentMethodFull(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget$AddPaymentMethodSheet;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class AddPaymentMethodSheet extends com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget.AddPaymentMethodSheet copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
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
            
            public AddPaymentMethodSheet(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0011\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012*\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory$FallbackInitializeParam;", "applicationSupplier", "Lkotlin/Function0;", "Landroid/app/Application;", "starterArgsSupplier", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "subComponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;", "getSubComponentBuilderProvider", "()Ljavax/inject/Provider;", "setSubComponentBuilderProvider", "(Ljavax/inject/Provider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInitializeParam", "paymentsheet_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory, com.stripe.android.payments.core.injection.Injectable<com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.FallbackInitializeParam> {
        private final kotlin.jvm.functions.Function0<android.app.Application> applicationSupplier = null;
        private final kotlin.jvm.functions.Function0<com.stripe.android.paymentsheet.PaymentSheetContract.Args> starterArgsSupplier = null;
        @javax.inject.Inject()
        public javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends android.app.Application> applicationSupplier, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<com.stripe.android.paymentsheet.PaymentSheetContract.Args> starterArgsSupplier) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            return null;
        }
        
        public final void setSubComponentBuilderProvider(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder> p0) {
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @java.lang.Override()
        public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.FallbackInitializeParam arg) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class FallbackInitializeParam {
            @org.jetbrains.annotations.NotNull()
            private final android.app.Application application = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.FallbackInitializeParam copy(@org.jetbrains.annotations.NotNull()
            android.app.Application application) {
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
            
            public FallbackInitializeParam(@org.jetbrains.annotations.NotNull()
            android.app.Application application) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application getApplication() {
                return null;
            }
        }
    }
    
    /**
     * This is the identifier of the caller of the [checkout] function.  It is used in
     * the observables of [viewState] to get state events related to it.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "", "(Ljava/lang/String;I)V", "AddFragmentTopGooglePay", "SheetBottomGooglePay", "SheetBottomBuy", "None", "paymentsheet_debug"})
    public static enum CheckoutIdentifier {
        /*public static final*/ AddFragmentTopGooglePay /* = new AddFragmentTopGooglePay() */,
        /*public static final*/ SheetBottomGooglePay /* = new SheetBottomGooglePay() */,
        /*public static final*/ SheetBottomBuy /* = new SheetBottomBuy() */,
        /*public static final*/ None /* = new None() */;
        
        CheckoutIdentifier() {
        }
    }
}