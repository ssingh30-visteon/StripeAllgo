package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DefaultStripe3ds2ChallengeResultProcessor_Factory implements Factory<DefaultStripe3ds2ChallengeResultProcessor> {
  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public DefaultStripe3ds2ChallengeResultProcessor_Factory(
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<RetryDelaySupplier> retryDelaySupplierProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.retryDelaySupplierProvider = retryDelaySupplierProvider;
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public DefaultStripe3ds2ChallengeResultProcessor get() {
    return newInstance(stripeRepositoryProvider.get(), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), retryDelaySupplierProvider.get(), loggerProvider.get(), workContextProvider.get());
  }

  public static DefaultStripe3ds2ChallengeResultProcessor_Factory create(
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<RetryDelaySupplier> retryDelaySupplierProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new DefaultStripe3ds2ChallengeResultProcessor_Factory(stripeRepositoryProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, retryDelaySupplierProvider, loggerProvider, workContextProvider);
  }

  public static DefaultStripe3ds2ChallengeResultProcessor newInstance(
      StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory,
      RetryDelaySupplier retryDelaySupplier, Logger logger, CoroutineContext workContext) {
    return new DefaultStripe3ds2ChallengeResultProcessor(stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, retryDelaySupplier, logger, workContext);
  }
}
