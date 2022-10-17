package com.example.movieplanet.model.base

import com.example.movieplanet.model.results.TvResults


data class TvModel (
    val page : Int? = null,
    val results: ArrayList<TvResults> = arrayListOf(),
    val total_page: Int? = null,
    val total_results: Int? = null
)