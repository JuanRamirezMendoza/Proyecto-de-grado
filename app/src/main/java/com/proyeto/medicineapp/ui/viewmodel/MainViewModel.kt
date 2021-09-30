package com.proyeto.medicineapp.ui.viewmodel

import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.data.model.LoginModel
import com.proyeto.medicineapp.data.model.MainModel
import com.proyeto.medicineapp.data.model.RegisterModel

class MainViewModel : BaseViewModel() {

    fun logOut(){
        val model = MainModel()
        model.signOut {
            navigation.value = NAVIGATIONS.GO_LOGIN_VIEW
        }
    }
}