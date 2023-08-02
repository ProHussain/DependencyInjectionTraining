package com.training.dependencyinjection

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import javax.inject.Inject

interface NotificationService {
    fun sendNotification(to: String, message: String)
}

class EmailService(private val notificationType: String) : NotificationService {
    override fun sendNotification(to: String, message: String) {
        Log.i(TAG, "Sending email to $to with message: $message and notification type: $notificationType")
    }
}

class SMSService @Inject constructor() : NotificationService {
    override fun sendNotification(to: String, message: String) {
        Log.i(TAG, "Sending SMS to $to with message: $message")
    }
}