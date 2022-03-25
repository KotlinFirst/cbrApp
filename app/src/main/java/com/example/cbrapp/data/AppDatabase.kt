package com.example.cbrapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Currency::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    companion object {

        private var db: AppDatabase? = null
        private val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context: Context):AppDatabase{
            synchronized(LOCK){
                db?.let { return it}
                var instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                db = instance
                return instance
            }

        }
    }
    abstract fun currencyInfoDao():CurrencyInfoDao
}