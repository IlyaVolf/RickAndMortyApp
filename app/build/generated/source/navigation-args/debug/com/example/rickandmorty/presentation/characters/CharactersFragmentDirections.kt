package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.rickandmorty.R
import kotlin.Int

public class CharactersFragmentDirections private constructor() {
  private data class ActionCharactersFragmentToCharacterDetailedFragment(
    public val characterId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_charactersFragment_to_characterDetailedFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("characterId", this.characterId)
        return result
      }
  }

  public companion object {
    public fun actionCharactersFragmentToCharacterDetailedFragment(characterId: Int): NavDirections
        = ActionCharactersFragmentToCharacterDetailedFragment(characterId)
  }
}
