package com.stripe.android.networking;

import java.lang.System;

/**
 * A [StripeRequest] for uploading a file using [MimeType.MultipartForm].
 *
 * See [File upload guide](https://stripe.com/docs/file-upload)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0015\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0010\u00a2\u0006\u0002\b1J\u0018\u00102\u001a\u00020-2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\t8@X\u0081\u0004\u00a2\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\t8@X\u0081\u0004\u00a2\u0006\f\u0012\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000f\u00a8\u00067"}, d2 = {"Lcom/stripe/android/networking/FileUploadRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/AppInfo;", "boundary", "", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/lang/String;)V", "fileMetadata", "getFileMetadata$payments_core_debug$annotations", "()V", "getFileMetadata$payments_core_debug", "()Ljava/lang/String;", "headers", "", "getHeaders", "()Ljava/util/Map;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "postHeaders", "getPostHeaders$payments_core_debug", "setPostHeaders$payments_core_debug", "(Ljava/util/Map;)V", "purposeContents", "getPurposeContents$payments_core_debug$annotations", "getPurposeContents$payments_core_debug", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "writeFile", "", "outputStream", "Ljava/io/OutputStream;", "writePostBody", "writePostBody$payments_core_debug", "writeString", "writer", "Ljava/io/PrintWriter;", "contents", "Companion", "payments-core_debug"})
public final class FileUploadRequest extends com.stripe.android.core.networking.StripeRequest {
    private final com.stripe.android.model.StripeFileParams fileParams = null;
    
    /**
     * Boundary to delineate parts of the message
     *
     * See [Multipart messages](https://en.wikipedia.org/wiki/MIME#Multipart_messages)
     */
    private final java.lang.String boundary = null;
    private final com.stripe.android.networking.RequestHeadersFactory headersFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.Method method = com.stripe.android.core.networking.StripeRequest.Method.POST;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.MimeType mimeType = com.stripe.android.core.networking.StripeRequest.MimeType.MultipartForm;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = "https://files.stripe.com/v1/files";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<java.lang.Integer> retryResponseCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> postHeaders;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.FileUploadRequest.Companion Companion = null;
    private static final java.lang.String LINE_BREAK = "\r\n";
    private static final java.lang.String HOST = "https://files.stripe.com/v1/files";
    
    public FileUploadRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String boundary) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.core.networking.StripeRequest.Method getMethod$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.core.networking.StripeRequest.MimeType getMimeType$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<java.lang.Integer> getRetryResponseCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getPostHeaders$payments_core_debug() {
        return null;
    }
    
    @java.lang.Override()
    public void setPostHeaders$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void writePostBody$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.io.OutputStream outputStream) {
    }
    
    private final void writeString(java.io.PrintWriter writer, java.lang.String contents) {
    }
    
    private final void writeFile(java.io.OutputStream outputStream) {
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getFileMetadata$payments_core_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileMetadata$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getPurposeContents$payments_core_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurposeContents$payments_core_debug() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/FileUploadRequest$Companion;", "", "()V", "HOST", "", "LINE_BREAK", "createBoundary", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String createBoundary() {
            return null;
        }
    }
}