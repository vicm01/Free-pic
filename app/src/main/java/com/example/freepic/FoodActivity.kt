package com.example.freepic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FoodActivity : AppCompatActivity() {
    lateinit var cardNature: CardView
    lateinit var cardCars: CardView
    lateinit var cardWallpaper: CardView
    lateinit var cardFood: CardView
    lateinit var cardCities: CardView
    lateinit var cardCoast: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        cardNature = findViewById(R.id.mCardNature)
        cardCars = findViewById(R.id.mCardCars)
        cardWallpaper = findViewById(R.id.mCardWallpapers)
        cardFood = findViewById(R.id.mCardFood)
        cardCities = findViewById(R.id.mCardCities)
        cardCoast = findViewById(R.id.mCardCoast)



        cardNature.setOnClickListener{
            startActivity(Intent(applicationContext,FoodOneActivity::class.java))
        }
        cardCars.setOnClickListener {
            startActivity(Intent(applicationContext,FoodTwoActivity::class.java))
        }
        cardWallpaper.setOnClickListener {
            startActivity(Intent(applicationContext, FoodThreeActivity::class.java))
        }
        cardFood.setOnClickListener {
            startActivity(Intent(applicationContext, FoodFourActivity::class.java))
        }
        cardCities.setOnClickListener {
            startActivity(Intent(applicationContext, FoodFiveActivity::class.java))
        }
        cardCoast.setOnClickListener {
            startActivity(Intent(applicationContext, FoodSevenActivity::class.java))
        }

    }
}