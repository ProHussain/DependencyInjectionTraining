package com.training.dependencyinjection.training_one

import com.training.dependencyinjection.MainActivity
import dagger.Component
import javax.inject.Inject

@Component
interface UserRegistrationServiceComponent {
    fun bindMain(mainActivity: MainActivity)
}