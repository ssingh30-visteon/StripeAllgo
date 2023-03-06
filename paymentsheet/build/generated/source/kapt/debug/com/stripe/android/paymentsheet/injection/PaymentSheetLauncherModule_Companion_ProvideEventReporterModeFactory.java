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
public final class PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory implements Factory<EventReporter.Mode> {
  @Override
  public EventReporter.Mode get() {
    return provideEventReporterMode();
  }

  public static PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EventReporter.Mode provideEventReporterMode() {
    return Preconditions.checkNotNullFromProvides(PaymentSheetLauncherModule.Companion.provideEventReporterMode());
  }

  private static final class InstanceHolder {
    private static final PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory();
  }
}
