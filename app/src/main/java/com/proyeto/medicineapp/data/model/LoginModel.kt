package com.proyeto.medicineapp.data.model

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.proyeto.medicineapp.data.network.FirebaseController

data class LoginModel(val email: String, val password: String) {
    private val firebaseController = FirebaseController()

    fun auth(email: String, password: String): Task<AuthResult> {
        return firebaseController.auth(email, password)
    }
}