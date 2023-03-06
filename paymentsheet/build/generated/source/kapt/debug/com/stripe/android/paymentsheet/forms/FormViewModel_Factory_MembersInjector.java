package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
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
public final class FormViewModel_Factory_MembersInjector implements MembersInjector<FormViewModel.Factory> {
  private final Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public FormViewModel_Factory_MembersInjector(
      Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<FormViewModel.Factory> create(
      Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new FormViewModel_Factory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(FormViewModel.Factory instance) {
    injectSubComponentBuilderProvider(instance, subComponentBuilderProvider);
  }

  @InjectedFieldSignature("com.stripe.android.paymentsheet.forms.FormViewModel.Factory.subComponentBuilderProvider")
  public static void injectSubComponentBuilderProvider(FormViewModel.Factory instance,
      Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    instance.subComponentBuilderProvider = subComponentBuilderProvider;
  }
}
