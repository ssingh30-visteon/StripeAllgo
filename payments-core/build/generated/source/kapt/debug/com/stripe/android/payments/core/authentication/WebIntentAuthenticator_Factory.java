package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebIntentAuthenticator_Factory implements Factory<WebIntentAuthenticator> {
  private final Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  public WebIntentAuthenticator_Factory(
      Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<Function0<String>> publishableKeyProvider) {
    this.paymentBrowserAuthStarterFactoryProvider = paymentBrowserAuthStarterFactoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.uiContextProvider = uiContextProvider;
    this.threeDs1IntentReturnUrlMapProvider = threeDs1IntentReturnUrlMapProvider;
    this.publishableKeyProvider = publishableKeyProvider;
  }

  @Override
  public WebIntentAuthenticator get() {
    return newInstance(paymentBrowserAuthStarterFactoryProvider.get(), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), enableLoggingProvider.get(), uiContextProvider.get(), threeDs1IntentReturnUrlMapProvider.get(), publishableKeyProvider.get());
  }

  public static WebIntentAuthenticator_Factory create(
      Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<Function0<String>> publishableKeyProvider) {
    return new WebIntentAuthenticator_Factory(paymentBrowserAuthStarterFactoryProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, enableLoggingProvider, uiContextProvider, threeDs1IntentReturnUrlMapProvider, publishableKeyProvider);
  }

  public static WebIntentAuthenticator newInstance(
      Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory,
      AnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging,
      CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap,
      Function0<String> publishableKeyProvider) {
    return new WebIntentAuthenticator(paymentBrowserAuthStarterFactory, analyticsRequestExecutor, paymentAnalyticsRequestFactory, enableLogging, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider);
  }
}
