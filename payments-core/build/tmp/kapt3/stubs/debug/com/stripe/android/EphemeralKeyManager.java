package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \'2\u00020\u0001:\u0004&\'()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u00a2\u0006\u0002\b\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0002\b\u001eJ\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002J \u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager;", "", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "listener", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "shouldPrefetchEphemeralKey", "", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "timeBufferInSeconds", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V", "apiVersion", "", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "getEphemeralKey$payments_core_debug", "()Lcom/stripe/android/EphemeralKey;", "setEphemeralKey$payments_core_debug", "(Lcom/stripe/android/EphemeralKey;)V", "retrieveEphemeralKey", "", "operation", "Lcom/stripe/android/EphemeralOperation;", "retrieveEphemeralKey$payments_core_debug", "shouldRefreshKey", "shouldRefreshKey$payments_core_debug", "updateKey", "key", "updateKeyError", "operationId", "errorCode", "", "errorMessage", "ClientKeyUpdateListener", "Companion", "Factory", "KeyManagerListener", "payments-core_debug"})
public final class EphemeralKeyManager {
    private final com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider = null;
    private final com.stripe.android.EphemeralKeyManager.KeyManagerListener listener = null;
    private final kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier = null;
    private final long timeBufferInSeconds = 0L;
    private final java.lang.String apiVersion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.EphemeralKeyManager.Companion Companion = null;
    @java.lang.Deprecated()
    private static final long REFRESH_BUFFER_IN_SECONDS = 30L;
    
    public EphemeralKeyManager(@org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyProvider ephemeralKeyProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyManager.KeyManagerListener listener, @org.jetbrains.annotations.NotNull()
    com.stripe.android.OperationIdFactory operationIdFactory, boolean shouldPrefetchEphemeralKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier, long timeBufferInSeconds) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.EphemeralKey getEphemeralKey$payments_core_debug() {
        return null;
    }
    
    public final void setEphemeralKey$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.EphemeralKey p0) {
    }
    
    private final void updateKey(com.stripe.android.EphemeralOperation operation, java.lang.String key) {
    }
    
    private final void updateKeyError(java.lang.String operationId, int errorCode, java.lang.String errorMessage) {
    }
    
    public final boolean shouldRefreshKey$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.EphemeralKey ephemeralKey) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "", "onKeyError", "", "operationId", "", "errorCode", "", "errorMessage", "onKeyUpdate", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation;", "payments-core_debug"})
    public static abstract interface KeyManagerListener {
        
        public abstract void onKeyUpdate(@org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKey ephemeralKey, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralOperation operation);
        
        public abstract void onKeyError(@org.jetbrains.annotations.NotNull()
        java.lang.String operationId, int errorCode, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "operation", "Lcom/stripe/android/EphemeralOperation;", "(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;)V", "onKeyUpdate", "", "stripeResponseJson", "", "onKeyUpdateFailure", "responseCode", "", "message", "payments-core_debug"})
    static final class ClientKeyUpdateListener implements com.stripe.android.EphemeralKeyUpdateListener {
        private final com.stripe.android.EphemeralKeyManager ephemeralKeyManager = null;
        private final com.stripe.android.EphemeralOperation operation = null;
        
        public ClientKeyUpdateListener(@org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyManager ephemeralKeyManager, @org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralOperation operation) {
            super();
        }
        
        @java.lang.Override()
        public void onKeyUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.String stripeResponseJson) {
        }
        
        @java.lang.Override()
        public void onKeyUpdateFailure(int responseCode, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e0\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory;", "", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "Default", "payments-core_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.EphemeralKeyManager create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.EphemeralKeyManager.KeyManagerListener arg);
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory$Default;", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "shouldPrefetchEphemeralKey", "", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "timeSupplier", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V", "create", "Lcom/stripe/android/EphemeralKeyManager;", "arg", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "payments-core_debug"})
        public static final class Default implements com.stripe.android.EphemeralKeyManager.Factory {
            private final com.stripe.android.EphemeralKeyProvider keyProvider = null;
            private final boolean shouldPrefetchEphemeralKey = false;
            private final com.stripe.android.OperationIdFactory operationIdFactory = null;
            private final kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier = null;
            
            public Default(@org.jetbrains.annotations.NotNull()
            com.stripe.android.EphemeralKeyProvider keyProvider, boolean shouldPrefetchEphemeralKey, @org.jetbrains.annotations.NotNull()
            com.stripe.android.OperationIdFactory operationIdFactory, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function0<java.lang.Long> timeSupplier) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Companion;", "", "()V", "REFRESH_BUFFER_IN_SECONDS", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}