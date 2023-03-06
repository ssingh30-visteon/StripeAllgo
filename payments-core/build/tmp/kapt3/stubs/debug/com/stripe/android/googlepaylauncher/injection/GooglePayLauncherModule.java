package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;", "", "()V", "provideGooglePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "appContext", "Landroid/content/Context;", "logger", "Lcom/stripe/android/Logger;", "payments-core_debug"})
@dagger.Module()
public final class GooglePayLauncherModule {
    
    public GooglePayLauncherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> provideGooglePayRepositoryFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        return null;
    }
}