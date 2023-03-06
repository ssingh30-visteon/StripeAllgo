package com.stripe.android.paymentsheet.injection;

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
public final class PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory implements Factory<String> {
  private final PaymentOptionsViewModelModule module;

  public PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(
      PaymentOptionsViewModelModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideDummyInjectorKey(module);
  }

  public static PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory create(
      PaymentOptionsViewModelModule module) {
    return new PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory(module);
  }

  public static String provideDummyInjectorKey(PaymentOptionsViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDummyInjectorKey());
  }
}
