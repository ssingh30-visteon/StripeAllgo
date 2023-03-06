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
public final class CoroutineContextModule_ProvideWorkContextFactory implements Factory<CoroutineContext> {
  private final CoroutineContextModule module;

  public CoroutineContextModule_ProvideWorkContextFactory(CoroutineContextModule module) {
    this.module = module;
  }

  @Override
  public CoroutineContext get() {
    return provideWorkContext(module);
  }

  public static CoroutineContextModule_ProvideWorkContextFactory create(
      CoroutineContextModule module) {
    return new CoroutineContextModule_ProvideWorkContextFactory(module);
  }

  public static CoroutineContext provideWorkContext(CoroutineContextModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorkContext());
  }
}
