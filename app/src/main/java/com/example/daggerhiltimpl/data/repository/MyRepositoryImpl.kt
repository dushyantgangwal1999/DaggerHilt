package com.example.daggerhiltimpl.data.repository

import android.app.Application
import com.example.daggerhiltimpl.R
import com.example.daggerhiltimpl.data.remote.MyAPI
import com.example.daggerhiltimpl.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val myAPI: MyAPI,
    private val application: Application
) : MyRepository {


    init {
        val appName = application.getString(R.string.app_name)
        println("Hello form Repo of $appName")
    }

    // For API Call, Which will come from MyAPI
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}