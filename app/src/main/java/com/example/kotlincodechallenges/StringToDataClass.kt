package com.example.kotlincodechallenges

fun main () {
    val decks = listOf(
        Deck(
            name = "deck1",
            list = listOf(Card("card1"))
        ),
        Deck(
            name = "deck2",
            list = listOf(Card("card2"))
        )
    )
    println(decks.toString())
}

data class Deck(
    val name: String,
    val list: List<Card>
)

data class Card(
    val name: String
)