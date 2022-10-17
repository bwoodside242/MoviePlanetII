package com.example.movieplanet.model.base

import com.example.movieplanet.model.results.MovieResults

data class MovieModel(
    val page : Int? = null,
    val results: ArrayList<MovieResults> = arrayListOf(),
    val total_page: Int? = null,
    val total_results: Int? = null
)
