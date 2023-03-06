package com.stripe.android.payments.core.authentication;

import com.stripe.android.model.StripeIntent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Map;
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
public final class DefaultPaymentAuthenticatorRegistry_Factory implements Factory<DefaultPaymentAuthenticatorRegistry> {
  private final Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;

  private final Provider<SourceAuthenticator> sourceAuthenticatorProvider;

  private final Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> paymentAuthenticatorMapProvider;

  public DefaultPaymentAuthenticatorRegistry_Factory(
      Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider,
      Provider<SourceAuthenticator> sourceAuthenticatorProvider,
      Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> paymentAuthenticatorMapProvider) {
    this.noOpIntentAuthenticatorProvider = noOpIntentAuthenticatorProvider;
    this.sourceAuthenticatorProvider = sourceAuthenticatorProvider;
    this.paymentAuthenticatorMapProvider = paymentAuthenticatorMapProvider;
  }

  @Override
  public DefaultPaymentAuthenticatorRegistry get() {
    return newInstance(noOpIntentAuthenticatorProvider.get(), sourceAuthenticatorProvider.get(), paymentAuthenticatorMapProvider.get());
  }

  public static DefaultPaymentAuthenticatorRegistry_Factory create(
      Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider,
      Provider<SourceAuthenticator> sourceAuthenticatorProvider,
      Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> paymentAuthenticatorMapProvider) {
    return new DefaultPaymentAuthenticatorRegistry_Factory(noOpIntentAuthenticatorProvider, sourceAuthenticatorProvider, paymentAuthenticatorMapProvider);
  }

  public static DefaultPaymentAuthenticatorRegistry newInstance(
      NoOpIntentAuthenticator noOpIntentAuthenticator, SourceAuthenticator sourceAuthenticator,
      Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> paymentAuthenticatorMap) {
    return new DefaultPaymentAuthenticatorRegistry(noOpIntentAuthenticator, sourceAuthenticator, paymentAuthenticatorMap);
  }
}
