// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.BecsDebitMandateAcceptanceTextView;
import com.stripe.android.view.EmailEditText;
import com.stripe.android.view.StripeEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BecsDebitWidgetBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final BecsDebitAccountNumberEditText accountNumberEditText;

  @NonNull
  public final TextInputLayout accountNumberTextInputLayout;

  @NonNull
  public final BecsDebitBsbEditText bsbEditText;

  @NonNull
  public final TextInputLayout bsbTextInputLayout;

  @NonNull
  public final EmailEditText emailEditText;

  @NonNull
  public final TextInputLayout emailTextInputLayout;

  @NonNull
  public final BecsDebitMandateAcceptanceTextView mandateAcceptanceTextView;

  @NonNull
  public final StripeEditText nameEditText;

  @NonNull
  public final TextInputLayout nameTextInputLayout;

  private BecsDebitWidgetBinding(@NonNull View rootView,
      @NonNull BecsDebitAccountNumberEditText accountNumberEditText,
      @NonNull TextInputLayout accountNumberTextInputLayout,
      @NonNull BecsDebitBsbEditText bsbEditText, @NonNull TextInputLayout bsbTextInputLayout,
      @NonNull EmailEditText emailEditText, @NonNull TextInputLayout emailTextInputLayout,
      @NonNull BecsDebitMandateAcceptanceTextView mandateAcceptanceTextView,
      @NonNull StripeEditText nameEditText, @NonNull TextInputLayout nameTextInputLayout) {
    this.rootView = rootView;
    this.accountNumberEditText = accountNumberEditText;
    this.accountNumberTextInputLayout = accountNumberTextInputLayout;
    this.bsbEditText = bsbEditText;
    this.bsbTextInputLayout = bsbTextInputLayout;
    this.emailEditText = emailEditText;
    this.emailTextInputLayout = emailTextInputLayout;
    this.mandateAcceptanceTextView = mandateAcceptanceTextView;
    this.nameEditText = nameEditText;
    this.nameTextInputLayout = nameTextInputLayout;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static BecsDebitWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.becs_debit_widget, parent);
    return bind(parent);
  }

  @NonNull
  public static BecsDebitWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.account_number_edit_text;
      BecsDebitAccountNumberEditText accountNumberEditText = ViewBindings.findChildViewById(rootView, id);
      if (accountNumberEditText == null) {
        break missingId;
      }

      id = R.id.account_number_text_input_layout;
      TextInputLayout accountNumberTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (accountNumberTextInputLayout == null) {
        break missingId;
      }

      id = R.id.bsb_edit_text;
      BecsDebitBsbEditText bsbEditText = ViewBindings.findChildViewById(rootView, id);
      if (bsbEditText == null) {
        break missingId;
      }

      id = R.id.bsb_text_input_layout;
      TextInputLayout bsbTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (bsbTextInputLayout == null) {
        break missingId;
      }

      id = R.id.email_edit_text;
      EmailEditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.email_text_input_layout;
      TextInputLayout emailTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailTextInputLayout == null) {
        break missingId;
      }

      id = R.id.mandate_acceptance_text_view;
      BecsDebitMandateAcceptanceTextView mandateAcceptanceTextView = ViewBindings.findChildViewById(rootView, id);
      if (mandateAcceptanceTextView == null) {
        break missingId;
      }

      id = R.id.name_edit_text;
      StripeEditText nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.name_text_input_layout;
      TextInputLayout nameTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (nameTextInputLayout == null) {
        break missingId;
      }

      return new BecsDebitWidgetBinding(rootView, accountNumberEditText,
          accountNumberTextInputLayout, bsbEditText, bsbTextInputLayout, emailEditText,
          emailTextInputLayout, mandateAcceptanceTextView, nameEditText, nameTextInputLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}