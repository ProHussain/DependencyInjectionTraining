package com.training.dependencyinjection

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationServiceComponent {
    fun bindMain(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance notificationType: String): UserRegistrationServiceComponent
    }
}