package com.training.dependencyinjection

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class UserRegistrationService @Inject constructor(
    private var userRepositoryService: UserRepositoryService,
    @Named("email") private var notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepositoryService.saveUser(email, password)
        notificationService.sendNotification(email, "You have successfully registered!")
    }
}