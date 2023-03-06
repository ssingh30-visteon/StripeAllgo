package com.stripe.android.networking;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Set;
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
public final class PaymentAnalyticsRequestFactory_Factory implements Factory<PaymentAnalyticsRequestFactory> {
  private final Provider<Context> contextProvider;

  private final Provider<Function0<String>> publishableKeyProvider;

  private final Provider<Set<String>> defaultProductUsageTokensProvider;

  public PaymentAnalyticsRequestFactory_Factory(Provider<Context> contextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> defaultProductUsageTokensProvider) {
    this.contextProvider = contextProvider;
    this.publishableKeyProvider = publishableKeyProvider;
    this.defaultProductUsageTokensProvider = defaultProductUsageTokensProvider;
  }

  @Override
  public PaymentAnalyticsRequestFactory get() {
    return newInstance(contextProvider.get(), publishableKeyProvider.get(), defaultProductUsageTokensProvider.get());
  }

  public static PaymentAnalyticsRequestFactory_Factory create(Provider<Context> contextProvider,
      Provider<Function0<String>> publishableKeyProvider,
      Provider<Set<String>> defaultProductUsageTokensProvider) {
    return new PaymentAnalyticsRequestFactory_Factory(contextProvider, publishableKeyProvider, defaultProductUsageTokensProvider);
  }

  public static PaymentAnalyticsRequestFactory newInstance(Context context,
      Function0<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
    return new PaymentAnalyticsRequestFactory(context, publishableKeyProvider, defaultProductUsageTokens);
  }
}
