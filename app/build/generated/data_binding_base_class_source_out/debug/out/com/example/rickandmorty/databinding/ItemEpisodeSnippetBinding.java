// Generated by view binder compiler. Do not edit!
package com.example.rickandmorty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemEpisodeSnippetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView episodeEpisode;

  @NonNull
  public final TextView episodeName;

  private ItemEpisodeSnippetBinding(@NonNull LinearLayout rootView,
      @NonNull TextView episodeEpisode, @NonNull TextView episodeName) {
    this.rootView = rootView;
    this.episodeEpisode = episodeEpisode;
    this.episodeName = episodeName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEpisodeSnippetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEpisodeSnippetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_episode_snippet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEpisodeSnippetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.episodeEpisode;
      TextView episodeEpisode = ViewBindings.findChildViewById(rootView, id);
      if (episodeEpisode == null) {
        break missingId;
      }

      id = R.id.episodeName;
      TextView episodeName = ViewBindings.findChildViewById(rootView, id);
      if (episodeName == null) {
        break missingId;
      }

      return new ItemEpisodeSnippetBinding((LinearLayout) rootView, episodeEpisode, episodeName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
