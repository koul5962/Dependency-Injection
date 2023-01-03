package com.example.dagger.di

import android.app.Application
import android.content.Context
import com.example.dagger.utils.StringDummy
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun dummyString() = StringDummy()

    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }
}