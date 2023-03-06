package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentLauncherViewModel_Factory implements Factory<PaymentLauncherViewModel> {
  private final Provider<Boolean> isPaymentIntentProvider;

  private final Provider<StripeRepository> stripeApiRepositoryProvider;

  private final Provider<PaymentAuthenticatorRegistry> authenticatorRegistryProvider;

  private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;

  private final Provider<ApiRequest.Options> apiRequestOptionsProvider;

  private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;

  private final Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;

  private final Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;

  private final Provider<DefaultAnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<AuthActivityStarterHost> authActivityStarterHostProvider;

  private final Provider<ActivityResultCaller> activityResultCallerProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public PaymentLauncherViewModel_Factory(Provider<Boolean> isPaymentIntentProvider,
      Provider<StripeRepository> stripeApiRepositoryProvider,
      Provider<PaymentAuthenticatorRegistry> authenticatorRegistryProvider,
      Provider<DefaultReturnUrl> defaultReturnUrlProvider,
      Provider<ApiRequest.Options> apiRequestOptionsProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider,
      Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider,
      Provider<DefaultAnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<CoroutineContext> uiContextProvider,
      Provider<AuthActivityStarterHost> authActivityStarterHostProvider,
      Provider<ActivityResultCaller> activityResultCallerProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.isPaymentIntentProvider = isPaymentIntentProvider;
    this.stripeApiRepositoryProvider = stripeApiRepositoryProvider;
    this.authenticatorRegistryProvider = authenticatorRegistryProvider;
    this.defaultReturnUrlProvider = defaultReturnUrlProvider;
    this.apiRequestOptionsProvider = apiRequestOptionsProvider;
    this.threeDs1IntentReturnUrlMapProvider = threeDs1IntentReturnUrlMapProvider;
    this.paymentIntentFlowResultProcessorProvider = paymentIntentFlowResultProcessorProvider;
    this.setupIntentFlowResultProcessorProvider = setupIntentFlowResultProcessorProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.uiContextProvider = uiContextProvider;
    this.authActivityStarterHostProvider = authActivityStarterHostProvider;
    this.activityResultCallerProvider = activityResultCallerProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public PaymentLauncherViewModel get() {
    return newInstance(isPaymentIntentProvider.get(), stripeApiRepositoryProvider.get(), authenticatorRegistryProvider.get(), defaultReturnUrlProvider.get(), apiRequestOptionsProvider, threeDs1IntentReturnUrlMapProvider.get(), DoubleCheck.lazy(paymentIntentFlowResultProcessorProvider), DoubleCheck.lazy(setupIntentFlowResultProcessorProvider), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), uiContextProvider.get(), authActivityStarterHostProvider.get(), activityResultCallerProvider.get(), savedStateHandleProvider.get());
  }

  public static PaymentLauncherViewModel_Factory create(Provider<Boolean> isPaymentIntentProvider,
      Provider<StripeRepository> stripeApiRepositoryProvider,
      Provider<PaymentAuthenticatorRegistry> authenticatorRegistryProvider,
      Provider<DefaultReturnUrl> defaultReturnUrlProvider,
      Provider<ApiRequest.Options> apiRequestOptionsProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider,
      Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider,
      Provider<DefaultAnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<CoroutineContext> uiContextProvider,
      Provider<AuthActivityStarterHost> authActivityStarterHostProvider,
      Provider<ActivityResultCaller> activityResultCallerProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new PaymentLauncherViewModel_Factory(isPaymentIntentProvider, stripeApiRepositoryProvider, authenticatorRegistryProvider, defaultReturnUrlProvider, apiRequestOptionsProvider, threeDs1IntentReturnUrlMapProvider, paymentIntentFlowResultProcessorProvider, setupIntentFlowResultProcessorProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, uiContextProvider, authActivityStarterHostProvider, activityResultCallerProvider, savedStateHandleProvider);
  }

  public static PaymentLauncherViewModel newInstance(boolean isPaymentIntent,
      StripeRepository stripeApiRepository, PaymentAuthenticatorRegistry authenticatorRegistry,
      DefaultReturnUrl defaultReturnUrl, Provider<ApiRequest.Options> apiRequestOptionsProvider,
      Map<String, String> threeDs1IntentReturnUrlMap,
      Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor,
      Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor,
      DefaultAnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext uiContext,
      AuthActivityStarterHost authActivityStarterHost, ActivityResultCaller activityResultCaller,
      SavedStateHandle savedStateHandle) {
    return new PaymentLauncherViewModel(isPaymentIntent, stripeApiRepository, authenticatorRegistry, defaultReturnUrl, apiRequestOptionsProvider, threeDs1IntentReturnUrlMap, lazyPaymentIntentFlowResultProcessor, lazySetupIntentFlowResultProcessor, analyticsRequestExecutor, paymentAnalyticsRequestFactory, uiContext, authActivityStarterHost, activityResultCaller, savedStateHandle);
  }
}
