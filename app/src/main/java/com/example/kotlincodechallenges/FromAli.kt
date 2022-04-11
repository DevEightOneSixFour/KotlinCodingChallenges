package com.example.kotlincodechallenges

fun canMove(currentPos: Pair<Int,Int>, direction:String, R: Array<String>): Boolean{
    if(direction=="Left"){

        val row = currentPos.first
        val column = currentPos.second
        val newColumn = column - 1

        if(newColumn<0)
            return false

        if(R[row][newColumn]=='X')
            return false
    }

    if(direction=="Right"){

        val row = currentPos.first
        val column = currentPos.second
        val newColumn = column + 1

        if(newColumn>R[0].length-1)
            return false

        if(R[row][newColumn]=='X')
            return false
    }

    if(direction=="Up"){

        val row = currentPos.first
        val column = currentPos.second
        val newRow = row - 1

        if(newRow<0)
            return false

        if(R[newRow][column]=='X')
            return false
    }

    if(direction=="Down"){

        val row = currentPos.first
        val column = currentPos.second
        val newRow = row + 1

        if(newRow>R.size-1)
            return false

        if(R[newRow][column]=='X')
            return false
    }

    return true
}
fun turn(direction: String): String{

    if(direction=="Right")
        return "Down"

    if(direction=="Down")
        return "Left"

    if(direction=="Left")
        return "Up"

    if(direction=="Up")
        return "Right"

    return ""
}
fun move(currentPos:Pair<Int, Int>, direction: String): Pair<Int, Int>{

    var row = currentPos.first
    var column = currentPos.second

    if(direction=="Right")
        column++

    if(direction=="Left")
        column--

    if(direction=="Up")
        row--

    if(direction=="Down")
        row++

    return Pair(row, column)

}

fun solution(R: Array<String>): Int {
    // write your code in Kotlin 1.3.11 (Linux)


    var direction = "Right"
    var currentPos = Pair(0,0)
    var cleanCount = 1

    val list = ArrayList<String>()
    val list2 = ArrayList<String>()

    list.add(""+currentPos.first+","+currentPos.second+","+direction)
    list2.add(""+currentPos.first+","+currentPos.second)

    var flag = true

    while(flag){

        if(canMove(currentPos, direction, R)){
            currentPos = move(currentPos,direction)

            if(!list2.contains(""+currentPos.first+","+currentPos.second)){
                cleanCount++
                list2.add(""+currentPos.first+","+currentPos.second)
            }
        }

        else{
            direction = turn(direction)
        }

        if(list.contains(""+currentPos.first+","+currentPos.second+","+direction))
            flag = false

        else
            list.add(""+currentPos.first+","+currentPos.second+","+direction)
    }

    return cleanCount
}