package com.proyeto.medicineapp.ui.viewmodel

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.proyeto.medicineapp.R
import com.proyeto.medicineapp.data.extensionfunctions.toast
import com.proyeto.medicineapp.data.model.LoginModel
import com.proyeto.medicineapp.ui.view.MainView

class LoginViewModel : ViewModel() {

    fun login(email: String, password: String, act: Activity){
        try {
            if (email.isEmpty()
                || password.isEmpty()
            ) act.toast(act.getString(R.string.campos_vacios))
            else LoginViewModel().auth(
                email,
                password
            ).addOnCompleteListener {
                if (it.isSuccessful) {
                    val intent = Intent(act, MainView::class.java)
                    act.startActivity(intent)
                } else {
                    showErrorAlert(act as Context)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun auth(email: String, password: String): Task<AuthResult> {
        return LoginModel(email, password).auth(email, password)
    }

    private fun showErrorAlert(act: Context) {
        val builder = AlertDialog.Builder(act)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error al iniciar sesion")
        builder.setMessage("Rectifique sus credenciales")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}