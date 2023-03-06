package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u00017J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J)\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H&J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001a\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001a\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J1\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010,\u001a\u00020-H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J)\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J)\u00102\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00103\u001a\u0002042\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\b\u00106\u001a\u00020\u0017H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lcom/stripe/android/PaymentController;", "", "confirmAndAuthenticateAlipay", "Lcom/stripe/android/PaymentIntentResult;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPay", "Lcom/stripe/android/model/WeChatPayNextAction;", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticateSourceResult", "Lcom/stripe/android/model/Source;", "data", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "handleNextAction", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerLaunchersWithActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "shouldHandlePaymentResult", "", "requestCode", "", "shouldHandleSetupResult", "shouldHandleSourceResult", "startAuth", "clientSecret", "", "type", "Lcom/stripe/android/PaymentController$StripeIntentType;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthenticateSource", "source", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConfirmAndAuth", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterLaunchers", "StripeIntentType", "payments-core_debug"})
public abstract interface PaymentController {
    
    /**
     * Confirm the Stripe Intent and resolve any next actions
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startConfirmAndAuth(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmStripeIntentParams confirmStripeIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Confirm a Alipay [PaymentIntent], authenticate it and return the [PaymentIntent].
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param authenticator a [AlipayAuthenticator] used to interface with the Alipay SDK
     * @param requestOptions a [ApiRequest.Options] to associate with this request
     *
     * @return a [PaymentIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the PaymentIntent response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public abstract java.lang.Object confirmAndAuthenticateAlipay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> continuation);
    
    /**
     * Confirm the Stripe Intent for WeChat Pay, return WeChat Pay params from intent's next action
     *
     * @param confirmPaymentIntentParams params to confirm the intent
     * @param requestOptions options for [ApiRequest]
     * @return the [WeChatPayNextAction] object encapsulating [PaymentIntent] and [WeChat]
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the payment intent's next action data is not for WeChat Pay
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public abstract java.lang.Object confirmWeChatPay(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.WeChatPayNextAction> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startAuth(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentController.StripeIntentType type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startAuthenticateSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Decide whether [getPaymentIntentResult] should be called.
     */
    public abstract boolean shouldHandlePaymentResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data);
    
    /**
     * Decide whether [getSetupIntentResult] should be called.
     */
    public abstract boolean shouldHandleSetupResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data);
    
    /**
     * Decide whether [getAuthenticateSourceResult] should be called.
     */
    public abstract boolean shouldHandleSourceResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data);
    
    /**
     * Get the PaymentIntent's client_secret from [data] and use to retrieve
     * the PaymentIntent object with updated status.
     *
     * @param data the result Intent
     * @return the [PaymentIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the PaymentIntent response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public abstract java.lang.Object getPaymentIntentResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.PaymentIntentResult> continuation);
    
    /**
     * Get the SetupIntent's client_secret from [data] and use to retrieve
     * the SetupIntent object with updated status.
     *
     * @param data the result Intent
     * @return the [SetupIntentResult] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the SetupIntent response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public abstract java.lang.Object getSetupIntentResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.SetupIntentResult> continuation);
    
    /**
     * Get the Source's client_secret from [data] and use to retrieve
     * the Source object with updated status.
     *
     * @param data the result Intent
     * @return the [Source] object
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     * @throws IllegalArgumentException if the Source response's JsonParser returns null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, java.lang.IllegalArgumentException.class})
    public abstract java.lang.Object getAuthenticateSourceResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation);
    
    /**
     * Determine which authentication mechanism should be used, or bypass authentication
     * if it is not needed.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handleNextAction(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Register the [ActivityResultLauncher]s with the new [ActivityResultCaller] and callback.
     *
     * [ActivityResultCaller] is usually an [Activity] or [Fragment] instance, this method needs
     * to be called from [Activity.onCreate] to make sure that during configuration change,
     * the new [Activity] instance correctly registers for launchers and the old instance is
     * correctly GC-ed.
     */
    public abstract void registerLaunchersWithActivityResultCaller(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCallback<com.stripe.android.payments.PaymentFlowResult.Unvalidated> activityResultCallback);
    
    /**
     * Unregister the [ActivityResultLauncher]s, releasing the reference to [Activity] or
     * [Fragment].
     */
    public abstract void unregisterLaunchers();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentController$StripeIntentType;", "", "(Ljava/lang/String;I)V", "PaymentIntent", "SetupIntent", "payments-core_debug"})
    public static enum StripeIntentType {
        /*public static final*/ PaymentIntent /* = new PaymentIntent() */,
        /*public static final*/ SetupIntent /* = new SetupIntent() */;
        
        StripeIntentType() {
        }
    }
}