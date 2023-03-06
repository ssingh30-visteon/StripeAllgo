package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b?\b\u0080\u0001\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001AB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@\u00a8\u0006B"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "toString", "TokenCreate", "PaymentMethodCreate", "CustomerRetrieve", "CustomerRetrievePaymentMethods", "CustomerAttachPaymentMethod", "CustomerDetachPaymentMethod", "CustomerDeleteSource", "CustomerSetShippingInfo", "CustomerAddSource", "CustomerSetDefaultSource", "IssuingRetrievePin", "IssuingUpdatePin", "SourceCreate", "SourceRetrieve", "PaymentIntentConfirm", "PaymentIntentRetrieve", "PaymentIntentCancelSource", "PaymentIntentRefresh", "SetupIntentConfirm", "SetupIntentRetrieve", "SetupIntentCancelSource", "FileCreate", "Auth3ds1Sdk", "Auth3ds1ChallengeStart", "Auth3ds1ChallengeError", "Auth3ds1ChallengeComplete", "AuthWithWebView", "AuthWithCustomTabs", "AuthWithDefaultBrowser", "ConfirmReturnUrlNull", "ConfirmReturnUrlDefault", "ConfirmReturnUrlCustom", "FpxBankStatusesRetrieve", "StripeUrlRetrieve", "Auth3ds2RequestParamsFailed", "Auth3ds2Fingerprint", "Auth3ds2Start", "Auth3ds2Frictionless", "Auth3ds2ChallengePresented", "Auth3ds2ChallengeCanceled", "Auth3ds2ChallengeCompleted", "Auth3ds2ChallengeErrored", "Auth3ds2ChallengeTimedOut", "Auth3ds2Fallback", "AuthRedirect", "AuthError", "AuthSourceStart", "AuthSourceRedirect", "AuthSourceResult", "RadarSessionCreate", "GooglePayLauncherInit", "GooglePayPaymentMethodLauncherInit", "CardMetadataPublishableKeyAvailable", "CardMetadataPublishableKeyUnavailable", "CardMetadataLoadedTooSlow", "CardMetadataLoadFailure", "CardMetadataMissingRange", "Companion", "payments-core_debug"})
public enum PaymentAnalyticsEvent {
    /*public static final*/ TokenCreate /* = new TokenCreate(null) */,
    /*public static final*/ PaymentMethodCreate /* = new PaymentMethodCreate(null) */,
    /*public static final*/ CustomerRetrieve /* = new CustomerRetrieve(null) */,
    /*public static final*/ CustomerRetrievePaymentMethods /* = new CustomerRetrievePaymentMethods(null) */,
    /*public static final*/ CustomerAttachPaymentMethod /* = new CustomerAttachPaymentMethod(null) */,
    /*public static final*/ CustomerDetachPaymentMethod /* = new CustomerDetachPaymentMethod(null) */,
    /*public static final*/ CustomerDeleteSource /* = new CustomerDeleteSource(null) */,
    /*public static final*/ CustomerSetShippingInfo /* = new CustomerSetShippingInfo(null) */,
    /*public static final*/ CustomerAddSource /* = new CustomerAddSource(null) */,
    /*public static final*/ CustomerSetDefaultSource /* = new CustomerSetDefaultSource(null) */,
    /*public static final*/ IssuingRetrievePin /* = new IssuingRetrievePin(null) */,
    /*public static final*/ IssuingUpdatePin /* = new IssuingUpdatePin(null) */,
    /*public static final*/ SourceCreate /* = new SourceCreate(null) */,
    /*public static final*/ SourceRetrieve /* = new SourceRetrieve(null) */,
    /*public static final*/ PaymentIntentConfirm /* = new PaymentIntentConfirm(null) */,
    /*public static final*/ PaymentIntentRetrieve /* = new PaymentIntentRetrieve(null) */,
    /*public static final*/ PaymentIntentCancelSource /* = new PaymentIntentCancelSource(null) */,
    /*public static final*/ PaymentIntentRefresh /* = new PaymentIntentRefresh(null) */,
    /*public static final*/ SetupIntentConfirm /* = new SetupIntentConfirm(null) */,
    /*public static final*/ SetupIntentRetrieve /* = new SetupIntentRetrieve(null) */,
    /*public static final*/ SetupIntentCancelSource /* = new SetupIntentCancelSource(null) */,
    /*public static final*/ FileCreate /* = new FileCreate(null) */,
    /*public static final*/ Auth3ds1Sdk /* = new Auth3ds1Sdk(null) */,
    /*public static final*/ Auth3ds1ChallengeStart /* = new Auth3ds1ChallengeStart(null) */,
    /*public static final*/ Auth3ds1ChallengeError /* = new Auth3ds1ChallengeError(null) */,
    /*public static final*/ Auth3ds1ChallengeComplete /* = new Auth3ds1ChallengeComplete(null) */,
    /*public static final*/ AuthWithWebView /* = new AuthWithWebView(null) */,
    /*public static final*/ AuthWithCustomTabs /* = new AuthWithCustomTabs(null) */,
    /*public static final*/ AuthWithDefaultBrowser /* = new AuthWithDefaultBrowser(null) */,
    /*public static final*/ ConfirmReturnUrlNull /* = new ConfirmReturnUrlNull(null) */,
    /*public static final*/ ConfirmReturnUrlDefault /* = new ConfirmReturnUrlDefault(null) */,
    /*public static final*/ ConfirmReturnUrlCustom /* = new ConfirmReturnUrlCustom(null) */,
    /*public static final*/ FpxBankStatusesRetrieve /* = new FpxBankStatusesRetrieve(null) */,
    /*public static final*/ StripeUrlRetrieve /* = new StripeUrlRetrieve(null) */,
    /*public static final*/ Auth3ds2RequestParamsFailed /* = new Auth3ds2RequestParamsFailed(null) */,
    /*public static final*/ Auth3ds2Fingerprint /* = new Auth3ds2Fingerprint(null) */,
    /*public static final*/ Auth3ds2Start /* = new Auth3ds2Start(null) */,
    /*public static final*/ Auth3ds2Frictionless /* = new Auth3ds2Frictionless(null) */,
    /*public static final*/ Auth3ds2ChallengePresented /* = new Auth3ds2ChallengePresented(null) */,
    /*public static final*/ Auth3ds2ChallengeCanceled /* = new Auth3ds2ChallengeCanceled(null) */,
    /*public static final*/ Auth3ds2ChallengeCompleted /* = new Auth3ds2ChallengeCompleted(null) */,
    /*public static final*/ Auth3ds2ChallengeErrored /* = new Auth3ds2ChallengeErrored(null) */,
    /*public static final*/ Auth3ds2ChallengeTimedOut /* = new Auth3ds2ChallengeTimedOut(null) */,
    /*public static final*/ Auth3ds2Fallback /* = new Auth3ds2Fallback(null) */,
    /*public static final*/ AuthRedirect /* = new AuthRedirect(null) */,
    /*public static final*/ AuthError /* = new AuthError(null) */,
    /*public static final*/ AuthSourceStart /* = new AuthSourceStart(null) */,
    /*public static final*/ AuthSourceRedirect /* = new AuthSourceRedirect(null) */,
    /*public static final*/ AuthSourceResult /* = new AuthSourceResult(null) */,
    /*public static final*/ RadarSessionCreate /* = new RadarSessionCreate(null) */,
    /*public static final*/ GooglePayLauncherInit /* = new GooglePayLauncherInit(null) */,
    /*public static final*/ GooglePayPaymentMethodLauncherInit /* = new GooglePayPaymentMethodLauncherInit(null) */,
    /*public static final*/ CardMetadataPublishableKeyAvailable /* = new CardMetadataPublishableKeyAvailable(null) */,
    /*public static final*/ CardMetadataPublishableKeyUnavailable /* = new CardMetadataPublishableKeyUnavailable(null) */,
    /*public static final*/ CardMetadataLoadedTooSlow /* = new CardMetadataLoadedTooSlow(null) */,
    /*public static final*/ CardMetadataLoadFailure /* = new CardMetadataLoadFailure(null) */,
    /*public static final*/ CardMetadataMissingRange /* = new CardMetadataMissingRange(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.networking.PaymentAnalyticsEvent.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PREFIX = "stripe_android";
    
    PaymentAnalyticsEvent(java.lang.String code) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;", "", "()V", "PREFIX", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}