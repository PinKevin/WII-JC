package com.android.wii.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.wii.data.model.Meja

@Dao
interface MejaDao {
    @Query("SELECT * FROM meja")
    fun getAllMeja(): List<Meja>


    @Query("SELECT * FROM meja WHERE idWarung = :idWarung")
    fun getAllMejaByWarung(idWarung: Long): List<Meja>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeja(meja: Meja)
}