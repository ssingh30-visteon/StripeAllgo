package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Locale;
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
public final class StripeIntentRepository_Api_Factory implements Factory<StripeIntentRepository.Api> {
  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<PaymentConfiguration> paymentConfigProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<Locale> localeProvider;

  public StripeIntentRepository_Api_Factory(Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigProvider,
      Provider<CoroutineContext> workContextProvider, Provider<Locale> localeProvider) {
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.paymentConfigProvider = paymentConfigProvider;
    this.workContextProvider = workContextProvider;
    this.localeProvider = localeProvider;
  }

  @Override
  public StripeIntentRepository.Api get() {
    return newInstance(stripeRepositoryProvider.get(), DoubleCheck.lazy(paymentConfigProvider), workContextProvider.get(), localeProvider.get());
  }

  public static StripeIntentRepository_Api_Factory create(
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentConfiguration> paymentConfigProvider,
      Provider<CoroutineContext> workContextProvider, Provider<Locale> localeProvider) {
    return new StripeIntentRepository_Api_Factory(stripeRepositoryProvider, paymentConfigProvider, workContextProvider, localeProvider);
  }

  public static StripeIntentRepository.Api newInstance(StripeRepository stripeRepository,
      Lazy<PaymentConfiguration> lazyPaymentConfig, CoroutineContext workContext, Locale locale) {
    return new StripeIntentRepository.Api(stripeRepository, lazyPaymentConfig, workContext, locale);
  }
}
