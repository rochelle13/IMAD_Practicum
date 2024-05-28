package com.example.screentimeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val dateTv = findViewById<TextView>(R.id.edtDate);
        val amTimeTv = findViewById<TextView>(R.id.txtTimeAm);
        val pmTimeTv = findViewById<TextView>(R.id.txtTimePm);
        val actNotesTv = findViewById<TextView>(R.id.txtNotes);

        var counter: Int = 0;
        var i: Int = 0;
        var display: String = "";

        val day : Array<String>  = emptyArray();
        val morningTime : Array<Int>  = emptyArray();
        val afternoonTime : Array<Int>  = emptyArray();
        val actNotes : Array<String>  = emptyArray();


        val btnInsert: Button =findViewById<Button>(R.id.btnInsert)
        val btnDetails: Button = findViewById<Button>(R.id.btnDetails)
        val btnClear: Button = findViewById<Button>(R.id.btnClear)

        //Button to navigate to Details View
        btnDetails.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        btnInsert.setOnClickListener {
            day[i] = dateTv.text.toString();
            morningTime[i] = amTimeTv.text.toString().toInt();
            afternoonTime[i] = pmTimeTv.text.toString().toInt();
            actNotes[i] = actNotesTv.text.toString();

            i++;
        }

        btnClear.setOnClickListener{
            dateTv.text = null;
            amTimeTv.text = null;
            pmTimeTv.text = null;
            actNotesTv.text = null;

            while (counter < day.count()) {
                display += "${day[counter]}${morningTime[counter]}${afternoonTime[counter]}${actNotes[counter]}\n";
                counter++
            }
           ;
        }
    }



}


