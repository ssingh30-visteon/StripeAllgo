package com.stripe.android.model;

import java.lang.System;

/**
 * Represents a grouping of parameters needed to create a [Source] object on the server.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b;\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0006lmnopqB\u00b9\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b\u00a2\u0006\u0002\u0010\u001cJ\t\u0010L\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0017H\u00c2\u0003J\t\u0010P\u001a\u00020\u0019H\u00c2\u0003J\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u00c0\u0003\u00a2\u0006\u0002\bRJ\u0010\u0010S\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\bTJ\u0010\u0010U\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010V\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u00c2\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010]J\t\u0010^\u001a\u00020_H\u00d6\u0001J\u0013\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010c\u001a\u00020_H\u00d6\u0001J\u001e\u0010d\u001a\u00020\u00002\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u0015J\u0014\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\u0015H\u0016J\t\u0010f\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020_H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010#0\u00158F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010)\"\u0004\b8\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R\u0017\u0010?\u001a\u00020\u00048F\u00a2\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "typeRaw", "", "typeData", "Lcom/stripe/android/model/SourceParams$TypeData;", "amount", "", "currency", "owner", "Lcom/stripe/android/model/SourceParams$OwnerParams;", "usage", "Lcom/stripe/android/model/Source$Usage;", "returnUrl", "flow", "Lcom/stripe/android/model/SourceParams$Flow;", "sourceOrder", "Lcom/stripe/android/model/SourceOrderParams;", "token", "metadata", "", "weChatParams", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "apiParams", "Lcom/stripe/android/model/SourceParams$ApiParams;", "attribution", "", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "apiParameterMap", "", "getApiParameterMap", "()Ljava/util/Map;", "getAttribution$payments_core_debug", "()Ljava/util/Set;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getFlow", "()Lcom/stripe/android/model/SourceParams$Flow;", "setFlow", "(Lcom/stripe/android/model/SourceParams$Flow;)V", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "getOwner", "()Lcom/stripe/android/model/SourceParams$OwnerParams;", "setOwner", "(Lcom/stripe/android/model/SourceParams$OwnerParams;)V", "getReturnUrl", "setReturnUrl", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrderParams;", "setSourceOrder", "(Lcom/stripe/android/model/SourceOrderParams;)V", "getToken", "setToken", "type", "getType$annotations", "()V", "getType", "getTypeData$payments_core_debug", "()Lcom/stripe/android/model/SourceParams$TypeData;", "setTypeData$payments_core_debug", "(Lcom/stripe/android/model/SourceParams$TypeData;)V", "getTypeRaw", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component14$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)Lcom/stripe/android/model/SourceParams;", "describeContents", "", "equals", "", "other", "hashCode", "setApiParameterMap", "toParamMap", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ApiParams", "Companion", "Flow", "OwnerParams", "TypeData", "WeChatParams", "payments-core_debug"})
public final class SourceParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    
    /**
     * The type of the source to create.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String typeRaw = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.SourceParams.TypeData typeData;
    
    /**
     * Amount associated with the source. This is the amount for which the source will
     * be chargeable once ready. Required for `single_use` sources. Not supported for `receiver`
     * type sources, where charge amount may not be specified until funds land.
     *
     * See [amount](https://stripe.com/docs/api/sources/create#create_source-amount)
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long amount;
    
    /**
     * Three-letter ISO code for the currency associated with the source.
     * This is the currency for which the source will be chargeable once ready.
     *
     * See [currency](https://stripe.com/docs/api/sources/create#create_source-currency)
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency;
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.SourceParams.OwnerParams owner;
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not.
     * Some source types may or may not be reusable by construction, while others may leave the
     * option at creation. If an incompatible value is passed, an error will be returned.
     *
     * See [usage](https://stripe.com/docs/api/sources/create#create_source-usage)
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.Source.Usage usage;
    
    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String returnUrl;
    
    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
     * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
     *
     * See [flow](https://stripe.com/docs/api/sources/create#create_source-flow)
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.SourceParams.Flow flow;
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     *
     * See [source_order](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.SourceOrderParams sourceOrder;
    
    /**
     * An optional token used to create the source. When passed, token properties will
     * override source parameters.
     *
     * See [token](https://stripe.com/docs/api/sources/create#create_source-token)
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token;
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> metadata;
    private com.stripe.android.model.SourceParams.WeChatParams weChatParams;
    private com.stripe.android.model.SourceParams.ApiParams apiParams;
    
    /**
     * A set of identifiers representing the component that created this instance.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> attribution = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.SourceParams.Companion Companion = null;
    private static final java.lang.String PARAM_AMOUNT = "amount";
    private static final java.lang.String PARAM_CLIENT_SECRET = "client_secret";
    private static final java.lang.String PARAM_CURRENCY = "currency";
    private static final java.lang.String PARAM_FLOW = "flow";
    private static final java.lang.String PARAM_METADATA = "metadata";
    private static final java.lang.String PARAM_OWNER = "owner";
    private static final java.lang.String PARAM_REDIRECT = "redirect";
    private static final java.lang.String PARAM_RETURN_URL = "return_url";
    private static final java.lang.String PARAM_SOURCE_ORDER = "source_order";
    private static final java.lang.String PARAM_TOKEN = "token";
    private static final java.lang.String PARAM_TYPE = "type";
    private static final java.lang.String PARAM_USAGE = "usage";
    private static final java.lang.String PARAM_WECHAT = "wechat";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams> CREATOR = null;
    
    /**
     * Represents a grouping of parameters needed to create a [Source] object on the server.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SourceParams copy(@org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String typeRaw, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.TypeData typeData, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.OwnerParams owner, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Usage usage, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.Flow flow, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrderParams sourceOrder, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.WeChatParams weChatParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams.ApiParams apiParams, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> attribution) {
        return null;
    }
    
    /**
     * Represents a grouping of parameters needed to create a [Source] object on the server.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Represents a grouping of parameters needed to create a [Source] object on the server.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Represents a grouping of parameters needed to create a [Source] object on the server.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SourceParams(@org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String typeRaw, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.TypeData typeData, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.OwnerParams owner, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Usage usage, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.Flow flow, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrderParams sourceOrder, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.WeChatParams weChatParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams.ApiParams apiParams, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> attribution) {
        super();
    }
    
    /**
     * The type of the source to create.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * The type of the source to create.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeRaw() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.TypeData component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.TypeData getTypeData$payments_core_debug() {
        return null;
    }
    
    public final void setTypeData$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.TypeData p0) {
    }
    
    /**
     * Amount associated with the source. This is the amount for which the source will
     * be chargeable once ready. Required for `single_use` sources. Not supported for `receiver`
     * type sources, where charge amount may not be specified until funds land.
     *
     * See [amount](https://stripe.com/docs/api/sources/create#create_source-amount)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    /**
     * Amount associated with the source. This is the amount for which the source will
     * be chargeable once ready. Required for `single_use` sources. Not supported for `receiver`
     * type sources, where charge amount may not be specified until funds land.
     *
     * See [amount](https://stripe.com/docs/api/sources/create#create_source-amount)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAmount() {
        return null;
    }
    
    /**
     * Amount associated with the source. This is the amount for which the source will
     * be chargeable once ready. Required for `single_use` sources. Not supported for `receiver`
     * type sources, where charge amount may not be specified until funds land.
     *
     * See [amount](https://stripe.com/docs/api/sources/create#create_source-amount)
     */
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    /**
     * Three-letter ISO code for the currency associated with the source.
     * This is the currency for which the source will be chargeable once ready.
     *
     * See [currency](https://stripe.com/docs/api/sources/create#create_source-currency)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Three-letter ISO code for the currency associated with the source.
     * This is the currency for which the source will be chargeable once ready.
     *
     * See [currency](https://stripe.com/docs/api/sources/create#create_source-currency)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * Three-letter ISO code for the currency associated with the source.
     * This is the currency for which the source will be chargeable once ready.
     *
     * See [currency](https://stripe.com/docs/api/sources/create#create_source-currency)
     */
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.OwnerParams component5() {
        return null;
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.OwnerParams getOwner() {
        return null;
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    public final void setOwner(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.OwnerParams p0) {
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not.
     * Some source types may or may not be reusable by construction, while others may leave the
     * option at creation. If an incompatible value is passed, an error will be returned.
     *
     * See [usage](https://stripe.com/docs/api/sources/create#create_source-usage)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Usage component6() {
        return null;
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not.
     * Some source types may or may not be reusable by construction, while others may leave the
     * option at creation. If an incompatible value is passed, an error will be returned.
     *
     * See [usage](https://stripe.com/docs/api/sources/create#create_source-usage)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Usage getUsage() {
        return null;
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not.
     * Some source types may or may not be reusable by construction, while others may leave the
     * option at creation. If an incompatible value is passed, an error will be returned.
     *
     * See [usage](https://stripe.com/docs/api/sources/create#create_source-usage)
     */
    public final void setUsage(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Usage p0) {
    }
    
    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReturnUrl() {
        return null;
    }
    
    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    public final void setReturnUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
     * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
     *
     * See [flow](https://stripe.com/docs/api/sources/create#create_source-flow)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.Flow component8() {
        return null;
    }
    
    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
     * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
     *
     * See [flow](https://stripe.com/docs/api/sources/create#create_source-flow)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceParams.Flow getFlow() {
        return null;
    }
    
    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
     * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
     *
     * See [flow](https://stripe.com/docs/api/sources/create#create_source-flow)
     */
    public final void setFlow(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceParams.Flow p0) {
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     *
     * See [source_order](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrderParams component9() {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     *
     * See [source_order](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrderParams getSourceOrder() {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     *
     * See [source_order](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    public final void setSourceOrder(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrderParams p0) {
    }
    
    /**
     * An optional token used to create the source. When passed, token properties will
     * override source parameters.
     *
     * See [token](https://stripe.com/docs/api/sources/create#create_source-token)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * An optional token used to create the source. When passed, token properties will
     * override source parameters.
     *
     * See [token](https://stripe.com/docs/api/sources/create#create_source-token)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    /**
     * An optional token used to create the source. When passed, token properties will
     * override source parameters.
     *
     * See [token](https://stripe.com/docs/api/sources/create#create_source-token)
     */
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component11() {
        return null;
    }
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return null;
    }
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format.
     */
    public final void setMetadata(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    private final com.stripe.android.model.SourceParams.WeChatParams component12() {
        return null;
    }
    
    private final com.stripe.android.model.SourceParams.ApiParams component13() {
        return null;
    }
    
    /**
     * A set of identifiers representing the component that created this instance.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> component14$payments_core_debug() {
        return null;
    }
    
    /**
     * A set of identifiers representing the component that created this instance.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getAttribution$payments_core_debug() {
        return null;
    }
    
    /**
     * The type of the source to create.
     */
    @com.stripe.android.model.Source.SourceType()
    @java.lang.Deprecated()
    public static void getType$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getApiParameterMap() {
        return null;
    }
    
    /**
     * @param apiParameterMap a map of parameters specific for this type of source
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SourceParams setApiParameterMap(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> apiParameterMap) {
        return null;
    }
    
    /**
     * Create a string-keyed map representing this object that is ready to be sent over the network.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
    
    /**
     * Create P24 Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param currency `eur` or `pln` (P24 payments must be in either Euros
     * or Polish Zloty).
     * @param name The name of the account holder (optional).
     * @param email The email address of the account holder.
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @return a [SourceParams] that can be used to create a P24 source
     *
     * @see [Przelewy24 Payments with Sources](https://stripe.com/docs/sources/p24)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createP24Params(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl) {
        return null;
    }
    
    /**
     * Create reusable Alipay Source params.
     *
     * @param currency The currency of the payment. Must be the default currency for your country.
     * Can be aud, cad, eur, gbp, hkd, jpy, nzd, sgd, or usd. Users in Denmark,
     * Norway, Sweden, or Switzerland must use eur.
     * @param name The name of the account holder (optional).
     * @param email The email address of the account holder (optional).
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @return a [SourceParams] that can be used to create an Alipay reusable source
     *
     * @see [Alipay Payments with Sources](https://stripe.com/docs/sources/alipay)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createAlipayReusableParams(@org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl) {
        return null;
    }
    
    /**
     * Create single-use Alipay Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a $10.99 payment).
     * @param currency The currency of the payment. Must be the default currency for your country.
     * Can be aud, cad, eur, gbp, hkd, jpy, nzd, sgd, or usd. Users in Denmark,
     * Norway, Sweden, or Switzerland must use eur.
     * @param name The name of the account holder (optional).
     * @param email The email address of the account holder (optional).
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @return a [SourceParams] that can be used to create an Alipay single-use source
     *
     * @see [Alipay Payments with Sources](https://stripe.com/docs/sources/alipay)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createAlipaySingleUseParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl) {
        return null;
    }
    
    /**
     * Create WeChat Pay Source params.
     *
     * @param amount A positive integer in the
     * [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
     * representing the amount to charge the customer (e.g., 1099 for a $10.99 payment).
     * @param currency The currency of the payment. Must be the default currency for your
     * country. Can be aud, cad, eur, gbp, hkd, jpy, sgd, or usd.
     * @param weChatAppId Your registered WeChat Pay App ID from
     * [WeChat Open Platform](https://open.weixin.qq.com/).
     * @param statementDescriptor (optional) A custom statement descriptor for the payment,
     * maximum 32 characters. By default, your Stripe account’s statement descriptor is
     * used (you can review this in the [Dashboard](https://dashboard.stripe.com/account).
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createWeChatPayParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String weChatAppId, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        return null;
    }
    
    /**
     * Create params for a Klarna Source
     *
     * [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
     *
     * @param returnUrl The URL you provide to redirect the customer back to you after they
     * authenticated their payment. It can use your application URI scheme in the context of
     * a mobile application.
     * @param currency Three-letter ISO code for the currency associated with the source.
     * This is the currency for which the source will be chargeable once ready.
     * @param klarnaParams Klarna-specific params
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createKlarna(@org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.KlarnaSourceParams klarnaParams) {
        return null;
    }
    
    /**
     * Create Bancontact Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment). The charge amount must be
     * at least €1 or its equivalent in the given currency.
     * @param name The full name of the account holder.
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param statementDescriptor A custom statement descriptor for the payment (optional).
     * @param preferredLanguage The preferred language of the Bancontact authorization page that the
     * customer is redirected to. Supported values are: en, de, fr, or nl
     * (optional).
     * @return a [SourceParams] object that can be used to create a Bancontact source
     *
     * @see [Bancontact Payments with Sources](https://stripe.com/docs/sources/bancontact)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createBancontactParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String preferredLanguage) {
        return null;
    }
    
    /**
     * Create a custom [SourceParams] object. Incorrect attributes may result in errors
     * when connecting to Stripe's API.
     *
     * @param type a custom type
     * @return an empty [SourceParams] object.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createCustomParams(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    /**
     * Create parameters necessary for converting a token into a source
     *
     * @param tokenId the id of the [Token] to be converted into a source.
     * @return a [SourceParams] object that can be used to create a source.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createSourceFromTokenParams(@org.jetbrains.annotations.NotNull()
    java.lang.String tokenId) {
        return null;
    }
    
    /**
     * Create Card Source params.
     *
     * @param cardParams A [CardParams] object containing the details necessary for the source.
     * @return a [SourceParams] object that can be used to create a card source.
     *
     * @see [Card Payments with Sources](https://stripe.com/docs/sources/cards)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createCardParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams) {
        return null;
    }
    
    /**
     * @param googlePayPaymentData a [JSONObject] derived from Google Pay's
     * [PaymentData#toJson()](https://developers.google.com/pay/api/android/reference/client#tojson)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createCardParamsFromGooglePay(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject googlePayPaymentData) throws org.json.JSONException {
        return null;
    }
    
    /**
     * Create EPS Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param name The full name of the account holder.
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param statementDescriptor A custom statement descriptor for the payment (optional).
     * @return a [SourceParams] object that can be used to create an EPS source
     *
     * @see [EPS Payments with Sources](https://stripe.com/docs/sources/eps)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createEPSParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        return null;
    }
    
    /**
     * Create Giropay Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param name The full name of the account holder.
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param statementDescriptor A custom statement descriptor for the payment (optional).
     * @return a [SourceParams] object that can be used to create a Giropay source
     *
     * @see [Giropay Payments with Sources](https://stripe.com/docs/sources/giropay)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createGiropayParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        return null;
    }
    
    /**
     * Create iDEAL Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param name The full name of the account holder (optional).
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param statementDescriptor A custom statement descriptor for the payment (optional).
     * @param bank The customer’s bank (optional).
     * @return a [SourceParams] object that can be used to create an iDEAL source
     *
     * @see [iDEAL Payments with Sources](https://stripe.com/docs/sources/ideal)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createIdealParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String bank) {
        return null;
    }
    
    /**
     * Create Multibanco Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param email The full email address of the customer.
     * @return a [SourceParams] object that can be used to create a Multibanco source
     *
     * @see [Multibanco Payments with Sources](https://stripe.com/docs/sources/multibanco)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createMultibancoParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    /**
     * Create SEPA Debit Source params.
     *
     * @param name The full name of the account holder.
     * @param iban The IBAN number for the bank account that you wish to debit.
     * @param addressLine1 The first line of the owner's address (optional).
     * @param city The city of the owner's address.
     * @param postalCode The postal code of the owner's address.
     * @param country The ISO-3166 2-letter country code of the owner's address.
     * @return a [SourceParams] object that can be used to create a SEPA debit source
     *
     * @see [SEPA Direct Debit Payments with Sources](https://stripe.com/docs/sources/sepa-debit)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createSepaDebitParams(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String iban, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(value = 2L)
    java.lang.String country) {
        return null;
    }
    
    /**
     * Create SEPA Debit Source params.
     *
     * @param name The full name of the account holder.
     * @param iban The IBAN number for the bank account that you wish to debit.
     * @param email The full email address of the owner (optional).
     * @param addressLine1 The first line of the owner's address (optional).
     * @param city The city of the owner's address.
     * @param postalCode The postal code of the owner's address.
     * @param country The ISO-3166 2-letter country code of the owner's address.
     * @return a [SourceParams] object that can be used to create a SEPA debit source
     *
     * @see [SEPA Direct Debit Payments with Sources](https://stripe.com/docs/sources/sepa-debit)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createSepaDebitParams(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String iban, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 2L)
    java.lang.String country) {
        return null;
    }
    
    /**
     * Create SOFORT Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param returnUrl The URL the customer should be redirected to after the authorization
     * process.
     * @param country The ISO-3166 2-letter country code of the customer’s bank.
     * @param statementDescriptor A custom statement descriptor for the payment (optional).
     * @return a [SourceParams] object that can be used to create a SOFORT source
     *
     * @see [SOFORT Payments with Sources](https://stripe.com/docs/sources/sofort)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createSofortParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(value = 2L)
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        return null;
    }
    
    /**
     * Create 3D Secure Source params.
     *
     * @param amount A positive integer in the smallest currency unit representing the amount to
     * charge the customer (e.g., 1099 for a €10.99 payment).
     * @param currency The currency the payment is being created in (e.g., eur).
     * @param returnUrl The URL the customer should be redirected to after the verification process.
     * @param cardId The ID of the card source.
     * @return a [SourceParams] object that can be used to create a 3D Secure source
     *
     * @see [3D Secure Card Payments with Sources](https://stripe.com/docs/sources/three-d-secure)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createThreeDSecureParams(@androidx.annotation.IntRange(from = 0L)
    long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String cardId) {
        return null;
    }
    
    /**
     * Create parameters needed to make a Visa Checkout source.
     *
     * @param callId The payment request ID (callId) from the Visa Checkout SDK.
     * @return a [SourceParams] object that can be used to create a Visa Checkout Card Source.
     *
     * @see [https://stripe.com/docs/visa-checkout](https://stripe.com/docs/visa-checkout)
     *
     * @see [https://developer.visa.com/capabilities/visa_checkout/docs](https://developer.visa.com/capabilities/visa_checkout/docs)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createVisaCheckoutParams(@org.jetbrains.annotations.NotNull()
    java.lang.String callId) {
        return null;
    }
    
    /**
     * Create parameters needed to make a Masterpass source
     *
     * @param transactionId The transaction ID from the Masterpass SDK.
     * @param cartId A unique string that you generate to identify the purchase when creating a cart
     * for checkout in the Masterpass SDK.
     *
     * @return a [SourceParams] object that can be used to create a Masterpass Card Source.
     *
     * @see [https://stripe.com/docs/masterpass](https://stripe.com/docs/masterpass)
     *
     * @see [https://developer.mastercard.com/product/masterpass](https://developer.mastercard.com/product/masterpass)
     *
     * @see [https://developer.mastercard.com/page/masterpass-merchant-mobile-checkout-sdk-for-android-v2](https://developer.mastercard.com/page/masterpass-merchant-mobile-checkout-sdk-for-android-v2)
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.SourceParams createMasterpassParams(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String cartId) {
        return null;
    }
    
    /**
     * Create parameters needed to retrieve a source.
     *
     * @param clientSecret the client secret for the source, needed because the Android SDK uses
     * a public key
     * @return a [Map] matching the parameter name to the client secret, ready to send to
     * the server.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.Map<java.lang.String, java.lang.String> createRetrieveSourceParams(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "appId", "", "statementDescriptor", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class WeChatParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        private final java.lang.String appId = null;
        private final java.lang.String statementDescriptor = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.SourceParams.WeChatParams.Companion Companion = null;
        private static final java.lang.String PARAM_APPID = "appid";
        private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.WeChatParams> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceParams.WeChatParams copy(@org.jetbrains.annotations.Nullable()
        java.lang.String appId, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public WeChatParams() {
            super();
        }
        
        public WeChatParams(@org.jetbrains.annotations.Nullable()
        java.lang.String appId, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            super();
        }
        
        private final java.lang.String component1() {
            return null;
        }
        
        private final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.WeChatParams> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.WeChatParams createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.WeChatParams[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams$Companion;", "", "()V", "PARAM_APPID", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     *
     * See [owner](https://stripe.com/docs/api/sources/create#create_source-owner).
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B7\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ9\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020 H\u00d6\u0001J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0\'H\u0016J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020 H\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_debug", "()Lcom/stripe/android/model/Address;", "setAddress$payments_core_debug", "(Lcom/stripe/android/model/Address;)V", "getEmail$payments_core_debug", "()Ljava/lang/String;", "setEmail$payments_core_debug", "(Ljava/lang/String;)V", "getName$payments_core_debug", "setName$payments_core_debug", "getPhone$payments_core_debug", "setPhone$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class OwnerParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private com.stripe.android.model.Address address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String email;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String phone;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.SourceParams.OwnerParams.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_EMAIL = "email";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PHONE = "phone";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.OwnerParams> CREATOR = null;
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         *
         * See [owner](https://stripe.com/docs/api/sources/create#create_source-owner).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceParams.OwnerParams copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            return null;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         *
         * See [owner](https://stripe.com/docs/api/sources/create#create_source-owner).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         *
         * See [owner](https://stripe.com/docs/api/sources/create#create_source-owner).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         *
         * See [owner](https://stripe.com/docs/api/sources/create#create_source-owner).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public OwnerParams() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public OwnerParams(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public OwnerParams(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public OwnerParams(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public OwnerParams(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address getAddress$payments_core_debug() {
            return null;
        }
        
        public final void setAddress$payments_core_debug(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail$payments_core_debug() {
            return null;
        }
        
        public final void setEmail$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName$payments_core_debug() {
            return null;
        }
        
        public final void setName$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone$payments_core_debug() {
            return null;
        }
        
        public final void setPhone$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.OwnerParams> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.OwnerParams createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.OwnerParams[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/SourceParams$Flow;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_debug"})
    public static enum Flow {
        /*public static final*/ Redirect /* = new Redirect(null) */,
        /*public static final*/ Receiver /* = new Receiver(null) */,
        /*public static final*/ CodeVerification /* = new CodeVerification(null) */,
        /*public static final*/ None /* = new None(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        Flow(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u00c6\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u00d6\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams;", "Landroid/os/Parcelable;", "value", "", "", "", "(Ljava/util/Map;)V", "getValue", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class ApiParams implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.Object> value = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.SourceParams.ApiParams.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.ApiParams> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceParams.ApiParams copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ApiParams() {
            super();
        }
        
        public ApiParams(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Object> getValue() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.ApiParams> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.ApiParams createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceParams.ApiParams[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/model/SourceParams$ApiParams;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "payments-core_debug"})
        public static final class Companion implements kotlinx.parcelize.Parceler<com.stripe.android.model.SourceParams.ApiParams> {
            
            private Companion() {
                super();
            }
            
            @java.lang.Override()
            public void write(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.SourceParams.ApiParams $this$write, @org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.SourceParams.ApiParams create(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public com.stripe.android.model.SourceParams.ApiParams[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000e0\u000eR&\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData;", "Landroid/os/Parcelable;", "()V", "params", "", "Lkotlin/Pair;", "", "", "getParams", "()Ljava/util/List;", "type", "getType", "()Ljava/lang/String;", "createParams", "", "Bancontact", "Card", "Eps", "Giropay", "Ideal", "Masterpass", "SepaDebit", "Sofort", "ThreeDSecure", "VisaCheckout", "Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "payments-core_debug"})
    public static abstract class TypeData implements android.os.Parcelable {
        
        private TypeData() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getType();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParams();
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> createParams() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0007\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\n\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData;", "number", "", "expMonth", "", "expYear", "cvc", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCvc", "()Ljava/lang/String;", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getNumber", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams$TypeData$Card;", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Card extends com.stripe.android.model.SourceParams.TypeData {
            
            /**
             * The [number] of this card
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String number = null;
            
            /**
             * Two-digit number representing the card’s expiration month.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer expMonth = null;
            
            /**
             * Four-digit number representing the card’s expiration year.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer expYear = null;
            
            /**
             * The [cvc] for this card
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String cvc = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Card.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_NUMBER = "number";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_EXP_MONTH = "exp_month";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_EXP_YEAR = "exp_year";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_CVC = "cvc";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Card> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Card copy(@org.jetbrains.annotations.Nullable()
            java.lang.String number, @org.jetbrains.annotations.Nullable()
            java.lang.Integer expMonth, @org.jetbrains.annotations.Nullable()
            java.lang.Integer expYear, @org.jetbrains.annotations.Nullable()
            java.lang.String cvc) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Card(@org.jetbrains.annotations.Nullable()
            java.lang.String number, @org.jetbrains.annotations.Nullable()
            java.lang.Integer expMonth, @org.jetbrains.annotations.Nullable()
            java.lang.Integer expYear, @org.jetbrains.annotations.Nullable()
            java.lang.String cvc) {
                super();
            }
            
            /**
             * The [number] of this card
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            /**
             * The [number] of this card
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNumber() {
                return null;
            }
            
            /**
             * Two-digit number representing the card’s expiration month.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2() {
                return null;
            }
            
            /**
             * Two-digit number representing the card’s expiration month.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_month).
             */
            @org.jetbrains.annotations.Nullable()
            @androidx.annotation.IntRange(from = 1L, to = 12L)
            public final java.lang.Integer getExpMonth() {
                return null;
            }
            
            /**
             * Four-digit number representing the card’s expiration year.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component3() {
                return null;
            }
            
            /**
             * Four-digit number representing the card’s expiration year.
             *
             * See [API Reference](https://stripe.com/docs/api/cards/object#card_object-exp_year).
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getExpYear() {
                return null;
            }
            
            /**
             * The [cvc] for this card
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            /**
             * The [cvc] for this card
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCvc() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Card> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Card createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Card[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card$Companion;", "", "()V", "PARAM_CVC", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NUMBER", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R(\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Eps extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String statementDescriptor;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Eps.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Eps> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Eps copy(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Eps() {
                super();
            }
            
            public Eps(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatementDescriptor() {
                return null;
            }
            
            public final void setStatementDescriptor(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Eps> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Eps createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Eps[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps$Companion;", "", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R(\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Giropay extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String statementDescriptor;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Giropay.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Giropay> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Giropay copy(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Giropay() {
                super();
            }
            
            public Giropay(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatementDescriptor() {
                return null;
            }
            
            public final void setStatementDescriptor(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Giropay> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Giropay createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Giropay[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay$Companion;", "", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "bank", "(Ljava/lang/String;Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Ideal extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String statementDescriptor;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String bank;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Ideal.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_BANK = "bank";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Ideal> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Ideal copy(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
            java.lang.String bank) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Ideal() {
                super();
            }
            
            public Ideal(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
            java.lang.String bank) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatementDescriptor() {
                return null;
            }
            
            public final void setStatementDescriptor(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBank() {
                return null;
            }
            
            public final void setBank(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Ideal> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Ideal createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Ideal[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal$Companion;", "", "()V", "PARAM_BANK", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r0\f0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData;", "transactionId", "", "cartId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCartId", "()Ljava/lang/String;", "setCartId", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "getTransactionId", "setTransactionId", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Masterpass extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String transactionId;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String cartId;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Masterpass.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_CART_ID = "cart_id";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_MASTERPASS = "masterpass";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_TRANSACTION_ID = "transaction_id";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Masterpass> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Masterpass copy(@org.jetbrains.annotations.NotNull()
            java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
            java.lang.String cartId) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Masterpass(@org.jetbrains.annotations.NotNull()
            java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
            java.lang.String cartId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTransactionId() {
                return null;
            }
            
            public final void setTransactionId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCartId() {
                return null;
            }
            
            public final void setCartId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Masterpass> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Masterpass createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Masterpass[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass$Companion;", "", "()V", "PARAM_CART_ID", "", "PARAM_MASTERPASS", "PARAM_TRANSACTION_ID", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData;", "country", "", "statementDescriptor", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Sofort extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String country;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String statementDescriptor;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Sofort.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_COUNTRY = "country";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Sofort> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Sofort copy(@org.jetbrains.annotations.NotNull()
            @androidx.annotation.Size(value = 2L)
            java.lang.String country, @org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Sofort(@org.jetbrains.annotations.NotNull()
            @androidx.annotation.Size(value = 2L)
            java.lang.String country, @org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCountry() {
                return null;
            }
            
            public final void setCountry(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatementDescriptor() {
                return null;
            }
            
            public final void setStatementDescriptor(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Sofort> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Sofort createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Sofort[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort$Companion;", "", "()V", "PARAM_COUNTRY", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData;", "iban", "", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "setIban", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class SepaDebit extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String iban;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.SepaDebit.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_IBAN = "iban";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.SepaDebit> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.SepaDebit copy(@org.jetbrains.annotations.NotNull()
            java.lang.String iban) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public SepaDebit(@org.jetbrains.annotations.NotNull()
            java.lang.String iban) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIban() {
                return null;
            }
            
            public final void setIban(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.SepaDebit> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.SepaDebit createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.SepaDebit[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit$Companion;", "", "()V", "PARAM_IBAN", "", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData;", "cardId", "", "(Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "setCardId", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class ThreeDSecure extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String cardId;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.ThreeDSecure.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_CARD = "card";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.ThreeDSecure> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.ThreeDSecure copy(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ThreeDSecure(@org.jetbrains.annotations.NotNull()
            java.lang.String cardId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCardId() {
                return null;
            }
            
            public final void setCardId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.ThreeDSecure> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.ThreeDSecure createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.ThreeDSecure[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure$Companion;", "", "()V", "PARAM_CARD", "", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "Lcom/stripe/android/model/SourceParams$TypeData;", "callId", "", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "setCallId", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class VisaCheckout extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.NotNull()
            private java.lang.String callId;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.VisaCheckout.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_VISA_CHECKOUT = "visa_checkout";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_CALL_ID = "callid";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.VisaCheckout> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.VisaCheckout copy(@org.jetbrains.annotations.NotNull()
            java.lang.String callId) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public VisaCheckout(@org.jetbrains.annotations.NotNull()
            java.lang.String callId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCallId() {
                return null;
            }
            
            public final void setCallId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.VisaCheckout> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.VisaCheckout createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.VisaCheckout[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout$Companion;", "", "()V", "PARAM_CALL_ID", "", "PARAM_VISA_CHECKOUT", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R(\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "preferredLanguage", "(Ljava/lang/String;Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getPreferredLanguage", "()Ljava/lang/String;", "setPreferredLanguage", "(Ljava/lang/String;)V", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Bancontact extends com.stripe.android.model.SourceParams.TypeData {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String statementDescriptor;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String preferredLanguage;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.SourceParams.TypeData.Bancontact.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_PREFERRED_LANGUAGE = "preferred_language";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Bancontact> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SourceParams.TypeData.Bancontact copy(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
            java.lang.String preferredLanguage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Bancontact() {
                super();
            }
            
            public Bancontact(@org.jetbrains.annotations.Nullable()
            java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
            java.lang.String preferredLanguage) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatementDescriptor() {
                return null;
            }
            
            public final void setStatementDescriptor(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPreferredLanguage() {
                return null;
            }
            
            public final void setPreferredLanguage(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getParams() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceParams.TypeData.Bancontact> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Bancontact createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.SourceParams.TypeData.Bancontact[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact$Companion;", "", "()V", "PARAM_PREFERRED_LANGUAGE", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J:\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0007J.\u0010%\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010&\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J<\u0010\'\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010)\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H\u0007J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0007J\"\u0010/\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J4\u00100\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u001e\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004022\b\b\u0001\u00103\u001a\u00020\u0004H\u0007J<\u00104\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u0004H\u0007JL\u00104\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J0\u0010:\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0004H\u0007J*\u0010=\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004H\u0007J\u0010\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0004H\u0007J.\u0010A\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/stripe/android/model/SourceParams$Companion;", "", "()V", "PARAM_AMOUNT", "", "PARAM_CLIENT_SECRET", "PARAM_CURRENCY", "PARAM_FLOW", "PARAM_METADATA", "PARAM_OWNER", "PARAM_REDIRECT", "PARAM_RETURN_URL", "PARAM_SOURCE_ORDER", "PARAM_TOKEN", "PARAM_TYPE", "PARAM_USAGE", "PARAM_WECHAT", "createAlipayReusableParams", "Lcom/stripe/android/model/SourceParams;", "currency", "name", "email", "returnUrl", "createAlipaySingleUseParams", "amount", "", "createBancontactParams", "statementDescriptor", "preferredLanguage", "createCardParams", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardParamsFromGooglePay", "googlePayPaymentData", "Lorg/json/JSONObject;", "createCustomParams", "type", "createEPSParams", "createGiropayParams", "createIdealParams", "bank", "createKlarna", "klarnaParams", "Lcom/stripe/android/model/KlarnaSourceParams;", "createMasterpassParams", "transactionId", "cartId", "createMultibancoParams", "createP24Params", "createRetrieveSourceParams", "", "clientSecret", "createSepaDebitParams", "iban", "addressLine1", "city", "postalCode", "country", "createSofortParams", "createSourceFromTokenParams", "tokenId", "createThreeDSecureParams", "cardId", "createVisaCheckoutParams", "callId", "createWeChatPayParams", "weChatAppId", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create P24 Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param currency `eur` or `pln` (P24 payments must be in either Euros
         * or Polish Zloty).
         * @param name The name of the account holder (optional).
         * @param email The email address of the account holder.
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @return a [SourceParams] that can be used to create a P24 source
         *
         * @see [Przelewy24 Payments with Sources](https://stripe.com/docs/sources/p24)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createP24Params(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl) {
            return null;
        }
        
        /**
         * Create reusable Alipay Source params.
         *
         * @param currency The currency of the payment. Must be the default currency for your country.
         * Can be aud, cad, eur, gbp, hkd, jpy, nzd, sgd, or usd. Users in Denmark,
         * Norway, Sweden, or Switzerland must use eur.
         * @param name The name of the account holder (optional).
         * @param email The email address of the account holder (optional).
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @return a [SourceParams] that can be used to create an Alipay reusable source
         *
         * @see [Alipay Payments with Sources](https://stripe.com/docs/sources/alipay)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createAlipayReusableParams(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl) {
            return null;
        }
        
        /**
         * Create single-use Alipay Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a $10.99 payment).
         * @param currency The currency of the payment. Must be the default currency for your country.
         * Can be aud, cad, eur, gbp, hkd, jpy, nzd, sgd, or usd. Users in Denmark,
         * Norway, Sweden, or Switzerland must use eur.
         * @param name The name of the account holder (optional).
         * @param email The email address of the account holder (optional).
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @return a [SourceParams] that can be used to create an Alipay single-use source
         *
         * @see [Alipay Payments with Sources](https://stripe.com/docs/sources/alipay)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createAlipaySingleUseParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl) {
            return null;
        }
        
        /**
         * Create WeChat Pay Source params.
         *
         * @param amount A positive integer in the
         * [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
         * representing the amount to charge the customer (e.g., 1099 for a $10.99 payment).
         * @param currency The currency of the payment. Must be the default currency for your
         * country. Can be aud, cad, eur, gbp, hkd, jpy, sgd, or usd.
         * @param weChatAppId Your registered WeChat Pay App ID from
         * [WeChat Open Platform](https://open.weixin.qq.com/).
         * @param statementDescriptor (optional) A custom statement descriptor for the payment,
         * maximum 32 characters. By default, your Stripe account’s statement descriptor is
         * used (you can review this in the [Dashboard](https://dashboard.stripe.com/account).
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createWeChatPayParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String weChatAppId, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            return null;
        }
        
        /**
         * Create params for a Klarna Source
         *
         * [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
         *
         * @param returnUrl The URL you provide to redirect the customer back to you after they
         * authenticated their payment. It can use your application URI scheme in the context of
         * a mobile application.
         * @param currency Three-letter ISO code for the currency associated with the source.
         * This is the currency for which the source will be chargeable once ready.
         * @param klarnaParams Klarna-specific params
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createKlarna(@org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.KlarnaSourceParams klarnaParams) {
            return null;
        }
        
        /**
         * Create Bancontact Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment). The charge amount must be
         * at least €1 or its equivalent in the given currency.
         * @param name The full name of the account holder.
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param statementDescriptor A custom statement descriptor for the payment (optional).
         * @param preferredLanguage The preferred language of the Bancontact authorization page that the
         * customer is redirected to. Supported values are: en, de, fr, or nl
         * (optional).
         * @return a [SourceParams] object that can be used to create a Bancontact source
         *
         * @see [Bancontact Payments with Sources](https://stripe.com/docs/sources/bancontact)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createBancontactParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
        java.lang.String preferredLanguage) {
            return null;
        }
        
        /**
         * Create a custom [SourceParams] object. Incorrect attributes may result in errors
         * when connecting to Stripe's API.
         *
         * @param type a custom type
         * @return an empty [SourceParams] object.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createCustomParams(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        /**
         * Create parameters necessary for converting a token into a source
         *
         * @param tokenId the id of the [Token] to be converted into a source.
         * @return a [SourceParams] object that can be used to create a source.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createSourceFromTokenParams(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenId) {
            return null;
        }
        
        /**
         * Create Card Source params.
         *
         * @param cardParams A [CardParams] object containing the details necessary for the source.
         * @return a [SourceParams] object that can be used to create a card source.
         *
         * @see [Card Payments with Sources](https://stripe.com/docs/sources/cards)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createCardParams(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardParams cardParams) {
            return null;
        }
        
        /**
         * @param googlePayPaymentData a [JSONObject] derived from Google Pay's
         * [PaymentData#toJson()](https://developers.google.com/pay/api/android/reference/client#tojson)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createCardParamsFromGooglePay(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject googlePayPaymentData) throws org.json.JSONException {
            return null;
        }
        
        /**
         * Create EPS Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param name The full name of the account holder.
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param statementDescriptor A custom statement descriptor for the payment (optional).
         * @return a [SourceParams] object that can be used to create an EPS source
         *
         * @see [EPS Payments with Sources](https://stripe.com/docs/sources/eps)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createEPSParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            return null;
        }
        
        /**
         * Create Giropay Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param name The full name of the account holder.
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param statementDescriptor A custom statement descriptor for the payment (optional).
         * @return a [SourceParams] object that can be used to create a Giropay source
         *
         * @see [Giropay Payments with Sources](https://stripe.com/docs/sources/giropay)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createGiropayParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            return null;
        }
        
        /**
         * Create iDEAL Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param name The full name of the account holder (optional).
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param statementDescriptor A custom statement descriptor for the payment (optional).
         * @param bank The customer’s bank (optional).
         * @return a [SourceParams] object that can be used to create an iDEAL source
         *
         * @see [iDEAL Payments with Sources](https://stripe.com/docs/sources/ideal)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createIdealParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
        java.lang.String bank) {
            return null;
        }
        
        /**
         * Create Multibanco Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param email The full email address of the customer.
         * @return a [SourceParams] object that can be used to create a Multibanco source
         *
         * @see [Multibanco Payments with Sources](https://stripe.com/docs/sources/multibanco)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createMultibancoParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String email) {
            return null;
        }
        
        /**
         * Create SEPA Debit Source params.
         *
         * @param name The full name of the account holder.
         * @param iban The IBAN number for the bank account that you wish to debit.
         * @param addressLine1 The first line of the owner's address (optional).
         * @param city The city of the owner's address.
         * @param postalCode The postal code of the owner's address.
         * @param country The ISO-3166 2-letter country code of the owner's address.
         * @return a [SourceParams] object that can be used to create a SEPA debit source
         *
         * @see [SEPA Direct Debit Payments with Sources](https://stripe.com/docs/sources/sepa-debit)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createSepaDebitParams(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String iban, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1, @org.jetbrains.annotations.NotNull()
        java.lang.String city, @org.jetbrains.annotations.NotNull()
        java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
        @androidx.annotation.Size(value = 2L)
        java.lang.String country) {
            return null;
        }
        
        /**
         * Create SEPA Debit Source params.
         *
         * @param name The full name of the account holder.
         * @param iban The IBAN number for the bank account that you wish to debit.
         * @param email The full email address of the owner (optional).
         * @param addressLine1 The first line of the owner's address (optional).
         * @param city The city of the owner's address.
         * @param postalCode The postal code of the owner's address.
         * @param country The ISO-3166 2-letter country code of the owner's address.
         * @return a [SourceParams] object that can be used to create a SEPA debit source
         *
         * @see [SEPA Direct Debit Payments with Sources](https://stripe.com/docs/sources/sepa-debit)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createSepaDebitParams(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String iban, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1, @org.jetbrains.annotations.Nullable()
        java.lang.String city, @org.jetbrains.annotations.Nullable()
        java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.Size(value = 2L)
        java.lang.String country) {
            return null;
        }
        
        /**
         * Create SOFORT Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param returnUrl The URL the customer should be redirected to after the authorization
         * process.
         * @param country The ISO-3166 2-letter country code of the customer’s bank.
         * @param statementDescriptor A custom statement descriptor for the payment (optional).
         * @return a [SourceParams] object that can be used to create a SOFORT source
         *
         * @see [SOFORT Payments with Sources](https://stripe.com/docs/sources/sofort)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createSofortParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
        @androidx.annotation.Size(value = 2L)
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String statementDescriptor) {
            return null;
        }
        
        /**
         * Create 3D Secure Source params.
         *
         * @param amount A positive integer in the smallest currency unit representing the amount to
         * charge the customer (e.g., 1099 for a €10.99 payment).
         * @param currency The currency the payment is being created in (e.g., eur).
         * @param returnUrl The URL the customer should be redirected to after the verification process.
         * @param cardId The ID of the card source.
         * @return a [SourceParams] object that can be used to create a 3D Secure source
         *
         * @see [3D Secure Card Payments with Sources](https://stripe.com/docs/sources/three-d-secure)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createThreeDSecureParams(@androidx.annotation.IntRange(from = 0L)
        long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String cardId) {
            return null;
        }
        
        /**
         * Create parameters needed to make a Visa Checkout source.
         *
         * @param callId The payment request ID (callId) from the Visa Checkout SDK.
         * @return a [SourceParams] object that can be used to create a Visa Checkout Card Source.
         *
         * @see [https://stripe.com/docs/visa-checkout](https://stripe.com/docs/visa-checkout)
         *
         * @see [https://developer.visa.com/capabilities/visa_checkout/docs](https://developer.visa.com/capabilities/visa_checkout/docs)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createVisaCheckoutParams(@org.jetbrains.annotations.NotNull()
        java.lang.String callId) {
            return null;
        }
        
        /**
         * Create parameters needed to make a Masterpass source
         *
         * @param transactionId The transaction ID from the Masterpass SDK.
         * @param cartId A unique string that you generate to identify the purchase when creating a cart
         * for checkout in the Masterpass SDK.
         *
         * @return a [SourceParams] object that can be used to create a Masterpass Card Source.
         *
         * @see [https://stripe.com/docs/masterpass](https://stripe.com/docs/masterpass)
         *
         * @see [https://developer.mastercard.com/product/masterpass](https://developer.mastercard.com/product/masterpass)
         *
         * @see [https://developer.mastercard.com/page/masterpass-merchant-mobile-checkout-sdk-for-android-v2](https://developer.mastercard.com/page/masterpass-merchant-mobile-checkout-sdk-for-android-v2)
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.SourceParams createMasterpassParams(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
        java.lang.String cartId) {
            return null;
        }
        
        /**
         * Create parameters needed to retrieve a source.
         *
         * @param clientSecret the client secret for the source, needed because the Android SDK uses
         * a public key
         * @return a [Map] matching the parameter name to the client secret, ready to send to
         * the server.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final java.util.Map<java.lang.String, java.lang.String> createRetrieveSourceParams(@org.jetbrains.annotations.NotNull()
        @androidx.annotation.Size(min = 1L)
        java.lang.String clientSecret) {
            return null;
        }
    }
}