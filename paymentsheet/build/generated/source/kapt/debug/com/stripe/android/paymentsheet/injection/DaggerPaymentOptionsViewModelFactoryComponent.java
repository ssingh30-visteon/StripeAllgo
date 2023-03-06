package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.payments.core.injection.LoggingModule;
import com.stripe.android.payments.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Set;
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
public final class DaggerPaymentOptionsViewModelFactoryComponent implements PaymentOptionsViewModelFactoryComponent {
  private final PaymentOptionsViewModelModule paymentOptionsViewModelModule;

  private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent = this;

  private Provider<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;

  private Provider<Context> contextProvider;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;

  private Provider<EventReporter.Mode> provideEventReporterModeProvider;

  private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;

  private Provider<Boolean> provideEnabledLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<PaymentConfiguration> providePaymentConfigurationProvider;

  private Provider<Function0<String>> providePublishableKeyProvider;

  private Provider<Set<String>> productUsageProvider;

  private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private Provider<DefaultEventReporter> defaultEventReporterProvider;

  private Provider<StripeApiRepository> stripeApiRepositoryProvider;

  private Provider<CustomerApiRepository> customerApiRepositoryProvider;

  private DaggerPaymentOptionsViewModelFactoryComponent(
      PaymentOptionsViewModelModule paymentOptionsViewModelModuleParam,
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Context contextParam, Set<String> productUsageParam) {
    this.paymentOptionsViewModelModule = paymentOptionsViewModelModuleParam;
    initialize(paymentOptionsViewModelModuleParam, coroutineContextModuleParam, loggingModuleParam, contextParam, productUsageParam);

  }

  public static PaymentOptionsViewModelFactoryComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PaymentOptionsViewModelModule paymentOptionsViewModelModuleParam,
      final CoroutineContextModule coroutineContextModuleParam,
      final LoggingModule loggingModuleParam, final Context contextParam,
      final Set<String> productUsageParam) {
    this.paymentOptionsViewModelSubcomponentBuilderProvider = new Provider<PaymentOptionsViewModelSubcomponent.Builder>() {
      @Override
      public PaymentOptionsViewModelSubcomponent.Builder get() {
        return new PaymentOptionsViewModelSubcomponentBuilder(paymentOptionsViewModelFactoryComponent);
      }
    };
    this.contextProvider = InstanceFactory.create(contextParam);
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.providePrefsRepositoryFactoryProvider = DoubleCheck.provider(PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory.create(paymentOptionsViewModelModuleParam, contextProvider, provideWorkContextProvider));
    this.provideEventReporterModeProvider = DoubleCheck.provider(PaymentOptionsViewModelModule_ProvideEventReporterModeFactory.create(paymentOptionsViewModelModuleParam));
    this.defaultDeviceIdRepositoryProvider = DoubleCheck.provider(DefaultDeviceIdRepository_Factory.create(contextProvider, provideWorkContextProvider));
    this.provideEnabledLoggingProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, provideEnabledLoggingProvider));
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, provideWorkContextProvider);
    this.providePaymentConfigurationProvider = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(contextProvider);
    this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(providePaymentConfigurationProvider);
    this.productUsageProvider = InstanceFactory.create(productUsageParam);
    this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(contextProvider, providePublishableKeyProvider, productUsageProvider);
    this.defaultEventReporterProvider = DoubleCheck.provider(DefaultEventReporter_Factory.create(provideEventReporterModeProvider, (Provider) defaultDeviceIdRepositoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, provideWorkContextProvider));
    this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(contextProvider, providePublishableKeyProvider, provideWorkContextProvider, productUsageProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, provideLoggerProvider);
    this.customerApiRepositoryProvider = DoubleCheck.provider(CustomerApiRepository_Factory.create((Provider) stripeApiRepositoryProvider, providePaymentConfigurationProvider, provideLoggerProvider, provideWorkContextProvider, productUsageProvider));
  }

  @Override
  public void inject(PaymentOptionsViewModel.Factory factory) {
    injectFactory(factory);
  }

  private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory instance) {
    PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, paymentOptionsViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private static final class Builder implements PaymentOptionsViewModelFactoryComponent.Builder {
    private Context context;

    private Set<String> productUsage;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public Builder productUsage(Set<String> productUsage) {
      this.productUsage = Preconditions.checkNotNull(productUsage);
      return this;
    }

    @Override
    public PaymentOptionsViewModelFactoryComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      return new DaggerPaymentOptionsViewModelFactoryComponent(new PaymentOptionsViewModelModule(), new CoroutineContextModule(), new LoggingModule(), context, productUsage);
    }
  }

  private static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
    private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent;

    private Application application;

    private PaymentOptionContract.Args args;

    private PaymentOptionsViewModelSubcomponentBuilder(
        DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent) {
      this.paymentOptionsViewModelFactoryComponent = paymentOptionsViewModelFactoryComponent;
    }

    @Override
    public PaymentOptionsViewModelSubcomponentBuilder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public PaymentOptionsViewModelSubcomponentBuilder args(PaymentOptionContract.Args args) {
      this.args = Preconditions.checkNotNull(args);
      return this;
    }

    @Override
    public PaymentOptionsViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      Preconditions.checkBuilderRequirement(args, PaymentOptionContract.Args.class);
      return new PaymentOptionsViewModelSubcomponentImpl(paymentOptionsViewModelFactoryComponent, application, args);
    }
  }

  private static final class PaymentOptionsViewModelSubcomponentImpl implements PaymentOptionsViewModelSubcomponent {
    private final PaymentOptionContract.Args args;

    private final Application application;

    private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent;

    private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl = this;

    private PaymentOptionsViewModelSubcomponentImpl(
        DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent,
        Application applicationParam, PaymentOptionContract.Args argsParam) {
      this.paymentOptionsViewModelFactoryComponent = paymentOptionsViewModelFactoryComponent;
      this.args = argsParam;
      this.application = applicationParam;

    }

    @Override
    public PaymentOptionsViewModel getViewModel() {
      return new PaymentOptionsViewModel(args, paymentOptionsViewModelFactoryComponent.providePrefsRepositoryFactoryProvider.get(), paymentOptionsViewModelFactoryComponent.defaultEventReporterProvider.get(), paymentOptionsViewModelFactoryComponent.customerApiRepositoryProvider.get(), paymentOptionsViewModelFactoryComponent.provideWorkContextProvider.get(), application, paymentOptionsViewModelFactoryComponent.provideLoggerProvider.get(), PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory.provideDummyInjectorKey(paymentOptionsViewModelFactoryComponent.paymentOptionsViewModelModule));
    }
  }
}
