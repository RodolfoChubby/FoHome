package com.example.fofoflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ModalProperty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modal_property)

        val btnSaveProperty: Button = findViewById(R.id.btnSaveProperty)
        btnSaveProperty.setOnClickListener {
            val intent = Intent(this, PropiedadesPage::class.java)
            startActivity(intent)
        }
    }
}
