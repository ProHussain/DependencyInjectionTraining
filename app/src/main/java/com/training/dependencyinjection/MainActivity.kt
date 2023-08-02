package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.dependencyinjection.training_one.DaggerUserRegistrationServiceComponent

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "DependencyInjection Training"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        training2()
    }

    /**
     * Training 2
     * 1. Add Dagger 2 dependency
     * 2. Create a component interface for UserRegistrationService
     * 3. Add @Component annotation to the component interface
     * 4. Add @Inject annotation to the constructor of UserRegistrationService, UserRepository, and EmailService
     * 5. @Inject annotation is used to tell Dagger 2 that the class can be injected
     * 6. We can get the instance of UserRegistrationService by calling DaggerUserRegistrationServiceComponent.builder().build().getUserRegistrationService()
     * 7. Run the ap
     */

    private fun training2() {
        val component = DaggerUserRegistrationServiceComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        userRegistrationService.registerUser("test2@mail.com", "123456")
    }

}