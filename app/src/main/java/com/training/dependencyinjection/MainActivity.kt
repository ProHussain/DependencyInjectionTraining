package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.dependencyinjection.registration.UserRegistrationService
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
     * Training 11
     * 1. In this training we will learn how to use @Builder annotation to create a component
     * 2. We will create a component using @Builder annotation
     * 3. But before that we need to know what's the difference between @Component.Factory and @Component.Builder
     * 3.1. @Component.Factory is used to create a component with a single parameter and @Component.Builder is used to create a component with multiple parameters
     * 3.2. If we don't pass any parameter to the Factory method then we face an error on Compilation time but if we don't pass any parameter to the Builder method then we face an error on Runtime
     * 3.3. Factory method is a modern way to create a component and Builder method is an old way to create a component so I suggest you to use Factory method
     * 4. This training is only to cover old way of creating a component using @Builder annotation for old projects
     * 5. Let's create a component using @Builder annotation and made changes in AppComponent.kt, UserRegistrationServiceComponent.kt
     * 5.1. Replace Factory with Builder in UserRegistrationServiceComponent.kt
     * 5.2. Add build method that returns UserRegistrationServiceComponent in UserRegistrationServiceComponent.kt
     * 5.3. Add notificationType method that takes notificationType as a parameter and returns Builder in UserRegistrationServiceComponent.kt
     * 5.4. We will return Builder in all other methods if we want to add more methods in future
     * 5.5. In AppComponent.kt, we will add getUserRegistrationServiceComponentBuilder method that returns UserRegistrationServiceComponent.Builder
     * 5.6. In MainActivity.kt, we will create a component using getUserRegistrationServiceComponentBuilder method and pass notificationType as a parameter and build it
     * 6. Let's run the app and check the logcat
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val appComponent = (application as MyApplication).component
        val userRegistrationServiceComponent = appComponent.getUserRegistrationServiceComponentBuilder()
            .notificationType("email")
            .build()
        userRegistrationServiceComponent.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}