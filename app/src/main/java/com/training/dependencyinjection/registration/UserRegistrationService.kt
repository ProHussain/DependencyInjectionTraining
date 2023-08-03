package com.training.dependencyinjection.registration

import com.training.dependencyinjection.annotations.ActivityScope
import com.training.dependencyinjection.notification.NotificationService
import javax.inject.Inject
import javax.inject.Named

@ActivityScope
class UserRegistrationService @Inject constructor(
    private var userRepositoryService: UserRepositoryService,
    @Named("email") private var notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepositoryService.saveUser(email, password)
        notificationService.sendNotification(email, "You have successfully registered!")
    }
}