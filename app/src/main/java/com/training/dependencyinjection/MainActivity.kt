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
        training3()
    }


    /**
     * Training 4
     * 1. We have one more logical problem in the previous training to make the code more reusable
     * 2. Now we have two main functions eg. save user and send email
     * 3. What if in the future we want to add another main function eg. send sms instead of email or save user to firebase instead of local database
     * 4. In this case, we need to change all possible places in all affected classes but it's not efficient and not reusable
     * 5. We can use interface to solve this problem with @Provide and @Module annotation
     * 6. Create a new interface called EmailServiceProvider
     * 7. We can use this interface to provide the email service and in the future in send sms service (We don't need to change the code in the consumer class)
     * 8. Same way we can create a new interface called UserRepositoryProvider
     * 9. We can use this interface to provide the user repository and in the future in firebase repository (We don't need to change the code in the consumer class)
     * 10. Create a new class called UserRegistrationServiceModule
     * 11. Add @Module annotation to the class
     * 12. Add @Provides annotation to the provideEmailService function and in the function we can return EmailService()
     * 13. Add @Provides annotation to the provideUserRepository function and in the function we can return UserRepository()
     */

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    private fun training3() {
        val component = DaggerUserRegistrationServiceComponent.builder().build()
        component.bindMain(this)
        userRegistrationService.registerUser("alpha@mail.com","12345678")
    }

}