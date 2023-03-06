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
public final class AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory implements Factory<DefaultReturnUrl> {
  private final Provider<Context> contextProvider;

  public AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DefaultReturnUrl get() {
    return provideDefaultReturnUrl(contextProvider.get());
  }

  public static AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory create(
      Provider<Context> contextProvider) {
    return new AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory(contextProvider);
  }

  public static DefaultReturnUrl provideDefaultReturnUrl(Context context) {
    return Preconditions.checkNotNullFromProvides(AuthenticationModule.Companion.provideDefaultReturnUrl(context));
  }
}
