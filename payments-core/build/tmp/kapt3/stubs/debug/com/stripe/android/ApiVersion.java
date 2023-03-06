package com.stripe.android;

import java.lang.System;

/**
 * A class that represents a Stripe API version.
 *
 * See [https://stripe.com/docs/api/versioning](https://stripe.com/docs/api/versioning)
 * for documentation on API versioning.
 *
 * See [https://stripe.com/docs/upgrades](https://stripe.com/docs/upgrades) for latest
 * API changes.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/ApiVersion;", "", "betas", "", "Lcom/stripe/android/StripeApiBeta;", "(Ljava/util/Set;)V", "version", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getBetas$payments_core_debug", "()Ljava/util/Set;", "code", "getCode", "()Ljava/lang/String;", "getVersion$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_debug"})
public final class ApiVersion {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.stripe.android.StripeApiBeta> betas = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.ApiVersion.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_VERSION_CODE = "2020-03-02";
    private static final com.stripe.android.ApiVersion INSTANCE = null;
    
    /**
     * A class that represents a Stripe API version.
     *
     * See [https://stripe.com/docs/api/versioning](https://stripe.com/docs/api/versioning)
     * for documentation on API versioning.
     *
     * See [https://stripe.com/docs/upgrades](https://stripe.com/docs/upgrades) for latest
     * API changes.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.ApiVersion copy(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas) {
        return null;
    }
    
    /**
     * A class that represents a Stripe API version.
     *
     * See [https://stripe.com/docs/api/versioning](https://stripe.com/docs/api/versioning)
     * for documentation on API versioning.
     *
     * See [https://stripe.com/docs/upgrades](https://stripe.com/docs/upgrades) for latest
     * API changes.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class that represents a Stripe API version.
     *
     * See [https://stripe.com/docs/api/versioning](https://stripe.com/docs/api/versioning)
     * for documentation on API versioning.
     *
     * See [https://stripe.com/docs/upgrades](https://stripe.com/docs/upgrades) for latest
     * API changes.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A class that represents a Stripe API version.
     *
     * See [https://stripe.com/docs/api/versioning](https://stripe.com/docs/api/versioning)
     * for documentation on API versioning.
     *
     * See [https://stripe.com/docs/upgrades](https://stripe.com/docs/upgrades) for latest
     * API changes.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.StripeApiBeta> component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.StripeApiBeta> getBetas$payments_core_debug() {
        return null;
    }
    
    public ApiVersion(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/ApiVersion$Companion;", "", "()V", "API_VERSION_CODE", "", "INSTANCE", "Lcom/stripe/android/ApiVersion;", "get", "get$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}