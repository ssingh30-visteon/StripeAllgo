package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
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
public final class PaymentLauncherModule_ProvideDefaultReturnUrlFactory implements Factory<DefaultReturnUrl> {
  private final PaymentLauncherModule module;

  private final Provider<Context> contextProvider;

  public PaymentLauncherModule_ProvideDefaultReturnUrlFactory(PaymentLauncherModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public DefaultReturnUrl get() {
    return provideDefaultReturnUrl(module, contextProvider.get());
  }

  public static PaymentLauncherModule_ProvideDefaultReturnUrlFactory create(
      PaymentLauncherModule module, Provider<Context> contextProvider) {
    return new PaymentLauncherModule_ProvideDefaultReturnUrlFactory(module, contextProvider);
  }

  public static DefaultReturnUrl provideDefaultReturnUrl(PaymentLauncherModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideDefaultReturnUrl(context));
  }
}
