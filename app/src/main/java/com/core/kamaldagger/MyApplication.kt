package com.core.kamaldagger

import android.app.Application
import com.core.kamaldagger.data.local.DatabaseService
import com.core.kamaldagger.data.remote.NetworkService
import com.core.kamaldagger.di.DependencyComponent

class MyApplication : Application() {

   lateinit var networkService : NetworkService
   lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        DependencyComponent.inject(this)
    }
}