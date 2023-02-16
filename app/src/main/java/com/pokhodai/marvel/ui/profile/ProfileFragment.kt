package com.pokhodai.marvel.ui.profile

import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import com.pokhodai.marvel.R
import com.pokhodai.marvel.base.ui.fragments.BaseFragment
import com.pokhodai.marvel.databinding.FragmentProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment: BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {

    private val viewModel by viewModels<ProfileViewModel>()

    override fun onBackPressed() {
        navViewModel.onClickHardDeepLink("".toUri(), R.id.character_nav_graph)
    }
}