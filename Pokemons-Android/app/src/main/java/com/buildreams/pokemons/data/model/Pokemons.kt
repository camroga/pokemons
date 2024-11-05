package com.buildreams.pokemons.data.model

import com.squareup.moshi.Json

data class Pokemons(
    @Json(name = "next") val nextPage: String,
    @Json(name = "previous") val previousPage: String,
    @Json(name = "results") val pokemons: List<Pokemon>
)
