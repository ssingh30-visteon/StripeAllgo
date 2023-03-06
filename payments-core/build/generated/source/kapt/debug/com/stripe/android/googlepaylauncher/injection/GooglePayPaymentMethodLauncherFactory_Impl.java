package com.stripe.android.googlepaylauncher.injection;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GooglePayPaymentMethodLauncherFactory_Impl implements GooglePayPaymentMethodLauncherFactory {
  private final GooglePayPaymentMethodLauncher_Factory delegateFactory;

  GooglePayPaymentMethodLauncherFactory_Impl(
      GooglePayPaymentMethodLauncher_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public GooglePayPaymentMethodLauncher create(CoroutineScope lifecycleScope,
      GooglePayPaymentMethodLauncher.Config config,
      GooglePayPaymentMethodLauncher.ReadyCallback readyCallback,
      ActivityResultLauncher<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher,
      boolean skipReadyCheck) {
    return delegateFactory.get(lifecycleScope, config, readyCallback, activityResultLauncher, skipReadyCheck);
  }

  public static Provider<GooglePayPaymentMethodLauncherFactory> create(
      GooglePayPaymentMethodLauncher_Factory delegateFactory) {
    return InstanceFactory.create(new GooglePayPaymentMethodLauncherFactory_Impl(delegateFactory));
  }
}
