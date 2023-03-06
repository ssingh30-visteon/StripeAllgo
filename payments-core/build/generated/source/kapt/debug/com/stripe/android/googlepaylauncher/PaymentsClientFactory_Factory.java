package com.stripe.android.googlepaylauncher;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentsClientFactory_Factory implements Factory<PaymentsClientFactory> {
  private final Provider<Context> contextProvider;

  public PaymentsClientFactory_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PaymentsClientFactory get() {
    return newInstance(contextProvider.get());
  }

  public static PaymentsClientFactory_Factory create(Provider<Context> contextProvider) {
    return new PaymentsClientFactory_Factory(contextProvider);
  }

  public static PaymentsClientFactory newInstance(Context context) {
    return new PaymentsClientFactory(context);
  }
}
