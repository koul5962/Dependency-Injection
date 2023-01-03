package com.example.dagger.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.dagger.R
import com.example.dagger.databinding.FragmentProfileBinding
import com.example.dagger.di.Injectable
import com.example.dagger.di.viewmodels.ActivityScoped
import com.example.dagger.di.viewmodels.DaggerViewModelFactory
import com.example.dagger.utils.StringCatalog
import com.example.dagger.viewmodels.HomeViewModel
import com.example.dagger.viewmodels.ProfileViewModel
import javax.inject.Inject

class ProfileFragment : Fragment(), Injectable {

    private lateinit var binding : FragmentProfileBinding

    @ActivityScoped
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val profileViewModel
            by viewModels<ProfileViewModel> { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSomething()
    }

    private fun doSomething() {
        binding.message.text = "${profileViewModel.getName()} ${getString(R.string.profile)}"
    }

}
