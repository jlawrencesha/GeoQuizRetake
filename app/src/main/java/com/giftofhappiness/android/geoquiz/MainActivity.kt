package com.giftofhappiness.android.geoquiz

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button




class MainActivity : AppCompatActivity() {


    private lateinit var trueButton:Button
    private lateinit var falseButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        //this code uses a lamda expression 'a function literal')
        //this was used by the programmer from west africa to use the 'invoke' function?
        trueButton.setOnClickListener { view: View ->

        }

        falseButton.setOnClickListener { view: View ->

        }

    }
}