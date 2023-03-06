package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.Logger;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
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
public final class DaggerStripe3ds2TransactionViewModelFactoryComponent implements Stripe3ds2TransactionViewModelFactoryComponent {
  private final Context context;

  private final Function0<String> publishableKeyProvider;

  private final Set<String> productUsage;

  private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent = this;

  private Provider<CoroutineContext> provideWorkContextProvider;

  private Provider<Boolean> enableLoggingProvider;

  private Provider<Logger> provideLoggerProvider;

  private Provider<Context> contextProvider;

  private Provider<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;

  private Provider<MessageVersionRegistry> provideMessageVersionRegistryProvider;

  private Provider<Function0<String>> publishableKeyProvider2;

  private Provider<Set<String>> productUsageProvider;

  private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private Provider<StripeApiRepository> stripeApiRepositoryProvider;

  private Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  private Provider<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;

  private DaggerStripe3ds2TransactionViewModelFactoryComponent(
      CoroutineContextModule coroutineContextModuleParam, LoggingModule loggingModuleParam,
      Context contextParam, Boolean enableLoggingParam,
      Function0<String> publishableKeyProviderParam, Set<String> productUsageParam) {
    this.context = contextParam;
    this.publishableKeyProvider = publishableKeyProviderParam;
    this.productUsage = productUsageParam;
    initialize(coroutineContextModuleParam, loggingModuleParam, contextParam, enableLoggingParam, publishableKeyProviderParam, productUsageParam);

  }

  public static Stripe3ds2TransactionViewModelFactoryComponent.Builder builder() {
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
      final Set<String> productUsageParam) {
    this.provideWorkContextProvider = DoubleCheck.provider(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModuleParam));
    this.enableLoggingProvider = InstanceFactory.create(enableLoggingParam);
    this.provideLoggerProvider = DoubleCheck.provider(LoggingModule_ProvideLoggerFactory.create(loggingModuleParam, enableLoggingProvider));
    this.contextProvider = InstanceFactory.create(contextParam);
    this.provideStripeThreeDs2ServiceProvider = DoubleCheck.provider(Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory.create(contextProvider, enableLoggingProvider, provideWorkContextProvider));
    this.provideMessageVersionRegistryProvider = DoubleCheck.provider(Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory.create());
    this.publishableKeyProvider2 = InstanceFactory.create(publishableKeyProviderParam);
    this.productUsageProvider = InstanceFactory.create(productUsageParam);
    this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(contextProvider, publishableKeyProvider2, productUsageProvider);
    this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(provideLoggerProvider, provideWorkContextProvider);
    this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(contextProvider, publishableKeyProvider2, provideWorkContextProvider, productUsageProvider, paymentAnalyticsRequestFactoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, provideLoggerProvider);
    this.retryDelaySupplierProvider = DoubleCheck.provider(RetryDelaySupplier_Factory.create());
    this.defaultStripe3ds2ChallengeResultProcessorProvider = DoubleCheck.provider(DefaultStripe3ds2ChallengeResultProcessor_Factory.create((Provider) stripeApiRepositoryProvider, (Provider) defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, retryDelaySupplierProvider, provideLoggerProvider, provideWorkContextProvider));
  }

  @Override
  public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
    injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
  }

  private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(
      Stripe3ds2TransactionViewModelFactory instance) {
    Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(instance, new Stripe3ds2TransactionViewModelSubcomponentBuilder(stripe3ds2TransactionViewModelFactoryComponent));
    return instance;
  }

  private static final class Builder implements Stripe3ds2TransactionViewModelFactoryComponent.Builder {
    private Context context;

    private Boolean enableLogging;

    private Function0<String> publishableKeyProvider;

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
    public Builder productUsage(Set<String> productUsage) {
      this.productUsage = Preconditions.checkNotNull(productUsage);
      return this;
    }

    @Override
    public Stripe3ds2TransactionViewModelFactoryComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      Preconditions.checkBuilderRequirement(enableLogging, Boolean.class);
      Preconditions.checkBuilderRequirement(publishableKeyProvider, Function0.class);
      Preconditions.checkBuilderRequirement(productUsage, Set.class);
      return new DaggerStripe3ds2TransactionViewModelFactoryComponent(new CoroutineContextModule(), new LoggingModule(), context, enableLogging, publishableKeyProvider, productUsage);
    }
  }

  private static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
    private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent;

    private Stripe3ds2TransactionContract.Args args;

    private SavedStateHandle savedStateHandle;

    private Application application;

    private Stripe3ds2TransactionViewModelSubcomponentBuilder(
        DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent) {
      this.stripe3ds2TransactionViewModelFactoryComponent = stripe3ds2TransactionViewModelFactoryComponent;
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
      return new Stripe3ds2TransactionViewModelSubcomponentImpl(stripe3ds2TransactionViewModelFactoryComponent, new Stripe3dsTransactionViewModelModule(), args, savedStateHandle, application);
    }
  }

  private static final class Stripe3ds2TransactionViewModelSubcomponentImpl implements Stripe3ds2TransactionViewModelSubcomponent {
    private final Stripe3ds2TransactionContract.Args args;

    private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

    private final Application application;

    private final SavedStateHandle savedStateHandle;

    private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent;

    private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl = this;

    private Stripe3ds2TransactionViewModelSubcomponentImpl(
        DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent,
        Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModuleParam,
        Stripe3ds2TransactionContract.Args argsParam, SavedStateHandle savedStateHandleParam,
        Application applicationParam) {
      this.stripe3ds2TransactionViewModelFactoryComponent = stripe3ds2TransactionViewModelFactoryComponent;
      this.args = argsParam;
      this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModuleParam;
      this.application = applicationParam;
      this.savedStateHandle = savedStateHandleParam;

    }

    private InitChallengeRepository initChallengeRepository() {
      return Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory.providesInitChallengeRepository(stripe3dsTransactionViewModelModule, application, args, stripe3ds2TransactionViewModelFactoryComponent.provideWorkContextProvider.get());
    }

    @Override
    public Stripe3ds2TransactionViewModel getViewModel() {
      return new Stripe3ds2TransactionViewModel(args, stripe3ds2TransactionViewModelFactoryComponent.stripeApiRepository(), stripe3ds2TransactionViewModelFactoryComponent.defaultAnalyticsRequestExecutor(), stripe3ds2TransactionViewModelFactoryComponent.paymentAnalyticsRequestFactory(), stripe3ds2TransactionViewModelFactoryComponent.provideStripeThreeDs2ServiceProvider.get(), stripe3ds2TransactionViewModelFactoryComponent.provideMessageVersionRegistryProvider.get(), stripe3ds2TransactionViewModelFactoryComponent.defaultStripe3ds2ChallengeResultProcessorProvider.get(), initChallengeRepository(), stripe3ds2TransactionViewModelFactoryComponent.provideWorkContextProvider.get(), savedStateHandle);
    }
  }
}
