package com.proyeto.medicineapp.ui.view

import android.app.*
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.proyeto.medicineapp.R
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.proyeto.medicineapp.activitys.Medicamento
import com.proyeto.medicineapp.activitys.ReminderBroadcast
import com.proyeto.medicineapp.databinding.ActivityAddMedBinding
import com.proyeto.medicineapp.databinding.ActivityMainBinding
import com.proyeto.medicineapp.ui.viewmodel.AddMedViewModel
import java.util.*


class AddMedView : AppCompatActivity() {

    private lateinit var binding: ActivityAddMedBinding

    private val addMedViewModel: AddMedViewModel by viewModels()

    private val context = this

    private lateinit var fechaInicio: EditText
    private lateinit var horaInicio: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding = ActivityAddMedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.viewModelAddMed = addMedViewModel

        createNotifyChanel()

        val nombre = findViewById<EditText>(R.id.nombreMedEdt)
        val cadaCuantasHoras = findViewById<EditText>(R.id.cadaCuantasHorasEdt)
        val duracion = findViewById<EditText>(R.id.duracionEdt)
        val agregarMedButton = findViewById<Button>(R.id.agregarMedButton)
        fechaInicio = findViewById<EditText>(R.id.fechaInicioEdt)
        horaInicio = findViewById<EditText>(R.id.horaInicioEdt)


        val db = Firebase.firestore
        val collection = db.collection("medicamentos")

        agregarMedButton.setOnClickListener {

            val email = Firebase.auth.currentUser?.email

            if(nombre.text.toString().isEmpty() || cadaCuantasHoras.text.toString().isEmpty() || duracion.text.toString().isEmpty() || fechaInicio.text.toString().isEmpty()   ){
                Toast.makeText(applicationContext, "No deje campos vacios", Toast.LENGTH_SHORT)
                    .show()
            }else{
                if (email != null) {
                    val medicamento = Medicamento(
                        firebaseId = "",
                        nombre.text.toString(),
                        cadaCuantasHoras.text.toString(),
                        duracion.text.toString(),
                        email,
                        fechaInicio.text.toString(),
                        horaInicio.text.toString()
                    )
                    collection.add(medicamento)
                        .addOnSuccessListener { documentReference ->
                            Toast.makeText(
                                applicationContext,
                                "Medicamento agregado",
                                Toast.LENGTH_SHORT
                            ).show()
                            Toast.makeText(applicationContext, "Alarma configurada", Toast.LENGTH_SHORT)
                                .show()
                            val intent = Intent(this, ReminderBroadcast::class.java)
                            val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
                            val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

                            val milisegEnUnaHora = 60 * 60 * 1000
                            var time = System.currentTimeMillis()

                            val cadaCuantasHorasTxt = cadaCuantasHoras.text.toString()
                            val cadaCuantasHorasTxtLong = cadaCuantasHorasTxt.toLong()
                            var CadacuandasHorasMilis = milisegEnUnaHora * cadaCuantasHorasTxtLong

                            alarmManager?.set(
                                AlarmManager.RTC_WAKEUP,
                                time + CadacuandasHorasMilis,
                                pendingIntent
                            )


                            finish()


                        }
                        .addOnFailureListener { e ->
                            e.printStackTrace()
                            Toast.makeText(
                                applicationContext,
                                "Error al agregar medicamento",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                }
            }


        }
    }

    fun calendario(view: View) {


        val cal = Calendar.getInstance()
        val anio = cal[Calendar.YEAR]
        val mes = cal[Calendar.MONTH]
        val dia = cal[Calendar.DAY_OF_MONTH]


        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, month, dayOfMonth ->
                val realMonth = month + 1
                val fecha = "$dayOfMonth/$realMonth/$year"
                fechaInicio.setText(fecha)
            }, 2021, mes, dia
        )
        datePickerDialog.datePicker.minDate = System.currentTimeMillis() + 24 * 60 * 60 * 1000
        datePickerDialog.show()
    }

    fun hora(view: View) {

        // Get Current Time
        // Get Current Time
        val c = Calendar.getInstance()
        val mHour = c[Calendar.HOUR_OF_DAY]
        val mMinute = c[Calendar.MINUTE]

        // Launch Time Picker Dialog

        // Launch Time Picker Dialog
        val timePickerDialog = TimePickerDialog(
            this,
            { view, hourOfDay, minute -> horaInicio.setText("$hourOfDay:$minute") },
            mHour,
            mMinute,
            false
        )
        timePickerDialog.show()
    }

    private fun createNotifyChanel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var namne = "reminder"
            var description = "chanel for med notify"
            var importance = NotificationManager.IMPORTANCE_DEFAULT
            val chanel = NotificationChannel("notify", namne, importance)
            chanel.description = description

            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(chanel)
        }
    }
}