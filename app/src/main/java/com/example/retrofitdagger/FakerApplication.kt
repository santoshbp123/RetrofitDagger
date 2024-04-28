package com.example.retrofitdagger

import android.app.Application
import com.example.retrofitdagger.di.ApplicationComponent
import com.example.retrofitdagger.di.DaggerApplicationComponent


class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}