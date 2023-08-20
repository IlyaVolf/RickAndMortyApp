package com.example.rickandmorty.data.characters.entities

import com.example.rickandmorty.domain.entities.Origin

data class OriginResponseEntity(
    val name: String,
    val url: String,
) {
    fun toOrigin(): Origin {
        return Origin(
            name = name,
            url = url
        )
    }
}