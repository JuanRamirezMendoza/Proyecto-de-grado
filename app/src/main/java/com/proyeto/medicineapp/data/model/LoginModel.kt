package com.proyeto.medicineapp.data.model

import com.proyeto.medicineapp.data.network.FirebaseController

data class LoginModel(val email: String, val password: String) {
    private val firebaseController = FirebaseController()

    fun auth(success: () -> Unit, error: () -> Unit) {
        firebaseController.auth(this, success, error)
    }
}