package com.example.kotlinarenta
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Destructuring assignment
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

// Skip properties using _
    val (rock2, _, diver2) = d5
    println(rock2)
    println(diver2)
}

fun main() {
    makeDecorations()
    makeDecorations2()
}