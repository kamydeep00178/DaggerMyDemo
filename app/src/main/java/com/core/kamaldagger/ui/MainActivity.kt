package com.core.kamaldagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.solver.widgets.analyzer.Dependency
import com.core.kamaldagger.R
import com.core.kamaldagger.di.DependencyComponent

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DependencyComponent.inject(this)

        mainViewModel.getSomeData()
        Log.e("TAG", "onCreate: "+ mainViewModel.getSomeData())




    }
}