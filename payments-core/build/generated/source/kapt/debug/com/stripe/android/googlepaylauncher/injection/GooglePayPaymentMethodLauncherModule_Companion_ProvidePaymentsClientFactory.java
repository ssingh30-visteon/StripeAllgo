package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
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
public final class GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory implements Factory<PaymentsClient> {
  private final Provider<Context> contextProvider;

  private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;

  private final Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

  public GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(
      Provider<Context> contextProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider,
      Provider<PaymentsClientFactory> paymentsClientFactoryProvider) {
    this.contextProvider = contextProvider;
    this.googlePayConfigProvider = googlePayConfigProvider;
    this.paymentsClientFactoryProvider = paymentsClientFactoryProvider;
  }

  @Override
  public PaymentsClient get() {
    return providePaymentsClient(contextProvider.get(), googlePayConfigProvider.get(), paymentsClientFactoryProvider.get());
  }

  public static GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory create(
      Provider<Context> contextProvider,
      Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider,
      Provider<PaymentsClientFactory> paymentsClientFactoryProvider) {
    return new GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(contextProvider, googlePayConfigProvider, paymentsClientFactoryProvider);
  }

  public static PaymentsClient providePaymentsClient(Context context,
      GooglePayPaymentMethodLauncher.Config googlePayConfig,
      PaymentsClientFactory paymentsClientFactory) {
    return Preconditions.checkNotNullFromProvides(GooglePayPaymentMethodLauncherModule.Companion.providePaymentsClient(context, googlePayConfig, paymentsClientFactory));
  }
}
