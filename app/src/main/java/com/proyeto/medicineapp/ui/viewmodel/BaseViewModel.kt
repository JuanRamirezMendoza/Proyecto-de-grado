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
    CANT_REGISTER_MED
}

enum class SUCCESS{
    LOGIN_SUCCES,
    REGISTER_SUCCES,
    LOG_OUT_SUCCESS
}

enum class NAVIGATIONS{
    GO_MAIN_VIEW,
    GO_REGISTER_VIEW,
    GO_LOGIN_VIEW,
    GO_ADD_MED
}