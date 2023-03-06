package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.Logger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DefaultGooglePayRepository_Factory implements Factory<DefaultGooglePayRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;

  private final Provider<Logger> loggerProvider;

  public DefaultGooglePayRepository_Factory(Provider<Context> contextProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider,
      Provider<Logger> loggerProvider) {
    this.contextProvider = contextProvider;
    this.googlePayConfigProvider = googlePayConfigProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public DefaultGooglePayRepository get() {
    return newInstance(contextProvider.get(), googlePayConfigProvider.get(), loggerProvider.get());
  }

  public static DefaultGooglePayRepository_Factory create(Provider<Context> contextProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider,
      Provider<Logger> loggerProvider) {
    return new DefaultGooglePayRepository_Factory(contextProvider, googlePayConfigProvider, loggerProvider);
  }

  public static DefaultGooglePayRepository newInstance(Context context,
      GooglePayPaymentMethodLauncher.Config googlePayConfig, Logger logger) {
    return new DefaultGooglePayRepository(context, googlePayConfig, logger);
  }
}
