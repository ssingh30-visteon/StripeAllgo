package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.Logger;
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
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.injection.LoggingModule;
import com.stripe.android.payments.core.injection.LoggingModule_ProvideLoggerFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
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
public final class DaggerGooglePayPaymentMethodLauncherComponent extends GooglePayPaymentMethodLauncherComponent {
  private final Function0<String> publishableKeyProvider;

  private final Function0<String> stripeAccountIdProvider;

  private final StripeRepository stripeRepository;

  private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent = this;

  private Provider<Context> contextProvider;

  private Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;

  private Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

  private Provider<PaymentsClient> providePaymentsClientProvider;

  private Provider<Function0<String>> publishableKeyProvider2;

  private Provider<Function0<String>> stripeAccountIdProvider2;

  private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;

  private DaggerGooglePayPaymentMethodLauncherComponent(LoggingModule loggingModuleParam,
      Context contextParam, CoroutineContext ioContextParam,
      PaymentAnalyticsRequestFactory analyticsRequestFactoryParam,
      StripeRepository stripeRepositoryParam,
      GooglePayPaymentMethodLauncher.Config googlePayConfigParam, Boolean enableLoggingParam,
      Function0<String> publishableKeyProviderParam,
      Function0<String> stripeAccountIdProviderParam) {
    this.publishableKeyProvider = publishableKeyProviderParam;
    this.stripeAccountIdProvider = stripeAccountIdProviderParam;
    this.stripeRepository = stripeRepositoryParam;
    initialize(loggingModuleParam, contextParam, ioContextParam, analyticsRequestFactoryParam, stripeRepositoryParam, googlePayConfigParam, enableLoggingParam, publishableKeyProviderParam, stripeAccountIdProviderParam);

  }

  public static GooglePayPaymentMethodLauncherComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final LoggingModule loggingModuleParam, final Context contextParam,
      final CoroutineContext ioContextParam,
      final PaymentAnalyticsRequestFactory analyticsRequestFactoryParam,
      final StripeRepository stripeRepositoryParam,
      final GooglePayPaymentMethodLauncher.Config googlePayConfigParam,
      final Boolean enableLoggingParam, final Function0<String> publishableKeyProviderParam,
      final Function0<String> stripeAccountIdProviderParam) {
    this.contextProvider = InstanceFactory.create(contextParam);
    this.googlePayConfigProvider = InstanceFactory.create(googlePayConfigParam);
    this.paymentsClientFactoryProvider = PaymentsClientFactory_Factory.create(contextProvider);
    this.providePaymentsClientProvider = DoubleCheck.provider(GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory.create(contextProvider, googlePayConfigProvider, paymentsClientFactoryProvider));
    this.publishableKeyProvider2 = InstanceFactory.create(publishableKeyProviderParam);
    this.stripeAccountIdProvider2 = InstanceFactory.create(stripeAccountIdProviderParam);
    this.googlePayJsonFactoryProvider = DoubleCheck.provider(GooglePayJsonFactory_Factory.create(publishableKeyProvider2, stripeAccountIdProvider2, googlePayConfigProvider));
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.defaultGooglePayRepositoryProvider = DoubleCheck.provider(DefaultGooglePayRepository_Factory.create(contextProvider, googlePayConfigProvider, provideLoggerProvider));
  }

  @Override
  public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
    injectFactory(factory);
  }

  private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(
      GooglePayPaymentMethodLauncherViewModel.Factory instance) {
    GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(instance, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(googlePayPaymentMethodLauncherComponent));
    return instance;
  }

  private static final class Builder implements GooglePayPaymentMethodLauncherComponent.Builder {
    private Context context;

    private CoroutineContext ioContext;

    private PaymentAnalyticsRequestFactory analyticsRequestFactory;

    private StripeRepository stripeRepository;

    private GooglePayPaymentMethodLauncher.Config googlePayConfig;

    private Boolean enableLogging;

    private Function0<String> publishableKeyProvider;

    private Function0<String> stripeAccountIdProvider;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public Builder ioContext(CoroutineContext workContext) {
      this.ioContext = Preconditions.checkNotNull(workContext);
      return this;
    }

    @Override
    public Builder analyticsRequestFactory(
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
      this.analyticsRequestFactory = Preconditions.checkNotNull(paymentAnalyticsRequestFactory);
      return this;
    }

    @Override
    public Builder stripeRepository(StripeRepository stripeRepository) {
      this.stripeRepository = Preconditions.checkNotNull(stripeRepository);
      return this;
    }

    @Override
    public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
      this.googlePayConfig = Preconditions.checkNotNull(config);
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
    public GooglePayPaymentMethodLauncherComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(ioContext, CoroutineContext.class);
      Preconditions.checkBuilderRequirement(analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
      Preconditions.checkBuilderRequirement(stripeRepository, StripeRepository.class);
      Preconditions.checkBuilderRequirement(googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(stripeAccountIdProvider, Function0.class);
      return new DaggerGooglePayPaymentMethodLauncherComponent(new LoggingModule(), context, ioContext, analyticsRequestFactory, stripeRepository, googlePayConfig, enableLogging, publishableKeyProvider, stripeAccountIdProvider);
    }
  }

  private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
    private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;

    private GooglePayPaymentMethodLauncherContract.Args args;

    private SavedStateHandle savedStateHandle;

    private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(
        DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent) {
      this.googlePayPaymentMethodLauncherComponent = googlePayPaymentMethodLauncherComponent;
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
      return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(googlePayPaymentMethodLauncherComponent, args, savedStateHandle);
    }
  }

  private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
    private final GooglePayPaymentMethodLauncherContract.Args args;

    private final SavedStateHandle savedStateHandle;

    private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;

    private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;

    private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(
        DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent,
        GooglePayPaymentMethodLauncherContract.Args argsParam,
        SavedStateHandle savedStateHandleParam) {
      this.googlePayPaymentMethodLauncherComponent = googlePayPaymentMethodLauncherComponent;
      this.args = argsParam;
      this.savedStateHandle = savedStateHandleParam;

    }

    private ApiRequest.Options options() {
      return new ApiRequest.Options(googlePayPaymentMethodLauncherComponent.publishableKeyProvider, googlePayPaymentMethodLauncherComponent.stripeAccountIdProvider);
    }

    @Override
    public GooglePayPaymentMethodLauncherViewModel getViewModel() {
      return new GooglePayPaymentMethodLauncherViewModel(googlePayPaymentMethodLauncherComponent.providePaymentsClientProvider.get(), options(), args, googlePayPaymentMethodLauncherComponent.stripeRepository, googlePayPaymentMethodLauncherComponent.googlePayJsonFactoryProvider.get(), googlePayPaymentMethodLauncherComponent.defaultGooglePayRepositoryProvider.get(), savedStateHandle);
    }
  }
}
