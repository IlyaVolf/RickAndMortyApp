// Generated by Dagger (https://dagger.dev).
package com.example.rickandmorty.data.characters.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationMapper_Factory implements Factory<LocationMapper> {
  @Override
  public LocationMapper get() {
    return newInstance();
  }

  public static LocationMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LocationMapper newInstance() {
    return new LocationMapper();
  }

  private static final class InstanceHolder {
    private static final LocationMapper_Factory INSTANCE = new LocationMapper_Factory();
  }
}