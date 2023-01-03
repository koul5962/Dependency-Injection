package com.example.dagger.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.dagger.R
import com.example.dagger.databinding.FragmentHomeBinding
import com.example.dagger.di.Injectable
import com.example.dagger.di.viewmodels.ActivityScoped
import com.example.dagger.di.viewmodels.DaggerViewModelFactory
import com.example.dagger.utils.StringCatalog
import com.example.dagger.utils.StringDummy
import com.example.dagger.viewmodels.HomeViewModel
import javax.inject.Inject

class HomeFragment : Fragment(), Injectable {

    private lateinit var binding : FragmentHomeBinding

    @ActivityScoped
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val homeViewModel
            by viewModels<HomeViewModel> { viewModelFactory }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSomething()
    }

    private fun doSomething() {
        binding.message.text = "${homeViewModel.getName()} ${getString(R.string.home)}"
    }
}
