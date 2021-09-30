package com.proyeto.medicineapp.data.model

import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.data.network.FirebaseController

class MainModel() {
    private val firebaseController = FirebaseController()
    fun signOut(success: () -> Unit){
        firebaseController.signOut(success)
    }
}