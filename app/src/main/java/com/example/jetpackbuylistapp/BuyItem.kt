package com.example.jetpackbuylistapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BuyItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var name: String,
    var category: String
)
