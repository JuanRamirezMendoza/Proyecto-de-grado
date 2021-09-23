package com.proyeto.medicineapp.data.model

import com.proyeto.medicineapp.data.network.FirebaseController

class MainModel() {
    private val firebaseController = FirebaseController()
    fun logOut(){
        firebaseController.logOut()
    }
}