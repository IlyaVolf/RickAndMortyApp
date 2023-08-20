package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CharacterDetailedFragmentArgs(
  public val characterId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("characterId", this.characterId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("characterId", this.characterId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CharacterDetailedFragmentArgs {
      bundle.setClassLoader(CharacterDetailedFragmentArgs::class.java.classLoader)
      val __characterId : Int
      if (bundle.containsKey("characterId")) {
        __characterId = bundle.getInt("characterId")
      } else {
        throw IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailedFragmentArgs(__characterId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CharacterDetailedFragmentArgs {
      val __characterId : Int?
      if (savedStateHandle.contains("characterId")) {
        __characterId = savedStateHandle["characterId"]
        if (__characterId == null) {
          throw IllegalArgumentException("Argument \"characterId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailedFragmentArgs(__characterId)
    }
  }
}
