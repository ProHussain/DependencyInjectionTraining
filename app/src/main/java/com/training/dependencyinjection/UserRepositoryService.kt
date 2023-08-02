package com.training.dependencyinjection

import android.util.Log
import com.training.dependencyinjection.MainActivity.Companion.TAG
import javax.inject.Inject

interface UserRepositoryService{
    fun saveUser(mail:String, password:String)
}

class SqlRepository @Inject constructor() : UserRepositoryService{
    override fun saveUser(mail: String, password: String) {
        Log.i(TAG, "Saving user with mail: $mail and password: $password to SQL database")
    }
}

class FirebaseRepository @Inject constructor() : UserRepositoryService{
    override fun saveUser(mail: String, password: String) {
        Log.i(TAG, "Saving user with mail: $mail and password: $password to Firebase database")
    }
}