package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class NumOfPlayersActivity : AppCompatActivity() {

    lateinit var amountOfPlayers : TextView
    lateinit var onePlayer : Button
    lateinit var twoPlayers : Button
    lateinit var threePlayers : Button
    lateinit var fourPlayers : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.numofplayers_activity)

        //Initierar- och sätter namn på texten samt knapparna för hur många som ska spela
        amountOfPlayers = findViewById(R.id.amountOfPlayersView)
        amountOfPlayers.text = "Hur många ska spela?"

        onePlayer = findViewById(R.id.onePlayer)
        onePlayer.text = "En spelare"

        twoPlayers = findViewById(R.id.twoPlayers)
        twoPlayers.text = "Två spelare"

        threePlayers = findViewById(R.id.threePlayers)
        threePlayers.text ="Tre spelare"

        fourPlayers = findViewById(R.id.fourPlayers)
        fourPlayers.text = "Fyra spelare"


    }
}