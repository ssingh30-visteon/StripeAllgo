package com.stripe.android.paymentsheet.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Locale;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentSheetCommonModule_Companion_ProvideLocaleFactory implements Factory<Locale> {
  @Override
  @Nullable
  public Locale get() {
    return provideLocale();
  }

  public static PaymentSheetCommonModule_Companion_ProvideLocaleFactory create() {
    return InstanceHolder.INSTANCE;
  }

  @Nullable
  public static Locale provideLocale() {
    return PaymentSheetCommonModule.Companion.provideLocale();
  }

  private static final class InstanceHolder {
    private static final PaymentSheetCommonModule_Companion_ProvideLocaleFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideLocaleFactory();
  }
}
