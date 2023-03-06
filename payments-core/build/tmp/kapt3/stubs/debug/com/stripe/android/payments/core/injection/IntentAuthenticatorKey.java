package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * [MapKey] for the [IntentAuthenticatorMap], encapsulating the [NextActionData] class type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/core/injection/IntentAuthenticatorKey;", "", "value", "Lkotlin/reflect/KClass;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()Ljava/lang/Class;", "payments-core_debug"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION})
@dagger.MapKey()
public abstract @interface IntentAuthenticatorKey {
    
    public abstract java.lang.Class<? extends com.stripe.android.model.StripeIntent.NextActionData> value();
}