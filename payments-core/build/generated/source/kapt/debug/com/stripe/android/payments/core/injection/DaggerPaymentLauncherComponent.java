package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.Logger;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.ApiRequest_Options_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Map;
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
public final class DaggerPaymentLauncherComponent implements PaymentLauncherComponent {
  private final StripeRepository stripeRepository;

  private final CoroutineContext ioContext;

  private final PaymentAnalyticsRequestFactory analyticsRequestFactory;

  private final CoroutineContext uiContext;

  private final DaggerPaymentLauncherComponent paymentLauncherComponent = this;

  private Provider<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;

  private Provider<Context> contextProvider;

  private Provider<StripeRepository> stripeRepositoryProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<CoroutineContext> ioContextProvider;

  private Provider<CoroutineContext> uiContextProvider;

  private Provider<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;

  private Provider<Function0<String>> publishableKeyProvider;

  private Provider<Set<String>> productUsageProvider;

  private Provider<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;

  private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;

  private Provider<Function0<String>> stripeAccountIdProvider;

  private Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  private Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;

  private Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;

  private DaggerPaymentLauncherComponent(PaymentLauncherModule paymentLauncherModuleParam,
      LoggingModule loggingModuleParam, Context contextParam, Boolean enableLoggingParam,
      CoroutineContext ioContextParam, CoroutineContext uiContextParam,
      StripeRepository stripeRepositoryParam,
      PaymentAnalyticsRequestFactory analyticsRequestFactoryParam,
      Function0<String> publishableKeyProviderParam, Function0<String> stripeAccountIdProviderParam,
      Set<String> productUsageParam) {
    this.stripeRepository = stripeRepositoryParam;
    this.ioContext = ioContextParam;
    this.analyticsRequestFactory = analyticsRequestFactoryParam;
    this.uiContext = uiContextParam;
    initialize(paymentLauncherModuleParam, loggingModuleParam, contextParam, enableLoggingParam, ioContextParam, uiContextParam, stripeRepositoryParam, analyticsRequestFactoryParam, publishableKeyProviderParam, stripeAccountIdProviderParam, productUsageParam);

  }

  public static PaymentLauncherComponent.Builder builder() {
    return new Builder();
  }

  private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
    return new DefaultAnalyticsRequestExecutor(provideLoggerProvider.get(), ioContext);
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PaymentLauncherModule paymentLauncherModuleParam,
      final LoggingModule loggingModuleParam, final Context contextParam,
      final Boolean enableLoggingParam, final CoroutineContext ioContextParam,
      final CoroutineContext uiContextParam, final StripeRepository stripeRepositoryParam,
      final PaymentAnalyticsRequestFactory analyticsRequestFactoryParam,
      final Function0<String> publishableKeyProviderParam,
      final Function0<String> stripeAccountIdProviderParam, final Set<String> productUsageParam) {
    this.paymentLauncherViewModelSubcomponentBuilderProvider = new Provider<PaymentLauncherViewModelSubcomponent.Builder>() {
      @Override
      public PaymentLauncherViewModelSubcomponent.Builder get() {
        return new PaymentLauncherViewModelSubcomponentBuilder(paymentLauncherComponent);
      }
    };
    this.contextProvider = InstanceFactory.create(contextParam);
    this.stripeRepositoryProvider = InstanceFactory.create(stripeRepositoryParam);
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.ioContextProvider = InstanceFactory.create(ioContextParam);
    this.uiContextProvider = InstanceFactory.create(uiContextParam);
    this.provideThreeDs1IntentReturnUrlMapProvider = DoubleCheck.provider(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModuleParam));
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, ioContextProvider);
    this.analyticsRequestFactoryProvider = InstanceFactory.create(analyticsRequestFactoryParam);
    this.publishableKeyProvider = InstanceFactory.create(publishableKeyProviderParam);
    this.productUsageProvider = InstanceFactory.create(productUsageParam);
    this.providePaymentAuthenticatorRegistryProvider = DoubleCheck.provider(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModuleParam, contextProvider, stripeRepositoryProvider, enableLoggingProvider, ioContextProvider, uiContextProvider, provideThreeDs1IntentReturnUrlMapProvider, defaultAnalyticsRequestExecutorProvider, analyticsRequestFactoryProvider, publishableKeyProvider, productUsageProvider));
    this.provideDefaultReturnUrlProvider = DoubleCheck.provider(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModuleParam, contextProvider));
    this.stripeAccountIdProvider = InstanceFactory.create(stripeAccountIdProviderParam);
    this.retryDelaySupplierProvider = DoubleCheck.provider(RetryDelaySupplier_Factory.create());
    this.paymentIntentFlowResultProcessorProvider = DoubleCheck.provider(PaymentIntentFlowResultProcessor_Factory.create(contextProvider, publishableKeyProvider, stripeRepositoryProvider, provideLoggerProvider, ioContextProvider, retryDelaySupplierProvider));
    this.setupIntentFlowResultProcessorProvider = DoubleCheck.provider(SetupIntentFlowResultProcessor_Factory.create(contextProvider, publishableKeyProvider, stripeRepositoryProvider, provideLoggerProvider, ioContextProvider));
  }

  @Override
  public void inject(PaymentLauncherViewModel.Factory factory) {
    injectFactory(factory);
  }

  private PaymentLauncherViewModel.Factory injectFactory(
      PaymentLauncherViewModel.Factory instance) {
    PaymentLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, paymentLauncherViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private static final class Builder implements PaymentLauncherComponent.Builder {
    private Context context;

    private Boolean enableLogging;

    private CoroutineContext ioContext;

    private CoroutineContext uiContext;

    private StripeRepository stripeRepository;

    private PaymentAnalyticsRequestFactory analyticsRequestFactory;

    private Function0<String> publishableKeyProvider;

    private Function0<String> stripeAccountIdProvider;

    private Set<String> productUsage;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public Builder enableLogging(boolean enableLogging) {
      this.enableLogging = Preconditions.checkNotNull(enableLogging);
      return this;
    }

    @Override
    public Builder ioContext(CoroutineContext workContext) {
      this.ioContext = Preconditions.checkNotNull(workContext);
      return this;
    }

    @Override
    public Builder uiContext(CoroutineContext uiContext) {
      this.uiContext = Preconditions.checkNotNull(uiContext);
      return this;
    }

    @Override
    public Builder stripeRepository(StripeRepository stripeRepository) {
      this.stripeRepository = Preconditions.checkNotNull(stripeRepository);
      return this;
    }

    @Override
    public Builder analyticsRequestFactory(
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
      this.analyticsRequestFactory = Preconditions.checkNotNull(paymentAnalyticsRequestFactory);
      return this;
    }

    @Override
    public Builder publishableKeyProvider(Function0<String> publishableKeyProvider) {
      this.publishableKeyProvider = Preconditions.checkNotNull(publishableKeyProvider);
      return this;
    }

    @Override
    public Builder stripeAccountIdProvider(Function0<String> stripeAccountIdProvider) {
      this.stripeAccountIdProvider = Preconditions.checkNotNull(stripeAccountIdProvider);
      return this;
    }

    @Override
    public Builder productUsage(Set<String> productUsage) {
      this.productUsage = Preconditions.checkNotNull(productUsage);
      return this;
    }

    @Override
    public PaymentLauncherComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(ioContext, CoroutineContext.class);
      Preconditions.checkBuilderRequirement(uiContext, CoroutineContext.class);
      Preconditions.checkBuilderRequirement(stripeRepository, StripeRepository.class);
      Preconditions.checkBuilderRequirement(analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(stripeAccountIdProvider, Function0.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      return new DaggerPaymentLauncherComponent(new PaymentLauncherModule(), new LoggingModule(), context, enableLogging, ioContext, uiContext, stripeRepository, analyticsRequestFactory, publishableKeyProvider, stripeAccountIdProvider, productUsage);
    }
  }

  private static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
    private final DaggerPaymentLauncherComponent paymentLauncherComponent;

    private Boolean isPaymentIntent;

    private SavedStateHandle savedStateHandle;

    private AuthActivityStarterHost authActivityStarterHost;

    private ActivityResultCaller activityResultCaller;

    private PaymentLauncherViewModelSubcomponentBuilder(
        DaggerPaymentLauncherComponent paymentLauncherComponent) {
      this.paymentLauncherComponent = paymentLauncherComponent;
    }

    @Override
    public PaymentLauncherViewModelSubcomponentBuilder isPaymentIntent(boolean isPaymentIntent) {
      this.isPaymentIntent = Preconditions.checkNotNull(isPaymentIntent);
      return this;
    }

    @Override
    public PaymentLauncherViewModelSubcomponentBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public PaymentLauncherViewModelSubcomponentBuilder authActivityStarterHost(
        AuthActivityStarterHost authActivityStarterHost) {
      this.authActivityStarterHost = Preconditions.checkNotNull(authActivityStarterHost);
      return this;
    }

    @Override
    public PaymentLauncherViewModelSubcomponentBuilder activityResultCaller(
        ActivityResultCaller activityResultCaller) {
      this.activityResultCaller = Preconditions.checkNotNull(activityResultCaller);
      return this;
    }

    @Override
    public PaymentLauncherViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(isPaymentIntent, Boolean.class);
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(authActivityStarterHost, AuthActivityStarterHost.class);
      Preconditions.checkBuilderRequirement(activityResultCaller, ActivityResultCaller.class);
      return new PaymentLauncherViewModelSubcomponentImpl(paymentLauncherComponent, isPaymentIntent, savedStateHandle, authActivityStarterHost, activityResultCaller);
    }
  }

  private static final class PaymentLauncherViewModelSubcomponentImpl implements PaymentLauncherViewModelSubcomponent {
    private final Boolean isPaymentIntent;

    private final AuthActivityStarterHost authActivityStarterHost;

    private final ActivityResultCaller activityResultCaller;

    private final SavedStateHandle savedStateHandle;

    private final DaggerPaymentLauncherComponent paymentLauncherComponent;

    private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl = this;

    private Provider<ApiRequest.Options> optionsProvider;

    private PaymentLauncherViewModelSubcomponentImpl(
        DaggerPaymentLauncherComponent paymentLauncherComponent, Boolean isPaymentIntentParam,
        SavedStateHandle savedStateHandleParam,
        AuthActivityStarterHost authActivityStarterHostParam,
        ActivityResultCaller activityResultCallerParam) {
      this.paymentLauncherComponent = paymentLauncherComponent;
      this.isPaymentIntent = isPaymentIntentParam;
      this.authActivityStarterHost = authActivityStarterHostParam;
      this.activityResultCaller = activityResultCallerParam;
      this.savedStateHandle = savedStateHandleParam;
      initialize(isPaymentIntentParam, savedStateHandleParam, authActivityStarterHostParam, activityResultCallerParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final Boolean isPaymentIntentParam,
        final SavedStateHandle savedStateHandleParam,
        final AuthActivityStarterHost authActivityStarterHostParam,
        final ActivityResultCaller activityResultCallerParam) {
      this.optionsProvider = ApiRequest_Options_Factory.create(paymentLauncherComponent.publishableKeyProvider, paymentLauncherComponent.stripeAccountIdProvider);
    }

    @Override
    public PaymentLauncherViewModel getViewModel() {
      return new PaymentLauncherViewModel(isPaymentIntent, paymentLauncherComponent.stripeRepository, paymentLauncherComponent.providePaymentAuthenticatorRegistryProvider.get(), paymentLauncherComponent.provideDefaultReturnUrlProvider.get(), optionsProvider, paymentLauncherComponent.provideThreeDs1IntentReturnUrlMapProvider.get(), DoubleCheck.lazy(paymentLauncherComponent.paymentIntentFlowResultProcessorProvider), DoubleCheck.lazy(paymentLauncherComponent.setupIntentFlowResultProcessorProvider), paymentLauncherComponent.defaultAnalyticsRequestExecutor(), paymentLauncherComponent.analyticsRequestFactory, paymentLauncherComponent.uiContext, authActivityStarterHost, activityResultCaller, savedStateHandle);
    }
  }
}
