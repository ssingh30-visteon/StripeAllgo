package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u00c2\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004H\u0082\b\u00a2\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u001a1\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0016\u001a5\u0010\u001e\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\"\u001a5\u0010#\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010&\u001a5\u0010\'\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010*\u001a7\u0010+\u001a\u00020\u001f*\u00020\u000b2\b\b\u0001\u0010,\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020/*\u00020\u000b2\u0006\u00100\u001a\u0002012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u00102\u001a5\u00103\u001a\u000204*\u00020\u000b2\u0006\u00105\u001a\u0002062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u00107\u001a5\u00108\u001a\u00020\u001f*\u00020\u000b2\u0006\u00109\u001a\u00020:2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010;\u001a5\u0010<\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010=\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010-\u001a\u0015\u0010>\u001a\u00020?*\u00020\u000bH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010@\u001a5\u0010A\u001a\u00020B*\u00020\u000b2\u0006\u0010C\u001a\u00020D2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010E\u001a%\u0010F\u001a\u00020B*\u00020\u000b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010K\u001a%\u0010L\u001a\u00020\n*\u00020\u000b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010K\u001a%\u0010M\u001a\u00020N*\u00020\u000b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010K\u001a)\u0010O\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010P\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010Q\u001a)\u0010R\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010P\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010Q\u001a5\u0010S\u001a\u00020B*\u00020\u000b2\b\b\u0001\u0010T\u001a\u00020\u00112\b\b\u0001\u0010P\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010-\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u0006U"}, d2 = {"runApiRequest", "ApiObject", "Lcom/stripe/android/model/StripeModel;", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/model/StripeModel;", "isValidParam", "", "(ZLkotlin/jvm/functions/Function0;)Lcom/stripe/android/model/StripeModel;", "confirmAlipayPayment", "Lcom/stripe/android/PaymentIntentResult;", "Lcom/stripe/android/Stripe;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "stripeAccountId", "", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "idempotencyKey", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "createAccountToken", "Lcom/stripe/android/model/Token;", "accountParams", "Lcom/stripe/android/model/AccountParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCvcUpdateToken", "cvc", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFile", "Lcom/stripe/android/model/StripeFile;", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPersonToken", "params", "Lcom/stripe/android/model/PersonTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPiiToken", "personalId", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "(Lcom/stripe/android/Stripe;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSource", "Lcom/stripe/android/model/Source;", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticateSourceResult", "requestCode", "", "data", "Landroid/content/Intent;", "(Lcom/stripe/android/Stripe;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "retrievePaymentIntent", "clientSecret", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSource", "sourceId", "payments-core_debug"})
public final class StripeKtxKt {
    
    /**
     * Confirm and authenticate a [PaymentIntent] using the Alipay SDK
     * @see <a href="https://intl.alipay.com/docs/ac/app/sdk_integration">Alipay Documentation</a>
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param authenticator a [AlipayAuthenticator] used to interface with the Alipay SDK
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object confirmAlipayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$confirmAlipayPayment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> p4) {
        return null;
    }
    
    /**
     * Create a [PaymentMethod] from a coroutine.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams the [PaymentMethodCreateParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentMethod] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createPaymentMethod, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> p4) {
        return null;
    }
    
    /**
     * Create a [Source] from a coroutine.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param sourceParams the [SourceParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createSource, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> p4) {
        return null;
    }
    
    /**
     * Create a [Token] from a coroutine.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams the [AccountParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createAccountToken, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Create a bank account token from a coroutine.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createBankAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createBankAccountToken, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Create a PII token from a coroutine.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal id used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createPiiToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createPiiToken, @org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Create a Card token from a coroutine.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] used to create this payment token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws CardException the card cannot be charged for some reason
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public static final java.lang.Object createCardToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createCardToken, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Create a CVC update token from a coroutine.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createCvcUpdateToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createCvcUpdateToken, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 3L, max = 4L)
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Creates a single-use token that represents the details for a person. Use this when creating or
     * updating persons associated with a Connect account.
     * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     *
     * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
     *
     * @param params the person token creation params
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createPersonToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createPersonToken, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> p4) {
        return null;
    }
    
    /**
     * Create a [StripeFile] from a coroutine.
     *
     * * See [Create a file](https://stripe.com/docs/api/files/create).
     * `POST /v1/files`
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [StripeFile] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws CardException the card cannot be charged for some reason
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class})
    public static final java.lang.Object createFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createFile, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeFile> p4) {
        return null;
    }
    
    /**
     * Create a Radar Session.
     *
     * [Stripe.advancedFraudSignalsEnabled] must be `true` to use this method.
     *
     * See the [Radar Session](https://stripe.com/docs/radar/radar-session) docs for more details.
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object createRadarSession(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$createRadarSession, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.RadarSession> p1) {
        return null;
    }
    
    /**
     * Retrieve a [PaymentIntent] from a coroutine.
     *
     * See [Retrieve a PaymentIntent](https://stripe.com/docs/api/payment_intents/retrieve).
     * `GET /v1/payment_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentIntent] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object retrievePaymentIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$retrievePaymentIntent, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> p3) {
        return null;
    }
    
    /**
     * Retrieve a [SetupIntent] asynchronously.
     *
     * See [Retrieve a SetupIntent](https://stripe.com/docs/api/setup_intents/retrieve).
     * `GET /v1/setup_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [SetupIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [SetupIntent] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object retrieveSetupIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$retrieveSetupIntent, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> p3) {
        return null;
    }
    
    /**
     * Retrieve a [Source] from a coroutine.
     *
     * See [Retrieve a source](https://stripe.com/docs/api/sources/retrieve).
     * `GET /v1/sources/:id`
     *
     * @param sourceId the [Source.id] field of the desired Source object
     * @param clientSecret the [Source.clientSecret] field of the desired Source object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object retrieveSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$retrieveSource, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> p4) {
        return null;
    }
    
    /**
     * Suspend function to confirm a [SetupIntent] object.
     *
     * See [Confirm a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     * `POST /v1/setup_intents/:id/confirm`
     *
     * @param confirmSetupIntentParams a set of params with which to confirm the Setup Intent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [SetupIntent] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object confirmSetupIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$confirmSetupIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> p3) {
        return null;
    }
    
    /**
     * Suspend function to confirm a [PaymentIntent] for WeChat Pay. Extract params from [WeChatPayNextAction] to pass to WeChat Pay SDK.
     * @see <a href="https://pay.weixin.qq.com/index.php/public/wechatpay">WeChat Pay Documentation</a>
     *
     * WeChat Pay API is still in beta, create a [Stripe] instance with [StripeApiBeta.WeChatPayV1] to enable this API.
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the [Stripe] object, if specified.
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object confirmWeChatPayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$confirmWeChatPayPayment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.WeChatPayNextAction> p3) {
        return null;
    }
    
    /**
     * Suspend function to confirm a [PaymentIntent] object.
     *
     * See [Confirm a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     * `POST /v1/payment_intents/:id/confirm`
     *
     * @param confirmPaymentIntentParams a set of params with which to confirm the PaymentIntent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [PaymentIntent] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object confirmPaymentIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$confirmPaymentIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> p3) {
        return null;
    }
    
    /**
     * Get the [PaymentIntentResult] from [Intent] returned via
     * Activity#onActivityResult(int, int, Intent)}} for PaymentIntent automatic confirmation
     * (see [confirmPayment]) or manual confirmation (see [handleNextActionForPayment]})
     *
     * @param requestCode [Int] code passed from Activity#onActivityResult
     * @param data [Intent] intent from Activity#onActivityResult
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object getPaymentIntentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$getPaymentIntentResult, int requestCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> p3) {
        return null;
    }
    
    /**
     * Get the [SetupIntentResult] from [Intent] returned via
     * Activity#onActivityResult(int, int, Intent)}} for SetupIntentResult confirmation.
     * (see [confirmSetupIntent])
     *
     * @param requestCode [Int] code passed from Activity#onActivityResult
     * @param data [Intent] intent from Activity#onActivityResult
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public static final java.lang.Object getSetupIntentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$getSetupIntentResult, int requestCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.SetupIntentResult> p3) {
        return null;
    }
    
    /**
     * Get the [Source] from [Intent] returned via
     * Activity#onActivityResult(int, int, Intent)}} for [Source] authentication.
     * (see [authenticateSource])
     *
     * @param requestCode [Int] code passed from Activity#onActivityResult
     * @param data [Intent] intent from Activity#onActivityResult
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public static final java.lang.Object getAuthenticateSourceResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Stripe $this$getAuthenticateSourceResult, int requestCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> p3) {
        return null;
    }
}