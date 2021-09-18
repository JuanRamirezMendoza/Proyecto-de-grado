package com.proyeto.medicineapp.data.network

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class FirebaseController {

    private var instance: FirebaseAuth = FirebaseAuth.getInstance()

    fun auth(email: String, password: String): Task<AuthResult> {
        return instance.signInWithEmailAndPassword(email, password)
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