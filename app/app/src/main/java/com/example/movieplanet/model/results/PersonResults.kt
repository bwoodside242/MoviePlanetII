package com.example.movieplanet.model.results

data class PersonResults(
    var adult: Boolean? = null,
    var id: Int? = null,
    var name: String? = null,
    var original_name: String? = null,
    var media_type: String? = null,
    var popularity: Double? = null,
    var gender: Int? = null,
    var known_for_department: String? = null,
    var profile_path: String? = null,
    var known_for: ArrayList<MovieResults> = arrayListOf()
)
