package com.example.rickandmorty.data.base.okhttp

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * All stuffs required for making HTTP-requests with OkHttp client and
 * for parsing JSON-messages.
 */
class OkHttpConfig @Inject constructor(
    val baseUrl: String,        // prefix for all endpoints
    val client: OkHttpClient,   // for making HTTP requests
    val gson: Gson              // for parsing JSON-messages
)