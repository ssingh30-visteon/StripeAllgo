package com.stripe.android.payments.core.authentication;

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
public final class OxxoAuthenticator_Factory implements Factory<OxxoAuthenticator> {
  private final Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider;

  private final Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;

  public OxxoAuthenticator_Factory(Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider,
      Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider) {
    this.webIntentAuthenticatorProvider = webIntentAuthenticatorProvider;
    this.noOpIntentAuthenticatorProvider = noOpIntentAuthenticatorProvider;
  }

  @Override
  public OxxoAuthenticator get() {
    return newInstance(webIntentAuthenticatorProvider.get(), noOpIntentAuthenticatorProvider.get());
  }

  public static OxxoAuthenticator_Factory create(
      Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider,
      Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider) {
    return new OxxoAuthenticator_Factory(webIntentAuthenticatorProvider, noOpIntentAuthenticatorProvider);
  }

  public static OxxoAuthenticator newInstance(WebIntentAuthenticator webIntentAuthenticator,
      NoOpIntentAuthenticator noOpIntentAuthenticator) {
    return new OxxoAuthenticator(webIntentAuthenticator, noOpIntentAuthenticator);
  }
}
