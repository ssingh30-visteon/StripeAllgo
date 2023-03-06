package com.stripe.android.core.networking;

import com.stripe.android.Logger;
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
public final class DefaultAnalyticsRequestExecutor_Factory implements Factory<DefaultAnalyticsRequestExecutor> {
  private final Provider<Logger> loggerProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public DefaultAnalyticsRequestExecutor_Factory(Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.loggerProvider = loggerProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public DefaultAnalyticsRequestExecutor get() {
    return newInstance(loggerProvider.get(), workContextProvider.get());
  }

  public static DefaultAnalyticsRequestExecutor_Factory create(Provider<Logger> loggerProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new DefaultAnalyticsRequestExecutor_Factory(loggerProvider, workContextProvider);
  }

  public static DefaultAnalyticsRequestExecutor newInstance(Logger logger,
      CoroutineContext workContext) {
    return new DefaultAnalyticsRequestExecutor(logger, workContext);
  }
}
