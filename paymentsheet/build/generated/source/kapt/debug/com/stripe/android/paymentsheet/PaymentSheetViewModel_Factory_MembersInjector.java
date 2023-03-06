package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
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
public final class PaymentSheetViewModel_Factory_MembersInjector implements MembersInjector<PaymentSheetViewModel.Factory> {
  private final Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public PaymentSheetViewModel_Factory_MembersInjector(
      Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<PaymentSheetViewModel.Factory> create(
      Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new PaymentSheetViewModel_Factory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(PaymentSheetViewModel.Factory instance) {
    injectSubComponentBuilderProvider(instance, subComponentBuilderProvider);
  }

  @InjectedFieldSignature("com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.subComponentBuilderProvider")
  public static void injectSubComponentBuilderProvider(PaymentSheetViewModel.Factory instance,
      Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    instance.subComponentBuilderProvider = subComponentBuilderProvider;
  }
}
