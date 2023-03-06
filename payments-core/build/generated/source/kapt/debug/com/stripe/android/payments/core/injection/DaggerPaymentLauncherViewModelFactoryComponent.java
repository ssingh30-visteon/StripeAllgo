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
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
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
public final class DaggerPaymentLauncherViewModelFactoryComponent implements PaymentLauncherViewModelFactoryComponent {
  private final Context context;

  private final Function0<String> publishableKeyProvider;

  private final Set<String> productUsage;

  private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent = this;

  private Provider<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<Context> contextProvider;

  private Provider<Function0<String>> publishableKeyProvider2;

  private Provider<Set<String>> productUsageProvider;

  private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<StripeApiRepository> stripeApiRepositoryProvider;

  private Provider<CoroutineContext> provideUIContextProvider;

  private Provider<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;

  private Provider<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;

  private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;

  private Provider<Function0<String>> stripeAccountIdProvider;

  private Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  private Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;

  private Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;

  private DaggerPaymentLauncherViewModelFactoryComponent(
      PaymentLauncherModule paymentLauncherModuleParam,
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Context contextParam, Boolean enableLoggingParam,
      Function0<String> publishableKeyProviderParam, Function0<String> stripeAccountIdProviderParam,
      Set<String> productUsageParam) {
    this.context = contextParam;
    this.publishableKeyProvider = publishableKeyProviderParam;
    this.productUsage = productUsageParam;
    initialize(paymentLauncherModuleParam, coroutineContextModuleParam, loggingModuleParam, contextParam, enableLoggingParam, publishableKeyProviderParam, stripeAccountIdProviderParam, productUsageParam);

  }

  public static PaymentLauncherViewModelFactoryComponent.Builder builder() {
    return new Builder();
  }

  private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
    return new PaymentAnalyticsRequestFactory(context, publishableKeyProvider, productUsage);
  }

  private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
    return new DefaultAnalyticsRequestExecutor(provideLoggerProvider.get(), provideWorkContextProvider.get());
  }

  private StripeApiRepository stripeApiRepository() {
    return new StripeApiRepository(context, publishableKeyProvider, provideWorkContextProvider.get(), productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), provideLoggerProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PaymentLauncherModule paymentLauncherModuleParam,
      final CoroutineContextModule coroutineContextModuleParam,
      final LoggingModule loggingModuleParam, final Context contextParam,
      final Boolean enableLoggingParam, final Function0<String> publishableKeyProviderParam,
      final Function0<String> stripeAccountIdProviderParam, final Set<String> productUsageParam) {
    this.paymentLauncherViewModelSubcomponentBuilderProvider = new Provider<PaymentLauncherViewModelSubcomponent.Builder>() {
      @Override
      public PaymentLauncherViewModelSubcomponent.Builder get() {
        return new PaymentLauncherViewModelSubcomponentBuilder(paymentLauncherViewModelFactoryComponent);
      }
    };
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.contextProvider = InstanceFactory.create(contextParam);
    this.publishableKeyProvider2 = InstanceFactory.create(publishableKeyProviderParam);
    this.productUsageProvider = InstanceFactory.create(productUsageParam);
    this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(contextProvider, publishableKeyProvider2, productUsageProvider);
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, provideWorkContextProvider);
    this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(contextProvider, publishableKeyProvider2, provideWorkContextProvider, productUsageProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, provideLoggerProvider);
    this.provideUIContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModuleParam));
    this.provideThreeDs1IntentReturnUrlMapProvider = DoubleCheck.provider(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModuleParam));
    this.providePaymentAuthenticatorRegistryProvider = DoubleCheck.provider(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModuleParam, contextProvider, (Provider) stripeApiRepositoryProvider, enableLoggingProvider, provideWorkContextProvider, provideUIContextProvider, provideThreeDs1IntentReturnUrlMapProvider, defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, publishableKeyProvider2, productUsageProvider));
    this.provideDefaultReturnUrlProvider = DoubleCheck.provider(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModuleParam, contextProvider));
    this.stripeAccountIdProvider = InstanceFactory.create(stripeAccountIdProviderParam);
    this.retryDelaySupplierProvider = DoubleCheck.provider(RetryDelaySupplier_Factory.create());
    this.paymentIntentFlowResultProcessorProvider = DoubleCheck.provider(PaymentIntentFlowResultProcessor_Factory.create(contextProvider, publishableKeyProvider2, (Provider) stripeApiRepositoryProvider, provideLoggerProvider, provideWorkContextProvider, retryDelaySupplierProvider));
    this.setupIntentFlowResultProcessorProvider = DoubleCheck.provider(SetupIntentFlowResultProcessor_Factory.create(contextProvider, publishableKeyProvider2, (Provider) stripeApiRepositoryProvider, provideLoggerProvider, provideWorkContextProvider));
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

  private static final class Builder implements PaymentLauncherViewModelFactoryComponent.Builder {
    private Context context;

    private Boolean enableLogging;

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
    public PaymentLauncherViewModelFactoryComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(stripeAccountIdProvider, Function0.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      return new DaggerPaymentLauncherViewModelFactoryComponent(new PaymentLauncherModule(), new CoroutineContextModule(), new LoggingModule(), context, enableLogging, publishableKeyProvider, stripeAccountIdProvider, productUsage);
    }
  }

  private static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
    private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent;

    private Boolean isPaymentIntent;

    private SavedStateHandle savedStateHandle;

    private AuthActivityStarterHost authActivityStarterHost;

    private ActivityResultCaller activityResultCaller;

    private PaymentLauncherViewModelSubcomponentBuilder(
        DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent) {
      this.paymentLauncherViewModelFactoryComponent = paymentLauncherViewModelFactoryComponent;
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
      return new PaymentLauncherViewModelSubcomponentImpl(paymentLauncherViewModelFactoryComponent, isPaymentIntent, savedStateHandle, authActivityStarterHost, activityResultCaller);
    }
  }

  private static final class PaymentLauncherViewModelSubcomponentImpl implements PaymentLauncherViewModelSubcomponent {
    private final Boolean isPaymentIntent;

    private final AuthActivityStarterHost authActivityStarterHost;

    private final ActivityResultCaller activityResultCaller;

    private final SavedStateHandle savedStateHandle;

    private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent;

    private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl = this;

    private Provider<ApiRequest.Options> optionsProvider;

    private PaymentLauncherViewModelSubcomponentImpl(
        DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent,
        Boolean isPaymentIntentParam, SavedStateHandle savedStateHandleParam,
        AuthActivityStarterHost authActivityStarterHostParam,
        ActivityResultCaller activityResultCallerParam) {
      this.paymentLauncherViewModelFactoryComponent = paymentLauncherViewModelFactoryComponent;
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
      this.optionsProvider = ApiRequest_Options_Factory.create(paymentLauncherViewModelFactoryComponent.publishableKeyProvider2, paymentLauncherViewModelFactoryComponent.stripeAccountIdProvider);
    }

    @Override
    public PaymentLauncherViewModel getViewModel() {
      return new PaymentLauncherViewModel(isPaymentIntent, paymentLauncherViewModelFactoryComponent.stripeApiRepository(), paymentLauncherViewModelFactoryComponent.providePaymentAuthenticatorRegistryProvider.get(), paymentLauncherViewModelFactoryComponent.provideDefaultReturnUrlProvider.get(), optionsProvider, paymentLauncherViewModelFactoryComponent.provideThreeDs1IntentReturnUrlMapProvider.get(), DoubleCheck.lazy(paymentLauncherViewModelFactoryComponent.paymentIntentFlowResultProcessorProvider), DoubleCheck.lazy(paymentLauncherViewModelFactoryComponent.setupIntentFlowResultProcessorProvider), paymentLauncherViewModelFactoryComponent.defaultAnalyticsRequestExecutor(), paymentLauncherViewModelFactoryComponent.paymentAnalyticsRequestFactory(), paymentLauncherViewModelFactoryComponent.provideUIContextProvider.get(), authActivityStarterHost, activityResultCaller, savedStateHandle);
    }
  }
}
