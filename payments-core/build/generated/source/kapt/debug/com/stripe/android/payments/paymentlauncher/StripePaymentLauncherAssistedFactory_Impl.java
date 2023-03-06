package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
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
public final class StripePaymentLauncherAssistedFactory_Impl implements StripePaymentLauncherAssistedFactory {
  private final StripePaymentLauncher_Factory delegateFactory;

  StripePaymentLauncherAssistedFactory_Impl(StripePaymentLauncher_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public StripePaymentLauncher create(Function0<String> publishableKey,
      Function0<String> stripeAccountId,
      ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher) {
    return delegateFactory.get(publishableKey, stripeAccountId, hostActivityLauncher);
  }

  public static Provider<StripePaymentLauncherAssistedFactory> create(
      StripePaymentLauncher_Factory delegateFactory) {
    return InstanceFactory.create(new StripePaymentLauncherAssistedFactory_Impl(delegateFactory));
  }
}
