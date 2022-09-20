package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView


class Player (var name : String){

}


class Card (var name : String, var isFaceCard : Boolean = false) {
}



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

        var deckOfCards = initiateDeckOfCards()
        deckOfCards.shuffle()

        initiatePlayerScoreViews()
        amountOfPlayers()
        asignCardsToPyramid(deckOfCards)
        

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

    fun asignCardsToPyramid(cardList : MutableList<Card>){

    }

    fun initiateDeckOfCards () : MutableList<Card>{

        var cardList = mutableListOf<Card>()

        //Spader
        cardList.add(Card("ace_of_spades"))
        cardList.add(Card("two_of_spades"))
        cardList.add(Card("three_of_spades"))
        cardList.add(Card("four_of_spades"))
        cardList.add(Card("five_of_spades"))
        cardList.add(Card("six_of_spades"))
        cardList.add(Card("seven_of_spades"))
        cardList.add(Card("eight_of_spades"))
        cardList.add(Card("nine_of_spades"))
        cardList.add(Card("ten_of_spades"))
        cardList.add(Card("knight_of_spades", isFaceCard = true))
        cardList.add(Card("queen_of_spades", isFaceCard = true))
        cardList.add(Card("king_of_spades", isFaceCard = true))

        //Hjärter
        cardList.add(Card("ace_of_hearts"))
        cardList.add(Card("two_of_hearts"))
        cardList.add(Card("three_of_hearts"))
        cardList.add(Card("four_of_hearts"))
        cardList.add(Card("five_of_hearts"))
        cardList.add(Card("six_of_hearts"))
        cardList.add(Card("seven_of_hearts"))
        cardList.add(Card("eight_of_hearts"))
        cardList.add(Card("nine_of_hearts"))
        cardList.add(Card("ten_of_hearts"))
        cardList.add(Card("knight_of_hearts", isFaceCard = true))
        cardList.add(Card("queen_of_hearts", isFaceCard = true))
        cardList.add(Card("king_of_hearts", isFaceCard = true))

        //Klöver

        cardList.add(Card("ace_of_clubs"))
        cardList.add(Card("two_of_clubs"))
        cardList.add(Card("three_of_clubs"))
        cardList.add(Card("four_of_clubs"))
        cardList.add(Card("five_of_clubs"))
        cardList.add(Card("six_of_clubs"))
        cardList.add(Card("seven_of_clubs"))
        cardList.add(Card("eight_of_clubs"))
        cardList.add(Card("nine_of_clubs"))
        cardList.add(Card("ten_of_clubs"))
        cardList.add(Card("knight_of_clubs", isFaceCard = true))
        cardList.add(Card("queen_of_clubs", isFaceCard = true))
        cardList.add(Card("king_of_clubs", isFaceCard = true))

        //Ruter
        cardList.add(Card("ace_of_diamonds"))
        cardList.add(Card("two_of_diamonds"))
        cardList.add(Card("three_of_diamonds"))
        cardList.add(Card("four_of_diamonds"))
        cardList.add(Card("five_of_diamonds"))
        cardList.add(Card("six_of_diamonds"))
        cardList.add(Card("seven_of_diamonds"))
        cardList.add(Card("eight_of_diamonds"))
        cardList.add(Card("nine_of_diamonds"))
        cardList.add(Card("ten_of_diamonds"))
        cardList.add(Card("knight_of_diamonds", isFaceCard = true))
        cardList.add(Card("queen_of_diamonds", isFaceCard = true))
        cardList.add(Card("king_of_diamonds", isFaceCard = true))



    return cardList
    }
}




