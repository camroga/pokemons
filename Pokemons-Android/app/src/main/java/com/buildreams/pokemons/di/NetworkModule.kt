package com.buildreams.pokemons.di

import com.buildreams.pokemons.data.datasource.PokemonRemote
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
//            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://pokeapi.co/api/v2/")
            .build()
    }

    @Provides
    fun providePokemonApi(retrofit: Retrofit): PokemonRemote {
        return retrofit.create(PokemonRemote::class.java)
    }
}
