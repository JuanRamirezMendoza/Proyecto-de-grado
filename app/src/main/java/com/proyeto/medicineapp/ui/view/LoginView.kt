package com.proyeto.medicineapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.proyeto.medicineapp.R
import android.content.Intent
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.activitys.RegistroActivity
import com.proyeto.medicineapp.data.extensionfunctions.toast
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

        binding.iniciarSesionButton.setOnClickListener(View.OnClickListener {

            if (binding.correoEdt.text.toString().isEmpty() ||binding.passwordEdt.text.toString().isEmpty()) {
                toast("No deje campos vacios.")
            } else {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.correoEdt.text.toString(), binding.passwordEdt.text.toString()).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, MainView::class.java)
                            startActivity(intent)
                        } else {
                            showErrorAlert()
                        }
                    }
            }
        })

        binding.registrarseButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        })

    }

    private fun showErrorAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error al iniciar sesion")
        builder.setMessage("Rectifique sus credenciales")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
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


