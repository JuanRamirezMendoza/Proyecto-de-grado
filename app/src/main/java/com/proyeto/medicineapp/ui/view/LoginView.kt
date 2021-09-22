package com.proyeto.medicineapp.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.proyeto.medicineapp.data.extensionfunctions.toast
import com.proyeto.medicineapp.databinding.ActivityLoginBinding
import com.proyeto.medicineapp.ui.viewmodel.ERRORES
import com.proyeto.medicineapp.ui.viewmodel.LoginViewModel
import com.proyeto.medicineapp.ui.viewmodel.NAVIGATIONS
import com.proyeto.medicineapp.ui.viewmodel.SUCCESS

class LoginView : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val loginViewModel: LoginViewModel by viewModels()

    private val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.viewModelLogin = loginViewModel

        /**
         * method that hide the action bar
         * */

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()


        loginViewModel.errores.observe(this, {
            when (it) {
                ERRORES.EMPTY_FIELDS -> {
                    toast("No deje campos vacios")
                }
                ERRORES.WRONG_CREDENTIALS -> {
                    toast("credenciales invalidas")
                }
            }
        })
        loginViewModel.success.observe(this, {
            when (it) {
                SUCCESS.LOGIN_SUCCES -> {
                    toast("login correcto")
                }
            }
        })
        loginViewModel.navigation.observe(this, {
            when (it) {
                NAVIGATIONS.GO_REGISTER_VIEW -> {
                    val intent = Intent(context, RegisterView::class.java)
                    context.startActivity(intent)
                }
                NAVIGATIONS.GO_MAIN_VIEW -> {
                    val intent = Intent(context, MainView::class.java)
                    context.startActivity(intent)
                    finish()
                }
            }
        })

    }

    /*private fun showSuccesfulAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Creado")
        builder.setMessage("Se ha creado el usuario correctamente")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }*/
}


