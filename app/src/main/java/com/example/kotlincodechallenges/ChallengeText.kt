package com.example.kotlincodechallenges

/*Create this Person class to be used has a Key of a HashMap
public class PersonEtrade {

    private String firstName;
    private String lastName;
    private List<String> nickNames;

    public PersonEtrade(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getNickNames() {
        return nickNames;
    }
}
*/

/*
Input: index Int, value String

Output: Array of Strings representing a chunk

The value ordered by ID is ["aaa", "bbb", "cccc", "dddd", "eeee"]

Create a class that

OrderedStrema os = new OrderedStream(5);

os.insert(3,"cccc"); // Inserts (3, "cccc"), returns []
os.insert(1, "aaaa"); // Inserts (1, "aaaa"), returns ["aaaa"]
os.insert(2, "bbbb"); // Inserts (2, "bbbb"), returns ["bbbb","cccc"]
os.insert(5, "eeee"); // Inserts (5, "eeee"), returns []
os.insert(4, "dddd"); // Inserts (4, "dddd"), returns ["dddd", "eeee"]

5,4,3,2,1
[],[],[],[],["a","b","c","d","e"]

 */

/*
/*
 * The implementation of this ordered stream was inspired by the youtube video player
 * */
class OrderedStream(private val size: Int){
    val playedData = mutableListOf<String>()//This val will hold ALL the data in a list format
    var playBuffer = 0//This will represent the red bar on the youtube video player
    var loadBuffer = 0//This will represent the grey bar on the youtube video player

    fun insert(index: Int, data: String):String{
		putDataIntoPlace(index-1, data)//When we get the data we need to put it in the right place
       	//printData()
       return getDataToShow()//Then we show the data based on certain conditions
    }


    fun putDataIntoPlace(realIndex: Int, data: String){
        //Here, if the loadBuffer is less than the index the data is supposed to be in, then..
        if(loadBuffer < realIndex){
            //We will add placeholders up to the index
            while(loadBuffer < realIndex){
                playedData.add("")
                loadBuffer++
            }
            //And then add the data at the index
			playedData.add(data)
        	loadBuffer++
        }
        //If equal to the index the data is supposed to be in
        else if(loadBuffer == realIndex){
            //Then we simply add the data and increment the load buffer
            playedData.add(data)
			loadBuffer++
        }
		//However, if the loadbuffer is pass the index the data is supposed to be in..
		else{
            //then we will replaced the placehoder "" with the actual data
            playedData.set(realIndex, data)
        }
    }

    fun getDataToShow(): String{
        //First we will create a list to hold the data we will show
        val dataToShow = mutableListOf<String>()
        //While the playbuffer is behind the load buffer
        while(playBuffer != loadBuffer){
            //When the playbuffer hits a point without data
            if(playedData[playBuffer] == ""){
                //we will imidiately stop moving forward and return any data we loaded to show
                //Note, there could be no data loaded but that's fine
            	return dataToShow.toString()
        	}
        	else{
                //Otherwise, as long as there is data to show, we will load it
                //and increment the playbuffer
            	dataToShow.add(playedData[playBuffer])
            	playBuffer++
        	}
        }
        //If the player buffer catches up to the load buffer, then we return the data we loaded to show
        return dataToShow.toString()
    }

    //Print data just a helper function for debuging
    fun printData(){
		println(playedData.toString())
        println(playBuffer.toString())
        println(loadBuffer.toString())
    }
}

fun main() {
    println("Starting test 1")
    val test = OrderedStream(5)
     println(test.insert(3,"cccc"))
     println(test.insert(1,"aaaa"))
     println(test.insert(2,"bbbb"))
     println(test.insert(5,"eeee"))
     println(test.insert(4,"dddd"))

     println("Starting test 2")
     val test2 = OrderedStream(5)
     println(test2.insert(1,"aaaa"))
     println(test2.insert(2,"bbbb"))
     println(test2.insert(3,"cccc"))
     println(test2.insert(4,"dddd"))
     println(test2.insert(5,"eeee"))

     println("Starting test 3")
     val test3 = OrderedStream(5)
     println(test3.insert(5,"eeee"))
     println(test3.insert(4,"dddd"))
     println(test3.insert(3,"cccc"))
     println(test3.insert(2,"bbbb"))
     println(test3.insert(1,"aaaa"))
}
 */

// get a string and count the occurrences in the string
/*
    "hello world"
    h -> 1
    e -> 1
    l -> 3
    o -> 2
    w -> 1
    d -> 1
 */

fun main() {
    countThisString("hello world")
}

fun countThisString(str: String) {
    val newMap = mutableMapOf<Char, Int>()

    for (i in str){
        if (i == ' '){
            continue
        } else if (!newMap.contains(i)){
            newMap[i] = 1
        } else {
            newMap[i] = newMap.getValue(i) + 1
        }
    }

    for ((key, value) in newMap) {
        println("$key -> $value")
    }
}