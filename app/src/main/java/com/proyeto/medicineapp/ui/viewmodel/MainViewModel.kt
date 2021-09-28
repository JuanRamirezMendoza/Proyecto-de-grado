package com.proyeto.medicineapp.ui.viewmodel

import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.data.model.LoginModel
import com.proyeto.medicineapp.data.model.MainModel

class MainViewModel : BaseViewModel() {
    private var instance: FirebaseAuth = FirebaseAuth.getInstance()

    fun logOut(){
        instance.signOut()
        navigation.value = NAVIGATIONS.GO_LOGIN_VIEW
    }
}