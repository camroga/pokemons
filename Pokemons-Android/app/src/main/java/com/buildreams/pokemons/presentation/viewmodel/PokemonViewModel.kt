package com.buildreams.pokemons.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.buildreams.pokemons.data.model.Pokemon
import com.buildreams.pokemons.domain.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(private val repository: PokemonRepository) :
    ViewModel() {

    private val _pokemon = MutableStateFlow<Pokemon?>(null)
    val pokemon: StateFlow<Pokemon?> get() = _pokemon

    fun fetchPokemon(id: Int) {
        viewModelScope.launch {
            repository.getPokemon(id).collect { result ->
                _pokemon.value = result
            }
        }
    }
}
