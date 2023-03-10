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
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.example.R;
import com.stripe.example.activity.GooglePayButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GooglePayActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final GooglePayButton googlePayButton;

  @NonNull
  public final TextView googlePayResult;

  @NonNull
  public final LinearProgressIndicator progressBar;

  private GooglePayActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout coordinator, @NonNull GooglePayButton googlePayButton,
      @NonNull TextView googlePayResult, @NonNull LinearProgressIndicator progressBar) {
    this.rootView = rootView;
    this.coordinator = coordinator;
    this.googlePayButton = googlePayButton;
    this.googlePayResult = googlePayResult;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GooglePayActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GooglePayActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.google_pay_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GooglePayActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.google_pay_button;
      GooglePayButton googlePayButton = ViewBindings.findChildViewById(rootView, id);
      if (googlePayButton == null) {
        break missingId;
      }

      id = R.id.google_pay_result;
      TextView googlePayResult = ViewBindings.findChildViewById(rootView, id);
      if (googlePayResult == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LinearProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new GooglePayActivityBinding((CoordinatorLayout) rootView, coordinator,
          googlePayButton, googlePayResult, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
