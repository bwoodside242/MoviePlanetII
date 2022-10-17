package com.example.movieplanet.model.base

import com.example.movieplanet.model.results.PersonResults

data class PersonModel (
    val page : Int? = null,
    val results: ArrayList<PersonResults> = arrayListOf(),
    val total_page: Int? = null,
    val total_results: Int? = null
)