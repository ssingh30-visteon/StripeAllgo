package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FormViewModelComponent;", "", "inject", "", "factory", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Builder", "paymentsheet_debug"})
@dagger.Component(modules = {com.stripe.android.paymentsheet.injection.FormViewModelModule.class})
@javax.inject.Singleton()
public abstract interface FormViewModelComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.forms.FormViewModel.Factory factory);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FormViewModelComponent$Builder;", "", "build", "Lcom/stripe/android/paymentsheet/injection/FormViewModelComponent;", "resources", "Landroid/content/res/Resources;", "paymentsheet_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.stripe.android.paymentsheet.injection.FormViewModelComponent.Builder resources(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources resources);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.injection.FormViewModelComponent build();
    }
}