package com.example.kotlincodechallenges.eitchallenge

// fail
fun main() {

    if(isStringHasUniqe("abc")){
        print("true")
    }else{

        print("false")
    }
}
fun isStringHasUniqe(inputString:String):Boolean {

    val hmap = HashMap<Char, Int>()
    val length = inputString.length
    var tag = false
    for(ch in inputString)
    {
        hmap.put(ch,1)

    }
    for(ch in inputString)
    {
        if (hmap.contains(ch)){
                tag = false
            }else
        {
            tag = true
        }

    }

    return tag
}
