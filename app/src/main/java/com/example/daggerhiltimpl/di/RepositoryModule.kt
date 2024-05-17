package com.example.daggerhiltimpl.di

import com.example.daggerhiltimpl.data.repository.MyRepositoryImpl
import com.example.daggerhiltimpl.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepo(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository

}