package com.training.dependencyinjection.components

import com.training.dependencyinjection.analytics.AnalyticsModule
import com.training.dependencyinjection.analytics.AnalyticsServices
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationServiceComponentFactory(): UserRegistrationServiceComponent.Factory
}