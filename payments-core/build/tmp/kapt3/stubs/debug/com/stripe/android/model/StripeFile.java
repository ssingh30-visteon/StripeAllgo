package com.stripe.android.model;

import java.lang.System;

/**
 * [The file object](https://stripe.com/docs/api/files/object)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010&J\t\u0010\'\u001a\u00020\nH\u00d6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\nH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u00063"}, d2 = {"Lcom/stripe/android/model/StripeFile;", "Lcom/stripe/android/model/StripeModel;", "id", "", "created", "", "filename", "purpose", "Lcom/stripe/android/model/StripeFilePurpose;", "size", "", "title", "type", "url", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFilename", "()Ljava/lang/String;", "getId", "getPurpose", "()Lcom/stripe/android/model/StripeFilePurpose;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeFile;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class StripeFile implements com.stripe.android.model.StripeModel {
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/files/object#file_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     *
     * [created](https://stripe.com/docs/api/files/object#file_object-created)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long created = null;
    
    /**
     * A filename for the file, suitable for saving to a filesystem.
     *
     * [filename](https://stripe.com/docs/api/files/object#file_object-filename)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String filename = null;
    
    /**
     * The purpose of the file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/object#file_object-purpose)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.StripeFilePurpose purpose = null;
    
    /**
     * The size in bytes of the file object.
     *
     * [size](https://stripe.com/docs/api/files/object#file_object-size)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer size = null;
    
    /**
     * A user friendly title for the document.
     *
     * [title](https://stripe.com/docs/api/files/object#file_object-title)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    
    /**
     * The type of the file returned (e.g., csv, pdf, jpg, or png).
     *
     * [type](https://stripe.com/docs/api/files/object#file_object-type)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    
    /**
     * The URL from which the file can be downloaded using your live secret API key.
     *
     * [url](https://stripe.com/docs/api/files/object#file_object-url)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeFile> CREATOR = null;
    
    /**
     * [The file object](https://stripe.com/docs/api/files/object)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeFile copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String filename, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeFilePurpose purpose, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    /**
     * [The file object](https://stripe.com/docs/api/files/object)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [The file object](https://stripe.com/docs/api/files/object)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [The file object](https://stripe.com/docs/api/files/object)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public StripeFile() {
        super();
    }
    
    public StripeFile(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String filename, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.StripeFilePurpose purpose, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        super();
    }
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/files/object#file_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/files/object#file_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     *
     * [created](https://stripe.com/docs/api/files/object#file_object-created)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     *
     * [created](https://stripe.com/docs/api/files/object#file_object-created)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCreated() {
        return null;
    }
    
    /**
     * A filename for the file, suitable for saving to a filesystem.
     *
     * [filename](https://stripe.com/docs/api/files/object#file_object-filename)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * A filename for the file, suitable for saving to a filesystem.
     *
     * [filename](https://stripe.com/docs/api/files/object#file_object-filename)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilename() {
        return null;
    }
    
    /**
     * The purpose of the file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/object#file_object-purpose)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeFilePurpose component4() {
        return null;
    }
    
    /**
     * The purpose of the file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/object#file_object-purpose)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.StripeFilePurpose getPurpose() {
        return null;
    }
    
    /**
     * The size in bytes of the file object.
     *
     * [size](https://stripe.com/docs/api/files/object#file_object-size)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * The size in bytes of the file object.
     *
     * [size](https://stripe.com/docs/api/files/object#file_object-size)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    /**
     * A user friendly title for the document.
     *
     * [title](https://stripe.com/docs/api/files/object#file_object-title)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * A user friendly title for the document.
     *
     * [title](https://stripe.com/docs/api/files/object#file_object-title)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    /**
     * The type of the file returned (e.g., csv, pdf, jpg, or png).
     *
     * [type](https://stripe.com/docs/api/files/object#file_object-type)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * The type of the file returned (e.g., csv, pdf, jpg, or png).
     *
     * [type](https://stripe.com/docs/api/files/object#file_object-type)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    /**
     * The URL from which the file can be downloaded using your live secret API key.
     *
     * [url](https://stripe.com/docs/api/files/object#file_object-url)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * The URL from which the file can be downloaded using your live secret API key.
     *
     * [url](https://stripe.com/docs/api/files/object#file_object-url)
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeFile> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.StripeFile createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.StripeFile[] newArray(int size) {
            return null;
        }
    }
}