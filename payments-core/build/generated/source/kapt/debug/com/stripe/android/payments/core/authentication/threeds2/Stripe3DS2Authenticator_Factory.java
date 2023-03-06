package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.PaymentAuthConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
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
public final class Stripe3DS2Authenticator_Factory implements Factory<Stripe3DS2Authenticator> {
  private final Provider<PaymentAuthConfig> configProvider;

  private final Provider<Boolean> enableLoggingProvider;

  private final Provider<String> injectorKeyProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Set<String>> productUsageProvider;

  public Stripe3DS2Authenticator_Factory(Provider<PaymentAuthConfig> configProvider,
      Provider<Boolean> enableLoggingProvider, Provider<String> injectorKeyProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> productUsageProvider) {
    this.configProvider = configProvider;
    this.enableLoggingProvider = enableLoggingProvider;
    this.injectorKeyProvider = injectorKeyProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.productUsageProvider = productUsageProvider;
  }

  @Override
  public Stripe3DS2Authenticator get() {
    return newInstance(configProvider.get(), enableLoggingProvider.get(), injectorKeyProvider.get(), publishableKeyProvider.get(), productUsageProvider.get());
  }

  public static Stripe3DS2Authenticator_Factory create(Provider<PaymentAuthConfig> configProvider,
      Provider<Boolean> enableLoggingProvider, Provider<String> injectorKeyProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> productUsageProvider) {
    return new Stripe3DS2Authenticator_Factory(configProvider, enableLoggingProvider, injectorKeyProvider, publishableKeyProvider, productUsageProvider);
  }

  public static Stripe3DS2Authenticator newInstance(PaymentAuthConfig config, boolean enableLogging,
      String injectorKey, Function0<String> publishableKeyProvider, Set<String> productUsage) {
    return new Stripe3DS2Authenticator(config, enableLogging, injectorKey, publishableKeyProvider, productUsage);
  }
}
