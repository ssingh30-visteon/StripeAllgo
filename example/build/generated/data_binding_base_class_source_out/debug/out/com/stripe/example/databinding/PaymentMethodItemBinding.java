// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PaymentMethodItemBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView brand;

  @NonNull
  public final CoordinatorLayout container;

  @NonNull
  public final TextView last4;

  @NonNull
  public final TextView paymentMethodId;

  private PaymentMethodItemBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView brand,
      @NonNull CoordinatorLayout container, @NonNull TextView last4,
      @NonNull TextView paymentMethodId) {
    this.rootView = rootView;
    this.brand = brand;
    this.container = container;
    this.last4 = last4;
    this.paymentMethodId = paymentMethodId;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PaymentMethodItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PaymentMethodItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.payment_method_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PaymentMethodItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.brand;
      TextView brand = ViewBindings.findChildViewById(rootView, id);
      if (brand == null) {
        break missingId;
      }

      CoordinatorLayout container = (CoordinatorLayout) rootView;

      id = R.id.last_4;
      TextView last4 = ViewBindings.findChildViewById(rootView, id);
      if (last4 == null) {
        break missingId;
      }

      id = R.id.payment_method_id;
      TextView paymentMethodId = ViewBindings.findChildViewById(rootView, id);
      if (paymentMethodId == null) {
        break missingId;
      }

      return new PaymentMethodItemBinding((CoordinatorLayout) rootView, brand, container, last4,
          paymentMethodId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
