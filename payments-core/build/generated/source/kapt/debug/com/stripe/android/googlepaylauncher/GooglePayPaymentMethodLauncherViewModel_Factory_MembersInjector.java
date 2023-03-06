package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector implements MembersInjector<GooglePayPaymentMethodLauncherViewModel.Factory> {
  private final Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(
      Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<GooglePayPaymentMethodLauncherViewModel.Factory> create(
      Provider<GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(GooglePayPaymentMethodLauncherViewModel.Factory instance) {
    injectSubComponentBuilder(instance, subComponentBuilderProvider.get());
  }

  @InjectedFieldSignature("com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.subComponentBuilder")
  public static void injectSubComponentBuilder(
      GooglePayPaymentMethodLauncherViewModel.Factory instance,
      GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder subComponentBuilder) {
    instance.subComponentBuilder = subComponentBuilder;
  }
}
