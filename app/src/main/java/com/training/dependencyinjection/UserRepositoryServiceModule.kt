package com.training.dependencyinjection

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryServiceModule {
    @Binds
    abstract fun getUserRepositoryService(sqlRepository: SqlRepository): UserRepositoryService
}