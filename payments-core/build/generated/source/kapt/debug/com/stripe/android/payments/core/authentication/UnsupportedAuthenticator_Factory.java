package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UnsupportedAuthenticator_Factory implements Factory<UnsupportedAuthenticator> {
  private final Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

  public UnsupportedAuthenticator_Factory(
      Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider) {
    this.paymentRelayStarterFactoryProvider = paymentRelayStarterFactoryProvider;
  }

  @Override
  public UnsupportedAuthenticator get() {
    return newInstance(paymentRelayStarterFactoryProvider.get());
  }

  public static UnsupportedAuthenticator_Factory create(
      Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider) {
    return new UnsupportedAuthenticator_Factory(paymentRelayStarterFactoryProvider);
  }

  public static UnsupportedAuthenticator newInstance(
      Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
    return new UnsupportedAuthenticator(paymentRelayStarterFactory);
  }
}
