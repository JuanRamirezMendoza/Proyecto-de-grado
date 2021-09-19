package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    val errores : MutableLiveData<ERRORES> = MutableLiveData(null)
    val navigation : MutableLiveData<NAVIGATIONS> = MutableLiveData(null)
}
enum class ERRORES{
    EMPTY_FIELDS,
    WRONG_CREDENTIALS
}
enum class NAVIGATIONS{
    GO_MAIN_VIEW,
    GO_REGISTER_VIEW
}