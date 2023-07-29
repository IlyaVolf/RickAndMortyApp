package com.example.rickandmorty.data.characters.mappers

import com.example.rickandmorty.data.characters.entities.StatusResponseEntity
import com.example.rickandmorty.domain.entities.Status
import javax.inject.Inject

class StatusMapper @Inject constructor() {

    fun toStatus(statusResponseEntity: StatusResponseEntity): Status {
        return when (statusResponseEntity) {
            StatusResponseEntity.ALIVE -> Status.ALIVE
            StatusResponseEntity.DEAD -> Status.DEAD
            StatusResponseEntity.UNKNOWN -> Status.UNKNOWN
        }
    }

}