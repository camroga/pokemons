package com.buildreams.pokemons.data.model

import com.squareup.moshi.Json

data class pokemon(
    val id: Int,
    val name: String,
    @Json(name = "base_experience") val baseExperience: Int
)
