package com.example.rickandmorty.data.characters.entities

import com.example.rickandmorty.domain.entities.Location

data class LocationResponseEntity(
    val name: String,
    val url: String,
) {

    fun toLocation(): Location {
        return Location(
            name = name,
            url = url
        )
    }

}