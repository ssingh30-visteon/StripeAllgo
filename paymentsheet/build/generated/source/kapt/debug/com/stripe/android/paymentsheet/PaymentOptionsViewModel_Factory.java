package com.stripe.android.paymentsheet;

import android.app.Application;
import com.stripe.android.Logger;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
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
public final class PaymentOptionsViewModel_Factory implements Factory<PaymentOptionsViewModel> {
  private final Provider<PaymentOptionContract.Args> argsProvider;

  private final Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;

  private final Provider<EventReporter> eventReporterProvider;

  private final Provider<CustomerRepository> customerRepositoryProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<String> injectorKeyProvider;

  public PaymentOptionsViewModel_Factory(Provider<PaymentOptionContract.Args> argsProvider,
      Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<CustomerRepository> customerRepositoryProvider,
      Provider<CoroutineContext> workContextProvider, Provider<Application> applicationProvider,
      Provider<Logger> loggerProvider, Provider<String> injectorKeyProvider) {
    this.argsProvider = argsProvider;
    this.prefsRepositoryFactoryProvider = prefsRepositoryFactoryProvider;
    this.eventReporterProvider = eventReporterProvider;
    this.customerRepositoryProvider = customerRepositoryProvider;
    this.workContextProvider = workContextProvider;
    this.applicationProvider = applicationProvider;
    this.loggerProvider = loggerProvider;
    this.injectorKeyProvider = injectorKeyProvider;
  }

  @Override
  public PaymentOptionsViewModel get() {
    return newInstance(argsProvider.get(), prefsRepositoryFactoryProvider.get(), eventReporterProvider.get(), customerRepositoryProvider.get(), workContextProvider.get(), applicationProvider.get(), loggerProvider.get(), injectorKeyProvider.get());
  }

  public static PaymentOptionsViewModel_Factory create(
      Provider<PaymentOptionContract.Args> argsProvider,
      Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider,
      Provider<EventReporter> eventReporterProvider,
      Provider<CustomerRepository> customerRepositoryProvider,
      Provider<CoroutineContext> workContextProvider, Provider<Application> applicationProvider,
      Provider<Logger> loggerProvider, Provider<String> injectorKeyProvider) {
    return new PaymentOptionsViewModel_Factory(argsProvider, prefsRepositoryFactoryProvider, eventReporterProvider, customerRepositoryProvider, workContextProvider, applicationProvider, loggerProvider, injectorKeyProvider);
  }

  public static PaymentOptionsViewModel newInstance(PaymentOptionContract.Args args,
      Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory,
      EventReporter eventReporter, CustomerRepository customerRepository,
      CoroutineContext workContext, Application application, Logger logger, String injectorKey) {
    return new PaymentOptionsViewModel(args, prefsRepositoryFactory, eventReporter, customerRepository, workContext, application, logger, injectorKey);
  }
}
