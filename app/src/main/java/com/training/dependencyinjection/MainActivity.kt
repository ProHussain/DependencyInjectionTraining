package com.training.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.dependencyinjection.components.DaggerUserRegistrationServiceComponent
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
     * Training 8
     * 1. Let's check a scenario: We have Registration and Notification Service, We need that services in particular activities or fragments not in All Application
     * 2. Now we need to add some analytics services in our App. So we will create Analytics Service in Application Scope instead of Activity Scope
     * 3. How can we do that? We need to create a new component for Application Scope and add Analytics Service in that component
     * 4. Now we need to add that component in our Application class
     * 5. But our Activity component is depend on Application component and we need to build a relationship between them
     * 6. We can do that by adding Application component in Activity component
     * 7. Let's Update our code
     * 7.1. Create a new interface called AnalyticsService with a method called sendAnalyticsData and classes for sending data to different analytics services
     * 7.2. Create a new module called AnalyticsModule and add two methods for binding FirebaseAnalyticsService and LocalyticsAnalyticsService
     * 7.3. Create a new component called AppComponent and add AnalyticsModule in that component and add that component in Application class
     * 7.4. Now we need to add AppComponent in ActivityComponent in Factory method
     * 7.5. Now we access AnalyticsService in ActivityComponent and we can use it in our Activity
     * 7.6. Add Singleton annotation in AnalyticsService
     * 7.7. Add ActivityScope annotation in ActivityComponent
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val appComponent = (application as MyApplication).component
        val component = DaggerUserRegistrationServiceComponent.factory().create("PopUp",appComponent)
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}