package com.example.happybirthday

import android.graphics.Color

fun main() {
    val myFirstDice = Dice(6, "Red")
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    val mySecondDice = Dice(20, "Black")
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int, color: String)  {

    fun roll(): Int {
        return (1..numSides).random()
    }
}