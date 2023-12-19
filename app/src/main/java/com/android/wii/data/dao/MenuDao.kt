package com.android.wii.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.wii.data.model.Menu

@Dao
interface MenuDao {
    @Query("SELECT * FROM menu")
    fun getAllMenu(): List<Menu>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMenu(menu: Menu)
}