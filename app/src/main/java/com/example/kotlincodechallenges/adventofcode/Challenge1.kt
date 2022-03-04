package com.example.kotlincodechallenges.adventofcode

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import java.io.File
import java.io.IOException
import java.lang.StringBuilder

/*
Suppose you had the following report:

199
200
208
210
200
207
240
269
260
263
This report indicates that, scanning outward from the submarine, the sonar sweep found depths of 199, 200, 208, 210, and so on.

The first order of business is to figure out how quickly the depth increases, just so you know what you're dealing with - you never know if the keys will get carried into deeper water by an ocean current or a fish or something.

To do this, count the number of times a depth measurement increases from the previous measurement. (There is no measurement before the first measurement.) In the example above, the changes are as follows:

199 (N/A - no previous measurement)
200 (increased)
208 (increased)
210 (increased)
200 (decreased)
207 (increased)
240 (increased)
269 (increased)
260 (decreased)
263 (increased)
In this example, there are 7 measurements that are larger than the previous measurement.

How many measurements are larger than the previous measurement?
Given input: "https://adventofcode.com/2021/day/1/input"
*/

fun main() {
    val inputStream = File("AOC_Challenge_1.txt").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)
//    val array : Array<Int> by lazy {
//        getHtmlFromWeb()
//    }
}

private fun readBigFile(fileName: String) = File(fileName).useLines {
//    it.toList()
    println(it)
}