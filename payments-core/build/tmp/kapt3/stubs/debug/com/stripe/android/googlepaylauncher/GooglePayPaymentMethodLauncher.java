package com.stripe.android.googlepaylauncher;

import java.lang.System;

/**
 * A drop-in class that presents a Google Pay sheet to collect a customer's payment details.
 * When successful, will return a [PaymentMethod] via [Result.Completed.paymentMethod].
 *
 * Use [GooglePayPaymentMethodLauncher] for Jetpack Compose integrations.
 *
 * See the [Google Pay integration guide](https://stripe.com/docs/google-pay) for more details.
 */
@kotlin.jvm.JvmSuppressWildcards()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 >2\u00020\u0001:\u0007=>?@ABCB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\'\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\rB7\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0014B\u00bf\u0001\b\u0001\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\"\u0012\b\b\u0003\u0010$\u001a\u00020\u0019\u0012\b\b\u0003\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010\'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020,\u00a2\u0006\u0002\u0010-J&\u00107\u001a\u0002082\u0006\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 H\u0007R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\u00020 8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b1\u00102R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "", "activity", "Landroidx/activity/ComponentActivity;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "resultCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "context", "Landroid/content/Context;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/result/ActivityResultCaller;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "skipReadyCheck", "", "googlePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "enableLogging", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Landroidx/activity/result/ActivityResultLauncher;ZLandroid/content/Context;Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;)V", "injector", "Lcom/stripe/android/payments/core/injection/Injector;", "injectorKey", "getInjectorKey$annotations", "()V", "isReady", "launcherComponent", "error/NonExistentClass", "Lerror/NonExistentClass;", "present", "", "currencyCode", "amount", "", "transactionId", "BillingAddressConfig", "Companion", "Config", "ErrorCode", "ReadyCallback", "Result", "ResultCallback", "payments-core_debug"})
public final class GooglePayPaymentMethodLauncher {
    private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config = null;
    private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback = null;
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher = null;
    private final boolean skipReadyCheck = false;
    private final kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory = null;
    private final java.util.Set<java.lang.String> productUsage = null;
    private final kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider = null;
    private final kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider = null;
    private final boolean enableLogging = false;
    private final kotlin.coroutines.CoroutineContext ioContext = null;
    private boolean isReady = false;
    private final error.NonExistentClass launcherComponent = null;
    private final java.lang.String injectorKey = null;
    private final com.stripe.android.payments.core.injection.Injector injector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_USAGE_TOKEN = "GooglePayPaymentMethodLauncher";
    public static final int INTERNAL_ERROR = 1;
    public static final int DEVELOPER_ERROR = 2;
    public static final int NETWORK_ERROR = 3;
    
    @dagger.assisted.AssistedInject()
    public GooglePayPaymentMethodLauncher(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher, @dagger.assisted.Assisted()
    boolean skipReadyCheck, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "stripeAccountId")
    kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider, @javax.inject.Named(value = "enableLogging")
    boolean enableLogging, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext ioContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository) {
        super();
    }
    
    @com.stripe.android.payments.core.injection.InjectorKey()
    @java.lang.Deprecated()
    private static void getInjectorKey$annotations() {
    }
    
    /**
     * Constructor to be used when launching [GooglePayPaymentMethodLauncher] from an Activity.
     * This constructor must be called no later than `Activity#onCreate()`.
     *
     * @param activity the Activity that is launching the [GooglePayPaymentMethodLauncher]
     *
     * @param readyCallback called after determining whether Google Pay is available and ready on
     * the device. [present] may only be called if Google Pay is ready.
     *
     * @param resultCallback called with the result of the [GooglePayPaymentMethodLauncher] operation
     */
    public GooglePayPaymentMethodLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback resultCallback) {
        super();
    }
    
    /**
     * Constructor to be used when launching [GooglePayPaymentMethodLauncher] from a Fragment.
     * This constructor must be called no later than `Fragment#onViewCreated()`.
     *
     * @param fragment the Fragment that is launching the [GooglePayPaymentMethodLauncher]
     *
     * @param readyCallback called after determining whether Google Pay is available and ready on
     * the device. [present] may only be called if Google Pay is ready.
     *
     * @param resultCallback called with the result of the [GooglePayPaymentMethodLauncher] operation
     */
    public GooglePayPaymentMethodLauncher(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback resultCallback) {
        super();
    }
    
    private GooglePayPaymentMethodLauncher(android.content.Context context, kotlinx.coroutines.CoroutineScope lifecycleScope, androidx.activity.result.ActivityResultCaller activityResultCaller, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config config, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ResultCallback resultCallback) {
        super();
    }
    
    /**
     * Present the Google Pay UI.
     *
     * An [IllegalStateException] will be thrown if Google Pay is not available or ready for usage.
     *
     * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
     * @param amount Amount intended to be collected. A positive integer representing how much to
     * charge in the smallest currency unit (e.g., 100 cents to charge $1.00 or 100 to charge ¥100,
     * a zero-decimal currency). If the amount is not yet known, use 0.
     * @param transactionId A unique ID that identifies a transaction attempt. Merchants may use an
     * existing ID or generate a specific one for Google Pay transaction attempts.
     * This field is required when you send callbacks to the Google Transaction Events API.
     */
    @kotlin.jvm.JvmOverloads()
    public final void present(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    /**
     * Present the Google Pay UI.
     *
     * An [IllegalStateException] will be thrown if Google Pay is not available or ready for usage.
     *
     * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
     * @param amount Amount intended to be collected. A positive integer representing how much to
     * charge in the smallest currency unit (e.g., 100 cents to charge $1.00 or 100 to charge ¥100,
     * a zero-decimal currency). If the amount is not yet known, use 0.
     * @param transactionId A unique ID that identifies a transaction attempt. Merchants may use an
     * existing ID or generate a specific one for Google Pay transaction attempts.
     * This field is required when you send callbacks to the Google Transaction Events API.
     */
    @kotlin.jvm.JvmOverloads()
    public final void present(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, int amount) {
    }
    
    /**
     * Present the Google Pay UI.
     *
     * An [IllegalStateException] will be thrown if Google Pay is not available or ready for usage.
     *
     * @param currencyCode ISO 4217 alphabetic currency code. (e.g. "USD", "EUR")
     * @param amount Amount intended to be collected. A positive integer representing how much to
     * charge in the smallest currency unit (e.g., 100 cents to charge $1.00 or 100 to charge ¥100,
     * a zero-decimal currency). If the amount is not yet known, use 0.
     * @param transactionId A unique ID that identifies a transaction attempt. Merchants may use an
     * existing ID or generate a specific one for Google Pay transaction attempts.
     * This field is required when you send callbacks to the Google Transaction Events API.
     */
    @kotlin.jvm.JvmOverloads()
    public final void present(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, int amount, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020%H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "merchantCountryCode", "", "merchantName", "isEmailRequired", "", "billingAddressConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "existingPaymentMethodRequired", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;Z)V", "getBillingAddressConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;)V", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "getExistingPaymentMethodRequired", "()Z", "setExistingPaymentMethodRequired", "(Z)V", "setEmailRequired", "isJcbEnabled", "isJcbEnabled$payments_core_debug", "getMerchantCountryCode", "()Ljava/lang/String;", "getMerchantName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Config implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayEnvironment environment = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String merchantCountryCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String merchantName = null;
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        private boolean isEmailRequired;
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        private com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig;
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        private boolean existingPaymentMethodRequired;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig, boolean existingPaymentMethodRequired) {
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
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, boolean isEmailRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig, boolean existingPaymentMethodRequired) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayEnvironment component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayEnvironment getEnvironment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMerchantCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMerchantName() {
            return null;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final boolean component4() {
            return false;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final boolean isEmailRequired() {
            return false;
        }
        
        /**
         * Flag to indicate whether Google Pay collect the customer's email address.
         *
         * Default to `false`.
         */
        public final void setEmailRequired(boolean p0) {
        }
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig component5() {
            return null;
        }
        
        /**
         * Billing address collection configuration.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig getBillingAddressConfig() {
            return null;
        }
        
        /**
         * Billing address collection configuration.
         */
        public final void setBillingAddressConfig(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig p0) {
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final boolean component6() {
            return false;
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final boolean getExistingPaymentMethodRequired() {
            return false;
        }
        
        /**
         * If `true`, Google Pay is considered ready if the customer's Google Pay wallet
         * has existing payment methods.
         *
         * Default to `true`.
         */
        public final void setExistingPaymentMethodRequired(boolean p0) {
        }
        
        public final boolean isJcbEnabled$payments_core_debug() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired", "(ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;Z)V", "getFormat", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Format", "payments-core_debug"})
    public static final class BillingAddressConfig implements android.os.Parcelable {
        private final boolean isRequired = false;
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format = null;
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        private final boolean isPhoneNumberRequired = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig copy(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format, boolean isPhoneNumberRequired) {
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
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public BillingAddressConfig(boolean isRequired, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format, boolean isPhoneNumberRequired) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isRequired() {
            return false;
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format component2() {
            return null;
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig.Format getFormat() {
            return null;
        }
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        public final boolean component3() {
            return false;
        }
        
        /**
         * Set to true if a phone number is required to process the transaction.
         */
        public final boolean isPhoneNumberRequired() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * Billing address format required to complete the transaction.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Min", "Full", "payments-core_debug"})
        public static enum Format {
            /*public static final*/ Min /* = new Min(null) */,
            /*public static final*/ Full /* = new Full(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            Format(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "Landroid/os/Parcelable;", "()V", "Canceled", "Completed", "Failed", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "payments-core_debug"})
    public static abstract class Result implements android.os.Parcelable {
        
        private Result() {
            super();
        }
        
        /**
         * Represents a successful transaction.
         *
         * @param paymentMethod The resulting payment method.
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Completed extends com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethod paymentMethod = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Completed> CREATOR = null;
            
            /**
             * Represents a successful transaction.
             *
             * @param paymentMethod The resulting payment method.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Completed copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod paymentMethod) {
                return null;
            }
            
            /**
             * Represents a successful transaction.
             *
             * @param paymentMethod The resulting payment method.
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Represents a successful transaction.
             *
             * @param paymentMethod The resulting payment method.
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Represents a successful transaction.
             *
             * @param paymentMethod The resulting payment method.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Completed(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod paymentMethod) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Completed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Completed createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Completed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        /**
         * Represents a failed transaction.
         *
         * @param error The failure reason.
         * @param errorCode The failure [ErrorCode].
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "error", "", "errorCode", "", "(Ljava/lang/Throwable;I)V", "getError", "()Ljava/lang/Throwable;", "getErrorCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Failed extends com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            private final int errorCode = 0;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Failed> CREATOR = null;
            
            /**
             * Represents a failed transaction.
             *
             * @param error The failure reason.
             * @param errorCode The failure [ErrorCode].
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Failed copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error, @com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ErrorCode()
            int errorCode) {
                return null;
            }
            
            /**
             * Represents a failed transaction.
             *
             * @param error The failure reason.
             * @param errorCode The failure [ErrorCode].
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Represents a failed transaction.
             *
             * @param error The failure reason.
             * @param errorCode The failure [ErrorCode].
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Represents a failed transaction.
             *
             * @param error The failure reason.
             * @param errorCode The failure [ErrorCode].
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Failed(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error, @com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ErrorCode()
            int errorCode) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getErrorCode() {
                return 0;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Failed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Failed createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Failed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        /**
         * Represents a transaction that was canceled by the user.
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Canceled extends com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Canceled INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Canceled> CREATOR = null;
            
            private Canceled() {
                super();
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Canceled> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result.Canceled[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "", "onReady", "", "isReady", "", "payments-core_debug"})
    public static abstract interface ReadyCallback {
        
        public abstract void onReady(boolean isReady);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "", "onResult", "", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "payments-core_debug"})
    public static abstract interface ResultCallback {
        
        public abstract void onResult(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result result);
    }
    
    /**
     * Error codes representing the possible error types for [Result.Failed].
     * See the corresponding [Result.Failed.error] message for more details.
     */
    @androidx.annotation.IntDef(value = {1, 2, 3})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ErrorCode;", "", "payments-core_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.TYPE})
    public static abstract @interface ErrorCode {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;", "", "()V", "DEVELOPER_ERROR", "", "INTERNAL_ERROR", "NETWORK_ERROR", "PRODUCT_USAGE_TOKEN", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}