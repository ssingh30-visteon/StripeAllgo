package com.stripe.android.networking;

import java.lang.System;

/**
 * Factory for [AnalyticsRequest] objects.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002ABB\'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bB\u001d\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0002\u0010\u000bB/\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\rBA\b\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0002\b\u001bJ%\u0010\u001c\u001a\u00020\u00172\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001e\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\b\u001fJ\u0019\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!H\u0000\u00a2\u0006\u0002\b\"J\u001b\u0010#\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0002\b$J\u001b\u0010%\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0002\b&J\u001b\u0010\'\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0002\b(JP\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\u0018\u001a\u00020\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0019\u0010.\u001a\u00020\u00172\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0002\b0J%\u00101\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u0001022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0002\b3JI\u00104\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0000\u00a2\u0006\u0002\b5J\u0016\u00104\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005J\u0017\u00107\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0002\b8J%\u00109\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0002\b:J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J#\u0010<\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010*\u001a\u00020+H\u0000\u00a2\u0006\u0002\b=J,\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u001a\u0010?\u001a\u00020@2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "", "context", "Landroid/content/Context;", "publishableKey", "", "defaultProductUsageTokens", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "publishableKeyProvider", "Ljavax/inject/Provider;", "(Landroid/content/Context;Ljavax/inject/Provider;)V", "Lkotlin/Function0;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "packageManager", "Landroid/content/pm/PackageManager;", "packageInfo", "Landroid/content/pm/PackageInfo;", "packageName", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljava/util/Set;)V", "getDefaultProductUsageTokens$payments_core_debug", "()Ljava/util/Set;", "create3ds2Challenge", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "uiTypeCode", "create3ds2Challenge$payments_core_debug", "createAddSource", "productUsageTokens", "sourceType", "createAddSource$payments_core_debug", "createAppDataParams", "", "createAppDataParams$payments_core_debug", "createAttachPaymentMethod", "createAttachPaymentMethod$payments_core_debug", "createDeleteSource", "createDeleteSource$payments_core_debug", "createDetachPaymentMethod", "createDetachPaymentMethod$payments_core_debug", "createParams", "tokenType", "Lcom/stripe/android/model/Token$Type;", "threeDS2UiType", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "createPaymentIntentConfirmation", "paymentMethodType", "createPaymentIntentConfirmation$payments_core_debug", "createPaymentMethodCreation", "Lcom/stripe/android/model/PaymentMethod$Type;", "createPaymentMethodCreation$payments_core_debug", "createRequest", "createRequest$payments_core_debug", "deviceId", "createSetupIntentConfirmation", "createSetupIntentConfirmation$payments_core_debug", "createSourceCreation", "createSourceCreation$payments_core_debug", "createStandardParams", "createTokenCreation", "createTokenCreation$payments_core_debug", "createTokenTypeParam", "getAppName", "", "Companion", "ThreeDS2UiType", "payments-core_debug"})
public final class PaymentAnalyticsRequestFactory {
    private final android.content.pm.PackageManager packageManager = null;
    private final android.content.pm.PackageInfo packageInfo = null;
    private final java.lang.String packageName = null;
    private final javax.inject.Provider<java.lang.String> publishableKeyProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> defaultProductUsageTokens = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.PaymentAnalyticsRequestFactory.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_PRODUCT_USAGE = "product_usage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_ANALYTICS_UA = "analytics_ua";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_APP_NAME = "app_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_APP_VERSION = "app_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_BINDINGS_VERSION = "bindings_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_IS_DEVELOPMENT = "is_development";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_DEVICE_ID = "device_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_DEVICE_TYPE = "device_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_EVENT = "event";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_OS_NAME = "os_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_OS_RELEASE = "os_release";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_OS_VERSION = "os_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_PUBLISHABLE_KEY = "publishable_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_SOURCE_TYPE = "source_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_3DS2_UI_TYPE = "3ds2_ui_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_TOKEN_TYPE = "token_type";
    private static final java.lang.String ANALYTICS_PREFIX = "analytics";
    private static final java.lang.String ANALYTICS_NAME = "stripe_android";
    private static final java.lang.String ANALYTICS_VERSION = "1.0";
    private static final java.lang.String DEVICE_TYPE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANALYTICS_UA = "analytics.stripe_android-1.0";
    
    @androidx.annotation.VisibleForTesting()
    public PaymentAnalyticsRequestFactory(@org.jetbrains.annotations.Nullable()
    android.content.pm.PackageManager packageManager, @org.jetbrains.annotations.Nullable()
    android.content.pm.PackageInfo packageInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defaultProductUsageTokens) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getDefaultProductUsageTokens$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public PaymentAnalyticsRequestFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defaultProductUsageTokens) {
        super();
    }
    
    public PaymentAnalyticsRequestFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<java.lang.String> publishableKeyProvider) {
        super();
    }
    
    @javax.inject.Inject()
    public PaymentAnalyticsRequestFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> defaultProductUsageTokens) {
        super();
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createParams(java.lang.String event, java.util.Set<java.lang.String> productUsageTokens, @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, com.stripe.android.model.Token.Type tokenType, com.stripe.android.networking.PaymentAnalyticsRequestFactory.ThreeDS2UiType threeDS2UiType) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> createTokenTypeParam(@com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, com.stripe.android.model.Token.Type tokenType) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createStandardParams(java.lang.String event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> createAppDataParams$payments_core_debug() {
        return null;
    }
    
    private final java.lang.CharSequence getAppName(android.content.pm.PackageInfo packageInfo, android.content.pm.PackageManager packageManager) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "code", "", "typeName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "Companion", "payments-core_debug"})
    public static enum ThreeDS2UiType {
        /*public static final*/ None /* = new None(null, null) */,
        /*public static final*/ Text /* = new Text(null, null) */,
        /*public static final*/ SingleSelect /* = new SingleSelect(null, null) */,
        /*public static final*/ MultiSelect /* = new MultiSelect(null, null) */,
        /*public static final*/ Oob /* = new Oob(null, null) */,
        /*public static final*/ Html /* = new Html(null, null) */;
        private final java.lang.String code = null;
        private final java.lang.String typeName = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.networking.PaymentAnalyticsRequestFactory.ThreeDS2UiType.Companion Companion = null;
        
        ThreeDS2UiType(java.lang.String code, java.lang.String typeName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;", "", "()V", "fromUiTypeCode", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "uiTypeCode", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.networking.PaymentAnalyticsRequestFactory.ThreeDS2UiType fromUiTypeCode(@org.jetbrains.annotations.Nullable()
            java.lang.String uiTypeCode) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\"\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$Companion;", "", "()V", "ANALYTICS_NAME", "", "ANALYTICS_PREFIX", "ANALYTICS_UA", "ANALYTICS_VERSION", "DEVICE_TYPE", "FIELD_3DS2_UI_TYPE", "FIELD_ANALYTICS_UA", "FIELD_APP_NAME", "FIELD_APP_VERSION", "FIELD_BINDINGS_VERSION", "FIELD_DEVICE_ID", "FIELD_DEVICE_TYPE", "FIELD_EVENT", "FIELD_IS_DEVELOPMENT", "FIELD_OS_NAME", "FIELD_OS_RELEASE", "FIELD_OS_VERSION", "FIELD_PRODUCT_USAGE", "FIELD_PUBLISHABLE_KEY", "FIELD_SOURCE_TYPE", "FIELD_TOKEN_TYPE", "VALID_PARAM_FIELDS", "", "getVALID_PARAM_FIELDS$payments_core_debug", "()Ljava/util/Set;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getVALID_PARAM_FIELDS$payments_core_debug() {
            return null;
        }
    }
}