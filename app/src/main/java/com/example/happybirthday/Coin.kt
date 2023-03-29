package com.example.happybirthday

fun main() {
    val coin = Coin();
    println(coin.flip())
}

class Coin {
    fun flip(): String{
        return if((0..1).random() == 1)  "Орел" else "Решка"
    }
}