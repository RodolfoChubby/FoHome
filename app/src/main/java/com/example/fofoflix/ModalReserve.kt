package com.example.fofoflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ModalReserve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modal_reserva)

        val btnReservar: Button = findViewById(R.id.btnReservar)
        btnReservar.setOnClickListener {
            val intent = Intent(this, ActivityReserva::class.java)
            startActivity(intent)
        }
    }
}