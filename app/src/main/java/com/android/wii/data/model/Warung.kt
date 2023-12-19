package com.android.wii.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "warung")
data class Warung(
    @PrimaryKey
    val idWarung: Long,
    val namaWarung: String,
    val logo: String,
    val gambar: String
)