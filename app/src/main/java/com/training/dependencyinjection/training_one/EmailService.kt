package com.training.dependencyinjection.training_one

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(email: String, message: String) {
        Log.i(TAG, "Sending email to $email with message: $message")
    }
}