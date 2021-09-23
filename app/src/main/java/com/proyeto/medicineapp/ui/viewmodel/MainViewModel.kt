package com.proyeto.medicineapp.ui.viewmodel

import com.proyeto.medicineapp.data.model.MainModel

class MainViewModel : BaseViewModel() {

    fun logOut(){
        val model = MainModel()
        model.logOut()
    }
}