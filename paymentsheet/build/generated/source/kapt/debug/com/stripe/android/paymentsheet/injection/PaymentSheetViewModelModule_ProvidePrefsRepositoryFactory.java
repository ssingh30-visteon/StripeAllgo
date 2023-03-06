package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.PrefsRepository;
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
public final class PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory implements Factory<PrefsRepository> {
  private final PaymentSheetViewModelModule module;

  private final Provider<Context> appContextProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(
      PaymentSheetViewModelModule module, Provider<Context> appContextProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public PrefsRepository get() {
    return providePrefsRepository(module, appContextProvider.get(), workContextProvider.get());
  }

  public static PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory create(
      PaymentSheetViewModelModule module, Provider<Context> appContextProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory(module, appContextProvider, workContextProvider);
  }

  public static PrefsRepository providePrefsRepository(PaymentSheetViewModelModule instance,
      Context appContext, CoroutineContext workContext) {
    return Preconditions.checkNotNullFromProvides(instance.providePrefsRepository(appContext, workContext));
  }
}
