package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
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
public final class PaymentOptionsViewModel_Factory_MembersInjector implements MembersInjector<PaymentOptionsViewModel.Factory> {
  private final Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public PaymentOptionsViewModel_Factory_MembersInjector(
      Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<PaymentOptionsViewModel.Factory> create(
      Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new PaymentOptionsViewModel_Factory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(PaymentOptionsViewModel.Factory instance) {
    injectSubComponentBuilderProvider(instance, subComponentBuilderProvider);
  }

  @InjectedFieldSignature("com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.subComponentBuilderProvider")
  public static void injectSubComponentBuilderProvider(PaymentOptionsViewModel.Factory instance,
      Provider<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    instance.subComponentBuilderProvider = subComponentBuilderProvider;
  }
}
