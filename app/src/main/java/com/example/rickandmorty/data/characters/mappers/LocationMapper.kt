package com.example.rickandmorty.data.characters.mappers

import com.example.rickandmorty.data.characters.entities.LocationResponseEntity
import com.example.rickandmorty.domain.entities.Location
import javax.inject.Inject

class LocationMapper @Inject constructor() {

    fun toLocation(locationResponseEntity: LocationResponseEntity): Location {
        return Location(
            name = locationResponseEntity.name,
            url = locationResponseEntity.url
        )
    }

}