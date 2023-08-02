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
     * 1. Sometime our object takes a lot of space in memory, so we need to use singleton pattern
     * 2. We can use @Singleton annotation to make our object singleton
     * 3. We can use @Singleton annotation in our component
     * 4. We can use @Singleton annotation in our class
     * 5. We can use @Singleton annotation in our method anywhere we want to make it singleton
     * 6. But there is a problem, if we use @Singleton annotation it will make object singleton in the scope of the component only
     * 7. If our activity is destroyed, the object will be destroyed too and we will get a new object when we create the activity again
     * 8. To solve this problem,
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val component = DaggerUserRegistrationServiceComponent.factory().create("Push","HashMac")
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}