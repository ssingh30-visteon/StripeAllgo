package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory implements Factory<PaymentAuthConfig> {
  @Override
  public PaymentAuthConfig get() {
    return providePaymentAuthConfig();
  }

  public static Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PaymentAuthConfig providePaymentAuthConfig() {
    return Preconditions.checkNotNullFromProvides(Stripe3DSAuthenticatorModule.Companion.providePaymentAuthConfig());
  }

  private static final class InstanceHolder {
    private static final Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory INSTANCE = new Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory();
  }
}
