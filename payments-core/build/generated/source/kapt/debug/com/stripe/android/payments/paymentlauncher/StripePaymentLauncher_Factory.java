package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.DaggerGenerated;
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
public final class StripePaymentLauncher_Factory {
  private final Provider<Context> contextProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> ioContextProvider;

  private final Provider<CoroutineContext> uiContextProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<Set<String>> productUsageProvider;

  public StripePaymentLauncher_Factory(Provider<Context> contextProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> ioContextProvider,
      Provider<CoroutineContext> uiContextProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Set<String>> productUsageProvider) {
    this.contextProvider = contextProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.ioContextProvider = ioContextProvider;
    this.uiContextProvider = uiContextProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.productUsageProvider = productUsageProvider;
  }

  public StripePaymentLauncher get(Function0<String> publishableKeyProvider,
      Function0<String> stripeAccountIdProvider,
      ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher) {
    return newInstance(publishableKeyProvider, stripeAccountIdProvider, hostActivityLauncher, contextProvider.get(), enableLoggingProvider.get(), ioContextProvider.get(), uiContextProvider.get(), stripeRepositoryProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), productUsageProvider.get());
  }

  public static StripePaymentLauncher_Factory create(Provider<Context> contextProvider,
      Provider<Boolean> enableLoggingProvider, Provider<CoroutineContext> ioContextProvider,
      Provider<CoroutineContext> uiContextProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<Set<String>> productUsageProvider) {
    return new StripePaymentLauncher_Factory(contextProvider, enableLoggingProvider, ioContextProvider, uiContextProvider, stripeRepositoryProvider, paymentAnalyticsRequestFactoryProvider, productUsageProvider);
  }

  public static StripePaymentLauncher newInstance(Function0<String> publishableKeyProvider,
      Function0<String> stripeAccountIdProvider,
      ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher, Context context,
      boolean enableLogging, CoroutineContext ioContext, CoroutineContext uiContext,
      StripeRepository stripeRepository,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set<String> productUsage) {
    return new StripePaymentLauncher(publishableKeyProvider, stripeAccountIdProvider, hostActivityLauncher, context, enableLogging, ioContext, uiContext, stripeRepository, paymentAnalyticsRequestFactory, productUsage);
  }
}
