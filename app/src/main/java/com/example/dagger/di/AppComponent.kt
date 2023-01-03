package com.example.dagger.di

import android.app.Application
import android.content.Context
import com.example.dagger.AppController
import com.example.dagger.utils.StringCatalog
import com.example.dagger.utils.StringDummy
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuilderModule::class
])
interface AppComponent {

    fun inject(appController: AppController)

    fun stringDummy() : StringDummy

    fun stringCatalog() : StringCatalog

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}