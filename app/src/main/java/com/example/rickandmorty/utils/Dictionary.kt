package com.example.rickandmorty.utils

import com.example.rickandmorty.R
import com.example.rickandmorty.domain.entities.Gender
import com.example.rickandmorty.domain.entities.Status
import com.example.rickandmorty.utils.ResourcesUtils.getString

fun Gender.getResourceString(): String {
    return when (this) {
        Gender.MALE -> getString(R.string.male)
        Gender.FEMALE -> getString(R.string.female)
        Gender.GENDERLESS -> getString(R.string.genderless)
        Gender.UNKNOWN -> getString(R.string.unknown)
    }
}

fun Status.getResourceString(): String {
    return when (this) {
        Status.ALIVE -> getString(R.string.alive)
        Status.DEAD -> getString(R.string.dead)
        Status.UNKNOWN -> getString(R.string.unknown)
    }
}