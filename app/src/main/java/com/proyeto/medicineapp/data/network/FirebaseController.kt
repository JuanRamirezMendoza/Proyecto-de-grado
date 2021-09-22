package com.proyeto.medicineapp.data.network

import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.data.model.LoginModel
import com.proyeto.medicineapp.data.model.RegisterModel

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

    fun register(model: RegisterModel, success: () -> Unit, error: () -> Unit){
        instance.createUserWithEmailAndPassword(model.email, model.password).addOnCompleteListener {
            if (it.isSuccessful) {
                success.invoke()
            } else {
                error.invoke()
            }
        }
    }

    fun hasSession(): Boolean{
        return instance.currentUser != null
    }
}