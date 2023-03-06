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
public final class FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory implements Factory<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> {
  private final Provider<Context> appContextProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory(
      Provider<Context> appContextProvider, Provider<CoroutineContext> workContextProvider) {
    this.appContextProvider = appContextProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> get() {
    return providePrefsRepositoryFactory(appContextProvider.get(), workContextProvider.get());
  }

  public static FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory create(
      Provider<Context> appContextProvider, Provider<CoroutineContext> workContextProvider) {
    return new FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory(appContextProvider, workContextProvider);
  }

  public static Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(
      Context appContext, CoroutineContext workContext) {
    return Preconditions.checkNotNullFromProvides(FlowControllerModule.Companion.providePrefsRepositoryFactory(appContext, workContext));
  }
}
