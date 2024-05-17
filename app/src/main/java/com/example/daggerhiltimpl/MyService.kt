package com.example.daggerhiltimpl

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltimpl.data.repository.MyRepositoryImpl
import com.example.daggerhiltimpl.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository // Field Injection

    override fun onCreate() {
        super.onCreate() // Injection happen in Super OnCreate.
        // repository.doNetworkCall()
        // Here we can use our Repository
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}