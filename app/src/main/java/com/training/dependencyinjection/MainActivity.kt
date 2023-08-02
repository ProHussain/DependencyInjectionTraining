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
     * Training 5
     * 1. Difference between @Binds and @Provides
     * 2. @Binds is more efficient than @Provides but How
     * 3. @Binds is used for interface and abstract class
     * 4. @Provides is used for concrete class
     * 5. @Binds will use Dagger 2 to create object with @Inject constructor
     * 6. @Provides will create a new object by User
     * 7. How to Code:
     * 7.1. Change Provides to Binds in Module
     * 7.2. Change simple class to abstract class and abstract function
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val component = DaggerUserRegistrationServiceComponent.builder().build()
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}