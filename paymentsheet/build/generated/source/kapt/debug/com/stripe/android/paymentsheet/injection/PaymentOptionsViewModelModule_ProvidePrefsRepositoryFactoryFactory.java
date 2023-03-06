package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
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
public final class PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory implements Factory<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
  private final PaymentOptionsViewModelModule module;

  private final Provider<Context> appContextProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory(
      PaymentOptionsViewModelModule module, Provider<Context> appContextProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
    return providePrefsRepositoryFactory(module, appContextProvider.get(), workContextProvider.get());
  }

  public static PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory create(
      PaymentOptionsViewModelModule module, Provider<Context> appContextProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory(module, appContextProvider, workContextProvider);
  }

  public static Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(
      PaymentOptionsViewModelModule instance, Context appContext, CoroutineContext workContext) {
    return Preconditions.checkNotNullFromProvides(instance.providePrefsRepositoryFactory(appContext, workContext));
  }
}
