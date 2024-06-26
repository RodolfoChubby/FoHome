package com.example.fofoflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciarsesion)

        val btnHome: Button = findViewById(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, PropiedadesPage::class.java)
            startActivity(intent)
        }
    }
}