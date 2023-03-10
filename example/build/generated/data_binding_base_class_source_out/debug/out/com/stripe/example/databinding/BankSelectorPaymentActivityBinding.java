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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BankSelectorPaymentActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView bankInfo;

  @NonNull
  public final TextView paymentMethodResult;

  @NonNull
  public final Button selectPaymentMethodButton;

  private BankSelectorPaymentActivityBinding(@NonNull LinearLayout rootView,
      @NonNull TextView bankInfo, @NonNull TextView paymentMethodResult,
      @NonNull Button selectPaymentMethodButton) {
    this.rootView = rootView;
    this.bankInfo = bankInfo;
    this.paymentMethodResult = paymentMethodResult;
    this.selectPaymentMethodButton = selectPaymentMethodButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BankSelectorPaymentActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BankSelectorPaymentActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bank_selector_payment_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BankSelectorPaymentActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bank_info;
      TextView bankInfo = ViewBindings.findChildViewById(rootView, id);
      if (bankInfo == null) {
        break missingId;
      }

      id = R.id.payment_method_result;
      TextView paymentMethodResult = ViewBindings.findChildViewById(rootView, id);
      if (paymentMethodResult == null) {
        break missingId;
      }

      id = R.id.select_payment_method_button;
      Button selectPaymentMethodButton = ViewBindings.findChildViewById(rootView, id);
      if (selectPaymentMethodButton == null) {
        break missingId;
      }

      return new BankSelectorPaymentActivityBinding((LinearLayout) rootView, bankInfo,
          paymentMethodResult, selectPaymentMethodButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
