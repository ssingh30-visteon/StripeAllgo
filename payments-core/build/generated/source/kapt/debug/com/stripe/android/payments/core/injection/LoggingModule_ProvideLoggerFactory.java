package com.stripe.android.payments.core.injection;

import com.stripe.android.Logger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoggingModule_ProvideLoggerFactory implements Factory<Logger> {
  private final LoggingModule module;

  private final Provider<Boolean> enableLoggingProvider;

  public LoggingModule_ProvideLoggerFactory(LoggingModule module,
      Provider<Boolean> enableLoggingProvider) {
    this.module = module;
    this.enableLoggingProvider = enableLoggingProvider;
  }

  @Override
  public Logger get() {
    return provideLogger(module, enableLoggingProvider.get());
  }

  public static LoggingModule_ProvideLoggerFactory create(LoggingModule module,
      Provider<Boolean> enableLoggingProvider) {
    return new LoggingModule_ProvideLoggerFactory(module, enableLoggingProvider);
  }

  public static Logger provideLogger(LoggingModule instance, boolean enableLogging) {
    return Preconditions.checkNotNullFromProvides(instance.provideLogger(enableLogging));
  }
}
