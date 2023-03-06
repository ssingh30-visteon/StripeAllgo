package com.stripe.android;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class GooglePayJsonFactory_Factory implements Factory<GooglePayJsonFactory> {
  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Function0<String>> stripeAccountIdProvider;

  private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;

  public GooglePayJsonFactory_Factory(Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider) {
    this.publishableKeyProvider = publishableKeyProvider;
    this.stripeAccountIdProvider = stripeAccountIdProvider;
    this.googlePayConfigProvider = googlePayConfigProvider;
  }

  @Override
  public GooglePayJsonFactory get() {
    return newInstance(publishableKeyProvider.get(), stripeAccountIdProvider.get(), googlePayConfigProvider.get());
  }

  public static GooglePayJsonFactory_Factory create(
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider) {
    return new GooglePayJsonFactory_Factory(publishableKeyProvider, stripeAccountIdProvider, googlePayConfigProvider);
  }

  public static GooglePayJsonFactory newInstance(Function0<String> publishableKeyProvider,
      Function0<String> stripeAccountIdProvider,
      GooglePayPaymentMethodLauncher.Config googlePayConfig) {
    return new GooglePayJsonFactory(publishableKeyProvider, stripeAccountIdProvider, googlePayConfig);
  }
}
