// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.CardInputWidget;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CreateCardTokenActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CardInputWidget cardInputWidget;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final Button createTokenButton;

  @NonNull
  public final TextView paymentFormTitle;

  @NonNull
  public final LinearProgressIndicator progressBar;

  @NonNull
  public final TextView tokenListTitle;

  @NonNull
  public final RecyclerView tokensList;

  private CreateCardTokenActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CardInputWidget cardInputWidget, @NonNull CoordinatorLayout coordinator,
      @NonNull Button createTokenButton, @NonNull TextView paymentFormTitle,
      @NonNull LinearProgressIndicator progressBar, @NonNull TextView tokenListTitle,
      @NonNull RecyclerView tokensList) {
    this.rootView = rootView;
    this.cardInputWidget = cardInputWidget;
    this.coordinator = coordinator;
    this.createTokenButton = createTokenButton;
    this.paymentFormTitle = paymentFormTitle;
    this.progressBar = progressBar;
    this.tokenListTitle = tokenListTitle;
    this.tokensList = tokensList;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CreateCardTokenActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CreateCardTokenActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.create_card_token_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CreateCardTokenActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_input_widget;
      CardInputWidget cardInputWidget = ViewBindings.findChildViewById(rootView, id);
      if (cardInputWidget == null) {
        break missingId;
      }

      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.create_token_button;
      Button createTokenButton = ViewBindings.findChildViewById(rootView, id);
      if (createTokenButton == null) {
        break missingId;
      }

      id = R.id.payment_form_title;
      TextView paymentFormTitle = ViewBindings.findChildViewById(rootView, id);
      if (paymentFormTitle == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LinearProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.token_list_title;
      TextView tokenListTitle = ViewBindings.findChildViewById(rootView, id);
      if (tokenListTitle == null) {
        break missingId;
      }

      id = R.id.tokens_list;
      RecyclerView tokensList = ViewBindings.findChildViewById(rootView, id);
      if (tokensList == null) {
        break missingId;
      }

      return new CreateCardTokenActivityBinding((CoordinatorLayout) rootView, cardInputWidget,
          coordinator, createTokenButton, paymentFormTitle, progressBar, tokenListTitle,
          tokensList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
