package com.giftofhappiness.android.geoquiz

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


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
        //look at this again in the future.
        trueButton.setOnClickListener { view: View ->

            Toast.makeText(this,"TrueButton Has been pressed.", Toast.LENGTH_SHORT).show()



        }

        falseButton.setOnClickListener { view: View ->
            Toast.makeText(this, "false button has been pressed.", Toast.LENGTH_SHORT).show()
        }

    }
}