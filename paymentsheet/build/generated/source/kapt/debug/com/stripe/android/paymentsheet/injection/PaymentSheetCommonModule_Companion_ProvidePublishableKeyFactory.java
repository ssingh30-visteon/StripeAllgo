package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
  private final Provider<PaymentConfiguration> paymentConfigurationProvider;

  public PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(
      Provider<PaymentConfiguration> paymentConfigurationProvider) {
    this.paymentConfigurationProvider = paymentConfigurationProvider;
  }

  @Override
  public Function0<String> get() {
    return providePublishableKey(DoubleCheck.lazy(paymentConfigurationProvider));
  }

  public static PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory create(
      Provider<PaymentConfiguration> paymentConfigurationProvider) {
    return new PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(paymentConfigurationProvider);
  }

  public static Function0<String> providePublishableKey(
      Lazy<PaymentConfiguration> paymentConfiguration) {
    return Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.Companion.providePublishableKey(paymentConfiguration));
  }
}
