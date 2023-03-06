package com.stripe.android;

import java.lang.System;

/**
 * Entry-point to the Stripe SDK.
 *
 * Supports asynchronous and synchronous methods to access the following Stripe APIs.
 *
 * * [Payment Intent API][PaymentIntent] - confirm and retrieve
 * * [Setup Intents API][SetupIntent] - confirm and retrieve
 * * [Payment Methods API][PaymentMethod] - create
 * * [Sources API][Source] - create and retrieve
 * * [Tokens API][Token] - create tokens for [Card], [BankAccount], [PiiTokenParams], and [AccountParams]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fB1\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fB)\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0012B5\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J2\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010&\u001a\u00020\'2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00102\u001a\u0002032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u0002032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u0002032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H\u0007J*\u00106\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u0002070+H\u0007J6\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00109\u001a\u00020:2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010D\u001a\u0004\u0018\u00010;2\u0006\u0010B\u001a\u00020C2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010E\u001a\u00020\u001e2\b\b\u0001\u0010F\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010G\u001a\u0004\u0018\u00010;2\u0006\u0010F\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020K0+H\u0007J(\u0010L\u001a\u00020K2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020O2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020P0+H\u0007J*\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010N\u001a\u00020O2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010U\u001a\u0004\u0018\u00010;2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J6\u0010V\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0007J*\u0010X\u001a\u0004\u0018\u00010;2\u0006\u0010W\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u0010Y\u001a\u00020\u001e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020Z0+H\u0007J6\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020]2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0007J*\u0010^\u001a\u0004\u0018\u00010\"2\u0006\u0010S\u001a\u00020]2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J4\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020;0+H\u0002J:\u0010b\u001a\u00020\u001e\"\b\b\u0000\u0010c*\u00020d2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hc0f2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002Hc0+H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJH\u0010h\u001a\u00020\u001e\"\b\b\u0000\u0010c*\u00020d2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002Hc0+2\u001e\u0010i\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001Hc0k\u0012\u0006\u0012\u0004\u0018\u00010\u00010jH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010lJ$\u0010m\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010m\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J$\u0010o\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010u\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u0018\u0010v\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tJ\u001c\u0010w\u001a\u00020\u001e2\u0006\u0010s\u001a\u00020t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+J(\u0010x\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J(\u0010y\u001a\u00020\b2\u0006\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020z0+H\u0007J*\u0010{\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020/0+H\u0007J\u001e\u0010|\u001a\u0004\u0018\u00010/2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J*\u0010}\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u0002050+H\u0007J\u001e\u0010~\u001a\u0004\u0018\u0001052\u0006\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J7\u0010\u007f\u001a\u00020\u001e2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u00052\b\b\u0001\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0007J,\u0010\u0081\u0001\u001a\u0004\u0018\u00010\"2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u00052\b\b\u0001\u0010n\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/stripe/android/Stripe;", "", "context", "Landroid/content/Context;", "publishableKey", "", "stripeAccountId", "enableLogging", "", "betas", "", "Lcom/stripe/android/StripeApiBeta;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V", "paymentController", "Lcom/stripe/android/PaymentController;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "getPaymentController$payments_core_debug", "()Lcom/stripe/android/PaymentController;", "getPublishableKey$payments_core_debug", "()Ljava/lang/String;", "getStripeAccountId$payments_core_debug", "getStripeRepository$payments_core_debug", "()Lcom/stripe/android/networking/StripeRepository;", "authenticateSource", "", "activity", "Landroidx/activity/ComponentActivity;", "source", "Lcom/stripe/android/model/Source;", "fragment", "Landroidx/fragment/app/Fragment;", "confirmAlipayPayment", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "callback", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/PaymentIntentResult;", "confirmPayment", "confirmPaymentIntentSynchronous", "Lcom/stripe/android/model/PaymentIntent;", "idempotencyKey", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentSynchronous", "Lcom/stripe/android/model/SetupIntent;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "createAccountToken", "accountParams", "Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/Token;", "createAccountTokenSynchronous", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "createBankAccountTokenSynchronous", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardTokenSynchronous", "createCvcUpdateToken", "cvc", "createCvcUpdateTokenSynchronous", "createFile", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "Lcom/stripe/android/model/StripeFile;", "createFileSynchronous", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethodSynchronous", "createPersonToken", "params", "Lcom/stripe/android/model/PersonTokenParams;", "createPersonTokenSynchronous", "createPiiToken", "personalId", "createPiiTokenSynchronous", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSourceSynchronous", "createToken", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "dispatchResult", "T", "Lcom/stripe/android/model/StripeModel;", "result", "Lkotlin/Result;", "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeAsync", "apiMethod", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V", "handleNextActionForPayment", "clientSecret", "handleNextActionForSetupIntent", "isAuthenticateSourceResult", "requestCode", "", "data", "Landroid/content/Intent;", "isPaymentResult", "isSetupResult", "onAuthenticateSourceResult", "onPaymentResult", "onSetupResult", "Lcom/stripe/android/SetupIntentResult;", "retrievePaymentIntent", "retrievePaymentIntentSynchronous", "retrieveSetupIntent", "retrieveSetupIntentSynchronous", "retrieveSource", "sourceId", "retrieveSourceSynchronous", "Companion", "payments-core_debug"})
public final class Stripe {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.PaymentController paymentController = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String stripeAccountId = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publishableKey = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.Stripe.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final java.lang.String API_VERSION = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERSION_NAME = "18.2.0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERSION = "AndroidBindings/18.2.0";
    
    /**
     * Setter for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     */
    @org.jetbrains.annotations.Nullable()
    private static com.stripe.android.AppInfo appInfo;
    
    /**
     * [advancedFraudSignalsEnabled] determines whether additional device data is sent to Stripe
     * for fraud prevention. By default, this property is set to `true`.
     *
     * Disabling this setting will reduce Stripe's ability to protect your business from
     * fraudulent payments.
     *
     * For more details on the information we collect, visit
     * [https://stripe.com/docs/disputes/prevention/advanced-fraud-detection](https://stripe.com/docs/disputes/prevention/advanced-fraud-detection)
     */
    private static boolean advancedFraudSignalsEnabled = true;
    
    public Stripe(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentController paymentController, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.networking.StripeRepository getStripeRepository$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentController getPaymentController$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeAccountId$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishableKey$payments_core_debug() {
        return null;
    }
    
    /**
     * Constructor with publishable key and Stripe Connect account id.
     *
     * @param context Activity or application context
     * @param publishableKey the client's publishable key
     * @param stripeAccountId optional, the Stripe Connect account id to attach to [Stripe API requests](https://stripe.com/docs/connect/authentication#authentication-via-the-stripe-account-header)
     * @param enableLogging enable logging in the Stripe and Stripe 3DS2 SDKs; disabled by default.
     * It is recommended to disable logging in production. Logs can be accessed from the command line using
     * `adb logcat -s StripeSdk`
     * @param betas optional, set of beta flags to pass to the Stripe API. Setting this property is
     * not sufficient to participate in a beta, and passing a beta you are not registered
     * in will result in API errors.
     */
    @kotlin.jvm.JvmOverloads()
    public Stripe(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey) {
        super();
    }
    
    /**
     * Constructor with publishable key and Stripe Connect account id.
     *
     * @param context Activity or application context
     * @param publishableKey the client's publishable key
     * @param stripeAccountId optional, the Stripe Connect account id to attach to [Stripe API requests](https://stripe.com/docs/connect/authentication#authentication-via-the-stripe-account-header)
     * @param enableLogging enable logging in the Stripe and Stripe 3DS2 SDKs; disabled by default.
     * It is recommended to disable logging in production. Logs can be accessed from the command line using
     * `adb logcat -s StripeSdk`
     * @param betas optional, set of beta flags to pass to the Stripe API. Setting this property is
     * not sufficient to participate in a beta, and passing a beta you are not registered
     * in will result in API errors.
     */
    @kotlin.jvm.JvmOverloads()
    public Stripe(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
        super();
    }
    
    /**
     * Constructor with publishable key and Stripe Connect account id.
     *
     * @param context Activity or application context
     * @param publishableKey the client's publishable key
     * @param stripeAccountId optional, the Stripe Connect account id to attach to [Stripe API requests](https://stripe.com/docs/connect/authentication#authentication-via-the-stripe-account-header)
     * @param enableLogging enable logging in the Stripe and Stripe 3DS2 SDKs; disabled by default.
     * It is recommended to disable logging in production. Logs can be accessed from the command line using
     * `adb logcat -s StripeSdk`
     * @param betas optional, set of beta flags to pass to the Stripe API. Setting this property is
     * not sufficient to participate in a beta, and passing a beta you are not registered
     * in will result in API errors.
     */
    @kotlin.jvm.JvmOverloads()
    public Stripe(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, boolean enableLogging) {
        super();
    }
    
    /**
     * Constructor with publishable key and Stripe Connect account id.
     *
     * @param context Activity or application context
     * @param publishableKey the client's publishable key
     * @param stripeAccountId optional, the Stripe Connect account id to attach to [Stripe API requests](https://stripe.com/docs/connect/authentication#authentication-via-the-stripe-account-header)
     * @param enableLogging enable logging in the Stripe and Stripe 3DS2 SDKs; disabled by default.
     * It is recommended to disable logging in production. Logs can be accessed from the command line using
     * `adb logcat -s StripeSdk`
     * @param betas optional, set of beta flags to pass to the Stripe API. Setting this property is
     * not sufficient to participate in a beta, and passing a beta you are not registered
     * in will result in API errors.
     */
    @kotlin.jvm.JvmOverloads()
    public Stripe(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, boolean enableLogging, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas) {
        super();
    }
    
    private Stripe(android.content.Context context, com.stripe.android.networking.StripeRepository stripeRepository, java.lang.String publishableKey, java.lang.String stripeAccountId, boolean enableLogging) {
        super();
    }
    
    public Stripe(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentController paymentController, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
        super();
    }
    
    /**
     * Confirm and, if necessary, authenticate a [PaymentIntent].
     * Used for [automatic confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#automatic-confirmation-flow) flow.
     *
     * For confirmation attempts that require 3DS1 authentication, the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - Otherwise, use the device browser.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void confirmPayment(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [PaymentIntent].
     * Used for [automatic confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#automatic-confirmation-flow) flow.
     *
     * For confirmation attempts that require 3DS1 authentication, the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - Otherwise, use the device browser.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void confirmPayment(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Confirm and authenticate a [PaymentIntent] using the Alipay SDK
     * @see <a href="https://intl.alipay.com/docs/ac/app/sdk_integration">Alipay Documentation</a>
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param authenticator a [AlipayAuthenticator] used to interface with the Alipay SDK
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    public final void confirmAlipayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.PaymentIntentResult> callback) {
    }
    
    /**
     * Confirm and authenticate a [PaymentIntent] using the Alipay SDK
     * @see <a href="https://intl.alipay.com/docs/ac/app/sdk_integration">Alipay Documentation</a>
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param authenticator a [AlipayAuthenticator] used to interface with the Alipay SDK
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    public final void confirmAlipayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.PaymentIntentResult> callback) {
    }
    
    /**
     * Confirm a [PaymentIntent] for WeChat Pay. Extract params from [WeChatPayNextAction] to pass to WeChat Pay SDK.
     * @see <a href="https://pay.weixin.qq.com/index.php/public/wechatpay">WeChat Pay Documentation</a>
     *
     * WeChat Pay API is still in beta, create a [Stripe] instance with [StripeApiBeta.WeChatPayV1] to enable this API.
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the [Stripe] object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     *
     * Possible callback errors:
     * [AuthenticationException] failure to properly authenticate yourself (check your key)
     * [InvalidRequestException] your request has invalid parameters
     * [APIConnectionException] failure to connect to Stripe's API
     * [APIException] any other type of problem (for instance, a temporary issue with Stripe's servers)
     * [InvalidRequestException] if the payment intent's next action data is not for WeChat Pay
     *
     * To avoid interacting with WeChat Pay SDK directly, use WeChatPay module.
     * @see <a href="https://github.com/stripe/stripe-android/tree/master/wechatpay">WeChatPay module</a>
     */
    @kotlin.jvm.JvmOverloads()
    @java.lang.Deprecated()
    public final void confirmWeChatPayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.WeChatPayNextAction> callback) {
    }
    
    /**
     * Confirm a [PaymentIntent] for WeChat Pay. Extract params from [WeChatPayNextAction] to pass to WeChat Pay SDK.
     * @see <a href="https://pay.weixin.qq.com/index.php/public/wechatpay">WeChat Pay Documentation</a>
     *
     * WeChat Pay API is still in beta, create a [Stripe] instance with [StripeApiBeta.WeChatPayV1] to enable this API.
     *
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the
     * [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the [Stripe] object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     *
     * Possible callback errors:
     * [AuthenticationException] failure to properly authenticate yourself (check your key)
     * [InvalidRequestException] your request has invalid parameters
     * [APIConnectionException] failure to connect to Stripe's API
     * [APIException] any other type of problem (for instance, a temporary issue with Stripe's servers)
     * [InvalidRequestException] if the payment intent's next action data is not for WeChat Pay
     *
     * To avoid interacting with WeChat Pay SDK directly, use WeChatPay module.
     * @see <a href="https://github.com/stripe/stripe-android/tree/master/wechatpay">WeChatPay module</a>
     */
    @kotlin.jvm.JvmOverloads()
    @java.lang.Deprecated()
    public final void confirmWeChatPayPayment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.WeChatPayNextAction> callback) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [PaymentIntent].
     * Used for [automatic confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#automatic-confirmation-flow) flow.
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void confirmPayment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [PaymentIntent].
     * Used for [automatic confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#automatic-confirmation-flow) flow.
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param confirmPaymentIntentParams [ConfirmPaymentIntentParams] used to confirm the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void confirmPayment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Handle the [next_action](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-next_action)
     * for a previously confirmed [PaymentIntent].
     *
     * Used for [manual confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#manual-confirmation-flow) flow.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret)
     * property of a confirmed [PaymentIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void handleNextActionForPayment(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    /**
     * Handle the [next_action](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-next_action)
     * for a previously confirmed [PaymentIntent].
     *
     * Used for [manual confirmation](https://stripe.com/docs/payments/payment-intents/quickstart#manual-confirmation-flow) flow.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret)
     * property of a confirmed [PaymentIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void handleNextActionForPayment(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Handle the [next_action](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-next_action)
     * for a previously confirmed [PaymentIntent].
     *
     * Used for [manual confirmation](https://stripe.com/docs/payments/payment-intents/android-manual) flow.
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret)
     * property of a confirmed [PaymentIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void handleNextActionForPayment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    /**
     * Handle the [next_action](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-next_action)
     * for a previously confirmed [PaymentIntent].
     *
     * Used for [manual confirmation](https://stripe.com/docs/payments/payment-intents/android-manual) flow.
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-client_secret)
     * property of a confirmed [PaymentIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void handleNextActionForPayment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Check if the requestCode and [Intent] is for [PaymentIntentResult].
     * The [Intent] should be retrieved from the result from `Activity#onActivityResult(int, int, Intent)}}`
     * by [Activity] started with [confirmPayment] or [handleNextActionForPayment].
     *
     * @return whether the requestCode and intent is for [PaymentIntentResult].
     */
    public final boolean isPaymentResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    /**
     * Should be called via `Activity#onActivityResult(int, int, Intent)}}` to handle the
     * result of a PaymentIntent automatic confirmation (see [confirmPayment]) or
     * manual confirmation (see [handleNextActionForPayment]})
     */
    @androidx.annotation.UiThread()
    public final boolean onPaymentResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.PaymentIntentResult> callback) {
        return false;
    }
    
    /**
     * Retrieve a [PaymentIntent] asynchronously.
     *
     * See [Retrieve a PaymentIntent](https://stripe.com/docs/api/payment_intents/retrieve).
     * `GET /v1/payment_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void retrievePaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.PaymentIntent> callback) {
    }
    
    /**
     * Retrieve a [PaymentIntent] asynchronously.
     *
     * See [Retrieve a PaymentIntent](https://stripe.com/docs/api/payment_intents/retrieve).
     * `GET /v1/payment_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void retrievePaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.PaymentIntent> callback) {
    }
    
    /**
     * Blocking method to retrieve a [PaymentIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Retrieve a PaymentIntent](https://stripe.com/docs/api/payment_intents/retrieve).
     * `GET /v1/payment_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @return a [PaymentIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.PaymentIntent retrievePaymentIntentSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to retrieve a [PaymentIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Retrieve a PaymentIntent](https://stripe.com/docs/api/payment_intents/retrieve).
     * `GET /v1/payment_intents/:id`
     *
     * @param clientSecret the client_secret with which to retrieve the [PaymentIntent]
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @return a [PaymentIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.PaymentIntent retrievePaymentIntentSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to confirm a [PaymentIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Confirm a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     * `POST /v1/payment_intents/:id/confirm`
     *
     * @param confirmPaymentIntentParams a set of params with which to confirm the PaymentIntent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [PaymentIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Deprecated()
    public final com.stripe.android.model.PaymentIntent confirmPaymentIntentSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to confirm a [PaymentIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Confirm a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm).
     * `POST /v1/payment_intents/:id/confirm`
     *
     * @param confirmPaymentIntentParams a set of params with which to confirm the PaymentIntent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [PaymentIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Deprecated()
    public final com.stripe.android.model.PaymentIntent confirmPaymentIntentSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Confirm and, if necessary, authenticate a [SetupIntent].
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void confirmSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [SetupIntent].
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void confirmSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [SetupIntent].
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void confirmSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams) {
    }
    
    /**
     * Confirm and, if necessary, authenticate a [SetupIntent].
     *
     * For confirmation attempts that require 3DS1 authentication, if the
     * [return_url](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-return_url)
     * in the confirmation request is not set (i.e. set to `null`), then the following logic will
     * be used:
     * - Use [Custom Tabs](https://developer.chrome.com/docs/android/custom-tabs/overview/) if they
     *  are supported on the device.
     * - If Custom Tabs are not supported, use Chrome if it is available on the device.
     * - Otherwise, use a WebView.
     *
     * If a custom `return_url` value is set, a WebView will always be used.
     *
     * |                   | Custom Tabs available? | Chrome available? | Fallback |
     * |-------------------|------------------------|-------------------|----------|
     * | No return_url     | Custom Tabs            | Chrome            | WebView  |
     * | Custom return_url | WebView                | WebView           | WebView  |
     *
     * @param fragment the `Fragment` that is launching the payment authentication flow
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void confirmSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Handle [next_action](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-next_action)
     * for a previously confirmed [SetupIntent]. Used for manual confirmation flow.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-client_secret)
     * property of a confirmed [SetupIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    /**
     * Handle [next_action](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-next_action)
     * for a previously confirmed [SetupIntent]. Used for manual confirmation flow.
     *
     * @param activity the `Activity` that is launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-client_secret)
     * property of a confirmed [SetupIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Handle [next_action](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-next_action)
     * for a previously confirmed [SetupIntent]. Used for manual confirmation flow.
     *
     * @param fragment the `Fragment` launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-client_secret)
     * property of a confirmed [SetupIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
    }
    
    /**
     * Handle [next_action](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-next_action)
     * for a previously confirmed [SetupIntent]. Used for manual confirmation flow.
     *
     * @param fragment the `Fragment` launching the payment authentication flow
     * @param clientSecret the [client_secret](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-client_secret)
     * property of a confirmed [SetupIntent] object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Check if the requestCode and [Intent] is for [SetupIntentResult].
     * The [Intent] should be retrieved from the result from `Activity#onActivityResult(int, int, Intent)}}`
     * by [Activity] started with [confirmSetupIntent].
     *
     * @return whether the requestCode and intent is for [SetupIntentResult].
     */
    public final boolean isSetupResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    /**
     * Should be called via `Activity#onActivityResult(int, int, Intent)}}` to handle the
     * result of a SetupIntent confirmation (see [confirmSetupIntent]).
     */
    @androidx.annotation.UiThread()
    public final boolean onSetupResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.SetupIntentResult> callback) {
        return false;
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
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final void retrieveSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.SetupIntent> callback) {
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
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final void retrieveSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.SetupIntent> callback) {
    }
    
    /**
     * Blocking method to retrieve a [SetupIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Retrieve a SetupIntent](https://stripe.com/docs/api/setup_intents/retrieve).
     * `GET /v1/setup_intents/:id`
     *
     * @param clientSecret client_secret of the [SetupIntent] to retrieve
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @return a [SetupIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.SetupIntent retrieveSetupIntentSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to retrieve a [SetupIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Retrieve a SetupIntent](https://stripe.com/docs/api/setup_intents/retrieve).
     * `GET /v1/setup_intents/:id`
     *
     * @param clientSecret client_secret of the [SetupIntent] to retrieve
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @return a [SetupIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.SetupIntent retrieveSetupIntentSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to confirm a [SetupIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Confirm a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     * `POST /v1/setup_intents/:id/confirm`
     *
     * @param confirmSetupIntentParams a set of params with which to confirm the Setup Intent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [SetupIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Deprecated()
    public final com.stripe.android.model.SetupIntent confirmSetupIntentSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to confirm a [SetupIntent] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Confirm a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm).
     * `POST /v1/setup_intents/:id/confirm`
     *
     * @param confirmSetupIntentParams a set of params with which to confirm the Setup Intent
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     *
     * @return a [SetupIntent] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Deprecated()
    public final com.stripe.android.model.SetupIntent confirmSetupIntentSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a [PaymentMethod] asynchronously.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams the [PaymentMethodCreateParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.PaymentMethod> callback) {
    }
    
    /**
     * Create a [PaymentMethod] asynchronously.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams the [PaymentMethodCreateParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.PaymentMethod> callback) {
    }
    
    /**
     * Create a [PaymentMethod] asynchronously.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams the [PaymentMethodCreateParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.PaymentMethod> callback) {
    }
    
    /**
     * Blocking method to create a [PaymentMethod] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams params with which to create the PaymentMethod
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentMethod] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.PaymentMethod createPaymentMethodSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to create a [PaymentMethod] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams params with which to create the PaymentMethod
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentMethod] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.PaymentMethod createPaymentMethodSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Blocking method to create a [PaymentMethod] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a PaymentMethod](https://stripe.com/docs/api/payment_methods/create).
     * `POST /v1/payment_methods`
     *
     * @param paymentMethodCreateParams params with which to create the PaymentMethod
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [PaymentMethod] or `null` if a problem occurred
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class})
    public final com.stripe.android.model.PaymentMethod createPaymentMethodSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException {
        return null;
    }
    
    /**
     * Authenticate a [Source] that requires user action via a redirect (i.e. [Source.flow] is
     * [Source.Flow.Redirect].
     *
     * The result of this operation will be returned via `Activity#onActivityResult(int, int, Intent)}}`
     *
     * @param activity the `Activity` that is launching the [Source] authentication flow
     * @param source the [Source] to confirm
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void authenticateSource(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source) {
    }
    
    /**
     * Authenticate a [Source] that requires user action via a redirect (i.e. [Source.flow] is
     * [Source.Flow.Redirect].
     *
     * The result of this operation will be returned via `Activity#onActivityResult(int, int, Intent)}}`
     *
     * @param activity the `Activity` that is launching the [Source] authentication flow
     * @param source the [Source] to confirm
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void authenticateSource(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Authenticate a [Source] that requires user action via a redirect (i.e. [Source.flow] is
     * [Source.Flow.Redirect].
     *
     * The result of this operation will be returned via `Activity#onActivityResult(int, int, Intent)}}`
     *
     * @param fragment the `Fragment` that is launching the [Source] authentication flow
     * @param source the [Source] to confirm
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void authenticateSource(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source) {
    }
    
    /**
     * Authenticate a [Source] that requires user action via a redirect (i.e. [Source.flow] is
     * [Source.Flow.Redirect].
     *
     * The result of this operation will be returned via `Activity#onActivityResult(int, int, Intent)}}`
     *
     * @param fragment the `Fragment` that is launching the [Source] authentication flow
     * @param source the [Source] to confirm
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @kotlin.jvm.JvmOverloads()
    public final void authenticateSource(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
    }
    
    /**
     * Check if the requestCode and [Intent] is for [Source] authentication.
     * The [Intent] should be retrieved from the result from `Activity#onActivityResult(int, int, Intent)}}`
     * by [Activity] started with [authenticateSource].
     *
     * @return whether the requestCode and intent is for [Source] authentication
     */
    public final boolean isAuthenticateSourceResult(int requestCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    /**
     * The result of a call to [authenticateSource].
     *
     * Use [isAuthenticateSourceResult] before calling this method.
     */
    public final void onAuthenticateSourceResult(@org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Create a [Source] asynchronously.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param sourceParams the [SourceParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Create a [Source] asynchronously.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param sourceParams the [SourceParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Create a [Source] asynchronously.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param sourceParams the [SourceParams] to be used
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Blocking method to create a [Source] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param params a set of [SourceParams] with which to create the source
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source], or `null` if a problem occurred
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Source createSourceSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams params) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Source] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param params a set of [SourceParams] with which to create the source
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source], or `null` if a problem occurred
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Source createSourceSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Source] object.
     * Do not call this on the UI thread or your app will crash.
     *
     * See [Create a source](https://stripe.com/docs/api/sources/create).
     * `POST /v1/sources`
     *
     * @param params a set of [SourceParams] with which to create the source
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source], or `null` if a problem occurred
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Source createSourceSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Retrieve a [Source] asynchronously.
     *
     * See [Retrieve a source](https://stripe.com/docs/api/sources/retrieve).
     * `GET /v1/sources/:id`
     *
     * @param sourceId the [Source.id] field of the desired Source object
     * @param clientSecret the [Source.clientSecret] field of the desired Source object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void retrieveSource(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Retrieve a [Source] asynchronously.
     *
     * See [Retrieve a source](https://stripe.com/docs/api/sources/retrieve).
     * `GET /v1/sources/:id`
     *
     * @param sourceId the [Source.id] field of the desired Source object
     * @param clientSecret the [Source.clientSecret] field of the desired Source object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @androidx.annotation.UiThread()
    @kotlin.jvm.JvmOverloads()
    public final void retrieveSource(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Source> callback) {
    }
    
    /**
     * Retrieve an existing [Source] from the Stripe API. Do not call this on the UI thread
     * or your app will crash.
     *
     * See [Retrieve a source](https://stripe.com/docs/api/sources/retrieve).
     * `GET /v1/sources/:id`
     *
     * @param sourceId the [Source.id] field of the desired Source object
     * @param clientSecret the [Source.clientSecret] field of the desired Source object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source] if one could be found based on the input params, or `null` if
     * no such Source could be found.
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Source retrieveSourceSynchronous(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Retrieve an existing [Source] from the Stripe API. Do not call this on the UI thread
     * or your app will crash.
     *
     * See [Retrieve a source](https://stripe.com/docs/api/sources/retrieve).
     * `GET /v1/sources/:id`
     *
     * @param sourceId the [Source.id] field of the desired Source object
     * @param clientSecret the [Source.clientSecret] field of the desired Source object
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Source] if one could be found based on the input params, or `null` if
     * no such Source could be found.
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Source retrieveSourceSynchronous(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a [Token] asynchronously.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams the [AccountParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a [Token] asynchronously.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams the [AccountParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a [Token] asynchronously.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams the [AccountParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Blocking method to create a [Token] for a Connect Account. Do not call this on the UI
     * thread or your app will crash.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams params to use for this token.
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this account.
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for a Connect Account. Do not call this on the UI
     * thread or your app will crash.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams params to use for this token.
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this account.
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for a Connect Account. Do not call this on the UI
     * thread or your app will crash.
     *
     * See [Create an account token](https://stripe.com/docs/api/tokens/create_account).
     * `POST /v1/tokens`
     *
     * @param accountParams params to use for this token.
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this account.
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams accountParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a [BankAccount] token asynchronously.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createBankAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a [BankAccount] token asynchronously.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createBankAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a [BankAccount] token asynchronously.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createBankAccountToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Blocking method to create a [Token] for a [BankAccount]. Do not call this on
     * the UI thread or your app will crash.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this [BankAccount]
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException should not be thrown with this type of token, but is theoretically
     * possible given the underlying methods called
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createBankAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for a [BankAccount]. Do not call this on
     * the UI thread or your app will crash.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this [BankAccount]
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException should not be thrown with this type of token, but is theoretically
     * possible given the underlying methods called
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createBankAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for a [BankAccount]. Do not call this on
     * the UI thread or your app will crash.
     *
     * See [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account).
     * `POST /v1/tokens`
     *
     * @param bankAccountTokenParams the [BankAccountTokenParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this [BankAccount]
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException should not be thrown with this type of token, but is theoretically
     * possible given the underlying methods called
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createBankAccountTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BankAccountTokenParams bankAccountTokenParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a PII token asynchronously.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal id used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPiiToken(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a PII token asynchronously.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal id used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPiiToken(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a PII token asynchronously.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal id used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPiiToken(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Blocking method to create a [Token] for PII. Do not call this on the UI thread
     * or your app will crash.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal ID to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPiiTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for PII. Do not call this on the UI thread
     * or your app will crash.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal ID to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPiiTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for PII. Do not call this on the UI thread
     * or your app will crash.
     *
     * See [Create a PII account token](https://stripe.com/docs/api/tokens/create_pii).
     * `POST /v1/tokens`
     *
     * @param personalId the personal ID to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPiiTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String personalId, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a Card token asynchronously.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] used to create this payment token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCardToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a Card token asynchronously.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] used to create this payment token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCardToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a Card token asynchronously.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] used to create this payment token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCardToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Blocking method to create a [Token]. Do not call this on the UI thread or your app
     * will crash.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException the card cannot be charged for some reason
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCardTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token]. Do not call this on the UI thread or your app
     * will crash.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException the card cannot be charged for some reason
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCardTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token]. Do not call this on the UI thread or your app
     * will crash.
     *
     * See [Create a card token](https://stripe.com/docs/api/tokens/create_card).
     * `POST /v1/tokens`
     *
     * @param cardParams the [CardParams] to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws CardException the card cannot be charged for some reason
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCardTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardParams cardParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Create a CVC update token asynchronously.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCvcUpdateToken(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 3L, max = 4L)
    java.lang.String cvc, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a CVC update token asynchronously.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCvcUpdateToken(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 3L, max = 4L)
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Create a CVC update token asynchronously.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC used to create this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createCvcUpdateToken(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 3L, max = 4L)
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * Blocking method to create a [Token] for CVC updating. Do not call this on the UI thread
     * or your app will crash.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCvcUpdateTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String cvc) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for CVC updating. Do not call this on the UI thread
     * or your app will crash.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCvcUpdateTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    /**
     * Blocking method to create a [Token] for CVC updating. Do not call this on the UI thread
     * or your app will crash.
     *
     * `POST /v1/tokens`
     *
     * @param cvc the CVC to use for this token
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     *
     * @return a [Token] that can be used for this card
     *
     * @throws AuthenticationException failure to properly authenticate yourself (check your key)
     * @throws InvalidRequestException your request has invalid parameters
     * @throws APIConnectionException failure to connect to Stripe's API
     * @throws APIException any other type of problem (for instance, a temporary issue with
     * Stripe's servers)
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createCvcUpdateTokenSynchronous(@org.jetbrains.annotations.NotNull()
    java.lang.String cvc, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
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
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPersonToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
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
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPersonToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
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
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createPersonToken(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
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
     * @return a [Token] representing the person
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPersonTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
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
     * @return a [Token] representing the person
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPersonTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
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
     * @return a [Token] representing the person
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    public final com.stripe.android.model.Token createPersonTokenSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PersonTokenParams params, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.core.exception.InvalidRequestException, com.stripe.android.core.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        return null;
    }
    
    private final void createToken(com.stripe.android.model.TokenParams tokenParams, java.lang.String stripeAccountId, java.lang.String idempotencyKey, com.stripe.android.ApiResultCallback<? super com.stripe.android.model.Token> callback) {
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) asynchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.StripeFile> callback) {
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) asynchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.StripeFile> callback) {
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) asynchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.StripeFile> callback) {
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) synchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    public final com.stripe.android.model.StripeFile createFileSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams) {
        return null;
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) synchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    public final com.stripe.android.model.StripeFile createFileSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey) {
        return null;
    }
    
    /**
     * [Create a file](https://stripe.com/docs/api/files/create) synchronously
     *
     * @param fileParams the [StripeFileParams] used to create the [StripeFile]
     * @param idempotencyKey optional, see [Idempotent Requests](https://stripe.com/docs/api/idempotent_requests)
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.WorkerThread()
    public final com.stripe.android.model.StripeFile createFileSynchronous(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.Nullable()
    java.lang.String idempotencyKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
        return null;
    }
    
    /**
     * Create a Radar Session asynchronously.
     *
     * [Stripe.advancedFraudSignalsEnabled] must be `true` to use this method.
     *
     * See the [Radar Session](https://stripe.com/docs/radar/radar-session) docs for more details.
     *
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createRadarSession(@org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.RadarSession> callback) {
    }
    
    /**
     * Create a Radar Session asynchronously.
     *
     * [Stripe.advancedFraudSignalsEnabled] must be `true` to use this method.
     *
     * See the [Radar Session](https://stripe.com/docs/radar/radar-session) docs for more details.
     *
     * @param stripeAccountId Optional, the Connect account to associate with this request.
     * By default, will use the Connect account that was used to instantiate the `Stripe` object, if specified.
     * @param callback a [ApiResultCallback] to receive the result or error
     */
    @kotlin.jvm.JvmOverloads()
    @androidx.annotation.UiThread()
    public final void createRadarSession(@org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.ApiResultCallback<? super com.stripe.android.model.RadarSession> callback) {
    }
    
    private final <T extends com.stripe.android.model.StripeModel>void executeAsync(com.stripe.android.ApiResultCallback<? super T> callback, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiMethod) {
    }
    
    private final <T extends com.stripe.android.model.StripeModel>java.lang.Object dispatchResult(java.lang.Object result, com.stripe.android.ApiResultCallback<? super T> callback, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Setter for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     */
    @org.jetbrains.annotations.Nullable()
    public static final com.stripe.android.AppInfo getAppInfo() {
        return null;
    }
    
    /**
     * Setter for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     */
    public static final void setAppInfo(@org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo p0) {
    }
    
    /**
     * [advancedFraudSignalsEnabled] determines whether additional device data is sent to Stripe
     * for fraud prevention. By default, this property is set to `true`.
     *
     * Disabling this setting will reduce Stripe's ability to protect your business from
     * fraudulent payments.
     *
     * For more details on the information we collect, visit
     * [https://stripe.com/docs/disputes/prevention/advanced-fraud-detection](https://stripe.com/docs/disputes/prevention/advanced-fraud-detection)
     */
    public static final boolean getAdvancedFraudSignalsEnabled() {
        return false;
    }
    
    /**
     * [advancedFraudSignalsEnabled] determines whether additional device data is sent to Stripe
     * for fraud prevention. By default, this property is set to `true`.
     *
     * Disabling this setting will reduce Stripe's ability to protect your business from
     * fraudulent payments.
     *
     * For more details on the information we collect, visit
     * [https://stripe.com/docs/disputes/prevention/advanced-fraud-detection](https://stripe.com/docs/disputes/prevention/advanced-fraud-detection)
     */
    public static final void setAdvancedFraudSignalsEnabled(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/Stripe$Companion;", "", "()V", "API_VERSION", "", "VERSION", "VERSION_NAME", "advancedFraudSignalsEnabled", "", "getAdvancedFraudSignalsEnabled$annotations", "getAdvancedFraudSignalsEnabled", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "appInfo", "Lcom/stripe/android/AppInfo;", "getAppInfo$annotations", "getAppInfo", "()Lcom/stripe/android/AppInfo;", "setAppInfo", "(Lcom/stripe/android/AppInfo;)V", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.AppInfo getAppInfo() {
            return null;
        }
        
        /**
         * Setter for identifying your plug-in or library.
         *
         * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
         */
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getAppInfo$annotations() {
        }
        
        public final void setAppInfo(@org.jetbrains.annotations.Nullable()
        com.stripe.android.AppInfo p0) {
        }
        
        public final boolean getAdvancedFraudSignalsEnabled() {
            return false;
        }
        
        /**
         * [advancedFraudSignalsEnabled] determines whether additional device data is sent to Stripe
         * for fraud prevention. By default, this property is set to `true`.
         *
         * Disabling this setting will reduce Stripe's ability to protect your business from
         * fraudulent payments.
         *
         * For more details on the information we collect, visit
         * [https://stripe.com/docs/disputes/prevention/advanced-fraud-detection](https://stripe.com/docs/disputes/prevention/advanced-fraud-detection)
         */
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getAdvancedFraudSignalsEnabled$annotations() {
        }
        
        public final void setAdvancedFraudSignalsEnabled(boolean p0) {
        }
    }
}