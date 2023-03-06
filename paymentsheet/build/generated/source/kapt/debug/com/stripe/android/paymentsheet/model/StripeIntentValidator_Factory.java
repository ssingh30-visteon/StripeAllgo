package com.stripe.android.paymentsheet.model;

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
public final class StripeIntentValidator_Factory implements Factory<StripeIntentValidator> {
  @Override
  public StripeIntentValidator get() {
    return newInstance();
  }

  public static StripeIntentValidator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StripeIntentValidator newInstance() {
    return new StripeIntentValidator();
  }

  private static final class InstanceHolder {
    private static final StripeIntentValidator_Factory INSTANCE = new StripeIntentValidator_Factory();
  }
}
