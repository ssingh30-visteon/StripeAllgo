// Generated by view binder compiler. Do not edit!
package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.paymentsheet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutPaymentsheetAddNewPaymentMethodItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final TextView label;

  @NonNull
  public final ImageView plusIcon;

  private LayoutPaymentsheetAddNewPaymentMethodItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView card, @NonNull TextView label, @NonNull ImageView plusIcon) {
    this.rootView = rootView;
    this.card = card;
    this.label = label;
    this.plusIcon = plusIcon;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutPaymentsheetAddNewPaymentMethodItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutPaymentsheetAddNewPaymentMethodItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_paymentsheet_add_new_payment_method_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutPaymentsheetAddNewPaymentMethodItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.label;
      TextView label = ViewBindings.findChildViewById(rootView, id);
      if (label == null) {
        break missingId;
      }

      id = R.id.plus_icon;
      ImageView plusIcon = ViewBindings.findChildViewById(rootView, id);
      if (plusIcon == null) {
        break missingId;
      }

      return new LayoutPaymentsheetAddNewPaymentMethodItemBinding((ConstraintLayout) rootView, card,
          label, plusIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
