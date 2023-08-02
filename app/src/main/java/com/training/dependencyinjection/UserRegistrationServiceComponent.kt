package com.training.dependencyinjection

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationServiceComponent {
    fun bindMain(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance
            @Named("type")
            notificationType: String,
            @BindsInstance
            @Named("sender")
            notificationMessage: String
        ): UserRegistrationServiceComponent
    }
}