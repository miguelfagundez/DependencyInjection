package com.devproject.miguelfagundez.dependencyinjection_0.viewmodel

import com.devproject.miguelfagundez.dependencyinjection_0.model.DBService
import com.devproject.miguelfagundez.dependencyinjection_0.network.NetworkService
import com.devproject.miguelfagundez.dependencyinjection_0.utils.Utils

// MainViewModel: Connecting View with model
class MainViewModel(var dbService: DBService, var networkService: NetworkService) {


    fun findSomeNetworkData(): String {
        return networkService.getData(Utils.BASE_URL)
    }

    fun findSomeDBData(): String {
        return dbService.getData()
    }

}