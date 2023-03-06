package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH&\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "", "()V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "ActivityHost", "FragmentHost", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "paymentsheet_debug"})
public abstract class ActivityLauncherFactory {
    
    private ActivityLauncherFactory() {
        super();
    }
    
    /**
     * Registers a [callback] to handle the [contract] and returns an [ActivityResultLauncher].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract <I extends java.lang.Object, O extends java.lang.Object>androidx.activity.result.ActivityResultLauncher<I> create(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.contract.ActivityResultContract<I, O> contract, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<O> callback);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "activity", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;)V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "paymentsheet_debug"})
    public static final class ActivityHost extends com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory {
        private final androidx.activity.ComponentActivity activity = null;
        
        public ActivityHost(@org.jetbrains.annotations.NotNull()
        androidx.activity.ComponentActivity activity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <I extends java.lang.Object, O extends java.lang.Object>androidx.activity.result.ActivityResultLauncher<I> create(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.contract.ActivityResultContract<I, O> contract, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCallback<O> callback) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "paymentsheet_debug"})
    public static final class FragmentHost extends com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory {
        private final androidx.fragment.app.Fragment fragment = null;
        
        public FragmentHost(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <I extends java.lang.Object, O extends java.lang.Object>androidx.activity.result.ActivityResultLauncher<I> create(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.contract.ActivityResultContract<I, O> contract, @org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultCallback<O> callback) {
            return null;
        }
    }
}