package com.training.dependencyinjection.training_one

import android.util.Log

class UserRepository {
    fun saveUser(mail:String, password:String) {
        Log.i("UserRepository", "Saving user with mail: $mail and password: $password")
    }
}