internal object GFG {
    fun printRLE(s: String) {
        var i = 0
        while (i < s.length) {


            // Counting occurrences of s[i]
            var count = 1
            while (i + 1 < s.length
                && s[i]
                == s[i + 1]
            ) {
                i++
                count++
            }
            print(
                s[i]
                    .toString() + "" + count + " "
            )
            i++
        }
        println()
    }

    // Driver code
    @JvmStatic
    fun main(args: Array<String>) {
        printRLE("GeeeEEKKKss")
        printRLE("ccccOddEEE")
    }
}