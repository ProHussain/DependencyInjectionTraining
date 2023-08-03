package com.training.dependencyinjection.registration

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import com.training.dependencyinjection.analytics.AnalyticsServices
import com.training.dependencyinjection.analytics.LocalyticsAnalyticsService
import com.training.dependencyinjection.annotations.ActivityScope
import javax.inject.Inject

interface UserRepositoryService{
    fun saveUser(mail:String, password:String)
}

@ActivityScope
class SqlRepository @Inject constructor(private val analyticsService: AnalyticsServices) : UserRepositoryService {
    override fun saveUser(mail: String, password: String) {
        Log.i(TAG, "Saving user with mail: $mail and password: $password to SQL database")
        analyticsService.sendAnalyticsData("User saved to SQL database", "SQLRepositoryService")
    }
}

class FirebaseRepository @Inject constructor(private val analyticsService: AnalyticsServices) : UserRepositoryService {
    override fun saveUser(mail: String, password: String) {
        Log.i(TAG, "Saving user with mail: $mail and password: $password to Firebase database")
        analyticsService.sendAnalyticsData("User saved to SQL database", "FirebaseRepositoryService")
    }
}