package com.example.dagger.di.viewmodels

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class DaggerViewModelFactoryModule {

    @Binds
    abstract fun bindsDaggerViewModelFactory(daggerViewModelFactory: DaggerViewModelFactory) : ViewModelProvider.Factory
}