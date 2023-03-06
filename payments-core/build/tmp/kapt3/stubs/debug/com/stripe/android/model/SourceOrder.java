package com.stripe.android.model;

import java.lang.System;

/**
 * Information about the items and shipping associated with the source.
 * Required for transactional credit (for example Klarna) sources before you can charge it.
 *
 * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BG\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JN\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/stripe/android/model/SourceOrder;", "Lcom/stripe/android/model/StripeModel;", "amount", "", "currency", "", "email", "items", "", "Lcom/stripe/android/model/SourceOrder$Item;", "shipping", "Lcom/stripe/android/model/SourceOrder$Shipping;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/SourceOrder$Shipping;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getEmail", "getItems", "()Ljava/util/List;", "getShipping", "()Lcom/stripe/android/model/SourceOrder$Shipping;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/SourceOrder$Shipping;)Lcom/stripe/android/model/SourceOrder;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Item", "Shipping", "payments-core_debug"})
public final class SourceOrder implements com.stripe.android.model.StripeModel {
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount for the order.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer amount = null;
    
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html),
     * in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currency = null;
    
    /**
     * The email address of the customer placing the order.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.SourceOrder.Item> items = null;
    
    /**
     * The shipping address for the order. Present if the order is for goods to be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.SourceOrder.Shipping shipping = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder> CREATOR = null;
    
    /**
     * Information about the items and shipping associated with the source.
     * Required for transactional credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SourceOrder copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.SourceOrder.Item> items, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrder.Shipping shipping) {
        return null;
    }
    
    /**
     * Information about the items and shipping associated with the source.
     * Required for transactional credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Information about the items and shipping associated with the source.
     * Required for transactional credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Information about the items and shipping associated with the source.
     * Required for transactional credit (for example Klarna) sources before you can charge it.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SourceOrder() {
        super();
    }
    
    public SourceOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.SourceOrder.Item> items, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.SourceOrder.Shipping shipping) {
        super();
    }
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount for the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount for the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAmount() {
        return null;
    }
    
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html),
     * in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html),
     * in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * The email address of the customer placing the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * The email address of the customer placing the order.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.SourceOrder.Item> component4() {
        return null;
    }
    
    /**
     * List of items constituting the order.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.SourceOrder.Item> getItems() {
        return null;
    }
    
    /**
     * The shipping address for the order. Present if the order is for goods to be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrder.Shipping component5() {
        return null;
    }
    
    /**
     * The shipping address for the order. Present if the order is for goods to be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.SourceOrder.Shipping getShipping() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceOrder createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.SourceOrder[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * List of items constituting the order.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-items)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\'B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item;", "Lcom/stripe/android/model/StripeModel;", "type", "Lcom/stripe/android/model/SourceOrder$Item$Type;", "amount", "", "currency", "", "description", "quantity", "(Lcom/stripe/android/model/SourceOrder$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getDescription", "getQuantity", "getType", "()Lcom/stripe/android/model/SourceOrder$Item$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/stripe/android/model/SourceOrder$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/model/SourceOrder$Item;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Type", "payments-core_debug"})
    public static final class Item implements com.stripe.android.model.StripeModel {
        
        /**
         * The type of this order item. Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.SourceOrder.Item.Type type = null;
        
        /**
         * The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer amount = null;
        
        /**
         * This currency of this order item. Required when [amount] is present.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currency = null;
        
        /**
         * Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        
        /**
         * The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer quantity = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder.Item> CREATOR = null;
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-items)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrder.Item copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.SourceOrder.Item.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
            return null;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-items)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-items)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * List of items constituting the order.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-items)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.SourceOrder.Item.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer amount, @org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
            super();
        }
        
        /**
         * The type of this order item. Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrder.Item.Type component1() {
            return null;
        }
        
        /**
         * The type of this order item. Must be [Type.Sku], [Type.Tax], or [Type.Shipping].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrder.Item.Type getType() {
            return null;
        }
        
        /**
         * The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        /**
         * The amount (price) for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAmount() {
            return null;
        }
        
        /**
         * This currency of this order item. Required when [amount] is present.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * This currency of this order item. Required when [amount] is present.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        /**
         * Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Human-readable description for this order item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        /**
         * The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        /**
         * The quantity of this order item. When type is [Type.Sku], this is the number of
         * instances of the SKU to be ordered.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuantity() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder.Item> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrder.Item createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrder.Item[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Sku", "Tax", "Shipping", "Companion", "payments-core_debug"})
        public static enum Type {
            /*public static final*/ Sku /* = new Sku(null) */,
            /*public static final*/ Tax /* = new Tax(null) */,
            /*public static final*/ Shipping /* = new Shipping(null) */;
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.SourceOrder.Item.Type.Companion Companion = null;
            
            Type(java.lang.String code) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SourceOrder$Item$Type;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
    }
    
    /**
     * The shipping address for the order. Present if the order is for goods to be shipped.
     *
     * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-shipping)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Shipping;", "Lcom/stripe/android/model/StripeModel;", "address", "Lcom/stripe/android/model/Address;", "carrier", "", "name", "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Shipping implements com.stripe.android.model.StripeModel {
        
        /**
         * Shipping address.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Address address = null;
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String carrier = null;
        
        /**
         * Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        
        /**
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String trackingNumber = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder.Shipping> CREATOR = null;
        
        /**
         * The shipping address for the order. Present if the order is for goods to be shipped.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceOrder.Shipping copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            return null;
        }
        
        /**
         * The shipping address for the order. Present if the order is for goods to be shipped.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-shipping)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The shipping address for the order. Present if the order is for goods to be shipped.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-shipping)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The shipping address for the order. Present if the order is for goods to be shipped.
         *
         * [API reference](https://stripe.com/docs/api/sources/object#source_object-source_order-shipping)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Shipping() {
            super();
        }
        
        public Shipping(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String carrier, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String trackingNumber) {
            super();
        }
        
        /**
         * Shipping address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address component1() {
            return null;
        }
        
        /**
         * Shipping address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Address getAddress() {
            return null;
        }
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarrier() {
            return null;
        }
        
        /**
         * Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Recipient name.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Recipient phone (including extension).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * The tracking number for a physical product, obtained from the delivery service.
         * If multiple tracking numbers were generated for this purchase, please separate
         * them with commas.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTrackingNumber() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceOrder.Shipping> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrder.Shipping createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceOrder.Shipping[] newArray(int size) {
                return null;
            }
        }
    }
}