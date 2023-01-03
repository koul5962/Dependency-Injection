package com.example.dagger.di

import com.example.dagger.dashboard.HomeFragment
import com.example.dagger.dashboard.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindsHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun bindsProfileFragment(): ProfileFragment
}