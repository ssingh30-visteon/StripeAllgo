package com.stripe.android.paymentsheet.injection;

import androidx.lifecycle.ViewModelStoreOwner;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class FlowControllerModule_Companion_ProvideViewModelFactory implements Factory<FlowControllerViewModel> {
  private final Provider<ViewModelStoreOwner> viewModelStoreOwnerProvider;

  public FlowControllerModule_Companion_ProvideViewModelFactory(
      Provider<ViewModelStoreOwner> viewModelStoreOwnerProvider) {
    this.viewModelStoreOwnerProvider = viewModelStoreOwnerProvider;
  }

  @Override
  public FlowControllerViewModel get() {
    return provideViewModel(viewModelStoreOwnerProvider.get());
  }

  public static FlowControllerModule_Companion_ProvideViewModelFactory create(
      Provider<ViewModelStoreOwner> viewModelStoreOwnerProvider) {
    return new FlowControllerModule_Companion_ProvideViewModelFactory(viewModelStoreOwnerProvider);
  }

  public static FlowControllerViewModel provideViewModel(ViewModelStoreOwner viewModelStoreOwner) {
    return Preconditions.checkNotNullFromProvides(FlowControllerModule.Companion.provideViewModel(viewModelStoreOwner));
  }
}
