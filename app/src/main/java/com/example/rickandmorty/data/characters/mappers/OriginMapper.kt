package com.example.rickandmorty.data.characters.mappers

import com.example.rickandmorty.data.characters.entities.OriginResponseEntity
import com.example.rickandmorty.domain.entities.Origin
import javax.inject.Inject

class OriginMapper @Inject constructor() {

    fun toOrigin(originResponseEntity: OriginResponseEntity): Origin {
        return Origin(
            name = originResponseEntity.name,
            url = originResponseEntity.url
        )
    }

}