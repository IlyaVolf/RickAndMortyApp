package com.example.rickandmorty.data.base.retrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * All stuffs required for making HTTP-requests with Retrofit client and
 * for parsing JSON-messages.
 */
class RetrofitConfig @Inject constructor(
    val retrofit: Retrofit,
    val gson: Gson
)