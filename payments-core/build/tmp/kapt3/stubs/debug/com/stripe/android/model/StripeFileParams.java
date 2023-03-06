package com.stripe.android.model;

import java.lang.System;

/**
 * [Create a file](https://stripe.com/docs/api/files/create)
 *
 * To upload a file to Stripe, you’ll need to send a request of type `multipart/form-data`.
 * The request should contain the file you would like to upload, as well as the parameters for
 * creating a file.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/StripeFileParams;", "", "file", "Ljava/io/File;", "purpose", "Lcom/stripe/android/model/StripeFilePurpose;", "(Ljava/io/File;Lcom/stripe/android/model/StripeFilePurpose;)V", "getFile$payments_core_debug", "()Ljava/io/File;", "fileLink", "Lcom/stripe/android/model/StripeFileParams$FileLink;", "getPurpose$payments_core_debug", "()Lcom/stripe/android/model/StripeFilePurpose;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FileLink", "payments-core_debug"})
public final class StripeFileParams {
    
    /**
     * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
     * transfers for the `multipart/form-data` protocol).
     */
    @org.jetbrains.annotations.NotNull()
    private final java.io.File file = null;
    
    /**
     * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/create#create_file-purpose)
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.StripeFilePurpose purpose = null;
    
    /**
     * Optional parameters to automatically create a
     * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
     *
     * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
     */
    private final com.stripe.android.model.StripeFileParams.FileLink fileLink = null;
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create)
     *
     * To upload a file to Stripe, you’ll need to send a request of type `multipart/form-data`.
     * The request should contain the file you would like to upload, as well as the parameters for
     * creating a file.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeFileParams copy(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFilePurpose purpose) {
        return null;
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create)
     *
     * To upload a file to Stripe, you’ll need to send a request of type `multipart/form-data`.
     * The request should contain the file you would like to upload, as well as the parameters for
     * creating a file.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create)
     *
     * To upload a file to Stripe, you’ll need to send a request of type `multipart/form-data`.
     * The request should contain the file you would like to upload, as well as the parameters for
     * creating a file.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create)
     *
     * To upload a file to Stripe, you’ll need to send a request of type `multipart/form-data`.
     * The request should contain the file you would like to upload, as well as the parameters for
     * creating a file.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public StripeFileParams(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFilePurpose purpose) {
        super();
    }
    
    /**
     * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
     * transfers for the `multipart/form-data` protocol).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File component1$payments_core_debug() {
        return null;
    }
    
    /**
     * A file to upload. The file should follow the specifications of RFC 2388 (which defines file
     * transfers for the `multipart/form-data` protocol).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getFile$payments_core_debug() {
        return null;
    }
    
    /**
     * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/create#create_file-purpose)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeFilePurpose component2$payments_core_debug() {
        return null;
    }
    
    /**
     * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
     * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
     * or `tax_document_user_upload`.
     *
     * [purpose](https://stripe.com/docs/api/files/create#create_file-purpose)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeFilePurpose getPurpose$payments_core_debug() {
        return null;
    }
    
    /**
     * Optional parameters to automatically create a
     * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
     *
     * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000b\u001a\u00020\u0003H\u00c2\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c2\u0003J<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/StripeFileParams$FileLink;", "Landroid/os/Parcelable;", "create", "", "expiresAt", "", "metadata", "", "", "(ZLjava/lang/Long;Ljava/util/Map;)V", "Ljava/lang/Long;", "component1", "component2", "()Ljava/lang/Long;", "component3", "copy", "(ZLjava/lang/Long;Ljava/util/Map;)Lcom/stripe/android/model/StripeFileParams$FileLink;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class FileLink implements android.os.Parcelable {
        
        /**
         * Set this to `true` to create a file link for the newly created file. Creating a link is
         * only possible when the file’s `purpose` is one of the following: `business_icon`,
         * `business_logo`, `customer_signature`, `dispute_evidence`, `pci_document`, or
         * `tax_document_user_upload`.
         *
         * [file_link_data.create](https://stripe.com/docs/api/files/create#create_file-file_link_data-create)
         */
        private final boolean create = false;
        
        /**
         * A future timestamp after which the link will no longer be usable.
         *
         * [file_link_data.expires_at](https://stripe.com/docs/api/files/create#create_file-file_link_data-expires_at)
         */
        private final java.lang.Long expiresAt = null;
        
        /**
         * Set of key-value pairs that you can attach to an object. This can be useful for storing
         * additional information about the object in a structured format. Individual keys can be
         * unset by posting an empty value to them. All keys can be unset by posting an empty value
         * to metadata.
         *
         * [file_link_data.metadata](https://stripe.com/docs/api/files/create#create_file-file_link_data-metadata)
         */
        private final java.util.Map<java.lang.String, java.lang.String> metadata = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeFileParams.FileLink> CREATOR = null;
        
        /**
         * Optional parameters to automatically create a
         * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
         *
         * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeFileParams.FileLink copy(boolean create, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiresAt, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        /**
         * Optional parameters to automatically create a
         * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
         *
         * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Optional parameters to automatically create a
         * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
         *
         * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Optional parameters to automatically create a
         * [file link](https://stripe.com/docs/api/files/create#file_links) for the newly created file.
         *
         * [file_link_data]](https://stripe.com/docs/api/files/create#create_file-file_link_data)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public FileLink() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public FileLink(boolean create) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public FileLink(boolean create, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiresAt) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public FileLink(boolean create, @org.jetbrains.annotations.Nullable()
        java.lang.Long expiresAt, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            super();
        }
        
        /**
         * Set this to `true` to create a file link for the newly created file. Creating a link is
         * only possible when the file’s `purpose` is one of the following: `business_icon`,
         * `business_logo`, `customer_signature`, `dispute_evidence`, `pci_document`, or
         * `tax_document_user_upload`.
         *
         * [file_link_data.create](https://stripe.com/docs/api/files/create#create_file-file_link_data-create)
         */
        private final boolean component1() {
            return false;
        }
        
        /**
         * A future timestamp after which the link will no longer be usable.
         *
         * [file_link_data.expires_at](https://stripe.com/docs/api/files/create#create_file-file_link_data-expires_at)
         */
        private final java.lang.Long component2() {
            return null;
        }
        
        /**
         * Set of key-value pairs that you can attach to an object. This can be useful for storing
         * additional information about the object in a structured format. Individual keys can be
         * unset by posting an empty value to them. All keys can be unset by posting an empty value
         * to metadata.
         *
         * [file_link_data.metadata](https://stripe.com/docs/api/files/create#create_file-file_link_data-metadata)
         */
        private final java.util.Map<java.lang.String, java.lang.String> component3() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeFileParams.FileLink> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.StripeFileParams.FileLink createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.StripeFileParams.FileLink[] newArray(int size) {
                return null;
            }
        }
    }
}