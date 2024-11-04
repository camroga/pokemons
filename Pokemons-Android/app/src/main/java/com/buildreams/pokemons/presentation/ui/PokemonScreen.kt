package com.buildreams.pokemons.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.buildreams.pokemons.presentation.viewmodel.PokemonViewModel

@Composable
fun PokemonScreen(pokemonViewModel: PokemonViewModel = hiltViewModel()) {
    val pokemon = pokemonViewModel.pokemon.collectAsState().value
    pokemonViewModel.fetchPokemon(1)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (pokemon != null) {
            Text("Name: ${pokemon.name}")
            Text("ID: ${pokemon.id}")
            Text("Base Experience: ${pokemon.baseExperience}")
        } else {
            Text("Loading...")
        }
    }
}
