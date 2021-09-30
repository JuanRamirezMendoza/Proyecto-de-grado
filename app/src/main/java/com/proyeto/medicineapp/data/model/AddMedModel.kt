package com.proyeto.medicineapp.data.model

import com.proyeto.medicineapp.data.network.FirebaseController

data class AddMedModel(val medName: String, val medHour: String, val medDay: String, val medDate: String, val medHourInit: String) {
    private val firebaseController = FirebaseController()

    fun registerMed(success: () -> Unit, error: () -> Unit) {
        firebaseController.registerMed(this, success, error)
    }
}