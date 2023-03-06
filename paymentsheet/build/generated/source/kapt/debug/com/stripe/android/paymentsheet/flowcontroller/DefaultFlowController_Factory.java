package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.elements.ResourceRepository;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DefaultFlowController_Factory implements Factory<DefaultFlowController> {
  private final Provider<CoroutineScope> lifecycleScopeProvider;

  private final Provider<LifecycleOwner> lifecycleOwnerProvider;

  private final Provider<Function0<Integer>> statusBarColorProvider;

  private final Provider<PaymentOptionFactory> paymentOptionFactoryProvider;

  private final Provider<PaymentOptionCallback> paymentOptionCallbackProvider;

  private final Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;

  private final Provider<ActivityResultCaller> activityResultCallerProvider;

  private final Provider<String> injectorKeyProvider;

  private final Provider<FlowControllerInitializer> flowControllerInitializerProvider;

  private final Provider<EventReporter> eventReporterProvider;

  private final Provider<FlowControllerViewModel> viewModelProvider;

  private final Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;

  private final Provider<ResourceRepository> resourceRepositoryProvider;

  private final Provider<PaymentConfiguration> paymentConfigurationProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<Set<String>> productUsageProvider;

  private final Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;

  public DefaultFlowController_Factory(Provider<CoroutineScope> lifecycleScopeProvider,
      Provider<LifecycleOwner> lifecycleOwnerProvider,
      Provider<Function0<Integer>> statusBarColorProvider,
      Provider<PaymentOptionFactory> paymentOptionFactoryProvider,
      Provider<PaymentOptionCallback> paymentOptionCallbackProvider,
      Provider<PaymentSheetResultCallback> paymentResultCallbackProvider,
      Provider<ActivityResultCaller> activityResultCallerProvider,
      Provider<String> injectorKeyProvider,
      Provider<FlowControllerInitializer> flowControllerInitializerProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<FlowControllerViewModel> viewModelProvider,
      Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigurationProvider,
      Provider<CoroutineContext> uiContextProvider, Provider<Boolean> enableLoggingProvider,
      Provider<Set<String>> productUsageProvider,
      Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider) {
    this.lifecycleScopeProvider = lifecycleScopeProvider;
    this.lifecycleOwnerProvider = lifecycleOwnerProvider;
    this.statusBarColorProvider = statusBarColorProvider;
    this.paymentOptionFactoryProvider = paymentOptionFactoryProvider;
    this.paymentOptionCallbackProvider = paymentOptionCallbackProvider;
    this.paymentResultCallbackProvider = paymentResultCallbackProvider;
    this.activityResultCallerProvider = activityResultCallerProvider;
    this.injectorKeyProvider = injectorKeyProvider;
    this.flowControllerInitializerProvider = flowControllerInitializerProvider;
    this.eventReporterProvider = eventReporterProvider;
    this.viewModelProvider = viewModelProvider;
    this.paymentLauncherFactoryProvider = paymentLauncherFactoryProvider;
    this.resourceRepositoryProvider = resourceRepositoryProvider;
    this.paymentConfigurationProvider = paymentConfigurationProvider;
    this.uiContextProvider = uiContextProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.productUsageProvider = productUsageProvider;
    this.googlePayPaymentMethodLauncherFactoryProvider = googlePayPaymentMethodLauncherFactoryProvider;
  }

  @Override
  public DefaultFlowController get() {
    return newInstance(lifecycleScopeProvider.get(), lifecycleOwnerProvider.get(), statusBarColorProvider.get(), paymentOptionFactoryProvider.get(), paymentOptionCallbackProvider.get(), paymentResultCallbackProvider.get(), activityResultCallerProvider.get(), injectorKeyProvider.get(), flowControllerInitializerProvider.get(), eventReporterProvider.get(), viewModelProvider.get(), paymentLauncherFactoryProvider.get(), resourceRepositoryProvider.get(), DoubleCheck.lazy(paymentConfigurationProvider), uiContextProvider.get(), enableLoggingProvider.get(), productUsageProvider.get(), googlePayPaymentMethodLauncherFactoryProvider.get());
  }

  public static DefaultFlowController_Factory create(
      Provider<CoroutineScope> lifecycleScopeProvider,
      Provider<LifecycleOwner> lifecycleOwnerProvider,
      Provider<Function0<Integer>> statusBarColorProvider,
      Provider<PaymentOptionFactory> paymentOptionFactoryProvider,
      Provider<PaymentOptionCallback> paymentOptionCallbackProvider,
      Provider<PaymentSheetResultCallback> paymentResultCallbackProvider,
      Provider<ActivityResultCaller> activityResultCallerProvider,
      Provider<String> injectorKeyProvider,
      Provider<FlowControllerInitializer> flowControllerInitializerProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<FlowControllerViewModel> viewModelProvider,
      Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigurationProvider,
      Provider<CoroutineContext> uiContextProvider, Provider<Boolean> enableLoggingProvider,
      Provider<Set<String>> productUsageProvider,
      Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider) {
    return new DefaultFlowController_Factory(lifecycleScopeProvider, lifecycleOwnerProvider, statusBarColorProvider, paymentOptionFactoryProvider, paymentOptionCallbackProvider, paymentResultCallbackProvider, activityResultCallerProvider, injectorKeyProvider, flowControllerInitializerProvider, eventReporterProvider, viewModelProvider, paymentLauncherFactoryProvider, resourceRepositoryProvider, paymentConfigurationProvider, uiContextProvider, enableLoggingProvider, productUsageProvider, googlePayPaymentMethodLauncherFactoryProvider);
  }

  public static DefaultFlowController newInstance(CoroutineScope lifecycleScope,
      LifecycleOwner lifecycleOwner, Function0<Integer> statusBarColor,
      PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback,
      PaymentSheetResultCallback paymentResultCallback, ActivityResultCaller activityResultCaller,
      String injectorKey, FlowControllerInitializer flowControllerInitializer,
      EventReporter eventReporter, FlowControllerViewModel viewModel,
      StripePaymentLauncherAssistedFactory paymentLauncherFactory,
      ResourceRepository resourceRepository, Lazy<PaymentConfiguration> lazyPaymentConfiguration,
      CoroutineContext uiContext, boolean enableLogging, Set<String> productUsage,
      GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory) {
    return new DefaultFlowController(lifecycleScope, lifecycleOwner, statusBarColor, paymentOptionFactory, paymentOptionCallback, paymentResultCallback, activityResultCaller, injectorKey, flowControllerInitializer, eventReporter, viewModel, paymentLauncherFactory, resourceRepository, lazyPaymentConfiguration, uiContext, enableLogging, productUsage, googlePayPaymentMethodLauncherFactory);
  }
}
