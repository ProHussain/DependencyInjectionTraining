package com.training.dependencyinjection.analytics

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import javax.inject.Inject
import javax.inject.Singleton

interface AnalyticsServices {
    fun sendAnalyticsData(data: String, type: String)
}

@Singleton
class FirebaseAnalyticsService @Inject constructor() : AnalyticsServices {
    override fun sendAnalyticsData(data: String, type: String) {
        Log.i(TAG, "Sending $data to Firebase Analytics with type: $type")
    }
}

@Singleton
class LocalyticsAnalyticsService @Inject constructor() : AnalyticsServices {
    override fun sendAnalyticsData(data: String, type: String) {
        Log.i(TAG, "Sending $data to Localytics Analytics with type: $type")
    }
}