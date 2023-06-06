package com.example.jetpackbuylistapp

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@dagger.Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, BuyDatabase::class.java, "buy_database").build()

    @Provides
    fun provideDao(db: BuyDatabase) = db.BuyDao()
}