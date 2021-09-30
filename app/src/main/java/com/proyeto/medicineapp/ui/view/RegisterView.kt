package com.proyeto.medicineapp.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.R
import com.proyeto.medicineapp.data.extensionfunctions.toast
import com.proyeto.medicineapp.databinding.ActivityRegistroBinding
import com.proyeto.medicineapp.ui.viewmodel.ERRORES
import com.proyeto.medicineapp.ui.viewmodel.NAVIGATIONS
import com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel
import com.proyeto.medicineapp.ui.viewmodel.SUCCESS

class RegisterView : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    private val registerViewModel: RegisterViewModel by viewModels()

    private val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.viewModelRegistro = registerViewModel

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        registerViewModel.errores.observe(this, {
            when (it) {
                ERRORES.EMPTY_FIELDS -> {
                    toast("No deje campos vacios")
                }
            }
        })

        registerViewModel.success.observe(this,{
            when (it){
                SUCCESS.REGISTER_SUCCES ->{
                    toast("Registro exitoso")
                }
            }
        })

        registerViewModel.navigation.observe(this,{
            when(it){
                NAVIGATIONS.GO_REGISTER_VIEW ->{
                    val intent = Intent(context, RegisterView::class.java)
                    context.startActivity(intent)
                }

            }
        })
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error crear usuario")
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