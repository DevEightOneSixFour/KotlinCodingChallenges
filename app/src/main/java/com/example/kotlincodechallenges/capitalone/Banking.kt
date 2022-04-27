package com.example.kotlincodechallenges.capitalone

import android.graphics.SumPathEffect


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
    val bank = Banking(listOf(10,100,20,50,30))

//    bank.withdraw(1,10)
//    bank.transfer(4,0,20)
//    bank.deposit(4, 20)
//    bank.transfer(2, 3, 15)

    bank.withdraw(2,10)
    bank.transfer(5,1,20)
    bank.deposit(5, 20)
    bank.transfer(3,4,15)

    println(bank.currentBalances())
}

class Banking(private val balances: List<Int>) {

    private val balanceToChange: ArrayList<Int> = ArrayList(balances)
    /*
        "from" Account id to transfer money from
        "to" Account id to transfer money to
        "sum" Amount of money to transfer
        "return" if successful
     */
    fun transfer(from: Int, to: Int, sum: Int): Boolean {
        if (isInvalidAccount(from) ||
            isInvalidAccount(to)) {
            println("Invalid Account Number")
            return false
        }
        if (overdrawCheck(from, sum)) {
            println("Overdraw")
            return false
        }
        balanceToChange[from] -= sum
        balanceToChange[to] += sum
        return true
    }

    /*
        "to" Account id to add money to
        "sum" Amount to add
     */
    fun deposit(to: Int, sum: Int) {
        if (isInvalidAccount(to)) {
            println("Invalid Account Number")
            return
        }
        balanceToChange[to] += sum
    }

    /*
        "from" Account id
        "sum" amount
        "return" successful?
     */
    fun withdraw(from: Int, sum: Int): Boolean {
        if (isInvalidAccount(from)) {
            println("Invalid Account Number")
            return false
        }
        if (overdrawCheck(from, sum)) {
            println("Overdraw from account ${balanceToChange[from]}")
            return false
        }

        balanceToChange[from] -= sum
        return true
    }

    fun currentBalances(): List<Int> = balanceToChange

    // checks if acctNum is within the balances list
    // return false is cannot find number
    private fun isInvalidAccount(acctNum: Int): Boolean = balanceToChange.getOrNull(acctNum) == null

    private fun overdrawCheck(acctNum: Int, sum: Int): Boolean = balanceToChange[acctNum] < sum

}