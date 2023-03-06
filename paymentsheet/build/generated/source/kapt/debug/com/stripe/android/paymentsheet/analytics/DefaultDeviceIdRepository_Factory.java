package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class DefaultDeviceIdRepository_Factory implements Factory<DefaultDeviceIdRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineContext> workContextProvider;

  public DefaultDeviceIdRepository_Factory(Provider<Context> contextProvider,
      Provider<CoroutineContext> workContextProvider) {
    this.contextProvider = contextProvider;
    this.workContextProvider = workContextProvider;
  }

  @Override
  public DefaultDeviceIdRepository get() {
    return newInstance(contextProvider.get(), workContextProvider.get());
  }

  public static DefaultDeviceIdRepository_Factory create(Provider<Context> contextProvider,
      Provider<CoroutineContext> workContextProvider) {
    return new DefaultDeviceIdRepository_Factory(contextProvider, workContextProvider);
  }

  public static DefaultDeviceIdRepository newInstance(Context context,
      CoroutineContext workContext) {
    return new DefaultDeviceIdRepository(context, workContext);
  }
}
