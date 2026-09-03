package com.example.pratica6_pdm

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    companion object {
        const val TAG = "CicloDeVida"
    }

    private lateinit var txtNome: TextView
    private lateinit var txtEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtNome = findViewById(R.id.txtNome)
        txtEmail = findViewById(R.id.txtEmail)

        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")

        txtNome.text = "Nome: $nome"
        txtEmail.text = "Email: $email"

        Log.d(TAG, "onCreate() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart() - MainActivity2 - BRUNO ROCHA")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy() - MainActivity2 - BRUNO ROCHA")
    }
}