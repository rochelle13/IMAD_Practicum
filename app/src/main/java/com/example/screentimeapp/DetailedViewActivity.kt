package com.example.screentimeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class DetailedViewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val displayData = intent.getStringExtra("DISPLAY_DATA")
        tvDetails.text = displayData

        //val tvAvg = findViewById<TextView>(R.id.tvAvg)
        //val displayAverage = intent.getStringExtra("DISPLAY_DATA_AVG")
        //tvAvg.text = displayAverage


        btnMainMenu.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
        }
    }
}