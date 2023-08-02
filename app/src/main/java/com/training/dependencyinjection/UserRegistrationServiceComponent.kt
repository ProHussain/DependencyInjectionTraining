package com.training.dependencyinjection

import dagger.Component

@Component(modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationServiceComponent {
    fun bindMain(mainActivity: MainActivity)
}