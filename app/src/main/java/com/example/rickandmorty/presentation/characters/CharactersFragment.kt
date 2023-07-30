package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import android.view.View
import android.widget.SearchView
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import androidx.fragment.app.viewModels
import com.example.rickandmorty.databinding.FragmentCharactersBinding
import com.example.rickandmorty.presentation.characters.list.CharactersAdapter
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.viewBinding
import com.example.rickandmorty.domain.entities.Character
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment(R.layout.fragment_characters) {

    private val viewModel by viewModels<CharactersViewModel>()
    private val binding by viewBinding<FragmentCharactersBinding>()

    private val onItemClick: (Character) -> Unit = { character ->
        /*val direction = AfficheFragmentDirections.actionAffichePostToAffichePostDetails(
            postTitle = affichePost.title.orEmpty(),
            postLink = affichePost.detailsLink.orEmpty()
        )
        findNavController().navigate(direction)*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = initAdapter()
        observeViewModel(adapter)
        initListeners()
    }

    private fun initAdapter(): CharactersAdapter {
        val adapter = CharactersAdapter(onItemClick)
        binding.charactersList.adapter = adapter
        return adapter
    }

    private fun observeViewModel(adapter: CharactersAdapter) {
        viewModel.charactersList.observe(viewLifecycleOwner) { holder ->
            when (holder) {
                is DataHolder.INIT -> {
                    setVisibility(false, View.VISIBLE, View.GONE, View.GONE)
                }
                is DataHolder.LOADING -> {
                    setVisibility(false, View.VISIBLE, View.GONE, View.GONE)
                }
                is DataHolder.REFRESH -> {
                    setVisibility(true, View.VISIBLE, View.GONE, View.GONE)
                }
                is DataHolder.READY -> {
                    setVisibility(false, View.GONE, View.VISIBLE, View.GONE)
                    adapter.setupItems(holder.data)
                }
                is DataHolder.ERROR -> {
                    setVisibility(true, View.GONE, View.GONE, View.VISIBLE)
                }
            }
        }
    }

    private fun initListeners() {
        initErrorViewListener()
        initSwipeRefreshLayoutListener()
        initSearchListener()
    }

    private fun initErrorViewListener() {
        binding.errorView.tryAgain.setOnClickListener {
            viewModel.tryAgain()
        }
    }

    private fun initSwipeRefreshLayoutListener() {
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.refresh()
        }
    }

    private fun initSearchListener() {
        binding.searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            // Called when the user submits the query.
            override fun onQueryTextSubmit(query: String): Boolean {
                binding.searchBar.clearFocus()
                return true
            }

            // Called when the query text is changed by the user.
            override fun onQueryTextChange(newText: String?): Boolean {
                viewModel.search = newText
                return true
            }
        })
    }

    private fun setVisibility(
        isRefreshing: Boolean,
        visibilityLoadingView: Int,
        visibilityContentView: Int,
        visibilityErrorView: Int
    ) {
        binding.swipeRefreshLayout.isRefreshing = isRefreshing
        binding.loadingView.root.visibility = visibilityLoadingView
        binding.contentView.visibility = visibilityContentView
        binding.errorView.root.visibility = visibilityErrorView
    }


}