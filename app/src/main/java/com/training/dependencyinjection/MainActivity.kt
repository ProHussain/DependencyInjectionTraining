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
     * Training 6
     * 1. Let's we have a scenario where we need to use both services like send SMS and send Email
     * 2. How can we use both services with Dagger2?
     * 3. We can use @Named annotation to differentiate between two services
     * 4. We can use @Named annotation in consumer and producer (Module) classes
     * 5. But still there is a problem, we may face typo error while using @Named annotation in case of misspelling
     * 6. So How can we solve this problem?
     * 7. We can create our own custom annotation and add Dagger2 @Qualifier @Documented and @Retention annotation to it
     * 8. We can use our custom annotation in consumer and producer (Module) classes
     * 9. Let's run our app
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val component = DaggerUserRegistrationServiceComponent.builder().build()
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}