// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.data.characters.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatusMapper_Factory implements Factory<StatusMapper> {
  @Override
  public StatusMapper get() {
    return newInstance();
  }

  public static StatusMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StatusMapper newInstance() {
    return new StatusMapper();
  }

  private static final class InstanceHolder {
    private static final StatusMapper_Factory INSTANCE = new StatusMapper_Factory();
  }
}