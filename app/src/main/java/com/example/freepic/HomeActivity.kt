package com.example.freepic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var cardNature: CardView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cardNature = findViewById(R.id.mCardNature)



        cardNature.setOnClickListener{
            startActivity(Intent(applicationContext,MenuActivity::class.java))
        }


    }
}