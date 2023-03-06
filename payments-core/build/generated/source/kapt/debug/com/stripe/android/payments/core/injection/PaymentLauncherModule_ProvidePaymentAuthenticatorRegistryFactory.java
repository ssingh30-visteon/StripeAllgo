package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
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
public final class PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory implements Factory<PaymentAuthenticatorRegistry> {
  private final PaymentLauncherModule module;

  private final Provider<Context> contextProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> workContextProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;

  private final Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Set<String>> productUsageProvider;

  public PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory(
      PaymentLauncherModule module, Provider<Context> contextProvider,
      Provider<StripeRepository> stripeRepositoryProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> workContextProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> productUsageProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.workContextProvider = workContextProvider;
    this.uiContextProvider = uiContextProvider;
    this.threeDs1IntentReturnUrlMapProvider = threeDs1IntentReturnUrlMapProvider;
    this.defaultAnalyticsRequestExecutorProvider = defaultAnalyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.productUsageProvider = productUsageProvider;
  }

  @Override
  public PaymentAuthenticatorRegistry get() {
    return providePaymentAuthenticatorRegistry(module, contextProvider.get(), stripeRepositoryProvider.get(), enableLoggingProvider.get(), workContextProvider.get(), uiContextProvider.get(), threeDs1IntentReturnUrlMapProvider.get(), defaultAnalyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), publishableKeyProvider.get(), productUsageProvider.get());
  }

  public static PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory create(
      PaymentLauncherModule module, Provider<Context> contextProvider,
      Provider<StripeRepository> stripeRepositoryProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> workContextProvider, Provider<CoroutineContext> uiContextProvider,
      Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider,
      Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> productUsageProvider) {
    return new PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory(module, contextProvider, stripeRepositoryProvider, enableLoggingProvider, workContextProvider, uiContextProvider, threeDs1IntentReturnUrlMapProvider, defaultAnalyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, publishableKeyProvider, productUsageProvider);
  }

  public static PaymentAuthenticatorRegistry providePaymentAuthenticatorRegistry(
      PaymentLauncherModule instance, Context context, StripeRepository stripeRepository,
      boolean enableLogging, CoroutineContext workContext, CoroutineContext uiContext,
      Map<String, String> threeDs1IntentReturnUrlMap,
      DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory,
      Function0<String> publishableKeyProvider, Set<String> productUsage) {
    return Preconditions.checkNotNullFromProvides(instance.providePaymentAuthenticatorRegistry(context, stripeRepository, enableLogging, workContext, uiContext, threeDs1IntentReturnUrlMap, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, publishableKeyProvider, productUsage));
  }
}
