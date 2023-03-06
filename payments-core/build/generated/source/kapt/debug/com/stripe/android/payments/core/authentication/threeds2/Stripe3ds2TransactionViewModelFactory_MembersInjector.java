package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
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
public final class Stripe3ds2TransactionViewModelFactory_MembersInjector implements MembersInjector<Stripe3ds2TransactionViewModelFactory> {
  private final Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> subComponentBuilderProvider;

  public Stripe3ds2TransactionViewModelFactory_MembersInjector(
      Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    this.subComponentBuilderProvider = subComponentBuilderProvider;
  }

  public static MembersInjector<Stripe3ds2TransactionViewModelFactory> create(
      Provider<Stripe3ds2TransactionViewModelSubcomponent.Builder> subComponentBuilderProvider) {
    return new Stripe3ds2TransactionViewModelFactory_MembersInjector(subComponentBuilderProvider);
  }

  @Override
  public void injectMembers(Stripe3ds2TransactionViewModelFactory instance) {
    injectSubComponentBuilder(instance, subComponentBuilderProvider.get());
  }

  @InjectedFieldSignature("com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.subComponentBuilder")
  public static void injectSubComponentBuilder(Stripe3ds2TransactionViewModelFactory instance,
      Stripe3ds2TransactionViewModelSubcomponent.Builder subComponentBuilder) {
    instance.subComponentBuilder = subComponentBuilder;
  }
}
