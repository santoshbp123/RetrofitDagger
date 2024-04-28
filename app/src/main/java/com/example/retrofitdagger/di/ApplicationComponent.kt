package com.example.retrofitdagger.di

import com.example.retrofitdagger.MainActivity
import dagger.Component
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject111(mainActivity: MainActivity)

}