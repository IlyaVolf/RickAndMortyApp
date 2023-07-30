package com.example.rickandmorty.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.rickandmorty.R
import com.example.rickandmorty.presentation.characters.CharactersFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val charactersFragment = CharactersFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, charactersFragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }

}