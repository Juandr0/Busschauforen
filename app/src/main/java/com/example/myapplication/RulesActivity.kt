package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
/*

class AnswerAcitivty : AppCompatActivity() {

    lateinit var resultTextView : TextView
    lateinit var layout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_acitivty)

        var test = findViewById<ConstraintLayout>(R.id.activityView)
        resultTextView = findViewById(R.id.resultView)
        val button = findViewById<Button>(R.id.backButton)
        button.text = "Back"
        button.setOnClickListener{
            finish()
        }

 */
class RulesActivity : AppCompatActivity() {

    lateinit var rulesTitleView : TextView
    lateinit var backButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rules_activity)

        rulesTitleView = findViewById(R.id.rulesTitleView)
        rulesTitleView.text = "Regler"

        backButton = findViewById(R.id.backButton)
        backButton.text = "Tillbaka till huvudmenyn"
        backButton.setOnClickListener {
            finish()
        }
    }


}