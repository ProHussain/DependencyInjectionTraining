package com.training.dependencyinjection

import android.app.Application
import com.training.dependencyinjection.components.AppComponent
import com.training.dependencyinjection.components.DaggerAppComponent
import com.training.dependencyinjection.components.UserRegistrationServiceComponent

class MyApplication : Application() {

        lateinit var component: AppComponent

        override fun onCreate() {
            super.onCreate()
            component = DaggerAppComponent.builder().build()
        }
}