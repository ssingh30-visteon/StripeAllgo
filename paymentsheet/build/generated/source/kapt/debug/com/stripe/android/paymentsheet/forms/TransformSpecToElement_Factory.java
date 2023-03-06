package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.elements.ResourceRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
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
public final class TransformSpecToElement_Factory implements Factory<TransformSpecToElement> {
  private final Provider<ResourceRepository> resourceRepositoryProvider;

  private final Provider<FormFragmentArguments> initialValuesProvider;

  public TransformSpecToElement_Factory(Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<FormFragmentArguments> initialValuesProvider) {
    this.resourceRepositoryProvider = resourceRepositoryProvider;
    this.initialValuesProvider = initialValuesProvider;
  }

  @Override
  public TransformSpecToElement get() {
    return newInstance(resourceRepositoryProvider.get(), initialValuesProvider.get());
  }

  public static TransformSpecToElement_Factory create(
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<FormFragmentArguments> initialValuesProvider) {
    return new TransformSpecToElement_Factory(resourceRepositoryProvider, initialValuesProvider);
  }

  public static TransformSpecToElement newInstance(ResourceRepository resourceRepository,
      FormFragmentArguments initialValues) {
    return new TransformSpecToElement(resourceRepository, initialValues);
  }
}
