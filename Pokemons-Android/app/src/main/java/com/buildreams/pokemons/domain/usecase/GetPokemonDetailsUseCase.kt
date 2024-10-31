package com.buildreams.pokemons.domain.usecase

import com.buildreams.pokemons.data.model.Pokemon
import com.buildreams.pokemons.domain.repository.PokemonRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetPokemonDetailsUseCase @Inject constructor(private val repository: PokemonRepository) {
    suspend operator fun invoke(id: Int): Flow<Pokemon> {
        return repository.getPokemon(id)
    }
}