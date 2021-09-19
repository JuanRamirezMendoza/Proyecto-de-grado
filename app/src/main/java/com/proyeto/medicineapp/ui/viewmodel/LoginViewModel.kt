package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.proyeto.medicineapp.data.model.LoginModel

class LoginViewModel : BaseViewModel() {

    val email: MutableLiveData<String> = MutableLiveData("")
    val password: MutableLiveData<String> = MutableLiveData("")

    fun login() {
        val em = email.value ?: ""
        val pas = password.value ?: ""
        try {
            if (em.isEmpty()
                || pas.isEmpty()
            ) errores.value = ERRORES.EMPTY_FIELDS
            else {
                val model = LoginModel(em, pas)
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