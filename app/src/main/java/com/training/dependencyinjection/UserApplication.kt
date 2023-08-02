package com.training.dependencyinjection

import android.app.Application

class UserApplication : Application() {

        lateinit var component: UserRegistrationServiceComponent

        override fun onCreate() {
            super.onCreate()
            component = DaggerUserRegistrationServiceComponent.factory().create("Push","HashMac")
        }
}