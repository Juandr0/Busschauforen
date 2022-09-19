package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CardgameActivity : AppCompatActivity() {

    lateinit var playerOneScore : TextView
    lateinit var playerTwoScore : TextView
    lateinit var playerThreeScore : TextView
    lateinit var playerFourScore : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardgame_activity)

        playerOneScore = findViewById(R.id.counterOne)

        playerTwoScore = findViewById(R.id.counterTwo)
        playerTwoScore.visibility= View.INVISIBLE

        playerThreeScore = findViewById(R.id.counterThree)
        playerThreeScore.visibility= View.INVISIBLE

        playerFourScore = findViewById(R.id.counterFour)
        playerFourScore.visibility= View.INVISIBLE


    }
}




