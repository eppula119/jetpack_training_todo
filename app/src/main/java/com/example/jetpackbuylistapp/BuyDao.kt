package com.example.jetpackbuylistapp

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao // データアクセスオブジェクトであることroomに伝える
interface BuyDao {
    @Insert // 引数で受け取ったroomデータエンティティをデータベースに保存するためのメソッドということを伝えれる
    suspend fun insertBuyItem(buyItem: BuyItem) // これだけでroomがデータベースに保存する実装コードを作ってくれる(suspendは、一回だけMainスレッド以外で実行する非同期処理をするという意味)

    @Query("SELECT * FROM BuyItem") // SQLの命令文であることを伝える(全ての買う商品を取得)
    fun loadAllBuyItem(): Flow<List<BuyItem>> // (返り値は、BuyItem型で配列ですよ。)Flowは、データの変更を監視し変更されば実行される非同期処理を意味する

    @Update // 対象のテーブルに保存されたデータを更新することを伝える
    suspend fun updateBuyItem(buyItem: BuyItem) // buyItemテーブルのデータを更新

    @Delete // 削除であることを伝える
    suspend fun deleteBuyItem(buyItem: BuyItem) // buyItemテーブルのデータを削除
}