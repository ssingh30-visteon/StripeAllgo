package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
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
public final class PaymentLauncherViewModel_Factory_MembersInjector implements MembersInjector<PaymentLauncherViewModel.Factory> {
  private final Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public PaymentLauncherViewModel_Factory_MembersInjector(
      Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<PaymentLauncherViewModel.Factory> create(
      Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new PaymentLauncherViewModel_Factory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(PaymentLauncherViewModel.Factory instance) {
    injectSubComponentBuilderProvider(instance, subComponentBuilderProvider);
  }

  @InjectedFieldSignature("com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.subComponentBuilderProvider")
  public static void injectSubComponentBuilderProvider(PaymentLauncherViewModel.Factory instance,
      Provider<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    instance.subComponentBuilderProvider = subComponentBuilderProvider;
  }
}
