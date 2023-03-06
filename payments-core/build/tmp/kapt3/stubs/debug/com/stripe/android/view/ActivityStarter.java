package com.stripe.android.view;

import java.lang.System;

/**
 * Superclass for starting Stripe activities.
 *
 * See [PaymentMethodsActivityStarter], [AddPaymentMethodActivityStarter],
 * [PaymentFlowActivityStarter].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0002\u0016\u0017B1\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fB1\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000fB=\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/ActivityStarter;", "TargetActivityType", "Landroid/app/Activity;", "ArgsType", "Lcom/stripe/android/view/ActivityStarter$Args;", "", "activity", "targetClass", "Ljava/lang/Class;", "requestCode", "", "intentFlags", "(Landroid/app/Activity;Ljava/lang/Class;ILjava/lang/Integer;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "startForResult", "", "args", "(Lcom/stripe/android/view/ActivityStarter$Args;)V", "Args", "Result", "payments-core_debug"})
public abstract class ActivityStarter<TargetActivityType extends android.app.Activity, ArgsType extends com.stripe.android.view.ActivityStarter.Args> {
    private final android.app.Activity activity = null;
    private final androidx.fragment.app.Fragment fragment = null;
    private final java.lang.Class<TargetActivityType> targetClass = null;
    private final int requestCode = 0;
    private final java.lang.Integer intentFlags = null;
    
    public ActivityStarter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.Class<TargetActivityType> targetClass, int requestCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer intentFlags) {
        super();
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public ActivityStarter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<TargetActivityType> targetClass, int requestCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer intentFlags) {
        super();
    }
    
    public ActivityStarter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.Class<TargetActivityType> targetClass, int requestCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer intentFlags) {
        super();
    }
    
    public final void startForResult(@org.jetbrains.annotations.NotNull()
    ArgsType args) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args;", "Landroid/os/Parcelable;", "Companion", "payments-core_debug"})
    public static abstract interface Args extends android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.ActivityStarter.Args.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        public static final java.lang.String EXTRA = "extra_activity_args";
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args$Companion;", "", "()V", "EXTRA", "", "getEXTRA$annotations", "payments-core_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
            public static final java.lang.String EXTRA = "extra_activity_args";
            
            private Companion() {
                super();
            }
            
            @androidx.annotation.VisibleForTesting()
            @java.lang.Deprecated()
            public static void getEXTRA$annotations() {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Parcelable;", "toBundle", "Landroid/os/Bundle;", "Companion", "payments-core_debug"})
    public static abstract interface Result extends android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.ActivityStarter.Result.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EXTRA = "extra_activity_result";
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.os.Bundle toBundle();
        
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result$Companion;", "", "()V", "EXTRA", "", "payments-core_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String EXTRA = "extra_activity_result";
            
            private Companion() {
                super();
            }
        }
    }
}