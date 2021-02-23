package com.core.kamaldagger.ui

import com.core.kamaldagger.data.local.DatabaseService
import com.core.kamaldagger.data.remote.NetworkService

class MainViewModel(var databaseService: DatabaseService?, var networkService: NetworkService?) {


    fun getSomeData(): String? {
        return databaseService!!.getDummayData() + " : " + networkService!!.getDummyData()
    }

}