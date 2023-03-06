package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class SourceAuthenticator_Factory implements Factory<SourceAuthenticator> {
  private final Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;

  private final Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  public SourceAuthenticator_Factory(
      Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider,
      Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Function0<String>> publishableKeyProvider) {
    this.paymentBrowserAuthStarterFactoryProvider = paymentBrowserAuthStarterFactoryProvider;
    this.paymentRelayStarterFactoryProvider = paymentRelayStarterFactoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.uiContextProvider = uiContextProvider;
    this.publishableKeyProvider = publishableKeyProvider;
  }

  @Override
  public SourceAuthenticator get() {
    return newInstance(paymentBrowserAuthStarterFactoryProvider.get(), paymentRelayStarterFactoryProvider.get(), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), enableLoggingProvider.get(), uiContextProvider.get(), publishableKeyProvider.get());
  }

  public static SourceAuthenticator_Factory create(
      Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider,
      Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Function0<String>> publishableKeyProvider) {
    return new SourceAuthenticator_Factory(paymentBrowserAuthStarterFactoryProvider, paymentRelayStarterFactoryProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, enableLoggingProvider, uiContextProvider, publishableKeyProvider);
  }

  public static SourceAuthenticator newInstance(
      Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory,
      Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory,
      AnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging,
      CoroutineContext uiContext, Function0<String> publishableKeyProvider) {
    return new SourceAuthenticator(paymentBrowserAuthStarterFactory, paymentRelayStarterFactory, analyticsRequestExecutor, paymentAnalyticsRequestFactory, enableLogging, uiContext, publishableKeyProvider);
  }
}
