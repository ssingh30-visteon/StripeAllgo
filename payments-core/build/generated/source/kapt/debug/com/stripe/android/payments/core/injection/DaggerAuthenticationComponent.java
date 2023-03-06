package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.Logger;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry_Factory;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Preconditions;
import java.util.Map;
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
public final class DaggerAuthenticationComponent implements AuthenticationComponent {
  private final StripeRepository stripeRepository;

  private final AnalyticsRequestExecutor analyticsRequestExecutor;

  private final PaymentAnalyticsRequestFactory analyticsRequestFactory;

  private final CoroutineContext workContext;

  private final DaggerAuthenticationComponent authenticationComponent = this;

  private Provider<DefaultPaymentAuthenticatorRegistry> defaultPaymentAuthenticatorRegistryProvider;

  private Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> providePaymentRelayStarterFactoryProvider;

  private Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;

  private Provider<Context> contextProvider;

  private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;

  private Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> providePaymentBrowserAuthStarterFactoryProvider;

  private Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<CoroutineContext> uiContextProvider;

  private Provider<Function0<String>> publishableKeyProvider;

  private Provider<SourceAuthenticator> sourceAuthenticatorProvider;

  private Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;

  private Provider<PaymentAuthenticator<StripeIntent>> provideWeChatAuthenticator$payments_core_debugProvider;

  private Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;

  private Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider;

  private Provider<OxxoAuthenticator> oxxoAuthenticatorProvider;

  private Provider<PaymentAuthConfig> providePaymentAuthConfigProvider;

  private Provider<String> injectorKeyProvider;

  private Provider<Set<String>> productUsageProvider;

  private Provider<Stripe3DS2Authenticator> stripe3DS2AuthenticatorProvider;

  private Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider;

  private Provider<CoroutineContext> workContextProvider;

  private Provider<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;

  private Provider<MessageVersionRegistry> provideMessageVersionRegistryProvider;

  private Provider<StripeRepository> stripeRepositoryProvider;

  private Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;

  private DaggerAuthenticationComponent(
      WeChatPayAuthenticatorModule weChatPayAuthenticatorModuleParam,
      LoggingModule loggingModuleParam, Context contextParam,
      StripeRepository stripeRepositoryParam,
      AnalyticsRequestExecutor analyticsRequestExecutorParam,
      PaymentAnalyticsRequestFactory analyticsRequestFactoryParam, Boolean enableLoggingParam,
      CoroutineContext workContextParam, CoroutineContext uiContextParam,
      Map<String, String> threeDs1IntentReturnUrlMapParam, String injectorKeyParam,
      Function0<String> publishableKeyProviderParam, Set<String> productUsageParam) {
    this.stripeRepository = stripeRepositoryParam;
    this.analyticsRequestExecutor = analyticsRequestExecutorParam;
    this.analyticsRequestFactory = analyticsRequestFactoryParam;
    this.workContext = workContextParam;
    initialize(weChatPayAuthenticatorModuleParam, loggingModuleParam, contextParam, stripeRepositoryParam, analyticsRequestExecutorParam, analyticsRequestFactoryParam, enableLoggingParam, workContextParam, uiContextParam, threeDs1IntentReturnUrlMapParam, injectorKeyParam, publishableKeyProviderParam, productUsageParam);

  }

  public static AuthenticationComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final WeChatPayAuthenticatorModule weChatPayAuthenticatorModuleParam,
      final LoggingModule loggingModuleParam, final Context contextParam,
      final StripeRepository stripeRepositoryParam,
      final AnalyticsRequestExecutor analyticsRequestExecutorParam,
      final PaymentAnalyticsRequestFactory analyticsRequestFactoryParam,
      final Boolean enableLoggingParam, final CoroutineContext workContextParam,
      final CoroutineContext uiContextParam,
      final Map<String, String> threeDs1IntentReturnUrlMapParam, final String injectorKeyParam,
      final Function0<String> publishableKeyProviderParam, final Set<String> productUsageParam) {
    this.defaultPaymentAuthenticatorRegistryProvider = new DelegateFactory<>();
    this.providePaymentRelayStarterFactoryProvider = DoubleCheck.provider(AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory.create(defaultPaymentAuthenticatorRegistryProvider));
    this.noOpIntentAuthenticatorProvider = DoubleCheck.provider(NoOpIntentAuthenticator_Factory.create(providePaymentRelayStarterFactoryProvider));
    this.contextProvider = InstanceFactory.create(contextParam);
    this.provideDefaultReturnUrlProvider = DoubleCheck.provider(AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory.create(contextProvider));
    this.providePaymentBrowserAuthStarterFactoryProvider = DoubleCheck.provider(AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory.create(defaultPaymentAuthenticatorRegistryProvider, provideDefaultReturnUrlProvider));
    this.analyticsRequestExecutorProvider = InstanceFactory.create(analyticsRequestExecutorParam);
    this.analyticsRequestFactoryProvider = InstanceFactory.create(analyticsRequestFactoryParam);
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.uiContextProvider = InstanceFactory.create(uiContextParam);
    this.publishableKeyProvider = InstanceFactory.create(publishableKeyProviderParam);
    this.sourceAuthenticatorProvider = DoubleCheck.provider(SourceAuthenticator_Factory.create(providePaymentBrowserAuthStarterFactoryProvider, providePaymentRelayStarterFactoryProvider, analyticsRequestExecutorProvider, analyticsRequestFactoryProvider, enableLoggingProvider, uiContextProvider, publishableKeyProvider));
    this.unsupportedAuthenticatorProvider = DoubleCheck.provider(UnsupportedAuthenticator_Factory.create(providePaymentRelayStarterFactoryProvider));
    this.provideWeChatAuthenticator$payments_core_debugProvider = WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_debugFactory.create(weChatPayAuthenticatorModuleParam, unsupportedAuthenticatorProvider);
    this.threeDs1IntentReturnUrlMapProvider = InstanceFactory.create(threeDs1IntentReturnUrlMapParam);
    this.webIntentAuthenticatorProvider = DoubleCheck.provider(WebIntentAuthenticator_Factory.create(providePaymentBrowserAuthStarterFactoryProvider, analyticsRequestExecutorProvider, analyticsRequestFactoryProvider, enableLoggingProvider, uiContextProvider, threeDs1IntentReturnUrlMapProvider, publishableKeyProvider));
    this.oxxoAuthenticatorProvider = DoubleCheck.provider(OxxoAuthenticator_Factory.create(webIntentAuthenticatorProvider, noOpIntentAuthenticatorProvider));
    this.providePaymentAuthConfigProvider = DoubleCheck.provider(Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory.create());
    this.injectorKeyProvider = InstanceFactory.create(injectorKeyParam);
    this.productUsageProvider = InstanceFactory.create(productUsageParam);
    this.stripe3DS2AuthenticatorProvider = DoubleCheck.provider(Stripe3DS2Authenticator_Factory.create(providePaymentAuthConfigProvider, enableLoggingProvider, injectorKeyProvider, publishableKeyProvider, productUsageProvider));
    this.intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider = MapFactory.<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>builder(6).put(StripeIntent.NextActionData.WeChatPayRedirect.class, provideWeChatAuthenticator$payments_core_debugProvider).put(StripeIntent.NextActionData.SdkData.Use3DS1.class, (Provider) webIntentAuthenticatorProvider).put(StripeIntent.NextActionData.RedirectToUrl.class, (Provider) webIntentAuthenticatorProvider).put(StripeIntent.NextActionData.AlipayRedirect.class, (Provider) webIntentAuthenticatorProvider).put(StripeIntent.NextActionData.DisplayOxxoDetails.class, (Provider) oxxoAuthenticatorProvider).put(StripeIntent.NextActionData.SdkData.Use3DS2.class, (Provider) stripe3DS2AuthenticatorProvider).build();
    DelegateFactory.setDelegate(defaultPaymentAuthenticatorRegistryProvider, DoubleCheck.provider(DefaultPaymentAuthenticatorRegistry_Factory.create(noOpIntentAuthenticatorProvider, sourceAuthenticatorProvider, intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider)));
    this.workContextProvider = InstanceFactory.create(workContextParam);
    this.provideStripeThreeDs2ServiceProvider = DoubleCheck.provider(Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory.create(contextProvider, enableLoggingProvider, workContextProvider));
    this.provideMessageVersionRegistryProvider = DoubleCheck.provider(Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory.create());
    this.stripeRepositoryProvider = InstanceFactory.create(stripeRepositoryParam);
    this.retryDelaySupplierProvider = DoubleCheck.provider(RetryDelaySupplier_Factory.create());
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.defaultStripe3ds2ChallengeResultProcessorProvider = DoubleCheck.provider(DefaultStripe3ds2ChallengeResultProcessor_Factory.create(stripeRepositoryProvider, analyticsRequestExecutorProvider, analyticsRequestFactoryProvider, retryDelaySupplierProvider, provideLoggerProvider, workContextProvider));
  }

  @Override
  public DefaultPaymentAuthenticatorRegistry getRegistry() {
    return defaultPaymentAuthenticatorRegistryProvider.get();
  }

  @Override
  public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
    injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
  }

  private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(
      Stripe3ds2TransactionViewModelFactory instance) {
    Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(instance, new Stripe3ds2TransactionViewModelSubcomponentBuilder(authenticationComponent));
    return instance;
  }

  private static final class Builder implements AuthenticationComponent.Builder {
    private Context context;

    private StripeRepository stripeRepository;

    private AnalyticsRequestExecutor analyticsRequestExecutor;

    private PaymentAnalyticsRequestFactory analyticsRequestFactory;

    private Boolean enableLogging;

    private CoroutineContext workContext;

    private CoroutineContext uiContext;

    private Map<String, String> threeDs1IntentReturnUrlMap;

    private String injectorKey;

    private Function0<String> publishableKeyProvider;

    private Set<String> productUsage;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public Builder stripeRepository(StripeRepository stripeRepository) {
      this.stripeRepository = Preconditions.checkNotNull(stripeRepository);
      return this;
    }

    @Override
    public Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor) {
      this.analyticsRequestExecutor = Preconditions.checkNotNull(analyticsRequestExecutor);
      return this;
    }

    @Override
    public Builder analyticsRequestFactory(
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
      this.analyticsRequestFactory = Preconditions.checkNotNull(paymentAnalyticsRequestFactory);
      return this;
    }

    @Override
    public Builder enableLogging(boolean enableLogging) {
      this.enableLogging = Preconditions.checkNotNull(enableLogging);
      return this;
    }

    @Override
    public Builder workContext(CoroutineContext workContext) {
      this.workContext = Preconditions.checkNotNull(workContext);
      return this;
    }

    @Override
    public Builder uiContext(CoroutineContext uiContext) {
      this.uiContext = Preconditions.checkNotNull(uiContext);
      return this;
    }

    @Override
    public Builder threeDs1IntentReturnUrlMap(Map<String, String> threeDs1IntentReturnUrlMap) {
      this.threeDs1IntentReturnUrlMap = Preconditions.checkNotNull(threeDs1IntentReturnUrlMap);
      return this;
    }

    @Override
    public Builder injectorKey(String id) {
      this.injectorKey = Preconditions.checkNotNull(id);
      return this;
    }

    @Override
    public Builder publishableKeyProvider(Function0<String> publishableKeyProvider) {
      this.publishableKeyProvider = Preconditions.checkNotNull(publishableKeyProvider);
      return this;
    }

    @Override
    public Builder productUsage(Set<String> productUsage) {
      this.productUsage = Preconditions.checkNotNull(productUsage);
      return this;
    }

    @Override
    public AuthenticationComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(stripeRepository, StripeRepository.class);
      Preconditions.checkBuilderRequirement(analyticsRequestExecutor, AnalyticsRequestExecutor.class);
      Preconditions.checkBuilderRequirement(analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(workContext, CoroutineContext.class);
      Preconditions.checkBuilderRequirement(uiContext, CoroutineContext.class);
      Preconditions.checkBuilderRequirement(threeDs1IntentReturnUrlMap, Map.class);
      Preconditions.checkBuilderRequirement(injectorKey, String.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      return new DaggerAuthenticationComponent(new WeChatPayAuthenticatorModule(), new LoggingModule(), context, stripeRepository, analyticsRequestExecutor, analyticsRequestFactory, enableLogging, workContext, uiContext, threeDs1IntentReturnUrlMap, injectorKey, publishableKeyProvider, productUsage);
    }
  }

  private static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
    private final DaggerAuthenticationComponent authenticationComponent;

    private Stripe3ds2TransactionContract.Args args;

    private SavedStateHandle savedStateHandle;

    private Application application;

    private Stripe3ds2TransactionViewModelSubcomponentBuilder(
        DaggerAuthenticationComponent authenticationComponent) {
      this.authenticationComponent = authenticationComponent;
    }

    @Override
    public Stripe3ds2TransactionViewModelSubcomponentBuilder args(
        Stripe3ds2TransactionContract.Args args) {
      this.args = Preconditions.checkNotNull(args);
      return this;
    }

    @Override
    public Stripe3ds2TransactionViewModelSubcomponentBuilder savedStateHandle(
        SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public Stripe3ds2TransactionViewModelSubcomponentBuilder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public Stripe3ds2TransactionViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(args, Stripe3ds2TransactionContract.Args.class);
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new Stripe3ds2TransactionViewModelSubcomponentImpl(authenticationComponent, new Stripe3dsTransactionViewModelModule(), args, savedStateHandle, application);
    }
  }

  private static final class Stripe3ds2TransactionViewModelSubcomponentImpl implements Stripe3ds2TransactionViewModelSubcomponent {
    private final Stripe3ds2TransactionContract.Args args;

    private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

    private final Application application;

    private final SavedStateHandle savedStateHandle;

    private final DaggerAuthenticationComponent authenticationComponent;

    private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl = this;

    private Stripe3ds2TransactionViewModelSubcomponentImpl(
        DaggerAuthenticationComponent authenticationComponent,
        Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModuleParam,
        Stripe3ds2TransactionContract.Args argsParam, SavedStateHandle savedStateHandleParam,
        Application applicationParam) {
      this.authenticationComponent = authenticationComponent;
      this.args = argsParam;
      this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModuleParam;
      this.application = applicationParam;
      this.savedStateHandle = savedStateHandleParam;

    }

    private InitChallengeRepository initChallengeRepository() {
      return Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory.providesInitChallengeRepository(stripe3dsTransactionViewModelModule, application, args, authenticationComponent.workContext);
    }

    @Override
    public Stripe3ds2TransactionViewModel getViewModel() {
      return new Stripe3ds2TransactionViewModel(args, authenticationComponent.stripeRepository, authenticationComponent.analyticsRequestExecutor, authenticationComponent.analyticsRequestFactory, authenticationComponent.provideStripeThreeDs2ServiceProvider.get(), authenticationComponent.provideMessageVersionRegistryProvider.get(), authenticationComponent.defaultStripe3ds2ChallengeResultProcessorProvider.get(), initChallengeRepository(), authenticationComponent.workContext, savedStateHandle);
    }
  }
}
