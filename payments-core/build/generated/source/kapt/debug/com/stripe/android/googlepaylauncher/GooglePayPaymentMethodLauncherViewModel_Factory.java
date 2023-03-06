package com.stripe.android.googlepaylauncher;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GooglePayPaymentMethodLauncherViewModel_Factory implements Factory<GooglePayPaymentMethodLauncherViewModel> {
  private final Provider<PaymentsClient> paymentsClientProvider;

  private final Provider<ApiRequest.Options> requestOptionsProvider;

  private final Provider<GooglePayPaymentMethodLauncherContract.Args> argsProvider;

  private final Provider<StripeRepository> stripeRepositoryProvider;

  private final Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;

  private final Provider<GooglePayRepository> googlePayRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public GooglePayPaymentMethodLauncherViewModel_Factory(
      Provider<PaymentsClient> paymentsClientProvider,
      Provider<ApiRequest.Options> requestOptionsProvider,
      Provider<GooglePayPaymentMethodLauncherContract.Args> argsProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider,
      Provider<GooglePayRepository> googlePayRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.paymentsClientProvider = paymentsClientProvider;
    this.requestOptionsProvider = requestOptionsProvider;
    this.argsProvider = argsProvider;
    this.stripeRepositoryProvider = stripeRepositoryProvider;
    this.googlePayJsonFactoryProvider = googlePayJsonFactoryProvider;
    this.googlePayRepositoryProvider = googlePayRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public GooglePayPaymentMethodLauncherViewModel get() {
    return newInstance(paymentsClientProvider.get(), requestOptionsProvider.get(), argsProvider.get(), stripeRepositoryProvider.get(), googlePayJsonFactoryProvider.get(), googlePayRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static GooglePayPaymentMethodLauncherViewModel_Factory create(
      Provider<PaymentsClient> paymentsClientProvider,
      Provider<ApiRequest.Options> requestOptionsProvider,
      Provider<GooglePayPaymentMethodLauncherContract.Args> argsProvider,
      Provider<StripeRepository> stripeRepositoryProvider,
      Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider,
      Provider<GooglePayRepository> googlePayRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new GooglePayPaymentMethodLauncherViewModel_Factory(paymentsClientProvider, requestOptionsProvider, argsProvider, stripeRepositoryProvider, googlePayJsonFactoryProvider, googlePayRepositoryProvider, savedStateHandleProvider);
  }

  public static GooglePayPaymentMethodLauncherViewModel newInstance(PaymentsClient paymentsClient,
      ApiRequest.Options requestOptions, GooglePayPaymentMethodLauncherContract.Args args,
      StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory,
      GooglePayRepository googlePayRepository, SavedStateHandle savedStateHandle) {
    return new GooglePayPaymentMethodLauncherViewModel(paymentsClient, requestOptions, args, stripeRepository, googlePayJsonFactory, googlePayRepository, savedStateHandle);
  }
}
