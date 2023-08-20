package com.example.rickandmorty.utils

fun extractIdFromUrl(url: String): Int {
    return url.split("/").last().toInt()
}