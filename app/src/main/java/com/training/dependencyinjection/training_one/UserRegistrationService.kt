package com.training.dependencyinjection.training_one

class UserRegistrationService (private var userRepository: UserRepository, private var emailService: EmailService) {

    public fun registerUser(email:String, password:String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "Welcome to our app!")
    }
}