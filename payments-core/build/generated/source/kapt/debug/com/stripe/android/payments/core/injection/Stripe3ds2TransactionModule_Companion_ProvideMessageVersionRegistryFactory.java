package com.stripe.android.payments.core.injection;

import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory implements Factory<MessageVersionRegistry> {
  @Override
  public MessageVersionRegistry get() {
    return provideMessageVersionRegistry();
  }

  public static Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory create(
      ) {
    return InstanceHolder.INSTANCE;
  }

  public static MessageVersionRegistry provideMessageVersionRegistry() {
    return Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.Companion.provideMessageVersionRegistry());
  }

  private static final class InstanceHolder {
    private static final Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory INSTANCE = new Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory();
  }
}
