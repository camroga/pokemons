package com.buildreams.pokemons.di

import com.buildreams.pokemons.data.datasource.PokemonRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    fun providePokemonApi(retrofit: Retrofit): PokemonRemote {
        return retrofit.create(PokemonRemote::class.java)
    }
}
