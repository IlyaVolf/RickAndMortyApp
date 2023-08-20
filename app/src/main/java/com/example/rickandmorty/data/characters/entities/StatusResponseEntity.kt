package com.example.rickandmorty.data.characters.entities

import com.google.gson.annotations.SerializedName

enum class StatusResponseEntity(val status: String) {
    @SerializedName("Alive")
    ALIVE("Alive"),

    @SerializedName("Dead")
    DEAD("Dead"),

    @SerializedName("unknown")
    UNKNOWN("unknown");

}