package com.devproject.miguelfagundez.dependencyinjection_0.di

import android.app.Application
import com.devproject.miguelfagundez.dependencyinjection_0.MyApplication
import com.devproject.miguelfagundez.dependencyinjection_0.model.DBService
import com.devproject.miguelfagundez.dependencyinjection_0.network.NetworkService
import com.devproject.miguelfagundez.dependencyinjection_0.ui.MainActivity
import com.devproject.miguelfagundez.dependencyinjection_0.viewmodel.MainViewModel

//Create the injection class (Using Singlenton pattern - object kotlin)
// This create only one instance
object DependencyComponent {

    // Inject into My Application
    fun inject(application : MyApplication) {
        application.networkServices = NetworkService(application,"abcdefghijklmnopqrstuvwxyz")
        application.dbService = DBService(application,"myDatabaseName", 1)
    }

    // Inject into Main Activity
    fun inject(activity: MainActivity){
        var application : MyApplication = activity.application as MyApplication
        activity.viewModel = MainViewModel(application.dbService, application.networkServices)
    }
}