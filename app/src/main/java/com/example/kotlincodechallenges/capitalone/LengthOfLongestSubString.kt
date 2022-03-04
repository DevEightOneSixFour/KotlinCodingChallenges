package com.example.kotlincodechallenges.capitalone

fun main() {
    println(lengthOfLongestSubstring("pwwkew"))
    println(lengthOfLongestSubstringd("pwwkew"))
    println(lengthOfLongestSubstring7("pwwkew"))
}
fun lengthOfLongestSubstring(s: String): Int {
    val inWindow = HashSet<Char>()

    var slow = 0
    var fast = 0
    var maxDistinct = 0

    while (fast in s.indices) {
        while (!inWindow.add(s[fast])) inWindow.remove(s[slow++])
        maxDistinct = maxOf(maxDistinct, (++fast) - slow)
    }

    return maxDistinct
}

fun lengthOfLongestSubstringd(s: String): Int {
    val set = HashMap<Char, Int>()
    var left = 0
    var right = 0
    var result = 0

    while (left < s.length && right < s.length) {
        val element = s[right]
        if (set.contains(element)) left = kotlin.math.max(left, set[element]!!.plus(1))
        set[element] = right
        result = kotlin.math.max(result, right - left + 1)
        right += 1
    }

    return result
}

fun lengthOfLongestSubstring7(s: String): Int {
    val set = mutableSetOf<Char>()

    var maxLength = 0
    var currLength = 0
    var start = 0
    var end = 0

    while (start < s.length) {
        if (set.add(s[end])) {
            end++
            currLength++
            maxLength = Math.max(currLength, maxLength)
            if (end < s.length) continue
        }

        start++
        end = start
        currLength = 0
        set.clear()
    }
    return maxLength
}


// windows.FlagSecure