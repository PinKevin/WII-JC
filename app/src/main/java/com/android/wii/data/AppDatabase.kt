package com.android.wii.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.wii.data.dao.MejaDao
import com.android.wii.data.dao.MenuDao
import com.android.wii.data.dao.WarungDao
import com.android.wii.data.model.Meja
import com.android.wii.data.model.Menu
import com.android.wii.data.model.Warung

@Database(
    entities = [
        Warung::class,
        Meja::class,
        Menu::class
    ],
    version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun warungDao(): WarungDao
    abstract fun mejaDao(): MejaDao
    abstract fun menuDao(): MenuDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}