package com.training.dependencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private var userRepositoryService: UserRepositoryService,
    private var notificationService: NotificationService
) {

    public fun registerUser(email: String, password: String) {
        userRepositoryService.saveUser(email, password)
        notificationService.sendNotification(email, "You have successfully registered!")
    }
}