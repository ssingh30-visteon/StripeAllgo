package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
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
public final class PaymentOptionsViewModelModule_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
  private final PaymentOptionsViewModelModule module;

  public PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(
      PaymentOptionsViewModelModule module) {
    this.module = module;
  }

  @Override
  public EventReporter.Mode get() {
    return provideEventReporterMode(module);
  }

  public static PaymentOptionsViewModelModule_ProvideEventReporterModeFactory create(
      PaymentOptionsViewModelModule module) {
    return new PaymentOptionsViewModelModule_ProvideEventReporterModeFactory(module);
  }

  public static EventReporter.Mode provideEventReporterMode(
      PaymentOptionsViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideEventReporterMode());
  }
}
