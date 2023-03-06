package com.stripe.android.payments.core.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
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
public final class PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory implements Factory<Map<String, String>> {
  private final PaymentLauncherModule module;

  public PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(
      PaymentLauncherModule module) {
    this.module = module;
  }

  @Override
  public Map<String, String> get() {
    return provideThreeDs1IntentReturnUrlMap(module);
  }

  public static PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory create(
      PaymentLauncherModule module) {
    return new PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory(module);
  }

  public static Map<String, String> provideThreeDs1IntentReturnUrlMap(
      PaymentLauncherModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideThreeDs1IntentReturnUrlMap());
  }
}
