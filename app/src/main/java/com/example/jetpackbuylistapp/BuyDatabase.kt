package com.example.jetpackbuylistapp

import androidx.room.Database
import androidx.room.RoomDatabase

// @Databaseはroomにデータベースclassであることを伝える
@Database(entities = [BuyItem::class], version = 1) // テーブル(BuyItem)とバージョン(今回は個人開発のリリース前なので1にしとく)をDatabaseに伝える
    abstract class BuyDatabase: RoomDatabase() {  // RoomDatabaseを継承し、abstractで抽象化クラスであることを定義する(データベースを定義する際に必ず必要な記述)
        abstract fun BuyDao(): BuyDao // BuyDaoインスタンスを返す抽象化関数
}