package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent;", "", "flowController", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "getFlowController", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "inject", "", "paymentOptionsViewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "factory", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_debug"})
@dagger.Component(modules = {com.stripe.android.payments.core.injection.StripeRepositoryModule.class, com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule.class, com.stripe.android.paymentsheet.injection.FlowControllerModule.class, com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule.class, com.stripe.android.payments.core.injection.CoroutineContextModule.class, com.stripe.android.payments.core.injection.LoggingModule.class})
@javax.inject.Singleton()
public abstract interface FlowControllerComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController getFlowController();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory paymentOptionsViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.forms.FormViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u0018\u0010\u0015\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\'J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent$Builder;", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "appContext", "Landroid/content/Context;", "build", "Lcom/stripe/android/paymentsheet/injection/FlowControllerComponent;", "injectorKey", "", "lifeCycleOwner", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "statusBarColor", "Lkotlin/Function0;", "", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "paymentsheet_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder appContext(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder viewModelStoreOwner(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder lifecycleScope(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope lifecycleScope);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder lifeCycleOwner(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LifecycleOwner lifecycleOwner);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder activityResultCaller(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCaller activityResultCaller);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder statusBarColor(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder paymentOptionFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder paymentOptionCallback(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder paymentResultCallback(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder injectorKey(@org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.FlowControllerComponent build();
    }
}