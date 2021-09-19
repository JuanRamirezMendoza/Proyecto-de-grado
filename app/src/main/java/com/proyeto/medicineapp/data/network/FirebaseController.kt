package com.proyeto.medicineapp.data.network

import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.data.model.LoginModel

class FirebaseController {

    private var instance: FirebaseAuth = FirebaseAuth.getInstance()

    fun auth(model: LoginModel, success: () -> Unit, error: () -> Unit) {
        instance.signInWithEmailAndPassword(model.email, model.password).addOnCompleteListener {
            if (it.isSuccessful) {
                success.invoke()
            } else {
                error.invoke()
            }
        }
    }
}