package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivityDice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_birtday_dice)

        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
            val dice = Dice(6, "RED");
            val rollImage: ImageView = findViewById(R.id.imageView2);
            when (dice.roll()) {
                1 -> rollImage.setImageResource(R.drawable.dice_1);
                2 -> rollImage.setImageResource(R.drawable.dice_2);
                3 -> rollImage.setImageResource(R.drawable.dice_3);
                4 -> rollImage.setImageResource(R.drawable.dice_4);
                5 -> rollImage.setImageResource(R.drawable.dice_5);
                6 -> rollImage.setImageResource(R.drawable.dice_6);
            }

        }
    }
}