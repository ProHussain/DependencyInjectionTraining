package com.training.dependencyinjection.training_one

import dagger.Component

@Component
interface UserRegistrationServiceComponent {
    fun getUserRegistrationService(): UserRegistrationService
}