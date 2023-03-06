package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
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
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
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
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer_Factory;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController_Factory;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.StripeIntentValidator_Factory;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository_Api_Factory;
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
import kotlinx.coroutines.CoroutineScope;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerFlowControllerComponent implements FlowControllerComponent {
  private final String injectorKey;

  private final DaggerFlowControllerComponent flowControllerComponent = this;

  private Provider<CoroutineScope> lifecycleScopeProvider;

  private Provider<LifecycleOwner> lifeCycleOwnerProvider;

  private Provider<Function0<Integer>> statusBarColorProvider;

  private Provider<PaymentOptionFactory> paymentOptionFactoryProvider;

  private Provider<PaymentOptionCallback> paymentOptionCallbackProvider;

  private Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;

  private Provider<ActivityResultCaller> activityResultCallerProvider;

  private Provider<String> injectorKeyProvider;

  private Provider<Context> appContextProvider;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;

  private Provider<Boolean> provideEnabledLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;

  private Provider<PaymentConfiguration> providePaymentConfigurationProvider;

  private Provider<Function0<String>> providePublishableKeyProvider;

  private Provider<Set<String>> provideProductUsageTokensProvider;

  private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<StripeApiRepository> stripeApiRepositoryProvider;

  private Provider<Locale> provideLocaleProvider;

  private Provider<StripeIntentRepository.Api> apiProvider;

  private Provider<CustomerApiRepository> customerApiRepositoryProvider;

  private Provider<DefaultFlowControllerInitializer> defaultFlowControllerInitializerProvider;

  private Provider<EventReporter.Mode> provideEventReporterModeProvider;

  private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;

  private Provider<DefaultEventReporter> defaultEventReporterProvider;

  private Provider<ViewModelStoreOwner> viewModelStoreOwnerProvider;

  private Provider<FlowControllerViewModel> provideViewModelProvider;

  private Provider<CoroutineContext> provideUIContextProvider;

  private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

  private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;

  private Provider<Resources> provideResourcesProvider;

  private Provider<BankRepository> bankRepositoryProvider;

  private Provider<AddressFieldElementRepository> addressFieldElementRepositoryProvider;

  private Provider<ResourceRepository> resourceRepositoryProvider;

  private Provider<Function0<String>> provideStripeAccountIdProvider;

  private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;

  private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;

  private Provider<DefaultFlowController> defaultFlowControllerProvider;

  private Provider<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;

  private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;

  private DaggerFlowControllerComponent(GooglePayLauncherModule googlePayLauncherModuleParam,
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Context appContextParam, ViewModelStoreOwner viewModelStoreOwnerParam,
      CoroutineScope lifecycleScopeParam, LifecycleOwner lifeCycleOwnerParam,
      ActivityResultCaller activityResultCallerParam, Function0<Integer> statusBarColorParam,
      PaymentOptionFactory paymentOptionFactoryParam,
      PaymentOptionCallback paymentOptionCallbackParam,
      PaymentSheetResultCallback paymentResultCallbackParam, String injectorKeyParam) {
    this.injectorKey = injectorKeyParam;
    initialize(googlePayLauncherModuleParam, coroutineContextModuleParam, loggingModuleParam, appContextParam, viewModelStoreOwnerParam, lifecycleScopeParam, lifeCycleOwnerParam, activityResultCallerParam, statusBarColorParam, paymentOptionFactoryParam, paymentOptionCallbackParam, paymentResultCallbackParam, injectorKeyParam);

  }

  public static FlowControllerComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final GooglePayLauncherModule googlePayLauncherModuleParam,
      final CoroutineContextModule coroutineContextModuleParam,
      final LoggingModule loggingModuleParam, final Context appContextParam,
      final ViewModelStoreOwner viewModelStoreOwnerParam, final CoroutineScope lifecycleScopeParam,
      final LifecycleOwner lifeCycleOwnerParam,
      final ActivityResultCaller activityResultCallerParam,
      final Function0<Integer> statusBarColorParam,
      final PaymentOptionFactory paymentOptionFactoryParam,
      final PaymentOptionCallback paymentOptionCallbackParam,
      final PaymentSheetResultCallback paymentResultCallbackParam, final String injectorKeyParam) {
    this.lifecycleScopeProvider = InstanceFactory.create(lifecycleScopeParam);
    this.lifeCycleOwnerProvider = InstanceFactory.create(lifeCycleOwnerParam);
    this.statusBarColorProvider = InstanceFactory.create(statusBarColorParam);
    this.paymentOptionFactoryProvider = InstanceFactory.create(paymentOptionFactoryParam);
    this.paymentOptionCallbackProvider = InstanceFactory.create(paymentOptionCallbackParam);
    this.paymentResultCallbackProvider = InstanceFactory.create(paymentResultCallbackParam);
    this.activityResultCallerProvider = InstanceFactory.create(activityResultCallerParam);
    this.injectorKeyProvider = InstanceFactory.create(injectorKeyParam);
    this.appContextProvider = InstanceFactory.create(appContextParam);
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.providePrefsRepositoryFactoryProvider = DoubleCheck.provider(FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory.create(appContextProvider, provideWorkContextProvider));
    this.provideEnabledLoggingProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, provideEnabledLoggingProvider));
    this.provideGooglePayRepositoryFactoryProvider = DoubleCheck.provider(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModuleParam, appContextProvider, provideLoggerProvider));
    this.providePaymentConfigurationProvider = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(appContextProvider);
    this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(providePaymentConfigurationProvider);
    this.provideProductUsageTokensProvider = DoubleCheck.provider(FlowControllerModule_Companion_ProvideProductUsageTokensFactory.create());
    this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(appContextProvider, providePublishableKeyProvider, provideProductUsageTokensProvider);
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, provideWorkContextProvider);
    this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(appContextProvider, providePublishableKeyProvider, provideWorkContextProvider, provideProductUsageTokensProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, provideLoggerProvider);
    this.provideLocaleProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideLocaleFactory.create());
    this.apiProvider = StripeIntentRepository_Api_Factory.create((Provider) stripeApiRepositoryProvider, providePaymentConfigurationProvider, provideWorkContextProvider, provideLocaleProvider);
    this.customerApiRepositoryProvider = DoubleCheck.provider(CustomerApiRepository_Factory.create((Provider) stripeApiRepositoryProvider, providePaymentConfigurationProvider, provideLoggerProvider, provideWorkContextProvider, provideProductUsageTokensProvider));
    this.defaultFlowControllerInitializerProvider = DoubleCheck.provider(DefaultFlowControllerInitializer_Factory.create(providePrefsRepositoryFactoryProvider, provideGooglePayRepositoryFactoryProvider, (Provider) apiProvider, StripeIntentValidator_Factory.create(), (Provider) customerApiRepositoryProvider, provideLoggerProvider, provideWorkContextProvider));
    this.provideEventReporterModeProvider = DoubleCheck.provider(FlowControllerModule_Companion_ProvideEventReporterModeFactory.create());
    this.defaultDeviceIdRepositoryProvider = DoubleCheck.provider(DefaultDeviceIdRepository_Factory.create(appContextProvider, provideWorkContextProvider));
    this.defaultEventReporterProvider = DoubleCheck.provider(DefaultEventReporter_Factory.create(provideEventReporterModeProvider, (Provider) defaultDeviceIdRepositoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, provideWorkContextProvider));
    this.viewModelStoreOwnerProvider = InstanceFactory.create(viewModelStoreOwnerParam);
    this.provideViewModelProvider = DoubleCheck.provider(FlowControllerModule_Companion_ProvideViewModelFactory.create(viewModelStoreOwnerProvider));
    this.provideUIContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModuleParam));
    this.stripePaymentLauncherProvider = StripePaymentLauncher_Factory.create(appContextProvider, provideEnabledLoggingProvider, provideWorkContextProvider, provideUIContextProvider, (Provider) stripeApiRepositoryProvider, paymentAnalyticsRequestFactoryProvider, provideProductUsageTokensProvider);
    this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(stripePaymentLauncherProvider);
    this.provideResourcesProvider = DoubleCheck.provider(PaymentSheetCommonModule_Companion_ProvideResourcesFactory.create(appContextProvider));
    this.bankRepositoryProvider = DoubleCheck.provider(BankRepository_Factory.create(provideResourcesProvider));
    this.addressFieldElementRepositoryProvider = DoubleCheck.provider(AddressFieldElementRepository_Factory.create(provideResourcesProvider));
    this.resourceRepositoryProvider = DoubleCheck.provider(ResourceRepository_Factory.create(bankRepositoryProvider, addressFieldElementRepositoryProvider));
    this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(providePaymentConfigurationProvider);
    this.googlePayPaymentMethodLauncherProvider = GooglePayPaymentMethodLauncher_Factory.create(appContextProvider, provideGooglePayRepositoryFactoryProvider, provideProductUsageTokensProvider, providePublishableKeyProvider, provideStripeAccountIdProvider, provideEnabledLoggingProvider, provideWorkContextProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, (Provider) stripeApiRepositoryProvider);
    this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.create(googlePayPaymentMethodLauncherProvider);
    this.defaultFlowControllerProvider = DoubleCheck.provider(DefaultFlowController_Factory.create(lifecycleScopeProvider, lifeCycleOwnerProvider, statusBarColorProvider, paymentOptionFactoryProvider, paymentOptionCallbackProvider, paymentResultCallbackProvider, activityResultCallerProvider, injectorKeyProvider, (Provider) defaultFlowControllerInitializerProvider, (Provider) defaultEventReporterProvider, provideViewModelProvider, stripePaymentLauncherAssistedFactoryProvider, resourceRepositoryProvider, providePaymentConfigurationProvider, provideUIContextProvider, provideEnabledLoggingProvider, provideProductUsageTokensProvider, googlePayPaymentMethodLauncherFactoryProvider));
    this.paymentOptionsViewModelSubcomponentBuilderProvider = new Provider<PaymentOptionsViewModelSubcomponent.Builder>() {
      @Override
      public PaymentOptionsViewModelSubcomponent.Builder get() {
        return new PaymentOptionsViewModelSubcomponentBuilder(flowControllerComponent);
      }
    };
    this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() {
      @Override
      public FormViewModelSubcomponent.Builder get() {
        return new FormViewModelSubcomponentBuilder(flowControllerComponent);
      }
    };
  }

  @Override
  public DefaultFlowController getFlowController() {
    return defaultFlowControllerProvider.get();
  }

  @Override
  public void inject(PaymentOptionsViewModel.Factory paymentOptionsViewModel) {
    injectFactory(paymentOptionsViewModel);
  }

  @Override
  public void inject(FormViewModel.Factory factory) {
    injectFactory2(factory);
  }

  private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory instance) {
    PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, paymentOptionsViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private FormViewModel.Factory injectFactory2(FormViewModel.Factory instance) {
    FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, formViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private static final class Builder implements FlowControllerComponent.Builder {
    private Context appContext;

    private ViewModelStoreOwner viewModelStoreOwner;

    private CoroutineScope lifecycleScope;

    private LifecycleOwner lifeCycleOwner;

    private ActivityResultCaller activityResultCaller;

    private Function0<Integer> statusBarColor;

    private PaymentOptionFactory paymentOptionFactory;

    private PaymentOptionCallback paymentOptionCallback;

    private PaymentSheetResultCallback paymentResultCallback;

    private String injectorKey;

    @Override
    public Builder appContext(Context appContext) {
      this.appContext = Preconditions.checkNotNull(appContext);
      return this;
    }

    @Override
    public Builder viewModelStoreOwner(ViewModelStoreOwner viewModelStoreOwner) {
      this.viewModelStoreOwner = Preconditions.checkNotNull(viewModelStoreOwner);
      return this;
    }

    @Override
    public Builder lifecycleScope(CoroutineScope lifecycleScope) {
      this.lifecycleScope = Preconditions.checkNotNull(lifecycleScope);
      return this;
    }

    @Override
    public Builder lifeCycleOwner(LifecycleOwner lifecycleOwner) {
      this.lifeCycleOwner = Preconditions.checkNotNull(lifecycleOwner);
      return this;
    }

    @Override
    public Builder activityResultCaller(ActivityResultCaller activityResultCaller) {
      this.activityResultCaller = Preconditions.checkNotNull(activityResultCaller);
      return this;
    }

    @Override
    public Builder statusBarColor(Function0<Integer> statusBarColor) {
      this.statusBarColor = Preconditions.checkNotNull(statusBarColor);
      return this;
    }

    @Override
    public Builder paymentOptionFactory(PaymentOptionFactory paymentOptionFactory) {
      this.paymentOptionFactory = Preconditions.checkNotNull(paymentOptionFactory);
      return this;
    }

    @Override
    public Builder paymentOptionCallback(PaymentOptionCallback paymentOptionCallback) {
      this.paymentOptionCallback = Preconditions.checkNotNull(paymentOptionCallback);
      return this;
    }

    @Override
    public Builder paymentResultCallback(PaymentSheetResultCallback paymentResultCallback) {
      this.paymentResultCallback = Preconditions.checkNotNull(paymentResultCallback);
      return this;
    }

    @Override
    public Builder injectorKey(String injectorKey) {
      this.injectorKey = Preconditions.checkNotNull(injectorKey);
      return this;
    }

    @Override
    public FlowControllerComponent build() {
      Preconditions.checkBuilderRequirement(appContext, Context.class);
      Preconditions.checkBuilderRequirement(viewModelStoreOwner, ViewModelStoreOwner.class);
      Preconditions.checkBuilderRequirement(lifecycleScope, CoroutineScope.class);
      Preconditions.checkBuilderRequirement(lifeCycleOwner, LifecycleOwner.class);
      Preconditions.checkBuilderRequirement(activityResultCaller, ActivityResultCaller.class);
      Preconditions.checkBuilderRequirement(statusBarColor, Function0.class);
      Preconditions.checkBuilderRequirement(paymentOptionFactory, PaymentOptionFactory.class);
      Preconditions.checkBuilderRequirement(paymentOptionCallback, PaymentOptionCallback.class);
      Preconditions.checkBuilderRequirement(paymentResultCallback, PaymentSheetResultCallback.class);
      Preconditions.checkBuilderRequirement(injectorKey, String.class);
      return new DaggerFlowControllerComponent(new GooglePayLauncherModule(), new CoroutineContextModule(), new LoggingModule(), appContext, viewModelStoreOwner, lifecycleScope, lifeCycleOwner, activityResultCaller, statusBarColor, paymentOptionFactory, paymentOptionCallback, paymentResultCallback, injectorKey);
    }
  }

  private static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
    private final DaggerFlowControllerComponent flowControllerComponent;

    private Application application;

    private PaymentOptionContract.Args args;

    private PaymentOptionsViewModelSubcomponentBuilder(
        DaggerFlowControllerComponent flowControllerComponent) {
      this.flowControllerComponent = flowControllerComponent;
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
      return new PaymentOptionsViewModelSubcomponentImpl(flowControllerComponent, application, args);
    }
  }

  private static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
    private final DaggerFlowControllerComponent flowControllerComponent;

    private LayoutSpec layout;

    private FormFragmentArguments formFragmentArguments;

    private FormViewModelSubcomponentBuilder(
        DaggerFlowControllerComponent flowControllerComponent) {
      this.flowControllerComponent = flowControllerComponent;
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
      return new FormViewModelSubcomponentImpl(flowControllerComponent, layout, formFragmentArguments);
    }
  }

  private static final class PaymentOptionsViewModelSubcomponentImpl implements PaymentOptionsViewModelSubcomponent {
    private final PaymentOptionContract.Args args;

    private final Application application;

    private final DaggerFlowControllerComponent flowControllerComponent;

    private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl = this;

    private PaymentOptionsViewModelSubcomponentImpl(
        DaggerFlowControllerComponent flowControllerComponent, Application applicationParam,
        PaymentOptionContract.Args argsParam) {
      this.flowControllerComponent = flowControllerComponent;
      this.args = argsParam;
      this.application = applicationParam;

    }

    @Override
    public PaymentOptionsViewModel getViewModel() {
      return new PaymentOptionsViewModel(args, flowControllerComponent.providePrefsRepositoryFactoryProvider.get(), flowControllerComponent.defaultEventReporterProvider.get(), flowControllerComponent.customerApiRepositoryProvider.get(), flowControllerComponent.provideWorkContextProvider.get(), application, flowControllerComponent.provideLoggerProvider.get(), flowControllerComponent.injectorKey);
    }
  }

  private static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
    private final LayoutSpec layout;

    private final FormFragmentArguments formFragmentArguments;

    private final DaggerFlowControllerComponent flowControllerComponent;

    private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl = this;

    private FormViewModelSubcomponentImpl(DaggerFlowControllerComponent flowControllerComponent,
        LayoutSpec layoutParam, FormFragmentArguments formFragmentArgumentsParam) {
      this.flowControllerComponent = flowControllerComponent;
      this.layout = layoutParam;
      this.formFragmentArguments = formFragmentArgumentsParam;

    }

    private TransformSpecToElement transformSpecToElement() {
      return new TransformSpecToElement(flowControllerComponent.resourceRepositoryProvider.get(), formFragmentArguments);
    }

    @Override
    public FormViewModel getViewModel() {
      return new FormViewModel(layout, formFragmentArguments, flowControllerComponent.resourceRepositoryProvider.get(), transformSpecToElement());
    }
  }
}
