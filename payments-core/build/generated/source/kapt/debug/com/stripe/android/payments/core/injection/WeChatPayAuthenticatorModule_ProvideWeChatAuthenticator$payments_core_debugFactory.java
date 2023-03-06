package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
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
public final class WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_debugFactory implements Factory<PaymentAuthenticator<StripeIntent>> {
  private final WeChatPayAuthenticatorModule module;

  private final Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;

  public WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_debugFactory(
      WeChatPayAuthenticatorModule module,
      Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider) {
    this.module = module;
    this.unsupportedAuthenticatorProvider = unsupportedAuthenticatorProvider;
  }

  @Override
  public PaymentAuthenticator<StripeIntent> get() {
    return provideWeChatAuthenticator$payments_core_debug(module, unsupportedAuthenticatorProvider.get());
  }

  public static WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_debugFactory create(
      WeChatPayAuthenticatorModule module,
      Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider) {
    return new WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_debugFactory(module, unsupportedAuthenticatorProvider);
  }

  public static PaymentAuthenticator<StripeIntent> provideWeChatAuthenticator$payments_core_debug(
      WeChatPayAuthenticatorModule instance, UnsupportedAuthenticator unsupportedAuthenticator) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeChatAuthenticator$payments_core_debug(unsupportedAuthenticator));
  }
}
