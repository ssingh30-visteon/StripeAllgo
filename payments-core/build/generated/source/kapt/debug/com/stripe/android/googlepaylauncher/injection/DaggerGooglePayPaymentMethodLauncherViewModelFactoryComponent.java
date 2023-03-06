package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.Logger;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory_Factory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.payments.core.injection.LoggingModule;
import com.stripe.android.payments.core.injection.LoggingModule_ProvideLoggerFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
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
public final class DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent implements GooglePayPaymentMethodLauncherViewModelFactoryComponent {
  private final Function0<String> publishableKeyProvider;

  private final Function0<String> stripeAccountIdProvider;

  private final Context context;

  private final Set<String> productUsage;

  private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent = this;

  private Provider<Context> contextProvider;

  private Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;

  private Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

  private Provider<PaymentsClient> providePaymentsClientProvider;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<Function0<String>> publishableKeyProvider2;

  private Provider<Function0<String>> stripeAccountIdProvider2;

  private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;

  private Provider<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;

  private DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent(
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Context contextParam, Boolean enableLoggingParam,
      Function0<String> publishableKeyProviderParam, Function0<String> stripeAccountIdProviderParam,
      Set<String> productUsageParam, GooglePayPaymentMethodLauncher.Config googlePayConfigParam) {
    this.publishableKeyProvider = publishableKeyProviderParam;
    this.stripeAccountIdProvider = stripeAccountIdProviderParam;
    this.context = contextParam;
    this.productUsage = productUsageParam;
    initialize(coroutineContextModuleParam, loggingModuleParam, contextParam, enableLoggingParam, publishableKeyProviderParam, stripeAccountIdProviderParam, productUsageParam, googlePayConfigParam);

  }

  public static GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder builder() {
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
  private void initialize(final CoroutineContextModule coroutineContextModuleParam,
      final LoggingModule loggingModuleParam, final Context contextParam,
      final Boolean enableLoggingParam, final Function0<String> publishableKeyProviderParam,
      final Function0<String> stripeAccountIdProviderParam, final Set<String> productUsageParam,
      final GooglePayPaymentMethodLauncher.Config googlePayConfigParam) {
    this.contextProvider = InstanceFactory.create(contextParam);
    this.googlePayConfigProvider = InstanceFactory.create(googlePayConfigParam);
    this.paymentsClientFactoryProvider = PaymentsClientFactory_Factory.create(contextProvider);
    this.providePaymentsClientProvider = DoubleCheck.provider(GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory.create(contextProvider, googlePayConfigProvider, paymentsClientFactoryProvider));
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.publishableKeyProvider2 = InstanceFactory.create(publishableKeyProviderParam);
    this.stripeAccountIdProvider2 = InstanceFactory.create(stripeAccountIdProviderParam);
    this.googlePayJsonFactoryProvider = DoubleCheck.provider(GooglePayJsonFactory_Factory.create(publishableKeyProvider2, stripeAccountIdProvider2, googlePayConfigProvider));
    this.defaultGooglePayRepositoryProvider = DoubleCheck.provider(DefaultGooglePayRepository_Factory.create(contextProvider, googlePayConfigProvider, provideLoggerProvider));
  }

  @Override
  public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
    injectFactory(factory);
  }

  private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(
      GooglePayPaymentMethodLauncherViewModel.Factory instance) {
    GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(instance, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(googlePayPaymentMethodLauncherViewModelFactoryComponent));
    return instance;
  }

  private static final class Builder implements GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder {
    private Context context;

    private Boolean enableLogging;

    private Function0<String> publishableKeyProvider;

    private Function0<String> stripeAccountIdProvider;

    private Set<String> productUsage;

    private GooglePayPaymentMethodLauncher.Config googlePayConfig;

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
    public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
      this.googlePayConfig = Preconditions.checkNotNull(config);
      return this;
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModelFactoryComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(stripeAccountIdProvider, Function0.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      Preconditions.checkBuilderRequirement(googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
      return new DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent(new CoroutineContextModule(), new LoggingModule(), context, enableLogging, publishableKeyProvider, stripeAccountIdProvider, productUsage, googlePayConfig);
    }
  }

  private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
    private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent;

    private GooglePayPaymentMethodLauncherContract.Args args;

    private SavedStateHandle savedStateHandle;

    private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(
        DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent) {
      this.googlePayPaymentMethodLauncherViewModelFactoryComponent = googlePayPaymentMethodLauncherViewModelFactoryComponent;
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder args(
        GooglePayPaymentMethodLauncherContract.Args args) {
      this.args = Preconditions.checkNotNull(args);
      return this;
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder savedStateHandle(
        SavedStateHandle savedStateHandle) {
      this.savedStateHandle = Preconditions.checkNotNull(savedStateHandle);
      return this;
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(args, GooglePayPaymentMethodLauncherContract.Args.class);
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(googlePayPaymentMethodLauncherViewModelFactoryComponent, args, savedStateHandle);
    }
  }

  private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
    private final GooglePayPaymentMethodLauncherContract.Args args;

    private final SavedStateHandle savedStateHandle;

    private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent;

    private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;

    private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(
        DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent,
        GooglePayPaymentMethodLauncherContract.Args argsParam,
        SavedStateHandle savedStateHandleParam) {
      this.googlePayPaymentMethodLauncherViewModelFactoryComponent = googlePayPaymentMethodLauncherViewModelFactoryComponent;
      this.args = argsParam;
      this.savedStateHandle = savedStateHandleParam;

    }

    private ApiRequest.Options options() {
      return new ApiRequest.Options(googlePayPaymentMethodLauncherViewModelFactoryComponent.publishableKeyProvider, googlePayPaymentMethodLauncherViewModelFactoryComponent.stripeAccountIdProvider);
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModel getViewModel() {
      return new GooglePayPaymentMethodLauncherViewModel(googlePayPaymentMethodLauncherViewModelFactoryComponent.providePaymentsClientProvider.get(), options(), args, googlePayPaymentMethodLauncherViewModelFactoryComponent.stripeApiRepository(), googlePayPaymentMethodLauncherViewModelFactoryComponent.googlePayJsonFactoryProvider.get(), googlePayPaymentMethodLauncherViewModelFactoryComponent.defaultGooglePayRepositoryProvider.get(), savedStateHandle);
    }
  }
}
