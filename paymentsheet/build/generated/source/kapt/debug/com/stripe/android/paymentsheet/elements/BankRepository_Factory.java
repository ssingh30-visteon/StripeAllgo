package com.stripe.android.paymentsheet.elements;

import android.content.res.Resources;
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
public final class BankRepository_Factory implements Factory<BankRepository> {
  private final Provider<Resources> resourcesProvider;

  public BankRepository_Factory(Provider<Resources> resourcesProvider) {
    this.resourcesProvider = resourcesProvider;
  }

  @Override
  public BankRepository get() {
    return newInstance(resourcesProvider.get());
  }

  public static BankRepository_Factory create(Provider<Resources> resourcesProvider) {
    return new BankRepository_Factory(resourcesProvider);
  }

  public static BankRepository newInstance(Resources resources) {
    return new BankRepository(resources);
  }
}
