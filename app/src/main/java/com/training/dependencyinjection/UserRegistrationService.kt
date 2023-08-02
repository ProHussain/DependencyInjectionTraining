package com.training.dependencyinjection

import javax.inject.Inject
import javax.inject.Named

@ApplicationScope
class UserRegistrationService @Inject constructor(
    private var userRepositoryService: UserRepositoryService,
    @Named("email") private var notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepositoryService.saveUser(email, password)
        notificationService.sendNotification(email, "You have successfully registered!")
    }
}