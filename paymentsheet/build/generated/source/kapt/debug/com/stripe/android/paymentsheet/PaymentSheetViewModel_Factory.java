package com.stripe.android.paymentsheet;

import android.app.Application;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.elements.ResourceRepository;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
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
public final class PaymentSheetViewModel_Factory implements Factory<PaymentSheetViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<PaymentSheetContract.Args> argsProvider;

  private final Provider<EventReporter> eventReporterProvider;

  private final Provider<PaymentConfiguration> paymentConfigProvider;

  private final Provider<StripeIntentRepository> stripeIntentRepositoryProvider;

  private final Provider<StripeIntentValidator> stripeIntentValidatorProvider;

  private final Provider<CustomerRepository> customerRepositoryProvider;

  private final Provider<PrefsRepository> prefsRepositoryProvider;

  private final Provider<ResourceRepository> resourceRepositoryProvider;

  private final Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider;

  private final Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<String> injectorKeyProvider;

  public PaymentSheetViewModel_Factory(Provider<Application> applicationProvider,
      Provider<PaymentSheetContract.Args> argsProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<PaymentConfiguration> paymentConfigProvider,
      Provider<StripeIntentRepository> stripeIntentRepositoryProvider,
      Provider<StripeIntentValidator> stripeIntentValidatorProvider,
      Provider<CustomerRepository> customerRepositoryProvider,
      Provider<PrefsRepository> prefsRepositoryProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider,
      Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider,
      Provider<Logger> loggerProvider, Provider<CoroutineContext> workContextProvider,
      Provider<String> injectorKeyProvider) {
    this.applicationProvider = applicationProvider;
    this.argsProvider = argsProvider;
    this.eventReporterProvider = eventReporterProvider;
    this.paymentConfigProvider = paymentConfigProvider;
    this.stripeIntentRepositoryProvider = stripeIntentRepositoryProvider;
    this.stripeIntentValidatorProvider = stripeIntentValidatorProvider;
    this.customerRepositoryProvider = customerRepositoryProvider;
    this.prefsRepositoryProvider = prefsRepositoryProvider;
    this.resourceRepositoryProvider = resourceRepositoryProvider;
    this.paymentLauncherFactoryProvider = paymentLauncherFactoryProvider;
    this.googlePayPaymentMethodLauncherFactoryProvider = googlePayPaymentMethodLauncherFactoryProvider;
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
    this.injectorKeyProvider = injectorKeyProvider;
  }

  @Override
  public PaymentSheetViewModel get() {
    return newInstance(applicationProvider.get(), argsProvider.get(), eventReporterProvider.get(), DoubleCheck.lazy(paymentConfigProvider), stripeIntentRepositoryProvider.get(), stripeIntentValidatorProvider.get(), customerRepositoryProvider.get(), prefsRepositoryProvider.get(), resourceRepositoryProvider.get(), paymentLauncherFactoryProvider.get(), googlePayPaymentMethodLauncherFactoryProvider.get(), loggerProvider.get(), workContextProvider.get(), injectorKeyProvider.get());
  }

  public static PaymentSheetViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<PaymentSheetContract.Args> argsProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<PaymentConfiguration> paymentConfigProvider,
      Provider<StripeIntentRepository> stripeIntentRepositoryProvider,
      Provider<StripeIntentValidator> stripeIntentValidatorProvider,
      Provider<CustomerRepository> customerRepositoryProvider,
      Provider<PrefsRepository> prefsRepositoryProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<StripePaymentLauncherAssistedFactory> paymentLauncherFactoryProvider,
      Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider,
      Provider<Logger> loggerProvider, Provider<CoroutineContext> workContextProvider,
      Provider<String> injectorKeyProvider) {
    return new PaymentSheetViewModel_Factory(applicationProvider, argsProvider, eventReporterProvider, paymentConfigProvider, stripeIntentRepositoryProvider, stripeIntentValidatorProvider, customerRepositoryProvider, prefsRepositoryProvider, resourceRepositoryProvider, paymentLauncherFactoryProvider, googlePayPaymentMethodLauncherFactoryProvider, loggerProvider, workContextProvider, injectorKeyProvider);
  }

  public static PaymentSheetViewModel newInstance(Application application,
      PaymentSheetContract.Args args, EventReporter eventReporter,
      Lazy<PaymentConfiguration> lazyPaymentConfig, StripeIntentRepository stripeIntentRepository,
      StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository,
      PrefsRepository prefsRepository, ResourceRepository resourceRepository,
      StripePaymentLauncherAssistedFactory paymentLauncherFactory,
      GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, Logger logger,
      CoroutineContext workContext, String injectorKey) {
    return new PaymentSheetViewModel(application, args, eventReporter, lazyPaymentConfig, stripeIntentRepository, stripeIntentValidator, customerRepository, prefsRepository, resourceRepository, paymentLauncherFactory, googlePayPaymentMethodLauncherFactory, logger, workContext, injectorKey);
  }
}
