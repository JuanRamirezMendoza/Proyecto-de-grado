package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.proyeto.medicineapp.data.model.LoginModel

class LoginViewModel : BaseViewModel() {

    val email: MutableLiveData<String> = MutableLiveData("")
    val password: MutableLiveData<String> = MutableLiveData("")

    init {
        if (firebaseController.hasSession()){
            navigation.value = NAVIGATIONS.GO_MAIN_VIEW
        }
    }

    fun login() {
        val emailLogin = email.value ?: ""
        val passwordLogin = password.value ?: ""
        try {
            if (emailLogin.isEmpty()
                || passwordLogin.isEmpty()
            ) errores.value = ERRORES.EMPTY_FIELDS
            else {
                val model = LoginModel(emailLogin, passwordLogin)
                model.auth({
                    navigation.value = NAVIGATIONS.GO_MAIN_VIEW
                }, {
                    errores.value = ERRORES.WRONG_CREDENTIALS
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun register() {
        navigation.value = NAVIGATIONS.GO_REGISTER_VIEW
    }

}