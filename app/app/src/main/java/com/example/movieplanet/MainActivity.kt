package com.example.movieplanet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.example.movieplanet.http.RequestHandler
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private val gson = Gson()
    private val client = AsyncHttpClient()
    private val params = RequestParams()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val personRV = findViewById<RecyclerView>(R.id.trending_people_RV)
        RequestHandler.getTrendingPeople(personRV)


        val movieRV = findViewById<RecyclerView>(R.id.trending_movie_RV)
        movieRV.layoutManager = LinearLayoutManager(this)
        RequestHandler.getTrendingMovies(movieRV)
    }
}