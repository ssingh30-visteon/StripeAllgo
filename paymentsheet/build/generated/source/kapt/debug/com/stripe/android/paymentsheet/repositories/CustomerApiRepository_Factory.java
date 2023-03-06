package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
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
public final class CustomerApiRepository_Factory implements Factory<CustomerApiRepository> {
  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<PaymentConfiguration> paymentConfigProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<Set<String>> productUsageTokensProvider;

  public CustomerApiRepository_Factory(Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<Set<String>> productUsageTokensProvider) {
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.paymentConfigProvider = paymentConfigProvider;
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
    this.productUsageTokensProvider = productUsageTokensProvider;
  }

  @Override
  public CustomerApiRepository get() {
    return newInstance(stripeRepositoryProvider.get(), DoubleCheck.lazy(paymentConfigProvider), loggerProvider.get(), workContextProvider.get(), productUsageTokensProvider.get());
  }

  public static CustomerApiRepository_Factory create(
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<Set<String>> productUsageTokensProvider) {
    return new CustomerApiRepository_Factory(stripeRepositoryProvider, paymentConfigProvider, loggerProvider, workContextProvider, productUsageTokensProvider);
  }

  public static CustomerApiRepository newInstance(StripeRepository stripeRepository,
      Lazy<PaymentConfiguration> lazyPaymentConfig, Logger logger, CoroutineContext workContext,
      Set<String> productUsageTokens) {
    return new CustomerApiRepository(stripeRepository, lazyPaymentConfig, logger, workContext, productUsageTokens);
  }
}
