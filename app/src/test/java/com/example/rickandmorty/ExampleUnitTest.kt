package com.example.rickandmorty

import com.example.rickandmorty.data.base.RetrofitConfig
import com.example.rickandmorty.data.characters.sources.retrofit.CharactersApi
import com.example.rickandmorty.data.characters.sources.retrofit.RetrofitCharactersSource
import com.google.gson.Gson
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit4.MockKRule
import io.mockk.mockk
import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import retrofit2.Retrofit

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExperimentalCoroutinesApi
class ExampleUnitTest {

    @get:Rule
    val rule = MockKRule(this)

    @RelaxedMockK
    lateinit var charactersApi: CharactersApi

    private lateinit var retrofitCharactersSource: RetrofitCharactersSource

    @Before
    fun setUp() {
        retrofitCharactersSource = createRetrofitCharactersSource()
    }

    @Test
    fun getSomeCharacter() = runTest {
        val res = retrofitCharactersSource.getCharacter(12)
    }

    @Test
    fun coroutinesTest() = runTest {

        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope { // Создание coroutine scope
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope") // Эта строка будет выведена перед вложенным launch
        }

        println("Coroutine scope is over") // Эта строка не будет выведена пока не выполнится вложенный launch
    }

    private fun createRetrofitCharactersSource(
        retrofit: Retrofit = createRetrofit(),
        gson: Gson = createGson()
    ): RetrofitCharactersSource {
        val config = RetrofitConfig(
            retrofit = retrofit,
            gson = gson
        )
        return RetrofitCharactersSource(config)
    }

    private fun createRetrofit(): Retrofit {
        val retrofit = mockk<Retrofit>()
        every { retrofit.create(CharactersApi::class.java) } returns charactersApi
        return retrofit
    }

    private fun createGson(): Gson {
        return Gson()
    }

}