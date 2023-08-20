// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.presentation.characters;

import com.example.rickandmorty.data.CharactersRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CharactersViewModel_Factory implements Factory<CharactersViewModel> {
  private final Provider<CharactersRepository> charactersRepositoryProvider;

  public CharactersViewModel_Factory(Provider<CharactersRepository> charactersRepositoryProvider) {
    this.charactersRepositoryProvider = charactersRepositoryProvider;
  }

  @Override
  public CharactersViewModel get() {
    return newInstance(charactersRepositoryProvider.get());
  }

  public static CharactersViewModel_Factory create(
      Provider<CharactersRepository> charactersRepositoryProvider) {
    return new CharactersViewModel_Factory(charactersRepositoryProvider);
  }

  public static CharactersViewModel newInstance(CharactersRepository charactersRepository) {
    return new CharactersViewModel(charactersRepository);
  }
}
