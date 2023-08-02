package com.training.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryServiceModule {
    @Provides
    fun getUserRepositoryService(): UserRepositoryService {
        return FirebaseRepository()
    }
}