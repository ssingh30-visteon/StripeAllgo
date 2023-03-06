package com.stripe.android.model;

import java.lang.System;

/**
 * Information about the items and shipping associated with the source. Required for transactional
 * credit (for example Klarna) sources before you can charge it.
 *
 * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003 !\"B%\b\u0007\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u00d6\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "items", "", "Lcom/stripe/android/model/SourceOrderParams$Item;", "shipping", "Lcom/stripe/android/model/SourceOrderParams$Shipping;", "(Ljava/util/List;Lcom/stripe/android/model/SourceOrderParams$Shipping;)V", "getItems", "()Ljava/util/List;", "getShipping", "()Lcom/stripe/android/model/SourceOrderParams$Shipping;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Item", "Shipping", "payments-core_debug"})
public final class SourceOrderParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.stripe.android.model.SourceOrderParams.Item> items = null;
    
    /**
     * Shipping address for the order. Required if any of the SKUs are for products that have
     * `shippable` set to true.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SourceOrderParams.Shipping shipping = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.SourceOrderParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ITEMS = "items";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_SHIPPING = "shipping";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams> CREATOR = null;
    
    /**
     * Information about the items and shipping associated with the source. Required for transactional
     * credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SourceOrderParams copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.stripe.android.model.SourceOrderParams.Item> items, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrderParams.Shipping shipping) {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for transactional
     * credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for transactional
     * credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Information about the items and shipping associated with the source. Required for transactional
     * credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public SourceOrderParams() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SourceOrderParams(@org.jetbrains.annotations.Nullable()
    java.util.List<com.stripe.android.model.SourceOrderParams.Item> items) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SourceOrderParams(@org.jetbrains.annotations.Nullable()
    java.util.List<com.stripe.android.model.SourceOrderParams.Item> items, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrderParams.Shipping shipping) {
        super();
    }
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stripe.android.model.SourceOrderParams.Item> component1() {
        return null;
    }
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stripe.android.model.SourceOrderParams.Item> getItems() {
        return null;
    }
    
    /**
     * Shipping address for the order. Required if any of the SKUs are for products that have
     * `shippable` set to true.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrderParams.Shipping component2() {
        return null;
    }
    
    /**
     * Shipping address for the order. Required if any of the SKUs are for products that have
     * `shippable` set to true.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrderParams.Shipping getShipping() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceOrderParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceOrderParams[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * List of items constituting the order.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-items)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002-.BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010\'\u001a\u00020\bH\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "amount", "", "currency", "", "description", "parent", "quantity", "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getDescription", "getParent", "getQuantity", "getType", "()Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/model/SourceOrderParams$Item;", "describeContents", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
    public static final class Item implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * Optional. The type of this order item.
         * Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.SourceOrderParams.Item.Type type = null;
        
        /**
         * Optional. The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer amount = null;
        
        /**
         * Optional. This currency of this order item. Required when amount is present.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currency = null;
        
        /**
         * Optional. Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        
        /**
         * Optional. The ID of the SKU being ordered.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String parent = null;
        
        /**
         * Optional. The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer quantity = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.SourceOrderParams.Item.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_AMOUNT = "amount";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_CURRENCY = "currency";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_DESCRIPTION = "description";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PARENT = "parent";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_QUANTITY = "quantity";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_TYPE = "type";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams.Item> CREATOR = null;
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-items)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrderParams.Item copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SourceOrderParams.Item.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String parent, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
            return null;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-items)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-items)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-items)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Item() {
            super();
        }
        
        public Item(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SourceOrderParams.Item.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String parent, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
            super();
        }
        
        /**
         * Optional. The type of this order item.
         * Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SourceOrderParams.Item.Type component1() {
            return null;
        }
        
        /**
         * Optional. The type of this order item.
         * Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SourceOrderParams.Item.Type getType() {
            return null;
        }
        
        /**
         * Optional. The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        /**
         * Optional. The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAmount() {
            return null;
        }
        
        /**
         * Optional. This currency of this order item. Required when amount is present.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Optional. This currency of this order item. Required when amount is present.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        /**
         * Optional. Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Optional. Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        /**
         * Optional. The ID of the SKU being ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * Optional. The ID of the SKU being ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getParent() {
            return null;
        }
        
        /**
         * Optional. The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        /**
         * Optional. The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuantity() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams.Item> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrderParams.Item createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrderParams.Item[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_debug"})
        public static enum Type {
            /*public static final*/ Sku /* = new Sku(null) */,
            /*public static final*/ Tax /* = new Tax(null) */,
            /*public static final*/ Shipping /* = new Shipping(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            Type(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Companion;", "", "()V", "PARAM_AMOUNT", "", "PARAM_CURRENCY", "PARAM_DESCRIPTION", "PARAM_PARENT", "PARAM_QUANTITY", "PARAM_TYPE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Shipping address for the order.
     * Required if any of the SKUs are for products that have `shippable` set to true.
     *
     * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-shipping)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0 H\u0016J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "carrier", "", "name", "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Shipping implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * Required. Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.Address address = null;
        
        /**
         * Optional. The delivery service that shipped a physical product,
         * such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String carrier = null;
        
        /**
         * Optional. Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        
        /**
         * Optional. Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        
        /**
         * Optional. The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String trackingNumber = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.SourceOrderParams.Shipping.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ADDRESS = "address";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_CARRIER = "carrier";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_NAME = "name";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PHONE = "phone";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_TRACKING_NUMBER = "tracking_number";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams.Shipping> CREATOR = null;
        
        /**
         * Shipping address for the order.
         * Required if any of the SKUs are for products that have `shippable` set to true.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrderParams.Shipping copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            return null;
        }
        
        /**
         * Shipping address for the order.
         * Required if any of the SKUs are for products that have `shippable` set to true.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-shipping)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Shipping address for the order.
         * Required if any of the SKUs are for products that have `shippable` set to true.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-shipping)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Shipping address for the order.
         * Required if any of the SKUs are for products that have `shippable` set to true.
         *
         * [API reference](https://stripe.com/docs/api/sources/create#create_source-source_order-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Shipping(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            super();
        }
        
        /**
         * Required. Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address component1() {
            return null;
        }
        
        /**
         * Required. Shipping address.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address getAddress() {
            return null;
        }
        
        /**
         * Optional. The delivery service that shipped a physical product,
         * such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * Optional. The delivery service that shipped a physical product,
         * such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarrier() {
            return null;
        }
        
        /**
         * Optional. Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Optional. Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * Optional. Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Optional. Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        /**
         * Optional. The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * Optional. The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTrackingNumber() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrderParams.Shipping> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrderParams.Shipping createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrderParams.Shipping[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Companion;", "", "()V", "PARAM_ITEMS", "", "PARAM_SHIPPING", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}