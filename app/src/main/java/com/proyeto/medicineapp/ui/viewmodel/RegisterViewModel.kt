package com.proyeto.medicineapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.proyeto.medicineapp.data.model.RegisterModel

class RegisterViewModel : BaseViewModel() {

    val email: MutableLiveData<String> = MutableLiveData("")
    val password: MutableLiveData<String> = MutableLiveData("")
    val passwordConfirm: MutableLiveData<String> = MutableLiveData("")

    fun register() {
        val emailRegister = email.value ?: ""
        val passwordRegister = password.value ?: ""
        val passwordConfirmRegister = password.value ?: ""
        try {
            if (emailRegister.isEmpty()
                || passwordRegister.isEmpty()
                || passwordConfirmRegister.isEmpty()
            ) errores.value = ERRORES.EMPTY_FIELDS
            else {
                val model = RegisterModel(emailRegister, passwordRegister, passwordConfirmRegister)
                model.register({
                    navigation.value = NAVIGATIONS.GO_REGISTER_VIEW
                }, {
                    errores.value = ERRORES.WRONG_CREDENTIALS
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    /*registarseConfirmButton.setOnClickListener(View.OnClickListener {
            if (correo.text.toString().isEmpty() || contraseña.text.toString().isEmpty() || confirmarContraseña.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "No deje campos vacios", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (!confirmarContraseña.text.toString().equals(contraseña.text.toString())) {
                    Toast.makeText(
                        applicationContext,
                        "Las contraseñas no coinciden",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                        correo.text.toString(),
                        contraseña.text.toString()
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {
                            showSuccesfulAlert()
                        } else {
                            showAlert()
                        }
                    }*/

}
