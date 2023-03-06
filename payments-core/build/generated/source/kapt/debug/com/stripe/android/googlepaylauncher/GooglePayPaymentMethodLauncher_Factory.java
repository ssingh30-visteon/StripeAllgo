package com.stripe.android.googlepaylauncher;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.DaggerGenerated;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GooglePayPaymentMethodLauncher_Factory {
  private final Provider<Context> contextProvider;

  private final Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;

  private final Provider<Set<String>> productUsageProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Function0<String>> stripeAccountIdProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<CoroutineContext> ioContextProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  public GooglePayPaymentMethodLauncher_Factory(Provider<Context> contextProvider,
      Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider,
      Provider<Set<String>> productUsageProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> ioContextProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<StripeRepository> stripeRepositoryProvider) {
    this.contextProvider = contextProvider;
    this.googlePayRepositoryFactoryProvider = googlePayRepositoryFactoryProvider;
    this.productUsageProvider = productUsageProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.stripeAccountIdProvider = stripeAccountIdProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.ioContextProvider = ioContextProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
  }

  public GooglePayPaymentMethodLauncher get(CoroutineScope lifecycleScope,
      GooglePayPaymentMethodLauncher.Config config,
      GooglePayPaymentMethodLauncher.ReadyCallback readyCallback,
      ActivityResultLauncher<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher,
      boolean skipReadyCheck) {
    return newInstance(lifecycleScope, config, readyCallback, activityResultLauncher, skipReadyCheck, contextProvider.get(), googlePayRepositoryFactoryProvider.get(), productUsageProvider.get(), publishableKeyProvider.get(), stripeAccountIdProvider.get(), enableLoggingProvider.get(), ioContextProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), analyticsRequestExecutorProvider.get(), stripeRepositoryProvider.get());
  }

  public static GooglePayPaymentMethodLauncher_Factory create(Provider<Context> contextProvider,
      Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider,
      Provider<Set<String>> productUsageProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider, Provider<Boolean> enableLoggingProvider,
      Provider<CoroutineContext> ioContextProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<StripeRepository> stripeRepositoryProvider) {
    return new GooglePayPaymentMethodLauncher_Factory(contextProvider, googlePayRepositoryFactoryProvider, productUsageProvider, publishableKeyProvider, stripeAccountIdProvider, enableLoggingProvider, ioContextProvider, paymentAnalyticsRequestFactoryProvider, analyticsRequestExecutorProvider, stripeRepositoryProvider);
  }

  public static GooglePayPaymentMethodLauncher newInstance(CoroutineScope lifecycleScope,
      GooglePayPaymentMethodLauncher.Config config,
      GooglePayPaymentMethodLauncher.ReadyCallback readyCallback,
      ActivityResultLauncher<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher,
      boolean skipReadyCheck, Context context,
      Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory,
      Set<String> productUsage, Function0<String> publishableKeyProvider,
      Function0<String> stripeAccountIdProvider, boolean enableLogging, CoroutineContext ioContext,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory,
      AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository) {
    return new GooglePayPaymentMethodLauncher(lifecycleScope, config, readyCallback, activityResultLauncher, skipReadyCheck, context, googlePayRepositoryFactory, productUsage, publishableKeyProvider, stripeAccountIdProvider, enableLogging, ioContext, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository);
  }
}
