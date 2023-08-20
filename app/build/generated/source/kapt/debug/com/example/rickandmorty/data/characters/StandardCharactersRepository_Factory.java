// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.data.characters;

import com.example.rickandmorty.data.characters.sources.CharactersSource;
import com.example.rickandmorty.data.episodes.sources.EpisodesSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StandardCharactersRepository_Factory implements Factory<StandardCharactersRepository> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<CharactersSource> charactersSourceProvider;

  private final Provider<EpisodesSource> episodesSourceProvider;

  public StandardCharactersRepository_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CharactersSource> charactersSourceProvider,
      Provider<EpisodesSource> episodesSourceProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.charactersSourceProvider = charactersSourceProvider;
    this.episodesSourceProvider = episodesSourceProvider;
  }

  @Override
  public StandardCharactersRepository get() {
    return newInstance(ioDispatcherProvider.get(), charactersSourceProvider.get(), episodesSourceProvider.get());
  }

  public static StandardCharactersRepository_Factory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CharactersSource> charactersSourceProvider,
      Provider<EpisodesSource> episodesSourceProvider) {
    return new StandardCharactersRepository_Factory(ioDispatcherProvider, charactersSourceProvider, episodesSourceProvider);
  }

  public static StandardCharactersRepository newInstance(CoroutineDispatcher ioDispatcher,
      CharactersSource charactersSource, EpisodesSource episodesSource) {
    return new StandardCharactersRepository(ioDispatcher, charactersSource, episodesSource);
  }
}