// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomerSessionActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final LinearLayout llOutputLayoutAcs;

  @NonNull
  public final TextView paymentMethod;

  @NonNull
  public final LinearProgressIndicator progressBar;

  @NonNull
  public final Button selectPaymentMethodButton;

  private CustomerSessionActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout coordinator, @NonNull LinearLayout llOutputLayoutAcs,
      @NonNull TextView paymentMethod, @NonNull LinearProgressIndicator progressBar,
      @NonNull Button selectPaymentMethodButton) {
    this.rootView = rootView;
    this.coordinator = coordinator;
    this.llOutputLayoutAcs = llOutputLayoutAcs;
    this.paymentMethod = paymentMethod;
    this.progressBar = progressBar;
    this.selectPaymentMethodButton = selectPaymentMethodButton;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomerSessionActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomerSessionActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.customer_session_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomerSessionActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.ll_output_layout_acs;
      LinearLayout llOutputLayoutAcs = ViewBindings.findChildViewById(rootView, id);
      if (llOutputLayoutAcs == null) {
        break missingId;
      }

      id = R.id.payment_method;
      TextView paymentMethod = ViewBindings.findChildViewById(rootView, id);
      if (paymentMethod == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LinearProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.select_payment_method_button;
      Button selectPaymentMethodButton = ViewBindings.findChildViewById(rootView, id);
      if (selectPaymentMethodButton == null) {
        break missingId;
      }

      return new CustomerSessionActivityBinding((CoordinatorLayout) rootView, coordinator,
          llOutputLayoutAcs, paymentMethod, progressBar, selectPaymentMethodButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
