package com.example.screentimeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailedViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)


        btnMainMenu.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
        }
    }
}