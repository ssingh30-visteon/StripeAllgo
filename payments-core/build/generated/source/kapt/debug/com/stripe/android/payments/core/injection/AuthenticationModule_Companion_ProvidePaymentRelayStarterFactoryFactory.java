package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory implements Factory<Function1<AuthActivityStarterHost, PaymentRelayStarter>> {
  private final Provider<DefaultPaymentAuthenticatorRegistry> registryProvider;

  public AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory(
      Provider<DefaultPaymentAuthenticatorRegistry> registryProvider) {
    this.registryProvider = registryProvider;
  }

  @Override
  public Function1<AuthActivityStarterHost, PaymentRelayStarter> get() {
    return providePaymentRelayStarterFactory(DoubleCheck.lazy(registryProvider));
  }

  public static AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory create(
      Provider<DefaultPaymentAuthenticatorRegistry> registryProvider) {
    return new AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory(registryProvider);
  }

  public static Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(
      Lazy<DefaultPaymentAuthenticatorRegistry> lazyRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthenticationModule.Companion.providePaymentRelayStarterFactory(lazyRegistry));
  }
}
