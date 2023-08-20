package com.example.rickandmorty.data.characters.mappers

import com.example.rickandmorty.data.characters.entities.GenderResponseEntity
import com.example.rickandmorty.domain.entities.Gender
import javax.inject.Inject

class GenderMapper @Inject constructor() {

    fun toGender(genderResponseEntity: GenderResponseEntity): Gender {
        return when (genderResponseEntity) {
            GenderResponseEntity.MALE -> Gender.MALE
            GenderResponseEntity.FEMALE -> Gender.FEMALE
            GenderResponseEntity.GENDERLESS -> Gender.GENDERLESS
            GenderResponseEntity.UNKNOWN -> Gender.UNKNOWN
        }
    }

}