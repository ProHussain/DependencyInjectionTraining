package com.training.dependencyinjection.training_one

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private var userRepository: UserRepository,
    private var emailService: EmailService
) {

    public fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "Welcome to our app!")
    }
}