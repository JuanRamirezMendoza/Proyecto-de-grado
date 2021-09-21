package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyeto.medicineapp.data.network.FirebaseController
//TODO fix plural to singular
open class BaseViewModel : ViewModel() {
    val errores : MutableLiveData<ERRORES> = MutableLiveData(null)
    val success : MutableLiveData<SUCCESS> = MutableLiveData(null)
    val navigation : MutableLiveData<NAVIGATIONS> = MutableLiveData(null)
    val firebaseController = FirebaseController()
}

enum class ERRORES{
    EMPTY_FIELDS,
    WRONG_CREDENTIALS,
    NO_ERROR
}

enum class SUCCESS{
    LOGIN_SUCCES
}

enum class NAVIGATIONS{
    GO_MAIN_VIEW,
    GO_REGISTER_VIEW,
    GO_LOGIN_VIEW
}