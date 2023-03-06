package com.stripe.android;

import java.lang.System;

/**
 * Configuration for authentication mechanisms via [StripePaymentController]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \b2\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig;", "", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V", "getStripe3ds2Config$payments_core_debug", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Builder", "Companion", "Stripe3ds2ButtonCustomization", "Stripe3ds2Config", "Stripe3ds2LabelCustomization", "Stripe3ds2TextBoxCustomization", "Stripe3ds2ToolbarCustomization", "Stripe3ds2UiCustomization", "payments-core_debug"})
public final class PaymentAuthConfig {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PaymentAuthConfig.Companion Companion = null;
    private static com.stripe.android.PaymentAuthConfig instance;
    private static final com.stripe.android.PaymentAuthConfig DEFAULT = null;
    
    private PaymentAuthConfig(com.stripe.android.PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config getStripe3ds2Config$payments_core_debug() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentAuthConfig config) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.PaymentAuthConfig get() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig;", "()V", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "build", "set3ds2Config", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig> {
        private com.stripe.android.PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config;
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Builder set3ds2Config(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.PaymentAuthConfig build() {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0019\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Landroid/os/Parcelable;", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V", "getTimeout$payments_core_debug", "()I", "getUiCustomization$payments_core_debug", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "checkValidTimeout", "", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Stripe3ds2Config implements android.os.Parcelable {
        private final int timeout = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization uiCustomization = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config.Companion Companion = null;
        public static final int DEFAULT_TIMEOUT = 5;
        public static final android.os.Parcelable.Creator<com.stripe.android.PaymentAuthConfig.Stripe3ds2Config> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config copy(@androidx.annotation.IntRange(from = 5L, to = 99L)
        int timeout, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization uiCustomization) {
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
        
        public Stripe3ds2Config(@androidx.annotation.IntRange(from = 5L, to = 99L)
        int timeout, @org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization uiCustomization) {
            super();
        }
        
        public final int component1$payments_core_debug() {
            return 0;
        }
        
        public final int getTimeout$payments_core_debug() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization getUiCustomization$payments_core_debug() {
            return null;
        }
        
        private final void checkValidTimeout(int timeout) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentAuthConfig.Stripe3ds2Config> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "()V", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "build", "setTimeout", "setUiCustomization", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2Config> {
            private int timeout = 5;
            private com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization uiCustomization;
            
            public Builder() {
                super();
            }
            
            /**
             * The 3DS2 challenge flow timeout, in minutes.
             *
             * If the timeout is reached, the challenge screen will close, control will return to
             * the launching Activity/Fragment, payment authentication will not succeed, and the
             * outcome will be represented as [StripeIntentResult.Outcome.TIMEDOUT].
             *
             * Must be a value between 5 and 99, inclusive.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config.Builder setTimeout(@androidx.annotation.IntRange(from = 5L, to = 99L)
            int timeout) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2Config.Builder setUiCustomization(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization uiCustomization) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2Config build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;", "", "()V", "DEFAULT_TIMEOUT", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Customization for 3DS2 buttons
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "getButtonCustomization$payments_core_debug", "()Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "payments-core_debug"})
    public static final class Stripe3ds2ButtonCustomization {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.ButtonCustomization buttonCustomization = null;
        
        /**
         * Customization for 3DS2 buttons
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.ButtonCustomization buttonCustomization) {
            return null;
        }
        
        /**
         * Customization for 3DS2 buttons
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Customization for 3DS2 buttons
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Customization for 3DS2 buttons
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stripe3ds2ButtonCustomization(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.ButtonCustomization buttonCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.ButtonCustomization component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.ButtonCustomization getButtonCustomization$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "()V", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "build", "setBackgroundColor", "hexColor", "", "setCornerRadius", "cornerRadius", "", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization> {
            private final com.stripe.android.stripe3ds2.init.ui.ButtonCustomization buttonCustomization = null;
            
            public Builder() {
                super();
            }
            
            /**
             * Set the button's background color
             *
             * @param hexColor The button's background color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder setBackgroundColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the corner radius of the button
             *
             * @param cornerRadius The radius of the button in pixels
             * @throws RuntimeException If the corner radius is less than 0
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder setCornerRadius(int cornerRadius) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the button's text font
             *
             * @param fontName The name of the font. If not found, default system font used
             * @throws RuntimeException If font name is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder setTextFontName(@org.jetbrains.annotations.NotNull()
            java.lang.String fontName) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the button's text color
             *
             * @param hexColor The button's text color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder setTextColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the button's text size
             *
             * @param fontSize The size of the font in scaled-pixels (sp)
             * @throws RuntimeException If the font size is 0 or less
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder setTextFontSize(int fontSize) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Build the button customization
             *
             * @return The built button customization
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization build() {
                return null;
            }
        }
    }
    
    /**
     * Customization for 3DS2 labels
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "getLabelCustomization$payments_core_debug", "()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "payments-core_debug"})
    public static final class Stripe3ds2LabelCustomization {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.LabelCustomization labelCustomization = null;
        
        /**
         * Customization for 3DS2 labels
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.LabelCustomization labelCustomization) {
            return null;
        }
        
        /**
         * Customization for 3DS2 labels
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Customization for 3DS2 labels
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Customization for 3DS2 labels
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stripe3ds2LabelCustomization(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.LabelCustomization labelCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.LabelCustomization component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.LabelCustomization getLabelCustomization$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "()V", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "build", "setHeadingTextColor", "hexColor", "", "setHeadingTextFontName", "fontName", "setHeadingTextFontSize", "fontSize", "", "setTextColor", "setTextFontName", "setTextFontSize", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization> {
            private final com.stripe.android.stripe3ds2.init.ui.LabelCustomization labelCustomization = null;
            
            public Builder() {
                super();
            }
            
            /**
             * Set the text color for heading labels
             *
             * @param hexColor The heading labels's text color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setHeadingTextColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the heading label's font
             *
             * @param fontName The name of the font. Defaults to system font if not found
             * @throws RuntimeException If the font name is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setHeadingTextFontName(@org.jetbrains.annotations.NotNull()
            java.lang.String fontName) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the heading label's text size
             *
             * @param fontSize The size of the heading label in scaled-pixels (sp).
             * @throws RuntimeException If the font size is 0 or less
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setHeadingTextFontSize(int fontSize) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the label's font
             *
             * @param fontName The name of the font. Defaults to system font if not found
             * @throws RuntimeException If the font name is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setTextFontName(@org.jetbrains.annotations.NotNull()
            java.lang.String fontName) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the label's text color
             *
             * @param hexColor The labels's text color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setTextColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the label's text size
             *
             * @param fontSize The label's font size in scaled-pixels (sp)
             * @throws RuntimeException If the font size is 0 or less
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder setTextFontSize(int fontSize) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Build the configured label customization
             *
             * @return The built label customization
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization build() {
                return null;
            }
        }
    }
    
    /**
     * Customization for 3DS2 text entry
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "getTextBoxCustomization$payments_core_debug", "()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "payments-core_debug"})
    public static final class Stripe3ds2TextBoxCustomization {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization textBoxCustomization = null;
        
        /**
         * Customization for 3DS2 text entry
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization textBoxCustomization) {
            return null;
        }
        
        /**
         * Customization for 3DS2 text entry
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Customization for 3DS2 text entry
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Customization for 3DS2 text entry
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stripe3ds2TextBoxCustomization(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization textBoxCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization getTextBoxCustomization$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "()V", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "build", "setBorderColor", "hexColor", "", "setBorderWidth", "borderWidth", "", "setCornerRadius", "cornerRadius", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization> {
            private final com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization textBoxCustomization = null;
            
            public Builder() {
                super();
            }
            
            /**
             * Set the width of the border around the text entry box
             *
             * @param borderWidth Width of the border in pixels
             * @throws RuntimeException If the border width is less than 0
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setBorderWidth(int borderWidth) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the color of the border around the text entry box
             *
             * @param hexColor The border's color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setBorderColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the corner radius of the text entry box
             *
             * @param cornerRadius The corner radius in pixels
             * @throws RuntimeException If the corner radius is less than 0
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setCornerRadius(int cornerRadius) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the font for text entry
             *
             * @param fontName The name of the font. The system default is used if not found.
             * @throws RuntimeException If the font name is null or empty.
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setTextFontName(@org.jetbrains.annotations.NotNull()
            java.lang.String fontName) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the text color for text entry
             *
             * @param hexColor The text color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setTextColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the text entry font size
             *
             * @param fontSize The font size in scaled-pixels (sp)
             * @throws RuntimeException If the font size is 0 or less
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder setTextFontSize(int fontSize) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Build the text box customization
             *
             * @return The text box customization
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization build() {
                return null;
            }
        }
    }
    
    /**
     * Customization for the 3DS2 toolbar
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V", "getToolbarCustomization$payments_core_debug", "()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "payments-core_debug"})
    public static final class Stripe3ds2ToolbarCustomization {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization toolbarCustomization = null;
        
        /**
         * Customization for the 3DS2 toolbar
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization toolbarCustomization) {
            return null;
        }
        
        /**
         * Customization for the 3DS2 toolbar
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Customization for the 3DS2 toolbar
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Customization for the 3DS2 toolbar
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stripe3ds2ToolbarCustomization(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization toolbarCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization getToolbarCustomization$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "()V", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "build", "setBackgroundColor", "hexColor", "", "setButtonText", "buttonText", "setHeaderText", "headerText", "setStatusBarColor", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization> {
            private final com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization toolbarCustomization = null;
            
            public Builder() {
                super();
            }
            
            /**
             * Set the toolbar's background color
             *
             * @param hexColor The background color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setBackgroundColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the status bar color, if not provided a darkened version of the background
             * color will be used.
             *
             * @param hexColor The status bar color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setStatusBarColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the toolbar's title
             *
             * @param headerText The toolbar's title text
             * @throws RuntimeException if the title is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setHeaderText(@org.jetbrains.annotations.NotNull()
            java.lang.String headerText) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the toolbar's cancel button text
             *
             * @param buttonText The cancel button's text
             * @throws RuntimeException If the button text is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setButtonText(@org.jetbrains.annotations.NotNull()
            java.lang.String buttonText) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the font for the title text
             *
             * @param fontName The name of the font. System default is used if not found
             * @throws RuntimeException If the font name is null or empty
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setTextFontName(@org.jetbrains.annotations.NotNull()
            java.lang.String fontName) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the color of the title text
             *
             * @param hexColor The title's text color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setTextColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the title text's font size
             *
             * @param fontSize The size of the title text in scaled-pixels (sp)
             * @throws RuntimeException If the font size is 0 or less
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder setTextFontSize(int fontSize) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Build the toolbar customization
             *
             * @return The built toolbar customization
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization build() {
                return null;
            }
        }
    }
    
    /**
     * Customizations for the 3DS2 UI
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Landroid/os/Parcelable;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "getUiCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "ButtonType", "payments-core_debug"})
    public static final class Stripe3ds2UiCustomization implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization uiCustomization = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization> CREATOR = null;
        
        /**
         * Customizations for the 3DS2 UI
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization uiCustomization) {
            return null;
        }
        
        /**
         * Customizations for the 3DS2 UI
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Customizations for the 3DS2 UI
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Customizations for the 3DS2 UI
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stripe3ds2UiCustomization(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization uiCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization getUiCustomization() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * The type of button for which customization can be set
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "", "(Ljava/lang/String;I)V", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "SELECT", "payments-core_debug"})
        public static enum ButtonType {
            /*public static final*/ SUBMIT /* = new SUBMIT() */,
            /*public static final*/ CONTINUE /* = new CONTINUE() */,
            /*public static final*/ NEXT /* = new NEXT() */,
            /*public static final*/ CANCEL /* = new CANCEL() */,
            /*public static final*/ RESEND /* = new RESEND() */,
            /*public static final*/ SELECT /* = new SELECT() */;
            
            ButtonType() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "()V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "build", "getUiButtonType", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;", "buttonType", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "setAccentColor", "hexColor", "", "setButtonCustomization", "buttonCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "setLabelCustomization", "labelCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "setTextBoxCustomization", "textBoxCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "setToolbarCustomization", "toolbarCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "Companion", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization> {
            private final com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization uiCustomization = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder.Companion Companion = null;
            
            private Builder(com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization uiCustomization) {
                super();
            }
            
            public Builder() {
                super();
            }
            
            private Builder(android.app.Activity activity) {
                super();
            }
            
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            private final com.stripe.android.stripe3ds2.init.ui.UiCustomization.ButtonType getUiButtonType(com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType buttonType) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the customization for a particular button
             *
             * @param buttonCustomization The button customization data
             * @param buttonType The type of button to customize
             * @throws RuntimeException If any customization data is invalid
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder setButtonCustomization(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2ButtonCustomization buttonCustomization, @org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType buttonType) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the customization data for the 3DS2 toolbar
             *
             * @param toolbarCustomization Toolbar customization data
             * @throws RuntimeException If any customization data is invalid
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder setToolbarCustomization(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2ToolbarCustomization toolbarCustomization) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the 3DS2 label customization
             *
             * @param labelCustomization Label customization data
             * @throws RuntimeException If any customization data is invalid
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder setLabelCustomization(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2LabelCustomization labelCustomization) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the 3DS2 text box customization
             *
             * @param textBoxCustomization Text box customization data
             * @throws RuntimeException If any customization data is invalid
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder setTextBoxCustomization(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentAuthConfig.Stripe3ds2TextBoxCustomization textBoxCustomization) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Set the accent color
             *
             * @param hexColor The accent color in the format #RRGGBB or #AARRGGBB
             * @throws RuntimeException If the color cannot be parsed
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.Throws(exceptionClasses = {java.lang.RuntimeException.class})
            public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder setAccentColor(@org.jetbrains.annotations.NotNull()
            java.lang.String hexColor) throws java.lang.RuntimeException {
                return null;
            }
            
            /**
             * Build the UI customization
             *
             * @return the built UI customization
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization build() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public static final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder createWithAppTheme(@org.jetbrains.annotations.NotNull()
            android.app.Activity activity) {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;", "", "()V", "createWithAppTheme", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "activity", "Landroid/app/Activity;", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @kotlin.jvm.JvmStatic()
                public final com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder createWithAppTheme(@org.jetbrains.annotations.NotNull()
                android.app.Activity activity) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\r\u0010\n\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/PaymentAuthConfig;", "instance", "get", "init", "", "config", "reset", "reset$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void init(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentAuthConfig config) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.PaymentAuthConfig get() {
            return null;
        }
    }
}