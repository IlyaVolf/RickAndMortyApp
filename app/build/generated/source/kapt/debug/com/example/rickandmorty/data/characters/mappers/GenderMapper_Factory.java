// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.data.characters.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GenderMapper_Factory implements Factory<GenderMapper> {
  @Override
  public GenderMapper get() {
    return newInstance();
  }

  public static GenderMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GenderMapper newInstance() {
    return new GenderMapper();
  }

  private static final class InstanceHolder {
    private static final GenderMapper_Factory INSTANCE = new GenderMapper_Factory();
  }
}
