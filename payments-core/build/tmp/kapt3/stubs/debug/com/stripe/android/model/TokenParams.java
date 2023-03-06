package com.stripe.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/TokenParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "tokenType", "Lcom/stripe/android/model/Token$Type;", "attribution", "", "", "(Lcom/stripe/android/model/Token$Type;Ljava/util/Set;)V", "getAttribution$payments_core_debug", "()Ljava/util/Set;", "getTokenType$payments_core_debug", "()Lcom/stripe/android/model/Token$Type;", "typeDataParams", "", "", "getTypeDataParams", "()Ljava/util/Map;", "toParamMap", "payments-core_debug"})
public abstract class TokenParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.Token.Type tokenType = null;
    
    /**
     * The SDK components that were involved in the creation of this token
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> attribution = null;
    
    public TokenParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Token.Type tokenType, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> attribution) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Token.Type getTokenType$payments_core_debug() {
        return null;
    }
    
    /**
     * The SDK components that were involved in the creation of this token
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getAttribution$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.Object> getTypeDataParams();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
}