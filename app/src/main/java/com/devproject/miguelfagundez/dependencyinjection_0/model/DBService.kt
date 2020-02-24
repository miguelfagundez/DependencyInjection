package com.devproject.miguelfagundez.dependencyinjection_0.model

import android.content.Context

// Retrieving some data from a dummy database
class DBService (var context : Context, var dbName : String, var version : Int){

    fun getData() : String{
        return "Data from a database $dbName"
    }
}