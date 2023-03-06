package com.stripe.android.paymentsheet.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory implements Factory<Boolean> {
  @Override
  public Boolean get() {
    return provideEnabledLogging();
  }

  public static PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static boolean provideEnabledLogging() {
    return PaymentSheetCommonModule.Companion.provideEnabledLogging();
  }

  private static final class InstanceHolder {
    private static final PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory();
  }
}
