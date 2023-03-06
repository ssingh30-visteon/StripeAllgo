package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
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
public final class DefaultEventReporter_Factory implements Factory<DefaultEventReporter> {
  private final Provider<EventReporter.Mode> modeProvider;

  private final Provider<DeviceIdRepository> deviceIdRepositoryProvider;

  private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;

  private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public DefaultEventReporter_Factory(Provider<EventReporter.Mode> modeProvider,
      Provider<DeviceIdRepository> deviceIdRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.modeProvider = modeProvider;
    this.deviceIdRepositoryProvider = deviceIdRepositoryProvider;
    this.analyticsRequestExecutorProvider = analyticsRequestExecutorProvider;
    this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactoryProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public DefaultEventReporter get() {
    return newInstance(modeProvider.get(), deviceIdRepositoryProvider.get(), analyticsRequestExecutorProvider.get(), paymentAnalyticsRequestFactoryProvider.get(), workContextProvider.get());
  }

  public static DefaultEventReporter_Factory create(Provider<EventReporter.Mode> modeProvider,
      Provider<DeviceIdRepository> deviceIdRepositoryProvider,
      Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider,
      Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new DefaultEventReporter_Factory(modeProvider, deviceIdRepositoryProvider, analyticsRequestExecutorProvider, paymentAnalyticsRequestFactoryProvider, workContextProvider);
  }

  public static DefaultEventReporter newInstance(EventReporter.Mode mode,
      DeviceIdRepository deviceIdRepository, AnalyticsRequestExecutor analyticsRequestExecutor,
      PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext workContext) {
    return new DefaultEventReporter(mode, deviceIdRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, workContext);
  }
}
