package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.res.Resources;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory_Impl;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.payments.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.payments.core.injection.LoggingModule;
import com.stripe.android.payments.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.address.AddressFieldElementRepository;
import com.stripe.android.paymentsheet.address.AddressFieldElementRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.elements.BankRepository;
import com.stripe.android.paymentsheet.elements.BankRepository_Factory;
import com.stripe.android.paymentsheet.elements.LayoutSpec;
import com.stripe.android.paymentsheet.elements.ResourceRepository;
import com.stripe.android.paymentsheet.elements.ResourceRepository_Factory;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Locale;
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
public final class DaggerPaymentSheetLauncherComponent implements PaymentSheetLauncherComponent {
  private final Application application;

  private final String injectorKey;

  private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent = this;

  private Provider<PaymentSheetViewModelSubcomponent.Builder> paymentSheetViewModelSubcomponentBuilderProvider;

  private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;

  private Provider<EventReporter.Mode> provideEventReporterModeProvider;

  private Provider<Application> applicationProvider;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;

  private Provider<Boolean> provideEnabledLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<PaymentConfiguration> providePaymentConfigurationProvider;

  private Provider<Function0<String>> providePublishableKeyProvider;

  private Provider<Set<String>> provideProductUsageTokensProvider;

  private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private Provider<DefaultEventReporter> defaultEventReporterProvider;

  private Provider<Locale> provideLocaleProvider;

  private Provider<StripeApiRepository> stripeApiRepositoryProvider;

  private Provider<CustomerApiRepository> customerApiRepositoryProvider;

  private Provider<Resources> provideResourcesProvider;

  private Provider<BankRepository> bankRepositoryProvider;

  private Provider<AddressFieldElementRepository> addressFieldElementRepositoryProvider;

  private Provider<ResourceRepository> resourceRepositoryProvider;

  private Provider<CoroutineContext> provideUIContextProvider;

  private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;

  private Provider<Function0<String>> provideStripeAccountIdProvider;

  private DaggerPaymentSheetLauncherComponent(GooglePayLauncherModule googlePayLauncherModuleParam,
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Application applicationParam, String injectorKeyParam) {
    this.application = applicationParam;
    this.injectorKey = injectorKeyParam;
    initialize(googlePayLauncherModuleParam, coroutineContextModuleParam, loggingModuleParam, applicationParam, injectorKeyParam);

  }

  public static PaymentSheetLauncherComponent.Builder builder() {
    return new Builder();
  }

  private Function0<String> namedFunction0OfString() {
    return PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(DoubleCheck.lazy(providePaymentConfigurationProvider));
  }

  private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
    return new PaymentAnalyticsRequestFactory(application, namedFunction0OfString(), provideProductUsageTokensProvider.get());
  }

  private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
    return new DefaultAnalyticsRequestExecutor(provideLoggerProvider.get(), provideWorkContextProvider.get());
  }

  private StripeApiRepository stripeApiRepository() {
    return new StripeApiRepository(application, namedFunction0OfString(), provideWorkContextProvider.get(), provideProductUsageTokensProvider.get(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), provideLoggerProvider.get());
  }

  private StripeIntentRepository.Api api() {
    return new StripeIntentRepository.Api(stripeApiRepository(), DoubleCheck.lazy(providePaymentConfigurationProvider), provideWorkContextProvider.get(), provideLocaleProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final GooglePayLauncherModule googlePayLauncherModuleParam,
      final CoroutineContextModule coroutineContextModuleParam,
      final LoggingModule loggingModuleParam, final Application applicationParam,
      final String injectorKeyParam) {
    this.paymentSheetViewModelSubcomponentBuilderProvider = new Provider<PaymentSheetViewModelSubcomponent.Builder>() {
      @Override
      public PaymentSheetViewModelSubcomponent.Builder get() {
        return new PaymentSheetViewModelSubcomponentBuilder(paymentSheetLauncherComponent);
      }
    };
    this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() {
      @Override
      public FormViewModelSubcomponent.Builder get() {
        return new FormViewModelSubcomponentBuilder(paymentSheetLauncherComponent);
      }
    };
    this.provideEventReporterModeProvider = DoubleCheck.provider(PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory.create());
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.defaultDeviceIdRepositoryProvider = DoubleCheck.provider(DefaultDeviceIdRepository_Factory.create((Provider) applicationProvider, provideWorkContextProvider));
    this.provideEnabledLoggingProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, provideEnabledLoggingProvider));
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, provideWorkContextProvider);
    this.providePaymentConfigurationProvider = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create((Provider) applicationProvider);
    this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(providePaymentConfigurationProvider);
    this.provideProductUsageTokensProvider = DoubleCheck.provider(PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory.create());
    this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create((Provider) applicationProvider, providePublishableKeyProvider, provideProductUsageTokensProvider);
    this.defaultEventReporterProvider = DoubleCheck.provider(DefaultEventReporter_Factory.create(provideEventReporterModeProvider, (Provider) defaultDeviceIdRepositoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, provideWorkContextProvider));
    this.provideLocaleProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideLocaleFactory.create());
    this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create((Provider) applicationProvider, providePublishableKeyProvider, provideWorkContextProvider, provideProductUsageTokensProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, provideLoggerProvider);
    this.customerApiRepositoryProvider = DoubleCheck.provider(CustomerApiRepository_Factory.create((Provider) stripeApiRepositoryProvider, providePaymentConfigurationProvider, provideLoggerProvider, provideWorkContextProvider, provideProductUsageTokensProvider));
    this.provideResourcesProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideResourcesFactory.create((Provider) applicationProvider));
    this.bankRepositoryProvider = DoubleCheck.provider(BankRepository_Factory.create(provideResourcesProvider));
    this.addressFieldElementRepositoryProvider = DoubleCheck.provider(AddressFieldElementRepository_Factory.create(provideResourcesProvider));
    this.resourceRepositoryProvider = DoubleCheck.provider(ResourceRepository_Factory.create(bankRepositoryProvider, addressFieldElementRepositoryProvider));
    this.provideUIContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModuleParam));
    this.provideGooglePayRepositoryFactoryProvider = DoubleCheck.provider(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModuleParam, (Provider) applicationProvider, provideLoggerProvider));
    this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(providePaymentConfigurationProvider);
  }

  @Override
  public void inject(PaymentSheetViewModel.Factory factory) {
    injectFactory(factory);
  }

  @Override
  public void inject(FormViewModel.Factory factory) {
    injectFactory2(factory);
  }

  private PaymentSheetViewModel.Factory injectFactory(PaymentSheetViewModel.Factory instance) {
    PaymentSheetViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, paymentSheetViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private FormViewModel.Factory injectFactory2(FormViewModel.Factory instance) {
    FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, formViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private static final class Builder implements PaymentSheetLauncherComponent.Builder {
    private Application application;

    private String injectorKey;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public Builder injectorKey(String injectorKey) {
      this.injectorKey = Preconditions.checkNotNull(injectorKey);
      return this;
    }

    @Override
    public PaymentSheetLauncherComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      Preconditions.checkBuilderRequirement(injectorKey, String.class);
      return new DaggerPaymentSheetLauncherComponent(new GooglePayLauncherModule(), new CoroutineContextModule(), new LoggingModule(), application, injectorKey);
    }
  }

  private static final class PaymentSheetViewModelSubcomponentBuilder implements PaymentSheetViewModelSubcomponent.Builder {
    private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

    private PaymentSheetViewModelModule paymentSheetViewModelModule;

    private PaymentSheetViewModelSubcomponentBuilder(
        DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent) {
      this.paymentSheetLauncherComponent = paymentSheetLauncherComponent;
    }

    @Override
    public PaymentSheetViewModelSubcomponentBuilder paymentSheetViewModelModule(
        PaymentSheetViewModelModule paymentSheetViewModelModule) {
      this.paymentSheetViewModelModule = Preconditions.checkNotNull(paymentSheetViewModelModule);
      return this;
    }

    @Override
    public PaymentSheetViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(paymentSheetViewModelModule, PaymentSheetViewModelModule.class);
      return new PaymentSheetViewModelSubcomponentImpl(paymentSheetLauncherComponent, paymentSheetViewModelModule);
    }
  }

  private static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
    private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

    private LayoutSpec layout;

    private FormFragmentArguments formFragmentArguments;

    private FormViewModelSubcomponentBuilder(
        DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent) {
      this.paymentSheetLauncherComponent = paymentSheetLauncherComponent;
    }

    @Override
    public FormViewModelSubcomponentBuilder layout(LayoutSpec layoutSpec) {
      this.layout = Preconditions.checkNotNull(layoutSpec);
      return this;
    }

    @Override
    public FormViewModelSubcomponentBuilder formFragmentArguments(FormFragmentArguments config) {
      this.formFragmentArguments = Preconditions.checkNotNull(config);
      return this;
    }

    @Override
    public FormViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(layout, LayoutSpec.class);
      Preconditions.checkBuilderRequirement(formFragmentArguments, FormFragmentArguments.class);
      return new FormViewModelSubcomponentImpl(paymentSheetLauncherComponent, layout, formFragmentArguments);
    }
  }

  private static final class PaymentSheetViewModelSubcomponentImpl implements PaymentSheetViewModelSubcomponent {
    private final PaymentSheetViewModelModule paymentSheetViewModelModule;

    private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

    private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl = this;

    private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

    private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;

    private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;

    private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;

    private PaymentSheetViewModelSubcomponentImpl(
        DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent,
        PaymentSheetViewModelModule paymentSheetViewModelModuleParam) {
      this.paymentSheetLauncherComponent = paymentSheetLauncherComponent;
      this.paymentSheetViewModelModule = paymentSheetViewModelModuleParam;
      initialize(paymentSheetViewModelModuleParam);

    }

    private PrefsRepository prefsRepository() {
      return PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory.providePrefsRepository(paymentSheetViewModelModule, paymentSheetLauncherComponent.application, paymentSheetLauncherComponent.provideWorkContextProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PaymentSheetViewModelModule paymentSheetViewModelModuleParam) {
      this.stripePaymentLauncherProvider = StripePaymentLauncher_Factory.create((Provider) paymentSheetLauncherComponent.applicationProvider, paymentSheetLauncherComponent.provideEnabledLoggingProvider, paymentSheetLauncherComponent.provideWorkContextProvider, paymentSheetLauncherComponent.provideUIContextProvider, (Provider) paymentSheetLauncherComponent.stripeApiRepositoryProvider, paymentSheetLauncherComponent.paymentAnalyticsRequestFactoryProvider, paymentSheetLauncherComponent.provideProductUsageTokensProvider);
      this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(stripePaymentLauncherProvider);
      this.googlePayPaymentMethodLauncherProvider = GooglePayPaymentMethodLauncher_Factory.create((Provider) paymentSheetLauncherComponent.applicationProvider, paymentSheetLauncherComponent.provideGooglePayRepositoryFactoryProvider, paymentSheetLauncherComponent.provideProductUsageTokensProvider, paymentSheetLauncherComponent.providePublishableKeyProvider, paymentSheetLauncherComponent.provideStripeAccountIdProvider, paymentSheetLauncherComponent.provideEnabledLoggingProvider, paymentSheetLauncherComponent.provideWorkContextProvider, paymentSheetLauncherComponent.paymentAnalyticsRequestFactoryProvider, (Provider) paymentSheetLauncherComponent.defaultAnalyticsRequestExecutorProvider, (Provider) paymentSheetLauncherComponent.stripeApiRepositoryProvider);
      this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.create(googlePayPaymentMethodLauncherProvider);
    }

    @Override
    public PaymentSheetViewModel getViewModel() {
      return new PaymentSheetViewModel(paymentSheetLauncherComponent.application, PaymentSheetViewModelModule_ProvideArgsFactory.provideArgs(paymentSheetViewModelModule), paymentSheetLauncherComponent.defaultEventReporterProvider.get(), DoubleCheck.lazy(paymentSheetLauncherComponent.providePaymentConfigurationProvider), paymentSheetLauncherComponent.api(), new StripeIntentValidator(), paymentSheetLauncherComponent.customerApiRepositoryProvider.get(), prefsRepository(), paymentSheetLauncherComponent.resourceRepositoryProvider.get(), stripePaymentLauncherAssistedFactoryProvider.get(), googlePayPaymentMethodLauncherFactoryProvider.get(), paymentSheetLauncherComponent.provideLoggerProvider.get(), paymentSheetLauncherComponent.provideWorkContextProvider.get(), paymentSheetLauncherComponent.injectorKey);
    }
  }

  private static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
    private final LayoutSpec layout;

    private final FormFragmentArguments formFragmentArguments;

    private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

    private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl = this;

    private FormViewModelSubcomponentImpl(
        DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent, LayoutSpec layoutParam,
        FormFragmentArguments formFragmentArgumentsParam) {
      this.paymentSheetLauncherComponent = paymentSheetLauncherComponent;
      this.layout = layoutParam;
      this.formFragmentArguments = formFragmentArgumentsParam;

    }

    private TransformSpecToElement transformSpecToElement() {
      return new TransformSpecToElement(paymentSheetLauncherComponent.resourceRepositoryProvider.get(), formFragmentArguments);
    }

    @Override
    public FormViewModel getViewModel() {
      return new FormViewModel(layout, formFragmentArguments, paymentSheetLauncherComponent.resourceRepositoryProvider.get(), transformSpecToElement());
    }
  }
}
