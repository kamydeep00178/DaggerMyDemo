package com.core.kamaldagger.di

import android.app.Activity
import com.core.kamaldagger.MyApplication
import com.core.kamaldagger.data.local.DatabaseService
import com.core.kamaldagger.data.remote.NetworkService
import com.core.kamaldagger.ui.MainActivity
import com.core.kamaldagger.ui.MainViewModel

class DependencyComponent {

    companion object
    {
        fun inject(myApplication: MyApplication)
        {
             myApplication.networkService = NetworkService(myApplication,"kamal")
             myApplication.databaseService= DatabaseService(myApplication,"duummy_db",1)
        }

        fun inject(myActivity: MainActivity)
        {
             val  myApplication : MyApplication = myActivity.application as MyApplication
             myActivity.mainViewModel= MainViewModel(myApplication.databaseService,myApplication.networkService)
        }
    }
}