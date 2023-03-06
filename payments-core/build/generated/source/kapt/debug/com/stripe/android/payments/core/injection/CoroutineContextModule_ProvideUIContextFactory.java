package com.stripe.android.payments.core.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import kotlin.coroutines.CoroutineContext;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineContextModule_ProvideUIContextFactory implements Factory<CoroutineContext> {
  private final CoroutineContextModule module;

  public CoroutineContextModule_ProvideUIContextFactory(CoroutineContextModule module) {
    this.module = module;
  }

  @Override
  public CoroutineContext get() {
    return provideUIContext(module);
  }

  public static CoroutineContextModule_ProvideUIContextFactory create(
      CoroutineContextModule module) {
    return new CoroutineContextModule_ProvideUIContextFactory(module);
  }

  public static CoroutineContext provideUIContext(CoroutineContextModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUIContext());
  }
}
