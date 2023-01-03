package com.example.dagger.di

import com.example.dagger.dashboard.MainActivity
import com.example.dagger.di.viewmodels.ActivityScoped
import com.example.dagger.di.viewmodels.ViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class, ViewModelModule::class])
    @ActivityScoped
    abstract fun bindMainActivity(): MainActivity
}