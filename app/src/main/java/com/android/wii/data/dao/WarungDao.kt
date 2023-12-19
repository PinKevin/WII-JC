package com.android.wii.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.wii.data.model.Warung

@Dao
interface WarungDao {
    @Query("SELECT * FROM warung")
    fun getAllWarung(): List<Warung>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWarung(warung: Warung)
}