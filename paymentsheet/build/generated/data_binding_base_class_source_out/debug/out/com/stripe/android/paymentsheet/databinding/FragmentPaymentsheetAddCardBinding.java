// Generated by view binder compiler. Do not edit!
package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.CardMultilineWidget;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPaymentsheetAddCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BillingAddressView billingAddress;

  @NonNull
  public final TextView billingAddressLabel;

  @NonNull
  public final TextView billingErrors;

  @NonNull
  public final Space bottomSpace;

  @NonNull
  public final TextView cardErrors;

  @NonNull
  public final TextView cardInfoLabel;

  @NonNull
  public final CardMultilineWidget cardMultilineWidget;

  @NonNull
  public final MaterialCardView cardMultilineWidgetContainer;

  @NonNull
  public final MaterialCheckBox saveCardCheckbox;

  private FragmentPaymentsheetAddCardBinding(@NonNull ConstraintLayout rootView,
      @NonNull BillingAddressView billingAddress, @NonNull TextView billingAddressLabel,
      @NonNull TextView billingErrors, @NonNull Space bottomSpace, @NonNull TextView cardErrors,
      @NonNull TextView cardInfoLabel, @NonNull CardMultilineWidget cardMultilineWidget,
      @NonNull MaterialCardView cardMultilineWidgetContainer,
      @NonNull MaterialCheckBox saveCardCheckbox) {
    this.rootView = rootView;
    this.billingAddress = billingAddress;
    this.billingAddressLabel = billingAddressLabel;
    this.billingErrors = billingErrors;
    this.bottomSpace = bottomSpace;
    this.cardErrors = cardErrors;
    this.cardInfoLabel = cardInfoLabel;
    this.cardMultilineWidget = cardMultilineWidget;
    this.cardMultilineWidgetContainer = cardMultilineWidgetContainer;
    this.saveCardCheckbox = saveCardCheckbox;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPaymentsheetAddCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPaymentsheetAddCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_paymentsheet_add_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPaymentsheetAddCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.billing_address;
      BillingAddressView billingAddress = ViewBindings.findChildViewById(rootView, id);
      if (billingAddress == null) {
        break missingId;
      }

      id = R.id.billing_address_label;
      TextView billingAddressLabel = ViewBindings.findChildViewById(rootView, id);
      if (billingAddressLabel == null) {
        break missingId;
      }

      id = R.id.billing_errors;
      TextView billingErrors = ViewBindings.findChildViewById(rootView, id);
      if (billingErrors == null) {
        break missingId;
      }

      id = R.id.bottom_space;
      Space bottomSpace = ViewBindings.findChildViewById(rootView, id);
      if (bottomSpace == null) {
        break missingId;
      }

      id = R.id.card_errors;
      TextView cardErrors = ViewBindings.findChildViewById(rootView, id);
      if (cardErrors == null) {
        break missingId;
      }

      id = R.id.card_info_label;
      TextView cardInfoLabel = ViewBindings.findChildViewById(rootView, id);
      if (cardInfoLabel == null) {
        break missingId;
      }

      id = R.id.card_multiline_widget;
      CardMultilineWidget cardMultilineWidget = ViewBindings.findChildViewById(rootView, id);
      if (cardMultilineWidget == null) {
        break missingId;
      }

      id = R.id.card_multiline_widget_container;
      MaterialCardView cardMultilineWidgetContainer = ViewBindings.findChildViewById(rootView, id);
      if (cardMultilineWidgetContainer == null) {
        break missingId;
      }

      id = R.id.save_card_checkbox;
      MaterialCheckBox saveCardCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (saveCardCheckbox == null) {
        break missingId;
      }

      return new FragmentPaymentsheetAddCardBinding((ConstraintLayout) rootView, billingAddress,
          billingAddressLabel, billingErrors, bottomSpace, cardErrors, cardInfoLabel,
          cardMultilineWidget, cardMultilineWidgetContainer, saveCardCheckbox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
