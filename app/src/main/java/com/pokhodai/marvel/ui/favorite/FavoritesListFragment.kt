package com.pokhodai.marvel.ui.favorite

import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import com.pokhodai.marvel.R
import com.pokhodai.marvel.base.ui.fragments.BaseFragment
import com.pokhodai.marvel.databinding.FragmentListFavoritesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoritesListFragment :
    BaseFragment<FragmentListFavoritesBinding>(FragmentListFavoritesBinding::inflate) {

    private val viewModel by viewModels<FavoritesListViewModel>()

    override fun onBackPressed() {
        navViewModel.onClickHardDeepLink("".toUri(), R.id.character_nav_graph)
    }
}