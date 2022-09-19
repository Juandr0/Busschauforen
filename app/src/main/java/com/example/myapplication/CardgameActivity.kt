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
    var scoreP1 = 0
    var scoreP2 = 0
    var scoreP3 = 0
    var scoreP4 = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardgame_activity)

        initiatePlayerScoreViews()
        amountOfPlayers()




    }

    //Initierar de textviews som används för att visa poängställningen och knyter dem till
    //scoreP1-scoreP4 för att visa poängen
    fun initiatePlayerScoreViews() {

        playerOneScore = findViewById(R.id.counterOne)
        playerOneScore.text = scoreP1.toString()

        playerTwoScore = findViewById(R.id.counterTwo)
        playerTwoScore.text = scoreP2.toString()

        playerThreeScore = findViewById(R.id.counterThree)
        playerThreeScore.text = scoreP3.toString()

        playerFourScore = findViewById(R.id.counterFour)
        playerFourScore.text = scoreP4.toString()
    }


    fun amountOfPlayers() {
        val numOfPlayers = intent.getIntExtra("numOfPlayers", 0)

        if (numOfPlayers != 0){
            when (numOfPlayers.toString().toInt()) {
                1 -> {
                    playerTwoScore.visibility = View.INVISIBLE
                    playerThreeScore.visibility = View.INVISIBLE
                    playerFourScore.visibility = View.INVISIBLE
                }
                2 -> {
                    playerThreeScore.visibility = View.INVISIBLE
                    playerFourScore.visibility = View.INVISIBLE
                }
                3 -> {
                    playerFourScore.visibility = View.INVISIBLE

                }
        }

        }
    }
}




