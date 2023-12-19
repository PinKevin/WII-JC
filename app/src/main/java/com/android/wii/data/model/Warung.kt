package com.android.wii.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "warung")
data class Warung(
    @PrimaryKey(autoGenerate = true)
    val idWarung: Long = 0,
    val namaWarung: String,
    val logo: String,
    val gambar: String
)