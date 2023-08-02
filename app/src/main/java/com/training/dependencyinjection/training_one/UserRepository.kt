package com.training.dependencyinjection.training_one

import android.util.Log
import com.training.dependencyinjection.MainActivity
import com.training.dependencyinjection.MainActivity.Companion.TAG
import javax.inject.Inject

class UserRepository  @Inject constructor() {
    fun saveUser(mail:String, password:String) {
        Log.i(TAG, "Saving user with mail: $mail and password: $password")
    }
}