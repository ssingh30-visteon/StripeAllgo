package com.stripe.android.view;

import java.lang.System;

/**
 * A representation of an Android component (i.e. [ComponentActivity] or [Fragment]) that can start
 * an activity. [ActivityHost] and [FragmentHost] hold references to Android components, so they
 * should only be used in a lifecycle-aware scope.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost;", "", "()V", "statusBarColor", "", "getStatusBarColor$payments_core_debug", "()Ljava/lang/Integer;", "startActivityForResult", "", "target", "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "requestCode", "ActivityHost", "Companion", "FragmentHost", "Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;", "Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;", "payments-core_debug"})
public abstract class AuthActivityStarterHost {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.AuthActivityStarterHost.Companion Companion = null;
    
    private AuthActivityStarterHost() {
        super();
    }
    
    public abstract void startActivityForResult(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> target, @org.jetbrains.annotations.NotNull()
    android.os.Bundle extras, int requestCode);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getStatusBarColor$payments_core_debug();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0090\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "activity", "Landroidx/activity/ComponentActivity;", "statusBarColor", "", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V", "getActivity", "()Landroidx/activity/ComponentActivity;", "getStatusBarColor$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "startActivityForResult", "", "target", "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "requestCode", "payments-core_debug"})
    public static final class ActivityHost extends com.stripe.android.view.AuthActivityStarterHost {
        @org.jetbrains.annotations.NotNull()
        private final androidx.activity.ComponentActivity activity = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        
        public ActivityHost(@org.jetbrains.annotations.NotNull()
        androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.activity.ComponentActivity getActivity() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Integer getStatusBarColor$payments_core_debug() {
            return null;
        }
        
        @kotlin.Suppress(names = {"DEPRECATION"})
        @java.lang.Override()
        public void startActivityForResult(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> target, @org.jetbrains.annotations.NotNull()
        android.os.Bundle extras, int requestCode) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0090\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "fragment", "Landroidx/fragment/app/Fragment;", "statusBarColor", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getStatusBarColor$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "startActivityForResult", "", "target", "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "requestCode", "payments-core_debug"})
    public static final class FragmentHost extends com.stripe.android.view.AuthActivityStarterHost {
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        
        public FragmentHost(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Integer getStatusBarColor$payments_core_debug() {
            return null;
        }
        
        @kotlin.Suppress(names = {"DEPRECATION"})
        @java.lang.Override()
        public void startActivityForResult(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> target, @org.jetbrains.annotations.NotNull()
        android.os.Bundle extras, int requestCode) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AuthActivityStarterHost;", "activity", "Landroidx/activity/ComponentActivity;", "create$payments_core_debug", "fragment", "Landroidx/fragment/app/Fragment;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}