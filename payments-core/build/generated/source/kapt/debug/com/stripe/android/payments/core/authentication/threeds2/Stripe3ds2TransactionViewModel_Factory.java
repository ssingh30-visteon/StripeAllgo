package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Stripe3ds2TransactionViewModel_Factory implements Factory<Stripe3ds2TransactionViewModel> {
  private final Provider<Stripe3ds2TransactionContract.Args> argsProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<StripeThreeDs2Service> threeDs2ServiceProvider;

  private final Provider<MessageVersionRegistry> messageVersionRegistryProvider;

  private final Provider<Stripe3ds2ChallengeResultProcessor> challengeResultProcessorProvider;

  private final Provider<InitChallengeRepository> initChallengeRepositoryProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public Stripe3ds2TransactionViewModel_Factory(
      Provider<Stripe3ds2TransactionContract.Args> argsProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<StripeThreeDs2Service> threeDs2ServiceProvider,
      Provider<MessageVersionRegistry> messageVersionRegistryProvider,
      Provider<Stripe3ds2ChallengeResultProcessor> challengeResultProcessorProvider,
      Provider<InitChallengeRepository> initChallengeRepositoryProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.argsProvider = argsProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.threeDs2ServiceProvider = threeDs2ServiceProvider;
    this.messageVersionRegistryProvider = messageVersionRegistryProvider;
    this.challengeResultProcessorProvider = challengeResultProcessorProvider;
    this.initChallengeRepositoryProvider = initChallengeRepositoryProvider;
    this.workContextProvider = workContextProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public Stripe3ds2TransactionViewModel get() {
    return newInstance(argsProvider.get(), stripeRepositoryProvider.get(), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), threeDs2ServiceProvider.get(), messageVersionRegistryProvider.get(), challengeResultProcessorProvider.get(), initChallengeRepositoryProvider.get(), workContextProvider.get(), savedStateHandleProvider.get());
  }

  public static Stripe3ds2TransactionViewModel_Factory create(
      Provider<Stripe3ds2TransactionContract.Args> argsProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<StripeThreeDs2Service> threeDs2ServiceProvider,
      Provider<MessageVersionRegistry> messageVersionRegistryProvider,
      Provider<Stripe3ds2ChallengeResultProcessor> challengeResultProcessorProvider,
      Provider<InitChallengeRepository> initChallengeRepositoryProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new Stripe3ds2TransactionViewModel_Factory(argsProvider, stripeRepositoryProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, threeDs2ServiceProvider, messageVersionRegistryProvider, challengeResultProcessorProvider, initChallengeRepositoryProvider, workContextProvider, savedStateHandleProvider);
  }

  public static Stripe3ds2TransactionViewModel newInstance(Stripe3ds2TransactionContract.Args args,
      StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory,
      StripeThreeDs2Service threeDs2Service, MessageVersionRegistry messageVersionRegistry,
      Stripe3ds2ChallengeResultProcessor challengeResultProcessor,
      InitChallengeRepository initChallengeRepository, CoroutineContext workContext,
      SavedStateHandle savedStateHandle) {
    return new Stripe3ds2TransactionViewModel(args, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, threeDs2Service, messageVersionRegistry, challengeResultProcessor, initChallengeRepository, workContext, savedStateHandle);
  }
}
