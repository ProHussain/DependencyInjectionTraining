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
     * 8. But what if we forget to create a module?
     * 9. Dagger will throw an error at run time as Module class is not set.
     * 10. To avoid this, we can use @Component.Factory annotation in our Component interface.
     * 11. Create a factory interface and add a method to create the component.
     * 12. Add @Component.Factory annotation to the factory interface.
     * 13. In this method, we will pass our dynamic value.
     * 14. We will use @BindInstance annotation to tell Dagger to create the object at runtime.
     * 14. In our module class instead of using the constructor, we will get value from Dagger Component.
     * 15. In Our MainActivity, we will create a factory object and pass our value inside the build method.
     * 16. Now we can use our component object to create other objects.
     * 17. Let's run the app and see the output.
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training() {
        val component = DaggerUserRegistrationServiceComponent.factory().create("email")
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}