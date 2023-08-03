package com.training.dependencyinjection.analytics

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AnalyticsModule() {
    @Provides
    fun getAnalyticsService(firebaseAnalyticsService: FirebaseAnalyticsService): AnalyticsServices {
        return firebaseAnalyticsService
    }
}