package com.example.kotlincodechallenges.lowes
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

/*
 * Input : cdabfefacce
*OutPut : 2aa1b3ccc1d2ee2ff

OutPut : dddaa
Input : 2a3d
*/

fun main() {

    for (i in 1..60) {
        println("Integer: $i")
//        println("Bit:${Integer.toBinaryString(i)} ")
//        println("UInt:${i.toUInt().toString(radix = 2)} ")
        println("Bit to4BitString:${i.to4bitString()} ")
        println("Bit to32BitString:${i.to32bitString()} ")

    }
//    println(02.0002)
//    println(encryptText("cdabfefacce"))
//    println(encryptText("dddaa"))
}

fun Int.to4bitString(): String =
    Integer.toBinaryString(this).padStart(Int.SIZE_BYTES, '0')
fun Int.to32bitString(): String =
    Integer.toBinaryString(this).padStart(Int.SIZE_BITS, '0')

// stores the letter and number of times the letter appears in a map
// sorts the original text in ascending order
// places the number of occurrences in front of the respective letter(s)
private fun encryptText(text: String): String {
    val charsMap = mutableMapOf<Char, Int>()
    val sb = StringBuilder()

    // Sort first
    val sorted = text.toCharArray()
    val newText = sorted.sorted().joinToString("")

    newText.forEach {
        charsMap[it] = charsMap.getOrDefault(it, 0) + 1
    }

    charsMap.keys.forEach {
        sb.append(charsMap.getOrDefault(it, 0))

        for (i in 0 until charsMap.getOrDefault(it, 0)) {
            sb.append(it)
        }
    }

    println(charsMap.toString()) // debug

    return sb.toString()
}
/*
/*
 * Input : cdabfefacce
*OutPut : 2aa1b3ccc1d2ee2ff

OutPut : dddaa
Input : 2a3d
*/

fun main() {
    println(encryptText("cdabfefacce"))
}

private fun encryptText(text: String): String {
    val charsMap = mutableMapOf<Char, Int>()
    val sb = StringBuilder()

    // Sort first
    val sorted = text.toCharArray()
    val newText = sorted.sorted().joinToString("")

    newText.forEach {
        charsMap[it] = charsMap.getOrDefault(it, 0) + 1
    }

    charsMap.keys.forEach {
        sb.append(charsMap.getOrDefault(it, 0))

        for (i in 0..charsMap.getOrDefault(it, 0) - 1) {
        	sb.append(it)
        }
    }

    //fprintln(charsMap.toString()) // debug

    return sb.toString()
}
 */