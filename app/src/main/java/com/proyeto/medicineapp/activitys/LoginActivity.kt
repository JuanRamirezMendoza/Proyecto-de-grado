package com.proyeto.medicineapp.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.proyeto.medicineapp.R
import android.content.Intent
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_login)

        val correoEdt = findViewById<EditText>(R.id.correoEdt)
        val passwordEdt = findViewById<EditText>(R.id.passwordEdt)
        val iniciarSesionButton = findViewById<Button>(R.id.iniciarSesionButton)
        val registrarseButton = findViewById<Button>(R.id.registrarseButton)

        iniciarSesionButton.setOnClickListener(View.OnClickListener {

            if (correoEdt.text.toString().isEmpty() || passwordEdt.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "No deje campos vacios", Toast.LENGTH_SHORT)
                    .show()
            } else {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(correoEdt.text.toString(), passwordEdt.text.toString()).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            showErrorAlert()
                        }
                    }
            }
        })

        registrarseButton.setOnClickListener(View.OnClickListener {
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


