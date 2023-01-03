package com.example.dagger.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.dagger.BaseActivity
import com.example.dagger.R
import com.example.dagger.databinding.ActivityMainBinding
import com.example.dagger.utils.StringCatalog
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : BaseActivity() {

    private lateinit var navController: NavController
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    @Inject
    lateinit var stringCatalog: StringCatalog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setToolbarTitle()
        setupBottomNavMenu()
    }

    private fun setupBottomNavMenu() {
        navController = findNavController(R.id.home_nav_host_fragment)
        NavigationUI.setupWithNavController(binding.bottomNavView, navController)
    }

    private fun setToolbarTitle() {
        supportActionBar?.title = stringCatalog.getString(R.string.app_name)
    }

}