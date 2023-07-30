package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.rickandmorty.databinding.FragmentCharactersBinding
import com.example.rickandmorty.presentation.characters.list.CharactersAdapter
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.viewBinding
import com.example.rickandmorty.domain.entities.Character
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

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
        binding.launchesRecyclerView.adapter = adapter
        return adapter
    }

    private fun observeViewModel(adapter: CharactersAdapter) {
        viewModel.charactersList.observe(viewLifecycleOwner) { holder ->
            Log.d("BUGFIX", "$holder")
            when (holder) {
                is DataHolder.INIT -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.loadingView.root.visibility = View.VISIBLE
                    binding.contentView.visibility = View.GONE
                    binding.errorView.root.visibility = View.GONE
                }
                is DataHolder.LOADING -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.loadingView.root.visibility = View.VISIBLE
                    binding.contentView.visibility = View.GONE
                    binding.errorView.root.visibility = View.GONE
                }
                is DataHolder.REFRESH -> {
                    binding.swipeRefreshLayout.isRefreshing = true
                    binding.loadingView.root.visibility = View.GONE
                    binding.contentView.visibility = View.VISIBLE
                    binding.errorView.root.visibility = View.GONE
                }
                is DataHolder.READY -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.loadingView.root.visibility = View.GONE
                    binding.contentView.visibility = View.VISIBLE
                    binding.errorView.root.visibility = View.GONE

                    adapter.setupItems(holder.data)
                }
                is DataHolder.ERROR -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.loadingView.root.visibility = View.GONE
                    binding.contentView.visibility = View.GONE
                    binding.errorView.root.visibility = View.VISIBLE
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
        binding.errorView.veTryAgain.setOnClickListener {
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


}