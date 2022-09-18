package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   lateinit var startButton : Button
   lateinit var rulesButton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.startButton)
        startButton.text ="Starta spelet"
        rulesButton = findViewById(R.id.rulesButton)
        rulesButton.text ="Regler"


    }



}