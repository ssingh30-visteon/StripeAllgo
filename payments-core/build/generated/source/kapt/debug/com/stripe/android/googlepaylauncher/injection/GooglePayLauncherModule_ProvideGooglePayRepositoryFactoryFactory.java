package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.Logger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory implements Factory<Function1<GooglePayEnvironment, GooglePayRepository>> {
  private final GooglePayLauncherModule module;

  private final Provider<Context> appContextProvider;

  private final Provider<Logger> loggerProvider;

  public GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(
      GooglePayLauncherModule module, Provider<Context> appContextProvider,
      Provider<Logger> loggerProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public Function1<GooglePayEnvironment, GooglePayRepository> get() {
    return provideGooglePayRepositoryFactory(module, appContextProvider.get(), loggerProvider.get());
  }

  public static GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory create(
      GooglePayLauncherModule module, Provider<Context> appContextProvider,
      Provider<Logger> loggerProvider) {
    return new GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory(module, appContextProvider, loggerProvider);
  }

  public static Function1<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(
      GooglePayLauncherModule instance, Context appContext, Logger logger) {
    return Preconditions.checkNotNullFromProvides(instance.provideGooglePayRepositoryFactory(appContext, logger));
  }
}
