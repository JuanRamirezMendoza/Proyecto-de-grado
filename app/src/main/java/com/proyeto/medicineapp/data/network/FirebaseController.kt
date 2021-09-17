package com.proyeto.medicineapp.data.network

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class FirebaseController {
    fun auth(email: String, password: String) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password).addOnCompleteListener {
            if(it.isSuccessful){

            }else{

            }
        }
    }
}

/*if (binding.correoEdt.text.toString().isEmpty() ||binding.passwordEdt.text.toString().isEmpty()) {
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
            }*/