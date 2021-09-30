package com.proyeto.medicineapp.ui.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proyeto.medicineapp.R
import com.proyeto.medicineapp.ui.view.adapter.MainActivityAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.proyeto.medicineapp.activitys.AddMedActivity
import com.proyeto.medicineapp.activitys.Medicamento
import com.proyeto.medicineapp.data.extensionfunctions.toast
import com.proyeto.medicineapp.databinding.ActivityLoginBinding
import com.proyeto.medicineapp.databinding.ActivityMainBinding
import com.proyeto.medicineapp.ui.viewmodel.LoginViewModel
import com.proyeto.medicineapp.ui.viewmodel.MainViewModel
import com.proyeto.medicineapp.ui.viewmodel.NAVIGATIONS
import com.proyeto.medicineapp.ui.viewmodel.SUCCESS

class MainView : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mainViewModel: MainViewModel by viewModels()

    private val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.viewModelMain = mainViewModel

        mainViewModel.success.observe(this,{
            when (it) {
                SUCCESS.LOG_OUT_SUCCESS -> {
                    toast("sesion cerrada correctamente")
                }
            }
        })

        mainViewModel.navigation.observe(this,{
            when(it){
                NAVIGATIONS.GO_LOGIN_VIEW ->{
                    val intent = Intent(context, LoginView::class.java)
                    context.startActivity(intent)
                }

            }
        })

        listarMeds()

        val db = Firebase.firestore
        val collection = db.collection("medicamentos")

        val add_button = findViewById<FloatingActionButton>(R.id.addButton)
        val refresh_button = findViewById<FloatingActionButton>(R.id.log_out)

        refresh_button.setOnClickListener {
            onResume()
        }

        add_button.setOnClickListener {
            val intent = Intent(this, AddMedActivity::class.java)
            startActivity(intent)
        }
    }

    fun listarMeds() {
        val emptyImage = findViewById<ImageView>(R.id.emptyImage)
        val emptyText = findViewById<TextView>(R.id.emptyText)

        val activity = this
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewList)

        val db = Firebase.firestore
        val email = Firebase.auth.currentUser?.email

        db.collection("medicamentos")
            .whereEqualTo("email", email)
            .get()
            .addOnSuccessListener { documents ->
                val medicamentos = mutableListOf<Medicamento>()

                for (document in documents) {

                   /* if (documents.count() == 0) {
                        emptyImage.getVisibility() == View.VISIBLE
                        emptyText.getVisibility() == View.VISIBLE
                    } else {
                        emptyImage.getVisibility() == View.GONE
                        emptyText.getVisibility() == View.GONE*/


                        val cadaCuantasHoras = document.data.get("cadaCuantasHoras").toString()
                        val duracion = document.data.get("duracion").toString()
                        val fecha = document.data.get("fecha").toString()
                        val hora = document.data.get("hora").toString()
                        val nombre = document.data.get("nombre").toString()
                        val medicamento = Medicamento(
                            document.id,
                            nombre,
                            cadaCuantasHoras,
                            duracion,
                            "",
                            fecha,
                            hora
                        )
                        medicamentos.add(medicamento)
                    //}
                    val adapter = MainActivityAdapter(applicationContext, medicamentos, activity)
                    recyclerView.adapter = adapter
                    recyclerView.layoutManager = LinearLayoutManager(applicationContext)
                }
            }
            .addOnFailureListener { exception ->

            }
    }

    override fun onResume() {
        super.onResume()
        listarMeds()
    }


}