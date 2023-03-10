// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.CardFormView;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CreateCardPaymentMethodActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CardFormView cardFormView;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final Button createButton;

  @NonNull
  public final RecyclerView paymentMethods;

  @NonNull
  public final LinearProgressIndicator progressBar;

  @NonNull
  public final Button toggleCardFormView;

  private CreateCardPaymentMethodActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CardFormView cardFormView, @NonNull CoordinatorLayout coordinator,
      @NonNull Button createButton, @NonNull RecyclerView paymentMethods,
      @NonNull LinearProgressIndicator progressBar, @NonNull Button toggleCardFormView) {
    this.rootView = rootView;
    this.cardFormView = cardFormView;
    this.coordinator = coordinator;
    this.createButton = createButton;
    this.paymentMethods = paymentMethods;
    this.progressBar = progressBar;
    this.toggleCardFormView = toggleCardFormView;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CreateCardPaymentMethodActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CreateCardPaymentMethodActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.create_card_payment_method_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CreateCardPaymentMethodActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_form_view;
      CardFormView cardFormView = ViewBindings.findChildViewById(rootView, id);
      if (cardFormView == null) {
        break missingId;
      }

      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.create_button;
      Button createButton = ViewBindings.findChildViewById(rootView, id);
      if (createButton == null) {
        break missingId;
      }

      id = R.id.payment_methods;
      RecyclerView paymentMethods = ViewBindings.findChildViewById(rootView, id);
      if (paymentMethods == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LinearProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.toggle_card_form_view;
      Button toggleCardFormView = ViewBindings.findChildViewById(rootView, id);
      if (toggleCardFormView == null) {
        break missingId;
      }

      return new CreateCardPaymentMethodActivityBinding((CoordinatorLayout) rootView, cardFormView,
          coordinator, createButton, paymentMethods, progressBar, toggleCardFormView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
