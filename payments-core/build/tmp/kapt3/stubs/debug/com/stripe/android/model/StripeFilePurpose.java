package com.stripe.android.model;

import java.lang.System;

/**
 * The purpose of the uploaded file. Possible values are `business_icon`, `business_logo`,
 * `customer_signature`, `dispute_evidence`, `identity_document`, `pci_document`,
 * or `tax_document_user_upload`.
 *
 * [purpose](https://stripe.com/docs/api/files/create#create_file-purpose)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/StripeFilePurpose;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "BusinessIcon", "BusinessLogo", "CustomerSignature", "DisputeEvidence", "IdentityDocument", "PciDocument", "TaxDocumentUserUpload", "Companion", "payments-core_debug"})
public enum StripeFilePurpose {
    /*public static final*/ BusinessIcon /* = new BusinessIcon(null) */,
    /*public static final*/ BusinessLogo /* = new BusinessLogo(null) */,
    /*public static final*/ CustomerSignature /* = new CustomerSignature(null) */,
    /*public static final*/ DisputeEvidence /* = new DisputeEvidence(null) */,
    /*public static final*/ IdentityDocument /* = new IdentityDocument(null) */,
    /*public static final*/ PciDocument /* = new PciDocument(null) */,
    /*public static final*/ TaxDocumentUserUpload /* = new TaxDocumentUserUpload(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.StripeFilePurpose.Companion Companion = null;
    
    StripeFilePurpose(java.lang.String code) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode$payments_core_debug() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/StripeFilePurpose$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeFilePurpose;", "code", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.StripeFilePurpose fromCode(@org.jetbrains.annotations.Nullable()
        java.lang.String code) {
            return null;
        }
    }
}