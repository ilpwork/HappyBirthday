package com.example.happybirthday

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
            val dice = Dice(6, "RED");
            val rollText: TextView = findViewById(R.id.textView3);
            rollText.text = dice.roll().toString();
            rollText.setBackgroundColor(Color.parseColor(dice.color));
        }
    }
}