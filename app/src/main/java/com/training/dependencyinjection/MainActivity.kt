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
     * Training 10
     * 1. In our last training we have created a application level component and make a relation with Activity level component
     * 2. We notice an issue of Binding missing in case define multiple analytics service in AnalyticsModule
     * 3. With last training we need to define each object in Application level component to access in Activity level component
     * 4. There is no way to access all objects without defining in Application level component
     * 5. In this training we will learn how to access all objects without defining in Application level component and solve Binding missing issue
     * 6. For this purpose we will use subcomponent in Dagger
     * 7. Subcomponent is a component which is dependent on another component
     * 8. In our case UserRegistrationServiceComponent is dependent on ApplicationComponent
     * 9. Let's made changes in our code and check Results
     * 9.1. Replace @Component with @Subcomponent annotation in UserRegistrationServiceComponent
     * 9.2. In AppComponent add fun getUserRegistrationServiceComponent(): UserRegistrationServiceComponent.Factory as we build our UserRegistrationServiceComponent with Factory
     * 9.3. If our Subcomponent does not use Factory then we can use fun getUserRegistrationServiceComponent(): UserRegistrationServiceComponent
     * 9.4. Remove appComponent parameter from UserRegistrationServiceComponent.Factory.create() method
     * 10. Our project build successfully and we can see our logs in Logcat
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val appComponent = (application as MyApplication).component
        val userRegistrationServiceComponent = appComponent.getUserRegistrationServiceComponentFactory().create("email")
        userRegistrationServiceComponent.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}