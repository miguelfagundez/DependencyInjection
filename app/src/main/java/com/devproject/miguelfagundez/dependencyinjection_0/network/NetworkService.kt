package com.devproject.miguelfagundez.dependencyinjection_0.network

import android.content.Context

// Retrieving some data from a dummy web service
class NetworkService (var context : Context, val apiKey : String){

    fun getData(url : String) : String{
        return "Data from a web service - $url"
    }
}