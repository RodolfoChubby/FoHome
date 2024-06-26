package com.example.fofoflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PropiedadesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property)

        val btnAggProperty: Button = findViewById(R.id.btnAggProperty)
        btnAggProperty.setOnClickListener {
            val intent = Intent(this, ModalPage::class.java)
            startActivity(intent)
        }

        val btnReserve: Button = findViewById(R.id.btnReserve)
        btnReserve.setOnClickListener {
            val intent = Intent(this, ModalReserve::class.java)
            startActivity(intent)
        }
    }
}
