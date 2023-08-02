package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.dependencyinjection.training_one.DaggerUserRegistrationServiceComponent
import com.training.dependencyinjection.training_one.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "DependencyInjection Training"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        training3()
    }

    /**
     * Training 3
     * 1. Sometimes we need to create too many objects in the component interface
     * 2. It's not efficient to create all of the objects in the component interface
     * 3. We can use @Inject annotation for field injection to solve this problem
     * 4. @Inject annotation to the constructor of UserRegistrationService, UserRepository, and EmailService tells Dagger 2 that how to create the object
     * 5. @Inject annotation to the field of UserRegistrationService, UserRepository, and EmailService tells Dagger 2 that the object can be injected
     * 6. We just need to pass our consumer class to the component interface
     * 7. We can get the instance of UserRegistrationService by calling DaggerUserRegistrationServiceComponent.builder().build().inject(this)
     * 8. Run the app
    */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training3() {
    val component = DaggerUserRegistrationServiceComponent.builder().build()
    component.bindMain(this)
    userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}