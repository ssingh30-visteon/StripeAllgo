package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.Logger;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class PaymentIntentFlowResultProcessor_Factory implements Factory<PaymentIntentFlowResultProcessor> {
  private final Provider<Context> contextProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<RetryDelaySupplier> retryDelaySupplierProvider;

  public PaymentIntentFlowResultProcessor_Factory(Provider<Context> contextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<StripeRepository> stripeRepositoryProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<RetryDelaySupplier> retryDelaySupplierProvider) {
    this.contextProvider = contextProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
    this.retryDelaySupplierProvider = retryDelaySupplierProvider;
  }

  @Override
  public PaymentIntentFlowResultProcessor get() {
    return newInstance(contextProvider.get(), publishableKeyProvider.get(), stripeRepositoryProvider.get(), loggerProvider.get(), workContextProvider.get(), retryDelaySupplierProvider.get());
  }

  public static PaymentIntentFlowResultProcessor_Factory create(Provider<Context> contextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<StripeRepository> stripeRepositoryProvider, Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider,
      Provider<RetryDelaySupplier> retryDelaySupplierProvider) {
    return new PaymentIntentFlowResultProcessor_Factory(contextProvider, publishableKeyProvider, stripeRepositoryProvider, loggerProvider, workContextProvider, retryDelaySupplierProvider);
  }

  public static PaymentIntentFlowResultProcessor newInstance(Context context,
      Function0<String> publishableKeyProvider, StripeRepository stripeRepository, Logger logger,
      CoroutineContext workContext, RetryDelaySupplier retryDelaySupplier) {
    return new PaymentIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, logger, workContext, retryDelaySupplier);
  }
}
