package com.training.dependencyinjection.components

import com.training.dependencyinjection.MainActivity
import com.training.dependencyinjection.annotations.ActivityScope
import com.training.dependencyinjection.notification.NotificationServiceModule
import com.training.dependencyinjection.registration.UserRepositoryServiceModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationServiceComponent {
    fun bindMain(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance
            notificationType: String
        ): UserRegistrationServiceComponent
    }
}