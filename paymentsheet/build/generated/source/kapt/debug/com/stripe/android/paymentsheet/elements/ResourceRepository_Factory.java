package com.stripe.android.paymentsheet.elements;

import com.stripe.android.paymentsheet.address.AddressFieldElementRepository;
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
public final class ResourceRepository_Factory implements Factory<ResourceRepository> {
  private final Provider<BankRepository> bankRepositoryProvider;

  private final Provider<AddressFieldElementRepository> addressRepositoryProvider;

  public ResourceRepository_Factory(Provider<BankRepository> bankRepositoryProvider,
      Provider<AddressFieldElementRepository> addressRepositoryProvider) {
    this.bankRepositoryProvider = bankRepositoryProvider;
    this.addressRepositoryProvider = addressRepositoryProvider;
  }

  @Override
  public ResourceRepository get() {
    return newInstance(bankRepositoryProvider.get(), addressRepositoryProvider.get());
  }

  public static ResourceRepository_Factory create(Provider<BankRepository> bankRepositoryProvider,
      Provider<AddressFieldElementRepository> addressRepositoryProvider) {
    return new ResourceRepository_Factory(bankRepositoryProvider, addressRepositoryProvider);
  }

  public static ResourceRepository newInstance(BankRepository bankRepository,
      AddressFieldElementRepository addressRepository) {
    return new ResourceRepository(bankRepository, addressRepository);
  }
}
