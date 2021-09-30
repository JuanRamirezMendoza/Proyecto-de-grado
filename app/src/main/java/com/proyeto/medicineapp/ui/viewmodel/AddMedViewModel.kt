package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.proyeto.medicineapp.data.model.AddMedModel
import com.proyeto.medicineapp.data.model.LoginModel

class AddMedViewModel : BaseViewModel() {

    val medName: MutableLiveData<String> = MutableLiveData("")
    val medHour: MutableLiveData<String> = MutableLiveData("")
    val medDay: MutableLiveData<String> = MutableLiveData("")
    val medDate: MutableLiveData<String> = MutableLiveData("")
    val medHourInit: MutableLiveData<String> = MutableLiveData("")

    fun registerMed(){
        val medNameRegister = medName.value ?: ""
        val medHourRegister = medHour.value ?: ""
        val medDayRegister = medDay.value ?: ""
        val medDateRegister = medDate.value ?: ""
        val medHourIntRegister = medHourInit.value ?: ""
        try {
            if (medNameRegister.isEmpty()
                || medHourRegister.isEmpty()
                || medDayRegister.isEmpty()
                || medDateRegister.isEmpty()
                || medHourIntRegister.isEmpty()
            ) errores.value = ERRORES.EMPTY_FIELDS
            else {
                val model = AddMedModel(medNameRegister, medHourRegister, medDayRegister, medDateRegister, medHourIntRegister)
                model.registerMed({
                    navigation.value = NAVIGATIONS.GO_MAIN_VIEW
                }, {
                    errores.value = ERRORES.CANT_REGISTER_MED
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}