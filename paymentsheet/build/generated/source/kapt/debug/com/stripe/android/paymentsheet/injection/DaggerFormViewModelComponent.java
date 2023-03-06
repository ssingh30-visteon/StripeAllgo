package com.stripe.android.paymentsheet.injection;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.address.AddressFieldElementRepository;
import com.stripe.android.paymentsheet.address.AddressFieldElementRepository_Factory;
import com.stripe.android.paymentsheet.elements.BankRepository;
import com.stripe.android.paymentsheet.elements.BankRepository_Factory;
import com.stripe.android.paymentsheet.elements.LayoutSpec;
import com.stripe.android.paymentsheet.elements.ResourceRepository;
import com.stripe.android.paymentsheet.elements.ResourceRepository_Factory;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
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
public final class DaggerFormViewModelComponent implements FormViewModelComponent {
  private final DaggerFormViewModelComponent formViewModelComponent = this;

  private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;

  private Provider<Resources> resourcesProvider;

  private Provider<BankRepository> bankRepositoryProvider;

  private Provider<AddressFieldElementRepository> addressFieldElementRepositoryProvider;

  private Provider<ResourceRepository> resourceRepositoryProvider;

  private DaggerFormViewModelComponent(Resources resourcesParam) {

    initialize(resourcesParam);

  }

  public static FormViewModelComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Resources resourcesParam) {
    this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() {
      @Override
      public FormViewModelSubcomponent.Builder get() {
        return new FormViewModelSubcomponentBuilder(formViewModelComponent);
      }
    };
    this.resourcesProvider = InstanceFactory.create(resourcesParam);
    this.bankRepositoryProvider = DoubleCheck.provider(BankRepository_Factory.create(resourcesProvider));
    this.addressFieldElementRepositoryProvider = DoubleCheck.provider(AddressFieldElementRepository_Factory.create(resourcesProvider));
    this.resourceRepositoryProvider = DoubleCheck.provider(ResourceRepository_Factory.create(bankRepositoryProvider, addressFieldElementRepositoryProvider));
  }

  @Override
  public void inject(FormViewModel.Factory factory) {
    injectFactory(factory);
  }

  private FormViewModel.Factory injectFactory(FormViewModel.Factory instance) {
    FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(instance, formViewModelSubcomponentBuilderProvider);
    return instance;
  }

  private static final class Builder implements FormViewModelComponent.Builder {
    private Resources resources;

    @Override
    public Builder resources(Resources resources) {
      this.resources = Preconditions.checkNotNull(resources);
      return this;
    }

    @Override
    public FormViewModelComponent build() {
      Preconditions.checkBuilderRequirement(resources, Resources.class);
      return new DaggerFormViewModelComponent(resources);
    }
  }

  private static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
    private final DaggerFormViewModelComponent formViewModelComponent;

    private LayoutSpec layout;

    private FormFragmentArguments formFragmentArguments;

    private FormViewModelSubcomponentBuilder(DaggerFormViewModelComponent formViewModelComponent) {
      this.formViewModelComponent = formViewModelComponent;
    }

    @Override
    public FormViewModelSubcomponentBuilder layout(LayoutSpec layoutSpec) {
      this.layout = Preconditions.checkNotNull(layoutSpec);
      return this;
    }

    @Override
    public FormViewModelSubcomponentBuilder formFragmentArguments(FormFragmentArguments config) {
      this.formFragmentArguments = Preconditions.checkNotNull(config);
      return this;
    }

    @Override
    public FormViewModelSubcomponent build() {
      Preconditions.checkBuilderRequirement(layout, LayoutSpec.class);
      Preconditions.checkBuilderRequirement(formFragmentArguments, FormFragmentArguments.class);
      return new FormViewModelSubcomponentImpl(formViewModelComponent, layout, formFragmentArguments);
    }
  }

  private static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
    private final LayoutSpec layout;

    private final FormFragmentArguments formFragmentArguments;

    private final DaggerFormViewModelComponent formViewModelComponent;

    private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl = this;

    private FormViewModelSubcomponentImpl(DaggerFormViewModelComponent formViewModelComponent,
        LayoutSpec layoutParam, FormFragmentArguments formFragmentArgumentsParam) {
      this.formViewModelComponent = formViewModelComponent;
      this.layout = layoutParam;
      this.formFragmentArguments = formFragmentArgumentsParam;

    }

    private TransformSpecToElement transformSpecToElement() {
      return new TransformSpecToElement(formViewModelComponent.resourceRepositoryProvider.get(), formFragmentArguments);
    }

    @Override
    public FormViewModel getViewModel() {
      return new FormViewModel(layout, formFragmentArguments, formViewModelComponent.resourceRepositoryProvider.get(), transformSpecToElement());
    }
  }
}
