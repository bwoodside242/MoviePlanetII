package com.example.movieplanet.model.results


data class TvResults (
    var adult: Boolean? = null,
    var backdrop_path: String? = null,
    var id: Int? = null,
    var name: String? = null,
    var original_language: String? = null,
    var original_name: String? = null,
    var overview: String? = null,
    var poster_path: String? = null,
    var media_type: String? = null,
    var genre_ids: ArrayList<Int?> = arrayListOf(),
    var popularity: Double? = null,
    var first_air_date: String? = null,
    var vote_average: Double? = null,
    var vote_count: Int? = null,
    var origin_country: ArrayList<Int?> = arrayListOf()
)
