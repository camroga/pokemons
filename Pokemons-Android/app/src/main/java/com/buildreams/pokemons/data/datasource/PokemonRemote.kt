package com.buildreams.pokemons.data.datasource

import com.buildreams.pokemons.data.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonRemote {
    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("id") id: Int): Pokemon
}
