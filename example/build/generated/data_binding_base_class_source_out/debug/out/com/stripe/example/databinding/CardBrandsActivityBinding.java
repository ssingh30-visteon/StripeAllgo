// Generated by view binder compiler. Do not edit!
package com.stripe.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardBrandsActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView cardBrands;

  private CardBrandsActivityBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView cardBrands) {
    this.rootView = rootView;
    this.cardBrands = cardBrands;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardBrandsActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardBrandsActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_brands_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardBrandsActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_brands;
      RecyclerView cardBrands = ViewBindings.findChildViewById(rootView, id);
      if (cardBrands == null) {
        break missingId;
      }

      return new CardBrandsActivityBinding((LinearLayout) rootView, cardBrands);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
