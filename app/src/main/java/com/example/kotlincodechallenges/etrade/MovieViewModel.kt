package com.example.kotlincodechallenges.etrade

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import retrofit2.Response
import retrofit2.http.GET

class MovieViewModel(val repo: MovieRepo): ViewModel() {
    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>>
        get() = _movieList

    private val _uiState = MutableLiveData<State>()
    val uiState: LiveData<State>
        get() = _uiState

    fun getMovieListCall() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = repo.getMovies()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    // livedata.value for mainThread
                    // livedata.postValue() for background thread
                    _movieList.value = response.body()
                    _uiState.value = State.Success(response.body() as DataModel)
                } else {
                    _uiState.value
                }
            }


        }
    }

    fun fetchData() {
        _uiState.postValue(State.Loading)
        getMovieListCall()
    }
}

class MovieRepo(private val service: MovieService) {
    suspend fun getMovies() = service.getMovies()
}

interface MovieService{

    @GET("movies") // https://www.getMeMovies.com/
    suspend fun getMovies(): Response<List<Movie>>
}

class ViewClass {
//    val movieRepo = MovieRepo()
//    val movieViewModel by lazy { ViewModel(movieRepo)}
}

data class Movie(
    val id: Int,
    val name: String,
    val rating: Double
)

