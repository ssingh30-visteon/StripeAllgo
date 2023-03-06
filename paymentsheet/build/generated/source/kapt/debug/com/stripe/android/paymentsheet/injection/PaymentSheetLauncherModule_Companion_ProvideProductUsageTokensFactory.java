package com.stripe.android.paymentsheet.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;
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
public final class PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
  @Override
  public Set<String> get() {
    return provideProductUsageTokens();
  }

  public static PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Set<String> provideProductUsageTokens() {
    return Preconditions.checkNotNullFromProvides(PaymentSheetLauncherModule.Companion.provideProductUsageTokens());
  }

  private static final class InstanceHolder {
    private static final PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory();
  }
}
