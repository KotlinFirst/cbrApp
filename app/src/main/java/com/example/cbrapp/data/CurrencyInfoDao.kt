package com.example.cbrapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CurrencyInfoDao {
    @Query("SELECT * FROM full_info ORDER BY Id")
    fun getCurrencyList():LiveData<List<Currency>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrencyList(CurrencyList:List<Currency>)
}