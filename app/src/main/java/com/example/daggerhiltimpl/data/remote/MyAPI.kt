package com.example.daggerhiltimpl.data.remote

import retrofit2.http.GET

interface MyAPI {

    @GET("test")
    suspend fun doNetworkCall()
}