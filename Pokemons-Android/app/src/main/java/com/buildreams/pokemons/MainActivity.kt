package com.buildreams.pokemons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.buildreams.pokemons.presentation.ui.PokemonScreen
import com.buildreams.pokemons.presentation.ui.theme.PokemonsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            PokemonsTheme {
                PokemonScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonPreview() {
    PokemonsTheme {
        PokemonScreen()
    }
}