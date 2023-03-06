package com.stripe.android.networking;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiRequest_Options_Factory implements Factory<ApiRequest.Options> {
  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Function0<String>> stripeAccountIdProvider;

  public ApiRequest_Options_Factory(Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider) {
    this.publishableKeyProvider = publishableKeyProvider;
    this.stripeAccountIdProvider = stripeAccountIdProvider;
  }

  @Override
  public ApiRequest.Options get() {
    return newInstance(publishableKeyProvider.get(), stripeAccountIdProvider.get());
  }

  public static ApiRequest_Options_Factory create(
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Function0<String>> stripeAccountIdProvider) {
    return new ApiRequest_Options_Factory(publishableKeyProvider, stripeAccountIdProvider);
  }

  public static ApiRequest.Options newInstance(Function0<String> publishableKeyProvider,
      Function0<String> stripeAccountIdProvider) {
    return new ApiRequest.Options(publishableKeyProvider, stripeAccountIdProvider);
  }
}
