package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory implements Factory<InitChallengeRepository> {
  private final Stripe3dsTransactionViewModelModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<Stripe3ds2TransactionContract.Args> argsProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory(
      Stripe3dsTransactionViewModelModule module, Provider<Application> applicationProvider,
      Provider<Stripe3ds2TransactionContract.Args> argsProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.argsProvider = argsProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public InitChallengeRepository get() {
    return providesInitChallengeRepository(module, applicationProvider.get(), argsProvider.get(), workContextProvider.get());
  }

  public static Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory create(
      Stripe3dsTransactionViewModelModule module, Provider<Application> applicationProvider,
      Provider<Stripe3ds2TransactionContract.Args> argsProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory(module, applicationProvider, argsProvider, workContextProvider);
  }

  public static InitChallengeRepository providesInitChallengeRepository(
      Stripe3dsTransactionViewModelModule instance, Application application,
      Stripe3ds2TransactionContract.Args args, CoroutineContext workContext) {
    return Preconditions.checkNotNullFromProvides(instance.providesInitChallengeRepository(application, args, workContext));
  }
}
