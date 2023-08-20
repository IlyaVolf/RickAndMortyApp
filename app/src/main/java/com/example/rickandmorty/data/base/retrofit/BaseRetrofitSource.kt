package com.example.rickandmorty.data.base.retrofit

import com.example.rickandmorty.domain.AppException
import com.example.rickandmorty.domain.BackendException
import com.example.rickandmorty.domain.ConnectionException
import com.example.rickandmorty.domain.ParseBackendResponseException
import com.google.gson.Gson
import com.google.gson.JsonIOException
import com.google.gson.JsonParseException
import com.google.gson.JsonSyntaxException
import retrofit2.HttpException
import retrofit2.Retrofit
import java.io.IOException
import javax.inject.Inject

open class BaseRetrofitSource @Inject constructor(
    retrofitConfig: RetrofitConfig
) {

    val retrofit: Retrofit = retrofitConfig.retrofit

    private val gson: Gson = retrofitConfig.gson
    private val errorAdapter = gson.getAdapter(ErrorResponseBody::class.java)

    /**
     * Map network and parse exceptions into in-app exceptions.
     * @throws BackendException
     * @throws ParseBackendResponseException
     * @throws ConnectionException
     */
    suspend fun <T> wrapRetrofitExceptions(block: suspend () -> T): T {
        return try {
            block()
        } catch (e: AppException) {
            throw e
            // gson
        } catch (e: JsonSyntaxException) {
            throw ParseBackendResponseException(e)
            // retrofit
        } catch (e: JsonIOException) {
            throw ParseBackendResponseException(e)
            // retrofit
        } catch (e: JsonParseException) {
            throw ParseBackendResponseException(e)
        } catch (e: HttpException) {
            throw createBackendException(e)
            // mostly retrofit
        } catch (e: IOException) {
            throw ConnectionException(e)
        }
    }

    private fun createBackendException(e: HttpException): Exception {
        return try {
            val errorBody: ErrorResponseBody = errorAdapter.fromJson(
                e.response()!!.errorBody()!!.string()
            )!!
            BackendException(e.code(), errorBody.error)
        } catch (e: Exception) {
            throw ParseBackendResponseException(e)
        }
    }

    class ErrorResponseBody(
        val error: String
    )


}