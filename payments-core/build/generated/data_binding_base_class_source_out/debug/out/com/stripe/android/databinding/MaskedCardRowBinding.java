// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R;
import com.stripe.android.view.MaskedCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MaskedCardRowBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final MaskedCardView maskedCardItem;

  private MaskedCardRowBinding(@NonNull FrameLayout rootView,
      @NonNull MaskedCardView maskedCardItem) {
    this.rootView = rootView;
    this.maskedCardItem = maskedCardItem;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MaskedCardRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MaskedCardRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.masked_card_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MaskedCardRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.masked_card_item;
      MaskedCardView maskedCardItem = ViewBindings.findChildViewById(rootView, id);
      if (maskedCardItem == null) {
        break missingId;
      }

      return new MaskedCardRowBinding((FrameLayout) rootView, maskedCardItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
