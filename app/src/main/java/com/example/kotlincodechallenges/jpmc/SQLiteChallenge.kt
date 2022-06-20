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
//    fun getNamesByGivenLetter(letter: Char): List<Name>
//
//
//}
//
//class ShowDatabaseData {
//    val dao = ContactsDao()
//
//    val listOfNames = dao.getNamesByGivenLetter('a')
//
//    println(listOfNames)
//}
