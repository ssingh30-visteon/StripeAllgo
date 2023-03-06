package com.stripe.android.networking;

import android.content.Context;
import com.stripe.android.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StripeApiRepository_Factory implements Factory<StripeApiRepository> {
  private final Provider<Context> appContextProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<Set<String>> productUsageTokensProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<Logger> loggerProvider;

  public StripeApiRepository_Factory(Provider<Context> appContextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<Set<String>> productUsageTokensProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<Logger> loggerProvider) {
    this.appContextProvider = appContextProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.workContextProvider = workContextProvider;
    this.productUsageTokensProvider = productUsageTokensProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public StripeApiRepository get() {
    return newInstance(appContextProvider.get(), publishableKeyProvider.get(), workContextProvider.get(), productUsageTokensProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), analyticsRequestExecutorProvider.get(), loggerProvider.get());
  }

  public static StripeApiRepository_Factory create(Provider<Context> appContextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<Set<String>> productUsageTokensProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<Logger> loggerProvider) {
    return new StripeApiRepository_Factory(appContextProvider, publishableKeyProvider, workContextProvider, productUsageTokensProvider, paymentAnalyticsRequestFactoryProvider, analyticsRequestExecutorProvider, loggerProvider);
  }

  public static StripeApiRepository newInstance(Context appContext,
      Function0<String> publishableKeyProvider, CoroutineContext workContext,
      Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory,
      AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
    return new StripeApiRepository(appContext, publishableKeyProvider, workContext, productUsageTokens, paymentAnalyticsRequestFactory, analyticsRequestExecutor, logger);
  }
}
