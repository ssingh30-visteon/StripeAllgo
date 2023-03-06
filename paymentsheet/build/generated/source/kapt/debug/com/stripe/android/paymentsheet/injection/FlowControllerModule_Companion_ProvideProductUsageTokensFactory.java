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
public final class FlowControllerModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
  @Override
  public Set<String> get() {
    return provideProductUsageTokens();
  }

  public static FlowControllerModule_Companion_ProvideProductUsageTokensFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Set<String> provideProductUsageTokens() {
    return Preconditions.checkNotNullFromProvides(FlowControllerModule.Companion.provideProductUsageTokens());
  }

  private static final class InstanceHolder {
    private static final FlowControllerModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new FlowControllerModule_Companion_ProvideProductUsageTokensFactory();
  }
}
