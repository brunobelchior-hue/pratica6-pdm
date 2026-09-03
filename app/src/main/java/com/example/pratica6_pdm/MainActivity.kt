package com.example.pratica6_pdm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtNome: EditText
    private lateinit var edtEmail: EditText
    private lateinit var btnEnviar: Button

    companion object {
        const val TAG = "CicloDeVida"
        const val PREFS = "DadosFormulario"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNome = findViewById(R.id.edtNome)
        edtEmail = findViewById(R.id.edtEmail)
        btnEnviar = findViewById(R.id.btnEnviar)

        Log.d(TAG, "onCreate() - MainActivity - BRUNO ROCHA")

        btnEnviar.setOnClickListener {

            val nome = edtNome.text.toString()
            val email = edtEmail.text.toString()

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("email", email)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart() - MainActivity - BRUNO ROCHA")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume() - MainActivity - BRUNO ROCHA")

        val preferences = getSharedPreferences(
            PREFS,
            MODE_PRIVATE
        )

        val nome = preferences.getString("nome", "")
        val email = preferences.getString("email", "")

        edtNome.setText(nome)
        edtEmail.setText(email)

        Log.d(
            TAG,
            "onResume() - MainActivity - DADOS RECUPERADOS - BRUNO ROCHA"
        )
    }

    override fun onPause() {
        super.onPause()

        val preferences = getSharedPreferences(
            PREFS,
            MODE_PRIVATE
        )

        preferences.edit()
            .putString("nome", edtNome.text.toString())
            .putString("email", edtEmail.text.toString())
            .apply()

        Log.d(
            TAG,
            "onPause() - MainActivity - DADOS SALVOS - BRUNO ROCHA"
        )
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop() - MainActivity - BRUNO ROCHA")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart() - MainActivity - BRUNO ROCHA")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy() - MainActivity - BRUNO ROCHA")
    }
}