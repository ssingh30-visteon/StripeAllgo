package com.stripe.android.core.networking;

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
public final class RetryDelaySupplier_Factory implements Factory<RetryDelaySupplier> {
  @Override
  public RetryDelaySupplier get() {
    return newInstance();
  }

  public static RetryDelaySupplier_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RetryDelaySupplier newInstance() {
    return new RetryDelaySupplier();
  }

  private static final class InstanceHolder {
    private static final RetryDelaySupplier_Factory INSTANCE = new RetryDelaySupplier_Factory();
  }
}
