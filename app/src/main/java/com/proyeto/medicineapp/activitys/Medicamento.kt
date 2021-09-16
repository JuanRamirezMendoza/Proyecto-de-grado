package com.proyeto.medicineapp.activitys

import java.io.Serializable

class Medicamento(
    var firebaseId: String = "",
    var nombre: String = "",
    var cadaCuantasHoras: String = "",
    var duracion: String = "",
    var email: String = "",
    var fecha: String = "",
    var hora: String = ""
) : Serializable