// Generated by view binder compiler. Do not edit!
package com.example.rickandmorty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rickandmorty.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCharacterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView characterName;

  @NonNull
  public final ImageView characterPicture;

  private ItemCharacterBinding(@NonNull LinearLayout rootView, @NonNull TextView characterName,
      @NonNull ImageView characterPicture) {
    this.rootView = rootView;
    this.characterName = characterName;
    this.characterPicture = characterPicture;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_character, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCharacterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.characterName;
      TextView characterName = ViewBindings.findChildViewById(rootView, id);
      if (characterName == null) {
        break missingId;
      }

      id = R.id.characterPicture;
      ImageView characterPicture = ViewBindings.findChildViewById(rootView, id);
      if (characterPicture == null) {
        break missingId;
      }

      return new ItemCharacterBinding((LinearLayout) rootView, characterName, characterPicture);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}