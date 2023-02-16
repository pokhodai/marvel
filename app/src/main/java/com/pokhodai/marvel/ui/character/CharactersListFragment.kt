package com.pokhodai.marvel.ui.character

import androidx.fragment.app.viewModels
import com.pokhodai.marvel.base.ui.fragments.BaseFragment
import com.pokhodai.marvel.databinding.FragmentListCharactersBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersListFragment :
    BaseFragment<FragmentListCharactersBinding>(FragmentListCharactersBinding::inflate) {

    private val viewModel by viewModels<CharactersListViewModel>()

    override fun onBackPressed() {
        requireActivity().finishAndRemoveTask()
    }
}