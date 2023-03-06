package com.stripe.android.model;

import java.lang.System;

/**
 * Model for a [Sources API](https://stripe.com/docs/sources) object.
 *
 * See [Sources API Reference](https://stripe.com/docs/api/sources/object).
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 t2\u00020\u00012\u00020\u0002:\nstuvwxyz{|B\u008c\u0002\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u001d\b\u0002\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010)J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u001e\u0010U\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\t\u0010W\u001a\u00020\u0004H\u00c6\u0003J\t\u0010X\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010!H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010#H\u00c2\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010%H\u00c2\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010]\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u000b\u0010e\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0099\u0002\u0010f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001d\b\u0002\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010gJ\t\u0010h\u001a\u00020iH\u00d6\u0001J\u0013\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010l\u001a\u00020iH\u00d6\u0001J\t\u0010m\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020iH\u00d6\u0001R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b1\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b\u000e\u00106R\u0011\u00108\u001a\u00020%8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR&\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a\u00a2\u0006\u0002\b\u001b\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010(\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u001e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0011\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\bO\u0010P\u00a8\u0006}"}, d2 = {"Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "amount", "", "clientSecret", "codeVerification", "Lcom/stripe/android/model/Source$CodeVerification;", "created", "currency", "flow", "Lcom/stripe/android/model/Source$Flow;", "isLiveMode", "", "owner", "Lcom/stripe/android/model/Source$Owner;", "receiver", "Lcom/stripe/android/model/Source$Receiver;", "redirect", "Lcom/stripe/android/model/Source$Redirect;", "status", "Lcom/stripe/android/model/Source$Status;", "sourceTypeData", "", "", "Lkotlinx/parcelize/RawValue;", "sourceTypeModel", "Lcom/stripe/android/model/SourceTypeModel;", "type", "typeRaw", "usage", "Lcom/stripe/android/model/Source$Usage;", "_weChat", "Lcom/stripe/android/model/WeChat;", "_klarna", "Lcom/stripe/android/model/Source$Klarna;", "sourceOrder", "Lcom/stripe/android/model/SourceOrder;", "statementDescriptor", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientSecret", "()Ljava/lang/String;", "getCodeVerification", "()Lcom/stripe/android/model/Source$CodeVerification;", "getCreated", "getCurrency", "getFlow", "()Lcom/stripe/android/model/Source$Flow;", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "klarna", "getKlarna", "()Lcom/stripe/android/model/Source$Klarna;", "getOwner", "()Lcom/stripe/android/model/Source$Owner;", "getReceiver", "()Lcom/stripe/android/model/Source$Receiver;", "getRedirect", "()Lcom/stripe/android/model/Source$Redirect;", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrder;", "getSourceTypeData", "()Ljava/util/Map;", "getSourceTypeModel", "()Lcom/stripe/android/model/SourceTypeModel;", "getStatementDescriptor", "getStatus", "()Lcom/stripe/android/model/Source$Status;", "getType", "getTypeRaw", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "weChat", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CodeVerification", "Companion", "Flow", "Klarna", "Owner", "Receiver", "Redirect", "SourceType", "Status", "Usage", "payments-core_debug"})
public final class Source implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripePaymentSource {
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount associated with
     * the source. This is the amount for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long amount = null;
    
    /**
     * The client secret of the source. Used for client-side retrieval using a publishable key.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String clientSecret = null;
    
    /**
     * Information related to the code verification flow. Present if the source is authenticated
     * by a verification code (`flow` is `code_verification`).
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.CodeVerification codeVerification = null;
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long created = null;
    
    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
     * the source. This is the currency for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currency = null;
    
    /**
     * The authentication `flow` of the source.
     * `flow` is one of `redirect`, `receiver`, `code_verification`, `none`.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Flow flow = null;
    
    /**
     * Has the value true if the object exists in live mode or the value false if the object
     * exists in test mode.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isLiveMode = null;
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Owner owner = null;
    
    /**
     * Information related to the receiver flow.
     * Present if the source is a receiver ([flow] is [Flow.Receiver]).
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Receiver receiver = null;
    
    /**
     * Information related to the redirect flow. Present if the source is authenticated by a
     * redirect ([flow] is [Flow.REDIRECT]).
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Redirect redirect = null;
    
    /**
     * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`,
     * or `pending`. Only `chargeable` sources can be used to create a charge.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.Object> sourceTypeData = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SourceTypeModel sourceTypeModel = null;
    
    /**
     * The [SourceType] of this Source, as one of the enumerated values.
     * If a custom source type has been created, this returns [SourceType.UNKNOWN]. To get
     * the raw value of an [SourceType.UNKNOWN] type, use [typeRaw].
     */
    @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    private final java.lang.String type = null;
    
    /**
     * Gets the type of this source as a String. If it is a known type, this will return
     * a string equal to the [SourceType] returned from [type]. This
     * method is not restricted to known types
     *
     * @return the type of this Source as a string
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String typeRaw = null;
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source
     * types may or may not be reusable by construction, while others may leave the option at
     * creation. If an incompatible value is passed, an error will be returned.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Source.Usage usage = null;
    private final com.stripe.android.model.WeChat _weChat = null;
    private final com.stripe.android.model.Source.Klarna _klarna = null;
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SourceOrder sourceOrder = null;
    
    /**
     * Extra information about a source. This will appear on your customer’s statement
     * every time you charge the source.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String statementDescriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.Source.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EURO = "eur";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USD = "usd";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Source> CREATOR = null;
    
    /**
     * Model for a [Sources API](https://stripe.com/docs/sources) object.
     *
     * See [Sources API Reference](https://stripe.com/docs/api/sources/object).
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Source copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.CodeVerification codeVerification, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Flow flow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Owner owner, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Receiver receiver, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Redirect redirect, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Status status, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> sourceTypeData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceTypeModel sourceTypeModel, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String typeRaw, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Usage usage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.WeChat _weChat, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Klarna _klarna, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrder sourceOrder, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        return null;
    }
    
    /**
     * Model for a [Sources API](https://stripe.com/docs/sources) object.
     *
     * See [Sources API Reference](https://stripe.com/docs/api/sources/object).
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model for a [Sources API](https://stripe.com/docs/sources) object.
     *
     * See [Sources API Reference](https://stripe.com/docs/api/sources/object).
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model for a [Sources API](https://stripe.com/docs/sources) object.
     *
     * See [Sources API Reference](https://stripe.com/docs/api/sources/object).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Source(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long amount, @org.jetbrains.annotations.Nullable()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.CodeVerification codeVerification, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Flow flow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLiveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Owner owner, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Receiver receiver, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Redirect redirect, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Status status, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> sourceTypeData, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceTypeModel sourceTypeModel, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String typeRaw, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Usage usage, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.WeChat _weChat, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Source.Klarna _klarna, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrder sourceOrder, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor) {
        super();
    }
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount associated with
     * the source. This is the amount for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount associated with
     * the source. This is the amount for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAmount() {
        return null;
    }
    
    /**
     * The client secret of the source. Used for client-side retrieval using a publishable key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * The client secret of the source. Used for client-side retrieval using a publishable key.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientSecret() {
        return null;
    }
    
    /**
     * Information related to the code verification flow. Present if the source is authenticated
     * by a verification code (`flow` is `code_verification`).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.CodeVerification component4() {
        return null;
    }
    
    /**
     * Information related to the code verification flow. Present if the source is authenticated
     * by a verification code (`flow` is `code_verification`).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.CodeVerification getCodeVerification() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCreated() {
        return null;
    }
    
    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
     * the source. This is the currency for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
     * the source. This is the currency for which the source will be chargeable once ready.
     * Required for `single_use` sources.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * The authentication `flow` of the source.
     * `flow` is one of `redirect`, `receiver`, `code_verification`, `none`.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Flow component7() {
        return null;
    }
    
    /**
     * The authentication `flow` of the source.
     * `flow` is one of `redirect`, `receiver`, `code_verification`, `none`.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Flow getFlow() {
        return null;
    }
    
    /**
     * Has the value true if the object exists in live mode or the value false if the object
     * exists in test mode.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    /**
     * Has the value true if the object exists in live mode or the value false if the object
     * exists in test mode.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isLiveMode() {
        return null;
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Owner component9() {
        return null;
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Owner getOwner() {
        return null;
    }
    
    /**
     * Information related to the receiver flow.
     * Present if the source is a receiver ([flow] is [Flow.Receiver]).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Receiver component10() {
        return null;
    }
    
    /**
     * Information related to the receiver flow.
     * Present if the source is a receiver ([flow] is [Flow.Receiver]).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Receiver getReceiver() {
        return null;
    }
    
    /**
     * Information related to the redirect flow. Present if the source is authenticated by a
     * redirect ([flow] is [Flow.REDIRECT]).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Redirect component11() {
        return null;
    }
    
    /**
     * Information related to the redirect flow. Present if the source is authenticated by a
     * redirect ([flow] is [Flow.REDIRECT]).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Redirect getRedirect() {
        return null;
    }
    
    /**
     * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`,
     * or `pending`. Only `chargeable` sources can be used to create a charge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Status component12() {
        return null;
    }
    
    /**
     * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`,
     * or `pending`. Only `chargeable` sources can be used to create a charge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getSourceTypeData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceTypeModel component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceTypeModel getSourceTypeModel() {
        return null;
    }
    
    /**
     * The [SourceType] of this Source, as one of the enumerated values.
     * If a custom source type has been created, this returns [SourceType.UNKNOWN]. To get
     * the raw value of an [SourceType.UNKNOWN] type, use [typeRaw].
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * The [SourceType] of this Source, as one of the enumerated values.
     * If a custom source type has been created, this returns [SourceType.UNKNOWN]. To get
     * the raw value of an [SourceType.UNKNOWN] type, use [typeRaw].
     */
    @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    public final java.lang.String getType() {
        return null;
    }
    
    /**
     * Gets the type of this source as a String. If it is a known type, this will return
     * a string equal to the [SourceType] returned from [type]. This
     * method is not restricted to known types
     *
     * @return the type of this Source as a string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    /**
     * Gets the type of this source as a String. If it is a known type, this will return
     * a string equal to the [SourceType] returned from [type]. This
     * method is not restricted to known types
     *
     * @return the type of this Source as a string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeRaw() {
        return null;
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source
     * types may or may not be reusable by construction, while others may leave the option at
     * creation. If an incompatible value is passed, an error will be returned.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Usage component17() {
        return null;
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source
     * types may or may not be reusable by construction, while others may leave the option at
     * creation. If an incompatible value is passed, an error will be returned.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Source.Usage getUsage() {
        return null;
    }
    
    private final com.stripe.android.model.WeChat component18() {
        return null;
    }
    
    private final com.stripe.android.model.Source.Klarna component19() {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrder component20() {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrder getSourceOrder() {
        return null;
    }
    
    /**
     * Extra information about a source. This will appear on your customer’s statement
     * every time you charge the source.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    /**
     * Extra information about a source. This will appear on your customer’s statement
     * every time you charge the source.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatementDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.WeChat getWeChat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Source.Klarna getKlarna() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.Source fromJson(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject jsonObject) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String asSourceType(@org.jetbrains.annotations.Nullable()
    java.lang.String sourceType) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Source createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Source[] newArray(int size) {
            return null;
        }
    }
    
    @androidx.annotation.StringDef(value = {"alipay", "card", "three_d_secure", "giropay", "sepa_debit", "ideal", "sofort", "bancontact", "p24", "eps", "multibanco", "wechat", "klarna", "unknown"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/model/Source$SourceType;", "", "Companion", "payments-core_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface SourceType {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Source.SourceType.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALIPAY = "alipay";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CARD = "card";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String THREE_D_SECURE = "three_d_secure";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GIROPAY = "giropay";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SEPA_DEBIT = "sepa_debit";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IDEAL = "ideal";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SOFORT = "sofort";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BANCONTACT = "bancontact";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String P24 = "p24";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EPS = "eps";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MULTIBANCO = "multibanco";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WECHAT = "wechat";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KLARNA = "klarna";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNKNOWN = "unknown";
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/Source$SourceType$Companion;", "", "()V", "ALIPAY", "", "BANCONTACT", "CARD", "EPS", "GIROPAY", "IDEAL", "KLARNA", "MULTIBANCO", "P24", "SEPA_DEBIT", "SOFORT", "THREE_D_SECURE", "UNKNOWN", "WECHAT", "payments-core_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String ALIPAY = "alipay";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String CARD = "card";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String THREE_D_SECURE = "three_d_secure";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String GIROPAY = "giropay";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SEPA_DEBIT = "sepa_debit";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String IDEAL = "ideal";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String SOFORT = "sofort";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String BANCONTACT = "bancontact";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String P24 = "p24";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String EPS = "eps";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String MULTIBANCO = "multibanco";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String WECHAT = "wechat";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String KLARNA = "klarna";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String UNKNOWN = "unknown";
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`,
     * or `pending`. Only `chargeable` sources can be used to create a charge.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/Source$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "Companion", "payments-core_debug"})
    public static enum Status {
        /*public static final*/ Canceled /* = new Canceled(null) */,
        /*public static final*/ Chargeable /* = new Chargeable(null) */,
        /*public static final*/ Consumed /* = new Consumed(null) */,
        /*public static final*/ Failed /* = new Failed(null) */,
        /*public static final*/ Pending /* = new Pending(null) */;
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Source.Status.Companion Companion = null;
        
        Status(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Source$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Status;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Source.Status fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not.
     * Some source types may or may not be reusable by construction, while others may leave the
     * option at creation. If an incompatible value is passed, an error will be returned.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/Source$Usage;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "toString", "Reusable", "SingleUse", "Companion", "payments-core_debug"})
    public static enum Usage {
        /*public static final*/ Reusable /* = new Reusable(null) */,
        /*public static final*/ SingleUse /* = new SingleUse(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Source.Usage.Companion Companion = null;
        
        Usage(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Source$Usage$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Usage;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Source.Usage fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * The authentication `flow` of the source.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/model/Source$Flow;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "toString", "Redirect", "Receiver", "CodeVerification", "None", "Companion", "payments-core_debug"})
    public static enum Flow {
        /*public static final*/ Redirect /* = new Redirect(null) */,
        /*public static final*/ Receiver /* = new Receiver(null) */,
        /*public static final*/ CodeVerification /* = new CodeVerification(null) */,
        /*public static final*/ None /* = new None(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Source.Flow.Companion Companion = null;
        
        Flow(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Source$Flow$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Flow;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Source.Flow fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * Information related to the redirect flow. Present if the source is authenticated by a
     * redirect ([flow] is [Flow.Redirect]).
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/model/StripeModel;", "returnUrl", "", "status", "Lcom/stripe/android/model/Source$Redirect$Status;", "url", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "getReturnUrl", "()Ljava/lang/String;", "getStatus", "()Lcom/stripe/android/model/Source$Redirect$Status;", "getUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "payments-core_debug"})
    public static final class Redirect implements com.stripe.android.model.StripeModel {
        
        /**
         * The URL you provide to redirect the customer to after they authenticated their payment.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String returnUrl = null;
        
        /**
         * The status of the redirect, either
         * `pending` (ready to be used by your customer to authenticate the transaction),
         * `succeeded` (succesful authentication, cannot be reused) or
         * `not_required` (redirect should not be used) or
         * `failed` (failed authentication, cannot be reused).
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Source.Redirect.Status status = null;
        
        /**
         * The URL provided to you to redirect a customer to as part of a `redirect`
         * authentication flow.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Source.Redirect> CREATOR = null;
        
        /**
         * Information related to the redirect flow. Present if the source is authenticated by a
         * redirect ([flow] is [Flow.Redirect]).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Source.Redirect copy(@org.jetbrains.annotations.Nullable()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source.Redirect.Status status, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return null;
        }
        
        /**
         * Information related to the redirect flow. Present if the source is authenticated by a
         * redirect ([flow] is [Flow.Redirect]).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Information related to the redirect flow. Present if the source is authenticated by a
         * redirect ([flow] is [Flow.Redirect]).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Information related to the redirect flow. Present if the source is authenticated by a
         * redirect ([flow] is [Flow.Redirect]).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Redirect(@org.jetbrains.annotations.Nullable()
        java.lang.String returnUrl, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source.Redirect.Status status, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            super();
        }
        
        /**
         * The URL you provide to redirect the customer to after they authenticated their payment.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The URL you provide to redirect the customer to after they authenticated their payment.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReturnUrl() {
            return null;
        }
        
        /**
         * The status of the redirect, either
         * `pending` (ready to be used by your customer to authenticate the transaction),
         * `succeeded` (succesful authentication, cannot be reused) or
         * `not_required` (redirect should not be used) or
         * `failed` (failed authentication, cannot be reused).
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source.Redirect.Status component2() {
            return null;
        }
        
        /**
         * The status of the redirect, either
         * `pending` (ready to be used by your customer to authenticate the transaction),
         * `succeeded` (succesful authentication, cannot be reused) or
         * `not_required` (redirect should not be used) or
         * `failed` (failed authentication, cannot be reused).
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source.Redirect.Status getStatus() {
            return null;
        }
        
        /**
         * The URL provided to you to redirect a customer to as part of a `redirect`
         * authentication flow.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * The URL provided to you to redirect a customer to as part of a `redirect`
         * authentication flow.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source.Redirect> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Redirect createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Redirect[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "NotRequired", "Failed", "Companion", "payments-core_debug"})
        public static enum Status {
            /*public static final*/ Pending /* = new Pending(null) */,
            /*public static final*/ Succeeded /* = new Succeeded(null) */,
            /*public static final*/ NotRequired /* = new NotRequired(null) */,
            /*public static final*/ Failed /* = new Failed(null) */;
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.Source.Redirect.Status.Companion Companion = null;
            
            Status(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$Redirect$Status;", "code", "", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.Source.Redirect.Status fromCode(@org.jetbrains.annotations.Nullable()
                java.lang.String code) {
                    return null;
                }
            }
        }
    }
    
    /**
     * Information related to the code verification flow. Present if the source is authenticated
     * by a verification code ([flow] is [Flow.CodeVerification]).
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lcom/stripe/android/model/StripeModel;", "attemptsRemaining", "", "status", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "getAttemptsRemaining", "()I", "getStatus", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "payments-core_debug"})
    public static final class CodeVerification implements com.stripe.android.model.StripeModel {
        
        /**
         * The number of attempts remaining to authenticate the source object with a verification
         * code.
         */
        private final int attemptsRemaining = 0;
        
        /**
         * The status of the code verification, either
         * `pending` (awaiting verification, `attempts_remaining` should be greater than 0),
         * `succeeded` (successful verification) or
         * `failed` (failed verification, cannot be verified anymore as `attempts_remaining` should be 0).
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Source.CodeVerification.Status status = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Source.CodeVerification> CREATOR = null;
        
        /**
         * Information related to the code verification flow. Present if the source is authenticated
         * by a verification code ([flow] is [Flow.CodeVerification]).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Source.CodeVerification copy(int attemptsRemaining, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source.CodeVerification.Status status) {
            return null;
        }
        
        /**
         * Information related to the code verification flow. Present if the source is authenticated
         * by a verification code ([flow] is [Flow.CodeVerification]).
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Information related to the code verification flow. Present if the source is authenticated
         * by a verification code ([flow] is [Flow.CodeVerification]).
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Information related to the code verification flow. Present if the source is authenticated
         * by a verification code ([flow] is [Flow.CodeVerification]).
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CodeVerification(int attemptsRemaining, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source.CodeVerification.Status status) {
            super();
        }
        
        /**
         * The number of attempts remaining to authenticate the source object with a verification
         * code.
         */
        public final int component1() {
            return 0;
        }
        
        /**
         * The number of attempts remaining to authenticate the source object with a verification
         * code.
         */
        public final int getAttemptsRemaining() {
            return 0;
        }
        
        /**
         * The status of the code verification, either
         * `pending` (awaiting verification, `attempts_remaining` should be greater than 0),
         * `succeeded` (successful verification) or
         * `failed` (failed verification, cannot be verified anymore as `attempts_remaining` should be 0).
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source.CodeVerification.Status component2() {
            return null;
        }
        
        /**
         * The status of the code verification, either
         * `pending` (awaiting verification, `attempts_remaining` should be greater than 0),
         * `succeeded` (successful verification) or
         * `failed` (failed verification, cannot be verified anymore as `attempts_remaining` should be 0).
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source.CodeVerification.Status getStatus() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source.CodeVerification> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.CodeVerification createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.CodeVerification[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "Failed", "Companion", "payments-core_debug"})
        public static enum Status {
            /*public static final*/ Pending /* = new Pending(null) */,
            /*public static final*/ Succeeded /* = new Succeeded(null) */,
            /*public static final*/ Failed /* = new Failed(null) */;
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.Source.CodeVerification.Status.Companion Companion = null;
            
            Status(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "code", "", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.Source.CodeVerification.Status fromCode(@org.jetbrains.annotations.Nullable()
                java.lang.String code) {
                    return null;
                }
            }
        }
    }
    
    /**
     * Information related to the receiver flow. Present if [flow] is [Source.Flow.Receiver].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/model/StripeModel;", "address", "", "amountCharged", "", "amountReceived", "amountReturned", "(Ljava/lang/String;JJJ)V", "getAddress", "()Ljava/lang/String;", "getAmountCharged", "()J", "getAmountReceived", "getAmountReturned", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Receiver implements com.stripe.android.model.StripeModel {
        
        /**
         * The address of the receiver source. This is the value that should be communicated to the
         * customer to send their funds to.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String address = null;
        
        /**
         * The total amount that was moved to your balance. This is almost always equal to the amount
         * charged. In rare cases when customers deposit excess funds and we are unable to refund
         * those, those funds get moved to your balance and show up in amount_charged as well.
         * The amount charged is expressed in the source’s currency.
         */
        private final long amountCharged = 0L;
        
        /**
         * The total amount received by the receiver source.
         * `amount_received = amount_returned + amount_charged` should be true for consumed sources
         * unless customers deposit excess funds. The amount received is expressed in the source’s
         * currency.
         */
        private final long amountReceived = 0L;
        
        /**
         * The total amount that was returned to the customer. The amount returned is expressed in
         * the source’s currency.
         */
        private final long amountReturned = 0L;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Source.Receiver> CREATOR = null;
        
        /**
         * Information related to the receiver flow. Present if [flow] is [Source.Flow.Receiver].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Source.Receiver copy(@org.jetbrains.annotations.Nullable()
        java.lang.String address, long amountCharged, long amountReceived, long amountReturned) {
            return null;
        }
        
        /**
         * Information related to the receiver flow. Present if [flow] is [Source.Flow.Receiver].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Information related to the receiver flow. Present if [flow] is [Source.Flow.Receiver].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Information related to the receiver flow. Present if [flow] is [Source.Flow.Receiver].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Receiver(@org.jetbrains.annotations.Nullable()
        java.lang.String address, long amountCharged, long amountReceived, long amountReturned) {
            super();
        }
        
        /**
         * The address of the receiver source. This is the value that should be communicated to the
         * customer to send their funds to.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The address of the receiver source. This is the value that should be communicated to the
         * customer to send their funds to.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddress() {
            return null;
        }
        
        /**
         * The total amount that was moved to your balance. This is almost always equal to the amount
         * charged. In rare cases when customers deposit excess funds and we are unable to refund
         * those, those funds get moved to your balance and show up in amount_charged as well.
         * The amount charged is expressed in the source’s currency.
         */
        public final long component2() {
            return 0L;
        }
        
        /**
         * The total amount that was moved to your balance. This is almost always equal to the amount
         * charged. In rare cases when customers deposit excess funds and we are unable to refund
         * those, those funds get moved to your balance and show up in amount_charged as well.
         * The amount charged is expressed in the source’s currency.
         */
        public final long getAmountCharged() {
            return 0L;
        }
        
        /**
         * The total amount received by the receiver source.
         * `amount_received = amount_returned + amount_charged` should be true for consumed sources
         * unless customers deposit excess funds. The amount received is expressed in the source’s
         * currency.
         */
        public final long component3() {
            return 0L;
        }
        
        /**
         * The total amount received by the receiver source.
         * `amount_received = amount_returned + amount_charged` should be true for consumed sources
         * unless customers deposit excess funds. The amount received is expressed in the source’s
         * currency.
         */
        public final long getAmountReceived() {
            return 0L;
        }
        
        /**
         * The total amount that was returned to the customer. The amount returned is expressed in
         * the source’s currency.
         */
        public final long component4() {
            return 0L;
        }
        
        /**
         * The total amount that was returned to the customer. The amount returned is expressed in
         * the source’s currency.
         */
        public final long getAmountReturned() {
            return 0L;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source.Receiver> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Receiver createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Receiver[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020!H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/model/StripeModel;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "getVerifiedAddress", "getVerifiedEmail", "getVerifiedName", "getVerifiedPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Owner implements com.stripe.android.model.StripeModel {
        
        /**
         * Owner’s address.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Address address = null;
        
        /**
         * Owner’s email address.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String email = null;
        
        /**
         * Owner’s full name.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        
        /**
         * Owner’s phone number (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        
        /**
         * Verified owner’s address. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Address verifiedAddress = null;
        
        /**
         * Verified owner’s email address. Verified values are verified or provided by the
         * payment method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String verifiedEmail = null;
        
        /**
         * Verified owner’s full name. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String verifiedName = null;
        
        /**
         * Verified owner’s phone number (including extension). Verified values are verified or
         * provided by the payment method directly (and if supported) at the time of authorization
         * or settlement. They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String verifiedPhone = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Source.Owner> CREATOR = null;
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Source.Owner copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address verifiedAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedEmail, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedName, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedPhone) {
            return null;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Information about the owner of the payment instrument that may be used or required by
         * particular source types.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Owner(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address verifiedAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedEmail, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedName, @org.jetbrains.annotations.Nullable()
        java.lang.String verifiedPhone) {
            super();
        }
        
        /**
         * Owner’s address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address component1() {
            return null;
        }
        
        /**
         * Owner’s address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address getAddress() {
            return null;
        }
        
        /**
         * Owner’s email address.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * Owner’s email address.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        /**
         * Owner’s full name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Owner’s full name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * Owner’s phone number (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Owner’s phone number (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        /**
         * Verified owner’s address. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address component5() {
            return null;
        }
        
        /**
         * Verified owner’s address. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address getVerifiedAddress() {
            return null;
        }
        
        /**
         * Verified owner’s email address. Verified values are verified or provided by the
         * payment method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        /**
         * Verified owner’s email address. Verified values are verified or provided by the
         * payment method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVerifiedEmail() {
            return null;
        }
        
        /**
         * Verified owner’s full name. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        /**
         * Verified owner’s full name. Verified values are verified or provided by the payment
         * method directly (and if supported) at the time of authorization or settlement.
         * They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVerifiedName() {
            return null;
        }
        
        /**
         * Verified owner’s phone number (including extension). Verified values are verified or
         * provided by the payment method directly (and if supported) at the time of authorization
         * or settlement. They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        /**
         * Verified owner’s phone number (including extension). Verified values are verified or
         * provided by the payment method directly (and if supported) at the time of authorization
         * or settlement. They cannot be set or mutated.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVerifiedPhone() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source.Owner> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Owner createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Owner[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e9\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0001J\t\u0010>\u001a\u00020?H\u00d6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u00d6\u0003J\t\u0010D\u001a\u00020?H\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020?H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018\u00a8\u0006K"}, d2 = {"Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/model/StripeModel;", "firstName", "", "lastName", "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "paymentMethodCategories", "", "customPaymentMethods", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "getClientToken", "()Ljava/lang/String;", "getCustomPaymentMethods", "()Ljava/util/Set;", "getFirstName", "getLastName", "getPayLaterAssetUrlsDescriptive", "getPayLaterAssetUrlsStandard", "getPayLaterName", "getPayLaterRedirectUrl", "getPayNowAssetUrlsDescriptive", "getPayNowAssetUrlsStandard", "getPayNowName", "getPayNowRedirectUrl", "getPayOverTimeAssetUrlsDescriptive", "getPayOverTimeAssetUrlsStandard", "getPayOverTimeName", "getPayOverTimeRedirectUrl", "getPaymentMethodCategories", "getPurchaseCountry", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Klarna implements com.stripe.android.model.StripeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String firstName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String lastName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String purchaseCountry = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String clientToken = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payNowAssetUrlsDescriptive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payNowAssetUrlsStandard = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payNowName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payNowRedirectUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payLaterAssetUrlsDescriptive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payLaterAssetUrlsStandard = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payLaterName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payLaterRedirectUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payOverTimeAssetUrlsDescriptive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payOverTimeAssetUrlsStandard = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payOverTimeName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payOverTimeRedirectUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> paymentMethodCategories = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> customPaymentMethods = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Source.Klarna> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Source.Klarna copy(@org.jetbrains.annotations.Nullable()
        java.lang.String firstName, @org.jetbrains.annotations.Nullable()
        java.lang.String lastName, @org.jetbrains.annotations.Nullable()
        java.lang.String purchaseCountry, @org.jetbrains.annotations.Nullable()
        java.lang.String clientToken, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowName, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowRedirectUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterName, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterRedirectUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeName, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeRedirectUrl, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> paymentMethodCategories, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> customPaymentMethods) {
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
        
        public Klarna(@org.jetbrains.annotations.Nullable()
        java.lang.String firstName, @org.jetbrains.annotations.Nullable()
        java.lang.String lastName, @org.jetbrains.annotations.Nullable()
        java.lang.String purchaseCountry, @org.jetbrains.annotations.Nullable()
        java.lang.String clientToken, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowName, @org.jetbrains.annotations.Nullable()
        java.lang.String payNowRedirectUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterName, @org.jetbrains.annotations.Nullable()
        java.lang.String payLaterRedirectUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeAssetUrlsDescriptive, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeAssetUrlsStandard, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeName, @org.jetbrains.annotations.Nullable()
        java.lang.String payOverTimeRedirectUrl, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> paymentMethodCategories, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> customPaymentMethods) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFirstName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPurchaseCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getClientToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayNowAssetUrlsDescriptive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayNowAssetUrlsStandard() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayNowName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayNowRedirectUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayLaterAssetUrlsDescriptive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayLaterAssetUrlsStandard() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayLaterName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayLaterRedirectUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayOverTimeAssetUrlsDescriptive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayOverTimeAssetUrlsStandard() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayOverTimeName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayOverTimeRedirectUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component17() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getPaymentMethodCategories() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component18() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getCustomPaymentMethods() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Source.Klarna> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Klarna createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Source.Klarna[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/Source$Companion;", "", "()V", "EURO", "", "USD", "asSourceType", "sourceType", "fromJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.Source fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject jsonObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @com.stripe.android.model.Source.SourceType()
        @kotlin.jvm.JvmStatic()
        public final java.lang.String asSourceType(@org.jetbrains.annotations.Nullable()
        java.lang.String sourceType) {
            return null;
        }
    }
}