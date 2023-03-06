package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.elements.LayoutSpec;
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
public final class FormViewModel_Factory implements Factory<FormViewModel> {
  private final Provider<LayoutSpec> layoutProvider;

  private final Provider<FormFragmentArguments> configProvider;

  private final Provider<ResourceRepository> resourceRepositoryProvider;

  private final Provider<TransformSpecToElement> transformSpecToElementProvider;

  public FormViewModel_Factory(Provider<LayoutSpec> layoutProvider,
      Provider<FormFragmentArguments> configProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<TransformSpecToElement> transformSpecToElementProvider) {
    this.layoutProvider = layoutProvider;
    this.configProvider = configProvider;
    this.resourceRepositoryProvider = resourceRepositoryProvider;
    this.transformSpecToElementProvider = transformSpecToElementProvider;
  }

  @Override
  public FormViewModel get() {
    return newInstance(layoutProvider.get(), configProvider.get(), resourceRepositoryProvider.get(), transformSpecToElementProvider.get());
  }

  public static FormViewModel_Factory create(Provider<LayoutSpec> layoutProvider,
      Provider<FormFragmentArguments> configProvider,
      Provider<ResourceRepository> resourceRepositoryProvider,
      Provider<TransformSpecToElement> transformSpecToElementProvider) {
    return new FormViewModel_Factory(layoutProvider, configProvider, resourceRepositoryProvider, transformSpecToElementProvider);
  }

  public static FormViewModel newInstance(LayoutSpec layout, FormFragmentArguments config,
      ResourceRepository resourceRepository, TransformSpecToElement transformSpecToElement) {
    return new FormViewModel(layout, config, resourceRepository, transformSpecToElement);
  }
}
