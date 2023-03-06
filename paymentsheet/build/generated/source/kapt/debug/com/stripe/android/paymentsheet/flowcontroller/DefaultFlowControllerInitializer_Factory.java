package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
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
public final class DefaultFlowControllerInitializer_Factory implements Factory<DefaultFlowControllerInitializer> {
  private final Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;

  private final Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;

  private final Provider<StripeIntentRepository> stripeIntentRepositoryProvider;

  private final Provider<StripeIntentValidator> stripeIntentValidatorProvider;

  private final Provider<CustomerRepository> customerRepositoryProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public DefaultFlowControllerInitializer_Factory(
      Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider,
      Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider,
      Provider<StripeIntentRepository> stripeIntentRepositoryProvider,
      Provider<StripeIntentValidator> stripeIntentValidatorProvider,
      Provider<CustomerRepository> customerRepositoryProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.prefsRepositoryFactoryProvider = prefsRepositoryFactoryProvider;
    this.googlePayRepositoryFactoryProvider = googlePayRepositoryFactoryProvider;
    this.stripeIntentRepositoryProvider = stripeIntentRepositoryProvider;
    this.stripeIntentValidatorProvider = stripeIntentValidatorProvider;
    this.customerRepositoryProvider = customerRepositoryProvider;
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public DefaultFlowControllerInitializer get() {
    return newInstance(prefsRepositoryFactoryProvider.get(), googlePayRepositoryFactoryProvider.get(), stripeIntentRepositoryProvider.get(), stripeIntentValidatorProvider.get(), customerRepositoryProvider.get(), loggerProvider.get(), workContextProvider.get());
  }

  public static DefaultFlowControllerInitializer_Factory create(
      Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider,
      Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider,
      Provider<StripeIntentRepository> stripeIntentRepositoryProvider,
      Provider<StripeIntentValidator> stripeIntentValidatorProvider,
      Provider<CustomerRepository> customerRepositoryProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new DefaultFlowControllerInitializer_Factory(prefsRepositoryFactoryProvider, googlePayRepositoryFactoryProvider, stripeIntentRepositoryProvider, stripeIntentValidatorProvider, customerRepositoryProvider, loggerProvider, workContextProvider);
  }

  public static DefaultFlowControllerInitializer newInstance(
      Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory,
      Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory,
      StripeIntentRepository stripeIntentRepository, StripeIntentValidator stripeIntentValidator,
      CustomerRepository customerRepository, Logger logger, CoroutineContext workContext) {
    return new DefaultFlowControllerInitializer(prefsRepositoryFactory, googlePayRepositoryFactory, stripeIntentRepository, stripeIntentValidator, customerRepository, logger, workContext);
  }
}
