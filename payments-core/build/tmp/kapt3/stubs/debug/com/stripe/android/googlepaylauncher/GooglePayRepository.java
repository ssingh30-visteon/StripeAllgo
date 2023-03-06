package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "", "isReady", "Lkotlinx/coroutines/flow/Flow;", "", "Disabled", "payments-core_debug"})
public abstract interface GooglePayRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> isReady();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Disabled;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "()V", "isReady", "Lkotlinx/coroutines/flow/Flow;", "", "payments-core_debug"})
    public static final class Disabled implements com.stripe.android.googlepaylauncher.GooglePayRepository {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.googlepaylauncher.GooglePayRepository.Disabled INSTANCE = null;
        
        private Disabled() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isReady() {
            return null;
        }
    }
}