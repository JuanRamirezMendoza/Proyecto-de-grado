package com.proyeto.medicineapp.ui.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.proyeto.medicineapp.activitys.RegistroActivity
import com.proyeto.medicineapp.databinding.ActivityLoginBinding
import com.proyeto.medicineapp.ui.viewmodel.LoginViewModel

class LoginView : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding.iniciarSesionButton.setOnClickListener {
            try {
                var correo = binding.correoEdt.text.toString()
                var password = binding.passwordEdt.text.toString()
                var activity: Activity = LoginView()
                loginViewModel.login(correo, password, activity)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        binding.registrarseButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        })

    }

    private fun showSuccesfulAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Creado")
        builder.setMessage("Se ha creado el usuario correctamente")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}


