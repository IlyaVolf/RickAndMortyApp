package com.example.rickandmorty.data.characters.entities

import com.google.gson.annotations.SerializedName

enum class GenderResponseEntity(val gender: String) {
    @SerializedName("Male")
    MALE("Male"),

    @SerializedName("Female")
    FEMALE("Female"),

    @SerializedName("Genderless")
    GENDERLESS("Genderless"),

    @SerializedName("unknown")
    UNKNOWN("unknown");

}