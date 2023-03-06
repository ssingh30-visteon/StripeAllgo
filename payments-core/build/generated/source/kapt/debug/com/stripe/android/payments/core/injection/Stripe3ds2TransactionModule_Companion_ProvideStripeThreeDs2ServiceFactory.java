package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
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
public final class Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory implements Factory<StripeThreeDs2Service> {
  private final Provider<Context> contextProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(
      Provider<Context> contextProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.contextProvider = contextProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public StripeThreeDs2Service get() {
    return provideStripeThreeDs2Service(contextProvider.get(), enableLoggingProvider.get(), workContextProvider.get());
  }

  public static Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory create(
      Provider<Context> contextProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory(contextProvider, enableLoggingProvider, workContextProvider);
  }

  public static StripeThreeDs2Service provideStripeThreeDs2Service(Context context,
      boolean enableLogging, CoroutineContext workContext) {
    return Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.Companion.provideStripeThreeDs2Service(context, enableLogging, workContext));
  }
}
