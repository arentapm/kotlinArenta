package com.example.kotlinarenta

class aquarium3_2 {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}
fun buildAquarium3_2() {
    val myAquarium = aquarium3_2()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium3_2()
}
