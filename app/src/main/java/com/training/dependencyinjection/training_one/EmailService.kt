package com.training.dependencyinjection.training_one

import android.util.Log

class EmailService {
    fun sendEmail(email: String, message: String) {
        Log.i("EmailService", "Sending email to $email with message: $message")
    }
}