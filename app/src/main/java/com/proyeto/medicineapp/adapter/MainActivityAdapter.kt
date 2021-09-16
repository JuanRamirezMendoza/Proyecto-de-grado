package com.proyeto.medicineapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.proyeto.medicineapp.R
import com.proyeto.medicineapp.activitys.DeleteActivity
import com.proyeto.medicineapp.activitys.Medicamento
import java.text.SimpleDateFormat
import java.util.*


class MainActivityAdapter(
    val context: Context,
    val list: List<Medicamento>,
    val activity: AppCompatActivity
) : Adapter<MainActivityAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.view_meds, parent, false)
        return MainActivityAdapter.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val medicamento = list[position]
        holder.nombreMedTxt.text = medicamento.nombre
        holder.CadaCuantasHorasDeleteTxt.text = "Cada "+medicamento.cadaCuantasHoras+ " Horas"
        holder.duracionTratamientoTxt.text = medicamento.duracion+" Dias"

        val milisegEnDia = 24 * 60 * 60 * 1000

        val currentDateandTime = Date().time
        val fechaInicio = medicamento.fecha
        val duracion = medicamento.duracion
        val duracionLong = duracion?.toLong()!!
        val fechaInicioLong = SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio)

        val diasTranscurridos = currentDateandTime - fechaInicioLong.time

        val diasRestantes = ((duracionLong - (diasTranscurridos/ milisegEnDia)) ).toInt()

        holder.diasRestantesTxt.text = "Faltan "+diasRestantes.toString()+" Dias"

        holder.mainLayout.setOnClickListener {
            val intent = Intent(context, DeleteActivity::class.java)
            intent.putExtra("medicamento", medicamento)
            activity.startActivityForResult(intent, 1)
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mainLayout = itemView.findViewById<LinearLayout>(R.id.mainLayout)
        val nombreMedTxt = itemView.findViewById<TextView>(R.id.nombreMedTxt)
        val CadaCuantasHorasDeleteTxt = itemView.findViewById<TextView>(R.id.CadaCuantasHorasDeleteTxt)
        val duracionTratamientoTxt = itemView.findViewById<TextView>(R.id.duracionTratamientoTxt)
        val diasRestantesTxt = itemView.findViewById<TextView>(R.id.diasRestantesTxt)
    }

}