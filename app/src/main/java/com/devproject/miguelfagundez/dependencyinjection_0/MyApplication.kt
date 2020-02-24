package com.devproject.miguelfagundez.dependencyinjection_0

import android.app.Application
import com.devproject.miguelfagundez.dependencyinjection_0.di.DependencyComponent
import com.devproject.miguelfagundez.dependencyinjection_0.model.DBService
import com.devproject.miguelfagundez.dependencyinjection_0.network.NetworkService

class MyApplication : Application() {

    // Expensive Services
    // I would like to create only once
    // Singlenton class can be also used
    lateinit var networkServices : NetworkService
    lateinit var dbService : DBService

    override fun onCreate() {
        super.onCreate()
        DependencyComponent.inject(this)
    }

}