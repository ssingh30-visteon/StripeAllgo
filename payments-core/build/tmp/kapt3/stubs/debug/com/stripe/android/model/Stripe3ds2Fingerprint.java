package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "Landroid/os/Parcelable;", "sdkData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "(Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;)V", "source", "", "directoryServerName", "serverTransactionId", "directoryServerEncryption", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)V", "getDirectoryServerEncryption", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "getDirectoryServerName", "()Ljava/lang/String;", "getServerTransactionId", "getSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DirectoryServerEncryption", "payments-core_debug"})
public final class Stripe3ds2Fingerprint implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String directoryServerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serverTransactionId = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption directoryServerEncryption = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2Fingerprint> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Stripe3ds2Fingerprint copy(@org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String directoryServerName, @org.jetbrains.annotations.NotNull()
    java.lang.String serverTransactionId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption directoryServerEncryption) {
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
    
    public Stripe3ds2Fingerprint(@org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String directoryServerName, @org.jetbrains.annotations.NotNull()
    java.lang.String serverTransactionId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption directoryServerEncryption) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDirectoryServerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServerTransactionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption getDirectoryServerEncryption() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.cert.CertificateException.class})
    public Stripe3ds2Fingerprint(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 sdkData) throws java.security.cert.CertificateException {
        super();
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2Fingerprint> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2Fingerprint createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2Fingerprint[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001bH\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "dsCertificateData", "rootCertsData", "", "keyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "directoryServerPublicKey", "Ljava/security/PublicKey;", "rootCerts", "Ljava/security/cert/X509Certificate;", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDirectoryServerPublicKey", "()Ljava/security/PublicKey;", "getKeyId", "getRootCerts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class DirectoryServerEncryption implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String directoryServerId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.security.PublicKey directoryServerPublicKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.security.cert.X509Certificate> rootCerts = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String keyId = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption copy(@org.jetbrains.annotations.NotNull()
        java.lang.String directoryServerId, @org.jetbrains.annotations.NotNull()
        java.security.PublicKey directoryServerPublicKey, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.security.cert.X509Certificate> rootCerts, @org.jetbrains.annotations.Nullable()
        java.lang.String keyId) {
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
        
        public DirectoryServerEncryption(@org.jetbrains.annotations.NotNull()
        java.lang.String directoryServerId, @org.jetbrains.annotations.NotNull()
        java.security.PublicKey directoryServerPublicKey, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.security.cert.X509Certificate> rootCerts, @org.jetbrains.annotations.Nullable()
        java.lang.String keyId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDirectoryServerId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.security.PublicKey component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.security.PublicKey getDirectoryServerPublicKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.security.cert.X509Certificate> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.security.cert.X509Certificate> getRootCerts() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKeyId() {
            return null;
        }
        
        public DirectoryServerEncryption(@org.jetbrains.annotations.NotNull()
        java.lang.String directoryServerId, @org.jetbrains.annotations.NotNull()
        java.lang.String dsCertificateData, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> rootCertsData, @org.jetbrains.annotations.Nullable()
        java.lang.String keyId) {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion;", "", "()V", "generateCertificate", "Ljava/security/cert/X509Certificate;", "certificateData", "", "generateCertificates", "", "certificatesData", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
            
            @kotlin.jvm.Throws(exceptionClasses = {java.security.cert.CertificateException.class})
            private final java.util.List<java.security.cert.X509Certificate> generateCertificates(java.util.List<java.lang.String> certificatesData) {
                return null;
            }
            
            @kotlin.jvm.Throws(exceptionClasses = {java.security.cert.CertificateException.class})
            private final java.security.cert.X509Certificate generateCertificate(java.lang.String certificateData) throws java.security.cert.CertificateException {
                return null;
            }
        }
    }
}