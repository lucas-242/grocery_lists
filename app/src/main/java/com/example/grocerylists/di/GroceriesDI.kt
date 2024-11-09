package com.example.grocerylists.di

import com.example.grocerylists.domain.repositories.GroceryRepository
import com.example.grocerylists.data.repositories.GroceryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ModulesDI {

    @Provides
    fun providePreferences(): GroceryRepository {
        return GroceryRepositoryImpl()
    }

}