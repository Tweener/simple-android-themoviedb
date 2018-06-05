package com.tweener.simplemoviedb.core.api.entity

import com.google.gson.annotations.SerializedName

/**
 * @author Vivien Mahe
 */
class ApiMovies(
        var page: Int? = 1,
        var results: List<ApiMovie> = ArrayList(),
        var success: Boolean? = true,
        @SerializedName("status_message") var statusMessage: String? = null,
        @SerializedName("status_code") var statusCode: Int? = 0
)