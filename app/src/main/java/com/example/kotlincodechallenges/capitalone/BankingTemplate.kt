package com.example.kotlincodechallenges.capitalone

/*
    Example:
    Initial Balance: [10,100,20,50,30]
    withdraw(1,10)
    transfer(4, 0, 20)
    deposit(4, 20)
    transfer(2, 3, 15)
    Result: [30, 90, 5, 65, 30]
 */
fun main() {
    // Tester values
    val bank = Banking(listOf(10, 100, 20, 50, 30))

    // Example Values
    bank.withdraw(1, 10)
    bank.transfer(4, 0, 20)
    bank.deposit(4, 20)
    bank.transfer(2, 3, 15)

    // Interview Values
//    bank.withdraw(2,10)
//    bank.transfer(5,1,20)
//    bank.deposit(5, 20)
//    bank.transfer(3,4,15)

}

class BankingTemplate(private val balances: List<Int>) {

    /*
        "from" Account id to transfer money from
        "to" Account id to transfer money to
        "sum" Amount of money to transfer
        "return" if transaction was successful
     */
    fun transfer(from: Int, to: Int, sum: Int): Boolean = TODO()

    /*
        "to" Account id to add money to
        "sum" Amount to add
     */
    fun deposit(to: Int, sum: Int): Unit = TODO()

    /*
        "from" Account id
        "sum" amount
        "return" successful?
     */
    fun withdraw(from: Int, sum: Int): Boolean = TODO()

    fun currentBalances(): List<Int> = TODO()

}