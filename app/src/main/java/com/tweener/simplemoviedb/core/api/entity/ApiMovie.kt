package com.tweener.simplemoviedb.core.api.entity

import com.google.gson.annotations.SerializedName

/**
 * @author Vivien Mahe
 */
class ApiMovie(
        var id: Int? = 0,
        @SerializedName("original_title") var originalTitle: String? = null,
        var overview: String? = null,
        @SerializedName("vote_average") var voteAverage: Float? = 0f,
        @SerializedName("release_date") var releaseDate: String? = null,
        @SerializedName("poster_path") var posterPath: String? = null
)