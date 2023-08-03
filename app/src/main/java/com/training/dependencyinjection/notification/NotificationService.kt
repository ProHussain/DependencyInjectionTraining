package com.training.dependencyinjection.notification

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import com.training.dependencyinjection.annotations.ActivityScope
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun sendNotification(to: String, message: String)
}

@ActivityScope
class EmailService(private val notificationType: String) :
    NotificationService {
    override fun sendNotification(to: String, message: String) {
        Log.i(TAG, "Sending email to $to with message: $message and notification type: $notificationType")
    }
}

@ActivityScope
class SMSService @Inject constructor() : NotificationService {
    override fun sendNotification(to: String, message: String) {
        Log.i(TAG, "Sending SMS to $to with message: $message")
    }
}