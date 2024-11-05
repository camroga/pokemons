package com.buildreams.pokemons.domain.repository

import com.buildreams.pokemons.data.datasource.PokemonRemote
import com.buildreams.pokemons.data.model.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val pokemonRemote: PokemonRemote) {
    fun getPokemon(id: Int): Flow<Pokemon> = flow {
        emit(pokemonRemote.getPokemon(id))
    }
}
