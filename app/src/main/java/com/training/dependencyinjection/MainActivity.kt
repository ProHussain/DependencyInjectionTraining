package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.dependencyinjection.training_one.EmailService
import com.training.dependencyinjection.training_one.UserRegistrationService
import com.training.dependencyinjection.training_one.UserRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        training1()
    }

    /**
     * Training 1
     * 1. Create UserRepository class
     * 2. Create EmailService class
     * 3. Create UserRegistrationService class
     * 4. Create registerUser function in UserRegistrationService class
     * 5. Use Manually Dependency Injection by Constructor dependency injection
     * 6. Run the app
     */

    private fun training1() {
        val userRepository = UserRepository()
        val emailService = EmailService()
        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("test@mail.com", "123456")
    }
}