package com.proyeto.medicineapp.activitys

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.proyeto.medicineapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.SimpleDateFormat
import java.util.*

class DeleteActivity : AppCompatActivity() {
    val db = Firebase.firestore
    val collection = db.collection("medicamentos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_delete)


        getAndSetIntentData()

    }

    // TREAE DATOS DEL PRODUCTO A LA VISTA COMPRA
    fun getAndSetIntentData() {

        val nombreDeleteTxt = findViewById<TextView>(R.id.nombreDeleteTxt)
        val cadaCuantasHorasTxt = findViewById<TextView>(R.id.cadaCuantasHorasDeleteTxt)
        val duracionDeleteTxt = findViewById<TextView>(R.id.duracionDeleteTxt)
        val deleteButton = findViewById<FloatingActionButton>(R.id.deleteButton)

        if (intent.hasExtra("medicamento")) {

            //Getting Data from Intent
            val medicamento = intent.getSerializableExtra("medicamento") as Medicamento

            deleteButton.setOnClickListener {
                val builder = AlertDialog.Builder(this)

                builder.setTitle("Eliminar")
                builder.setMessage("Está seguro de eliminar el medicamento?")

                builder.setPositiveButton("Sí") { dialog, which ->
                    // Do something when user press the positive button
                    collection.document(medicamento.firebaseId).delete()
                        .addOnSuccessListener {
                            Toast.makeText(
                                applicationContext,
                                "Borrado correctamente",
                                Toast.LENGTH_SHORT
                            ).show()
                            finish()
                        }
                        .addOnFailureListener { e ->
                            Toast.makeText(
                                applicationContext,
                                "No se pudo borrar el medicamento",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                }

                builder.setNeutralButton("Cancelar") { _, _ ->

                }

                val dialog: AlertDialog = builder.create()
                dialog.show()
            }


            val milisegEnDia = 24 * 60 * 60 * 1000

            val currentDateandTime = Date().time
            val fechaInicio = medicamento.fecha
            val duracion = medicamento.duracion
            val duracionLong = duracion?.toLong()!!
            val fechaInicioLong = SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio)

            val diasTranscurridos = currentDateandTime - fechaInicioLong.time

            val diasRestantes = ((duracionLong - (diasTranscurridos / milisegEnDia))).toInt()


            //Setting Data from Intent
            nombreDeleteTxt.text = medicamento.nombre
            cadaCuantasHorasTxt.text = medicamento.cadaCuantasHoras + " Horas"
            duracionDeleteTxt.text = diasRestantes.toString() + " Dias para terminar su tratamiento"
        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show()
        }
    }
}