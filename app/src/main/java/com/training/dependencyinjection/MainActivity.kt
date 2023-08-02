package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "DependencyInjection"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        training()
    }


    /**
     * Training 7
     * 1. Let's we have a scenario where we need to create some objects at runtime but Dagger creates all the objects at compile time.
     * 2. In this case, we need to tell Dagger to create the object at runtime.
     * 3. To do this, we need to create Module class instead of Dagger creates it for us.
     * 4. We will pass our value at runtime using the constructor and create other objects with the help of the constructor.
     * 5. Use Provides annotation to tell Dagger to create the object at runtime.
     * 6. Remove Abstract keyword from the Module class.
     * 7. Remove the @Binds annotation from the getEmailService() method.
     * 8. Run the app and check the logcat.
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val component = DaggerUserRegistrationServiceComponent.builder()
            .notificationServiceModule(NotificationServiceModule("HashMac"))
            .build()
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}