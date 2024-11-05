package com.buildreams.pokemons.data.model

import com.squareup.moshi.Json

data class Pokemon(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "base_experience") val baseExperience: Int
)
