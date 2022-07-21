package com.example.kotlincodechallenges.jpmc

import retrofit2.http.Query

/*

// step 1
@Dao
class ContactsDao {
	@Query(“select NAME from CONTACTS where NAME like ‘$y%’)
	fun filterNames(y:Char): List<String>
}

//step 3
val ContactsDao = ContactsDao()

println(contactsDao.filterNames('y'))

 */
//

// Alvin
// Motasem
// molly
// munchkin
// Moss

//
//@Entity
//data class Contact(
//    val names: List<Name>
//)
//
//@Entity
//data class Name (val id: Int, val value: String)
//
//@Dao
//class ContactsDao {
//    // gets all Names by the given 'letter'
//    @Query("select NAME from CONTACTS where NAME like ‘$letter%’")
//    fun getNamesByLetter(letter: Char): List<String>
//
//
//}
//
//class ShowNames {
//    val dao = ContactsDao()
//
//    val listOfNames = dao.getNamesByLetter('j')
//
//    println(listOfNames)
//}
//
//fun displayNames(letter: Char): List<String> {
//    val listToDisplay = mutableListOf<String>()
//    val database = OurDatabase()
//    val query = "SELECT NAME FROM CONTACTS WHERE NAME LIKE '$letter'"
//    val queryResult = database.rawQuery(query,null)
//    while(queryResult.moveToFirst)
//}