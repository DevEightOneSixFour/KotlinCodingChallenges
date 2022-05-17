package com.example.kotlincodechallenges.zzzed

/**
// Second Code Challenge: Complete ViewModel using repo and Livedata


import java.io.*;

import java.util.*;

// To execute Kotlin code, please define a top level function named main

fun main() {

for (i in 1..5) println("Hello, World!")

}

/** Display list of Movies by fetching the data online:

* Presentation: Render list of movies

* Network: Fetch list over network

*/

// UI movies shows list of movies

// UI show toast for n/w error

MoviesViewModel @Inject constructor(

moviesRepo: MoviesRepo

): ViewModel () {

private _movies = MutableLivedata<List<Movie>>()

val movies = LiveData<List<Movie>>

get() = _movies

fun fetchMovies(errorHandler: (String) -> Unit) {

// We need to add Exception Handler for coroutines

val handler = CoroutineExceptionHandler { _, exception ->

// Show the toast or message throughout a Unit function or something else

errorHandler.invoke(e.message)

}

viewModelScope.launch(handler) {

val movies = moviesRepo.getMovies()

withContext(Dispatchers.Main) {

_movies.value = movies

}

}

}

}

class MoviesRepoImpl: MoviesRepo {

override suspend fun getMovies: List<Movie>() {

// some logic here using coroutines

}

}

interface MoviesRepo {

suspend fun getMovies: List<Movie>()

}

*/