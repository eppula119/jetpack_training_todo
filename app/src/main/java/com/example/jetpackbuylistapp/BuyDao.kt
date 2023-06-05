package com.example.jetpackbuylistapp

import androidx.room.*

@Dao // データアクセスオブジェクトであることroomに伝える
interface BuyDao {
    @Insert // 引数で受け取ったroomデータエンティティをデータベースに保存するためのメソッドということを伝えれる
    fun insertBuyItem(buyItem: BuyItem) // これだけでroomがデータベースに保存する実装コードを作ってくれる

    @Query("SELECT * FROM BuyItem") // SQLの命令文であることを伝える(全ての買う商品を取得)
    fun loadAllBuyItem(): List<BuyItem> // (返り値は、BuyItem型で配列ですよ。)

    @Update // 対象のテーブルに保存されたデータを更新することを伝える
    fun updateBuyItem(buyItem: BuyItem) // buyItemテーブルのデータを更新

    @Delete // 削除であることを伝える
    fun deleteBuyItem(buyItem: BuyItem) // buyItemテーブルのデータを削除
}