package com.devproject.miguelfagundez.dependencyinjection_0.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devproject.miguelfagundez.dependencyinjection_0.R
import com.devproject.miguelfagundez.dependencyinjection_0.di.DependencyComponent
import com.devproject.miguelfagundez.dependencyinjection_0.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

// MainActivity: view
class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DependencyComponent.inject(this)

        // Tested using the data from dummy database
        //tv_show_data.text = viewModel.findSomeDBData()
        // Tested using the data from dummy webservice
        tv_show_data.text = viewModel.findSomeNetworkData()
    }
}
