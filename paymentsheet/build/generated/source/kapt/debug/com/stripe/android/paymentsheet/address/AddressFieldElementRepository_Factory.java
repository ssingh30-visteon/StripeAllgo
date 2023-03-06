package com.stripe.android.paymentsheet.address;

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
public final class AddressFieldElementRepository_Factory implements Factory<AddressFieldElementRepository> {
  private final Provider<Resources> resourcesProvider;

  public AddressFieldElementRepository_Factory(Provider<Resources> resourcesProvider) {
    this.resourcesProvider = resourcesProvider;
  }

  @Override
  public AddressFieldElementRepository get() {
    return newInstance(resourcesProvider.get());
  }

  public static AddressFieldElementRepository_Factory create(
      Provider<Resources> resourcesProvider) {
    return new AddressFieldElementRepository_Factory(resourcesProvider);
  }

  public static AddressFieldElementRepository newInstance(Resources resources) {
    return new AddressFieldElementRepository(resources);
  }
}
