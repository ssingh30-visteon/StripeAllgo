package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.PaymentSheetContract;
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
public final class PaymentSheetViewModelModule_ProvideArgsFactory implements Factory<PaymentSheetContract.Args> {
  private final PaymentSheetViewModelModule module;

  public PaymentSheetViewModelModule_ProvideArgsFactory(PaymentSheetViewModelModule module) {
    this.module = module;
  }

  @Override
  public PaymentSheetContract.Args get() {
    return provideArgs(module);
  }

  public static PaymentSheetViewModelModule_ProvideArgsFactory create(
      PaymentSheetViewModelModule module) {
    return new PaymentSheetViewModelModule_ProvideArgsFactory(module);
  }

  public static PaymentSheetContract.Args provideArgs(PaymentSheetViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideArgs());
  }
}
