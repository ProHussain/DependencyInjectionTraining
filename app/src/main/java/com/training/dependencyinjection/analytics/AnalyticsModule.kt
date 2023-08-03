package com.training.dependencyinjection.analytics

import dagger.Binds
import dagger.Module

@Module
abstract class AnalyticsModule() {
    @Binds
    abstract fun getAnalyticsService(firebaseAnalyticsService: FirebaseAnalyticsService): AnalyticsServices
}