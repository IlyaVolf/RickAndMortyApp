// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineDispatcherModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final CoroutineDispatcherModule module;

  public CoroutineDispatcherModule_ProvidesIoDispatcherFactory(CoroutineDispatcherModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return providesIoDispatcher(module);
  }

  public static CoroutineDispatcherModule_ProvidesIoDispatcherFactory create(
      CoroutineDispatcherModule module) {
    return new CoroutineDispatcherModule_ProvidesIoDispatcherFactory(module);
  }

  public static CoroutineDispatcher providesIoDispatcher(CoroutineDispatcherModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesIoDispatcher());
  }
}
