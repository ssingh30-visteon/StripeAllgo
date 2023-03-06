package com.stripe.android.networking;

import java.lang.System;

/**
 * An interface for data operations on Stripe API objects.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0019J%\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b \u0010!J5\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\'\u0010(J5\u0010)\u001a\u0004\u0018\u00010\u001b2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u00103J#\u00104\u001a\u0004\u0018\u00010\u00112\u0006\u00105\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001d\u00108\u001a\u0004\u0018\u0001092\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b:\u0010;J%\u0010<\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b?\u0010@J%\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bE\u0010FJC\u0010G\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bH\u0010\u0013J9\u0010I\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ%\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020N2\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020R2\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bS\u0010;J=\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110&2\u0006\u0010U\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010WJ%\u0010X\u001a\u0004\u0018\u00010\u00152\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\rH\u00a1@\u00f8\u0001\u0000\u00a2\u0006\u0004\bZ\u0010!J3\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b]\u0010^J5\u0010_\u001a\u0004\u0018\u00010\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bc\u0010dJ#\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bh\u0010!J3\u0010i\u001a\u0004\u0018\u00010\u00152\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ+\u0010k\u001a\u0004\u0018\u00010\u00152\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010l\u001a\u00020mH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010nJ3\u0010o\u001a\u0004\u0018\u00010\u001b2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ+\u0010p\u001a\u0004\u0018\u00010\u001b2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010l\u001a\u00020mH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010nJ-\u0010q\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\br\u0010\u0019J3\u0010s\u001a\u00020t2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\bu\u0010jJC\u0010v\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010w\u001a\u00020x2\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\by\u0010zJK\u0010{\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b|\u0010\u000fJ\'\u0010}\u001a\u0004\u0018\u00010\u001f2\u0006\u0010~\u001a\u00020\u007f2\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J@\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0006\u0010`\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/stripe/android/networking/StripeRepository;", "", "()V", "addCustomerSource", "Lcom/stripe/android/model/Source;", "customerId", "", "publishableKey", "productUsageTokens", "", "sourceId", "sourceType", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "addCustomerSource$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentIntentSource", "Lcom/stripe/android/model/PaymentIntent;", "paymentIntentId", "options", "cancelPaymentIntentSource$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelSetupIntentSource", "Lcom/stripe/android/model/SetupIntent;", "setupIntentId", "cancelSetupIntentSource$payments_core_debug", "complete3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "complete3ds2Auth$payments_core_debug", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "expandFields", "", "confirmPaymentIntent$payments_core_debug", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent$payments_core_debug", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFile", "Lcom/stripe/android/model/StripeFile;", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "createFile$payments_core_debug", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createRadarSession$payments_core_debug", "(Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource$payments_core_debug", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken$payments_core_debug", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource$payments_core_debug", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata$payments_core_debug", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus$payments_core_debug", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshPaymentIntent", "clientSecret", "refreshPaymentIntent$payments_core_debug", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "retrieveCustomer$payments_core_debug", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "Lorg/json/JSONObject;", "url", "retrieveObject$payments_core_debug", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentIntentWithOrderedPaymentMethods", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSetupIntentWithOrderedPaymentMethods", "retrieveSource", "retrieveSource$payments_core_debug", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent$payments_core_debug", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource$payments_core_debug", "start3ds2Auth", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth$payments_core_debug", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "", "newPin", "updateIssuingCardPin$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public abstract class StripeRepository {
    
    public StripeRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retrieveStripeIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object confirmPaymentIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object retrievePaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object retrievePaymentIntentWithOrderedPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object refreshPaymentIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object cancelPaymentIntentSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object confirmSetupIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object retrieveSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object retrieveSetupIntentWithOrderedPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object cancelSetupIntentSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentId, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object createSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object retrieveSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public abstract java.lang.Object createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object createToken$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.TokenParams tokenParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object addCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object deleteCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object attachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object detachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ListPaymentMethodsParams listPaymentMethodsParams, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.PaymentMethod>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object setDefaultCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object setCustomerShippingInfo$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object retrieveCustomer$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class, org.json.JSONException.class})
    public abstract java.lang.Object retrieveIssuingCardPin$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public abstract java.lang.Object updateIssuingCardPin$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String newPin, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFpxBankStatus$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.BankStatuses> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCardMetadata$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.CardMetadata> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object start3ds2Auth$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2AuthParams authParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Stripe3ds2AuthResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object complete3ds2Auth$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Stripe3ds2AuthResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createFile$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeFile> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retrieveObject$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.json.JSONObject> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createRadarSession$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.RadarSession> continuation);
}