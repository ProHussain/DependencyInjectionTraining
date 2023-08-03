package com.training.dependencyinjection.registration

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryServiceModule {
    @Binds
    abstract fun getUserRepositoryService(sqlRepository: SqlRepository): UserRepositoryService
}