package com.example.kotlincodechallenges.allyfinancial

val board = arrayOf(
    arrayOf(' ', ' ', ' '),
    arrayOf(' ', ' ', ' '),
    arrayOf(' ', ' ', ' ')
)
fun main() {
    val x = 'X'
    val o = 'O'

    determineWinner(x)
    determineWinner(o)
}

fun determineWinner(player: Char) {
    val columnWin = hasFilledOneColumn(player)
    val diagonalWin = hasFilledOneDiagonal(player)
    val rowWin = hasFilledOneRow(player)

    when {
        columnWin && diagonalWin -> {
            println("$player has won by column & diagonal")
        }
        columnWin && rowWin -> {
            println("$player has won by column & row")
        }
        rowWin && diagonalWin -> {
            println("$player has won by row & diagonal")
        }
        columnWin -> {
            println("$player has won by column")
        }
        diagonalWin -> {
            println("$player has won by diagonal")
        }
        rowWin -> {
            println("$player has won by row")
        }
    }
}

private fun hasFilledOneRow(input: Char): Boolean {
    for (i in 0..2) {
        if (input == board[i][0] && input == board[i][1] && input == board[i][2]) {
            return true
        }
    }
    return false
}

private fun hasFilledOneColumn(input: Char): Boolean {
    for (i in 0..2) {
        if (input == board[0][i] && input == board[1][i] && input == board[2][i]) {
            return true
        }
    }
    return false
}

private fun hasFilledOneDiagonal(input: Char): Boolean {
    return ((input == board[0][0] && input == board[1][1] && input == board[2][2])
            || (input == board[0][2] && input == board[1][1] && input == board[2][0]))
}