// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.data.episodes.sources;

import com.example.rickandmorty.data.base.okhttp.OkHttpConfig;
import com.example.rickandmorty.data.episodes.mappers.EpisodeMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OkHttpEpisodesSource_Factory implements Factory<OkHttpEpisodesSource> {
  private final Provider<OkHttpConfig> configProvider;

  private final Provider<EpisodeMapper> episodeMapperProvider;

  public OkHttpEpisodesSource_Factory(Provider<OkHttpConfig> configProvider,
      Provider<EpisodeMapper> episodeMapperProvider) {
    this.configProvider = configProvider;
    this.episodeMapperProvider = episodeMapperProvider;
  }

  @Override
  public OkHttpEpisodesSource get() {
    return newInstance(configProvider.get(), episodeMapperProvider.get());
  }

  public static OkHttpEpisodesSource_Factory create(Provider<OkHttpConfig> configProvider,
      Provider<EpisodeMapper> episodeMapperProvider) {
    return new OkHttpEpisodesSource_Factory(configProvider, episodeMapperProvider);
  }

  public static OkHttpEpisodesSource newInstance(OkHttpConfig config, EpisodeMapper episodeMapper) {
    return new OkHttpEpisodesSource(config, episodeMapper);
  }
}