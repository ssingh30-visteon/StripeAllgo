package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
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
public final class PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
  private final Provider<Context> appContextProvider;

  public PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(
      Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public PaymentConfiguration get() {
    return providePaymentConfiguration(appContextProvider.get());
  }

  public static PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create(
      Provider<Context> appContextProvider) {
    return new PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(appContextProvider);
  }

  public static PaymentConfiguration providePaymentConfiguration(Context appContext) {
    return Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.Companion.providePaymentConfiguration(appContext));
  }
}
