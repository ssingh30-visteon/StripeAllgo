package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.payments.DefaultReturnUrl;
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
public final class AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory implements Factory<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> {
  private final Provider<DefaultPaymentAuthenticatorRegistry> registryProvider;

  private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;

  public AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory(
      Provider<DefaultPaymentAuthenticatorRegistry> registryProvider,
      Provider<DefaultReturnUrl> defaultReturnUrlProvider) {
    this.registryProvider = registryProvider;
    this.defaultReturnUrlProvider = defaultReturnUrlProvider;
  }

  @Override
  public Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> get() {
    return providePaymentBrowserAuthStarterFactory(DoubleCheck.lazy(registryProvider), defaultReturnUrlProvider.get());
  }

  public static AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory create(
      Provider<DefaultPaymentAuthenticatorRegistry> registryProvider,
      Provider<DefaultReturnUrl> defaultReturnUrlProvider) {
    return new AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory(registryProvider, defaultReturnUrlProvider);
  }

  public static Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(
      Lazy<DefaultPaymentAuthenticatorRegistry> lazyRegistry, DefaultReturnUrl defaultReturnUrl) {
    return Preconditions.checkNotNullFromProvides(AuthenticationModule.Companion.providePaymentBrowserAuthStarterFactory(lazyRegistry, defaultReturnUrl));
  }
}
