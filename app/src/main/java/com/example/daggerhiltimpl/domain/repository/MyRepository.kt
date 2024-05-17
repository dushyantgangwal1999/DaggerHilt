package com.example.daggerhiltimpl.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}