package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.model.ClientSecret;
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
public final class FlowControllerModule_Companion_ProvideClientSecretFactory implements Factory<ClientSecret> {
  private final Provider<FlowControllerViewModel> viewModelProvider;

  public FlowControllerModule_Companion_ProvideClientSecretFactory(
      Provider<FlowControllerViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ClientSecret get() {
    return provideClientSecret(viewModelProvider.get());
  }

  public static FlowControllerModule_Companion_ProvideClientSecretFactory create(
      Provider<FlowControllerViewModel> viewModelProvider) {
    return new FlowControllerModule_Companion_ProvideClientSecretFactory(viewModelProvider);
  }

  public static ClientSecret provideClientSecret(FlowControllerViewModel viewModel) {
    return Preconditions.checkNotNullFromProvides(FlowControllerModule.Companion.provideClientSecret(viewModel));
  }
}
